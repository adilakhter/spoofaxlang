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

@SuppressWarnings("all") public class bigbagof_$Reset$Files_0_0 extends Strategy 
{ 
  public static bigbagof_$Reset$Files_0_0 instance = new bigbagof_$Reset$Files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ResetFiles_0_0");
    Fail27654:
    { 
      TermReference u_4521 = new TermReference();
      TermReference v_4521 = new TermReference();
      if(v_4521.value == null)
        v_4521.value = term;
      else
        if(v_4521.value != term && !v_4521.value.match(term))
          break Fail27654;
      if(u_4521.value == null)
        u_4521.value = term;
      else
        if(u_4521.value != term && !u_4521.value.match(term))
          break Fail27654;
      Success11164:
      { 
        Fail27655:
        { 
          IStrategoTerm y_4521 = null;
          IStrategoTerm a_4522 = null;
          IStrategoTerm b_4522 = null;
          a_4522 = term;
          y_4521 = generator.const7888;
          b_4522 = a_4522;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, b_4522, y_4521, generator.constCons4561);
          if(term == null)
            break Fail27655;
          if(true)
            break Success11164;
        }
        term = generator.constNil7;
      }
      lifted10235 lifted102350 = new lifted10235();
      lifted102350.u_4521 = u_4521;
      lifted102350.v_4521 = v_4521;
      term = filter_1_0.instance.invoke(context, term, lifted102350);
      if(term == null)
        break Fail27654;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}