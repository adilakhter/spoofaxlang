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

@SuppressWarnings("all") final class lifted9537 extends Strategy 
{ 
  TermReference t_4397;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28406:
    { 
      IStrategoTerm d_4398 = null;
      IStrategoTerm f_4398 = null;
      IStrategoTerm g_4398 = null;
      f_4398 = term;
      d_4398 = generator.constCritical0;
      g_4398 = f_4398;
      term = log_0_3.instance.invoke(context, g_4398, d_4398, generator.const7911, t_4397.value);
      if(term == null)
        break Fail28406;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28406;
      if(true)
        return term;
    }
    return null;
  }
}