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

@SuppressWarnings("all") public class fold_$Base$Package_1_0 extends Strategy 
{ 
  public static fold_$Base$Package_1_0 instance = new fold_$Base$Package_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4458)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_BasePackage_1_0");
    Fail27280:
    { 
      IStrategoTerm w_4458 = null;
      IStrategoTerm y_4458 = null;
      y_4458 = term;
      Success11059:
      { 
        Fail27281:
        { 
          IStrategoTerm z_4458 = null;
          IStrategoTerm b_4459 = null;
          IStrategoTerm c_4459 = null;
          b_4459 = term;
          z_4458 = generator.const7448;
          c_4459 = b_4459;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4459, z_4458, generator.constCons4561);
          if(term == null)
            break Fail27281;
          if(true)
            break Success11059;
        }
        term = generator.constNil7;
      }
      w_4458 = term;
      term = y_4458;
      term = termFactory.makeTuple(w_4458, term);
      term = v_4458.invoke(context, term, lifted10106.instance);
      if(term == null)
        break Fail27280;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}