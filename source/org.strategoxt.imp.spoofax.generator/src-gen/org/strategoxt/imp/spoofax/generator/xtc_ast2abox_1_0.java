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

@SuppressWarnings("all") public class xtc_ast2abox_1_0 extends Strategy 
{ 
  public static xtc_ast2abox_1_0 instance = new xtc_ast2abox_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4237)
  { 
    context.push("xtc_ast2abox_1_0");
    Fail25568:
    { 
      lifted9101 lifted91010 = new lifted9101();
      lifted91010.k_4237 = k_4237;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9100.instance, lifted91010);
      if(term == null)
        break Fail25568;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}