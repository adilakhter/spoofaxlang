/*
 * Created on 03.des.2005
 *
 * Copyright (c) 2005, Karl Trygve Kalleberg <karltk near strategoxt.org>
 *
 * Licensed under the GNU Lesser General Public License, v2.1
 */
package org.spoofax.jsglr.client;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import org.spoofax.PushbackStringIterator;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.jsglr.shared.ArrayDeque;
import org.spoofax.jsglr.shared.BadTokenException;
import org.spoofax.jsglr.shared.SGLRException;
import org.spoofax.jsglr.shared.TokenExpectedException;
import org.spoofax.jsglr.shared.Tools;

public class SGLR {

    private static final int COMPLETION_REGION_SIZE = 1000;

	private RecoveryPerformance performanceMeasuring;

	private final Set<BadTokenException> collectedErrors = new LinkedHashSet<BadTokenException>();

	public static final int EOF = ParseTable.NUM_CHARS;

	static final int TAB_SIZE = 4;//8;

	protected static boolean WORK_AROUND_MULTIPLE_LOOKAHEAD;

	//Performance testing
	private static long parseTime=0;
	private static int parseCount=0;

	protected Frame startFrame;

	private long startTime;

	protected volatile boolean asyncAborted;

	protected Frame acceptingStack;

	protected final ArrayDeque<Frame> activeStacks;

	private ParseTable parseTable;

	private int currentToken;

	private int tokensSeen;

	protected int lineNumber;

	protected int columnNumber;

	private int startOffset;

	private final ArrayDeque<ActionState> forShifter;

	private ArrayDeque<Frame> forActor;

	private ArrayDeque<Frame> forActorDelayed;

	private int maxBranches;

	private int maxToken;

	private int maxLine;

	private int maxColumn;

	private int maxTokenNumber;

	private AmbiguityManager ambiguityManager;

	protected Disambiguator disambiguator;

	private int rejectCount;

	private int reductionCount;

	protected PushbackStringIterator currentInputStream;

	private PathListPool pathCache = PathListPool.getInstance();
	private ArrayDeque<Frame> activeStacksWorkQueue = new ArrayDeque<Frame>();
	private ArrayDeque<Frame> recoverStacks;

	private ParserHistory history;

	private RecoveryConnector recoverIntegrator;
	
	private ITreeBuilder treeBuilder;

	protected boolean useIntegratedRecovery;

	public void setUseStructureRecovery(boolean useRecovery) {
		this.useIntegratedRecovery = useRecovery;
		this.recoverIntegrator = new RecoveryConnector(this);
	}

	public void setUseStructureRecovery(boolean useRecovery, IntegratedRecoverySettings settings, FineGrainedSetting fgSettings) {
		this.useIntegratedRecovery = useRecovery;
		this.recoverIntegrator = new RecoveryConnector(this, settings, fgSettings);
	}

	private boolean isCompletionMode;
	
	public ParserHistory getHistory() {
		return history;
	}
	
	public int getParserLocation(){
		return this.getHistory().getTokenIndex(); //should also work in recover mode
	}

	private boolean isFineGrainedMode;
	
	private int fineGrainedStartLocation;
	
	private int fineGrainedRecoverMax;

	private int cursorLocation;

	public int getCursorLocation() {
		return cursorLocation;
	}
	
	public boolean isSetCursorLocation() {
		return 0 < cursorLocation && cursorLocation != Integer.MAX_VALUE;
	}
	
	private void setCompletionParse(boolean isCompletionMode, int cursorLocation){
		this.isCompletionMode = isCompletionMode;
		this.cursorLocation = cursorLocation;
	}

	protected ArrayDeque<Frame> getRecoverStacks() {
		return recoverStacks;
	}

	public Set<BadTokenException> getCollectedErrors() {
		return collectedErrors;
	}
    
    /**
     * Attempts to set a timeout for parsing.
     * Default implementation throws an
     * {@link UnsupportedOperationException}.
     * 
     * @see org.spoofax.jsglr.io.SGLR#setTimeout(int)
     */
    public void setTimeout(int timeout) {
        throw new UnsupportedOperationException("Use org.spoofax.jsglr.io.SGLR for setting a timeout");
    }
    
    protected void initParseTimer() {
        // Default does nothing (not supported by GWT)
    }

	@Deprecated
	public SGLR(ITermFactory pf, ParseTable parseTable) {
		this(new Asfix2TreeBuilder(pf), parseTable);
	}
	
	@Deprecated
	public SGLR(ParseTable parseTable) {
		this(new Asfix2TreeBuilder(), parseTable);
	}
	
	public SGLR(ITreeBuilder treeBuilder, ParseTable parseTable) {
		assert parseTable != null;
		// Init with a new factory for both serialized or BAF instances.
		this.parseTable = parseTable;
		activeStacks = new ArrayDeque<Frame>();
		forActor = new ArrayDeque<Frame>();
		forActorDelayed = new ArrayDeque<Frame>();
		forShifter = new ArrayDeque<ActionState>();
		disambiguator = new Disambiguator();
		useIntegratedRecovery = false;
		recoverIntegrator = null;
		history = new ParserHistory();
    	setCompletionParse(false, Integer.MAX_VALUE);
		setTreeBuilder(treeBuilder);
	}
	
