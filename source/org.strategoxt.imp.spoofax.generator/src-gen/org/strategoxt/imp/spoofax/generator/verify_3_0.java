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

@SuppressWarnings("all") public class verify_3_0 extends Strategy 
{ 
  public static verify_3_0 instance = new verify_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4235, Strategy h_4235, Strategy i_4235)
  { 
    context.push("verify_3_0");
    Fail25546:
    { 
      lifted9089 lifted90890 = new lifted9089();
      lifted90890.h_4235 = h_4235;
      lifted90890.i_4235 = i_4235;
      term = verify_2_0.instance.invoke(context, term, g_4235, lifted90890);
      if(term == null)
        break Fail25546;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}