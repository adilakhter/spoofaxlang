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

@SuppressWarnings("all") public class fold_$Imported$From_1_0 extends Strategy 
{ 
  public static fold_$Imported$From_1_0 instance = new fold_$Imported$From_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4425)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_ImportedFrom_1_0");
    Fail27072:
    { 
      IStrategoTerm c_4425 = null;
      IStrategoTerm g_4425 = null;
      IStrategoTerm i_4425 = null;
      c_4425 = term;
      i_4425 = term;
      Success11003:
      { 
        Fail27073:
        { 
          IStrategoTerm k_4425 = null;
          k_4425 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4425, generator.const7027, c_4425);
          if(term == null)
            break Fail27073;
          if(true)
            break Success11003;
        }
        term = generator.constNil7;
      }
      g_4425 = term;
      term = i_4425;
      term = termFactory.makeTuple(g_4425, term);
      term = f_4425.invoke(context, term, lifted10034.instance);
      if(term == null)
        break Fail27072;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}