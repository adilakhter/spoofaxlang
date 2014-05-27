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

@SuppressWarnings("all") public class once_$Collect$All$Visited_0_0 extends Strategy 
{ 
  public static once_$Collect$All$Visited_0_0 instance = new once_$Collect$All$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CollectAllVisited_0_0");
    Fail27422:
    { 
      IStrategoTerm k_4483 = null;
      TermReference l_4483 = new TermReference();
      TermReference m_4483 = new TermReference();
      TermReference n_4483 = new TermReference();
      IStrategoTerm o_4483 = null;
      IStrategoTerm p_4483 = null;
      IStrategoTerm r_4483 = null;
      IStrategoTerm t_4483 = null;
      if(m_4483.value == null)
        m_4483.value = term;
      else
        if(m_4483.value != term && !m_4483.value.match(term))
          break Fail27422;
      if(l_4483.value == null)
        l_4483.value = term;
      else
        if(l_4483.value != term && !l_4483.value.match(term))
          break Fail27422;
      r_4483 = term;
      t_4483 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, t_4483, generator.const7483, m_4483.value);
      if(term == null)
        break Fail27422;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27422;
      k_4483 = term.getSubterm(0);
      p_4483 = term.getSubterm(1);
      o_4483 = term.getSubterm(2);
      term = k_4483;
      lifted10155 lifted101550 = new lifted10155();
      lifted101550.l_4483 = l_4483;
      lifted101550.m_4483 = m_4483;
      lifted101550.n_4483 = n_4483;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101550);
      if(term == null)
        break Fail27422;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27422;
      term = hashtable_put_0_2.instance.invoke(context, o_4483, p_4483, term);
      if(term == null)
        break Fail27422;
      term = r_4483;
      if(n_4483.value == null)
        break Fail27422;
      term = n_4483.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}