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

@SuppressWarnings("all") final class lifted10088 extends Strategy 
{ 
  public static final lifted10088 instance = new lifted10088();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27954:
    { 
      IStrategoTerm q_4450 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27954;
      q_4450 = term.getSubterm(0);
      IStrategoTerm arg6570 = term.getSubterm(1);
      term = aux_$Main$Descriptor_0_1.instance.invoke(context, q_4450, arg6570);
      if(term == null)
        break Fail27954;
      if(true)
        return term;
    }
    return null;
  }
}