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

@SuppressWarnings("all") final class lifted9502 extends Strategy 
{ 
  public static final lifted9502 instance = new lifted9502();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28444:
    { 
      IStrategoTerm l_4389 = null;
      IStrategoTerm m_4389 = null;
      IStrategoTerm q_4389 = null;
      IStrategoTerm r_4389 = null;
      IStrategoTerm t_4389 = null;
      IStrategoTerm u_4389 = null;
      IStrategoTerm v_4389 = null;
      l_4389 = term;
      m_4389 = term;
      t_4389 = term;
      q_4389 = generator.const7871;
      u_4389 = t_4389;
      r_4389 = generator.constCons4561;
      v_4389 = u_4389;
      term = termFactory.makeTuple(generator.const7872, m_4389);
      term = dr_set_rule_0_3.instance.invoke(context, v_4389, q_4389, r_4389, term);
      if(term == null)
        break Fail28444;
      term = l_4389;
      if(true)
        return term;
    }
    return null;
  }
}