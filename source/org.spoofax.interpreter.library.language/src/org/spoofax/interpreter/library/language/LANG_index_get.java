package org.spoofax.interpreter.library.language;

import static org.spoofax.interpreter.core.Tools.isTermAppl;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;

/**
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class LANG_index_get extends AbstractPrimitive {

	private static String NAME = "LANG_index_get";
	
	private final SemanticIndex index;
	
	public LANG_index_get(SemanticIndex index) {
		super(NAME, 0, 1);
		this.index = index;
	}

	@Override
	public boolean call(IContext env, Strategy[] svars, IStrategoTerm[] tvars) {
		if (isTermAppl(tvars[0])) {
			IStrategoAppl template = (IStrategoAppl) tvars[0];
			env.setCurrent(index.getTerms(template));
			return true;
		} else {
			return false;
		}
	}
}
