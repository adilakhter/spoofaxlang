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

@SuppressWarnings("all") public class af_conc_4_0 extends Strategy 
{ 
  public static af_conc_4_0 instance = new af_conc_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4412, Strategy q_4412, Strategy r_4412, Strategy s_4412)
  { 
    context.push("af_conc_4_0");
    Fail26964:
    { 
      lifted9812 lifted98120 = new lifted9812();
      lifted9811 lifted98110 = new lifted9811();
      lifted98120.s_4412 = s_4412;
      lifted98120.r_4412 = r_4412;
      lifted98120.q_4412 = q_4412;
      lifted98110.p_4412 = p_4412;
      term = appl_2_0.instance.invoke(context, term, lifted98110, lifted98120);
      if(term == null)
        break Fail26964;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}