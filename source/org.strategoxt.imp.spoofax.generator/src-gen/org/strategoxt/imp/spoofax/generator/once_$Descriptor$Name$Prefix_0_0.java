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

@SuppressWarnings("all") public class once_$Descriptor$Name$Prefix_0_0 extends Strategy 
{ 
  public static once_$Descriptor$Name$Prefix_0_0 instance = new once_$Descriptor$Name$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_DescriptorNamePrefix_0_0");
    Fail27708:
    { 
      IStrategoTerm h_4531 = null;
      TermReference i_4531 = new TermReference();
      TermReference j_4531 = new TermReference();
      IStrategoTerm k_4531 = null;
      IStrategoTerm l_4531 = null;
      IStrategoTerm n_4531 = null;
      IStrategoTerm o_4531 = null;
      IStrategoTerm q_4531 = null;
      IStrategoTerm r_4531 = null;
      if(i_4531.value == null)
        i_4531.value = term;
      else
        if(i_4531.value != term && !i_4531.value.match(term))
          break Fail27708;
      n_4531 = term;
      q_4531 = term;
      o_4531 = generator.const7899;
      r_4531 = q_4531;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, r_4531, o_4531, generator.constCons4561);
      if(term == null)
        break Fail27708;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27708;
      h_4531 = term.getSubterm(0);
      l_4531 = term.getSubterm(1);
      k_4531 = term.getSubterm(2);
      term = h_4531;
      lifted10254 lifted102540 = new lifted10254();
      lifted102540.i_4531 = i_4531;
      lifted102540.j_4531 = j_4531;
      term = split_fetch_1_0.instance.invoke(context, term, lifted102540);
      if(term == null)
        break Fail27708;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27708;
      term = hashtable_put_0_2.instance.invoke(context, k_4531, l_4531, term);
      if(term == null)
        break Fail27708;
      term = n_4531;
      if(j_4531.value == null)
        break Fail27708;
      term = j_4531.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}