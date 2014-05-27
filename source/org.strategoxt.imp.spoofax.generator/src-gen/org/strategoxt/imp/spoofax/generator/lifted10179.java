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

@SuppressWarnings("all") final class lifted10179 extends Strategy 
{ 
  public static final lifted10179 instance = new lifted10179();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27863:
    { 
      IStrategoTerm t_4494 = null;
      IStrategoTerm b_4495 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27863;
      b_4495 = term.getSubterm(0);
      IStrategoTerm arg6619 = term.getSubterm(1);
      t_4494 = arg6619;
      term = aux_$Production$Visited_0_2.instance.invoke(context, b_4495, arg6619, t_4494);
      if(term == null)
        break Fail27863;
      if(true)
        return term;
    }
    return null;
  }
}