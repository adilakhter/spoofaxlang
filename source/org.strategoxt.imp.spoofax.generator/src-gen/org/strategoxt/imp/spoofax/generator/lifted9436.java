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

@SuppressWarnings("all") final class lifted9436 extends Strategy 
{ 
  TermReference q_4320;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28642:
    { 
      IStrategoTerm r_4320 = null;
      IStrategoTerm t_4320 = null;
      IStrategoTerm u_4320 = null;
      t_4320 = term;
      r_4320 = generator.constCritical0;
      u_4320 = t_4320;
      term = log_0_3.instance.invoke(context, u_4320, r_4320, generator.const7465, q_4320.value);
      if(term == null)
        break Fail28642;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28642;
      if(true)
        return term;
    }
    return null;
  }
}