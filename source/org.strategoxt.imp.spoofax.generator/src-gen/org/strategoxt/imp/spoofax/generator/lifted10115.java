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

@SuppressWarnings("all") final class lifted10115 extends Strategy 
{ 
  public static final lifted10115 instance = new lifted10115();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27927:
    { 
      IStrategoTerm l_4463 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27927;
      l_4463 = term.getSubterm(0);
      IStrategoTerm arg6585 = term.getSubterm(1);
      term = aux_$Start$Symbol_0_1.instance.invoke(context, l_4463, arg6585);
      if(term == null)
        break Fail27927;
      if(true)
        return term;
    }
    return null;
  }
}