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

@SuppressWarnings("all") final class lifted10144 extends Strategy 
{ 
  public static final lifted10144 instance = new lifted10144();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27898:
    { 
      IStrategoTerm s_4478 = null;
      IStrategoTerm a_4479 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail27898;
      a_4479 = term.getSubterm(0);
      IStrategoTerm arg6600 = term.getSubterm(1);
      s_4478 = arg6600;
      term = aux_$Productions_0_2.instance.invoke(context, a_4479, arg6600, s_4478);
      if(term == null)
        break Fail27898;
      if(true)
        return term;
    }
    return null;
  }
}