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

@SuppressWarnings("all") final class lifted9083 extends Strategy 
{ 
  Strategy t_4232;

  Strategy u_4232;

  Strategy v_4232;

  Strategy w_4232;

  Strategy x_4232;

  Strategy y_4232;

  Strategy z_4232;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28952:
    { 
      IStrategoTerm a_4233 = null;
      IStrategoTerm h_4233 = null;
      IStrategoTerm b_4233 = null;
      IStrategoTerm i_4233 = null;
      IStrategoTerm c_4233 = null;
      IStrategoTerm j_4233 = null;
      IStrategoTerm d_4233 = null;
      IStrategoTerm k_4233 = null;
      IStrategoTerm e_4233 = null;
      IStrategoTerm l_4233 = null;
      IStrategoTerm f_4233 = null;
      IStrategoTerm m_4233 = null;
      h_4233 = term;
      term = as_string_1_0.instance.invoke(context, term, t_4232);
      if(term == null)
        break Fail28952;
      a_4233 = term;
      term = h_4233;
      i_4233 = h_4233;
      term = as_string_1_0.instance.invoke(context, term, u_4232);
      if(term == null)
        break Fail28952;
      b_4233 = term;
      term = i_4233;
      j_4233 = i_4233;
      term = as_string_1_0.instance.invoke(context, term, v_4232);
      if(term == null)
        break Fail28952;
      c_4233 = term;
      term = j_4233;
      k_4233 = j_4233;
      term = as_string_1_0.instance.invoke(context, term, w_4232);
      if(term == null)
        break Fail28952;
      d_4233 = term;
      term = k_4233;
      l_4233 = k_4233;
      term = as_string_1_0.instance.invoke(context, term, x_4232);
      if(term == null)
        break Fail28952;
      e_4233 = term;
      term = l_4233;
      m_4233 = l_4233;
      term = as_string_1_0.instance.invoke(context, term, y_4232);
      if(term == null)
        break Fail28952;
      f_4233 = term;
      term = m_4233;
      term = as_string_1_0.instance.invoke(context, term, z_4232);
      if(term == null)
        break Fail28952;
      term = (IStrategoTerm)termFactory.makeListCons(a_4233, termFactory.makeListCons(b_4233, termFactory.makeListCons(c_4233, termFactory.makeListCons(d_4233, termFactory.makeListCons(e_4233, termFactory.makeListCons(f_4233, termFactory.makeListCons(term, (IStrategoList)generator.constNil7)))))));
      term = verbose_msg_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28952;
      if(true)
        return term;
    }
    return null;
  }
}