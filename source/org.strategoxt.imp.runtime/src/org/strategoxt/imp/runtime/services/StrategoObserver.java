package org.strategoxt.imp.runtime.services;

import static org.spoofax.interpreter.core.Tools.isTermTuple;
import static org.spoofax.interpreter.core.Tools.termAt;
import static org.spoofax.interpreter.terms.IStrategoTerm.LIST;
import static org.spoofax.interpreter.terms.IStrategoTerm.TUPLE;
import static org.spoofax.jsglr.client.imploder.ImploderAttachment.hasImploderOrigin;
import static org.spoofax.terms.Term.isTermString;
import static org.spoofax.terms.attachments.OriginAttachment.tryGetOrigin;
import static org.spoofax.terms.attachments.ParentAttachment.getParent;
import static org.strategoxt.imp.runtime.dynamicloading.TermReader.collectTerms;
import static org.strategoxt.imp.runtime.dynamicloading.TermReader.cons;
import static org.strategoxt.imp.runtime.dynamicloading.TermReader.termContents;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.jar.JarFile;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.imp.parser.IModelListener;
import org.eclipse.imp.parser.IParseController;
import org.spoofax.IAsyncCancellable;
import org.spoofax.interpreter.core.InterpreterErrorExit;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.core.InterpreterExit;
import org.spoofax.interpreter.core.StackTracer;
import org.spoofax.interpreter.core.UndefinedStrategyException;
import org.spoofax.interpreter.library.LoggingIOAgent;
import org.spoofax.interpreter.terms.ISimpleTerm;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTuple;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.attachments.OriginTermFactory;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.IncompatibleJarException;
import org.strategoxt.imp.debug.core.str.launching.DebuggableHybridInterpreter;
import org.strategoxt.imp.generator.postprocess_feedback_results_0_0;
import org.strategoxt.imp.generator.sdf2imp;
import org.strategoxt.imp.runtime.Debug;
import org.strategoxt.imp.runtime.Environment;
import org.strategoxt.imp.runtime.RuntimeActivator;
import org.strategoxt.imp.runtime.SWTSafeLock;
import org.strategoxt.imp.runtime.WeakWeakMap;
import org.strategoxt.imp.runtime.dynamicloading.BadDescriptorException;
import org.strategoxt.imp.runtime.dynamicloading.Descriptor;
import org.strategoxt.imp.runtime.dynamicloading.IDynamicLanguageService;
import org.strategoxt.imp.runtime.parser.SGLRParseController;
import org.strategoxt.imp.runtime.parser.ast.AstMessageHandler;
import org.strategoxt.imp.runtime.services.StrategoAnalysisQueue.UpdateJob;
import org.strategoxt.imp.runtime.stratego.EditorIOAgent;
import org.strategoxt.imp.runtime.stratego.IMPJSGLRLibrary;
import org.strategoxt.imp.runtime.stratego.SourceAttachment;
import org.strategoxt.imp.runtime.stratego.StrategoConsole;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoException;
import org.strategoxt.stratego_lib.set_config_0_0;

