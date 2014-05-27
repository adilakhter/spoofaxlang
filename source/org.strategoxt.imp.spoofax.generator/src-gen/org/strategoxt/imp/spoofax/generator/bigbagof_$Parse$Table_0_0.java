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

@SuppressWarnings("all") public class bigbagof_$Parse$Table_0_0 extends Strategy 
{ 
  public static bigbagof_$Parse$Table_0_0 instance = new bigbagof_$Parse$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ParseTable_0_0");
    Fail27550:
    { 
      TermReference x_4503 = new TermReference();
      if(x_4503.value == null)
        x_4503.value = term;
      else
        if(x_4503.value != term && !x_4503.value.match(term))
          break Fail27550;
      Success11136:
      { 
        Fail27551:
        { 
          IStrategoTerm a_4504 = null;
          IStrategoTerm c_4504 = null;
          IStrategoTerm d_4504 = null;
          c_4504 = term;
          a_4504 = generator.const7871;
          d_4504 = c_4504;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_4504, a_4504, generator.constCons4561);
          if(term == null)
            break Fail27551;
          if(true)
            break Success11136;
        }
        term = generator.constNil7;
      }
      lifted10199 lifted101990 = new lifted10199();
      lifted101990.x_4503 = x_4503;
      term = filter_1_0.instance.invoke(context, term, lifted101990);
      if(term == null)
        break Fail27550;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}