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

@SuppressWarnings("all") public class sdf_main_module_option_1_0 extends Strategy 
{ 
  public static sdf_main_module_option_1_0 instance = new sdf_main_module_option_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4219)
  { 
    context.push("sdf_main_module_option_1_0");
    Fail25448:
    { 
      lifted9002 lifted90020 = new lifted9002();
      lifted90020.u_4219 = u_4219;
      term = $Arg$Option_3_0.instance.invoke(context, term, lifted9000.instance, lifted9001.instance, lifted90020);
      if(term == null)
        break Fail25448;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}