package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9557 extends Strategy 
{ 
  Strategy w_4411;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28390:
    { 
      IStrategoTerm x_4689 = null;
      IStrategoTerm y_4689 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consDoubleQuoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28390;
      y_4689 = term.getSubterm(0);
      IStrategoList annos1046 = term.getAnnotations();
      x_4689 = annos1046;
      term = y_4689;
      lifted9558 lifted95580 = new lifted9558();
      lifted95580.w_4411 = w_4411;
      term = $Cons_2_0.instance.invoke(context, term, lifted95580, $Nil_0_0.instance);
      if(term == null)
        break Fail28390;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consDoubleQuoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, x_4689));
      if(true)
        return term;
    }
    return null;
  }
}