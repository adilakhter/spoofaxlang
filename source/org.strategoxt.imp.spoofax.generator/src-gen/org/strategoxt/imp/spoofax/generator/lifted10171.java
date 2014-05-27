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

@SuppressWarnings("all") final class lifted10171 extends Strategy 
{ 
  public static final lifted10171 instance = new lifted10171();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27871:
    { 
      IStrategoTerm b_4491 = null;
      IStrategoTerm j_4491 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27871;
      j_4491 = term.getSubterm(0);
      IStrategoTerm arg6615 = term.getSubterm(1);
      b_4491 = arg6615;
      term = aux_$Follow$Success_0_2.instance.invoke(context, j_4491, arg6615, b_4491);
      if(term == null)
        break Fail27871;
      if(true)
        return term;
    }
    return null;
  }
}