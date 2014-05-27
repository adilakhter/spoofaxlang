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

@SuppressWarnings("all") final class lifted10033 extends Strategy 
{ 
  public static final lifted10033 instance = new lifted10033();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28009:
    { 
      IStrategoTerm r_4424 = null;
      IStrategoTerm a_4425 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28009;
      a_4425 = term.getSubterm(0);
      IStrategoTerm arg6539 = term.getSubterm(1);
      r_4424 = arg6539;
      term = aux_$Imported$From_0_2.instance.invoke(context, a_4425, arg6539, r_4424);
      if(term == null)
        break Fail28009;
      if(true)
        return term;
    }
    return null;
  }
}