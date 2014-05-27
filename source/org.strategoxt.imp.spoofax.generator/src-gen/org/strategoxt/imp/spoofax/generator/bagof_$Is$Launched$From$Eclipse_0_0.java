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

@SuppressWarnings("all") public class bagof_$Is$Launched$From$Eclipse_0_0 extends Strategy 
{ 
  public static bagof_$Is$Launched$From$Eclipse_0_0 instance = new bagof_$Is$Launched$From$Eclipse_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsLaunchedFromEclipse_0_0");
    Fail27685:
    { 
      TermReference r_4527 = new TermReference();
      TermReference s_4527 = new TermReference();
      if(s_4527.value == null)
        s_4527.value = term;
      else
        if(s_4527.value != term && !s_4527.value.match(term))
          break Fail27685;
      if(r_4527.value == null)
        r_4527.value = term;
      else
        if(r_4527.value != term && !r_4527.value.match(term))
          break Fail27685;
      Success11173:
      { 
        Fail27686:
        { 
          IStrategoTerm v_4527 = null;
          IStrategoTerm x_4527 = null;
          IStrategoTerm y_4527 = null;
          x_4527 = term;
          v_4527 = generator.const7895;
          y_4527 = x_4527;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_4527, v_4527, generator.constCons4561);
          if(term == null)
            break Fail27686;
          if(true)
            break Success11173;
        }
        term = generator.constNil7;
      }
      lifted10247 lifted102470 = new lifted10247();
      lifted102470.r_4527 = r_4527;
      lifted102470.s_4527 = s_4527;
      term = filter_1_0.instance.invoke(context, term, lifted102470);
      if(term == null)
        break Fail27685;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}