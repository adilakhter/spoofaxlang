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

@SuppressWarnings("all") public class bigfold_$Editor$Extensions_1_0 extends Strategy 
{ 
  public static bigfold_$Editor$Extensions_1_0 instance = new bigfold_$Editor$Extensions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4454)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_EditorExtensions_1_0");
    Fail27252:
    { 
      IStrategoTerm d_4454 = null;
      IStrategoTerm f_4454 = null;
      f_4454 = term;
      Success11051:
      { 
        Fail27253:
        { 
          IStrategoTerm g_4454 = null;
          IStrategoTerm i_4454 = null;
          IStrategoTerm j_4454 = null;
          i_4454 = term;
          g_4454 = generator.const7453;
          j_4454 = i_4454;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, j_4454, g_4454, generator.constCons4561);
          if(term == null)
            break Fail27253;
          if(true)
            break Success11051;
        }
        term = generator.constNil7;
      }
      d_4454 = term;
      term = f_4454;
      term = termFactory.makeTuple(d_4454, term);
      term = c_4454.invoke(context, term, lifted10096.instance);
      if(term == null)
        break Fail27252;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}