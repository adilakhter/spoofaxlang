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

@SuppressWarnings("all") final class lifted9225 extends Strategy 
{ 
  TermReference p_4684;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28823:
    { 
      IStrategoTerm q_4684 = null;
      IStrategoTerm r_4684 = null;
      r_4684 = term;
      q_4684 = term;
      term = r_4684;
      if(p_4684.value == null)
        break Fail28823;
      term = context.invokePrimitive("SSL_EXT_origin_equal", term, NO_STRATEGIES, new IStrategoTerm[]{q_4684, p_4684.value});
      if(term == null)
        break Fail28823;
      if(true)
        return term;
    }
    return null;
  }
}