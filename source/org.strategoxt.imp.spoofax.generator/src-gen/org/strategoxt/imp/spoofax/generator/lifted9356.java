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

@SuppressWarnings("all") final class lifted9356 extends Strategy 
{ 
  TermReference u_4302;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28702:
    { 
      term = heuristic_sort_is_unvisited_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28702;
      if(u_4302.value == null)
        u_4302.value = term;
      else
        if(u_4302.value != term && !u_4302.value.match(term))
          break Fail28702;
      if(true)
        return term;
    }
    return null;
  }
}