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

@SuppressWarnings("all") public class bigchain_$Collect$All$Visited_0_0 extends Strategy 
{ 
  public static bigchain_$Collect$All$Visited_0_0 instance = new bigchain_$Collect$All$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_CollectAllVisited_0_0");
    Fail27416:
    { 
      IStrategoTerm j_4482 = null;
      IStrategoTerm m_4482 = null;
      IStrategoTerm o_4482 = null;
      j_4482 = term;
      o_4482 = term;
      Success11099:
      { 
        Fail27417:
        { 
          IStrategoTerm q_4482 = null;
          q_4482 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, q_4482, generator.const7483, j_4482);
          if(term == null)
            break Fail27417;
          if(true)
            break Success11099;
        }
        term = generator.constNil7;
      }
      m_4482 = term;
      term = o_4482;
      term = termFactory.makeTuple(m_4482, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10152.instance);
      if(term == null)
        break Fail27416;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}