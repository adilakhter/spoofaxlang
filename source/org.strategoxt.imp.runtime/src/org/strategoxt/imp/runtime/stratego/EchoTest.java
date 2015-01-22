package org.strategoxt.imp.runtime.stratego;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;

/**
 * Returns the directory of the current Eclipse project.
 * 
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class EchoTest extends AbstractPrimitive {

	public EchoTest() {
		super("SSL_EXT_EchoTest", 0, 0);
	}

	@Override
	public boolean call(IContext env, Strategy[] svars, IStrategoTerm[] tvars)
			throws InterpreterException {
		
		env.setCurrent(env.getFactory().makeString("Test!"));
		return true;
	}
	
}
