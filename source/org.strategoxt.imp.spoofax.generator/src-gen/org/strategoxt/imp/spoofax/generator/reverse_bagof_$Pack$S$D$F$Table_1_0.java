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

@SuppressWarnings("all") public class reverse_bagof_$Pack$S$D$F$Table_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Pack$S$D$F$Table_1_0 instance = new reverse_bagof_$Pack$S$D$F$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4422)
  { 
    context.push("reverse_bagof_PackSDFTable_1_0");
    Fail27055:
    { 
      TermReference u_4422 = new TermReference();
      if(u_4422.value == null)
        u_4422.value = term;
      else
        if(u_4422.value != term && !u_4422.value.match(term))
          break Fail27055;
      Success11000:
      { 
        Fail27056:
        { 
          IStrategoTerm y_4422 = null;
          IStrategoTerm a_4423 = null;
          IStrategoTerm b_4423 = null;
          a_4423 = term;
          y_4422 = generator.const7022;
          b_4423 = a_4423;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4423, y_4422, generator.constCons4561);
          if(term == null)
            break Fail27056;
          if(true)
            break Success11000;
        }
        term = generator.constNil7;
      }
      lifted10030 lifted100300 = new lifted10030();
      lifted100300.u_4422 = u_4422;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted100300, w_4422);
      if(term == null)
        break Fail27055;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}