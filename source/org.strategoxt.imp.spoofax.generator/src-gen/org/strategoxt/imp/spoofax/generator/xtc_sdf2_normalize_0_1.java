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

@SuppressWarnings("all") public class xtc_sdf2_normalize_0_1 extends Strategy 
{ 
  public static xtc_sdf2_normalize_0_1 instance = new xtc_sdf2_normalize_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_4239)
  { 
    TermReference j_4239 = new TermReference(ref_j_4239);
    context.push("xtc_sdf2_normalize_0_1");
    Fail25586:
    { 
      lifted9134 lifted91340 = new lifted9134();
      lifted91340.j_4239 = j_4239;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9133.instance, lifted91340);
      if(term == null)
        break Fail25586;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9135.instance, pass_v_verbose_0_0.instance);
      if(term == null)
        break Fail25586;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9137.instance, pass_verbose_0_0.instance);
      if(term == null)
        break Fail25586;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}