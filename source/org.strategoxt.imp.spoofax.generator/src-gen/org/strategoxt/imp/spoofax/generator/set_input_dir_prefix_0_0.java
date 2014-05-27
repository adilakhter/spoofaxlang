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

@SuppressWarnings("all") public class set_input_dir_prefix_0_0 extends Strategy 
{ 
  public static set_input_dir_prefix_0_0 instance = new set_input_dir_prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("set_input_dir_prefix_0_0");
    Fail25797:
    { 
      IStrategoTerm l_4261 = null;
      IStrategoTerm n_4261 = null;
      IStrategoTerm o_4261 = null;
      IStrategoTerm y_4261 = null;
      IStrategoTerm z_4261 = null;
      IStrategoTerm b_4262 = null;
      IStrategoTerm c_4262 = null;
      IStrategoTerm d_4262 = null;
      l_4261 = term;
      IStrategoTerm term10243 = term;
      Success10188:
      { 
        Fail25798:
        { 
          IStrategoTerm r_4261 = null;
          r_4261 = term;
          term = string_ends_with_0_1.instance.invoke(context, r_4261, generator.const7009);
          if(term == null)
            break Fail25798;
          if(true)
            break Success10188;
        }
        term = term10243;
        TermReference m_4261 = new TermReference();
        if(m_4261.value == null)
          m_4261.value = term;
        else
          if(m_4261.value != term && !m_4261.value.match(term))
            break Fail25797;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail25797;
        lifted9245 lifted92450 = new lifted9245();
        lifted92450.m_4261 = m_4261;
        term = report_failure_1_0.instance.invoke(context, term, lifted92450);
        if(term == null)
          break Fail25797;
      }
      term = l_4261;
      n_4261 = l_4261;
      o_4261 = term;
      b_4262 = term;
      y_4261 = generator.const7147;
      c_4262 = b_4262;
      z_4261 = generator.constCons4561;
      d_4262 = c_4262;
      term = termFactory.makeTuple(generator.const7148, o_4261);
      term = dr_set_rule_0_3.instance.invoke(context, d_4262, y_4261, z_4261, term);
      if(term == null)
        break Fail25797;
      term = n_4261;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}