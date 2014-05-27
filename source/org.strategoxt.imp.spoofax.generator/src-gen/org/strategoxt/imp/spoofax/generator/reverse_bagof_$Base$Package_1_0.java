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

@SuppressWarnings("all") public class reverse_bagof_$Base$Package_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Base$Package_1_0 instance = new reverse_bagof_$Base$Package_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4460)
  { 
    context.push("reverse_bagof_BasePackage_1_0");
    Fail27289:
    { 
      TermReference t_4460 = new TermReference();
      if(t_4460.value == null)
        t_4460.value = term;
      else
        if(t_4460.value != term && !t_4460.value.match(term))
          break Fail27289;
      Success11063:
      { 
        Fail27290:
        { 
          IStrategoTerm x_4460 = null;
          IStrategoTerm z_4460 = null;
          IStrategoTerm a_4461 = null;
          z_4460 = term;
          x_4460 = generator.const7448;
          a_4461 = z_4460;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_4461, x_4460, generator.constCons4561);
          if(term == null)
            break Fail27290;
          if(true)
            break Success11063;
        }
        term = generator.constNil7;
      }
      lifted10111 lifted101110 = new lifted10111();
      lifted101110.t_4460 = t_4460;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101110, v_4460);
      if(term == null)
        break Fail27289;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}