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

@SuppressWarnings("all") final class lifted9210 extends Strategy 
{ 
  TermReference f_4254;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28839:
    { 
      IStrategoTerm g_4254 = null;
      IStrategoTerm i_4254 = null;
      IStrategoTerm j_4254 = null;
      i_4254 = term;
      g_4254 = generator.constCritical0;
      j_4254 = i_4254;
      term = log_0_3.instance.invoke(context, j_4254, g_4254, generator.const7133, f_4254.value);
      if(term == null)
        break Fail28839;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28839;
      if(true)
        return term;
    }
    return null;
  }
}