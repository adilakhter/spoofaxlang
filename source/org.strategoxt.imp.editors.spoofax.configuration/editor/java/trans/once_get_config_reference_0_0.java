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

@SuppressWarnings("all") public class once_get_config_reference_0_0 extends Strategy 
{ 
  public static once_get_config_reference_0_0 instance = new once_get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_get_config_reference_0_0");
    Fail87777:
    { 
      IStrategoTerm f_17580 = null;
      TermReference g_17580 = new TermReference();
      TermReference h_17580 = new TermReference();
      TermReference i_17580 = new TermReference();
      IStrategoTerm j_17580 = null;
      IStrategoTerm k_17580 = null;
      IStrategoTerm m_17580 = null;
      IStrategoTerm n_17580 = null;
      IStrategoTerm p_17580 = null;
      IStrategoTerm q_17580 = null;
      if(h_17580.value == null)
        h_17580.value = term;
      else
        if(h_17580.value != term && !h_17580.value.match(term))
          break Fail87777;
      if(g_17580.value == null)
        g_17580.value = term;
      else
        if(g_17580.value != term && !g_17580.value.match(term))
          break Fail87777;
      m_17580 = term;
      p_17580 = term;
      n_17580 = trans.const17869;
      q_17580 = p_17580;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, q_17580, n_17580, trans.constCons8528);
      if(term == null)
        break Fail87777;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail87777;
      f_17580 = term.getSubterm(0);
      k_17580 = term.getSubterm(1);
      j_17580 = term.getSubterm(2);
      term = f_17580;
      lifted24775 lifted247750 = new lifted24775();
      lifted247750.g_17580 = g_17580;
      lifted247750.h_17580 = h_17580;
      lifted247750.i_17580 = i_17580;
      term = split_fetch_1_0.instance.invoke(context, term, lifted247750);
      if(term == null)
        break Fail87777;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail87777;
      term = hashtable_put_0_2.instance.invoke(context, j_17580, k_17580, term);
      if(term == null)
        break Fail87777;
      term = m_17580;
      if(i_17580.value == null)
        break Fail87777;
      term = i_17580.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}