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

@SuppressWarnings("all") public class once_$New$Project_0_0 extends Strategy 
{ 
  public static once_$New$Project_0_0 instance = new once_$New$Project_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_NewProject_0_0");
    Fail27630:
    { 
      IStrategoTerm i_4517 = null;
      TermReference j_4517 = new TermReference();
      TermReference k_4517 = new TermReference();
      TermReference l_4517 = new TermReference();
      IStrategoTerm m_4517 = null;
      IStrategoTerm n_4517 = null;
      IStrategoTerm p_4517 = null;
      IStrategoTerm q_4517 = null;
      IStrategoTerm s_4517 = null;
      IStrategoTerm t_4517 = null;
      if(k_4517.value == null)
        k_4517.value = term;
      else
        if(k_4517.value != term && !k_4517.value.match(term))
          break Fail27630;
      if(j_4517.value == null)
        j_4517.value = term;
      else
        if(j_4517.value != term && !j_4517.value.match(term))
          break Fail27630;
      p_4517 = term;
      s_4517 = term;
      q_4517 = generator.const7885;
      t_4517 = s_4517;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, t_4517, q_4517, generator.constCons4561);
      if(term == null)
        break Fail27630;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27630;
      i_4517 = term.getSubterm(0);
      n_4517 = term.getSubterm(1);
      m_4517 = term.getSubterm(2);
      term = i_4517;
      lifted10227 lifted102270 = new lifted10227();
      lifted102270.j_4517 = j_4517;
      lifted102270.k_4517 = k_4517;
      lifted102270.l_4517 = l_4517;
      term = split_fetch_1_0.instance.invoke(context, term, lifted102270);
      if(term == null)
        break Fail27630;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27630;
      term = hashtable_put_0_2.instance.invoke(context, m_4517, n_4517, term);
      if(term == null)
        break Fail27630;
      term = p_4517;
      if(l_4517.value == null)
        break Fail27630;
      term = l_4517.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}