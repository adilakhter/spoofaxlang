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

@SuppressWarnings("all") public class once_$Is$Imported_0_0 extends Strategy 
{ 
  public static once_$Is$Imported_0_0 instance = new once_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsImported_0_0");
    Fail27158:
    { 
      IStrategoTerm g_4439 = null;
      TermReference h_4439 = new TermReference();
      TermReference i_4439 = new TermReference();
      TermReference j_4439 = new TermReference();
      IStrategoTerm k_4439 = null;
      IStrategoTerm l_4439 = null;
      IStrategoTerm n_4439 = null;
      IStrategoTerm p_4439 = null;
      if(i_4439.value == null)
        i_4439.value = term;
      else
        if(i_4439.value != term && !i_4439.value.match(term))
          break Fail27158;
      if(h_4439.value == null)
        h_4439.value = term;
      else
        if(h_4439.value != term && !h_4439.value.match(term))
          break Fail27158;
      n_4439 = term;
      p_4439 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, p_4439, generator.const7145, i_4439.value);
      if(term == null)
        break Fail27158;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27158;
      g_4439 = term.getSubterm(0);
      l_4439 = term.getSubterm(1);
      k_4439 = term.getSubterm(2);
      term = g_4439;
      lifted10065 lifted100650 = new lifted10065();
      lifted100650.h_4439 = h_4439;
      lifted100650.i_4439 = i_4439;
      lifted100650.j_4439 = j_4439;
      term = split_fetch_1_0.instance.invoke(context, term, lifted100650);
      if(term == null)
        break Fail27158;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27158;
      term = hashtable_put_0_2.instance.invoke(context, k_4439, l_4439, term);
      if(term == null)
        break Fail27158;
      term = n_4439;
      if(j_4439.value == null)
        break Fail27158;
      term = j_4439.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}