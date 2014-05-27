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

@SuppressWarnings("all") public class once_$Current$File_0_0 extends Strategy 
{ 
  public static once_$Current$File_0_0 instance = new once_$Current$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_CurrentFile_0_0");
    Fail23420:
    { 
      IStrategoTerm g_4836 = null;
      TermReference h_4836 = new TermReference();
      TermReference i_4836 = new TermReference();
      IStrategoTerm j_4836 = null;
      IStrategoTerm k_4836 = null;
      IStrategoTerm m_4836 = null;
      IStrategoTerm n_4836 = null;
      IStrategoTerm p_4836 = null;
      IStrategoTerm q_4836 = null;
      if(h_4836.value == null)
        h_4836.value = term;
      else
        if(h_4836.value != term && !h_4836.value.match(term))
          break Fail23420;
      m_4836 = term;
      p_4836 = term;
      n_4836 = trans.const4473;
      q_4836 = p_4836;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, q_4836, n_4836, trans.constCons2047);
      if(term == null)
        break Fail23420;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23420;
      g_4836 = term.getSubterm(0);
      k_4836 = term.getSubterm(1);
      j_4836 = term.getSubterm(2);
      term = g_4836;
      lifted6981 lifted69810 = new lifted6981();
      lifted69810.h_4836 = h_4836;
      lifted69810.i_4836 = i_4836;
      term = split_fetch_1_0.instance.invoke(context, term, lifted69810);
      if(term == null)
        break Fail23420;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23420;
      term = hashtable_put_0_2.instance.invoke(context, j_4836, k_4836, term);
      if(term == null)
        break Fail23420;
      term = m_4836;
      if(i_4836.value == null)
        break Fail23420;
      term = i_4836.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}