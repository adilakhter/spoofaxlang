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

@SuppressWarnings("all") public class fold_$Is$Launched$From$Eclipse_1_0 extends Strategy 
{ 
  public static fold_$Is$Launched$From$Eclipse_1_0 instance = new fold_$Is$Launched$From$Eclipse_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4525)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsLaunchedFromEclipse_1_0");
    Fail27674:
    { 
      IStrategoTerm f_4525 = null;
      IStrategoTerm h_4525 = null;
      h_4525 = term;
      Success11168:
      { 
        Fail27675:
        { 
          IStrategoTerm i_4525 = null;
          IStrategoTerm k_4525 = null;
          IStrategoTerm l_4525 = null;
          k_4525 = term;
          i_4525 = generator.const7895;
          l_4525 = k_4525;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4525, i_4525, generator.constCons4561);
          if(term == null)
            break Fail27675;
          if(true)
            break Success11168;
        }
        term = generator.constNil7;
      }
      f_4525 = term;
      term = h_4525;
      term = termFactory.makeTuple(f_4525, term);
      term = e_4525.invoke(context, term, lifted10241.instance);
      if(term == null)
        break Fail27674;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}