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

@SuppressWarnings("all") final class lifted9378 extends Strategy 
{ 
  public static final lifted9378 instance = new lifted9378();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28688:
    { 
      IStrategoTerm l_4308 = null;
      IStrategoTerm m_4308 = null;
      l_4308 = term;
      term = heuristic_child_sorts_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28688;
      term = SRTS_one.instance.invoke(context, term, heuristic_sort_is_list_0_0.instance);
      if(term == null)
        break Fail28688;
      term = l_4308;
      m_4308 = l_4308;
      term = heuristic_production_has_no_same_sort_descendant_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28688;
      term = if_verbose3_1_0.instance.invoke(context, m_4308, lifted9380.instance);
      if(term == null)
        break Fail28688;
      if(true)
        return term;
    }
    return null;
  }
}