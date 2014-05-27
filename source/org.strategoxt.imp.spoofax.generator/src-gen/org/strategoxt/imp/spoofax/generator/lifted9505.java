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

@SuppressWarnings("all") final class lifted9505 extends Strategy 
{ 
  public static final lifted9505 instance = new lifted9505();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28441:
    { 
      IStrategoTerm x_4389 = null;
      IStrategoTerm y_4389 = null;
      IStrategoTerm c_4390 = null;
      IStrategoTerm d_4390 = null;
      IStrategoTerm f_4390 = null;
      IStrategoTerm g_4390 = null;
      IStrategoTerm h_4390 = null;
      x_4389 = term;
      y_4389 = term;
      f_4390 = term;
      c_4390 = generator.const7453;
      g_4390 = f_4390;
      d_4390 = generator.constCons4561;
      h_4390 = g_4390;
      term = termFactory.makeTuple(generator.const7454, y_4389);
      term = dr_set_rule_0_3.instance.invoke(context, h_4390, c_4390, d_4390, term);
      if(term == null)
        break Fail28441;
      term = x_4389;
      if(true)
        return term;
    }
    return null;
  }
}