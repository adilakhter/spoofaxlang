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

@SuppressWarnings("all") public class once_$Content$Proposals_0_0 extends Strategy 
{ 
  public static once_$Content$Proposals_0_0 instance = new once_$Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_ContentProposals_0_0");
    Fail22281:
    { 
      IStrategoTerm b_4339 = null;
      TermReference c_4339 = new TermReference();
      TermReference d_4339 = new TermReference();
      IStrategoTerm e_4339 = null;
      IStrategoTerm f_4339 = null;
      IStrategoTerm h_4339 = null;
      IStrategoTerm i_4339 = null;
      IStrategoTerm k_4339 = null;
      IStrategoTerm l_4339 = null;
      if(c_4339.value == null)
        c_4339.value = term;
      else
        if(c_4339.value != term && !c_4339.value.match(term))
          break Fail22281;
      h_4339 = term;
      k_4339 = term;
      i_4339 = trans.const4401;
      l_4339 = k_4339;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, l_4339, i_4339, trans.constCons1966);
      if(term == null)
        break Fail22281;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22281;
      b_4339 = term.getSubterm(0);
      f_4339 = term.getSubterm(1);
      e_4339 = term.getSubterm(2);
      term = b_4339;
      lifted6828 lifted68280 = new lifted6828();
      lifted68280.c_4339 = c_4339;
      lifted68280.d_4339 = d_4339;
      term = split_fetch_1_0.instance.invoke(context, term, lifted68280);
      if(term == null)
        break Fail22281;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22281;
      term = hashtable_put_0_2.instance.invoke(context, e_4339, f_4339, term);
      if(term == null)
        break Fail22281;
      term = h_4339;
      if(d_4339.value == null)
        break Fail22281;
      term = d_4339.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}