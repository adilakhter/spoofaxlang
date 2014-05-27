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

@SuppressWarnings("all") public class bigchain_$New$Project_0_0 extends Strategy 
{ 
  public static bigchain_$New$Project_0_0 instance = new bigchain_$New$Project_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_NewProject_0_0");
    Fail27624:
    { 
      IStrategoTerm e_4516 = null;
      IStrategoTerm g_4516 = null;
      g_4516 = term;
      Success11155:
      { 
        Fail27625:
        { 
          IStrategoTerm h_4516 = null;
          IStrategoTerm j_4516 = null;
          IStrategoTerm k_4516 = null;
          j_4516 = term;
          h_4516 = generator.const7885;
          k_4516 = j_4516;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, k_4516, h_4516, generator.constCons4561);
          if(term == null)
            break Fail27625;
          if(true)
            break Success11155;
        }
        term = generator.constNil7;
      }
      e_4516 = term;
      term = g_4516;
      term = termFactory.makeTuple(e_4516, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10224.instance);
      if(term == null)
        break Fail27624;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}