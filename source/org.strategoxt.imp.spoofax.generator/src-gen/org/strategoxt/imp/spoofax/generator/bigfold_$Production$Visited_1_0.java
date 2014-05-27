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

@SuppressWarnings("all") public class bigfold_$Production$Visited_1_0 extends Strategy 
{ 
  public static bigfold_$Production$Visited_1_0 instance = new bigfold_$Production$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4493)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ProductionVisited_1_0");
    Fail27490:
    { 
      IStrategoTerm u_4493 = null;
      IStrategoTerm y_4493 = null;
      IStrategoTerm a_4494 = null;
      u_4493 = term;
      a_4494 = term;
      Success11118:
      { 
        Fail27491:
        { 
          IStrategoTerm c_4494 = null;
          c_4494 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, c_4494, generator.const7489, u_4493);
          if(term == null)
            break Fail27491;
          if(true)
            break Success11118;
        }
        term = generator.constNil7;
      }
      y_4493 = term;
      term = a_4494;
      term = termFactory.makeTuple(y_4493, term);
      term = x_4493.invoke(context, term, lifted10177.instance);
      if(term == null)
        break Fail27490;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}