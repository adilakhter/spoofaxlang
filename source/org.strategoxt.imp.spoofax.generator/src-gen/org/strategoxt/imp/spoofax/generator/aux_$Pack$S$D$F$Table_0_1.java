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

@SuppressWarnings("all") public class aux_$Pack$S$D$F$Table_0_1 extends Strategy 
{ 
  public static aux_$Pack$S$D$F$Table_0_1 instance = new aux_$Pack$S$D$F$Table_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_4423)
  { 
    Fail27060:
    { 
      IStrategoTerm r_4423 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27060;
      IStrategoTerm arg6538 = term.getSubterm(0);
      if(arg6538.getTermType() != IStrategoTerm.STRING || !"225675".equals(((IStrategoString)arg6538).stringValue()))
        break Fail27060;
      r_4423 = term.getSubterm(1);
      term = r_4423;
      if(true)
        return term;
    }
    context.push("aux_PackSDFTable_0_1");
    context.popOnFailure();
    return null;
  }
}