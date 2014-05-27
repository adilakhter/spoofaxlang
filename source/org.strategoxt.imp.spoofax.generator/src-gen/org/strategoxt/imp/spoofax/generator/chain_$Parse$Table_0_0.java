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

@SuppressWarnings("all") public class chain_$Parse$Table_0_0 extends Strategy 
{ 
  public static chain_$Parse$Table_0_0 instance = new chain_$Parse$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_ParseTable_0_0");
    Fail27548:
    { 
      IStrategoTerm o_4503 = null;
      IStrategoTerm q_4503 = null;
      q_4503 = term;
      Success11135:
      { 
        Fail27549:
        { 
          IStrategoTerm r_4503 = null;
          IStrategoTerm t_4503 = null;
          IStrategoTerm u_4503 = null;
          t_4503 = term;
          r_4503 = generator.const7871;
          u_4503 = t_4503;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_4503, r_4503, generator.constCons4561);
          if(term == null)
            break Fail27549;
          if(true)
            break Success11135;
        }
        term = generator.constNil7;
      }
      o_4503 = term;
      term = q_4503;
      term = termFactory.makeTuple(o_4503, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10198.instance);
      if(term == null)
        break Fail27548;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}