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

@SuppressWarnings("all") final class lifted9512 extends Strategy 
{ 
  public static final lifted9512 instance = new lifted9512();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28435:
    { 
      IStrategoTerm v_4390 = null;
      IStrategoTerm w_4390 = null;
      IStrategoTerm a_4391 = null;
      IStrategoTerm b_4391 = null;
      IStrategoTerm d_4391 = null;
      IStrategoTerm e_4391 = null;
      IStrategoTerm f_4391 = null;
      v_4390 = term;
      w_4390 = term;
      d_4391 = term;
      a_4391 = generator.const7876;
      e_4391 = d_4391;
      b_4391 = generator.constCons4561;
      f_4391 = e_4391;
      term = termFactory.makeTuple(generator.const7877, w_4390);
      term = dr_set_rule_0_3.instance.invoke(context, f_4391, a_4391, b_4391, term);
      if(term == null)
        break Fail28435;
      term = v_4390;
      if(true)
        return term;
    }
    return null;
  }
}