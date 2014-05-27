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

@SuppressWarnings("all") final class lifted9084 extends Strategy 
{ 
  Strategy p_4233;

  Strategy q_4233;

  Strategy r_4233;

  Strategy s_4233;

  Strategy t_4233;

  Strategy u_4233;

  Strategy v_4233;

  Strategy w_4233;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28951:
    { 
      IStrategoTerm x_4233 = null;
      IStrategoTerm f_4234 = null;
      IStrategoTerm y_4233 = null;
      IStrategoTerm g_4234 = null;
      IStrategoTerm z_4233 = null;
      IStrategoTerm h_4234 = null;
      IStrategoTerm a_4234 = null;
      IStrategoTerm i_4234 = null;
      IStrategoTerm b_4234 = null;
      IStrategoTerm j_4234 = null;
      IStrategoTerm c_4234 = null;
      IStrategoTerm k_4234 = null;
      IStrategoTerm d_4234 = null;
      IStrategoTerm l_4234 = null;
      f_4234 = term;
      term = as_string_1_0.instance.invoke(context, term, p_4233);
      if(term == null)
        break Fail28951;
      x_4233 = term;
      term = f_4234;
      g_4234 = f_4234;
      term = as_string_1_0.instance.invoke(context, term, q_4233);
      if(term == null)
        break Fail28951;
      y_4233 = term;
      term = g_4234;
      h_4234 = g_4234;
      term = as_string_1_0.instance.invoke(context, term, r_4233);
      if(term == null)
        break Fail28951;
      z_4233 = term;
      term = h_4234;
      i_4234 = h_4234;
      term = as_string_1_0.instance.invoke(context, term, s_4233);
      if(term == null)
        break Fail28951;
      a_4234 = term;
      term = i_4234;
      j_4234 = i_4234;
      term = as_string_1_0.instance.invoke(context, term, t_4233);
      if(term == null)
        break Fail28951;
      b_4234 = term;
      term = j_4234;
      k_4234 = j_4234;
      term = as_string_1_0.instance.invoke(context, term, u_4233);
      if(term == null)
        break Fail28951;
      c_4234 = term;
      term = k_4234;
      l_4234 = k_4234;
      term = as_string_1_0.instance.invoke(context, term, v_4233);
      if(term == null)
        break Fail28951;
      d_4234 = term;
      term = l_4234;
      term = as_string_1_0.instance.invoke(context, term, w_4233);
      if(term == null)
        break Fail28951;
      term = (IStrategoTerm)termFactory.makeListCons(x_4233, termFactory.makeListCons(y_4233, termFactory.makeListCons(z_4233, termFactory.makeListCons(a_4234, termFactory.makeListCons(b_4234, termFactory.makeListCons(c_4234, termFactory.makeListCons(d_4234, termFactory.makeListCons(term, (IStrategoList)generator.constNil7))))))));
      term = verbose_msg_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28951;
      if(true)
        return term;
    }
    return null;
  }
}