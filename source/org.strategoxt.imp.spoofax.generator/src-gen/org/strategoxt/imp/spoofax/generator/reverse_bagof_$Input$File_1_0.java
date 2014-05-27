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

@SuppressWarnings("all") public class reverse_bagof_$Input$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Input$File_1_0 instance = new reverse_bagof_$Input$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4500)
  { 
    context.push("reverse_bagof_InputFile_1_0");
    Fail27527:
    { 
      TermReference i_4500 = new TermReference();
      if(i_4500.value == null)
        i_4500.value = term;
      else
        if(i_4500.value != term && !i_4500.value.match(term))
          break Fail27527;
      Success11130:
      { 
        Fail27528:
        { 
          IStrategoTerm m_4500 = null;
          IStrategoTerm o_4500 = null;
          IStrategoTerm p_4500 = null;
          o_4500 = term;
          m_4500 = generator.const7868;
          p_4500 = o_4500;
          term = dr_lookup_rule_0_2.instance.invoke(context, p_4500, m_4500, generator.constCons4561);
          if(term == null)
            break Fail27528;
          if(true)
            break Success11130;
        }
        term = generator.constNil7;
      }
      lifted10192 lifted101920 = new lifted10192();
      lifted101920.i_4500 = i_4500;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101920, k_4500);
      if(term == null)
        break Fail27527;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}