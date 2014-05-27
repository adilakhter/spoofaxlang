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

@SuppressWarnings("all") final class lifted10180 extends Strategy 
{ 
  public static final lifted10180 instance = new lifted10180();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27862:
    { 
      IStrategoTerm e_4495 = null;
      IStrategoTerm m_4495 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27862;
      m_4495 = term.getSubterm(0);
      IStrategoTerm arg6620 = term.getSubterm(1);
      e_4495 = arg6620;
      term = aux_$Production$Visited_0_2.instance.invoke(context, m_4495, arg6620, e_4495);
      if(term == null)
        break Fail27862;
      if(true)
        return term;
    }
    return null;
  }
}