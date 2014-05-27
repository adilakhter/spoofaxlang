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

@SuppressWarnings("all") public class once_$Editor$Extensions_0_0 extends Strategy 
{ 
  public static once_$Editor$Extensions_0_0 instance = new once_$Editor$Extensions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_EditorExtensions_0_0");
    Fail27262:
    { 
      IStrategoTerm b_4456 = null;
      TermReference c_4456 = new TermReference();
      TermReference d_4456 = new TermReference();
      IStrategoTerm e_4456 = null;
      IStrategoTerm f_4456 = null;
      IStrategoTerm h_4456 = null;
      IStrategoTerm i_4456 = null;
      IStrategoTerm k_4456 = null;
      IStrategoTerm l_4456 = null;
      if(c_4456.value == null)
        c_4456.value = term;
      else
        if(c_4456.value != term && !c_4456.value.match(term))
          break Fail27262;
      h_4456 = term;
      k_4456 = term;
      i_4456 = generator.const7453;
      l_4456 = k_4456;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, l_4456, i_4456, generator.constCons4561);
      if(term == null)
        break Fail27262;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27262;
      b_4456 = term.getSubterm(0);
      f_4456 = term.getSubterm(1);
      e_4456 = term.getSubterm(2);
      term = b_4456;
      lifted10101 lifted101010 = new lifted10101();
      lifted101010.c_4456 = c_4456;
      lifted101010.d_4456 = d_4456;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101010);
      if(term == null)
        break Fail27262;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27262;
      term = hashtable_put_0_2.instance.invoke(context, e_4456, f_4456, term);
      if(term == null)
        break Fail27262;
      term = h_4456;
      if(d_4456.value == null)
        break Fail27262;
      term = d_4456.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}