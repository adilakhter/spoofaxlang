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

@SuppressWarnings("all") public class term_at_position_0_1 extends Strategy 
{ 
  public static term_at_position_0_1 instance = new term_at_position_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_4268)
  { 
    context.push("term_at_position_0_1");
    Fail25838:
    { 
      TermReference c_4268 = new TermReference();
      IStrategoTerm d_4268 = null;
      d_4268 = term;
      lifted9265 lifted92650 = new lifted9265();
      lifted92650.c_4268 = c_4268;
      term = at_position_1_1.instance.invoke(context, term, lifted92650, a_4268);
      if(term == null)
        break Fail25838;
      term = d_4268;
      if(c_4268.value == null)
        break Fail25838;
      term = c_4268.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}