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

@SuppressWarnings("all") final class lifted9082 extends Strategy 
{ 
  Strategy a_4232;

  Strategy b_4232;

  Strategy c_4232;

  Strategy d_4232;

  Strategy e_4232;

  Strategy f_4232;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28953:
    { 
      IStrategoTerm g_4232 = null;
      IStrategoTerm m_4232 = null;
      IStrategoTerm h_4232 = null;
      IStrategoTerm n_4232 = null;
      IStrategoTerm i_4232 = null;
      IStrategoTerm o_4232 = null;
      IStrategoTerm j_4232 = null;
      IStrategoTerm p_4232 = null;
      IStrategoTerm k_4232 = null;
      IStrategoTerm q_4232 = null;
      m_4232 = term;
      term = as_string_1_0.instance.invoke(context, term, a_4232);
      if(term == null)
        break Fail28953;
      g_4232 = term;
      term = m_4232;
      n_4232 = m_4232;
      term = as_string_1_0.instance.invoke(context, term, b_4232);
      if(term == null)
        break Fail28953;
      h_4232 = term;
      term = n_4232;
      o_4232 = n_4232;
      term = as_string_1_0.instance.invoke(context, term, c_4232);
      if(term == null)
        break Fail28953;
      i_4232 = term;
      term = o_4232;
      p_4232 = o_4232;
      term = as_string_1_0.instance.invoke(context, term, d_4232);
      if(term == null)
        break Fail28953;
      j_4232 = term;
      term = p_4232;
      q_4232 = p_4232;
      term = as_string_1_0.instance.invoke(context, term, e_4232);
      if(term == null)
        break Fail28953;
      k_4232 = term;
      term = q_4232;
      term = as_string_1_0.instance.invoke(context, term, f_4232);
      if(term == null)
        break Fail28953;
      term = (IStrategoTerm)termFactory.makeListCons(g_4232, termFactory.makeListCons(h_4232, termFactory.makeListCons(i_4232, termFactory.makeListCons(j_4232, termFactory.makeListCons(k_4232, termFactory.makeListCons(term, (IStrategoList)generator.constNil7))))));
      term = verbose_msg_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28953;
      if(true)
        return term;
    }
    return null;
  }
}