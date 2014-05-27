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

@SuppressWarnings("all") public class reverse_bagof_$Main$Descriptor$Name_1_0 extends Strategy 
{ 
  public static reverse_bagof_$Main$Descriptor$Name_1_0 instance = new reverse_bagof_$Main$Descriptor$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4536)
  { 
    context.push("reverse_bagof_MainDescriptorName_1_0");
    Fail27735:
    { 
      TermReference z_4535 = new TermReference();
      if(z_4535.value == null)
        z_4535.value = term;
      else
        if(z_4535.value != term && !z_4535.value.match(term))
          break Fail27735;
      Success11186:
      { 
        Fail27736:
        { 
          IStrategoTerm d_4536 = null;
          IStrategoTerm f_4536 = null;
          IStrategoTerm g_4536 = null;
          f_4536 = term;
          d_4536 = generator.const7897;
          g_4536 = f_4536;
          term = dr_lookup_rule_0_2.instance.invoke(context, g_4536, d_4536, generator.constCons4561);
          if(term == null)
            break Fail27736;
          if(true)
            break Success11186;
        }
        term = generator.constNil7;
      }
      lifted10264 lifted102640 = new lifted10264();
      lifted102640.z_4535 = z_4535;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted102640, b_4536);
      if(term == null)
        break Fail27735;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}