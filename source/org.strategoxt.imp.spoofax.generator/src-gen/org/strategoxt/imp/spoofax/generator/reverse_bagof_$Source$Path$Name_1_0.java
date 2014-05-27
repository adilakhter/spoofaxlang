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

@SuppressWarnings("all") public class reverse_bagof_$Source$Path$Name_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Source$Path$Name_1_0 instance = new reverse_bagof_$Source$Path$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4418)
  { 
    context.push("reverse_bagof_SourcePathName_1_0");
    Fail27029:
    { 
      TermReference p_4418 = new TermReference();
      TermReference q_4418 = new TermReference();
      if(q_4418.value == null)
        q_4418.value = term;
      else
        if(q_4418.value != term && !q_4418.value.match(term))
          break Fail27029;
      if(p_4418.value == null)
        p_4418.value = term;
      else
        if(p_4418.value != term && !p_4418.value.match(term))
          break Fail27029;
      Success10993:
      { 
        Fail27030:
        { 
          IStrategoTerm v_4418 = null;
          v_4418 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, v_4418, generator.const7018, q_4418.value);
          if(term == null)
            break Fail27030;
          if(true)
            break Success10993;
        }
        term = generator.constNil7;
      }
      lifted10021 lifted100210 = new lifted10021();
      lifted100210.p_4418 = p_4418;
      lifted100210.q_4418 = q_4418;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted100210, s_4418);
      if(term == null)
        break Fail27029;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}