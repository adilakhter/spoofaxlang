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

@SuppressWarnings("all") public class contains_rtg_1_0 extends Strategy 
{ 
  public static contains_rtg_1_0 instance = new contains_rtg_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4245)
  { 
    context.push("contains_rtg_1_0");
    Fail25676:
    { 
      lifted9188 lifted91880 = new lifted9188();
      lifted91880.r_4245 = r_4245;
      term = fetch_1_0.instance.invoke(context, term, lifted91880);
      if(term == null)
        break Fail25676;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}