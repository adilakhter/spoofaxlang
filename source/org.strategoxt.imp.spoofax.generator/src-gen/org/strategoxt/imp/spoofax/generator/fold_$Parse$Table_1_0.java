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

@SuppressWarnings("all") public class fold_$Parse$Table_1_0 extends Strategy 
{ 
  public static fold_$Parse$Table_1_0 instance = new fold_$Parse$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4502)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ParseTable_1_0");
    Fail27544:
    { 
      IStrategoTerm s_4502 = null;
      IStrategoTerm u_4502 = null;
      u_4502 = term;
      Success11133:
      { 
        Fail27545:
        { 
          IStrategoTerm v_4502 = null;
          IStrategoTerm x_4502 = null;
          IStrategoTerm y_4502 = null;
          x_4502 = term;
          v_4502 = generator.const7871;
          y_4502 = x_4502;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_4502, v_4502, generator.constCons4561);
          if(term == null)
            break Fail27545;
          if(true)
            break Success11133;
        }
        term = generator.constNil7;
      }
      s_4502 = term;
      term = u_4502;
      term = termFactory.makeTuple(s_4502, term);
      term = r_4502.invoke(context, term, lifted10196.instance);
      if(term == null)
        break Fail27544;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}