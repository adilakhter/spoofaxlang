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

@SuppressWarnings("all") final class lifted10168 extends Strategy 
{ 
  public static final lifted10168 instance = new lifted10168();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27874:
    { 
      IStrategoTerm s_4489 = null;
      IStrategoTerm b_4490 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27874;
      b_4490 = term.getSubterm(0);
      IStrategoTerm arg6612 = term.getSubterm(1);
      s_4489 = arg6612;
      term = aux_$Follow$Success_0_2.instance.invoke(context, b_4490, arg6612, s_4489);
      if(term == null)
        break Fail27874;
      if(true)
        return term;
    }
    return null;
  }
}