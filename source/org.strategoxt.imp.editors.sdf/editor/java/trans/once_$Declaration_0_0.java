package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
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
    Fail76287:
    { 
      IStrategoTerm l_92105 = null;
      TermReference m_92105 = new TermReference();
      TermReference n_92105 = new TermReference();
      TermReference o_92105 = new TermReference();
      IStrategoTerm p_92105 = null;
      IStrategoTerm q_92105 = null;
      IStrategoTerm s_92105 = null;
      IStrategoTerm u_92105 = null;
      if(n_92105.value == null)
        n_92105.value = term;
      else
        if(n_92105.value != term && !n_92105.value.match(term))
          break Fail76287;
      if(m_92105.value == null)
        m_92105.value = term;
      else
        if(m_92105.value != term && !m_92105.value.match(term))
          break Fail76287;
      s_92105 = term;
      u_92105 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, u_92105, trans.const15522, n_92105.value);
      if(term == null)
        break Fail76287;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail76287;
      l_92105 = term.getSubterm(0);
      q_92105 = term.getSubterm(1);
      p_92105 = term.getSubterm(2);
      term = l_92105;
      lifted21646 lifted216460 = new lifted21646();
      lifted216460.m_92105 = m_92105;
      lifted216460.n_92105 = n_92105;
      lifted216460.o_92105 = o_92105;
      term = split_fetch_1_0.instance.invoke(context, term, lifted216460);
      if(term == null)
        break Fail76287;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail76287;
      term = hashtable_put_0_2.instance.invoke(context, p_92105, q_92105, term);
      if(term == null)
        break Fail76287;
      term = s_92105;
      if(o_92105.value == null)
        break Fail76287;
      term = o_92105.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}