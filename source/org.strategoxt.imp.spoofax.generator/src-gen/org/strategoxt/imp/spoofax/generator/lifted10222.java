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

@SuppressWarnings("all") final class lifted10222 extends Strategy 
{ 
  public static final lifted10222 instance = new lifted10222();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27820:
    { 
      IStrategoTerm a_4515 = null;
      IStrategoTerm l_4515 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27820;
      l_4515 = term.getSubterm(0);
      IStrategoTerm arg6642 = term.getSubterm(1);
      a_4515 = arg6642;
      term = aux_$New$Project_0_2.instance.invoke(context, l_4515, arg6642, a_4515);
      if(term == null)
        break Fail27820;
      if(true)
        return term;
    }
    return null;
  }
}