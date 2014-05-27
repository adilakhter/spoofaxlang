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

@SuppressWarnings("all") final class lifted10132 extends Strategy 
{ 
  public static final lifted10132 instance = new lifted10132();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27910:
    { 
      IStrategoTerm r_4471 = null;
      IStrategoTerm s_4471 = null;
      IStrategoTerm c_4472 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27910;
      c_4472 = term.getSubterm(0);
      IStrategoTerm arg6593 = term.getSubterm(1);
      r_4471 = arg6593;
      if(arg6593.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)arg6593).getConstructor())
        break Fail27910;
      s_4471 = arg6593.getSubterm(0);
      term = aux_$On$Import$Failure_0_2.instance.invoke(context, c_4472, s_4471, r_4471);
      if(term == null)
        break Fail27910;
      if(true)
        return term;
    }
    return null;
  }
}