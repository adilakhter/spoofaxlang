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
    Fail22053:
    { 
      TermReference y_4300 = new TermReference();
      TermReference z_4300 = new TermReference();
      IStrategoTerm c_4301 = null;
      IStrategoTerm e_4301 = null;
      IStrategoTerm f_4301 = null;
      if(z_4300.value == null)
        z_4300.value = term;
      else
        if(z_4300.value != term && !z_4300.value.match(term))
          break Fail22053;
      if(y_4300.value == null)
        y_4300.value = term;
      else
        if(y_4300.value != term && !y_4300.value.match(term))
          break Fail22053;
      e_4301 = term;
      c_4301 = trans.const4352;
      f_4301 = e_4301;
      term = dr_lookup_rule_0_2.instance.invoke(context, f_4301, c_4301, trans.constCons1966);
      if(term == null)
        break Fail22053;
      lifted6749 lifted67490 = new lifted6749();
      lifted67490.y_4300 = y_4300;
      lifted67490.z_4300 = z_4300;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted67490);
      if(term == null)
        break Fail22053;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}