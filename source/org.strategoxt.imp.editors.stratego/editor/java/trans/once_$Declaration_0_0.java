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

@SuppressWarnings("all") public class once_$Declaration_0_0 extends Strategy 
{ 
  public static once_$Declaration_0_0 instance = new once_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_Declaration_0_0");
    Fail22126:
    { 
      IStrategoTerm g_4313 = null;
      TermReference h_4313 = new TermReference();
      TermReference i_4313 = new TermReference();
      TermReference j_4313 = new TermReference();
      IStrategoTerm k_4313 = null;
      IStrategoTerm l_4313 = null;
      IStrategoTerm n_4313 = null;
      IStrategoTerm p_4313 = null;
      if(i_4313.value == null)
        i_4313.value = term;
      else
        if(i_4313.value != term && !i_4313.value.match(term))
          break Fail22126;
      if(h_4313.value == null)
        h_4313.value = term;
      else
        if(h_4313.value != term && !h_4313.value.match(term))
          break Fail22126;
      n_4313 = term;
      p_4313 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, p_4313, trans.const4360, i_4313.value);
      if(term == null)
        break Fail22126;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22126;
      g_4313 = term.getSubterm(0);
      l_4313 = term.getSubterm(1);
      k_4313 = term.getSubterm(2);
      term = g_4313;
      lifted6773 lifted67730 = new lifted6773();
      lifted67730.h_4313 = h_4313;
      lifted67730.i_4313 = i_4313;
      lifted67730.j_4313 = j_4313;
      term = split_fetch_1_0.instance.invoke(context, term, lifted67730);
      if(term == null)
        break Fail22126;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22126;
      term = hashtable_put_0_2.instance.invoke(context, k_4313, l_4313, term);
      if(term == null)
        break Fail22126;
      term = n_4313;
      if(j_4313.value == null)
        break Fail22126;
      term = j_4313.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}