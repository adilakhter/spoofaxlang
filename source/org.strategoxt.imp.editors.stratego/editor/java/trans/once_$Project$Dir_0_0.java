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

@SuppressWarnings("all") public class once_$Project$Dir_0_0 extends Strategy 
{ 
  public static once_$Project$Dir_0_0 instance = new once_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_ProjectDir_0_0");
    Fail21918:
    { 
      IStrategoTerm h_4278 = null;
      TermReference i_4278 = new TermReference();
      TermReference j_4278 = new TermReference();
      IStrategoTerm k_4278 = null;
      IStrategoTerm l_4278 = null;
      IStrategoTerm n_4278 = null;
      IStrategoTerm o_4278 = null;
      IStrategoTerm q_4278 = null;
      IStrategoTerm r_4278 = null;
      if(i_4278.value == null)
        i_4278.value = term;
      else
        if(i_4278.value != term && !i_4278.value.match(term))
          break Fail21918;
      n_4278 = term;
      q_4278 = term;
      o_4278 = trans.const4265;
      r_4278 = q_4278;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, r_4278, o_4278, trans.constCons1966);
      if(term == null)
        break Fail21918;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21918;
      h_4278 = term.getSubterm(0);
      l_4278 = term.getSubterm(1);
      k_4278 = term.getSubterm(2);
      term = h_4278;
      lifted6701 lifted67010 = new lifted6701();
      lifted67010.i_4278 = i_4278;
      lifted67010.j_4278 = j_4278;
      term = split_fetch_1_0.instance.invoke(context, term, lifted67010);
      if(term == null)
        break Fail21918;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21918;
      term = hashtable_put_0_2.instance.invoke(context, k_4278, l_4278, term);
      if(term == null)
        break Fail21918;
      term = n_4278;
      if(j_4278.value == null)
        break Fail21918;
      term = j_4278.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}