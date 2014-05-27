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

@SuppressWarnings("all") final class lifted10025 extends Strategy 
{ 
  public static final lifted10025 instance = new lifted10025();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28017:
    { 
      IStrategoTerm f_4421 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28017;
      f_4421 = term.getSubterm(0);
      IStrategoTerm arg6535 = term.getSubterm(1);
      term = aux_$Pack$S$D$F$Table_0_1.instance.invoke(context, f_4421, arg6535);
      if(term == null)
        break Fail28017;
      if(true)
        return term;
    }
    return null;
  }
}