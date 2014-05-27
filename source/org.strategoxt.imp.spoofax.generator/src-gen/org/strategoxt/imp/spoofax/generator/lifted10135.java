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

@SuppressWarnings("all") final class lifted10135 extends Strategy 
{ 
  public static final lifted10135 instance = new lifted10135();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27907:
    { 
      IStrategoTerm g_4473 = null;
      IStrategoTerm h_4473 = null;
      IStrategoTerm q_4473 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27907;
      q_4473 = term.getSubterm(0);
      IStrategoTerm arg6596 = term.getSubterm(1);
      g_4473 = arg6596;
      if(arg6596.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)arg6596).getConstructor())
        break Fail27907;
      h_4473 = arg6596.getSubterm(0);
      term = aux_$On$Import$Failure_0_2.instance.invoke(context, q_4473, h_4473, g_4473);
      if(term == null)
        break Fail27907;
      if(true)
        return term;
    }
    return null;
  }
}