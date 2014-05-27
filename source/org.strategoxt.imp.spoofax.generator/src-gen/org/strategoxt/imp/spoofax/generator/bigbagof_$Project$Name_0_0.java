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

@SuppressWarnings("all") public class bigbagof_$Project$Name_0_0 extends Strategy 
{ 
  public static bigbagof_$Project$Name_0_0 instance = new bigbagof_$Project$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_ProjectName_0_0");
    Fail27576:
    { 
      TermReference e_4508 = new TermReference();
      if(e_4508.value == null)
        e_4508.value = term;
      else
        if(e_4508.value != term && !e_4508.value.match(term))
          break Fail27576;
      Success11143:
      { 
        Fail27577:
        { 
          IStrategoTerm h_4508 = null;
          IStrategoTerm j_4508 = null;
          IStrategoTerm k_4508 = null;
          j_4508 = term;
          h_4508 = generator.const7876;
          k_4508 = j_4508;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, k_4508, h_4508, generator.constCons4561);
          if(term == null)
            break Fail27577;
          if(true)
            break Success11143;
        }
        term = generator.constNil7;
      }
      lifted10208 lifted102080 = new lifted10208();
      lifted102080.e_4508 = e_4508;
      term = filter_1_0.instance.invoke(context, term, lifted102080);
      if(term == null)
        break Fail27576;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}