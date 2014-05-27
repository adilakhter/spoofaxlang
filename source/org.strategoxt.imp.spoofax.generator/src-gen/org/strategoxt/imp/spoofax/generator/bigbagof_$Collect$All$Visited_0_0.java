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

@SuppressWarnings("all") public class bigbagof_$Collect$All$Visited_0_0 extends Strategy 
{ 
  public static bigbagof_$Collect$All$Visited_0_0 instance = new bigbagof_$Collect$All$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CollectAllVisited_0_0");
    Fail27420:
    { 
      TermReference e_4483 = new TermReference();
      TermReference f_4483 = new TermReference();
      if(f_4483.value == null)
        f_4483.value = term;
      else
        if(f_4483.value != term && !f_4483.value.match(term))
          break Fail27420;
      if(e_4483.value == null)
        e_4483.value = term;
      else
        if(e_4483.value != term && !e_4483.value.match(term))
          break Fail27420;
      Success11101:
      { 
        Fail27421:
        { 
          IStrategoTerm j_4483 = null;
          j_4483 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4483, generator.const7483, f_4483.value);
          if(term == null)
            break Fail27421;
          if(true)
            break Success11101;
        }
        term = generator.constNil7;
      }
      lifted10154 lifted101540 = new lifted10154();
      lifted101540.e_4483 = e_4483;
      lifted101540.f_4483 = f_4483;
      term = filter_1_0.instance.invoke(context, term, lifted101540);
      if(term == null)
        break Fail27420;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}