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

@SuppressWarnings("all") public class bagof_$Collect$All$Visited_0_0 extends Strategy 
{ 
  public static bagof_$Collect$All$Visited_0_0 instance = new bagof_$Collect$All$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CollectAllVisited_0_0");
    Fail27425:
    { 
      TermReference b_4484 = new TermReference();
      TermReference c_4484 = new TermReference();
      if(c_4484.value == null)
        c_4484.value = term;
      else
        if(c_4484.value != term && !c_4484.value.match(term))
          break Fail27425;
      if(b_4484.value == null)
        b_4484.value = term;
      else
        if(b_4484.value != term && !b_4484.value.match(term))
          break Fail27425;
      Success11103:
      { 
        Fail27426:
        { 
          IStrategoTerm g_4484 = null;
          g_4484 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4484, generator.const7483, c_4484.value);
          if(term == null)
            break Fail27426;
          if(true)
            break Success11103;
        }
        term = generator.constNil7;
      }
      lifted10157 lifted101570 = new lifted10157();
      lifted101570.b_4484 = b_4484;
      lifted101570.c_4484 = c_4484;
      term = filter_1_0.instance.invoke(context, term, lifted101570);
      if(term == null)
        break Fail27425;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}