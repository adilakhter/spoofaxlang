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

@SuppressWarnings("all") final class lifted10242 extends Strategy 
{ 
  public static final lifted10242 instance = new lifted10242();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27800:
    { 
      IStrategoTerm q_4525 = null;
      IStrategoTerm a_4526 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27800;
      a_4526 = term.getSubterm(0);
      IStrategoTerm arg6652 = term.getSubterm(1);
      q_4525 = arg6652;
      term = aux_$Is$Launched$From$Eclipse_0_2.instance.invoke(context, a_4526, arg6652, q_4525);
      if(term == null)
        break Fail27800;
      if(true)
        return term;
    }
    return null;
  }
}