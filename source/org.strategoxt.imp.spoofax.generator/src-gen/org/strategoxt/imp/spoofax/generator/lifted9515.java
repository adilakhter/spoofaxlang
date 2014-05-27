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

@SuppressWarnings("all") final class lifted9515 extends Strategy 
{ 
  public static final lifted9515 instance = new lifted9515();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28429:
    { 
      IStrategoTerm h_4391 = null;
      IStrategoTerm i_4391 = null;
      IStrategoTerm n_4391 = null;
      IStrategoTerm o_4391 = null;
      IStrategoTerm q_4391 = null;
      IStrategoTerm r_4391 = null;
      IStrategoTerm s_4391 = null;
      h_4391 = term;
      i_4391 = term;
      q_4391 = term;
      n_4391 = generator.const7880;
      r_4391 = q_4391;
      o_4391 = generator.constCons4561;
      s_4391 = r_4391;
      term = termFactory.makeTuple(generator.const7881, i_4391);
      term = dr_set_rule_0_3.instance.invoke(context, s_4391, n_4391, o_4391, term);
      if(term == null)
        break Fail28429;
      term = list_loop_1_0.instance.invoke(context, h_4391, lifted9516.instance);
      if(term == null)
        break Fail28429;
      if(true)
        return term;
    }
    return null;
  }
}