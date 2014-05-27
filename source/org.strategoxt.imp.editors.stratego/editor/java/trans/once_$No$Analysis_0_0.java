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

@SuppressWarnings("all") public class once_$No$Analysis_0_0 extends Strategy 
{ 
  public static once_$No$Analysis_0_0 instance = new once_$No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_NoAnalysis_0_0");
    Fail23550:
    { 
      IStrategoTerm h_4858 = null;
      TermReference i_4858 = new TermReference();
      TermReference j_4858 = new TermReference();
      TermReference k_4858 = new TermReference();
      IStrategoTerm l_4858 = null;
      IStrategoTerm m_4858 = null;
      IStrategoTerm o_4858 = null;
      IStrategoTerm p_4858 = null;
      IStrategoTerm r_4858 = null;
      IStrategoTerm s_4858 = null;
      if(j_4858.value == null)
        j_4858.value = term;
      else
        if(j_4858.value != term && !j_4858.value.match(term))
          break Fail23550;
      if(i_4858.value == null)
        i_4858.value = term;
      else
        if(i_4858.value != term && !i_4858.value.match(term))
          break Fail23550;
      o_4858 = term;
      r_4858 = term;
      p_4858 = trans.const4559;
      s_4858 = r_4858;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, s_4858, p_4858, trans.constCons2047);
      if(term == null)
        break Fail23550;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23550;
      h_4858 = term.getSubterm(0);
      m_4858 = term.getSubterm(1);
      l_4858 = term.getSubterm(2);
      term = h_4858;
      lifted7026 lifted70260 = new lifted7026();
      lifted70260.i_4858 = i_4858;
      lifted70260.j_4858 = j_4858;
      lifted70260.k_4858 = k_4858;
      term = split_fetch_1_0.instance.invoke(context, term, lifted70260);
      if(term == null)
        break Fail23550;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23550;
      term = hashtable_put_0_2.instance.invoke(context, l_4858, m_4858, term);
      if(term == null)
        break Fail23550;
      term = o_4858;
      if(k_4858.value == null)
        break Fail23550;
      term = k_4858.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}