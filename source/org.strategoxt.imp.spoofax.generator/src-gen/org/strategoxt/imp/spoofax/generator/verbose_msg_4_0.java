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

@SuppressWarnings("all") public class verbose_msg_4_0 extends Strategy 
{ 
  public static verbose_msg_4_0 instance = new verbose_msg_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4230, Strategy y_4230, Strategy z_4230, Strategy a_4231)
  { 
    context.push("verbose_msg_4_0");
    Fail25532:
    { 
      IStrategoTerm w_4230 = null;
      w_4230 = term;
      lifted9080 lifted90800 = new lifted9080();
      lifted90800.x_4230 = x_4230;
      lifted90800.y_4230 = y_4230;
      lifted90800.z_4230 = z_4230;
      lifted90800.a_4231 = a_4231;
      term = if_verbose2_1_0.instance.invoke(context, term, lifted90800);
      if(term == null)
        break Fail25532;
      term = w_4230;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}