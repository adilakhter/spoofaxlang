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

@SuppressWarnings("all") public class origin_equivalent_0_0 extends Strategy 
{ 
  public static origin_equivalent_0_0 instance = new origin_equivalent_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("origin_equivalent_0_0");
    Fail25910:
    { 
      IStrategoTerm i_4277 = null;
      IStrategoTerm j_4277 = null;
      IStrategoTerm k_4277 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25910;
      i_4277 = term.getSubterm(0);
      j_4277 = term.getSubterm(1);
      k_4277 = term;
      Success10258:
      { 
        Fail25911:
        { 
          IStrategoTerm l_4277 = null;
          term = support_sublist_1_0.instance.invoke(context, i_4277, lifted9296.instance);
          if(term == null)
            break Fail25911;
          l_4277 = term;
          term = origin_term_0_0.instance.invoke(context, j_4277);
          if(term == null)
            break Fail25911;
          term = termFactory.makeTuple(l_4277, term);
          term = eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25911;
          if(true)
            break Success10258;
        }
        term = termFactory.makeTuple(i_4277, j_4277);
        term = same_signature_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail25910;
        term = SRTS_all.instance.invoke(context, term, lifted9297.instance);
        if(term == null)
          break Fail25910;
      }
      term = k_4277;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}