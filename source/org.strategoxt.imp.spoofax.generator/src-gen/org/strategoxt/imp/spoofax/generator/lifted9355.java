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

@SuppressWarnings("all") final class lifted9355 extends Strategy 
{ 
  TermReference t_4302;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28703:
    { 
      term = heuristic_sort_is_identifier_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28703;
      if(t_4302.value == null)
        t_4302.value = term;
      else
        if(t_4302.value != term && !t_4302.value.match(term))
          break Fail28703;
      if(true)
        return term;
    }
    return null;
  }
}