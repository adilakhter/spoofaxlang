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

@SuppressWarnings("all") public class xtc_sglr_1_0 extends Strategy 
{ 
  public static xtc_sglr_1_0 instance = new xtc_sglr_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4237)
  { 
    context.push("xtc_sglr_1_0");
    Fail25572:
    { 
      lifted9109 lifted91090 = new lifted9109();
      lifted91090.w_4237 = w_4237;
      term = xtc_transform_2_0.instance.invoke(context, term, lifted9108.instance, lifted91090);
      if(term == null)
        break Fail25572;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}