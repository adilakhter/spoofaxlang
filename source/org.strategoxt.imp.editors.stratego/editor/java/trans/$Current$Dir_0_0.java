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

@SuppressWarnings("all") public class $Current$Dir_0_0 extends Strategy 
{ 
  public static $Current$Dir_0_0 instance = new $Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("CurrentDir_0_0");
    Fail22105:
    { 
      TermReference a_4310 = new TermReference();
      IStrategoTerm d_4310 = null;
      IStrategoTerm f_4310 = null;
      IStrategoTerm g_4310 = null;
      if(a_4310.value == null)
        a_4310.value = term;
      else
        if(a_4310.value != term && !a_4310.value.match(term))
          break Fail22105;
      f_4310 = term;
      d_4310 = trans.const4346;
      g_4310 = f_4310;
      term = dr_lookup_rule_0_2.instance.invoke(context, g_4310, d_4310, trans.constCons1966);
      if(term == null)
        break Fail22105;
      lifted6767 lifted67670 = new lifted6767();
      lifted67670.a_4310 = a_4310;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted67670);
      if(term == null)
        break Fail22105;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}