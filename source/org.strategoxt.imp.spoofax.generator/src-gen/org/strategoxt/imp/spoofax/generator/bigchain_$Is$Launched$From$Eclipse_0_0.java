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

@SuppressWarnings("all") public class bigchain_$Is$Launched$From$Eclipse_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Launched$From$Eclipse_0_0 instance = new bigchain_$Is$Launched$From$Eclipse_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsLaunchedFromEclipse_0_0");
    Fail27676:
    { 
      IStrategoTerm s_4525 = null;
      IStrategoTerm u_4525 = null;
      u_4525 = term;
      Success11169:
      { 
        Fail27677:
        { 
          IStrategoTerm v_4525 = null;
          IStrategoTerm x_4525 = null;
          IStrategoTerm y_4525 = null;
          x_4525 = term;
          v_4525 = generator.const7895;
          y_4525 = x_4525;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4525, v_4525, generator.constCons4561);
          if(term == null)
            break Fail27677;
          if(true)
            break Success11169;
        }
        term = generator.constNil7;
      }
      s_4525 = term;
      term = u_4525;
      term = termFactory.makeTuple(s_4525, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10242.instance);
      if(term == null)
        break Fail27676;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}