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

@SuppressWarnings("all") public class aux_$Base$Package_0_1 extends Strategy 
{ 
  public static aux_$Base$Package_0_1 instance = new aux_$Base$Package_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_4461)
  { 
    Fail27294:
    { 
      IStrategoTerm q_4461 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27294;
      IStrategoTerm arg6583 = term.getSubterm(0);
      if(arg6583.getTermType() != IStrategoTerm.STRING || !"-28876".equals(((IStrategoString)arg6583).stringValue()))
        break Fail27294;
      q_4461 = term.getSubterm(1);
      term = q_4461;
      if(true)
        return term;
    }
    context.push("aux_BasePackage_0_1");
    context.popOnFailure();
    return null;
  }
}