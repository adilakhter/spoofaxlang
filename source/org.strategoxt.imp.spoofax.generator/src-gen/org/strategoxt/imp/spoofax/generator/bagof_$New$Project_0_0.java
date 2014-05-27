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

@SuppressWarnings("all") public class bagof_$New$Project_0_0 extends Strategy 
{ 
  public static bagof_$New$Project_0_0 instance = new bagof_$New$Project_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_NewProject_0_0");
    Fail27633:
    { 
      TermReference d_4518 = new TermReference();
      TermReference e_4518 = new TermReference();
      if(e_4518.value == null)
        e_4518.value = term;
      else
        if(e_4518.value != term && !e_4518.value.match(term))
          break Fail27633;
      if(d_4518.value == null)
        d_4518.value = term;
      else
        if(d_4518.value != term && !d_4518.value.match(term))
          break Fail27633;
      Success11159:
      { 
        Fail27634:
        { 
          IStrategoTerm h_4518 = null;
          IStrategoTerm j_4518 = null;
          IStrategoTerm k_4518 = null;
          j_4518 = term;
          h_4518 = generator.const7885;
          k_4518 = j_4518;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4518, h_4518, generator.constCons4561);
          if(term == null)
            break Fail27634;
          if(true)
            break Success11159;
        }
        term = generator.constNil7;
      }
      lifted10229 lifted102290 = new lifted10229();
      lifted102290.d_4518 = d_4518;
      lifted102290.e_4518 = e_4518;
      term = filter_1_0.instance.invoke(context, term, lifted102290);
      if(term == null)
        break Fail27633;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}