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

@SuppressWarnings("all") public class chain_$Reset$Files_0_0 extends Strategy 
{ 
  public static chain_$Reset$Files_0_0 instance = new chain_$Reset$Files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_ResetFiles_0_0");
    Fail27652:
    { 
      IStrategoTerm l_4521 = null;
      IStrategoTerm n_4521 = null;
      n_4521 = term;
      Success11163:
      { 
        Fail27653:
        { 
          IStrategoTerm o_4521 = null;
          IStrategoTerm q_4521 = null;
          IStrategoTerm r_4521 = null;
          q_4521 = term;
          o_4521 = generator.const7888;
          r_4521 = q_4521;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4521, o_4521, generator.constCons4561);
          if(term == null)
            break Fail27653;
          if(true)
            break Success11163;
        }
        term = generator.constNil7;
      }
      l_4521 = term;
      term = n_4521;
      term = termFactory.makeTuple(l_4521, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10234.instance);
      if(term == null)
        break Fail27652;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}