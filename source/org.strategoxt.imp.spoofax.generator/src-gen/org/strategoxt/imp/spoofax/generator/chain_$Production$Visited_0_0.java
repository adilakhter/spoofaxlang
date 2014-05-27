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

@SuppressWarnings("all") public class chain_$Production$Visited_0_0 extends Strategy 
{ 
  public static chain_$Production$Visited_0_0 instance = new chain_$Production$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_ProductionVisited_0_0");
    Fail27496:
    { 
      IStrategoTerm d_4495 = null;
      IStrategoTerm g_4495 = null;
      IStrategoTerm i_4495 = null;
      d_4495 = term;
      i_4495 = term;
      Success11121:
      { 
        Fail27497:
        { 
          IStrategoTerm k_4495 = null;
          k_4495 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4495, generator.const7489, d_4495);
          if(term == null)
            break Fail27497;
          if(true)
            break Success11121;
        }
        term = generator.constNil7;
      }
      g_4495 = term;
      term = i_4495;
      term = termFactory.makeTuple(g_4495, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10180.instance);
      if(term == null)
        break Fail27496;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}