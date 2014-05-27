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

@SuppressWarnings("all") public class bigbagof_$Input$Dir$Prefix_0_0 extends Strategy 
{ 
  public static bigbagof_$Input$Dir$Prefix_0_0 instance = new bigbagof_$Input$Dir$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_InputDirPrefix_0_0");
    Fail27130:
    { 
      TermReference t_4434 = new TermReference();
      if(t_4434.value == null)
        t_4434.value = term;
      else
        if(t_4434.value != term && !t_4434.value.match(term))
          break Fail27130;
      Success11020:
      { 
        Fail27131:
        { 
          IStrategoTerm w_4434 = null;
          IStrategoTerm y_4434 = null;
          IStrategoTerm z_4434 = null;
          y_4434 = term;
          w_4434 = generator.const7147;
          z_4434 = y_4434;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_4434, w_4434, generator.constCons4561);
          if(term == null)
            break Fail27131;
          if(true)
            break Success11020;
        }
        term = generator.constNil7;
      }
      lifted10055 lifted100550 = new lifted10055();
      lifted100550.t_4434 = t_4434;
      term = filter_1_0.instance.invoke(context, term, lifted100550);
      if(term == null)
        break Fail27130;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}