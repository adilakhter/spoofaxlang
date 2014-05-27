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

@SuppressWarnings("all") public class once_$Outer$Cookie_0_0 extends Strategy 
{ 
  public static once_$Outer$Cookie_0_0 instance = new once_$Outer$Cookie_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_OuterCookie_0_0");
    Fail23731:
    { 
      IStrategoTerm p_4888 = null;
      TermReference q_4888 = new TermReference();
      TermReference r_4888 = new TermReference();
      TermReference s_4888 = new TermReference();
      IStrategoTerm t_4888 = null;
      IStrategoTerm u_4888 = null;
      IStrategoTerm w_4888 = null;
      IStrategoTerm y_4888 = null;
      if(r_4888.value == null)
        r_4888.value = term;
      else
        if(r_4888.value != term && !r_4888.value.match(term))
          break Fail23731;
      if(q_4888.value == null)
        q_4888.value = term;
      else
        if(q_4888.value != term && !q_4888.value.match(term))
          break Fail23731;
      w_4888 = term;
      y_4888 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, y_4888, trans.const4604, r_4888.value);
      if(term == null)
        break Fail23731;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23731;
      p_4888 = term.getSubterm(0);
      u_4888 = term.getSubterm(1);
      t_4888 = term.getSubterm(2);
      term = p_4888;
      lifted7090 lifted70900 = new lifted7090();
      lifted70900.q_4888 = q_4888;
      lifted70900.r_4888 = r_4888;
      lifted70900.s_4888 = s_4888;
      term = split_fetch_1_0.instance.invoke(context, term, lifted70900);
      if(term == null)
        break Fail23731;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23731;
      term = hashtable_put_0_2.instance.invoke(context, t_4888, u_4888, term);
      if(term == null)
        break Fail23731;
      term = w_4888;
      if(s_4888.value == null)
        break Fail23731;
      term = s_4888.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}