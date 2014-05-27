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

@SuppressWarnings("all") public class fold_$Collect$All$Visited_1_0 extends Strategy 
{ 
  public static fold_$Collect$All$Visited_1_0 instance = new fold_$Collect$All$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4482)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CollectAllVisited_1_0");
    Fail27414:
    { 
      IStrategoTerm x_4481 = null;
      IStrategoTerm b_4482 = null;
      IStrategoTerm d_4482 = null;
      x_4481 = term;
      d_4482 = term;
      Success11098:
      { 
        Fail27415:
        { 
          IStrategoTerm f_4482 = null;
          f_4482 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, f_4482, generator.const7483, x_4481);
          if(term == null)
            break Fail27415;
          if(true)
            break Success11098;
        }
        term = generator.constNil7;
      }
      b_4482 = term;
      term = d_4482;
      term = termFactory.makeTuple(b_4482, term);
      term = a_4482.invoke(context, term, lifted10151.instance);
      if(term == null)
        break Fail27414;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}