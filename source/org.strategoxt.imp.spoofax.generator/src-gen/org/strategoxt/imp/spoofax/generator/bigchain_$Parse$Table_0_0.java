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

@SuppressWarnings("all") public class bigchain_$Parse$Table_0_0 extends Strategy 
{ 
  public static bigchain_$Parse$Table_0_0 instance = new bigchain_$Parse$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_ParseTable_0_0");
    Fail27546:
    { 
      IStrategoTerm d_4503 = null;
      IStrategoTerm f_4503 = null;
      f_4503 = term;
      Success11134:
      { 
        Fail27547:
        { 
          IStrategoTerm g_4503 = null;
          IStrategoTerm i_4503 = null;
          IStrategoTerm j_4503 = null;
          i_4503 = term;
          g_4503 = generator.const7871;
          j_4503 = i_4503;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4503, g_4503, generator.constCons4561);
          if(term == null)
            break Fail27547;
          if(true)
            break Success11134;
        }
        term = generator.constNil7;
      }
      d_4503 = term;
      term = f_4503;
      term = termFactory.makeTuple(d_4503, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10197.instance);
      if(term == null)
        break Fail27546;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}