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

@SuppressWarnings("all") public class bigfold_$Is$Launched$From$Eclipse_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Launched$From$Eclipse_1_0 instance = new bigfold_$Is$Launched$From$Eclipse_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4524)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsLaunchedFromEclipse_1_0");
    Fail27672:
    { 
      IStrategoTerm r_4524 = null;
      IStrategoTerm t_4524 = null;
      t_4524 = term;
      Success11167:
      { 
        Fail27673:
        { 
          IStrategoTerm u_4524 = null;
          IStrategoTerm w_4524 = null;
          IStrategoTerm x_4524 = null;
          w_4524 = term;
          u_4524 = generator.const7895;
          x_4524 = w_4524;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, x_4524, u_4524, generator.constCons4561);
          if(term == null)
            break Fail27673;
          if(true)
            break Success11167;
        }
        term = generator.constNil7;
      }
      r_4524 = term;
      term = t_4524;
      term = termFactory.makeTuple(r_4524, term);
      term = q_4524.invoke(context, term, lifted10240.instance);
      if(term == null)
        break Fail27672;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}