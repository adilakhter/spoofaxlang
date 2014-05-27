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

@SuppressWarnings("all") final class lifted9322 extends Strategy 
{ 
  TermReference e_4283;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28732:
    { 
      TermReference g_4283 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail28732;
      if(g_4283.value == null)
        g_4283.value = term.getSubterm(0);
      else
        if(g_4283.value != term.getSubterm(0) && !g_4283.value.match(term.getSubterm(0)))
          break Fail28732;
      lifted9324 lifted93240 = new lifted9324();
      lifted93240.g_4283 = g_4283;
      lifted93240.e_4283 = e_4283;
      term = _2_0.instance.invoke(context, term, inc_0_0.instance, lifted93240);
      if(term == null)
        break Fail28732;
      if(true)
        return term;
    }
    return null;
  }
}