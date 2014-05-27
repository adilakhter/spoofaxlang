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

@SuppressWarnings("all") final class lifted10036 extends Strategy 
{ 
  public static final lifted10036 instance = new lifted10036();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28006:
    { 
      IStrategoTerm a_4426 = null;
      IStrategoTerm i_4426 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28006;
      i_4426 = term.getSubterm(0);
      IStrategoTerm arg6542 = term.getSubterm(1);
      a_4426 = arg6542;
      term = aux_$Imported$From_0_2.instance.invoke(context, i_4426, arg6542, a_4426);
      if(term == null)
        break Fail28006;
      if(true)
        return term;
    }
    return null;
  }
}