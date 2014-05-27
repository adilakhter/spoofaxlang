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

@SuppressWarnings("all") public class verbose_msg_6_0 extends Strategy 
{ 
  public static verbose_msg_6_0 instance = new verbose_msg_6_0();

  public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4232, Strategy b_4232, Strategy c_4232, Strategy d_4232, Strategy e_4232, Strategy f_4232)
  { 
    context.push("verbose_msg_6_0");
    Fail25534:
    { 
      IStrategoTerm z_4231 = null;
      z_4231 = term;
      lifted9082 lifted90820 = new lifted9082();
      lifted90820.a_4232 = a_4232;
      lifted90820.b_4232 = b_4232;
      lifted90820.c_4232 = c_4232;
      lifted90820.d_4232 = d_4232;
      lifted90820.e_4232 = e_4232;
      lifted90820.f_4232 = f_4232;
      term = if_verbose2_1_0.instance.invoke(context, term, lifted90820);
      if(term == null)
        break Fail25534;
      term = z_4231;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }

  @Override public IStrategoTerm invokeDynamic(Context context, IStrategoTerm term, Strategy[] sargs, IStrategoTerm[] targs)
  { 
    if(sargs == null || targs == null || sargs.length != 6 || targs.length != 0)
      throw new IllegalArgumentException("Illegal arguments for " + getName());
    return invoke(context, term, sargs[0], sargs[1], sargs[2], sargs[3], sargs[4], sargs[5]);
  }
}