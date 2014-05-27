package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class reverse_bagof_get_config_reference_1_0 extends Strategy 
{ 
  public static reverse_bagof_get_config_reference_1_0 instance = new reverse_bagof_get_config_reference_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_17580)
  { 
    context.push("reverse_bagof_get_config_reference_1_0");
    Fail87778:
    { 
      TermReference r_17580 = new TermReference();
      TermReference s_17580 = new TermReference();
      if(s_17580.value == null)
        s_17580.value = term;
      else
        if(s_17580.value != term && !s_17580.value.match(term))
          break Fail87778;
      if(r_17580.value == null)
        r_17580.value = term;
      else
        if(r_17580.value != term && !r_17580.value.match(term))
          break Fail87778;
      Success47302:
      { 
        Fail87779:
        { 
          IStrategoTerm w_17580 = null;
          IStrategoTerm y_17580 = null;
          IStrategoTerm z_17580 = null;
          y_17580 = term;
          w_17580 = trans.const17869;
          z_17580 = y_17580;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_17580, w_17580, trans.constCons8528);
          if(term == null)
            break Fail87779;
          if(true)
            break Success47302;
        }
        term = trans.constNil14;
      }
      lifted24776 lifted247760 = new lifted24776();
      lifted247760.r_17580 = r_17580;
      lifted247760.s_17580 = s_17580;
      term = reverse_filter_2_0.instance.invoke(context, term, lifted247760, u_17580);
      if(term == null)
        break Fail87778;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}