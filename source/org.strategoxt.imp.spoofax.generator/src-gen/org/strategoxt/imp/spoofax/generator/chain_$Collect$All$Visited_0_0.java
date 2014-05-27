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

@SuppressWarnings("all") public class chain_$Collect$All$Visited_0_0 extends Strategy 
{ 
  public static chain_$Collect$All$Visited_0_0 instance = new chain_$Collect$All$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_CollectAllVisited_0_0");
    Fail27418:
    { 
      IStrategoTerm u_4482 = null;
      IStrategoTerm x_4482 = null;
      IStrategoTerm z_4482 = null;
      u_4482 = term;
      z_4482 = term;
      Success11100:
      { 
        Fail27419:
        { 
          IStrategoTerm b_4483 = null;
          b_4483 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4483, generator.const7483, u_4482);
          if(term == null)
            break Fail27419;
          if(true)
            break Success11100;
        }
        term = generator.constNil7;
      }
      x_4482 = term;
      term = z_4482;
      term = termFactory.makeTuple(x_4482, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10153.instance);
      if(term == null)
        break Fail27418;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}