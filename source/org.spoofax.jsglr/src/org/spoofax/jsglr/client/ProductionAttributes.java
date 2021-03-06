/*
 * Created on 16.apr.2006
 *
 * Copyright (c) 2005, Karl Trygve Kalleberg <karltk near strategoxt.org>
 *
 * Licensed under the GNU General Public License, v2
 */
package org.spoofax.jsglr.client;

import static org.spoofax.jsglr.client.ProductionType.AVOID;
import static org.spoofax.jsglr.client.ProductionType.PREFER;

import java.io.Serializable;

import org.spoofax.interpreter.terms.IStrategoTerm;

public class ProductionAttributes implements Serializable {

    private static final long serialVersionUID = 556855017447626835L;

    private final int type;

    private final boolean isRecover;

    private final boolean isCompletion;

    private final transient IStrategoTerm abstractCtor;

    ProductionAttributes(IStrategoTerm ctor, int type, boolean isRecover, boolean isCompletion) {
        this.type = type;
        this.abstractCtor = ctor;
        this.isRecover = isRecover;
        this.isCompletion = isCompletion;
    }

    public final int getType() {
        return type;
    }

    public final IStrategoTerm getTerm() {
        return abstractCtor;
    }

    public boolean isRecoverProduction() {
        return isRecover;
    }

    public boolean isCompletionProduction() {
        return isCompletion;
    }

    public boolean isMoreEager(ProductionAttributes other) {
        return type != other.type && (type == PREFER || other.type == AVOID);
    }
}
