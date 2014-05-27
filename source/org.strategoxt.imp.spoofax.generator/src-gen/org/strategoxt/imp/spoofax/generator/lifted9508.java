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

@SuppressWarnings("all") final class lifted9508 extends Strategy 
{ 
  public static final lifted9508 instance = new lifted9508();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28438:
    { 
      IStrategoTerm j_4390 = null;
      IStrategoTerm k_4390 = null;
      IStrategoTerm o_4390 = null;
      IStrategoTerm p_4390 = null;
      IStrategoTerm r_4390 = null;
      IStrategoTerm s_4390 = null;
      IStrategoTerm t_4390 = null;
      j_4390 = term;
      k_4390 = term;
      r_4390 = term;
      o_4390 = generator.const7448;
      s_4390 = r_4390;
      p_4390 = generator.constCons4561;
      t_4390 = s_4390;
      term = termFactory.makeTuple(generator.const7449, k_4390);
      term = dr_set_rule_0_3.instance.invoke(context, t_4390, o_4390, p_4390, term);
      if(term == null)
        break Fail28438;
      term = get_package_name_1_0.instance.invoke(context, j_4390, _Fail.instance);
      if(term == null)
        break Fail28438;
      if(true)
        return term;
    }
    return null;
  }
}