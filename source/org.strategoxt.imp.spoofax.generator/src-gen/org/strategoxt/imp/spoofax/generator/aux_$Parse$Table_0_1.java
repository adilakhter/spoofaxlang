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

@SuppressWarnings("all") public class aux_$Parse$Table_0_1 extends Strategy 
{ 
  public static aux_$Parse$Table_0_1 instance = new aux_$Parse$Table_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_4505)
  { 
    Fail27558:
    { 
      IStrategoTerm m_4505 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27558;
      IStrategoTerm arg6631 = term.getSubterm(0);
      if(arg6631.getTermType() != IStrategoTerm.STRING || !"221160".equals(((IStrategoString)arg6631).stringValue()))
        break Fail27558;
      m_4505 = term.getSubterm(1);
      term = m_4505;
      if(true)
        return term;
    }
    context.push("aux_ParseTable_0_1");
    context.popOnFailure();
    return null;
  }
}