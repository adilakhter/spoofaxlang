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

@SuppressWarnings("all") public class bigfold_$New$Project_1_0 extends Strategy 
{ 
  public static bigfold_$New$Project_1_0 instance = new bigfold_$New$Project_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4515)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_NewProject_1_0");
    Fail27620:
    { 
      IStrategoTerm d_4515 = null;
      IStrategoTerm f_4515 = null;
      f_4515 = term;
      Success11153:
      { 
        Fail27621:
        { 
          IStrategoTerm g_4515 = null;
          IStrategoTerm i_4515 = null;
          IStrategoTerm j_4515 = null;
          i_4515 = term;
          g_4515 = generator.const7885;
          j_4515 = i_4515;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4515, g_4515, generator.constCons4561);
          if(term == null)
            break Fail27621;
          if(true)
            break Success11153;
        }
        term = generator.constNil7;
      }
      d_4515 = term;
      term = f_4515;
      term = termFactory.makeTuple(d_4515, term);
      term = c_4515.invoke(context, term, lifted10222.instance);
      if(term == null)
        break Fail27620;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}