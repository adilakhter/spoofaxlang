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

@SuppressWarnings("all") public class xtc_parse_sdf2_0_1 extends Strategy 
{ 
  public static xtc_parse_sdf2_0_1 instance = new xtc_parse_sdf2_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_4239)
  { 
    context.push("xtc_parse_sdf2_0_1");
    Fail25584:
    { 
      IStrategoTerm i_4239 = null;
      i_4239 = term;
      term = xtc_sglri_0_2.instance.invoke(context, i_4239, generator.const7053, g_4239);
      if(term == null)
        break Fail25584;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9124.instance, pass_verbose_0_0.instance);
      if(term == null)
        break Fail25584;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}