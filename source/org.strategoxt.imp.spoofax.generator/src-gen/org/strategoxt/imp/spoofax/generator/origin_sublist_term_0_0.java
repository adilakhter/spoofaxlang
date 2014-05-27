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

@SuppressWarnings("all") public class origin_sublist_term_0_0 extends Strategy 
{ 
  public static origin_sublist_term_0_0 instance = new origin_sublist_term_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25757:
    { 
      IStrategoTerm v_4257 = null;
      IStrategoTerm x_4257 = null;
      IStrategoTerm y_4257 = null;
      x_4257 = term;
      v_4257 = generator.const7000;
      term = x_4257;
      y_4257 = x_4257;
      term = context.invokePrimitive("SSL_EXT_origin_sublist_term", y_4257, NO_STRATEGIES, new IStrategoTerm[]{v_4257, term});
      if(term == null)
        break Fail25757;
      if(true)
        return term;
    }
    context.push("origin_sublist_term_0_0");
    context.popOnFailure();
    return null;
  }
}