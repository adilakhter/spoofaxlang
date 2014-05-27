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

@SuppressWarnings("all") public class once_$Productions_0_0 extends Strategy 
{ 
  public static once_$Productions_0_0 instance = new once_$Productions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_Productions_0_0");
    Fail27396:
    { 
      IStrategoTerm h_4479 = null;
      TermReference i_4479 = new TermReference();
      TermReference j_4479 = new TermReference();
      TermReference k_4479 = new TermReference();
      IStrategoTerm l_4479 = null;
      IStrategoTerm m_4479 = null;
      IStrategoTerm o_4479 = null;
      IStrategoTerm q_4479 = null;
      if(j_4479.value == null)
        j_4479.value = term;
      else
        if(j_4479.value != term && !j_4479.value.match(term))
          break Fail27396;
      if(i_4479.value == null)
        i_4479.value = term;
      else
        if(i_4479.value != term && !i_4479.value.match(term))
          break Fail27396;
      o_4479 = term;
      q_4479 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, q_4479, generator.const7480, j_4479.value);
      if(term == null)
        break Fail27396;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27396;
      h_4479 = term.getSubterm(0);
      m_4479 = term.getSubterm(1);
      l_4479 = term.getSubterm(2);
      term = h_4479;
      lifted10146 lifted101460 = new lifted10146();
      lifted101460.i_4479 = i_4479;
      lifted101460.j_4479 = j_4479;
      lifted101460.k_4479 = k_4479;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101460);
      if(term == null)
        break Fail27396;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27396;
      term = hashtable_put_0_2.instance.invoke(context, l_4479, m_4479, term);
      if(term == null)
        break Fail27396;
      term = o_4479;
      if(k_4479.value == null)
        break Fail27396;
      term = k_4479.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}