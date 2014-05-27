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

@SuppressWarnings("all") public class bigbagof_$Imported$From_0_0 extends Strategy 
{ 
  public static bigbagof_$Imported$From_0_0 instance = new bigbagof_$Imported$From_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ImportedFrom_0_0");
    Fail27078:
    { 
      TermReference j_4426 = new TermReference();
      TermReference k_4426 = new TermReference();
      if(k_4426.value == null)
        k_4426.value = term;
      else
        if(k_4426.value != term && !k_4426.value.match(term))
          break Fail27078;
      if(j_4426.value == null)
        j_4426.value = term;
      else
        if(j_4426.value != term && !j_4426.value.match(term))
          break Fail27078;
      Success11006:
      { 
        Fail27079:
        { 
          IStrategoTerm o_4426 = null;
          o_4426 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, o_4426, generator.const7027, k_4426.value);
          if(term == null)
            break Fail27079;
          if(true)
            break Success11006;
        }
        term = generator.constNil7;
      }
      lifted10037 lifted100370 = new lifted10037();
      lifted100370.j_4426 = j_4426;
      lifted100370.k_4426 = k_4426;
      term = filter_1_0.instance.invoke(context, term, lifted100370);
      if(term == null)
        break Fail27078;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}