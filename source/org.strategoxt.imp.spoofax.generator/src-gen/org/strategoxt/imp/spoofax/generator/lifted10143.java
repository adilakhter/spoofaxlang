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

@SuppressWarnings("all") final class lifted10143 extends Strategy 
{ 
  public static final lifted10143 instance = new lifted10143();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27899:
    { 
      IStrategoTerm h_4478 = null;
      IStrategoTerm p_4478 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27899;
      p_4478 = term.getSubterm(0);
      IStrategoTerm arg6599 = term.getSubterm(1);
      h_4478 = arg6599;
      term = aux_$Productions_0_2.instance.invoke(context, p_4478, arg6599, h_4478);
      if(term == null)
        break Fail27899;
      if(true)
        return term;
    }
    return null;
  }
}