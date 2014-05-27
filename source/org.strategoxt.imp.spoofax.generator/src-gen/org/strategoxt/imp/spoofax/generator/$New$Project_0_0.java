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

@SuppressWarnings("all") public class $New$Project_0_0 extends Strategy 
{ 
  public static $New$Project_0_0 instance = new $New$Project_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("NewProject_0_0");
    Fail27635:
    { 
      TermReference l_4518 = new TermReference();
      TermReference m_4518 = new TermReference();
      IStrategoTerm p_4518 = null;
      IStrategoTerm r_4518 = null;
      IStrategoTerm s_4518 = null;
      if(m_4518.value == null)
        m_4518.value = term;
      else
        if(m_4518.value != term && !m_4518.value.match(term))
          break Fail27635;
      if(l_4518.value == null)
        l_4518.value = term;
      else
        if(l_4518.value != term && !l_4518.value.match(term))
          break Fail27635;
      r_4518 = term;
      p_4518 = generator.const7885;
      s_4518 = r_4518;
      term = dr_lookup_rule_0_2.instance.invoke(context, s_4518, p_4518, generator.constCons4561);
      if(term == null)
        break Fail27635;
      lifted10230 lifted102300 = new lifted10230();
      lifted102300.l_4518 = l_4518;
      lifted102300.m_4518 = m_4518;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted102300);
      if(term == null)
        break Fail27635;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}