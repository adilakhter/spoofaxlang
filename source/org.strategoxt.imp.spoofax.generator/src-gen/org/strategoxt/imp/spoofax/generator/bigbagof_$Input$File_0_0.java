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

@SuppressWarnings("all") public class bigbagof_$Input$File_0_0 extends Strategy 
{ 
  public static bigbagof_$Input$File_0_0 instance = new bigbagof_$Input$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_InputFile_0_0");
    Fail27524:
    { 
      TermReference q_4499 = new TermReference();
      if(q_4499.value == null)
        q_4499.value = term;
      else
        if(q_4499.value != term && !q_4499.value.match(term))
          break Fail27524;
      Success11129:
      { 
        Fail27525:
        { 
          IStrategoTerm t_4499 = null;
          IStrategoTerm v_4499 = null;
          IStrategoTerm w_4499 = null;
          v_4499 = term;
          t_4499 = generator.const7868;
          w_4499 = v_4499;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4499, t_4499, generator.constCons4561);
          if(term == null)
            break Fail27525;
          if(true)
            break Success11129;
        }
        term = generator.constNil7;
      }
      lifted10190 lifted101900 = new lifted10190();
      lifted101900.q_4499 = q_4499;
      term = filter_1_0.instance.invoke(context, term, lifted101900);
      if(term == null)
        break Fail27524;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}