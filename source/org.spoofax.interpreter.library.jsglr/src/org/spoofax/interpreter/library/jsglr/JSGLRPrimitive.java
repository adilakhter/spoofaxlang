/*
 * Copyright (c) 2005-2011, Karl Trygve Kalleberg <karltk near strategoxt dot org>
 * 
 * Licensed under the GNU Lesser General Public License, v2.1
 */
package org.spoofax.interpreter.library.jsglr;

import org.spoofax.interpreter.core.IContext;
import org.spoofax.interpreter.library.AbstractPrimitive;

public abstract class JSGLRPrimitive extends AbstractPrimitive {

	protected JSGLRPrimitive(String name, int svars, int tvars) {
		super(name, svars, tvars);
	}

    protected static JSGLRLibrary getLibrary(IContext env) {
        return (JSGLRLibrary) env.getOperatorRegistry(JSGLRLibrary.REGISTRY_NAME);
    }

}
