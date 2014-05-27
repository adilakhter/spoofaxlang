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

@SuppressWarnings("all") public class once_$On$Import$Failure_0_0 extends Strategy 
{ 
  public static once_$On$Import$Failure_0_0 instance = new once_$On$Import$Failure_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_OnImportFailure_0_0");
    Fail27366:
    { 
      IStrategoTerm z_4473 = null;
      TermReference a_4474 = new TermReference();
      TermReference b_4474 = new TermReference();
      TermReference c_4474 = new TermReference();
      IStrategoTerm d_4474 = null;
      IStrategoTerm e_4474 = null;
      IStrategoTerm g_4474 = null;
      IStrategoTerm h_4474 = null;
      IStrategoTerm j_4474 = null;
      IStrategoTerm k_4474 = null;
      if(b_4474.value == null)
        b_4474.value = term;
      else
        if(b_4474.value != term && !b_4474.value.match(term))
          break Fail27366;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27366;
      if(a_4474.value == null)
        a_4474.value = term.getSubterm(0);
      else
        if(a_4474.value != term.getSubterm(0) && !a_4474.value.match(term.getSubterm(0)))
          break Fail27366;
      g_4474 = term;
      j_4474 = term;
      h_4474 = generator.const7458;
      k_4474 = j_4474;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, k_4474, h_4474, generator.const7459);
      if(term == null)
        break Fail27366;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail27366;
      z_4473 = term.getSubterm(0);
      e_4474 = term.getSubterm(1);
      d_4474 = term.getSubterm(2);
      term = z_4473;
      lifted10137 lifted101370 = new lifted10137();
      lifted101370.a_4474 = a_4474;
      lifted101370.b_4474 = b_4474;
      lifted101370.c_4474 = c_4474;
      term = split_fetch_1_0.instance.invoke(context, term, lifted101370);
      if(term == null)
        break Fail27366;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail27366;
      term = hashtable_put_0_2.instance.invoke(context, d_4474, e_4474, term);
      if(term == null)
        break Fail27366;
      term = g_4474;
      if(c_4474.value == null)
        break Fail27366;
      term = c_4474.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}