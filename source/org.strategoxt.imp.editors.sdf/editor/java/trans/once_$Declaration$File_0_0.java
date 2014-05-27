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

@SuppressWarnings("all") public class once_$Declaration$File_0_0 extends Strategy 
{ 
  public static once_$Declaration$File_0_0 instance = new once_$Declaration$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_DeclarationFile_0_0");
    Fail76261:
    { 
      IStrategoTerm i_92101 = null;
      TermReference j_92101 = new TermReference();
      TermReference k_92101 = new TermReference();
      TermReference l_92101 = new TermReference();
      IStrategoTerm m_92101 = null;
      IStrategoTerm n_92101 = null;
      IStrategoTerm p_92101 = null;
      IStrategoTerm r_92101 = null;
      if(k_92101.value == null)
        k_92101.value = term;
      else
        if(k_92101.value != term && !k_92101.value.match(term))
          break Fail76261;
      if(j_92101.value == null)
        j_92101.value = term;
      else
        if(j_92101.value != term && !j_92101.value.match(term))
          break Fail76261;
      p_92101 = term;
      r_92101 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, r_92101, trans.const15524, k_92101.value);
      if(term == null)
        break Fail76261;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail76261;
      i_92101 = term.getSubterm(0);
      n_92101 = term.getSubterm(1);
      m_92101 = term.getSubterm(2);
      term = i_92101;
      lifted21637 lifted216370 = new lifted21637();
      lifted216370.j_92101 = j_92101;
      lifted216370.k_92101 = k_92101;
      lifted216370.l_92101 = l_92101;
      term = split_fetch_1_0.instance.invoke(context, term, lifted216370);
      if(term == null)
        break Fail76261;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail76261;
      term = hashtable_put_0_2.instance.invoke(context, m_92101, n_92101, term);
      if(term == null)
        break Fail76261;
      term = p_92101;
      if(l_92101.value == null)
        break Fail76261;
      term = l_92101.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}