    protected void setFinegrainedRecoverMode(boolean fineGrainedMode) {
        this.isFineGrainedMode = fineGrainedMode;
        recoverStacks = new ArrayDeque<Frame>();
    }
    
    protected void setFineGrainedStartLocation(int fineGrainedStartLocation) {
		this.fineGrainedStartLocation = fineGrainedStartLocation;
	}

    protected void setFineGrainedRecoverMax(int fineGrainedRecoverMax) {
		this.fineGrainedRecoverMax = fineGrainedRecoverMax;
	}

    public RecoveryPerformance getPerformanceMeasuring() {
        return performanceMeasuring;
    }

	/**
	 * @deprecated Use {@link #asyncCancel()} instead.
	 */
	@Deprecated
	public void asyncAbort() {
		asyncCancel();
	}

	/**
	 * Aborts an asynchronously running parse job, causing it to throw an exception.
	 *
	 * (Provides no guarantee that the parser is actually cancelled.)
	 */
	public void asyncCancel() {
		asyncAborted = true;
	}

	public void asyncCancelReset() {
		asyncAborted = false;
	}

	@Deprecated
	public static boolean isDebugging() {
		return Tools.debugging;
	}

	public static boolean isLogging() {
		return Tools.logging;
	}

	/**
	 * Initializes the active stacks. At the start of parsing there is only one
	 * active stack, and this stack contains the start symbol obtained from the
	 * parse table.
	 *
	 * @return top-level frame of the initial stack
	 */
	private Frame initActiveStacks() {
		activeStacks.clear();
		final Frame st0 = newStack(parseTable.getInitialState());
		addStack(st0);
		return st0;
	}
	
	@Deprecated
	public Object parse(String input) throws BadTokenException,
    TokenExpectedException, ParseException, SGLRException {
	    return parse(input, null, null);
	}

    @Deprecated
	public final Object parse(String input, String filename) throws BadTokenException,
    TokenExpectedException, ParseException, SGLRException {

        return parse(input, filename, null);
    }

	/**
	 * Parses a string and constructs a new tree using the tree builder.
	 * 
	 * @param input           The input string.
	 * @param filename        The source filename of the string, or null if not available.
	 * @param startSymbol     The start symbol to use, or null if any applicable.
	 * @param completionMode  True in case the parser result is used for content completion.
	 * @param cursorLocation  The location of the cursor used to find completion recoveries.
	 */
    public Object parse(String input, String filename, String startSymbol, boolean completionMode, int cursorLocation) 
    	throws BadTokenException, TokenExpectedException, ParseException, SGLRException {
    	setCompletionParse(completionMode, cursorLocation);
    	Object parseResult = parse(input, filename, startSymbol);
    	setCompletionParse(false, Integer.MAX_VALUE);
    	return parseResult;
    }

    /**
	 * Parses a string and constructs a new tree using the tree builder.
	 * 
	 * @param input        The input string.
	 * @param filename     The source filename of the string, or null if not available.
	 * @param startSymbol  The start symbol to use, or null if any applicable.
	 */
    public Object parse(String input, String filename, String startSymbol) throws BadTokenException, TokenExpectedException, ParseException,
	SGLRException {
		logBeforeParsing();
		initParseVariables(input, filename);
		startTime = System.currentTimeMillis();
		initParseTimer();
		getPerformanceMeasuring().startParse();
        Object result = sglrParse(startSymbol);
        return result;
	}

	private Object sglrParse(String startSymbol)
	throws BadTokenException, TokenExpectedException,
	ParseException, SGLRException {
		try {
			do {
				readNextToken();
				history.keepTokenAndState(this);
				doParseStep();
			} while (getCurrentToken() != SGLR.EOF && activeStacks.size() > 0);

			if (acceptingStack == null) {
				collectedErrors.add(createBadTokenException());
			}

			if(useIntegratedRecovery && acceptingStack==null){
				recoverIntegrator.recover();
				if(acceptingStack==null && activeStacks.size()>0) {
					return sglrParse(startSymbol);
				}
			}
			getPerformanceMeasuring().endParse(acceptingStack!=null);
		} catch (final TaskCancellationException e) {
			throw new ParseTimeoutException(this, getCurrentToken(), tokensSeen - 1, lineNumber,
					columnNumber, collectedErrors);
		} finally {
			activeStacks.clear();
			activeStacksWorkQueue.clear();
			forShifter.clear();
			history.clear();
			if (recoverStacks != null) recoverStacks.clear();
		}

		logAfterParsing();

		final Link s = acceptingStack.findDirectLink(startFrame);

		if (s == null) {
			throw new ParseException(this, "Accepting stack has no link");
		}
		//System.out.println(s.recoverCount);
		assert(s.recoverCount <= s.recoverWeight);

		performanceMeasuring.setRecoverCount(s.recoverCount);

		logParseResult(s);
		//System.out.println("recoveries: " + s.recoverCount);
		Tools.debug("recoveries: ", s.recoverCount);
		//Tools.debug(s.label.toParseTree(parseTable));

		if (getTreeBuilder() instanceof NullTreeBuilder) {
			return null;
		} else {
			return disambiguator.applyFilters(this, s.label, startSymbol, tokensSeen);
		}
	}

