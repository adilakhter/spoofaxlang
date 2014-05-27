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

@SuppressWarnings("all") public class reverse_bagof_$Is$Launched$From$Eclipse_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Launched$From$Eclipse_1_0 instance = new reverse_bagof_$Is$Launched$From$Eclipse_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4527)
  { 
    context.push("reverse_bagof_IsLaunchedFromEclipse_1_0");
    Fail27683:
    { 
      TermReference i_4527 = new TermReference();
      TermReference j_4527 = new TermReference();
      if(j_4527.value == null)
        j_4527.value = term;
      else
        if(j_4527.value != term && !j_4527.value.match(term))
          break Fail27683;
      if(i_4527.value == null)
        i_4527.value = term;
      else
        if(i_4527.value != term && !i_4527.value.match(term))
          break Fail27683;
      Success11172:
      { 
        Fail27684:
        { 
          IStrategoTerm n_4527 = null;
          IStrategoTerm p_4527 = null;
          IStrategoTerm q_4527 = null;
          p_4527 = term;
          n_4527 = generator.const7895;
          q_4527 = p_4527;
          term = dr_lookup_rule_0_2.instance.invoke(context, q_4527, n_4527, generator.constCons4561);
          if(term == null)
            break Fail27684;
          if(true)
            break Success11172;
        }
        term = generator.constNil7;
      }
      lifted10246 lifted102460 = new lifted10246();
      lifted102460.i_4527 = i_4527;
      lifted102460.j_4527 = j_4527;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted102460, l_4527);
      if(term == null)
        break Fail27683;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}