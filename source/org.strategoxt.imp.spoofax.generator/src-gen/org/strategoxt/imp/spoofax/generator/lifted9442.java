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

@SuppressWarnings("all") final class lifted9442 extends Strategy 
{ 
  TermReference m_4324;

  TermReference l_4324;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28638:
    { 
      IStrategoTerm n_4324 = null;
      IStrategoTerm o_4324 = null;
      IStrategoTerm q_4324 = null;
      IStrategoTerm r_4324 = null;
      if(m_4324.value == null)
        m_4324.value = term;
      else
        if(m_4324.value != term && !m_4324.value.match(term))
          break Fail28638;
      term = heuristic_rtg_sort_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28638;
      if(l_4324.value == null)
        l_4324.value = term;
      else
        if(l_4324.value != term && !l_4324.value.match(term))
          break Fail28638;
      n_4324 = term;
      q_4324 = term;
      o_4324 = generator.const7480;
      term = q_4324;
      r_4324 = q_4324;
      if(m_4324.value == null)
        break Fail28638;
      term = termFactory.makeTuple(generator.const7481, m_4324.value);
      term = dr_add_rule_0_3.instance.invoke(context, r_4324, o_4324, l_4324.value, term);
      if(term == null)
        break Fail28638;
      term = n_4324;
      if(true)
        return term;
    }
    return null;
  }
}