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

@SuppressWarnings("all") final class lifted9499 extends Strategy 
{ 
  public static final lifted9499 instance = new lifted9499();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28447:
    { 
      IStrategoTerm z_4388 = null;
      IStrategoTerm a_4389 = null;
      IStrategoTerm e_4389 = null;
      IStrategoTerm f_4389 = null;
      IStrategoTerm h_4389 = null;
      IStrategoTerm i_4389 = null;
      IStrategoTerm j_4389 = null;
      z_4388 = term;
      a_4389 = term;
      h_4389 = term;
      e_4389 = generator.const7868;
      i_4389 = h_4389;
      f_4389 = generator.constCons4561;
      j_4389 = i_4389;
      term = termFactory.makeTuple(generator.const7869, a_4389);
      term = dr_set_rule_0_3.instance.invoke(context, j_4389, e_4389, f_4389, term);
      if(term == null)
        break Fail28447;
      term = z_4388;
      if(true)
        return term;
    }
    return null;
  }
}