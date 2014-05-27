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

@SuppressWarnings("all") public class once_$Is$Reserved$Class$Name_0_0 extends Strategy 
{ 
  public static once_$Is$Reserved$Class$Name_0_0 instance = new once_$Is$Reserved$Class$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsReservedClassName_0_0");
    Fail27210:
    { 
      IStrategoTerm q_4447 = null;
      TermReference r_4447 = new TermReference();
      TermReference s_4447 = new TermReference();
      TermReference t_4447 = new TermReference();
      IStrategoTerm u_4447 = null;
      IStrategoTerm v_4447 = null;
      IStrategoTerm x_4447 = null;
      IStrategoTerm z_4447 = null;
      if(s_4447.value == null)
        s_4447.value = term;
      else
        if(s_4447.value != term && !s_4447.value.match(term))
          break Fail27210;
      if(r_4447.value == null)
        r_4447.value = term;
      else
        if(r_4447.value != term && !r_4447.value.match(term))
          break Fail27210;
      x_4447 = term;
      z_4447 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, z_4447, generator.const7167, s_4447.value);
      if(term == null)
        break Fail27210;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27210;
      q_4447 = term.getSubterm(0);
      v_4447 = term.getSubterm(1);
      u_4447 = term.getSubterm(2);
      term = q_4447;
      lifted10083 lifted100830 = new lifted10083();
      lifted100830.r_4447 = r_4447;
      lifted100830.s_4447 = s_4447;
      lifted100830.t_4447 = t_4447;
      term = split_fetch_1_0.instance.invoke(context, term, lifted100830);
      if(term == null)
        break Fail27210;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27210;
      term = hashtable_put_0_2.instance.invoke(context, u_4447, v_4447, term);
      if(term == null)
        break Fail27210;
      term = x_4447;
      if(t_4447.value == null)
        break Fail27210;
      term = t_4447.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}