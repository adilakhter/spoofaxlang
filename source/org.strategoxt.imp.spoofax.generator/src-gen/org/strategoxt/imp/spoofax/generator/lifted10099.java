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

@SuppressWarnings("all") final class lifted10099 extends Strategy 
{ 
  public static final lifted10099 instance = new lifted10099();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27943:
    { 
      IStrategoTerm t_4455 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27943;
      t_4455 = term.getSubterm(0);
      IStrategoTerm arg6577 = term.getSubterm(1);
      term = aux_$Editor$Extensions_0_1.instance.invoke(context, t_4455, arg6577);
      if(term == null)
        break Fail27943;
      if(true)
        return term;
    }
    return null;
  }
}