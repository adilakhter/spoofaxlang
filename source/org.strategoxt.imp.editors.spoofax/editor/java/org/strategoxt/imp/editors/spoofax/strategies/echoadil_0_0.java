package org.strategoxt.imp.editors.spoofax.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class echoadil_0_0 extends Strategy {

	public static echoadil_0_0 instance = new echoadil_0_0();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm current) {

		ITermFactory factory = context.getFactory();
		return factory.makeString("Regards from java-strategy");
	}

}
