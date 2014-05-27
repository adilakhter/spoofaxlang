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

@SuppressWarnings("all") public class chain_$Is$Imported_0_0 extends Strategy 
{ 
  public static chain_$Is$Imported_0_0 instance = new chain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsImported_0_0");
    Fail27154:
    { 
      IStrategoTerm q_4438 = null;
      IStrategoTerm t_4438 = null;
      IStrategoTerm v_4438 = null;
      q_4438 = term;
      v_4438 = term;
      Success11026:
      { 
        Fail27155:
        { 
          IStrategoTerm x_4438 = null;
          x_4438 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4438, generator.const7145, q_4438);
          if(term == null)
            break Fail27155;
          if(true)
            break Success11026;
        }
        term = generator.constNil7;
      }
      t_4438 = term;
      term = v_4438;
      term = termFactory.makeTuple(t_4438, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10063.instance);
      if(term == null)
        break Fail27154;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}