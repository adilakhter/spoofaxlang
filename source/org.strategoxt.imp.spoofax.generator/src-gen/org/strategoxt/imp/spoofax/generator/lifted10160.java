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

@SuppressWarnings("all") final class lifted10160 extends Strategy 
{ 
  public static final lifted10160 instance = new lifted10160();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27882:
    { 
      IStrategoTerm b_4486 = null;
      IStrategoTerm k_4486 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27882;
      k_4486 = term.getSubterm(0);
      IStrategoTerm arg6608 = term.getSubterm(1);
      b_4486 = arg6608;
      term = aux_$Follow$Visited_0_2.instance.invoke(context, k_4486, arg6608, b_4486);
      if(term == null)
        break Fail27882;
      if(true)
        return term;
    }
    return null;
  }
}