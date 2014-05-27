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

@SuppressWarnings("all") public class reverse_bagof_$Editor$Extensions_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Editor$Extensions_1_0 instance = new reverse_bagof_$Editor$Extensions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4456)
  { 
    context.push("reverse_bagof_EditorExtensions_1_0");
    Fail27263:
    { 
      TermReference m_4456 = new TermReference();
      if(m_4456.value == null)
        m_4456.value = term;
      else
        if(m_4456.value != term && !m_4456.value.match(term))
          break Fail27263;
      Success11056:
      { 
        Fail27264:
        { 
          IStrategoTerm q_4456 = null;
          IStrategoTerm s_4456 = null;
          IStrategoTerm t_4456 = null;
          s_4456 = term;
          q_4456 = generator.const7453;
          t_4456 = s_4456;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4456, q_4456, generator.constCons4561);
          if(term == null)
            break Fail27264;
          if(true)
            break Success11056;
        }
        term = generator.constNil7;
      }
      lifted10102 lifted101020 = new lifted10102();
      lifted101020.m_4456 = m_4456;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101020, o_4456);
      if(term == null)
        break Fail27263;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}