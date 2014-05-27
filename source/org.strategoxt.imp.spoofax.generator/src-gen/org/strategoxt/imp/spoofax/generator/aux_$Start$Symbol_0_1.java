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

@SuppressWarnings("all") public class aux_$Start$Symbol_0_1 extends Strategy 
{ 
  public static aux_$Start$Symbol_0_1 instance = new aux_$Start$Symbol_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_4465)
  { 
    Fail27320:
    { 
      IStrategoTerm x_4465 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27320;
      IStrategoTerm arg6588 = term.getSubterm(0);
      if(arg6588.getTermType() != IStrategoTerm.STRING || !"240597".equals(((IStrategoString)arg6588).stringValue()))
        break Fail27320;
      x_4465 = term.getSubterm(1);
      term = x_4465;
      if(true)
        return term;
    }
    context.push("aux_StartSymbol_0_1");
    context.popOnFailure();
    return null;
  }
}