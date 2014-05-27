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

@SuppressWarnings("all") public class aux_$Follow$Visited_0_2 extends Strategy 
{ 
  public static aux_$Follow$Visited_0_2 instance = new aux_$Follow$Visited_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_4488, IStrategoTerm r_4488)
  { 
    Fail27454:
    { 
      IStrategoTerm s_4488 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27454;
      IStrategoTerm arg6611 = term.getSubterm(0);
      if(arg6611.getTermType() != IStrategoTerm.STRING || !"193036".equals(((IStrategoString)arg6611).stringValue()))
        break Fail27454;
      s_4488 = term.getSubterm(1);
      term = s_4488;
      if(true)
        return term;
    }
    context.push("aux_FollowVisited_0_2");
    context.popOnFailure();
    return null;
  }
}