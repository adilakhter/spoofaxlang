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

@SuppressWarnings("all") public class bigbagof_$New$Project_0_0 extends Strategy 
{ 
  public static bigbagof_$New$Project_0_0 instance = new bigbagof_$New$Project_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_NewProject_0_0");
    Fail27628:
    { 
      TermReference a_4517 = new TermReference();
      TermReference b_4517 = new TermReference();
      if(b_4517.value == null)
        b_4517.value = term;
      else
        if(b_4517.value != term && !b_4517.value.match(term))
          break Fail27628;
      if(a_4517.value == null)
        a_4517.value = term;
      else
        if(a_4517.value != term && !a_4517.value.match(term))
          break Fail27628;
      Success11157:
      { 
        Fail27629:
        { 
          IStrategoTerm e_4517 = null;
          IStrategoTerm g_4517 = null;
          IStrategoTerm h_4517 = null;
          g_4517 = term;
          e_4517 = generator.const7885;
          h_4517 = g_4517;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_4517, e_4517, generator.constCons4561);
          if(term == null)
            break Fail27629;
          if(true)
            break Success11157;
        }
        term = generator.constNil7;
      }
      lifted10226 lifted102260 = new lifted10226();
      lifted102260.a_4517 = a_4517;
      lifted102260.b_4517 = b_4517;
      term = filter_1_0.instance.invoke(context, term, lifted102260);
      if(term == null)
        break Fail27628;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}