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

@SuppressWarnings("all") public class once_$Current$Dir_0_0 extends Strategy 
{ 
  public static once_$Current$Dir_0_0 instance = new once_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CurrentDir_0_0");
    Fail76209:
    { 
      IStrategoTerm i_92092 = null;
      TermReference j_92092 = new TermReference();
      TermReference k_92092 = new TermReference();
      IStrategoTerm l_92092 = null;
      IStrategoTerm m_92092 = null;
      IStrategoTerm o_92092 = null;
      IStrategoTerm p_92092 = null;
      IStrategoTerm r_92092 = null;
      IStrategoTerm s_92092 = null;
      if(j_92092.value == null)
        j_92092.value = term;
      else
        if(j_92092.value != term && !j_92092.value.match(term))
          break Fail76209;
      o_92092 = term;
      r_92092 = term;
      p_92092 = trans.const15515;
      s_92092 = r_92092;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, s_92092, p_92092, trans.constCons7205);
      if(term == null)
        break Fail76209;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail76209;
      i_92092 = term.getSubterm(0);
      m_92092 = term.getSubterm(1);
      l_92092 = term.getSubterm(2);
      term = i_92092;
      lifted21619 lifted216190 = new lifted21619();
      lifted216190.j_92092 = j_92092;
      lifted216190.k_92092 = k_92092;
      term = split_fetch_1_0.instance.invoke(context, term, lifted216190);
      if(term == null)
        break Fail76209;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail76209;
      term = hashtable_put_0_2.instance.invoke(context, l_92092, m_92092, term);
      if(term == null)
        break Fail76209;
      term = o_92092;
      if(k_92092.value == null)
        break Fail76209;
      term = k_92092.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}