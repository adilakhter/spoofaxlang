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

@SuppressWarnings("all") final class lifted9032 extends Strategy 
{ 
  TermReference u_4223;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail29010:
    { 
      IStrategoTerm f_4684 = null;
      IStrategoTerm g_4684 = null;
      IStrategoTerm h_4684 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail29010;
      f_4684 = term.getSubterm(0);
      term = f_4684;
      h_4684 = f_4684;
      g_4684 = term;
      term = h_4684;
      if(u_4223.value == null)
        break Fail29010;
      term = termFactory.makeTuple(g_4684, u_4223.value);
      term = eq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29010;
      if(true)
        return term;
    }
    return null;
  }
}