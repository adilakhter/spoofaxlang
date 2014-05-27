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

@SuppressWarnings("all") final class lifted9526 extends Strategy 
{ 
  public static final lifted9526 instance = new lifted9526();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28416:
    { 
      IStrategoTerm t_4392 = null;
      IStrategoTerm u_4392 = null;
      IStrategoTerm v_4392 = null;
      IStrategoTerm x_4392 = null;
      IStrategoTerm y_4392 = null;
      IStrategoTerm z_4392 = null;
      t_4392 = term;
      x_4392 = term;
      u_4392 = generator.const7888;
      y_4392 = x_4392;
      v_4392 = generator.constCons4561;
      z_4392 = y_4392;
      term = dr_set_rule_0_3.instance.invoke(context, z_4392, u_4392, v_4392, generator.const7889);
      if(term == null)
        break Fail28416;
      term = t_4392;
      if(true)
        return term;
    }
    return null;
  }
}