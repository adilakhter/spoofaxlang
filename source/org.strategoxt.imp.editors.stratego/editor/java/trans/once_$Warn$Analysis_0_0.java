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

@SuppressWarnings("all") public class once_$Warn$Analysis_0_0 extends Strategy 
{ 
  public static once_$Warn$Analysis_0_0 instance = new once_$Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_WarnAnalysis_0_0");
    Fail22048:
    { 
      IStrategoTerm v_4299 = null;
      TermReference w_4299 = new TermReference();
      TermReference x_4299 = new TermReference();
      TermReference y_4299 = new TermReference();
      IStrategoTerm z_4299 = null;
      IStrategoTerm a_4300 = null;
      IStrategoTerm c_4300 = null;
      IStrategoTerm d_4300 = null;
      IStrategoTerm f_4300 = null;
      IStrategoTerm g_4300 = null;
      if(x_4299.value == null)
        x_4299.value = term;
      else
        if(x_4299.value != term && !x_4299.value.match(term))
          break Fail22048;
      if(w_4299.value == null)
        w_4299.value = term;
      else
        if(w_4299.value != term && !w_4299.value.match(term))
          break Fail22048;
      c_4300 = term;
      f_4300 = term;
      d_4300 = trans.const4352;
      g_4300 = f_4300;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, g_4300, d_4300, trans.constCons1966);
      if(term == null)
        break Fail22048;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22048;
      v_4299 = term.getSubterm(0);
      a_4300 = term.getSubterm(1);
      z_4299 = term.getSubterm(2);
      term = v_4299;
      lifted6746 lifted67460 = new lifted6746();
      lifted67460.w_4299 = w_4299;
      lifted67460.x_4299 = x_4299;
      lifted67460.y_4299 = y_4299;
      term = split_fetch_1_0.instance.invoke(context, term, lifted67460);
      if(term == null)
        break Fail22048;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22048;
      term = hashtable_put_0_2.instance.invoke(context, z_4299, a_4300, term);
      if(term == null)
        break Fail22048;
      term = c_4300;
      if(y_4299.value == null)
        break Fail22048;
      term = y_4299.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}