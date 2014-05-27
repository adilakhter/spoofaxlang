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

@SuppressWarnings("all") public class once_$Pack$S$D$F$Table_0_0 extends Strategy 
{ 
  public static once_$Pack$S$D$F$Table_0_0 instance = new once_$Pack$S$D$F$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_PackSDFTable_0_0");
    Fail27054:
    { 
      IStrategoTerm j_4422 = null;
      TermReference k_4422 = new TermReference();
      TermReference l_4422 = new TermReference();
      IStrategoTerm m_4422 = null;
      IStrategoTerm n_4422 = null;
      IStrategoTerm p_4422 = null;
      IStrategoTerm q_4422 = null;
      IStrategoTerm s_4422 = null;
      IStrategoTerm t_4422 = null;
      if(k_4422.value == null)
        k_4422.value = term;
      else
        if(k_4422.value != term && !k_4422.value.match(term))
          break Fail27054;
      p_4422 = term;
      s_4422 = term;
      q_4422 = generator.const7022;
      t_4422 = s_4422;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, t_4422, q_4422, generator.constCons4561);
      if(term == null)
        break Fail27054;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27054;
      j_4422 = term.getSubterm(0);
      n_4422 = term.getSubterm(1);
      m_4422 = term.getSubterm(2);
      term = j_4422;
      lifted10029 lifted100290 = new lifted10029();
      lifted100290.k_4422 = k_4422;
      lifted100290.l_4422 = l_4422;
      term = split_fetch_1_0.instance.invoke(context, term, lifted100290);
      if(term == null)
        break Fail27054;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27054;
      term = hashtable_put_0_2.instance.invoke(context, m_4422, n_4422, term);
      if(term == null)
        break Fail27054;
      term = p_4422;
      if(l_4422.value == null)
        break Fail27054;
      term = l_4422.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}