	void readNextToken() {
		logCurrentToken();
		setCurrentToken(getNextToken());
	}

	protected void doParseStep() {
		logBeforeParseCharacter();
		parseCharacter(); //applies reductions on active stack structure and fills forshifter
		shifter(); //renewes active stacks with states in forshifter
	}

	private void initParseVariables(String input, String filename) {
		forActor.clear();
		forActorDelayed.clear();
		forShifter.clear();
		history.clear();
		startFrame = initActiveStacks();
		tokensSeen = 0;
		currentInputStream = new PushbackStringIterator(input);
		acceptingStack = null;
		collectedErrors.clear();
		history=new ParserHistory();
		performanceMeasuring=new RecoveryPerformance();
		getTreeBuilder().initializeInput(input, filename);
		PooledPathList.resetPerformanceCounters();
		PathListPool.resetPerformanceCounters();
		ambiguityManager = new AmbiguityManager(input.length());
		if (getTreeBuilder().getTokenizer() != null) {
			// Make sure we use the same starting offsets as the tokenizer, if any
			// (crucial for parsing fragments at a time)
			lineNumber = getTreeBuilder().getTokenizer().getEndLine();
			columnNumber = getTreeBuilder().getTokenizer().getEndColumn();
			startOffset = getTreeBuilder().getTokenizer().getStartOffset();
		} else {
			lineNumber = 1;
			columnNumber = 0;
		}
	}

	private BadTokenException createBadTokenException() {

		final Frame singlePreviousStack = activeStacks.size() == 1 ? activeStacks.get(0) : null;

		if (singlePreviousStack != null) {
			Action action = singlePreviousStack.peek().getSingularAction();

			if (action != null && action.getActionItems().length == 1) {
				final StringBuilder expected = new StringBuilder();

				do {
					final int token = action.getSingularRange();
					if (token == -1) {
						break;
					}
					expected.append((char) token);

					final ActionItem[] items = action.getActionItems();

					if (!(items.length == 1 && items[0].type == ActionItem.SHIFT)) {
						break;
					}

					final Shift shift = (Shift) items[0];
					action = parseTable.getState(shift.nextState).getSingularAction();

				} while (action != null);

				if (expected.length() > 0) {
					return new TokenExpectedException(this, expected.toString(), getCurrentToken(),
							tokensSeen + startOffset - 1, lineNumber, columnNumber);
				}
			}
		}

		return new BadTokenException(this, getCurrentToken(), tokensSeen + startOffset - 1, lineNumber,
				columnNumber);
	}

	private void shifter() {
		logBeforeShifter();
		activeStacks.clear();
		final AbstractParseNode prod = parseTable.lookupProduction(getCurrentToken());

		while (forShifter.size() > 0) {
			final ActionState as = forShifter.remove();
			if (!parseTable.hasRejects() || !as.st.allLinksRejected()) {				
				Frame	st1=findStack(activeStacks, as.s);
				if(st1==null){				
					st1 = newStack(as.s);
					addStack(st1);
				}
				st1.addLink(as.st, prod, 1);
			} else {
				if (Tools.logging) {
					Tools.logger("Shifter: skipping rejected stack with state ",
							as.st.state.stateNumber);
				}
			}
		}
		logAfterShifter();
	}

	protected void addStack(Frame st1) {
		if(Tools.tracing) {
			TRACE("SG_AddStack() - " + st1.state.stateNumber);
		}
		activeStacks.addFirst(st1);
	}

	private void parseCharacter() {
		logBeforeParseCharacter();

		activeStacksWorkQueue.clear();
		activeStacksWorkQueue.addAll(activeStacks);

		forActorDelayed.clear();
		forShifter.clear();

		while (activeStacksWorkQueue.size() > 0 || forActor.size() > 0) {
			final Frame st = pickStackNodeFromActivesOrForActor(activeStacksWorkQueue);
			if (!st.allLinksRejected()) {
				actor(st);
			}

			if(activeStacksWorkQueue.size() == 0 && forActor.size() == 0) {
				fillForActorWithDelayedFrames(); //Fills foractor, clears foractor delayed
			}
		}
	}

	private void fillForActorWithDelayedFrames() {
		if(Tools.tracing) {
			TRACE("SG_ - both empty");
		}
		final ArrayDeque<Frame> empty = forActor;
		forActor = forActorDelayed;
		empty.clear();
		forActorDelayed = empty;
	}

	private Frame pickStackNodeFromActivesOrForActor(ArrayDeque<Frame> actives) {
		Frame st;
		if(actives.size() > 0) {
			if(Tools.tracing) {
				TRACE("SG_ - took active");
			}
			st = actives.remove();
		} else {
			if(Tools.tracing) {
				TRACE("SG_ - took foractor");
			}
			st = forActor.remove();
		}
		return st;
	}

