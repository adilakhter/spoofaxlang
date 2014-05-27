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

@SuppressWarnings("all") public class bagof_$Production$Visited_0_0 extends Strategy 
{ 
  public static bagof_$Production$Visited_0_0 instance = new bagof_$Production$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ProductionVisited_0_0");
    Fail27503:
    { 
      TermReference k_4496 = new TermReference();
      TermReference l_4496 = new TermReference();
      if(l_4496.value == null)
        l_4496.value = term;
      else
        if(l_4496.value != term && !l_4496.value.match(term))
          break Fail27503;
      if(k_4496.value == null)
        k_4496.value = term;
      else
        if(k_4496.value != term && !k_4496.value.match(term))
          break Fail27503;
      Success11124:
      { 
        Fail27504:
        { 
          IStrategoTerm p_4496 = null;
          p_4496 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4496, generator.const7489, l_4496.value);
          if(term == null)
            break Fail27504;
          if(true)
            break Success11124;
        }
        term = generator.constNil7;
      }
      lifted10184 lifted101840 = new lifted10184();
      lifted101840.k_4496 = k_4496;
      lifted101840.l_4496 = l_4496;
      term = filter_1_0.instance.invoke(context, term, lifted101840);
      if(term == null)
        break Fail27503;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}