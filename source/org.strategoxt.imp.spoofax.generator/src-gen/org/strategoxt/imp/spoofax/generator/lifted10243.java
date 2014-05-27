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

@SuppressWarnings("all") final class lifted10243 extends Strategy 
{ 
  public static final lifted10243 instance = new lifted10243();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27799:
    { 
      IStrategoTerm d_4526 = null;
      IStrategoTerm n_4526 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27799;
      n_4526 = term.getSubterm(0);
      IStrategoTerm arg6653 = term.getSubterm(1);
      d_4526 = arg6653;
      term = aux_$Is$Launched$From$Eclipse_0_2.instance.invoke(context, n_4526, arg6653, d_4526);
      if(term == null)
        break Fail27799;
      if(true)
        return term;
    }
    return null;
  }
}