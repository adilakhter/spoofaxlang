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
    Fail23757:
    { 
      IStrategoTerm t_4892 = null;
      TermReference u_4892 = new TermReference();
      TermReference v_4892 = new TermReference();
      IStrategoTerm w_4892 = null;
      IStrategoTerm x_4892 = null;
      IStrategoTerm z_4892 = null;
      IStrategoTerm a_4893 = null;
      IStrategoTerm c_4893 = null;
      IStrategoTerm d_4893 = null;
      if(u_4892.value == null)
        u_4892.value = term;
      else
        if(u_4892.value != term && !u_4892.value.match(term))
          break Fail23757;
      z_4892 = term;
      c_4893 = term;
      a_4893 = trans.const4611;
      d_4893 = c_4893;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, d_4893, a_4893, trans.constCons2047);
      if(term == null)
        break Fail23757;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23757;
      t_4892 = term.getSubterm(0);
      x_4892 = term.getSubterm(1);
      w_4892 = term.getSubterm(2);
      term = t_4892;
      lifted7099 lifted70990 = new lifted7099();
      lifted70990.u_4892 = u_4892;
      lifted70990.v_4892 = v_4892;
      term = split_fetch_1_0.instance.invoke(context, term, lifted70990);
      if(term == null)
        break Fail23757;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23757;
      term = hashtable_put_0_2.instance.invoke(context, w_4892, x_4892, term);
      if(term == null)
        break Fail23757;
      term = z_4892;
      if(v_4892.value == null)
        break Fail23757;
      term = v_4892.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}