package org.spoofax.interpreter.terms.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.ParseError;

public interface IFileTermFactory extends org.spoofax.interpreter.terms.ITermFactory {

    public IStrategoTerm parseFromFile(String path) throws IOException, ParseError;
    
    public IStrategoTerm parseFromStream(InputStream inputStream) throws IOException, ParseError;
    
    public void unparseToFile(IStrategoTerm t, OutputStream ous) throws IOException;
    
    public void unparseToFile(IStrategoTerm t, Writer out) throws IOException;

}
