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

@SuppressWarnings("all") final class lifted10024 extends Strategy 
{ 
  public static final lifted10024 instance = new lifted10024();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28018:
    { 
      IStrategoTerm t_4420 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28018;
      t_4420 = term.getSubterm(0);
      IStrategoTerm arg6534 = term.getSubterm(1);
      term = aux_$Pack$S$D$F$Table_0_1.instance.invoke(context, t_4420, arg6534);
      if(term == null)
        break Fail28018;
      if(true)
        return term;
    }
    return null;
  }
}