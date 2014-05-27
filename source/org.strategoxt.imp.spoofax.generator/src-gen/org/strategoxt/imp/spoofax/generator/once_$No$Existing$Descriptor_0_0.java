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

@SuppressWarnings("all") public class once_$No$Existing$Descriptor_0_0 extends Strategy 
{ 
  public static once_$No$Existing$Descriptor_0_0 instance = new once_$No$Existing$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_NoExistingDescriptor_0_0");
    Fail27340:
    { 
      IStrategoTerm f_4469 = null;
      TermReference g_4469 = new TermReference();
      TermReference h_4469 = new TermReference();
      TermReference i_4469 = new TermReference();
      IStrategoTerm j_4469 = null;
      IStrategoTerm k_4469 = null;
      IStrategoTerm m_4469 = null;
      IStrategoTerm n_4469 = null;
      IStrategoTerm p_4469 = null;
      IStrategoTerm q_4469 = null;
      if(h_4469.value == null)
        h_4469.value = term;
      else
        if(h_4469.value != term && !h_4469.value.match(term))
          break Fail27340;
      if(g_4469.value == null)
        g_4469.value = term;
      else
        if(g_4469.value != term && !g_4469.value.match(term))
          break Fail27340;
      m_4469 = term;
      p_4469 = term;
      n_4469 = generator.const7463;
      q_4469 = p_4469;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, q_4469, n_4469, generator.constCons4561);
      if(term == null)
        break Fail27340;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27340;
      f_4469 = term.getSubterm(0);
      k_4469 = term.getSubterm(1);
      j_4469 = term.getSubterm(2);
      term = f_4469;
      lifted10128 lifted101280 = new lifted10128();
      lifted101280.g_4469 = g_4469;
      lifted101280.h_4469 = h_4469;
      lifted101280.i_4469 = i_4469;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101280);
      if(term == null)
        break Fail27340;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27340;
      term = hashtable_put_0_2.instance.invoke(context, j_4469, k_4469, term);
      if(term == null)
        break Fail27340;
      term = m_4469;
      if(i_4469.value == null)
        break Fail27340;
      term = i_4469.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}