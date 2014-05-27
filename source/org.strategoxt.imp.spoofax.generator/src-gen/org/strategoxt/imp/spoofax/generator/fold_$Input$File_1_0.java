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

@SuppressWarnings("all") public class fold_$Input$File_1_0 extends Strategy 
{ 
  public static fold_$Input$File_1_0 instance = new fold_$Input$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4498)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_InputFile_1_0");
    Fail27518:
    { 
      IStrategoTerm l_4498 = null;
      IStrategoTerm n_4498 = null;
      n_4498 = term;
      Success11126:
      { 
        Fail27519:
        { 
          IStrategoTerm o_4498 = null;
          IStrategoTerm q_4498 = null;
          IStrategoTerm r_4498 = null;
          q_4498 = term;
          o_4498 = generator.const7868;
          r_4498 = q_4498;
          term = dr_lookup_rule_0_2.instance.invoke(context, r_4498, o_4498, generator.constCons4561);
          if(term == null)
            break Fail27519;
          if(true)
            break Success11126;
        }
        term = generator.constNil7;
      }
      l_4498 = term;
      term = n_4498;
      term = termFactory.makeTuple(l_4498, term);
      term = k_4498.invoke(context, term, lifted10187.instance);
      if(term == null)
        break Fail27518;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}