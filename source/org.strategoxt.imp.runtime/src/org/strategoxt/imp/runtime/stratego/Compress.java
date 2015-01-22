package org.strategoxt.imp.runtime.stratego;

import java.io.StringReader;
import java.io.StringWriter;

import org.mozilla.javascript.ErrorReporter;
import org.mozilla.javascript.EvaluatorException;
import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.library.AbstractPrimitive;
import org.spoofax.interpreter.library.ssl.SSLLibrary;
import org.spoofax.interpreter.stratego.Strategy;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;

import com.yahoo.platform.yui.compressor.JavaScriptCompressor;

/**
 * Returns the directory of the current Eclipse project.
 * 
 * @author Lennart Kats <lennart add lclnet.nl>
 */
public class Compress extends AbstractPrimitive {

	public Compress() {
		super("SSL_EXT_MOBL_compress", 0, 0);
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
        String code = getStringFromTerm(current.getSubterm(1));
        ITermFactory factory = context.getFactory();
        StringReader in = new StringReader(code);
        StringWriter out = new StringWriter();
        try {
            JavaScriptCompressor compressor = new JavaScriptCompressor(in,
                    new ErrorReporter() {

                        public void warning(String message, String sourceName,
                                int line, String lineSource, int lineOffset) {
                            if (line < 0) {
                                System.err.println("\n[WARNING] " + message);
                            } else {
                                System.err.println("\n[WARNING] " + line + ':'
                                        + lineOffset + ':' + message);
                            }
                        }

                        public void error(String message, String sourceName,
                                int line, String lineSource, int lineOffset) {
                            if (line < 0) {
                                System.err.println("\n[ERROR] " + message);
                            } else {
                                System.err.println("\n[ERROR] " + line + ':'
                                        + lineOffset + ':' + message);
                            }
                        }

                        public EvaluatorException runtimeError(String message,
                                String sourceName, int line, String lineSource,
                                int lineOffset) {
                            error(message, sourceName, line, lineSource,
                                    lineOffset);
                            return new EvaluatorException(message);
                        }
                    });

            // Close the input stream first, and then open the output stream,
            // in case the output file should override the input file.
            in.close();
            in = null;

            compressor.compress(out, -1, true, false,
                    true, false);
            return factory.makeString(out.toString());
        } catch (Exception e) {
            agent.printError(e.toString());
            agent.printError(e.getMessage());
            e.printStackTrace();
            return null;
        }

    }

    public static String getStringFromTerm(IStrategoTerm current) {
        Class<?> cls = current.getClass();
        try {
            return (String) cls.getMethod("stringValue").invoke(current);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


	
}