	private void actor(Frame st) {

		final State s = st.peek();
		logBeforeActor(st, s);

		for (final Action action : s.getActions()) {
			if (action.accepts(getCurrentToken())) {
				for (final ActionItem ai : action.getActionItems()) {
					switch (ai.type) {
					case ActionItem.SHIFT: {
						final Shift sh = (Shift) ai;
						final ActionState actState = new ActionState(st, parseTable.getState(sh.nextState));
						actState.currentToken = getCurrentToken();
						addShiftPair(actState); //Adds StackNode to forshifter
						statsRecordParsers(); //sets some values un current parse state
						break;
					}
					case ActionItem.REDUCE: {
						final Reduce red = (Reduce) ai;
						doReductions(st, red.production);
						break;
					}
					case ActionItem.REDUCE_LOOKAHEAD: {
						final ReduceLookahead red = (ReduceLookahead) ai;
						if(checkLookahead(red)) {
							if(Tools.tracing) {
								TRACE("SG_ - ok");
							}
							doReductions(st, red.production);
						}
						break;
					}
					case ActionItem.ACCEPT: {
						if (!st.allLinksRejected()) {
							acceptingStack = st;
							if (Tools.logging) {
								Tools.logger("Reached the accept state");
							}
						}
						break;
					}
					default:
						throw new IllegalStateException("Unknown action type: " + ai.type);
					}
				}
			}
		}

		if(Tools.tracing) {
			TRACE("SG_ - actor done");
		}
	}

	private boolean checkLookahead(ReduceLookahead red) {
		return doCheckLookahead(red, red.getCharRanges(), 0);
	}

	private boolean doCheckLookahead(ReduceLookahead red, RangeList[] charClass, int pos) {
		if(Tools.tracing) {
			TRACE("SG_CheckLookAhead() - ");
		}

		final int c = currentInputStream.read();

		// EOF
		if(c == -1) {
			return true;
		}

		boolean permit = true;

		if(pos < charClass.length) {
			permit = charClass[pos].within(c) ? false : doCheckLookahead(red, charClass, pos + 1);
		}

		currentInputStream.unread(c);

		return permit;
	}

	private void addShiftPair(ActionState state) {
		if(Tools.tracing) {
			TRACE("SG_AddShiftPair() - " + state.s.stateNumber);
		}
		forShifter.add(state);
	}

	private void statsRecordParsers() {
		if (forShifter.size() > maxBranches) {
			maxBranches = forShifter.size();
			maxToken = getCurrentToken();
			maxColumn = columnNumber;
			maxLine = lineNumber;
			maxTokenNumber = tokensSeen;
		}
	}


	private void doReductions(Frame st, Production prod) {

		if(!recoverModeOk(st, prod)) {
			return;
		}

		PooledPathList paths = pathCache.create();
		try {
			st.findAllPaths(paths, prod.arity);
			logBeforeDoReductions(st, prod, paths.size());
			reduceAllPaths(prod, paths);
			logAfterDoReductions();
		} finally {
			pathCache.endCreate(paths);
		}
	}

	private boolean recoverModeOk(Frame st, Production prod) {
		if(!prod.isCompletionProduction()){
			return !prod.isRecoverProduction() || isFineGrainedMode;
		}
		return inCompletionMode(prod);
	}

	private boolean inCompletionMode(Production prod) {
		if(!prod.isCompletionStartProduction()) //Performance trick: -> "@#$" {completion} starts the completion
			return isCompletionMode && cursorLocation <= getParserLocation() && getParserLocation() <= cursorLocation + COMPLETION_REGION_SIZE;
		return isCompletionMode && cursorLocation - COMPLETION_REGION_SIZE <= getParserLocation() && getParserLocation() <= cursorLocation;
	}

	private void doLimitedReductions(Frame st, Production prod, Link l) { //Todo: Look add sharing code with doReductions
		if(!recoverModeOk(st, prod)) {
			return;
		}
		PooledPathList limitedPool = pathCache.create();
		try {
			st.findLimitedPaths(limitedPool, prod.arity, l); //find paths containing the link
			logBeforeLimitedReductions(st, prod, l, limitedPool);
			reduceAllPaths(prod, limitedPool);
		} finally {
			pathCache.endCreate(limitedPool);
		}
	}

	private void reduceAllPaths(Production prod, PooledPathList paths) {

		for(int i = 0; i < paths.size(); i++) {
			final Path path = paths.get(i);
			final AbstractParseNode[] kids = path.getParseNodes();
			final Frame st0 = path.getEnd();
			final State next = parseTable.go(st0.state, prod.label);
			logReductionPath(prod, path, st0, next);
			if(!prod.isCompletionProduction() || isReductionOverCursorLocation(path)){
				if(checkMaxRecoverCount(prod, path)){
					if(!prod.isRecoverProduction())
						reducer(st0, next, prod, kids, path);
					else
						reducerRecoverProduction(st0, next, prod, kids, path);
				}
			}
		}

		if (asyncAborted) {
			// Rethrown as ParseTimeoutException in SGLR.sglrParse()
			throw new TaskCancellationException("Long-running parse job aborted");
		}
	}

