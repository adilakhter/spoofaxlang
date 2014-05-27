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

@SuppressWarnings("all") public class reverse_bagof_$No$Existing$Descriptor_1_0 extends Strategy 
{ 
  public static reverse_bagof_$No$Existing$Descriptor_1_0 instance = new reverse_bagof_$No$Existing$Descriptor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4469)
  { 
    context.push("reverse_bagof_NoExistingDescriptor_1_0");
    Fail27341:
    { 
      TermReference r_4469 = new TermReference();
      TermReference s_4469 = new TermReference();
      if(s_4469.value == null)
        s_4469.value = term;
      else
        if(s_4469.value != term && !s_4469.value.match(term))
          break Fail27341;
      if(r_4469.value == null)
        r_4469.value = term;
      else
        if(r_4469.value != term && !r_4469.value.match(term))
          break Fail27341;
      Success11077:
      { 
        Fail27342:
        { 
          IStrategoTerm w_4469 = null;
          IStrategoTerm y_4469 = null;
          IStrategoTerm z_4469 = null;
          y_4469 = term;
          w_4469 = generator.const7463;
          z_4469 = y_4469;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_4469, w_4469, generator.constCons4561);
          if(term == null)
            break Fail27342;
          if(true)
            break Success11077;
        }
        term = generator.constNil7;
      }
      lifted10129 lifted101290 = new lifted10129();
      lifted101290.r_4469 = r_4469;
      lifted101290.s_4469 = s_4469;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted101290, u_4469);
      if(term == null)
        break Fail27341;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}