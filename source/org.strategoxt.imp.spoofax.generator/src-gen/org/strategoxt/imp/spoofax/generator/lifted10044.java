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

@SuppressWarnings("all") final class lifted10044 extends Strategy 
{ 
  public static final lifted10044 instance = new lifted10044();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27998:
    { 
      IStrategoTerm a_4430 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27998;
      a_4430 = term.getSubterm(0);
      IStrategoTerm arg6546 = term.getSubterm(1);
      term = aux_$Descriptor$P$P$Table_0_1.instance.invoke(context, a_4430, arg6546);
      if(term == null)
        break Fail27998;
      if(true)
        return term;
    }
    return null;
  }
}