	private boolean checkMaxRecoverCount(Production prod, final Path path) {
		return checkRecoverCountLocal(prod, path) && checkRecoverCountGlobal(prod, path);
	}

	private boolean checkRecoverCountLocal(Production prod, final Path path) {
		return !isFineGrainedMode || 
			calcRecoverCount(prod, path) <= fineGrainedRecoverMax || 
			getHistory().getTokenIndex() - path.getLength() < fineGrainedStartLocation; //large reduction
	}

	private boolean checkRecoverCountGlobal(Production prod, final Path path) {
		return calcRecoverCount(prod, path) <= this.recoverIntegrator.getMaxNumberOfRecoverApplicationsGlobal();
	}

	private boolean isReductionOverCursorLocation(final Path path) {
		return getParserLocation() - path.getLength() < cursorLocation;
	}
	
	private void reducer(Frame st0, State s, Production prod, AbstractParseNode[] kids, Path path) {
		assert(!prod.isRecoverProduction());
		logBeforeReducer(s, prod, path.getLength());
		increaseReductionCount();

		final int length = path.getLength();
		final int numberOfRecoveries = calcRecoverCount(prod, path);
		final int recoverWeight = calcRecoverWeight(prod, path);
		final AbstractParseNode t = prod.apply(kids);
		final Frame st1 = findStack(activeStacks, s);

		if (st1 == null) {
			// Found no existing stack with for state s; make new stack
			addNewStack(st0, s, prod, length, numberOfRecoveries, recoverWeight, t);
		} else {
			/* A stack with state s exists; check for ambiguities */
			Link nl = st1.findDirectLink(st0);

			if (nl != null) {
				logAmbiguity(st0, prod, st1, nl);
				if (prod.isRejectProduction()) {
					nl.reject();
				} 
				if(recoverWeight == 0 && nl.recoverWeight == 0 || nl.isRejected()) {
					createAmbNode(t, nl);
				} else if (recoverWeight < nl.recoverWeight) {
					nl.label = t;
					nl.recoverCount = numberOfRecoveries;
					nl.recoverWeight = recoverWeight;
					actorOnActiveStacksOverNewLink(nl);
				} else if (recoverWeight == nl.recoverWeight) {
					nl.label = t;
				}
			} else {
				nl = st1.addLink(st0, t, length);
				nl.recoverWeight = recoverWeight;
				nl.recoverCount = numberOfRecoveries;
				if (prod.isRejectProduction()) {
					nl.reject();
					increaseRejectCount();
				}
				logAddedLink(st0, st1, nl);
				actorOnActiveStacksOverNewLink(nl);
			}
		}
		if(Tools.tracing) {
			TRACE_ActiveStacks();
			TRACE("SG_ - reducer done");
		}
	}
	
	private void reducerRecoverProduction(Frame st0, State s, Production prod, AbstractParseNode[] kids, Path path) {
		assert(prod.isRecoverProduction());
		final int length = path.getLength();
		final int numberOfRecoveries = calcRecoverCount(prod, path);
		final int recoverWeight = calcRecoverWeight(prod, path);
		final AbstractParseNode t = prod.apply(kids);
		final Frame stActive = findStack(activeStacks, s);
		if(stActive != null){
			Link lnActive=stActive.findDirectLink(st0);
			if(lnActive!=null){
				return; //TODO: ambiguity
			}
		}
		final Frame stRecover = findStack(recoverStacks, s);
		if(stRecover != null){
			Link nlRecover = stRecover.findDirectLink(st0);
			if(nlRecover != null){
				return; //TODO: ambiguity
			}
			nlRecover = stRecover.addLink(st0, t, length);
			nlRecover.recoverCount = numberOfRecoveries;
			nlRecover.recoverWeight = recoverWeight;
			return;
		}
		addNewRecoverStack(st0, s, prod, length, numberOfRecoveries, recoverWeight, t);
	}

	private void createAmbNode(AbstractParseNode t, Link nl) {
		nl.addAmbiguity(t, tokensSeen);
		ambiguityManager.increaseAmbiguityCalls();
	}
	
	/**
	 * Found no existing stack with for state s; make new stack
	 */
	private void addNewStack(Frame st0, State s, Production prod, int length,
			int numberOfRecoveries, int recoverWeight, AbstractParseNode t) {

		final Frame st1 = newStack(s);
		final Link nl = st1.addLink(st0, t, length);

		nl.recoverCount = numberOfRecoveries;
		nl.recoverWeight = recoverWeight;
		addStack(st1);
		forActorDelayed.addFirst(st1);

		if(Tools.tracing) {
			TRACE("SG_AddStack() - " + st1.state.stateNumber);
		}

		if (prod.isRejectProduction()) {
			if (Tools.logging) {
				Tools.logger("Reject [new]");
			}
			nl.reject();
			increaseRejectCount();
		}
	}

	/**
	 *  Found no existing stack with for state s; make new stack
	 */
	private void addNewRecoverStack(Frame st0, State s, Production prod, int length,
			int numberOfRecoveries, int recoverWeight, AbstractParseNode t) {
		if (!(isFineGrainedMode && !prod.isRejectProduction())) {
			return;
		}
		final Frame st1 = newStack(s);
		final Link nl = st1.addLink(st0, t, length);
		nl.recoverCount = numberOfRecoveries;
		nl.recoverWeight = recoverWeight;
		recoverStacks.addFirst(st1);
	}

