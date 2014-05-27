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

@SuppressWarnings("all") public class bigbagof_$Production$Visited_0_0 extends Strategy 
{ 
  public static bigbagof_$Production$Visited_0_0 instance = new bigbagof_$Production$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ProductionVisited_0_0");
    Fail27498:
    { 
      TermReference n_4495 = new TermReference();
      TermReference o_4495 = new TermReference();
      if(o_4495.value == null)
        o_4495.value = term;
      else
        if(o_4495.value != term && !o_4495.value.match(term))
          break Fail27498;
      if(n_4495.value == null)
        n_4495.value = term;
      else
        if(n_4495.value != term && !n_4495.value.match(term))
          break Fail27498;
      Success11122:
      { 
        Fail27499:
        { 
          IStrategoTerm s_4495 = null;
          s_4495 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, s_4495, generator.const7489, o_4495.value);
          if(term == null)
            break Fail27499;
          if(true)
            break Success11122;
        }
        term = generator.constNil7;
      }
      lifted10181 lifted101810 = new lifted10181();
      lifted101810.n_4495 = n_4495;
      lifted101810.o_4495 = o_4495;
      term = filter_1_0.instance.invoke(context, term, lifted101810);
      if(term == null)
        break Fail27498;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}