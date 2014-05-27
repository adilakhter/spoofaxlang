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

@SuppressWarnings("all") public class fold_$Reset$Files_1_0 extends Strategy 
{ 
  public static fold_$Reset$Files_1_0 instance = new fold_$Reset$Files_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4520)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ResetFiles_1_0");
    Fail27648:
    { 
      IStrategoTerm l_4520 = null;
      IStrategoTerm n_4520 = null;
      n_4520 = term;
      Success11161:
      { 
        Fail27649:
        { 
          IStrategoTerm o_4520 = null;
          IStrategoTerm q_4520 = null;
          IStrategoTerm r_4520 = null;
          q_4520 = term;
          o_4520 = generator.const7888;
          r_4520 = q_4520;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4520, o_4520, generator.constCons4561);
          if(term == null)
            break Fail27649;
          if(true)
            break Success11161;
        }
        term = generator.constNil7;
      }
      l_4520 = term;
      term = n_4520;
      term = termFactory.makeTuple(l_4520, term);
      term = k_4520.invoke(context, term, lifted10232.instance);
      if(term == null)
        break Fail27648;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}