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

@SuppressWarnings("all") final class lifted9283 extends Strategy 
{ 
  public static final lifted9283 instance = new lifted9283();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28771:
    { 
      IStrategoTerm u_4685 = null;
      u_4685 = term;
      term = context.invokePrimitive("SSL_EXT_origin_offset", u_4685, NO_STRATEGIES, new IStrategoTerm[]{term});
      if(term == null)
        break Fail28771;
      if(true)
        return term;
    }
    return null;
  }
}