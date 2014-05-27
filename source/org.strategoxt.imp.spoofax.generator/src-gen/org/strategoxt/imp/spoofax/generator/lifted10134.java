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

@SuppressWarnings("all") final class lifted10134 extends Strategy 
{ 
  public static final lifted10134 instance = new lifted10134();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27908:
    { 
      IStrategoTerm t_4472 = null;
      IStrategoTerm u_4472 = null;
      IStrategoTerm d_4473 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27908;
      d_4473 = term.getSubterm(0);
      IStrategoTerm arg6595 = term.getSubterm(1);
      t_4472 = arg6595;
      if(arg6595.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)arg6595).getConstructor())
        break Fail27908;
      u_4472 = arg6595.getSubterm(0);
      term = aux_$On$Import$Failure_0_2.instance.invoke(context, d_4473, u_4472, t_4472);
      if(term == null)
        break Fail27908;
      if(true)
        return term;
    }
    return null;
  }
}