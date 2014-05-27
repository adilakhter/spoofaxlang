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

@SuppressWarnings("all") public class aux_$Productions_0_2 extends Strategy 
{ 
  public static aux_$Productions_0_2 instance = new aux_$Productions_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm k_4480, IStrategoTerm l_4480)
  { 
    Fail27402:
    { 
      IStrategoTerm m_4480 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27402;
      IStrategoTerm arg6601 = term.getSubterm(0);
      if(arg6601.getTermType() != IStrategoTerm.STRING || !"-731576".equals(((IStrategoString)arg6601).stringValue()))
        break Fail27402;
      m_4480 = term.getSubterm(1);
      term = m_4480;
      if(true)
        return term;
    }
    context.push("aux_Productions_0_2");
    context.popOnFailure();
    return null;
  }
}