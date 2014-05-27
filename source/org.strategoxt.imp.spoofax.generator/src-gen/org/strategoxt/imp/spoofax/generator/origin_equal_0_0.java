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

@SuppressWarnings("all") public class origin_equal_0_0 extends Strategy 
{ 
  public static origin_equal_0_0 instance = new origin_equal_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("origin_equal_0_0");
    Fail25755:
    { 
      IStrategoTerm q_4257 = null;
      IStrategoTerm r_4257 = null;
      TermReference p_4684 = new TermReference();
      IStrategoTerm u_4684 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25755;
      r_4257 = term.getSubterm(0);
      q_4257 = term.getSubterm(1);
      u_4684 = q_4257;
      term = r_4257;
      if(p_4684.value == null)
        p_4684.value = term;
      else
        if(p_4684.value != term && !p_4684.value.match(term))
          break Fail25755;
      term = u_4684;
      lifted9225 lifted92250 = new lifted9225();
      lifted92250.p_4684 = p_4684;
      term = support_sublist_1_0.instance.invoke(context, term, lifted92250);
      if(term == null)
        break Fail25755;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}