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

@SuppressWarnings("all") public class bagof_$Project$Name_0_0 extends Strategy 
{ 
  public static bagof_$Project$Name_0_0 instance = new bagof_$Project$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ProjectName_0_0");
    Fail27581:
    { 
      TermReference e_4509 = new TermReference();
      if(e_4509.value == null)
        e_4509.value = term;
      else
        if(e_4509.value != term && !e_4509.value.match(term))
          break Fail27581;
      Success11145:
      { 
        Fail27582:
        { 
          IStrategoTerm h_4509 = null;
          IStrategoTerm j_4509 = null;
          IStrategoTerm k_4509 = null;
          j_4509 = term;
          h_4509 = generator.const7876;
          k_4509 = j_4509;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4509, h_4509, generator.constCons4561);
          if(term == null)
            break Fail27582;
          if(true)
            break Success11145;
        }
        term = generator.constNil7;
      }
      lifted10211 lifted102110 = new lifted10211();
      lifted102110.e_4509 = e_4509;
      term = filter_1_0.instance.invoke(context, term, lifted102110);
      if(term == null)
        break Fail27581;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}