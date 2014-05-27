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

@SuppressWarnings("all") final class lifted10153 extends Strategy 
{ 
  public static final lifted10153 instance = new lifted10153();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27889:
    { 
      IStrategoTerm v_4482 = null;
      IStrategoTerm d_4483 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27889;
      d_4483 = term.getSubterm(0);
      IStrategoTerm arg6605 = term.getSubterm(1);
      v_4482 = arg6605;
      term = aux_$Collect$All$Visited_0_2.instance.invoke(context, d_4483, arg6605, v_4482);
      if(term == null)
        break Fail27889;
      if(true)
        return term;
    }
    return null;
  }
}