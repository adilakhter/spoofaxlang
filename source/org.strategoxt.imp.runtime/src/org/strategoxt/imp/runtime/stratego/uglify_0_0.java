package org.strategoxt.imp.runtime.stratego;

import org.spoofax.interpreter.terms.IStrategoTerm;

public class uglify_0_0{

    public static uglify_0_0 instance = new uglify_0_0();

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