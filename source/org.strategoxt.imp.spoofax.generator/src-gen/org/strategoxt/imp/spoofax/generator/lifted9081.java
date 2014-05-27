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

@SuppressWarnings("all") final class lifted9081 extends Strategy 
{ 
  Strategy k_4231;

  Strategy l_4231;

  Strategy m_4231;

  Strategy n_4231;

  Strategy o_4231;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28954:
    { 
      IStrategoTerm p_4231 = null;
      IStrategoTerm u_4231 = null;
      IStrategoTerm q_4231 = null;
      IStrategoTerm v_4231 = null;
      IStrategoTerm r_4231 = null;
      IStrategoTerm w_4231 = null;
      IStrategoTerm s_4231 = null;
      IStrategoTerm x_4231 = null;
      u_4231 = term;
      term = as_string_1_0.instance.invoke(context, term, k_4231);
      if(term == null)
        break Fail28954;
      p_4231 = term;
      term = u_4231;
      v_4231 = u_4231;
      term = as_string_1_0.instance.invoke(context, term, l_4231);
      if(term == null)
        break Fail28954;
      q_4231 = term;
      term = v_4231;
      w_4231 = v_4231;
      term = as_string_1_0.instance.invoke(context, term, m_4231);
      if(term == null)
        break Fail28954;
      r_4231 = term;
      term = w_4231;
      x_4231 = w_4231;
      term = as_string_1_0.instance.invoke(context, term, n_4231);
      if(term == null)
        break Fail28954;
      s_4231 = term;
      term = x_4231;
      term = as_string_1_0.instance.invoke(context, term, o_4231);
      if(term == null)
        break Fail28954;
      term = (IStrategoTerm)termFactory.makeListCons(p_4231, termFactory.makeListCons(q_4231, termFactory.makeListCons(r_4231, termFactory.makeListCons(s_4231, termFactory.makeListCons(term, (IStrategoList)generator.constNil7)))));
      term = verbose_msg_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28954;
      if(true)
        return term;
    }
    return null;
  }
}