	private void actorOnActiveStacksOverNewLink(Link nl) {
		// Note: ActiveStacks can be modified inside doLimitedReductions
		// new elements may be inserted at the beginning
		final int sz = activeStacks.size();
		for (int i = 0; i < sz; i++) {
			//                for(Frame st2 : activeStacks) {
			if(Tools.tracing) {
				TRACE("SG_ activeStack - ");
			}
			final int pos = activeStacks.size() - sz + i;
			final Frame st2 = activeStacks.get(pos);
			if (st2.allLinksRejected() || inReduceStacks(forActor, st2) || inReduceStacks(forActorDelayed, st2))
			{
				continue; //stacknode will find reduction in regular process
			}

			for (final Action action : st2.peek().getActions()) {
				if (action.accepts(getCurrentToken())) {
					for (final ActionItem ai : action.getActionItems()) {
						switch(ai.type) {
						case ActionItem.REDUCE:
							final Reduce red = (Reduce) ai;
							doLimitedReductions(st2, red.production, nl);
							break;
						case ActionItem.REDUCE_LOOKAHEAD:
							final ReduceLookahead red2 = (ReduceLookahead) ai;
							if(checkLookahead(red2)) {
								doLimitedReductions(st2, red2.production, nl);
							}
							break;
						}
					}
				}
			}
		}
	}

	private int calcRecoverCount(Production prod, Path path) {
		int result = path.getRecoverCount();
		if (prod.isRecoverProduction() || prod.isCompletionProduction()){
			result += 1;
		}
		return result;
	}

	private int calcRecoverWeight(Production prod, Path path) {
		int result = path.getRecoverWeight();
		if (prod.isRecoverProduction() || prod.isCompletionProduction()){
			result += 1;
			if (path.getLength() > 0 && !prod.isCompletionProduction())
				result += 1; //Hack: insertion rules (length 0) should be preferred above water rules.
		}
		return result;
	}

	private boolean inReduceStacks(Queue<Frame> q, Frame frame) {
		if(Tools.tracing) {
			TRACE("SG_InReduceStacks() - " + frame.state.stateNumber);
		}
		return q.contains(frame);
	}

	protected Frame newStack(State s) {
		if(Tools.tracing) {
			TRACE("SG_NewStack() - " + s.stateNumber);
		}
		return new Frame(s);
	}

	private void increaseReductionCount() {
		reductionCount++;
	}

	protected void increaseRejectCount() {
		rejectCount++;
	}

	protected int getRejectCount() {
		return rejectCount;
	}

	Frame findStack(ArrayDeque<Frame> stacks, State s) {
		int desiredState = s.stateNumber;
		if(Tools.tracing) {
			TRACE("SG_FindStack() - " + desiredState);
		}

		// We need only check the top frames of the active stacks.
		if (Tools.debugging) {
			Tools.debug("findStack() - ", dumpActiveStacks());
			Tools.debug(" looking for ", desiredState);
		}

		final int size = stacks.size();
		for (int i = 0; i < size; i++) {
			Frame stack = stacks.get(i);
			if (stack.state.stateNumber == desiredState) {
				if(Tools.tracing) {
					TRACE("SG_ - found stack");
				}
				return stack;
			}
		}
		if(Tools.tracing) {
			TRACE("SG_ - stack not found");
		}
		return null;
	}


	private int getNextToken() {
		if(Tools.tracing) {
			TRACE("SG_NextToken() - ");
		}

		final int ch = currentInputStream.read();
		updateLineAndColumnInfo(ch);
		if(ch == -1) {
			return SGLR.EOF;
		}
		return ch;
	}

	protected void updateLineAndColumnInfo(int ch) {
		tokensSeen++;

		if (Tools.debugging) {
			Tools.debug("getNextToken() - ", ch, "(", (char) ch, ")");
		}

		switch (ch) {
		case '\n':
			lineNumber++;
			columnNumber = 0;
			break;
		case '\t':
			columnNumber = (columnNumber / TAB_SIZE + 1) * TAB_SIZE;
			break;
		case -1:
			break;
		default:
			columnNumber++;
		}
	}
	
	public ParseTable getParseTable() {
		return parseTable;
	}

	public void setTreeBuilder(ITreeBuilder treeBuilder) {
		this.treeBuilder = treeBuilder;
		parseTable.initializeTreeBuilder(treeBuilder);
	}

	public ITreeBuilder getTreeBuilder() {
		return treeBuilder;
	}

	AmbiguityManager getAmbiguityManager() {
		return ambiguityManager;
	}

	public Disambiguator getDisambiguator() {
		return disambiguator;
	}

	public void setDisambiguator(Disambiguator disambiguator) {
		this.disambiguator = disambiguator;
	}

	@Deprecated
	public ITermFactory getFactory() {
		return parseTable.getFactory();
	}

	protected int getReductionCount() {
		return reductionCount;
	}

