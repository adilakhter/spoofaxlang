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

@SuppressWarnings("all") public class flatlex_2_0 extends Strategy 
{ 
  public static flatlex_2_0 instance = new flatlex_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4406, Strategy h_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("flatlex_2_0");
    Fail26835:
    { 
      IStrategoTerm r_4669 = null;
      IStrategoTerm p_4669 = null;
      IStrategoTerm q_4669 = null;
      IStrategoTerm s_4669 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consflatlex_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26835;
      p_4669 = term.getSubterm(0);
      q_4669 = term.getSubterm(1);
      IStrategoList annos962 = term.getAnnotations();
      r_4669 = annos962;
      term = g_4406.invoke(context, p_4669);
      if(term == null)
        break Fail26835;
      s_4669 = term;
      term = h_4406.invoke(context, q_4669);
      if(term == null)
        break Fail26835;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consflatlex_2, new IStrategoTerm[]{s_4669, term}), checkListAnnos(termFactory, r_4669));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}