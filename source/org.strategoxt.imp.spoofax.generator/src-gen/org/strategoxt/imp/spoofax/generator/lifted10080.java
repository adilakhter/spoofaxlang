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

@SuppressWarnings("all") final class lifted10080 extends Strategy 
{ 
  public static final lifted10080 instance = new lifted10080();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27962:
    { 
      IStrategoTerm q_4446 = null;
      IStrategoTerm y_4446 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27962;
      y_4446 = term.getSubterm(0);
      IStrategoTerm arg6566 = term.getSubterm(1);
      q_4446 = arg6566;
      term = aux_$Is$Reserved$Class$Name_0_2.instance.invoke(context, y_4446, arg6566, q_4446);
      if(term == null)
        break Fail27962;
      if(true)
        return term;
    }
    return null;
  }
}