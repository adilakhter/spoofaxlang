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

@SuppressWarnings("all") final class lifted10178 extends Strategy 
{ 
  public static final lifted10178 instance = new lifted10178();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27864:
    { 
      IStrategoTerm h_4494 = null;
      IStrategoTerm q_4494 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27864;
      q_4494 = term.getSubterm(0);
      IStrategoTerm arg6618 = term.getSubterm(1);
      h_4494 = arg6618;
      term = aux_$Production$Visited_0_2.instance.invoke(context, q_4494, arg6618, h_4494);
      if(term == null)
        break Fail27864;
      if(true)
        return term;
    }
    return null;
  }
}