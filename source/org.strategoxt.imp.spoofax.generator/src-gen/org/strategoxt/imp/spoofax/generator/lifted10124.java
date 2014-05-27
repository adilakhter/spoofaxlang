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

@SuppressWarnings("all") final class lifted10124 extends Strategy 
{ 
  public static final lifted10124 instance = new lifted10124();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27918:
    { 
      IStrategoTerm l_4467 = null;
      IStrategoTerm w_4467 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27918;
      w_4467 = term.getSubterm(0);
      IStrategoTerm arg6590 = term.getSubterm(1);
      l_4467 = arg6590;
      term = aux_$No$Existing$Descriptor_0_2.instance.invoke(context, w_4467, arg6590, l_4467);
      if(term == null)
        break Fail27918;
      if(true)
        return term;
    }
    return null;
  }
}