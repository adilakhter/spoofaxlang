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

@SuppressWarnings("all") public class bagof_$Input$Dir$Prefix_0_0 extends Strategy 
{ 
  public static bagof_$Input$Dir$Prefix_0_0 instance = new bagof_$Input$Dir$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_InputDirPrefix_0_0");
    Fail27135:
    { 
      TermReference t_4435 = new TermReference();
      if(t_4435.value == null)
        t_4435.value = term;
      else
        if(t_4435.value != term && !t_4435.value.match(term))
          break Fail27135;
      Success11022:
      { 
        Fail27136:
        { 
          IStrategoTerm w_4435 = null;
          IStrategoTerm y_4435 = null;
          IStrategoTerm z_4435 = null;
          y_4435 = term;
          w_4435 = generator.const7147;
          z_4435 = y_4435;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_4435, w_4435, generator.constCons4561);
          if(term == null)
            break Fail27136;
          if(true)
            break Success11022;
        }
        term = generator.constNil7;
      }
      lifted10058 lifted100580 = new lifted10058();
      lifted100580.t_4435 = t_4435;
      term = filter_1_0.instance.invoke(context, term, lifted100580);
      if(term == null)
        break Fail27135;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}