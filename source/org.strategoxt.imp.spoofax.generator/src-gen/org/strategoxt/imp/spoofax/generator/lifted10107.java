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

@SuppressWarnings("all") final class lifted10107 extends Strategy 
{ 
  public static final lifted10107 instance = new lifted10107();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27935:
    { 
      IStrategoTerm p_4459 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27935;
      p_4459 = term.getSubterm(0);
      IStrategoTerm arg6581 = term.getSubterm(1);
      term = aux_$Base$Package_0_1.instance.invoke(context, p_4459, arg6581);
      if(term == null)
        break Fail27935;
      if(true)
        return term;
    }
    return null;
  }
}