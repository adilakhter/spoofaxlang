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

@SuppressWarnings("all") final class l_4326 extends Strategy 
{ 
  Strategy k_4326;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28617:
    { 
      IStrategoTerm g_4326 = null;
      IStrategoTerm h_4326 = null;
      IStrategoTerm q_4326 = null;
      IStrategoTerm s_4326 = null;
      IStrategoTerm t_4326 = null;
      IStrategoTerm term10642 = term;
      Success11338:
      { 
        Fail28618:
        { 
          term = $Follow$Visited_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28618;
          { 
            if(true)
              break Fail28617;
            if(true)
              break Success11338;
          }
        }
        term = term10642;
      }
      g_4326 = term;
      h_4326 = term;
      s_4326 = term;
      q_4326 = generator.const7485;
      t_4326 = s_4326;
      term = termFactory.makeTuple(generator.const7486, g_4326);
      term = dr_set_rule_0_3.instance.invoke(context, t_4326, q_4326, g_4326, term);
      if(term == null)
        break Fail28617;
      term = bagof_$Productions_0_0.instance.invoke(context, h_4326);
      if(term == null)
        break Fail28617;
      IStrategoTerm term10643 = term;
      Success11339:
      { 
        Fail28619:
        { 
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail28619;
          { 
            if(true)
              break Fail28617;
            if(true)
              break Success11339;
          }
        }
        term = term10643;
      }
      lifted9456 lifted94560 = new lifted9456();
      lifted94560.k_4326 = k_4326;
      term = map_1_0.instance.invoke(context, term, lifted94560);
      if(term == null)
        break Fail28617;
      term = $Hd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28617;
      if(true)
        return term;
    }
    return null;
  }
}