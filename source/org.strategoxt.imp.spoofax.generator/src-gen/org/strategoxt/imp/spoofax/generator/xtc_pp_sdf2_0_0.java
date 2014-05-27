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

@SuppressWarnings("all") public class xtc_pp_sdf2_0_0 extends Strategy 
{ 
  public static xtc_pp_sdf2_0_0 instance = new xtc_pp_sdf2_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("xtc_pp_sdf2_0_0");
    Fail25585:
    { 
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9126.instance, pass_verbose_0_0.instance);
      if(term == null)
        break Fail25585;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9128.instance, pass_verbose_0_0.instance);
      if(term == null)
        break Fail25585;
      term = xtc_ast2abox_1_0.instance.invoke(context, term, lifted9130.instance);
      if(term == null)
        break Fail25585;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9131.instance, pass_verbose_0_0.instance);
      if(term == null)
        break Fail25585;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}