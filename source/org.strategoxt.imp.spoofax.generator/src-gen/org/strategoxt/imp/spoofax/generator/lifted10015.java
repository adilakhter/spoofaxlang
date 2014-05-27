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

@SuppressWarnings("all") final class lifted10015 extends Strategy 
{ 
  public static final lifted10015 instance = new lifted10015();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28027:
    { 
      IStrategoTerm h_4416 = null;
      IStrategoTerm q_4416 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28027;
      q_4416 = term.getSubterm(0);
      IStrategoTerm arg6529 = term.getSubterm(1);
      h_4416 = arg6529;
      term = aux_$Source$Path$Name_0_2.instance.invoke(context, q_4416, arg6529, h_4416);
      if(term == null)
        break Fail28027;
      if(true)
        return term;
    }
    return null;
  }
}