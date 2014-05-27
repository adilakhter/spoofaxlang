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

@SuppressWarnings("all") final class lifted10117 extends Strategy 
{ 
  public static final lifted10117 instance = new lifted10117();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27925:
    { 
      IStrategoTerm h_4464 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27925;
      h_4464 = term.getSubterm(0);
      IStrategoTerm arg6587 = term.getSubterm(1);
      term = aux_$Start$Symbol_0_1.instance.invoke(context, h_4464, arg6587);
      if(term == null)
        break Fail27925;
      if(true)
        return term;
    }
    return null;
  }
}