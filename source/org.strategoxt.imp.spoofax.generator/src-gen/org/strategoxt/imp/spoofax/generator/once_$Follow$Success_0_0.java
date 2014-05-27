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

@SuppressWarnings("all") public class once_$Follow$Success_0_0 extends Strategy 
{ 
  public static once_$Follow$Success_0_0 instance = new once_$Follow$Success_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_FollowSuccess_0_0");
    Fail27474:
    { 
      IStrategoTerm q_4491 = null;
      TermReference r_4491 = new TermReference();
      TermReference s_4491 = new TermReference();
      TermReference t_4491 = new TermReference();
      IStrategoTerm u_4491 = null;
      IStrategoTerm v_4491 = null;
      IStrategoTerm x_4491 = null;
      IStrategoTerm z_4491 = null;
      if(s_4491.value == null)
        s_4491.value = term;
      else
        if(s_4491.value != term && !s_4491.value.match(term))
          break Fail27474;
      if(r_4491.value == null)
        r_4491.value = term;
      else
        if(r_4491.value != term && !r_4491.value.match(term))
          break Fail27474;
      x_4491 = term;
      z_4491 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, z_4491, generator.const7487, s_4491.value);
      if(term == null)
        break Fail27474;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27474;
      q_4491 = term.getSubterm(0);
      v_4491 = term.getSubterm(1);
      u_4491 = term.getSubterm(2);
      term = q_4491;
      lifted10173 lifted101730 = new lifted10173();
      lifted101730.r_4491 = r_4491;
      lifted101730.s_4491 = s_4491;
      lifted101730.t_4491 = t_4491;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101730);
      if(term == null)
        break Fail27474;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27474;
      term = hashtable_put_0_2.instance.invoke(context, u_4491, v_4491, term);
      if(term == null)
        break Fail27474;
      term = x_4491;
      if(t_4491.value == null)
        break Fail27474;
      term = t_4491.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}