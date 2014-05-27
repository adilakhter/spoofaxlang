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

@SuppressWarnings("all") public class reverse_bagof_$Start$Symbol_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Start$Symbol_1_0 instance = new reverse_bagof_$Start$Symbol_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4465)
  { 
    context.push("reverse_bagof_StartSymbol_1_0");
    Fail27315:
    { 
      TermReference a_4465 = new TermReference();
      if(a_4465.value == null)
        a_4465.value = term;
      else
        if(a_4465.value != term && !a_4465.value.match(term))
          break Fail27315;
      Success11070:
      { 
        Fail27316:
        { 
          IStrategoTerm e_4465 = null;
          IStrategoTerm g_4465 = null;
          IStrategoTerm h_4465 = null;
          g_4465 = term;
          e_4465 = generator.const7443;
          h_4465 = g_4465;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_4465, e_4465, generator.constCons4561);
          if(term == null)
            break Fail27316;
          if(true)
            break Success11070;
        }
        term = generator.constNil7;
      }
      lifted10120 lifted101200 = new lifted10120();
      lifted101200.a_4465 = a_4465;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101200, c_4465);
      if(term == null)
        break Fail27315;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}