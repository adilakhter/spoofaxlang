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

@SuppressWarnings("all") public class origin_sourcetext_0_0 extends Strategy 
{ 
  public static origin_sourcetext_0_0 instance = new origin_sourcetext_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25779:
    { 
      IStrategoTerm f_4259 = null;
      f_4259 = term;
      term = context.invokePrimitive("SSL_EXT_origin_sourcetext", f_4259, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail25779;
      if(true)
        return term;
    }
    context.push("origin_sourcetext_0_0");
    context.popOnFailure();
    return null;
  }
}