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

@SuppressWarnings("all") public class once_$Input$Dir$Prefix_0_0 extends Strategy 
{ 
  public static once_$Input$Dir$Prefix_0_0 instance = new once_$Input$Dir$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_InputDirPrefix_0_0");
    Fail27132:
    { 
      IStrategoTerm a_4435 = null;
      TermReference b_4435 = new TermReference();
      TermReference c_4435 = new TermReference();
      IStrategoTerm d_4435 = null;
      IStrategoTerm e_4435 = null;
      IStrategoTerm g_4435 = null;
      IStrategoTerm h_4435 = null;
      IStrategoTerm j_4435 = null;
      IStrategoTerm k_4435 = null;
      if(b_4435.value == null)
        b_4435.value = term;
      else
        if(b_4435.value != term && !b_4435.value.match(term))
          break Fail27132;
      g_4435 = term;
      j_4435 = term;
      h_4435 = generator.const7147;
      k_4435 = j_4435;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, k_4435, h_4435, generator.constCons4561);
      if(term == null)
        break Fail27132;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27132;
      a_4435 = term.getSubterm(0);
      e_4435 = term.getSubterm(1);
      d_4435 = term.getSubterm(2);
      term = a_4435;
      lifted10056 lifted100560 = new lifted10056();
      lifted100560.b_4435 = b_4435;
      lifted100560.c_4435 = c_4435;
      term = split_fetch_1_0.instance.invoke(context, term, lifted100560);
      if(term == null)
        break Fail27132;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27132;
      term = hashtable_put_0_2.instance.invoke(context, d_4435, e_4435, term);
      if(term == null)
        break Fail27132;
      term = g_4435;
      if(c_4435.value == null)
        break Fail27132;
      term = c_4435.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}