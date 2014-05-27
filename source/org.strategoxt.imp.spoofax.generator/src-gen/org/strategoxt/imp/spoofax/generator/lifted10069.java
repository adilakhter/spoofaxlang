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

@SuppressWarnings("all") final class lifted10069 extends Strategy 
{ 
  public static final lifted10069 instance = new lifted10069();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27973:
    { 
      IStrategoTerm u_4441 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27973;
      u_4441 = term.getSubterm(0);
      IStrategoTerm arg6559 = term.getSubterm(1);
      term = aux_$Cached$Parse$Table$Descriptor_0_1.instance.invoke(context, u_4441, arg6559);
      if(term == null)
        break Fail27973;
      if(true)
        return term;
    }
    return null;
  }
}