	protected int getRejectionCount() {
		return rejectCount;
	}





	////////////////////////////////////////////////////// Log functions ///////////////////////////////////////////////////////////////////////////////
	
	// TODO: cleanup, this doesn't belong here!

	private static int traceCallCount = 0;

	static void TRACE(String string) {
		System.err.println("[" + traceCallCount + "] " + string);
		traceCallCount++;
	}

	private String dumpActiveStacks() {
		final StringBuffer sb = new StringBuffer();
		boolean first = true;
		if (activeStacks == null) {
			sb.append(" GSS unitialized");
		} else {
			sb.append("{").append(activeStacks.size()).append("} ");
			for (final Frame f : activeStacks) {
				if (!first) {
					sb.append(", ");
				}
				sb.append(f.dumpStack());
				first = false;
			}
		}
		return sb.toString();
	}


	private void logParseResult(Link s) {
		if (Tools.debugging) {
			Tools.debug("internal parse tree:\n", s.label);
		}

		if(Tools.tracing) {
			TRACE("SG_ - internal tree: " + s.label);
		}

		if (Tools.measuring) {
			final Measures m = new Measures();
			//Tools.debug("Time (ms): " + (System.currentTimeMillis()-startTime));
			m.setTime(System.currentTimeMillis() - startTime);
			//Tools.debug("Red.: " + reductionCount);
			m.setReductionCount(reductionCount);
			//Tools.debug("Nodes: " + Frame.framesCreated);
			m.setFramesCreated(Frame.framesCreated);
			//Tools.debug("Links: " + Link.linksCreated);
			m.setLinkedCreated(Link.linksCreated);
			//Tools.debug("avoids: " + s.avoidCount);
			m.setAvoidCount(s.recoverCount);
			//Tools.debug("Total Time: " + parseTime);
			m.setParseTime(parseTime);
			//Tools.debug("Total Count: " + parseCount);
			Measures.setParseCount(++parseCount);
			//Tools.debug("Average Time: " + (int)parseTime / parseCount);
			m.setAverageParseTime((int)parseTime / parseCount);
			m.setRecoverTime(-1);
			Tools.setMeasures(m);
		}
	}


	private void logBeforeParsing() {
		if(Tools.tracing) {
			TRACE("SG_Parse() - ");
		}

		if (Tools.debugging) {
			Tools.debug("parse() - ", dumpActiveStacks());
		}
	}

	private void logAfterParsing()
	throws BadTokenException, TokenExpectedException {
		if (isLogging()) {
			Tools.logger("Number of lines: ", lineNumber);
			Tools.logger("Maximum ", maxBranches, " parse branches reached at token ",
					logCharify(maxToken), ", line ", maxLine, ", column ", maxColumn,
					" (token #", maxTokenNumber, ")");

			final long elapsed = System.currentTimeMillis() - startTime;
			Tools.logger("Parse time: " + elapsed / 1000.0f + "s");
		}

		if (Tools.debugging) {
			Tools.debug("Parsing complete: all tokens read");
		}

		if (acceptingStack == null) {
			final BadTokenException bad = createBadTokenException();
			if (collectedErrors.isEmpty()) {
				throw bad;
			} else {
				collectedErrors.add(bad);
				throw new MultiBadTokenException(this, collectedErrors);
			}
		}


		if (Tools.debugging) {
			Tools.debug("Accepting stack exists");
		}
	}

	private void logCurrentToken() {
		if (isLogging()) {
			Tools.logger("Current token (#", tokensSeen, "): ", logCharify(getCurrentToken()));
		}
	}

	private void logAfterShifter() {
		if(Tools.tracing) {
			TRACE("SG_DiscardShiftPairs() - ");
			TRACE_ActiveStacks();
		}
	}

	private void logBeforeShifter() {
		if(Tools.tracing) {
			TRACE("SG_Shifter() - ");
			TRACE_ActiveStacks();
		}

		if (Tools.logging) {
			Tools.logger("#", tokensSeen, ": shifting ", forShifter.size(), " parser(s) -- token ",
					logCharify(getCurrentToken()), ", line ", lineNumber, ", column ", columnNumber);
		}

		if (Tools.debugging) {
			Tools.debug("shifter() - " + dumpActiveStacks());

			Tools.debug(" token   : " + getCurrentToken());
			Tools.debug(" parsers : " + forShifter.size());
		}
	}

	private void logBeforeParseCharacter() {
		if(Tools.tracing) {
			TRACE("SG_ParseToken() - ");
		}

		if (Tools.debugging) {
			Tools.debug("parseCharacter() - " + dumpActiveStacks());
			Tools.debug(" # active stacks : " + activeStacks.size());
		}

		/* forActor = *///computeStackOfStacks(activeStacks);

		if (Tools.debugging) {
			Tools.debug(" # for actor     : " + forActor.size());
		}
	}

	private String logCharify(int currentToken) {
		switch (currentToken) {
		case 32:
			return "\\32";
		case SGLR.EOF:
			return "EOF";
		case '\n':
			return "\\n";
		case 0:
			return "\\0";
		default:
			return "" + (char) currentToken;
		}
	}

