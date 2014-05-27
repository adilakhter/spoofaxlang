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

@SuppressWarnings("all") final class i_4327 extends Strategy 
{ 
  TermReference e_4327;

  Strategy i_4327;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28610:
    { 
      IStrategoTerm g_4327 = null;
      IStrategoTerm term10648 = term;
      Success11336:
      { 
        Fail28611:
        { 
          term = $Production$Visited_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28611;
          if(true)
            break Success11336;
        }
        term = term10648;
        IStrategoTerm h_4327 = null;
        IStrategoTerm p_4327 = null;
        IStrategoTerm r_4327 = null;
        IStrategoTerm s_4327 = null;
        g_4327 = term;
        h_4327 = term;
        r_4327 = term;
        p_4327 = generator.const7489;
        s_4327 = r_4327;
        term = termFactory.makeTuple(generator.const7490, g_4327);
        term = dr_set_rule_0_3.instance.invoke(context, s_4327, p_4327, g_4327, term);
        if(term == null)
          break Fail28610;
        term = heuristic_child_sorts_0_0.instance.invoke(context, h_4327);
        if(term == null)
          break Fail28610;
        lifted9461 lifted94610 = new lifted9461();
        lifted94610.e_4327 = e_4327;
        term = list_loop_1_0.instance.invoke(context, term, lifted94610);
        if(term == null)
          break Fail28610;
        lifted9462 lifted94620 = new lifted9462();
        lifted94620.i_4327 = i_4327;
        lifted94620.e_4327 = e_4327;
        term = list_loop_1_0.instance.invoke(context, term, lifted94620);
        if(term == null)
          break Fail28610;
      }
      if(true)
        return term;
    }
    return null;
  }
}