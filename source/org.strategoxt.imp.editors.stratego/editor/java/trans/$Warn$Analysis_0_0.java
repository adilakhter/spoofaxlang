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

@SuppressWarnings("all") public class $Warn$Analysis_0_0 extends Strategy 
{ 
  public static $Warn$Analysis_0_0 instance = new $Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("WarnAnalysis_0_0");
    Fail23529:
    { 
      TermReference q_4854 = new TermReference();
      TermReference r_4854 = new TermReference();
      IStrategoTerm u_4854 = null;
      IStrategoTerm w_4854 = null;
      IStrategoTerm x_4854 = null;
      if(r_4854.value == null)
        r_4854.value = term;
      else
        if(r_4854.value != term && !r_4854.value.match(term))
          break Fail23529;
      if(q_4854.value == null)
        q_4854.value = term;
      else
        if(q_4854.value != term && !q_4854.value.match(term))
          break Fail23529;
      w_4854 = term;
      u_4854 = trans.const4562;
      x_4854 = w_4854;
      term = dr_lookup_rule_0_2.instance.invoke(context, x_4854, u_4854, trans.constCons2047);
      if(term == null)
        break Fail23529;
      lifted7020 lifted70200 = new lifted7020();
      lifted70200.q_4854 = q_4854;
      lifted70200.r_4854 = r_4854;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted70200);
      if(term == null)
        break Fail23529;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}