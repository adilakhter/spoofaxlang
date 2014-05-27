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

@SuppressWarnings("all") final class lifted9519 extends Strategy 
{ 
  public static final lifted9519 instance = new lifted9519();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28424:
    { 
      IStrategoTerm x_4391 = null;
      IStrategoTerm y_4391 = null;
      IStrategoTerm e_4392 = null;
      IStrategoTerm f_4392 = null;
      IStrategoTerm h_4392 = null;
      IStrategoTerm i_4392 = null;
      IStrategoTerm j_4392 = null;
      term = parameterized_sort_to_rtg_sort_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28424;
      IStrategoTerm term11144 = term;
      Success11198:
      { 
        Fail28425:
        { 
          IStrategoTerm w_4391 = null;
          w_4391 = term;
          term = is_substring_1_0.instance.invoke(context, term, lifted9520.instance);
          if(term == null)
            break Fail28425;
          term = w_4391;
          { 
            IStrategoTerm b_4392 = null;
            b_4392 = term;
            term = fatal_err_0_1.instance.invoke(context, b_4392, generator.const7883);
            if(term == null)
              break Fail28424;
            if(true)
              break Success11198;
          }
        }
        term = term11144;
      }
      x_4391 = term;
      y_4391 = term;
      h_4392 = term;
      e_4392 = generator.const7443;
      i_4392 = h_4392;
      f_4392 = generator.constCons4561;
      j_4392 = i_4392;
      term = termFactory.makeTuple(generator.const7444, y_4391);
      term = dr_set_rule_0_3.instance.invoke(context, j_4392, e_4392, f_4392, term);
      if(term == null)
        break Fail28424;
      term = x_4391;
      if(true)
        return term;
    }
    return null;
  }
}