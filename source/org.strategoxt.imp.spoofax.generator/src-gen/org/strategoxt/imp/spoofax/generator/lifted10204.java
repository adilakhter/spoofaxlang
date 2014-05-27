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

@SuppressWarnings("all") final class lifted10204 extends Strategy 
{ 
  public static final lifted10204 instance = new lifted10204();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27838:
    { 
      IStrategoTerm v_4506 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27838;
      v_4506 = term.getSubterm(0);
      IStrategoTerm arg6632 = term.getSubterm(1);
      term = aux_$Project$Name_0_1.instance.invoke(context, v_4506, arg6632);
      if(term == null)
        break Fail27838;
      if(true)
        return term;
    }
    return null;
  }
}