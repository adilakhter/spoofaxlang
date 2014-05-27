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

@SuppressWarnings("all") final class lifted10150 extends Strategy 
{ 
  public static final lifted10150 instance = new lifted10150();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27892:
    { 
      IStrategoTerm m_4481 = null;
      IStrategoTerm v_4481 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27892;
      v_4481 = term.getSubterm(0);
      IStrategoTerm arg6602 = term.getSubterm(1);
      m_4481 = arg6602;
      term = aux_$Collect$All$Visited_0_2.instance.invoke(context, v_4481, arg6602, m_4481);
      if(term == null)
        break Fail27892;
      if(true)
        return term;
    }
    return null;
  }
}