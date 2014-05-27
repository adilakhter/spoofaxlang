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

@SuppressWarnings("all") public class once_$Parse$Table_0_0 extends Strategy 
{ 
  public static once_$Parse$Table_0_0 instance = new once_$Parse$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_ParseTable_0_0");
    Fail27552:
    { 
      IStrategoTerm e_4504 = null;
      TermReference f_4504 = new TermReference();
      TermReference g_4504 = new TermReference();
      IStrategoTerm h_4504 = null;
      IStrategoTerm i_4504 = null;
      IStrategoTerm k_4504 = null;
      IStrategoTerm l_4504 = null;
      IStrategoTerm n_4504 = null;
      IStrategoTerm o_4504 = null;
      if(f_4504.value == null)
        f_4504.value = term;
      else
        if(f_4504.value != term && !f_4504.value.match(term))
          break Fail27552;
      k_4504 = term;
      n_4504 = term;
      l_4504 = generator.const7871;
      o_4504 = n_4504;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, o_4504, l_4504, generator.constCons4561);
      if(term == null)
        break Fail27552;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27552;
      e_4504 = term.getSubterm(0);
      i_4504 = term.getSubterm(1);
      h_4504 = term.getSubterm(2);
      term = e_4504;
      lifted10200 lifted102000 = new lifted10200();
      lifted102000.f_4504 = f_4504;
      lifted102000.g_4504 = g_4504;
      term = split_fetch_1_0.instance.invoke(context, term, lifted102000);
      if(term == null)
        break Fail27552;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27552;
      term = hashtable_put_0_2.instance.invoke(context, h_4504, i_4504, term);
      if(term == null)
        break Fail27552;
      term = k_4504;
      if(g_4504.value == null)
        break Fail27552;
      term = g_4504.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}