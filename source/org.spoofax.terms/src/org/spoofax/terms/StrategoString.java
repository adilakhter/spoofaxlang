/*
 * Created on 9. okt.. 2006
 *
 * Copyright (c) 2005, Karl Trygve Kalleberg <karltk near strategoxt.org>
 * 
 * Licensed under the GNU General Public License, v2
 */
package org.spoofax.terms;

import java.io.IOException;

import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermPrinter;


public class StrategoString extends StrategoTerm implements IStrategoString {
	
    private static final long serialVersionUID = 237308007762215350L;
	
    private final String value;
    
    public StrategoString(String value, IStrategoList annotations, int storageType) {
        super(annotations, storageType);
        this.value = value;
        assert storageType == MAXIMALLY_SHARED ? annotations == null : true;
        initImmutableHashCode();
    }
    
    protected StrategoString(String value) {
    	this(value, TermFactory.EMPTY_LIST, IStrategoTerm.IMMUTABLE);
    }
    
    public IStrategoTerm getSubterm(int index) {
        throw new IndexOutOfBoundsException();
    }

    public IStrategoTerm[] getAllSubterms() {
        return TermFactory.EMPTY;
    }
    
    public int getSubtermCount() {
        return 0;
    }

    public int getTermType() {
        return IStrategoTerm.STRING;
    }

    @Override
    protected boolean doSlowMatch(IStrategoTerm second, int commonStorageType) {
        if(second.getTermType() != IStrategoTerm.STRING)
            return false;
        
        String value = stringValue();
        String secondValue = ((IStrategoString) second).stringValue();
        
        if (value == secondValue) {
        	// Do nothing
        } else if (value.equals(secondValue)) {
        	// Don't apply resharing here (StrategoXT/801) but maintain
        	// the string instance that may be in the string pool
        	// if (commonStorageType == SHARABLE)
        	//	this.value = secondValue;
        } else {
            return false;
        }

        IStrategoList annotations = getAnnotations();
        IStrategoList secondAnnotations = second.getAnnotations();
        if (annotations == secondAnnotations) {
            // assert annotations.isEmpty() ? this == second : true : "Maximal sharing contract broken";
        	return true;
        } else if (annotations.match(secondAnnotations)) {
        	if (commonStorageType == SHARABLE) internalSetAnnotations(secondAnnotations);
        	return true;
        } else {
        	return false;
        }
    }

    public String stringValue() {
        return value;
    }
    
    public String getName() {
    	return value;
    }
    
    @Deprecated
	public void prettyPrint(ITermPrinter pp) {
        pp.print("\"");
        pp.print(stringValue().replace("\\", "\\\\").replace("\"", "\\\"")
        		.replace("\n", "\\n").replace("\r", "\\r"));
        pp.print("\"");
        printAnnotations(pp);
    }
 
    public void writeAsString(Appendable output, int maxDepth) throws IOException {
    	output.append("\"");
    	output.append(stringValue().replace("\\", "\\\\").replace("\"", "\\\"")
        		.replace("\n", "\\n").replace("\r", "\\r"));
    	output.append("\"");
        appendAnnotations(output, maxDepth);
    }
    
    @Override
    public int hashFunction() {
        return stringValue().hashCode();
    }
    
}
