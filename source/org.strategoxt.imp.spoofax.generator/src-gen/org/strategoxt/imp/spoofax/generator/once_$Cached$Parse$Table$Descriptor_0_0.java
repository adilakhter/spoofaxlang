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

@SuppressWarnings("all") public class once_$Cached$Parse$Table$Descriptor_0_0 extends Strategy 
{ 
  public static once_$Cached$Parse$Table$Descriptor_0_0 instance = new once_$Cached$Parse$Table$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CachedParseTableDescriptor_0_0");
    Fail27184:
    { 
      IStrategoTerm k_4443 = null;
      TermReference l_4443 = new TermReference();
      TermReference m_4443 = new TermReference();
      IStrategoTerm n_4443 = null;
      IStrategoTerm o_4443 = null;
      IStrategoTerm q_4443 = null;
      IStrategoTerm r_4443 = null;
      IStrategoTerm t_4443 = null;
      IStrategoTerm u_4443 = null;
      if(l_4443.value == null)
        l_4443.value = term;
      else
        if(l_4443.value != term && !l_4443.value.match(term))
          break Fail27184;
      q_4443 = term;
      t_4443 = term;
      r_4443 = generator.const7154;
      u_4443 = t_4443;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, u_4443, r_4443, generator.constCons4561);
      if(term == null)
        break Fail27184;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27184;
      k_4443 = term.getSubterm(0);
      o_4443 = term.getSubterm(1);
      n_4443 = term.getSubterm(2);
      term = k_4443;
      lifted10074 lifted100740 = new lifted10074();
      lifted100740.l_4443 = l_4443;
      lifted100740.m_4443 = m_4443;
      term = split_fetch_1_0.instance.invoke(context, term, lifted100740);
      if(term == null)
        break Fail27184;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27184;
      term = hashtable_put_0_2.instance.invoke(context, n_4443, o_4443, term);
      if(term == null)
        break Fail27184;
      term = q_4443;
      if(m_4443.value == null)
        break Fail27184;
      term = m_4443.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}