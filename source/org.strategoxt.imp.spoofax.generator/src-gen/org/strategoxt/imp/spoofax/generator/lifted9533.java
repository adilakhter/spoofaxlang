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

@SuppressWarnings("all") final class lifted9533 extends Strategy 
{ 
  TermReference k_4395;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28409:
    { 
      IStrategoTerm y_4396 = null;
      IStrategoTerm a_4397 = null;
      IStrategoTerm b_4397 = null;
      a_4397 = term;
      y_4396 = generator.constCritical0;
      b_4397 = a_4397;
      term = log_0_3.instance.invoke(context, b_4397, y_4396, generator.const7903, k_4395.value);
      if(term == null)
        break Fail28409;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28409;
      if(true)
        return term;
    }
    return null;
  }
}