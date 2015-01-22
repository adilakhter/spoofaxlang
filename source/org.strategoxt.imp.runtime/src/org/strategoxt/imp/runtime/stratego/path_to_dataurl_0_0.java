package org.strategoxt.imp.runtime.stratego;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.library.ssl.SSLLibrary;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

/**
 * Returns the directory of the current Eclipse project.
 * 
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class path_to_dataurl_0_0 extends AbstractPrimitive {

	public path_to_dataurl_0_0() {
		super("SSL_EXT_MOBL_pathtodataurl", 0, 0);
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
        ITermFactory factory = context.getFactory();
        try {
            return factory.makeString(pathToDataUrl(context, path));
        } catch (IOException e) {
        	agent.printError("Failed to open file and data urlify: " + path);
        	agent.printError(e.toString());
            return null;
        }
    }

    private String pathToDataUrl(IContext context, String path) throws IOException {
    	EditorIOAgent agent = (EditorIOAgent) SSLLibrary.instance(context).getIOAgent();
        byte[] buf = read(agent.openFile(path));
        String mime = "";
        if(path.endsWith(".png")) {
            mime = "image/png";
        } else if(path.endsWith(".jpg")) {
            mime = "image/jpeg";
        } else if(path.endsWith(".gif")) {
            mime = "image/gif";
        }
        return "data:" + mime + ";base64," + new String(Base64Coder.encode(buf));
    }

    public byte[] read(File file) throws IOException {

        byte[] buffer = new byte[(int) file.length()];
        InputStream ios = null;
        try {
            ios = new FileInputStream(file);
            if (ios.read(buffer) == -1) {
                throw new IOException(
                        "EOF reached while trying to read the whole file");
            }
        } finally {
            try {
                if (ios != null)
                    ios.close();
            } catch (IOException e) {
            // do nothing	
            }
        }

        return buffer;
    }
}