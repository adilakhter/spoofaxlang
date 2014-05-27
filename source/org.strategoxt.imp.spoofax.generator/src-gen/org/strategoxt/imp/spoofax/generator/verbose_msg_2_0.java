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

@SuppressWarnings("all") public class verbose_msg_2_0 extends Strategy 
{ 
  public static verbose_msg_2_0 instance = new verbose_msg_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4230, Strategy h_4230)
  { 
    context.push("verbose_msg_2_0");
    Fail25530:
    { 
      IStrategoTerm f_4230 = null;
      f_4230 = term;
      lifted9078 lifted90780 = new lifted9078();
      lifted90780.g_4230 = g_4230;
      lifted90780.h_4230 = h_4230;
      term = if_verbose2_1_0.instance.invoke(context, term, lifted90780);
      if(term == null)
        break Fail25530;
      term = f_4230;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}