/**
 * Basic Stratego feedback (i.e., errors and warnings) provider.
 * This service may also be used as a basis for other semantic services
 * such as reference resolving.
 * 
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class StrategoObserver implements IDynamicLanguageService, IModelListener, IAsyncCancellable {
	
	// TODO: separate delay for error markers?
	public static final int OBSERVER_DELAY = 600;
	
	private static Map<Descriptor, HybridInterpreter> runtimePrototypes =
		Collections.synchronizedMap(new WeakWeakMap<Descriptor, HybridInterpreter>());
	
	private final Map<IResource, IStrategoTerm> resultingAsts =
		new WeakHashMap<IResource, IStrategoTerm>();
	
	private final String feedbackFunction;
	
	private final AstMessageHandler messages = new AstMessageHandler(AstMessageHandler.ANALYSIS_MARKER_TYPE);
	
	private final Lock observerSchedulerLock = new SWTSafeLock(true);
	
	private final FileCopier fileCopier = new FileCopier();
	
	private boolean isPrototypeAllowed = true;
	
	private volatile HybridInterpreter runtime;
	
	private InputTermBuilder inputBuilder;
	
	private volatile Descriptor descriptor;
	
	private volatile boolean isUpdateStarted;
	
	private volatile boolean rushNextUpdate;
	
	private UpdateJob updateJob;
	
	private boolean wasExceptionLogged;
		
	/**
	 * Value is true when the user enabled debugging for this language.
	 * 
	 * When debugging is enabled it will start a JVM for every StrategoObserver.invoke(...).
	 * The user is limited to one (TODO: make limit configarable) debug session at a time, to prevent exessive memory and cpu usage.
	 */
	private volatile boolean isDebuggerEnabled = false;
	
	public StrategoObserver(Descriptor descriptor, String feedbackFunction) {
		this.descriptor = descriptor;
		this.feedbackFunction = feedbackFunction;
	}

	public final AnalysisRequired getAnalysisRequired() {
		return AnalysisRequired.TYPE_ANALYSIS;
	}
	
	public void setPrototypeAllowed(boolean isPrototypeAllowed) {
		this.isPrototypeAllowed = isPrototypeAllowed;
	}
	
	/**
	 * Returns a value indicating whether or not an analysis has
	 * been scheduled or completed at this point.
	 * 
	 * @return true if update() or scheduleUpdate() have been called.
	 */
	public boolean isUpdateScheduled() {
		return isUpdateStarted;
	}
	
	public void setRushNextUpdate(boolean rushNextUpdate) {
		this.rushNextUpdate = rushNextUpdate;
	}
	
	public ReentrantLock getLock() {
		 // TODO: *maybe* use descriptor as syncroot? deadlocky?
		return Environment.getStrategoLock();
	}

	public String getLog() {
		assert getLock().isHeldByCurrentThread();
		return ((EditorIOAgent) runtime.getIOAgent()).getLog().trim();
	}

	public AstMessageHandler getMessages() {
		assert getLock().isHeldByCurrentThread();
		return messages;
	}
	
	public InputTermBuilder getInputBuilder() {
		assert getLock().isHeldByCurrentThread();
		if (inputBuilder == null || inputBuilder.getRuntime() != getRuntime()) {
			inputBuilder = new InputTermBuilder(getRuntime(), resultingAsts);
		}
		return inputBuilder;
	}
	
	/**
	 * Returns true if the debugger is enabled for the next invoke.
	 * @return Returns true if the debugger is enabled for the next invoke.
	 */
	public boolean isDebuggerEnabled() {
		return isDebuggerEnabled;
	}
	
	public void setDebuggerEnabled(boolean isDebuggerEnabled) {
		this.isDebuggerEnabled = isDebuggerEnabled;
	}
	
	
	/**
	 * Returns true if the Language Descriptor uses a ctree as provider.
	 * @return
	 */
	private boolean usesCTrees()
	{
		//List<File> providers = new ArrayList<File>();
		for (IStrategoAppl s : collectTerms(this.descriptor.getDocument(), "SemanticProvider")) {
			IPath p = new Path(termContents(s));
			if ("ctree".equals(p.getFileExtension()))
			{
				//providers.add();
				return true;
			}
		}
		return false;
		
	}
	
	
	public boolean needsProjectRebuild() throws CoreException
	{
		// check if the spoofax project is already built with debug info
		// if not try to rebuild
		// only rebuild when we are not using ctree's.
		// the debugger will be enabled
		// check if the project was already build with debug information
		// if it isn't, then rebuild the project
		if (!(this.runtime instanceof DebuggableHybridInterpreter)) {
			// runtime is not a DebuggableHybridInterpreter the language was not loaded with debug information.
			// rebuild the project
			return true;
			//rebuild(monitor);
		} else
		{
			// .debugmode was found and debug mode is enabled.
			// Now check if the project was also build with debug information
			DebuggableHybridInterpreter dhi = (DebuggableHybridInterpreter) this.runtime;
			List<IPath> loadedJars = dhi.getLoadJarsAsIPathList();
			boolean needsRebuilding = !this.operatesOnDebugBuild(loadedJars);
			boolean usesCTree = this.usesCTrees();
			
			if (usesCTree)
			{
				// please use jars, debug instrumentation is not included for ctrees in the build.main.xml
				String message = "Please change the providers in the Builders.esv from ctree-files to jar-files, debug instrumentation currently only supports jar-files.";
				Status status = new Status(Status.ERROR, RuntimeActivator.PLUGIN_ID, message);
				throw new CoreException(status);
			} else if (needsRebuilding) {
				// schedule a rebuild
				//rebuild(monitor);
				return true;
			}
			
		}
		return false;

	}
	
	/**
	 * Returns the Spoofax language descript project this observer is associated with.
	 */
	public IProject getProject()
	{
		IPath path = this.descriptor.getBasePath();
		//System.out.println(path);
		//System.out.println(path.lastSegment());
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(path.lastSegment());
		return project;
	}
	
	/**
	 * Returns true if the current classpath used by the HybridInterpreter is suitable for a debug launch.
	 * 
	 *  We check if HybridInterpreterDebugRuntime is located in one of the jars on the classpath, if it is found we can do a debug launch.
	 * @param classpaths
	 * @return
	 */
	private boolean operatesOnDebugBuild(List<IPath> classpaths)
	{
		// try to find the HybridInterpreterDebugRuntime class in the jars on the classpath
		// http://stackoverflow.com/questions/176527/how-can-i-enumerate-all-classes-in-a-package-and-add-them-to-a-list
		boolean foundHIDR = false; // try if org.strategoxt.imp.debug.stratego.runtime.strategies.HybridInterpreterDebugRuntime is found in a jar
		for(IPath path : classpaths)
		{
			// if path ends with .jar, then try to find the class
			if (path.getFileExtension().equals("jar"))
			{
				try {
					JarFile jarFile = new JarFile(path.toFile());
					
					java.util.zip.ZipEntry hidrClassEntry = jarFile.getEntry("org/strategoxt/imp/debug/stratego/runtime/strategies/HybridInterpreterDebugRuntime.class");
					if (hidrClassEntry != null)
					{
						foundHIDR = true;
						break;
					}
				} catch (IOException e) {
					Environment.logException("Failed to determine debugger status", e);
				}
			}
		}
		return foundHIDR;
	}
	
	private void initialize(IProgressMonitor monitor) {
		assert getLock().isHeldByCurrentThread();
		
		HybridInterpreter prototype = runtimePrototypes.get(descriptor);
		if (isPrototypeAllowed && prototype != null) {
			runtime = Environment.createInterpreterFromPrototype(prototype);
			return;
		}
		
		monitor.subTask("Loading analysis runtime");
		
		Debug.startTimer();
		List<String> jars = new ArrayList<String>();
		
		for (File file : descriptor.getAttachedFiles()) {
			String filename = file.toString();
			if (filename.endsWith(".ctree")) {
				createEmptyRuntime(monitor);
				loadCTree(filename);
			} else if (filename.endsWith(".jar")) {
				createEmptyRuntime(monitor);
				jars.add(filename);
			} else if (filename.endsWith(".str")) {
				Environment.asynOpenErrorDialog("Loading analysis components", "Cannot use .str files as a provider: please specify a .ctree or .jar file instead (usually built in /include/)", null);
			}
		}
		// if debug mode is enabled, add the debug-runtime
		// debug symbols for strategoj
		//  provider : include/stratego-debug-runtime-java.jar
		//  provider : include/stratego-debug-runtime.jar
		boolean allowsDebugging = Environment.allowsDebugging(this.descriptor);
		
		if (allowsDebugging)
		{
			IPath utilsPath = this.descriptor.getBasePath().append("utils");
			boolean javajarExists = utilsPath.append("stratego-debug-runtime-java.jar").toFile().exists();
			boolean jarExists = utilsPath.append("stratego-debug-runtime.jar").toFile().exists();
			if (!javajarExists || !jarExists)
			{
				// one of the required jars does not exist!
				// make sure the project builds jars instead of ctree's!
				System.err.println("Debug runtime jars not found! Please rebuild with jars instead of ctree's");
			} else {
				jars.add("utils/stratego-debug-runtime-java.jar");
				jars.add("utils/stratego-debug-runtime.jar");
			}
		}
		
		if (!jars.isEmpty()) loadJars(jars);
		Debug.stopTimer("Loaded analysis components");
		
		descriptor.addActiveService(this);
		
		monitor.subTask(null);
		if (isPrototypeAllowed && runtime != null)
			runtimePrototypes.put(descriptor, runtime);
	}
	
	/**
	 * Uninitializes the observer.
	 */
	public void uninitialize() {
		// Removing it from the shared cache is sort of pointless and could be dangerous
		// HybridInterpreter cachedRuntime = cachedRuntimes.remove(descriptor);
		if (runtime != null) {
			runtime.uninit();
			runtime = null;
		}
	}

	private void createEmptyRuntime(IProgressMonitor monitor) {
		assert getLock().isHeldByCurrentThread();
		
		if (runtime == null) {
			Debug.startTimer();
			runtime = Environment.createInterpreter(getLock() != Environment.getStrategoLock());
			runtime.init();
			Debug.stopTimer("Created new Stratego runtime instance");
			monitor.subTask("Loading analysis runtime components");
		}
	}

	private void loadCTree(String filename) {
		try {
			Debug.startTimer("Loading Stratego module ", filename);
			assert getLock() == Environment.getStrategoLock() || !Environment.getStrategoLock().isHeldByCurrentThread();
			Environment.getStrategoLock().lock();
			try {
				runtime.load(descriptor.openAttachment(filename));
			} finally {
				Environment.getStrategoLock().unlock();
			}
			Debug.stopTimer("Successfully loaded " +  filename);
		} catch (InterpreterException e) {
			reportLoadException(e, filename);
		} catch (IOException e) {
			reportLoadException(e, filename);
		} catch (RuntimeException e) {
			reportLoadException(e, filename);
		}
	}
	
	private void loadJars(List<String> jars) {
		try {
			Debug.startTimer("Loading Stratego modules " + jars);
			URL[] classpath = new URL[jars.size()];
			for (int i = 0; i < classpath.length; i++) {
				File file = new File(jars.get(i));
				if (!file.isAbsolute())
				  file = descriptor.getBasePath().append(file.getPath()).toFile();
				if (descriptor.isDynamicallyLoaded())
					file = fileCopier.copyToTempFile(file);
				classpath[i] = file.toURI().toURL();
			}
			Class attachments = descriptor.getAttachmentProvider();
			Debug.log("Loading JARs from " + Arrays.toString(classpath));
			Debug.log("Parent class loader: ", attachments.getName() + "; " + attachments.getClassLoader().getClass().getName());
			// TODO: Use plugin's parent class loader? (Spoofax/322)
			// runtime.loadJars(attachments.getClassLoader(), classpath);
			runtime.loadJars(getClass().getClassLoader(), classpath);
			Debug.stopTimer("Successfully loaded " + jars);
		} catch (SecurityException e) {
			reportLoadException(e, jars);
		} catch (IncompatibleJarException e) {
			reportLoadException(e, jars);
		} catch (IOException e) {
			reportLoadException(e, jars);
		} catch (Error e) {
			reportLoadException(e, jars);
		} catch (RuntimeException e) {
			reportLoadException(e, jars);
		}
	}

	private void reportLoadException(Throwable e, Object source) {
		Environment.logException(new BadDescriptorException("Could not load compiler service provider(s): " + source, e));
		if (descriptor.isDynamicallyLoaded())
			Environment.asynOpenErrorDialog("Dynamic descriptor loading", "Error loading compiler service provider(s): " + source, e);
	}

	/**
	 * Starts a new update() operation, asynchronously.
	 * Can be called from multiple threads.
	 */
	public void scheduleUpdate(final IParseController parseController) {
		
		assert parseController instanceof SGLRParseController; // assumption made in other methods...
		
		isUpdateStarted = true;

		observerSchedulerLock.lock();
		try {
			StrategoAnalysisQueue queue = StrategoAnalysisQueueFactory.getInstance();
 			if (this.updateJob != null) {
				this.updateJob.cancelNonImmediate();
			}
			
			if (this.rushNextUpdate) {
				this.rushNextUpdate = false;
				this.updateJob = queue.queue(this, parseController, 0);
			} else {
 				this.updateJob = queue.queue(this, parseController, OBSERVER_DELAY);
			}
		} finally {
			observerSchedulerLock.unlock();
		}
		
	}

	public void update(IParseController parseController, IProgressMonitor monitor) {
		isUpdateStarted = true;
		IStrategoTerm ast = (IStrategoTerm) parseController.getCurrentAst();
		if (ast == null /* UNDONE: || tryGetConstructor(ast) == null*/ || feedbackFunction == null
				|| isRecoveryFailed(parseController)) {
			if (parseController instanceof SGLRParseController)
				messages.clearMarkers(((SGLRParseController) parseController).getResource());
			messages.commitAllChanges();
			return;
		}
			
		if (monitor.isCanceled())
			return;
		
		IStrategoTerm feedback = null;
		
		try {
			getLock().lock();
			try {
				resultingAsts.remove(SourceAttachment.getResource(ast));
				feedback = invokeSilent(
					feedbackFunction,
					getInputBuilder().makeInputTerm(ast, false), 
					SourceAttachment.getResource(ast),
					true
				);	
				if (feedback == null) {
					reportRewritingFailed();
					String log = getLog();
					if (!wasExceptionLogged || log.length() > 0)
						Environment.logException(log.length() == 0 ? "Analysis failed" : "Analysis failed:\n" + log);
					messages.clearMarkers(SourceAttachment.getResource(ast));
					messages.addMarkerFirstLine(SourceAttachment.getResource(ast), "Analysis failed (see error log)", IMarker.SEVERITY_ERROR);
					messages.commitAllChanges();
				}
			} finally {
				getLock().unlock();
			}
		 	if (feedback != null && !monitor.isCanceled()) {
				// TODO: figure out how this was supposed to be synchronized??
				//DesugaredOriginAttachment.setAllTermsAsDesugaredOrigins(feedback.getSubterm(0));
				presentToUser(SourceAttachment.getResource(ast), feedback);
		 	}
		} finally {
			// System.out.println("OBSERVED " + System.currentTimeMillis()); // DEBUG
			// processEditorRecolorEvents(parseController);
            // AstMessageHandler.processAllEditorRecolorEvents();
		}
	}

	private static boolean isRecoveryFailed(IParseController parseController) {
		return parseController instanceof SGLRParseController
				&& ((SGLRParseController) parseController).getErrorHandler().isRecoveryFailed();
	}

	public void reportRewritingFailed() {
		assert getLock().isHeldByCurrentThread();
		StackTracer trace = runtime.getContext().getStackTracer();
		runtime.getIOAgent().printError(
				trace.getTraceDepth() != 0 ? "rewriting failed, trace:" : "rewriting failed");
		trace.printStackTrace();
		if (descriptor.isDynamicallyLoaded())
			StrategoConsole.activateConsole();
	}
	
	/* UNDONE: asynchronous feedback presentation
	private void asyncPresentToUser(final IParseController parseController, final IStrategoTerm feedback, final String log) {
		Job job = new WorkspaceJob("Showing feedback") {
			{ setSystem(true); } // don't show to user
			@Override
			public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
				presentToUser(parseController, feedback, log);
				return Status.OK_STATUS;
			}
		};
		
		job.setRule(parseController.getProject().getResource());
		job.setSystem(true);
		job.schedule();
	}
	*/

	public void presentToUser(IResource resource, IStrategoTerm feedback) {
		assert getLock().isHeldByCurrentThread();
		assert feedback != null;

		if (isTermString(feedback)) {
			String status = ((IStrategoString)feedback).stringValue();
			if (status.equals("BACKGROUNDED")) {
				// Trigger update when needed
				isUpdateStarted = false;
				return;
			} else {
				throw new StrategoException("Illegal status from " + feedbackFunction + ": " + status);
			}
		}
		
		// TODO: use FileTrackingIOAgent to find out what to clear
		// UNDONE: messages.clearAllMarkers();
		messages.clearMarkers(resource);

		try {
			feedback = extractResultingAST(resource, feedback);
			
			if (feedback.getTermType() == TUPLE
					&& feedback.getSubtermCount() == 3
					&& termAt(feedback, 0).getTermType() == LIST
					&& termAt(feedback, 1).getTermType() == LIST
					&& termAt(feedback, 2).getTermType() == LIST) {
				
			    IStrategoList errors = termAt(feedback, 0);
			    IStrategoList warnings = termAt(feedback, 1);
			    IStrategoList notes = termAt(feedback, 2);
			    feedbackToMarkers(resource, errors, IMarker.SEVERITY_ERROR);
			    feedbackToMarkers(resource, warnings, IMarker.SEVERITY_WARNING);
			    feedbackToMarkers(resource, notes, IMarker.SEVERITY_INFO);
			} else {
				Environment.logException("Incorrect output from analysis function: " + feedbackFunction);
				messages.addMarkerFirstLine(resource, "Analysis failed: " + feedbackFunction +
						" should return (errors,warnings,notes) or (ast,errors,warnings,notes) tuple ",
						IMarker.SEVERITY_ERROR);
			}
		} finally {
			messages.commitAllChanges();
		}
	}
	
	private IStrategoTerm extractResultingAST(IResource resource, IStrategoTerm feedback) {
		if (isTermTuple(feedback) && feedback.getSubtermCount() == 4
				&& (!"None".equals(cons(feedback.getSubterm(0))) || feedback.getSubterm(0).getSubtermCount() > 0)) {
			resultingAsts.put(resource, feedback.getSubterm(0));
			
			IStrategoTuple newFeedback = Environment.getTermFactory().makeTuple(
					feedback.getSubterm(1), feedback.getSubterm(2), feedback.getSubterm(3));
			return newFeedback;
		} else {
			resultingAsts.remove(resource);
			return feedback;
		}
	}
	
	private final void feedbackToMarkers(IResource resource, IStrategoList feedbacks, int severity) {
		assert getLock().isHeldByCurrentThread();
		
		Context context = runtime.getCompiledContext();
		sdf2imp.init(context);
		feedbacks = postProcessFeedback(feedbacks, context);
		
	    for (IStrategoTerm feedback : feedbacks.getAllSubterms()) {
	    	IStrategoTerm term;
	    	String message;
	    	if (isTermTuple(feedback) && feedback.getSubtermCount() == 2) {
	    		term = termAt(feedback, 0);
	    		IStrategoString messageTerm = termAt(feedback, 1);
	    		message = messageTerm.stringValue();
	    	} else {
	    		term = feedback;
	    		message = feedback.toString() + " (no tree node indicated)";
	    	}
			
			messages.addMarker(resource, term, message, severity);
	    }
	}

	private IStrategoList postProcessFeedback(IStrategoList feedbacks, Context context) {
		IStrategoList result =
				(IStrategoList) postprocess_feedback_results_0_0.instance.invoke(context, feedbacks);
		if (result == null) {
			// Throw an exception to trigger an Eclipse pop-up  
			throw new StrategoException("Illegal output from " + feedbackFunction + ": " + feedbacks);
		}
		return result;
	}	
	
	/**
	 * Invoke a Stratego function with a specific AST node as its input.
	 * 
	 * @see #getAstNode(IStrategoTerm, boolean)  To retrieve the AST node associated with the resulting term.
	 */
	public IStrategoTerm invoke(String function, IStrategoTerm node)
			throws UndefinedStrategyException, InterpreterErrorExit, InterpreterExit, InterpreterException {

		IStrategoTerm input = getInputBuilder().makeInputTerm(node, true);
		return invoke(function, input, SourceAttachment.getResource(node));
	}
	
	/**
	 * Invoke a Stratego function with a specific term its input,
	 * given a particular working directory.
	 */
	public IStrategoTerm invoke(String function, IStrategoTerm term, IResource resource)
			throws UndefinedStrategyException, InterpreterErrorExit, InterpreterExit, InterpreterException {
		return invoke(function, term, resource, false);
	}

	private IStrategoTerm invoke(String function, IStrategoTerm term, IResource resource,
			boolean assignDesugaredOrigins) throws InterpreterErrorExit, InterpreterExit,
			UndefinedStrategyException, InterpreterException {
		getLock().lock();
		try {
			if (runtime == null) initialize(new NullProgressMonitor());
			if (runtime == null) return null;
			
		    Debug.startTimer();
			// TODO: Make Context support monitor.isCanceled()?
			//       (e.g., overriding Context.lookupPrimitive to throw an OperationCanceledException) 
			
			runtime.setCurrent(term);
			configureRuntime(resource);

			((LoggingIOAgent) runtime.getIOAgent()).clearLog();
			assert runtime.getCompiledContext().getOperatorRegistry(IMPJSGLRLibrary.REGISTRY_NAME)
					instanceof IMPJSGLRLibrary;
			boolean isDebugModeAllowed = Environment.allowsDebugging(this.descriptor);
			if (isDebugModeAllowed && runtime instanceof DebuggableHybridInterpreter)
			{
				// enable the debugger, otherwise it would just do a normal invoke
				// TODO: check if we allow the invoke, the number of simultaneous invokes may have an upper limit
				// to prevent exessive use of cpu and memory (each invoke will start a new VM!)
				((DebuggableHybridInterpreter) runtime).setDebugLaunchEnabled(this.isDebuggerEnabled());
			}
			boolean success = false;
	    	if (runtime.getFactory() instanceof OriginTermFactory){
	    		((OriginTermFactory)runtime.getFactory()).setAssignDesugaredOrigins(assignDesugaredOrigins);
	    		success = runtime.invoke(function);
	    		((OriginTermFactory)runtime.getFactory()).setAssignDesugaredOrigins(false);
	    	}
	    	else
	    		success = runtime.invoke(function);
			
			// Cleanup input term.
			IStrategoTerm result = runtime.current();
			runtime.setCurrent(null);
			
			Debug.stopTimer("Evaluated strategy " + function + (success ? "" : " (failed)"));
			return success ? result : null;
		} finally {
			getLock().unlock();
		}
	}

	/**
	 * Invoke a Stratego function with a specific AST node as its input,
	 * logging and swallowing all exceptions.
	 * 
	 * @see #getAstNode(IStrategoTerm, boolean)  To retrieve the AST node associated with the resulting term.
	 */
	public IStrategoTerm invokeSilent(String function, IStrategoTerm node) {
		try {
			return invokeSilent(function, getInputBuilder().makeInputTerm(node, true), SourceAttachment.getResource(node));
		} catch (RuntimeException e) {
			if (runtime != null) runtime.getIOAgent().printError("Internal error evaluating " + function + " (" + name(e) + "; see error log)");
			Environment.logException("Internal error evaluating strategy " + function, e);
			if (descriptor.isDynamicallyLoaded()) StrategoConsole.activateConsole();
			return null;
		}
	}
	
	/**
	 * Invoke a Stratego function with a specific term its input,
	 * given a particular working directory.
	 * Logs and swallows all exceptions.
	 */
	public IStrategoTerm invokeSilent(String function, IStrategoTerm input, IResource resource) {
		return invokeSilent(function, input, resource, false);
	}

	private IStrategoTerm invokeSilent(String function, IStrategoTerm input, IResource resource,
			boolean assignDesugaredOrigins) {
		assert getLock().isHeldByCurrentThread();
		IStrategoTerm result = null;
		try {
			wasExceptionLogged = true;
			result = invoke(function, input, resource, assignDesugaredOrigins);
			wasExceptionLogged = false;
		} catch (InterpreterExit e) {
			if (descriptor.isDynamicallyLoaded()) StrategoConsole.activateConsole();
			messages.clearMarkers(resource);
			if (!(e instanceof InterpreterErrorExit))
				messages.addMarkerFirstLine(resource, "Analysis failed (" + name(e) + "; see error log)", IMarker.SEVERITY_ERROR);
			messages.commitAllChanges();
			Environment.logException("Runtime exited when evaluating strategy " + function, runtime.getCompiledContext(), e);
		} catch (UndefinedStrategyException e) {
			// Note that this condition may also be reached when the semantic service hasn't been loaded yet
			if (descriptor.isDynamicallyLoaded())
				runtime.getIOAgent().printError("Internal error: strategy does not exist or is defined in a module that is not imported: " + e.getMessage());
			Environment.logException("Strategy does not exist: " + e.getMessage(), runtime.getCompiledContext(), e);
		} catch (InterpreterException e) {
			if (descriptor.isDynamicallyLoaded())
				runtime.getIOAgent().printError("Internal error evaluating " + function + " (" + name(e) + "; see error log)");
			Environment.logException("Internal error evaluating strategy " + function, runtime.getCompiledContext(), e);
			if (descriptor.isDynamicallyLoaded()) StrategoConsole.activateConsole();
		} catch (RuntimeException e) {
			if (runtime != null && descriptor.isDynamicallyLoaded())
				runtime.getIOAgent().printError("Internal error evaluating " + function + " (" + name(e) + "; see error log)");
			Environment.logException("Internal error evaluating strategy " + function, runtime.getCompiledContext(), e);
			if (descriptor.isDynamicallyLoaded()) StrategoConsole.activateConsole();
		} catch (Error e) { // e.g. NoClassDefFoundError due to bad/missing stratego jar
			if (runtime != null && descriptor.isDynamicallyLoaded())
				runtime.getIOAgent().printError("Internal error evaluating " + function + " (" + name(e) + "; see error log)");
			Environment.logException("Internal error evaluating strategy " + function, runtime.getCompiledContext(), e);
			if (descriptor.isDynamicallyLoaded()) StrategoConsole.activateConsole();
		}
		
		return result;
	}
	
	private static String name(Throwable e) {
		return e.getClass().getSimpleName();
	}

	public ISimpleTerm getAstNode(IStrategoTerm term, boolean tryArguments) {
		if (term == null) return null;
			
		if (hasImploderOrigin(term)) {
			return tryGetOrigin(term);
		} else if (tryArguments) {
			for (IStrategoTerm subterm : term.getAllSubterms()) {
				if (hasImploderOrigin(subterm)) {
					Environment.logWarning("Resolved reference is not associated with an AST node " + term + " used child " + subterm + "instead");
					ISimpleTerm result = tryGetOrigin(subterm);
					return getParent(result) != null ? getParent(result) : result;
				}
			}
		}
		if (descriptor.isDynamicallyLoaded()) {
			Environment.logWarning("Resolved reference is not associated with an AST node " + term);
		} else {
			Environment.logException("Resolved reference is not associated with an AST node " + term);
		}
		return null;
	}
	
	private void configureRuntime(IResource resource) {
		assert getLock().isHeldByCurrentThread();
		
		String projectPath = getInputBuilder().tryGetProjectPath(resource);
		IProject project = resource.getProject();
		
		configureRuntime(project, projectPath);
	}

	public void configureRuntime(IProject project, String projectPath) {
		try {
			ITermFactory factory = getRuntime().getFactory();
			IStrategoTuple programName = factory.makeTuple(
					factory.makeString("program"),
					factory.makeString(descriptor.getLanguage().getName()));
			set_config_0_0.instance.invoke(runtime.getCompiledContext(), programName);
		} catch (BadDescriptorException e) {
			// Ignore; use default program name
		}
		
		try {
			EditorIOAgent io = (EditorIOAgent) runtime.getIOAgent();
			io.setWorkingDir(projectPath);
			io.setProjectPath(projectPath);
			io.setProject(project);
			io.setDescriptor(descriptor);
		} catch (IOException e) {
			Environment.logException("Could not set Stratego working directory", e);
			throw new RuntimeException(e);
		}
		
		// TODO: RLINDEMAN: set the project path and the language name
		if (runtime instanceof DebuggableHybridInterpreter)
		{
			((DebuggableHybridInterpreter) runtime).setProjectpath(projectPath);
		}
	}
	
	public HybridInterpreter getRuntime() {
		assert getLock().isHeldByCurrentThread();
		if (runtime == null) initialize(new NullProgressMonitor());
		if (runtime == null) createEmptyRuntime(new NullProgressMonitor()); // create empty runtime
		return runtime;
	}

	public void prepareForReinitialize() {
		// Do nothing
	}

	public void reinitialize(Descriptor newDescriptor)  {
		runtimePrototypes.remove(descriptor);
		if (runtime != null) {
			getLock().lock();
			try {
				runtime = null;
				descriptor = newDescriptor;
			} finally {
				getLock().unlock();
			}
		}
	}

	public void asyncCancel() {
		IAsyncCancellable canceller = this.runtime;
		if (canceller != null) canceller.asyncCancel();
	}

	public void asyncCancelReset() {
		IAsyncCancellable canceller = this.runtime;
		if (canceller != null) canceller.asyncCancelReset();
		
	}
}
