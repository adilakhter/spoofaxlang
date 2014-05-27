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

@SuppressWarnings("all") public class reverse_bagof_$Collect$All$Visited_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Collect$All$Visited_1_0 instance = new reverse_bagof_$Collect$All$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4483)
  { 
    context.push("reverse_bagof_CollectAllVisited_1_0");
    Fail27423:
    { 
      TermReference u_4483 = new TermReference();
      TermReference v_4483 = new TermReference();
      if(v_4483.value == null)
        v_4483.value = term;
      else
        if(v_4483.value != term && !v_4483.value.match(term))
          break Fail27423;
      if(u_4483.value == null)
        u_4483.value = term;
      else
        if(u_4483.value != term && !u_4483.value.match(term))
          break Fail27423;
      Success11102:
      { 
        Fail27424:
        { 
          IStrategoTerm a_4484 = null;
          a_4484 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_4484, generator.const7483, v_4483.value);
          if(term == null)
            break Fail27424;
          if(true)
            break Success11102;
        }
        term = generator.constNil7;
      }
      lifted10156 lifted101560 = new lifted10156();
      lifted101560.u_4483 = u_4483;
      lifted101560.v_4483 = v_4483;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101560, x_4483);
      if(term == null)
        break Fail27423;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}