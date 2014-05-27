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

@SuppressWarnings("all") final class lifted9558 extends Strategy 
{ 
  Strategy w_4411;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28391:
    { 
      IStrategoTerm b_4690 = null;
      IStrategoTerm c_4690 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consLiteral_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28391;
      c_4690 = term.getSubterm(0);
      IStrategoList annos1047 = term.getAnnotations();
      b_4690 = annos1047;
      term = w_4411.invoke(context, c_4690);
      if(term == null)
        break Fail28391;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consLiteral_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_4690));
      if(true)
        return term;
    }
    return null;
  }
}