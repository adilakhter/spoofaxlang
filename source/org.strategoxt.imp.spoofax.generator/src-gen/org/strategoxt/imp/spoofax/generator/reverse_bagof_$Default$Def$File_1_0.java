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

@SuppressWarnings("all") public class reverse_bagof_$Default$Def$File_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Default$Def$File_1_0 instance = new reverse_bagof_$Default$Def$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4540)
  { 
    context.push("reverse_bagof_DefaultDefFile_1_0");
    Fail27761:
    { 
      TermReference g_4540 = new TermReference();
      if(g_4540.value == null)
        g_4540.value = term;
      else
        if(g_4540.value != term && !g_4540.value.match(term))
          break Fail27761;
      Success11193:
      { 
        Fail27762:
        { 
          IStrategoTerm k_4540 = null;
          IStrategoTerm m_4540 = null;
          IStrategoTerm n_4540 = null;
          m_4540 = term;
          k_4540 = generator.const7912;
          n_4540 = m_4540;
          term = dr_lookup_rule_0_2.instance.invoke(context, n_4540, k_4540, generator.constCons4561);
          if(term == null)
            break Fail27762;
          if(true)
            break Success11193;
        }
        term = generator.constNil7;
      }
      lifted10273 lifted102730 = new lifted10273();
      lifted102730.g_4540 = g_4540;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted102730, i_4540);
      if(term == null)
        break Fail27761;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}