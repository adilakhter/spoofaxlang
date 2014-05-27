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

@SuppressWarnings("all") public class reverse_bagof_$Productions_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Productions_1_0 instance = new reverse_bagof_$Productions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4479)
  { 
    context.push("reverse_bagof_Productions_1_0");
    Fail27397:
    { 
      TermReference r_4479 = new TermReference();
      TermReference s_4479 = new TermReference();
      if(s_4479.value == null)
        s_4479.value = term;
      else
        if(s_4479.value != term && !s_4479.value.match(term))
          break Fail27397;
      if(r_4479.value == null)
        r_4479.value = term;
      else
        if(r_4479.value != term && !r_4479.value.match(term))
          break Fail27397;
      Success11095:
      { 
        Fail27398:
        { 
          IStrategoTerm x_4479 = null;
          x_4479 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4479, generator.const7480, s_4479.value);
          if(term == null)
            break Fail27398;
          if(true)
            break Success11095;
        }
        term = generator.constNil7;
      }
      lifted10147 lifted101470 = new lifted10147();
      lifted101470.r_4479 = r_4479;
      lifted101470.s_4479 = s_4479;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101470, u_4479);
      if(term == null)
        break Fail27397;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}