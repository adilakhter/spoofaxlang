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

@SuppressWarnings("all") public class reverse_bagof_$New$Project_1_0 extends Strategy 
{ 
  public static reverse_bagof_$New$Project_1_0 instance = new reverse_bagof_$New$Project_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4517)
  { 
    context.push("reverse_bagof_NewProject_1_0");
    Fail27631:
    { 
      TermReference u_4517 = new TermReference();
      TermReference v_4517 = new TermReference();
      if(v_4517.value == null)
        v_4517.value = term;
      else
        if(v_4517.value != term && !v_4517.value.match(term))
          break Fail27631;
      if(u_4517.value == null)
        u_4517.value = term;
      else
        if(u_4517.value != term && !u_4517.value.match(term))
          break Fail27631;
      Success11158:
      { 
        Fail27632:
        { 
          IStrategoTerm z_4517 = null;
          IStrategoTerm b_4518 = null;
          IStrategoTerm c_4518 = null;
          b_4518 = term;
          z_4517 = generator.const7885;
          c_4518 = b_4518;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4518, z_4517, generator.constCons4561);
          if(term == null)
            break Fail27632;
          if(true)
            break Success11158;
        }
        term = generator.constNil7;
      }
      lifted10228 lifted102280 = new lifted10228();
      lifted102280.u_4517 = u_4517;
      lifted102280.v_4517 = v_4517;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted102280, x_4517);
      if(term == null)
        break Fail27631;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}