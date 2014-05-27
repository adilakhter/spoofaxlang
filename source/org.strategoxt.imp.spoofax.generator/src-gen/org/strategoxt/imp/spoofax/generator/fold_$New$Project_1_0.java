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

@SuppressWarnings("all") public class fold_$New$Project_1_0 extends Strategy 
{ 
  public static fold_$New$Project_1_0 instance = new fold_$New$Project_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4515)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_NewProject_1_0");
    Fail27622:
    { 
      IStrategoTerm r_4515 = null;
      IStrategoTerm t_4515 = null;
      t_4515 = term;
      Success11154:
      { 
        Fail27623:
        { 
          IStrategoTerm u_4515 = null;
          IStrategoTerm w_4515 = null;
          IStrategoTerm x_4515 = null;
          w_4515 = term;
          u_4515 = generator.const7885;
          x_4515 = w_4515;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4515, u_4515, generator.constCons4561);
          if(term == null)
            break Fail27623;
          if(true)
            break Success11154;
        }
        term = generator.constNil7;
      }
      r_4515 = term;
      term = t_4515;
      term = termFactory.makeTuple(r_4515, term);
      term = q_4515.invoke(context, term, lifted10223.instance);
      if(term == null)
        break Fail27622;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}