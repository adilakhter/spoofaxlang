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

@SuppressWarnings("all") final class lifted10234 extends Strategy 
{ 
  public static final lifted10234 instance = new lifted10234();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27808:
    { 
      IStrategoTerm j_4521 = null;
      IStrategoTerm t_4521 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27808;
      t_4521 = term.getSubterm(0);
      IStrategoTerm arg6649 = term.getSubterm(1);
      j_4521 = arg6649;
      term = aux_$Reset$Files_0_2.instance.invoke(context, t_4521, arg6649, j_4521);
      if(term == null)
        break Fail27808;
      if(true)
        return term;
    }
    return null;
  }
}