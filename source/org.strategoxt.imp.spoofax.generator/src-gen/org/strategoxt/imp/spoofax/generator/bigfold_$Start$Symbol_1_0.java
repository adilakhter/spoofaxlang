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

@SuppressWarnings("all") public class bigfold_$Start$Symbol_1_0 extends Strategy 
{ 
  public static bigfold_$Start$Symbol_1_0 instance = new bigfold_$Start$Symbol_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4462)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_StartSymbol_1_0");
    Fail27304:
    { 
      IStrategoTerm r_4462 = null;
      IStrategoTerm t_4462 = null;
      t_4462 = term;
      Success11065:
      { 
        Fail27305:
        { 
          IStrategoTerm u_4462 = null;
          IStrategoTerm w_4462 = null;
          IStrategoTerm x_4462 = null;
          w_4462 = term;
          u_4462 = generator.const7443;
          x_4462 = w_4462;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, x_4462, u_4462, generator.constCons4561);
          if(term == null)
            break Fail27305;
          if(true)
            break Success11065;
        }
        term = generator.constNil7;
      }
      r_4462 = term;
      term = t_4462;
      term = termFactory.makeTuple(r_4462, term);
      term = q_4462.invoke(context, term, lifted10114.instance);
      if(term == null)
        break Fail27304;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}