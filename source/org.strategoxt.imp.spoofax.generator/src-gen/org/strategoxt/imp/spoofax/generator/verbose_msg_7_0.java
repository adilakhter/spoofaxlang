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

@SuppressWarnings("all") public class verbose_msg_7_0 extends Strategy 
{ 
  public static verbose_msg_7_0 instance = new verbose_msg_7_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4232, Strategy u_4232, Strategy v_4232, Strategy w_4232, Strategy x_4232, Strategy y_4232, Strategy z_4232)
  { 
    context.push("verbose_msg_7_0");
    Fail25535:
    { 
      IStrategoTerm s_4232 = null;
      s_4232 = term;
      lifted9083 lifted90830 = new lifted9083();
      lifted90830.t_4232 = t_4232;
      lifted90830.u_4232 = u_4232;
      lifted90830.v_4232 = v_4232;
      lifted90830.w_4232 = w_4232;
      lifted90830.x_4232 = x_4232;
      lifted90830.y_4232 = y_4232;
      lifted90830.z_4232 = z_4232;
      term = if_verbose2_1_0.instance.invoke(context, term, lifted90830);
      if(term == null)
        break Fail25535;
      term = s_4232;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 7 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5], sargs[6]);
  }
}