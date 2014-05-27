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

@SuppressWarnings("all") final class lifted10206 extends Strategy 
{ 
  public static final lifted10206 instance = new lifted10206();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27836:
    { 
      IStrategoTerm s_4507 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27836;
      s_4507 = term.getSubterm(0);
      IStrategoTerm arg6634 = term.getSubterm(1);
      term = aux_$Project$Name_0_1.instance.invoke(context, s_4507, arg6634);
      if(term == null)
        break Fail27836;
      if(true)
        return term;
    }
    return null;
  }
}