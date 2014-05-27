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

@SuppressWarnings("all") public class reverse_bagof_$Project$Name_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Project$Name_1_0 instance = new reverse_bagof_$Project$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4508)
  { 
    context.push("reverse_bagof_ProjectName_1_0");
    Fail27579:
    { 
      TermReference w_4508 = new TermReference();
      if(w_4508.value == null)
        w_4508.value = term;
      else
        if(w_4508.value != term && !w_4508.value.match(term))
          break Fail27579;
      Success11144:
      { 
        Fail27580:
        { 
          IStrategoTerm a_4509 = null;
          IStrategoTerm c_4509 = null;
          IStrategoTerm d_4509 = null;
          c_4509 = term;
          a_4509 = generator.const7876;
          d_4509 = c_4509;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_4509, a_4509, generator.constCons4561);
          if(term == null)
            break Fail27580;
          if(true)
            break Success11144;
        }
        term = generator.constNil7;
      }
      lifted10210 lifted102100 = new lifted10210();
      lifted102100.w_4508 = w_4508;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted102100, y_4508);
      if(term == null)
        break Fail27579;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}