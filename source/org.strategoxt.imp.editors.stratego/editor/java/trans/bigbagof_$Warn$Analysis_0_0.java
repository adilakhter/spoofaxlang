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

@SuppressWarnings("all") public class bigbagof_$Warn$Analysis_0_0 extends Strategy 
{ 
  public static bigbagof_$Warn$Analysis_0_0 instance = new bigbagof_$Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_WarnAnalysis_0_0");
    Fail22046:
    { 
      TermReference n_4299 = new TermReference();
      TermReference o_4299 = new TermReference();
      if(o_4299.value == null)
        o_4299.value = term;
      else
        if(o_4299.value != term && !o_4299.value.match(term))
          break Fail22046;
      if(n_4299.value == null)
        n_4299.value = term;
      else
        if(n_4299.value != term && !n_4299.value.match(term))
          break Fail22046;
      Success11903:
      { 
        Fail22047:
        { 
          IStrategoTerm r_4299 = null;
          IStrategoTerm t_4299 = null;
          IStrategoTerm u_4299 = null;
          t_4299 = term;
          r_4299 = trans.const4352;
          u_4299 = t_4299;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, u_4299, r_4299, trans.constCons1966);
          if(term == null)
            break Fail22047;
          if(true)
            break Success11903;
        }
        term = trans.constNil3;
      }
      lifted6745 lifted67450 = new lifted6745();
      lifted67450.n_4299 = n_4299;
      lifted67450.o_4299 = o_4299;
      term = filter_1_0.instance.invoke(context, term, lifted67450);
      if(term == null)
        break Fail22046;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}