package org.spoofax.interpreter.library.language.spxlang;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.core.Tools;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.library.language.spxlang.SpxAbstractPrimitive.SpxPrimitiveValidator;
import org.spoofax.interpreter.library.language.spxlang.index.SpxSemanticIndex;
import org.spoofax.interpreter.library.ssl.SSLLibrary;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.IStrategoTuple;

public class SPX_symtab_undefine_symbols extends SpxAbstractPrimitive {
	private static String NAME = "SPX_symtab_undefine_symbols";
	private static int SEARCH_CRITERIA_INDEX = 1; 
	private final static int NO_ARGS = 2;

	public SPX_symtab_undefine_symbols(SpxSemanticIndex index) {
		super(index, NAME, 0, NO_ARGS);
	}
	
	@Override
	protected SpxPrimitiveValidator validateArguments(IContext env, Strategy[] svars, IStrategoTerm[] tvars){
		return super.validateArguments(env, svars, tvars)
					.validateTupleTermAt(SEARCH_CRITERIA_INDEX);
	}
	
	
	@Override
	protected boolean executePrimitive(IContext env, Strategy[] svars, IStrategoTerm[] tvars) throws Exception {
		IStrategoTuple searchCriteria = (IStrategoTuple)tvars[SEARCH_CRITERIA_INDEX];
		IStrategoTerm t = index.undefineSymbols(getProjectPath(tvars), searchCriteria);
		env.setCurrent(t);
		return true;
	}
}