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

@SuppressWarnings("all") final class lifted9207 extends Strategy 
{ 
  TermReference k_4253;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28842:
    { 
      IStrategoTerm r_4253 = null;
      IStrategoTerm t_4253 = null;
      IStrategoTerm u_4253 = null;
      t_4253 = term;
      r_4253 = generator.constCritical0;
      u_4253 = t_4253;
      term = log_0_3.instance.invoke(context, u_4253, r_4253, generator.const7129, k_4253.value);
      if(term == null)
        break Fail28842;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28842;
      if(true)
        return term;
    }
    return null;
  }
}