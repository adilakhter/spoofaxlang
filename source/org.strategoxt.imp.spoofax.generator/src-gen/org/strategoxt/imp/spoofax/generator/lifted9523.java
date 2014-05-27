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

@SuppressWarnings("all") final class lifted9523 extends Strategy 
{ 
  public static final lifted9523 instance = new lifted9523();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28420:
    { 
      IStrategoTerm l_4392 = null;
      IStrategoTerm m_4392 = null;
      IStrategoTerm n_4392 = null;
      IStrategoTerm p_4392 = null;
      IStrategoTerm q_4392 = null;
      IStrategoTerm r_4392 = null;
      l_4392 = term;
      p_4392 = term;
      m_4392 = generator.const7885;
      q_4392 = p_4392;
      n_4392 = generator.constCons4561;
      r_4392 = q_4392;
      term = dr_set_rule_0_3.instance.invoke(context, r_4392, m_4392, n_4392, generator.const7886);
      if(term == null)
        break Fail28420;
      term = l_4392;
      if(true)
        return term;
    }
    return null;
  }
}