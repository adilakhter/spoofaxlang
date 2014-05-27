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

@SuppressWarnings("all") public class verbose_msg_8_0 extends Strategy 
{ 
  public static verbose_msg_8_0 instance = new verbose_msg_8_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4233, Strategy q_4233, Strategy r_4233, Strategy s_4233, Strategy t_4233, Strategy u_4233, Strategy v_4233, Strategy w_4233)
  { 
    context.push("verbose_msg_8_0");
    Fail25536:
    { 
      IStrategoTerm o_4233 = null;
      o_4233 = term;
      lifted9084 lifted90840 = new lifted9084();
      lifted90840.p_4233 = p_4233;
      lifted90840.q_4233 = q_4233;
      lifted90840.r_4233 = r_4233;
      lifted90840.s_4233 = s_4233;
      lifted90840.t_4233 = t_4233;
      lifted90840.u_4233 = u_4233;
      lifted90840.v_4233 = v_4233;
      lifted90840.w_4233 = w_4233;
      term = if_verbose2_1_0.instance.invoke(context, term, lifted90840);
      if(term == null)
        break Fail25536;
      term = o_4233;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 8 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5], sargs[6], sargs[7]);
  }
}