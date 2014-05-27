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

@SuppressWarnings("all") public class support_sublist_1_0 extends Strategy 
{ 
  public static support_sublist_1_0 instance = new support_sublist_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4260)
  { 
    context.push("support_sublist_1_0");
    Fail25789:
    { 
      TermReference o_4260 = new TermReference();
      lifted9243 lifted92430 = new lifted9243();
      lifted92430.o_4260 = o_4260;
      term = try_1_0.instance.invoke(context, term, lifted92430);
      if(term == null)
        break Fail25789;
      IStrategoTerm term10238 = term;
      Success10183:
      { 
        Fail25790:
        { 
          term = origin_sublist_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25790;
          term = p_4260.invoke(context, term);
          if(term == null)
            break Fail25790;
          if(true)
            break Success10183;
        }
        term = p_4260.invoke(context, term10238);
        if(term == null)
          break Fail25789;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}