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

@SuppressWarnings("all") final class lifted10152 extends Strategy 
{ 
  public static final lifted10152 instance = new lifted10152();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27890:
    { 
      IStrategoTerm k_4482 = null;
      IStrategoTerm s_4482 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27890;
      s_4482 = term.getSubterm(0);
      IStrategoTerm arg6604 = term.getSubterm(1);
      k_4482 = arg6604;
      term = aux_$Collect$All$Visited_0_2.instance.invoke(context, s_4482, arg6604, k_4482);
      if(term == null)
        break Fail27890;
      if(true)
        return term;
    }
    return null;
  }
}