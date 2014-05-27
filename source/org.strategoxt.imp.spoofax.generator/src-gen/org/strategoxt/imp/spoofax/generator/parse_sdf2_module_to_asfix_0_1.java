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

@SuppressWarnings("all") public class parse_sdf2_module_to_asfix_0_1 extends Strategy 
{ 
  public static parse_sdf2_module_to_asfix_0_1 instance = new parse_sdf2_module_to_asfix_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_4223)
  { 
    TermReference u_4223 = new TermReference(ref_u_4223);
    context.push("parse_sdf2_module_to_asfix_0_1");
    Fail25481:
    { 
      lifted9032 lifted90320 = new lifted9032();
      lifted90320.u_4223 = u_4223;
      term = parse_sdf2_module_to_asfix_1_0.instance.invoke(context, term, lifted90320);
      if(term == null)
        break Fail25481;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}