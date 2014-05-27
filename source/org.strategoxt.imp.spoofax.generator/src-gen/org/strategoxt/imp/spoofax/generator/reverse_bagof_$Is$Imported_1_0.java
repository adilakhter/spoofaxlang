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

@SuppressWarnings("all") public class reverse_bagof_$Is$Imported_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Is$Imported_1_0 instance = new reverse_bagof_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4439)
  { 
    context.push("reverse_bagof_IsImported_1_0");
    Fail27159:
    { 
      TermReference q_4439 = new TermReference();
      TermReference r_4439 = new TermReference();
      if(r_4439.value == null)
        r_4439.value = term;
      else
        if(r_4439.value != term && !r_4439.value.match(term))
          break Fail27159;
      if(q_4439.value == null)
        q_4439.value = term;
      else
        if(q_4439.value != term && !q_4439.value.match(term))
          break Fail27159;
      Success11028:
      { 
        Fail27160:
        { 
          IStrategoTerm w_4439 = null;
          w_4439 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4439, generator.const7145, r_4439.value);
          if(term == null)
            break Fail27160;
          if(true)
            break Success11028;
        }
        term = generator.constNil7;
      }
      lifted10066 lifted100660 = new lifted10066();
      lifted100660.q_4439 = q_4439;
      lifted100660.r_4439 = r_4439;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted100660, t_4439);
      if(term == null)
        break Fail27159;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}