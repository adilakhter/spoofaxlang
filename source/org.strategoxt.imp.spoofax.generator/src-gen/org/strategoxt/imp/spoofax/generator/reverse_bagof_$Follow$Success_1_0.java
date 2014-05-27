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

@SuppressWarnings("all") public class reverse_bagof_$Follow$Success_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Follow$Success_1_0 instance = new reverse_bagof_$Follow$Success_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4492)
  { 
    context.push("reverse_bagof_FollowSuccess_1_0");
    Fail27475:
    { 
      TermReference a_4492 = new TermReference();
      TermReference b_4492 = new TermReference();
      if(b_4492.value == null)
        b_4492.value = term;
      else
        if(b_4492.value != term && !b_4492.value.match(term))
          break Fail27475;
      if(a_4492.value == null)
        a_4492.value = term;
      else
        if(a_4492.value != term && !a_4492.value.match(term))
          break Fail27475;
      Success11116:
      { 
        Fail27476:
        { 
          IStrategoTerm g_4492 = null;
          g_4492 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4492, generator.const7487, b_4492.value);
          if(term == null)
            break Fail27476;
          if(true)
            break Success11116;
        }
        term = generator.constNil7;
      }
      lifted10174 lifted101740 = new lifted10174();
      lifted101740.a_4492 = a_4492;
      lifted101740.b_4492 = b_4492;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101740, d_4492);
      if(term == null)
        break Fail27475;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}