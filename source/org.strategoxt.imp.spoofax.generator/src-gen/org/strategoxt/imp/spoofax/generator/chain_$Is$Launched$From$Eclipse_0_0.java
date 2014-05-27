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

@SuppressWarnings("all") public class chain_$Is$Launched$From$Eclipse_0_0 extends Strategy 
{ 
  public static chain_$Is$Launched$From$Eclipse_0_0 instance = new chain_$Is$Launched$From$Eclipse_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_IsLaunchedFromEclipse_0_0");
    Fail27678:
    { 
      IStrategoTerm f_4526 = null;
      IStrategoTerm h_4526 = null;
      h_4526 = term;
      Success11170:
      { 
        Fail27679:
        { 
          IStrategoTerm i_4526 = null;
          IStrategoTerm k_4526 = null;
          IStrategoTerm l_4526 = null;
          k_4526 = term;
          i_4526 = generator.const7895;
          l_4526 = k_4526;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4526, i_4526, generator.constCons4561);
          if(term == null)
            break Fail27679;
          if(true)
            break Success11170;
        }
        term = generator.constNil7;
      }
      f_4526 = term;
      term = h_4526;
      term = termFactory.makeTuple(f_4526, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10243.instance);
      if(term == null)
        break Fail27678;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}