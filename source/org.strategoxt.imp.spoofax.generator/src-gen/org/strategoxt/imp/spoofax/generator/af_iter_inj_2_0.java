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

@SuppressWarnings("all") public class af_iter_inj_2_0 extends Strategy 
{ 
  public static af_iter_inj_2_0 instance = new af_iter_inj_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4412, Strategy o_4412)
  { 
    context.push("af_iter_inj_2_0");
    Fail26963:
    { 
      lifted9809 lifted98090 = new lifted9809();
      lifted9802 lifted98020 = new lifted9802();
      lifted98090.o_4412 = o_4412;
      lifted98020.n_4412 = n_4412;
      term = appl_2_0.instance.invoke(context, term, lifted98020, lifted98090);
      if(term == null)
        break Fail26963;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}