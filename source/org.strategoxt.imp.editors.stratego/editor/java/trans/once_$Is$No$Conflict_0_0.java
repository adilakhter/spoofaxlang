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

@SuppressWarnings("all") public class once_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static once_$Is$No$Conflict_0_0 instance = new once_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_IsNoConflict_0_0");
    Fail22307:
    { 
      IStrategoTerm h_4343 = null;
      TermReference i_4343 = new TermReference();
      TermReference j_4343 = new TermReference();
      TermReference k_4343 = new TermReference();
      IStrategoTerm l_4343 = null;
      IStrategoTerm m_4343 = null;
      IStrategoTerm o_4343 = null;
      IStrategoTerm q_4343 = null;
      if(j_4343.value == null)
        j_4343.value = term;
      else
        if(j_4343.value != term && !j_4343.value.match(term))
          break Fail22307;
      if(i_4343.value == null)
        i_4343.value = term;
      else
        if(i_4343.value != term && !i_4343.value.match(term))
          break Fail22307;
      o_4343 = term;
      q_4343 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, q_4343, trans.const4427, j_4343.value);
      if(term == null)
        break Fail22307;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22307;
      h_4343 = term.getSubterm(0);
      m_4343 = term.getSubterm(1);
      l_4343 = term.getSubterm(2);
      term = h_4343;
      lifted6837 lifted68370 = new lifted6837();
      lifted68370.i_4343 = i_4343;
      lifted68370.j_4343 = j_4343;
      lifted68370.k_4343 = k_4343;
      term = split_fetch_1_0.instance.invoke(context, term, lifted68370);
      if(term == null)
        break Fail22307;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22307;
      term = hashtable_put_0_2.instance.invoke(context, l_4343, m_4343, term);
      if(term == null)
        break Fail22307;
      term = o_4343;
      if(k_4343.value == null)
        break Fail22307;
      term = k_4343.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}