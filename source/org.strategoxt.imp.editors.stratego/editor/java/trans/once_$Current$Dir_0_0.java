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

@SuppressWarnings("all") public class once_$Current$Dir_0_0 extends Strategy 
{ 
  public static once_$Current$Dir_0_0 instance = new once_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CurrentDir_0_0");
    Fail22100:
    { 
      IStrategoTerm a_4309 = null;
      TermReference b_4309 = new TermReference();
      TermReference c_4309 = new TermReference();
      IStrategoTerm d_4309 = null;
      IStrategoTerm e_4309 = null;
      IStrategoTerm g_4309 = null;
      IStrategoTerm h_4309 = null;
      IStrategoTerm j_4309 = null;
      IStrategoTerm k_4309 = null;
      if(b_4309.value == null)
        b_4309.value = term;
      else
        if(b_4309.value != term && !b_4309.value.match(term))
          break Fail22100;
      g_4309 = term;
      j_4309 = term;
      h_4309 = trans.const4346;
      k_4309 = j_4309;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, k_4309, h_4309, trans.constCons1966);
      if(term == null)
        break Fail22100;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22100;
      a_4309 = term.getSubterm(0);
      e_4309 = term.getSubterm(1);
      d_4309 = term.getSubterm(2);
      term = a_4309;
      lifted6764 lifted67640 = new lifted6764();
      lifted67640.b_4309 = b_4309;
      lifted67640.c_4309 = c_4309;
      term = split_fetch_1_0.instance.invoke(context, term, lifted67640);
      if(term == null)
        break Fail22100;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22100;
      term = hashtable_put_0_2.instance.invoke(context, d_4309, e_4309, term);
      if(term == null)
        break Fail22100;
      term = g_4309;
      if(c_4309.value == null)
        break Fail22100;
      term = c_4309.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}