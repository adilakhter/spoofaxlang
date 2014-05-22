package org.spoofax.interpreter.library.language.spxlang;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.library.language.spxlang.index.SpxSemanticIndex;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;

public class SPX_symtab_new_scope extends SpxAbstractPrimitive {
	private static String NAME = "SPX_symtab_new_scope";
	private final static int ENCLOSING_NAMESPACE_ID = 1;
	private final static int NO_ARGS = 2;
	
	public SPX_symtab_new_scope(SpxSemanticIndex index) {
		super(index, NAME, 0, NO_ARGS);
	}

	@Override
	protected SpxPrimitiveValidator validateArguments(IContext env, Strategy[] svars, IStrategoTerm[] tvars){
		return super.validateArguments(env, svars, tvars)
					.validateApplTermAt(ENCLOSING_NAMESPACE_ID);
	}

	@Override
	protected boolean executePrimitive(IContext env, Strategy[] svars, IStrategoTerm[] tvars) throws Exception {
		IStrategoAppl namespaceAppl   = (IStrategoAppl) tvars[ENCLOSING_NAMESPACE_ID];
		IStrategoTerm retTerm = index.insertNewScope(getProjectPath(tvars), namespaceAppl);
		env.setCurrent(retTerm);
		return true;
	}
}