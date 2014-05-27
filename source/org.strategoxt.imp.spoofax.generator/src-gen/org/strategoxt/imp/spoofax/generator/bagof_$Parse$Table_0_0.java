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

@SuppressWarnings("all") public class bagof_$Parse$Table_0_0 extends Strategy 
{ 
  public static bagof_$Parse$Table_0_0 instance = new bagof_$Parse$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ParseTable_0_0");
    Fail27555:
    { 
      TermReference x_4504 = new TermReference();
      if(x_4504.value == null)
        x_4504.value = term;
      else
        if(x_4504.value != term && !x_4504.value.match(term))
          break Fail27555;
      Success11138:
      { 
        Fail27556:
        { 
          IStrategoTerm a_4505 = null;
          IStrategoTerm c_4505 = null;
          IStrategoTerm d_4505 = null;
          c_4505 = term;
          a_4505 = generator.const7871;
          d_4505 = c_4505;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_4505, a_4505, generator.constCons4561);
          if(term == null)
            break Fail27556;
          if(true)
            break Success11138;
        }
        term = generator.constNil7;
      }
      lifted10202 lifted102020 = new lifted10202();
      lifted102020.x_4504 = x_4504;
      term = filter_1_0.instance.invoke(context, term, lifted102020);
      if(term == null)
        break Fail27555;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}