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

@SuppressWarnings("all") public class reverse_bagof_$Parse$Table_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Parse$Table_1_0 instance = new reverse_bagof_$Parse$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4504)
  { 
    context.push("reverse_bagof_ParseTable_1_0");
    Fail27553:
    { 
      TermReference p_4504 = new TermReference();
      if(p_4504.value == null)
        p_4504.value = term;
      else
        if(p_4504.value != term && !p_4504.value.match(term))
          break Fail27553;
      Success11137:
      { 
        Fail27554:
        { 
          IStrategoTerm t_4504 = null;
          IStrategoTerm v_4504 = null;
          IStrategoTerm w_4504 = null;
          v_4504 = term;
          t_4504 = generator.const7871;
          w_4504 = v_4504;
          term = dr_lookup_rule_0_2.instance.invoke(context, w_4504, t_4504, generator.constCons4561);
          if(term == null)
            break Fail27554;
          if(true)
            break Success11137;
        }
        term = generator.constNil7;
      }
      lifted10201 lifted102010 = new lifted10201();
      lifted102010.p_4504 = p_4504;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted102010, r_4504);
      if(term == null)
        break Fail27553;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}