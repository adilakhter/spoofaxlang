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

@SuppressWarnings("all") final class lifted10089 extends Strategy 
{ 
  public static final lifted10089 instance = new lifted10089();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27953:
    { 
      IStrategoTerm b_4451 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27953;
      b_4451 = term.getSubterm(0);
      IStrategoTerm arg6571 = term.getSubterm(1);
      term = aux_$Main$Descriptor_0_1.instance.invoke(context, b_4451, arg6571);
      if(term == null)
        break Fail27953;
      if(true)
        return term;
    }
    return null;
  }
}