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

@SuppressWarnings("all") public class bigfold_$Collect$All$Visited_1_0 extends Strategy 
{ 
  public static bigfold_$Collect$All$Visited_1_0 instance = new bigfold_$Collect$All$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4481)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CollectAllVisited_1_0");
    Fail27412:
    { 
      IStrategoTerm l_4481 = null;
      IStrategoTerm p_4481 = null;
      IStrategoTerm r_4481 = null;
      l_4481 = term;
      r_4481 = term;
      Success11097:
      { 
        Fail27413:
        { 
          IStrategoTerm t_4481 = null;
          t_4481 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, t_4481, generator.const7483, l_4481);
          if(term == null)
            break Fail27413;
          if(true)
            break Success11097;
        }
        term = generator.constNil7;
      }
      p_4481 = term;
      term = r_4481;
      term = termFactory.makeTuple(p_4481, term);
      term = o_4481.invoke(context, term, lifted10150.instance);
      if(term == null)
        break Fail27412;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}