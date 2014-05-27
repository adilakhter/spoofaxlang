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

@SuppressWarnings("all") final class lifted9146 extends Strategy 
{ 
  TermReference f_4240;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28902:
    { 
      IStrategoTerm j_4240 = null;
      IStrategoTerm k_4240 = null;
      k_4240 = term;
      j_4240 = term;
      term = k_4240;
      if(f_4240.value == null)
        break Fail28902;
      term = termFactory.makeTuple(f_4240.value, j_4240);
      term = cycle_error_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28902;
      if(true)
        return term;
    }
    return null;
  }
}