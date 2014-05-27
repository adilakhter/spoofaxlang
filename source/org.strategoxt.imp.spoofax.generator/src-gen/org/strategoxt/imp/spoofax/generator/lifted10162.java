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

@SuppressWarnings("all") final class lifted10162 extends Strategy 
{ 
  public static final lifted10162 instance = new lifted10162();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27880:
    { 
      IStrategoTerm y_4486 = null;
      IStrategoTerm g_4487 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27880;
      g_4487 = term.getSubterm(0);
      IStrategoTerm arg6610 = term.getSubterm(1);
      y_4486 = arg6610;
      term = aux_$Follow$Visited_0_2.instance.invoke(context, g_4487, arg6610, y_4486);
      if(term == null)
        break Fail27880;
      if(true)
        return term;
    }
    return null;
  }
}