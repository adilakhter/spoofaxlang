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

@SuppressWarnings("all") final class lifted10196 extends Strategy 
{ 
  public static final lifted10196 instance = new lifted10196();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27846:
    { 
      IStrategoTerm a_4503 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27846;
      a_4503 = term.getSubterm(0);
      IStrategoTerm arg6628 = term.getSubterm(1);
      term = aux_$Parse$Table_0_1.instance.invoke(context, a_4503, arg6628);
      if(term == null)
        break Fail27846;
      if(true)
        return term;
    }
    return null;
  }
}