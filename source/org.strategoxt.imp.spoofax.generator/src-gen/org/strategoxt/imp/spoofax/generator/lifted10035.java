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

@SuppressWarnings("all") final class lifted10035 extends Strategy 
{ 
  public static final lifted10035 instance = new lifted10035();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28007:
    { 
      IStrategoTerm p_4425 = null;
      IStrategoTerm x_4425 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28007;
      x_4425 = term.getSubterm(0);
      IStrategoTerm arg6541 = term.getSubterm(1);
      p_4425 = arg6541;
      term = aux_$Imported$From_0_2.instance.invoke(context, x_4425, arg6541, p_4425);
      if(term == null)
        break Fail28007;
      if(true)
        return term;
    }
    return null;
  }
}