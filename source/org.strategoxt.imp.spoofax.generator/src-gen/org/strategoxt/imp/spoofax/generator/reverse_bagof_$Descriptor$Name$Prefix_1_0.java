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

@SuppressWarnings("all") public class reverse_bagof_$Descriptor$Name$Prefix_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Descriptor$Name$Prefix_1_0 instance = new reverse_bagof_$Descriptor$Name$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4531)
  { 
    context.push("reverse_bagof_DescriptorNamePrefix_1_0");
    Fail27709:
    { 
      TermReference s_4531 = new TermReference();
      if(s_4531.value == null)
        s_4531.value = term;
      else
        if(s_4531.value != term && !s_4531.value.match(term))
          break Fail27709;
      Success11179:
      { 
        Fail27710:
        { 
          IStrategoTerm w_4531 = null;
          IStrategoTerm y_4531 = null;
          IStrategoTerm z_4531 = null;
          y_4531 = term;
          w_4531 = generator.const7899;
          z_4531 = y_4531;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_4531, w_4531, generator.constCons4561);
          if(term == null)
            break Fail27710;
          if(true)
            break Success11179;
        }
        term = generator.constNil7;
      }
      lifted10255 lifted102550 = new lifted10255();
      lifted102550.s_4531 = s_4531;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted102550, u_4531);
      if(term == null)
        break Fail27709;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}