	@SuppressWarnings("deprecation")
	private void logBeforeActor(Frame st, State s) {
		List<ActionItem> actionItems = null;

		if (Tools.debugging || Tools.tracing) {
			actionItems = s.getActionItems(getCurrentToken());
		}

		if(Tools.tracing) {
			TRACE("SG_Actor() - " + st.state.stateNumber);
			TRACE_ActiveStacks();
		}

		if (Tools.debugging) {
			Tools.debug("actor() - ", dumpActiveStacks());
		}

		if (Tools.debugging) {
			Tools.debug(" state   : ", s.stateNumber);
			Tools.debug(" token   : ", getCurrentToken());
		}

		if (Tools.debugging) {
			Tools.debug(" actions : ", actionItems);
		}

		if(Tools.tracing) {
			TRACE("SG_ - actions: " + actionItems.size());
		}
	}

	private void logAfterDoReductions() {
		if (Tools.debugging) {
			Tools.debug("<doReductions() - " + dumpActiveStacks());
		}

		if(Tools.tracing) {
			TRACE("SG_ - doreductions done");
		}
	}

	private void logReductionPath(Production prod, Path path, Frame st0, State next) {
		if (Tools.debugging) {
			Tools.debug(" path: ", path);
			Tools.debug(st0.state);
		}

		if (Tools.logging) {
			Tools.logger("Goto(", st0.peek().stateNumber, ",", prod.label + ") == ",
					next.stateNumber);
		}
	}


	private void logBeforeDoReductions(Frame st, Production prod,
			final int pathsCount) {
		if(Tools.tracing) {
			TRACE("SG_DoReductions() - " + st.state.stateNumber);
		}

		if (Tools.debugging) {
			Tools.debug("doReductions() - " + dumpActiveStacks());
			logReductionInfo(st, prod);
			Tools.debug(" paths : " + pathsCount);
		}
	}

	private void logBeforeLimitedReductions(Frame st, Production prod, Link l,
			PooledPathList paths) {
		if(Tools.tracing) {
			TRACE("SG_ - back in reducer ");
			TRACE_ActiveStacks();
			TRACE("SG_DoLimitedReductions() - " + st.state.stateNumber + ", " + l.parent.state.stateNumber);
		}

		if (Tools.debugging) {
			Tools.debug("doLimitedReductions() - ", dumpActiveStacks());
			logReductionInfo(st, prod);
			Tools.debug(Arrays.asList(paths));
		}
	}

	private void logReductionInfo(Frame st, Production prod) {
		Tools.debug(" state : ", st.peek().stateNumber);
		Tools.debug(" token : ", getCurrentToken());
		Tools.debug(" label : ", prod.label);
		Tools.debug(" arity : ", prod.arity);
		Tools.debug(" stack : ", st.dumpStack());
	}

	private void logAddedLink(Frame st0, Frame st1, Link nl) {
		if (Tools.debugging) {
			Tools.debug(" added link ", nl, " from ", st1.state.stateNumber, " to ",
					st0.state.stateNumber);
		}

		if(Tools.tracing) {
			TRACE_ActiveStacks();
		}
	}

	private void logBeforeReducer(State s, Production prod, int length) {
		if(Tools.tracing) {
			TRACE("SG_Reducer() - " + s.stateNumber + ", " + length + ", " + prod.label);
			TRACE_ActiveStacks();
		}

		if (Tools.logging) {
			Tools.logger("Reducing; state ", s.stateNumber, ", token: ", logCharify(getCurrentToken()),
					", production: ", prod.label);
		}

		if (Tools.debugging) {
			Tools.debug("reducer() - ", dumpActiveStacks());

			Tools.debug(" state      : ", s.stateNumber);
			Tools.debug(" token      : ", logCharify(getCurrentToken()) + " (" + getCurrentToken() + ")");
			Tools.debug(" production : ", prod.label);
		}
	}

	private void TRACE_ActiveStacks() {
		TRACE("SG_ - active stacks: " + activeStacks.size());
		TRACE("SG_ - for_actor stacks: " + forActor.size());
		TRACE("SG_ - for_actor_delayed stacks: " + forActorDelayed.size());
	}


	private void logAmbiguity(Frame st0, Production prod, Frame st1, Link nl) {
		if (Tools.logging) {
			Tools.logger("Ambiguity: direct link ", st0.state.stateNumber, " -> ",
					st1.state.stateNumber, " ", (prod.isRejectProduction() ? "{reject}" : ""));
			if (nl.label.isParseNode()) {
				Tools.logger("nl is ", nl.isRejected() ? "{reject}" : "", " for ",
						((ParseNode) nl.label).getLabel());
			}
		}

		if (Tools.debugging) {
			Tools.debug("createAmbiguityCluster - ", tokensSeen - nl.getLength() - 1, "/",
					nl.getLength());
		}
	}

	protected void setCurrentToken(int currentToken) {
		this.currentToken = currentToken;
		if(currentToken == -1)
			this.currentToken=SGLR.EOF;
	}

	protected int getCurrentToken() {
		assert(currentToken >= 0);
		return currentToken;
	}

}
