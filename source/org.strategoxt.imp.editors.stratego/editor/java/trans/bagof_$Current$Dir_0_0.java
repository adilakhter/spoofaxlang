package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bagof_$Current$Dir_0_0 extends Strategy 
{ 
  public static bagof_$Current$Dir_0_0 instance = new bagof_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_CurrentDir_0_0");
    Fail22103:
    { 
      TermReference t_4309 = new TermReference();
      if(t_4309.value == null)
        t_4309.value = term;
      else
        if(t_4309.value != term && !t_4309.value.match(term))
          break Fail22103;
      Success11919:
      { 
        Fail22104:
        { 
          IStrategoTerm w_4309 = null;
          IStrategoTerm y_4309 = null;
          IStrategoTerm z_4309 = null;
          y_4309 = term;
          w_4309 = trans.const4346;
          z_4309 = y_4309;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_4309, w_4309, trans.constCons1966);
          if(term == null)
            break Fail22104;
          if(true)
            break Success11919;
        }
        term = trans.constNil3;
      }
      lifted6766 lifted67660 = new lifted6766();
      lifted67660.t_4309 = t_4309;
      term = filter_1_0.instance.invoke(context, term, lifted67660);
      if(term == null)
        break Fail22103;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}