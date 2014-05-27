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

@SuppressWarnings("all") final class lifted10051 extends Strategy 
{ 
  public static final lifted10051 instance = new lifted10051();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27991:
    { 
      IStrategoTerm k_4433 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27991;
      k_4433 = term.getSubterm(0);
      IStrategoTerm arg6549 = term.getSubterm(1);
      term = aux_$Input$Dir$Prefix_0_1.instance.invoke(context, k_4433, arg6549);
      if(term == null)
        break Fail27991;
      if(true)
        return term;
    }
    return null;
  }
}