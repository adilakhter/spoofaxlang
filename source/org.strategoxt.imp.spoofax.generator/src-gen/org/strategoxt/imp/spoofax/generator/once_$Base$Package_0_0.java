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

@SuppressWarnings("all") public class once_$Base$Package_0_0 extends Strategy 
{ 
  public static once_$Base$Package_0_0 instance = new once_$Base$Package_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_BasePackage_0_0");
    Fail27288:
    { 
      IStrategoTerm i_4460 = null;
      TermReference j_4460 = new TermReference();
      TermReference k_4460 = new TermReference();
      IStrategoTerm l_4460 = null;
      IStrategoTerm m_4460 = null;
      IStrategoTerm o_4460 = null;
      IStrategoTerm p_4460 = null;
      IStrategoTerm r_4460 = null;
      IStrategoTerm s_4460 = null;
      if(j_4460.value == null)
        j_4460.value = term;
      else
        if(j_4460.value != term && !j_4460.value.match(term))
          break Fail27288;
      o_4460 = term;
      r_4460 = term;
      p_4460 = generator.const7448;
      s_4460 = r_4460;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, s_4460, p_4460, generator.constCons4561);
      if(term == null)
        break Fail27288;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27288;
      i_4460 = term.getSubterm(0);
      m_4460 = term.getSubterm(1);
      l_4460 = term.getSubterm(2);
      term = i_4460;
      lifted10110 lifted101100 = new lifted10110();
      lifted101100.j_4460 = j_4460;
      lifted101100.k_4460 = k_4460;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101100);
      if(term == null)
        break Fail27288;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27288;
      term = hashtable_put_0_2.instance.invoke(context, l_4460, m_4460, term);
      if(term == null)
        break Fail27288;
      term = o_4460;
      if(k_4460.value == null)
        break Fail27288;
      term = k_4460.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}