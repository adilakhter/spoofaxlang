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

@SuppressWarnings("all") public class reverse_bagof_$Is$Reserved$Class$Name_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Reserved$Class$Name_1_0 instance = new reverse_bagof_$Is$Reserved$Class$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4448)
  { 
    context.push("reverse_bagof_IsReservedClassName_1_0");
    Fail27211:
    { 
      TermReference a_4448 = new TermReference();
      TermReference b_4448 = new TermReference();
      if(b_4448.value == null)
        b_4448.value = term;
      else
        if(b_4448.value != term && !b_4448.value.match(term))
          break Fail27211;
      if(a_4448.value == null)
        a_4448.value = term;
      else
        if(a_4448.value != term && !a_4448.value.match(term))
          break Fail27211;
      Success11042:
      { 
        Fail27212:
        { 
          IStrategoTerm g_4448 = null;
          g_4448 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4448, generator.const7167, b_4448.value);
          if(term == null)
            break Fail27212;
          if(true)
            break Success11042;
        }
        term = generator.constNil7;
      }
      lifted10084 lifted100840 = new lifted10084();
      lifted100840.a_4448 = a_4448;
      lifted100840.b_4448 = b_4448;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted100840, d_4448);
      if(term == null)
        break Fail27211;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}