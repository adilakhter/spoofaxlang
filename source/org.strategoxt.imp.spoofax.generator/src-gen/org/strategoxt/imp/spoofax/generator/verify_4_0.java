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

@SuppressWarnings("all") public class verify_4_0 extends Strategy 
{ 
  public static verify_4_0 instance = new verify_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4235, Strategy o_4235, Strategy p_4235, Strategy q_4235)
  { 
    context.push("verify_4_0");
    Fail25547:
    { 
      lifted9090 lifted90900 = new lifted9090();
      lifted90900.o_4235 = o_4235;
      lifted90900.p_4235 = p_4235;
      lifted90900.q_4235 = q_4235;
      term = verify_2_0.instance.invoke(context, term, n_4235, lifted90900);
      if(term == null)
        break Fail25547;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}