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

@SuppressWarnings("all") final class lifted10159 extends Strategy 
{ 
  public static final lifted10159 instance = new lifted10159();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27883:
    { 
      IStrategoTerm p_4485 = null;
      IStrategoTerm y_4485 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27883;
      y_4485 = term.getSubterm(0);
      IStrategoTerm arg6607 = term.getSubterm(1);
      p_4485 = arg6607;
      term = aux_$Follow$Visited_0_2.instance.invoke(context, y_4485, arg6607, p_4485);
      if(term == null)
        break Fail27883;
      if(true)
        return term;
    }
    return null;
  }
}