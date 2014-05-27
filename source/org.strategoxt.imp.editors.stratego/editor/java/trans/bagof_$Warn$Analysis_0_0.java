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

@SuppressWarnings("all") public class bagof_$Warn$Analysis_0_0 extends Strategy 
{ 
  public static bagof_$Warn$Analysis_0_0 instance = new bagof_$Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_WarnAnalysis_0_0");
    Fail22051:
    { 
      TermReference q_4300 = new TermReference();
      TermReference r_4300 = new TermReference();
      if(r_4300.value == null)
        r_4300.value = term;
      else
        if(r_4300.value != term && !r_4300.value.match(term))
          break Fail22051;
      if(q_4300.value == null)
        q_4300.value = term;
      else
        if(q_4300.value != term && !q_4300.value.match(term))
          break Fail22051;
      Success11905:
      { 
        Fail22052:
        { 
          IStrategoTerm u_4300 = null;
          IStrategoTerm w_4300 = null;
          IStrategoTerm x_4300 = null;
          w_4300 = term;
          u_4300 = trans.const4352;
          x_4300 = w_4300;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4300, u_4300, trans.constCons1966);
          if(term == null)
            break Fail22052;
          if(true)
            break Success11905;
        }
        term = trans.constNil3;
      }
      lifted6748 lifted67480 = new lifted6748();
      lifted67480.q_4300 = q_4300;
      lifted67480.r_4300 = r_4300;
      term = filter_1_0.instance.invoke(context, term, lifted67480);
      if(term == null)
        break Fail22051;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}