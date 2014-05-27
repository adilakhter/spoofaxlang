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

@SuppressWarnings("all") public class fold_$Production$Visited_1_0 extends Strategy 
{ 
  public static fold_$Production$Visited_1_0 instance = new fold_$Production$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4494)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ProductionVisited_1_0");
    Fail27492:
    { 
      IStrategoTerm g_4494 = null;
      IStrategoTerm k_4494 = null;
      IStrategoTerm m_4494 = null;
      g_4494 = term;
      m_4494 = term;
      Success11119:
      { 
        Fail27493:
        { 
          IStrategoTerm o_4494 = null;
          o_4494 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_4494, generator.const7489, g_4494);
          if(term == null)
            break Fail27493;
          if(true)
            break Success11119;
        }
        term = generator.constNil7;
      }
      k_4494 = term;
      term = m_4494;
      term = termFactory.makeTuple(k_4494, term);
      term = j_4494.invoke(context, term, lifted10178.instance);
      if(term == null)
        break Fail27492;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}