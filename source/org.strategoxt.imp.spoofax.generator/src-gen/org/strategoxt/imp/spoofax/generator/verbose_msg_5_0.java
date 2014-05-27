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

@SuppressWarnings("all") public class verbose_msg_5_0 extends Strategy 
{ 
  public static verbose_msg_5_0 instance = new verbose_msg_5_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4231, Strategy l_4231, Strategy m_4231, Strategy n_4231, Strategy o_4231)
  { 
    context.push("verbose_msg_5_0");
    Fail25533:
    { 
      IStrategoTerm j_4231 = null;
      j_4231 = term;
      lifted9081 lifted90810 = new lifted9081();
      lifted90810.k_4231 = k_4231;
      lifted90810.l_4231 = l_4231;
      lifted90810.m_4231 = m_4231;
      lifted90810.n_4231 = n_4231;
      lifted90810.o_4231 = o_4231;
      term = if_verbose2_1_0.instance.invoke(context, term, lifted90810);
      if(term == null)
        break Fail25533;
      term = j_4231;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}