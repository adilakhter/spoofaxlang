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

@SuppressWarnings("all") public class once_$Is$Imported_0_0 extends Strategy 
{ 
  public static once_$Is$Imported_0_0 instance = new once_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsImported_0_0");
    Fail23446:
    { 
      IStrategoTerm m_4840 = null;
      TermReference n_4840 = new TermReference();
      TermReference o_4840 = new TermReference();
      TermReference p_4840 = new TermReference();
      IStrategoTerm q_4840 = null;
      IStrategoTerm r_4840 = null;
      IStrategoTerm t_4840 = null;
      IStrategoTerm v_4840 = null;
      if(o_4840.value == null)
        o_4840.value = term;
      else
        if(o_4840.value != term && !o_4840.value.match(term))
          break Fail23446;
      if(n_4840.value == null)
        n_4840.value = term;
      else
        if(n_4840.value != term && !n_4840.value.match(term))
          break Fail23446;
      t_4840 = term;
      v_4840 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, v_4840, trans.const4537, o_4840.value);
      if(term == null)
        break Fail23446;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23446;
      m_4840 = term.getSubterm(0);
      r_4840 = term.getSubterm(1);
      q_4840 = term.getSubterm(2);
      term = m_4840;
      lifted6990 lifted69900 = new lifted6990();
      lifted69900.n_4840 = n_4840;
      lifted69900.o_4840 = o_4840;
      lifted69900.p_4840 = p_4840;
      term = split_fetch_1_0.instance.invoke(context, term, lifted69900);
      if(term == null)
        break Fail23446;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23446;
      term = hashtable_put_0_2.instance.invoke(context, q_4840, r_4840, term);
      if(term == null)
        break Fail23446;
      term = t_4840;
      if(p_4840.value == null)
        break Fail23446;
      term = p_4840.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}