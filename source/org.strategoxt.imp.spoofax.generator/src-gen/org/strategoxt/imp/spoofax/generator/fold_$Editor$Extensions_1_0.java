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

@SuppressWarnings("all") public class fold_$Editor$Extensions_1_0 extends Strategy 
{ 
  public static fold_$Editor$Extensions_1_0 instance = new fold_$Editor$Extensions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4454)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_EditorExtensions_1_0");
    Fail27254:
    { 
      IStrategoTerm p_4454 = null;
      IStrategoTerm r_4454 = null;
      r_4454 = term;
      Success11052:
      { 
        Fail27255:
        { 
          IStrategoTerm s_4454 = null;
          IStrategoTerm u_4454 = null;
          IStrategoTerm v_4454 = null;
          u_4454 = term;
          s_4454 = generator.const7453;
          v_4454 = u_4454;
          term = dr_lookup_rule_0_2.instance.invoke(context, v_4454, s_4454, generator.constCons4561);
          if(term == null)
            break Fail27255;
          if(true)
            break Success11052;
        }
        term = generator.constNil7;
      }
      p_4454 = term;
      term = r_4454;
      term = termFactory.makeTuple(p_4454, term);
      term = o_4454.invoke(context, term, lifted10097.instance);
      if(term == null)
        break Fail27254;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}