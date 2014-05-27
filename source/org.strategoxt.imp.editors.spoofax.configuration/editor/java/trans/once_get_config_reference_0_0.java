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
    Fail22969:
    { 
      IStrategoTerm i_4636 = null;
      TermReference j_4636 = new TermReference();
      TermReference k_4636 = new TermReference();
      TermReference l_4636 = new TermReference();
      IStrategoTerm m_4636 = null;
      IStrategoTerm n_4636 = null;
      IStrategoTerm p_4636 = null;
      IStrategoTerm q_4636 = null;
      IStrategoTerm s_4636 = null;
      IStrategoTerm t_4636 = null;
      if(k_4636.value == null)
        k_4636.value = term;
      else
        if(k_4636.value != term && !k_4636.value.match(term))
          break Fail22969;
      if(j_4636.value == null)
        j_4636.value = term;
      else
        if(j_4636.value != term && !j_4636.value.match(term))
          break Fail22969;
      p_4636 = term;
      s_4636 = term;
      q_4636 = trans.const4482;
      t_4636 = s_4636;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, t_4636, q_4636, trans.constCons2047);
      if(term == null)
        break Fail22969;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22969;
      i_4636 = term.getSubterm(0);
      n_4636 = term.getSubterm(1);
      m_4636 = term.getSubterm(2);
      term = i_4636;
      lifted6890 lifted68900 = new lifted6890();
      lifted68900.j_4636 = j_4636;
      lifted68900.k_4636 = k_4636;
      lifted68900.l_4636 = l_4636;
      term = split_fetch_1_0.instance.invoke(context, term, lifted68900);
      if(term == null)
        break Fail22969;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22969;
      term = hashtable_put_0_2.instance.invoke(context, m_4636, n_4636, term);
      if(term == null)
        break Fail22969;
      term = p_4636;
      if(l_4636.value == null)
        break Fail22969;
      term = l_4636.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}