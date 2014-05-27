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

@SuppressWarnings("all") public class bigbagof_get_config_reference_0_0 extends Strategy 
{ 
  public static bigbagof_get_config_reference_0_0 instance = new bigbagof_get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_get_config_reference_0_0");
    Fail87775:
    { 
      TermReference x_17579 = new TermReference();
      TermReference y_17579 = new TermReference();
      if(y_17579.value == null)
        y_17579.value = term;
      else
        if(y_17579.value != term && !y_17579.value.match(term))
          break Fail87775;
      if(x_17579.value == null)
        x_17579.value = term;
      else
        if(x_17579.value != term && !x_17579.value.match(term))
          break Fail87775;
      Success47301:
      { 
        Fail87776:
        { 
          IStrategoTerm b_17580 = null;
          IStrategoTerm d_17580 = null;
          IStrategoTerm e_17580 = null;
          d_17580 = term;
          b_17580 = trans.const17869;
          e_17580 = d_17580;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, e_17580, b_17580, trans.constCons8528);
          if(term == null)
            break Fail87776;
          if(true)
            break Success47301;
        }
        term = trans.constNil14;
      }
      lifted24774 lifted247740 = new lifted24774();
      lifted247740.x_17579 = x_17579;
      lifted247740.y_17579 = y_17579;
      term = filter_1_0.instance.invoke(context, term, lifted247740);
      if(term == null)
        break Fail87775;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}