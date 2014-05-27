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

@SuppressWarnings("all") public class bagof_get_config_reference_0_0 extends Strategy 
{ 
  public static bagof_get_config_reference_0_0 instance = new bagof_get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_get_config_reference_0_0");
    Fail87780:
    { 
      TermReference a_17581 = new TermReference();
      TermReference b_17581 = new TermReference();
      if(b_17581.value == null)
        b_17581.value = term;
      else
        if(b_17581.value != term && !b_17581.value.match(term))
          break Fail87780;
      if(a_17581.value == null)
        a_17581.value = term;
      else
        if(a_17581.value != term && !a_17581.value.match(term))
          break Fail87780;
      Success47303:
      { 
        Fail87781:
        { 
          IStrategoTerm e_17581 = null;
          IStrategoTerm g_17581 = null;
          IStrategoTerm h_17581 = null;
          g_17581 = term;
          e_17581 = trans.const17869;
          h_17581 = g_17581;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_17581, e_17581, trans.constCons8528);
          if(term == null)
            break Fail87781;
          if(true)
            break Success47303;
        }
        term = trans.constNil14;
      }
      lifted24777 lifted247770 = new lifted24777();
      lifted247770.a_17581 = a_17581;
      lifted247770.b_17581 = b_17581;
      term = filter_1_0.instance.invoke(context, term, lifted247770);
      if(term == null)
        break Fail87780;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}