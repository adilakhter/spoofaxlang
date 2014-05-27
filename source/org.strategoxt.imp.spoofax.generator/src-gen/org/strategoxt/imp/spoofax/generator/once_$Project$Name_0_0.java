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

@SuppressWarnings("all") public class once_$Project$Name_0_0 extends Strategy 
{ 
  public static once_$Project$Name_0_0 instance = new once_$Project$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_ProjectName_0_0");
    Fail27578:
    { 
      IStrategoTerm l_4508 = null;
      TermReference m_4508 = new TermReference();
      TermReference n_4508 = new TermReference();
      IStrategoTerm o_4508 = null;
      IStrategoTerm p_4508 = null;
      IStrategoTerm r_4508 = null;
      IStrategoTerm s_4508 = null;
      IStrategoTerm u_4508 = null;
      IStrategoTerm v_4508 = null;
      if(m_4508.value == null)
        m_4508.value = term;
      else
        if(m_4508.value != term && !m_4508.value.match(term))
          break Fail27578;
      r_4508 = term;
      u_4508 = term;
      s_4508 = generator.const7876;
      v_4508 = u_4508;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, v_4508, s_4508, generator.constCons4561);
      if(term == null)
        break Fail27578;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27578;
      l_4508 = term.getSubterm(0);
      p_4508 = term.getSubterm(1);
      o_4508 = term.getSubterm(2);
      term = l_4508;
      lifted10209 lifted102090 = new lifted10209();
      lifted102090.m_4508 = m_4508;
      lifted102090.n_4508 = n_4508;
      term = split_fetch_1_0.instance.invoke(context, term, lifted102090);
      if(term == null)
        break Fail27578;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27578;
      term = hashtable_put_0_2.instance.invoke(context, o_4508, p_4508, term);
      if(term == null)
        break Fail27578;
      term = r_4508;
      if(n_4508.value == null)
        break Fail27578;
      term = n_4508.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}