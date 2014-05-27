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

@SuppressWarnings("all") final class lifted10233 extends Strategy 
{ 
  public static final lifted10233 instance = new lifted10233();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27809:
    { 
      IStrategoTerm w_4520 = null;
      IStrategoTerm g_4521 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27809;
      g_4521 = term.getSubterm(0);
      IStrategoTerm arg6648 = term.getSubterm(1);
      w_4520 = arg6648;
      term = aux_$Reset$Files_0_2.instance.invoke(context, g_4521, arg6648, w_4520);
      if(term == null)
        break Fail27809;
      if(true)
        return term;
    }
    return null;
  }
}