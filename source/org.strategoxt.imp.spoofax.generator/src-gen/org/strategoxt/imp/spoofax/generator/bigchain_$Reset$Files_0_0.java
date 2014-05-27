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

@SuppressWarnings("all") public class bigchain_$Reset$Files_0_0 extends Strategy 
{ 
  public static bigchain_$Reset$Files_0_0 instance = new bigchain_$Reset$Files_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_ResetFiles_0_0");
    Fail27650:
    { 
      IStrategoTerm y_4520 = null;
      IStrategoTerm a_4521 = null;
      a_4521 = term;
      Success11162:
      { 
        Fail27651:
        { 
          IStrategoTerm b_4521 = null;
          IStrategoTerm d_4521 = null;
          IStrategoTerm e_4521 = null;
          d_4521 = term;
          b_4521 = generator.const7888;
          e_4521 = d_4521;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, e_4521, b_4521, generator.constCons4561);
          if(term == null)
            break Fail27651;
          if(true)
            break Success11162;
        }
        term = generator.constNil7;
      }
      y_4520 = term;
      term = a_4521;
      term = termFactory.makeTuple(y_4520, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10233.instance);
      if(term == null)
        break Fail27650;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}