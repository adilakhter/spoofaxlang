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

@SuppressWarnings("all") public class origin_textfragment_0_0 extends Strategy 
{ 
  public static origin_textfragment_0_0 instance = new origin_textfragment_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("origin_textfragment_0_0");
    Fail25777:
    { 
      IStrategoTerm t_4258 = null;
      IStrategoTerm u_4258 = null;
      IStrategoTerm v_4258 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail25777;
      t_4258 = term.getSubterm(0);
      u_4258 = term.getSubterm(1);
      v_4258 = term.getSubterm(2);
      term = support_sublist_1_0.instance.invoke(context, v_4258, lifted9242.instance);
      if(term == null)
        break Fail25777;
      term = termFactory.makeTuple(t_4258, u_4258, term);
      term = prim_origin_textfragment_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25777;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}