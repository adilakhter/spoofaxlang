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

@SuppressWarnings("all") final class lifted10133 extends Strategy 
{ 
  public static final lifted10133 instance = new lifted10133();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27909:
    { 
      IStrategoTerm f_4472 = null;
      IStrategoTerm g_4472 = null;
      IStrategoTerm q_4472 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27909;
      q_4472 = term.getSubterm(0);
      IStrategoTerm arg6594 = term.getSubterm(1);
      f_4472 = arg6594;
      if(arg6594.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)arg6594).getConstructor())
        break Fail27909;
      g_4472 = arg6594.getSubterm(0);
      term = aux_$On$Import$Failure_0_2.instance.invoke(context, q_4472, g_4472, f_4472);
      if(term == null)
        break Fail27909;
      if(true)
        return term;
    }
    return null;
  }
}