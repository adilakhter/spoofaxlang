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

@SuppressWarnings("all") final class lifted10177 extends Strategy 
{ 
  public static final lifted10177 instance = new lifted10177();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27865:
    { 
      IStrategoTerm v_4493 = null;
      IStrategoTerm e_4494 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27865;
      e_4494 = term.getSubterm(0);
      IStrategoTerm arg6617 = term.getSubterm(1);
      v_4493 = arg6617;
      term = aux_$Production$Visited_0_2.instance.invoke(context, e_4494, arg6617, v_4493);
      if(term == null)
        break Fail27865;
      if(true)
        return term;
    }
    return null;
  }
}