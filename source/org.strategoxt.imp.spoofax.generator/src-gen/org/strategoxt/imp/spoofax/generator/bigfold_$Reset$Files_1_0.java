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

@SuppressWarnings("all") public class bigfold_$Reset$Files_1_0 extends Strategy 
{ 
  public static bigfold_$Reset$Files_1_0 instance = new bigfold_$Reset$Files_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4519)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ResetFiles_1_0");
    Fail27646:
    { 
      IStrategoTerm x_4519 = null;
      IStrategoTerm z_4519 = null;
      z_4519 = term;
      Success11160:
      { 
        Fail27647:
        { 
          IStrategoTerm a_4520 = null;
          IStrategoTerm c_4520 = null;
          IStrategoTerm d_4520 = null;
          c_4520 = term;
          a_4520 = generator.const7888;
          d_4520 = c_4520;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, d_4520, a_4520, generator.constCons4561);
          if(term == null)
            break Fail27647;
          if(true)
            break Success11160;
        }
        term = generator.constNil7;
      }
      x_4519 = term;
      term = z_4519;
      term = termFactory.makeTuple(x_4519, term);
      term = w_4519.invoke(context, term, lifted10231.instance);
      if(term == null)
        break Fail27646;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}