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

@SuppressWarnings("all") final class lifted10141 extends Strategy 
{ 
  public static final lifted10141 instance = new lifted10141();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27901:
    { 
      IStrategoTerm j_4477 = null;
      IStrategoTerm s_4477 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27901;
      s_4477 = term.getSubterm(0);
      IStrategoTerm arg6597 = term.getSubterm(1);
      j_4477 = arg6597;
      term = aux_$Productions_0_2.instance.invoke(context, s_4477, arg6597, j_4477);
      if(term == null)
        break Fail27901;
      if(true)
        return term;
    }
    return null;
  }
}