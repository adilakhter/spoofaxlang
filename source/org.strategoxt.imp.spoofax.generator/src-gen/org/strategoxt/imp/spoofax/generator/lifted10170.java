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

@SuppressWarnings("all") final class lifted10170 extends Strategy 
{ 
  public static final lifted10170 instance = new lifted10170();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27872:
    { 
      IStrategoTerm q_4490 = null;
      IStrategoTerm y_4490 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27872;
      y_4490 = term.getSubterm(0);
      IStrategoTerm arg6614 = term.getSubterm(1);
      q_4490 = arg6614;
      term = aux_$Follow$Success_0_2.instance.invoke(context, y_4490, arg6614, q_4490);
      if(term == null)
        break Fail27872;
      if(true)
        return term;
    }
    return null;
  }
}