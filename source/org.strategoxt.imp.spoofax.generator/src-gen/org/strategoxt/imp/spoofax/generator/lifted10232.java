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

@SuppressWarnings("all") final class lifted10232 extends Strategy 
{ 
  public static final lifted10232 instance = new lifted10232();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27810:
    { 
      IStrategoTerm i_4520 = null;
      IStrategoTerm t_4520 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27810;
      t_4520 = term.getSubterm(0);
      IStrategoTerm arg6647 = term.getSubterm(1);
      i_4520 = arg6647;
      term = aux_$Reset$Files_0_2.instance.invoke(context, t_4520, arg6647, i_4520);
      if(term == null)
        break Fail27810;
      if(true)
        return term;
    }
    return null;
  }
}