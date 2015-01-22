package org.strategoxt.imp.runtime.stratego;

import java.io.File;
import java.io.IOException;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.library.ssl.SSLLibrary;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;

/**
 * Returns the directory of the current Eclipse project.
 * 
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class deltree_0_0 extends AbstractPrimitive {

	public deltree_0_0() {
		super("SSL_EXT_MOBL_deltree", 0, 0);
	}

	@Override
	public boolean call(IContext context, Strategy[] svars, IStrategoTerm[] tvars)
			throws InterpreterException {
		
		IStrategoTerm current = invoke(context, context.current());
		context.setCurrent(current);
		return true;
	}
	
	public IStrategoTerm invoke(IContext context, IStrategoTerm current) {
		EditorIOAgent agent = (EditorIOAgent) SSLLibrary.instance(context).getIOAgent();
        String path = uglify_0_0.getStringFromTerm(current);
        try {
            delete(agent.openFile(path));
        } catch (IOException e) {
        	agent.printError(e.getMessage());
            return null;
        }
        return current;
    }

    void delete(File f) throws IOException {
        if (f.isDirectory()) {
            for (File c : f.listFiles()) {
                delete(c);
            }
        }
        if (!f.delete())
            throw new IOException("Failed to delete file: " + f);
    }
}