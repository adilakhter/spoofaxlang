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

@SuppressWarnings("all") final class lifted10240 extends Strategy 
{ 
  public static final lifted10240 instance = new lifted10240();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27802:
    { 
      IStrategoTerm o_4524 = null;
      IStrategoTerm z_4524 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27802;
      z_4524 = term.getSubterm(0);
      IStrategoTerm arg6650 = term.getSubterm(1);
      o_4524 = arg6650;
      term = aux_$Is$Launched$From$Eclipse_0_2.instance.invoke(context, z_4524, arg6650, o_4524);
      if(term == null)
        break Fail27802;
      if(true)
        return term;
    }
    return null;
  }
}