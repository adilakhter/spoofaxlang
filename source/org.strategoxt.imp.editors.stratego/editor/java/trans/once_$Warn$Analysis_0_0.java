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

@SuppressWarnings("all") public class once_$Warn$Analysis_0_0 extends Strategy 
{ 
  public static once_$Warn$Analysis_0_0 instance = new once_$Warn$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_WarnAnalysis_0_0");
    Fail23524:
    { 
      IStrategoTerm n_4853 = null;
      TermReference o_4853 = new TermReference();
      TermReference p_4853 = new TermReference();
      TermReference q_4853 = new TermReference();
      IStrategoTerm r_4853 = null;
      IStrategoTerm s_4853 = null;
      IStrategoTerm u_4853 = null;
      IStrategoTerm v_4853 = null;
      IStrategoTerm x_4853 = null;
      IStrategoTerm y_4853 = null;
      if(p_4853.value == null)
        p_4853.value = term;
      else
        if(p_4853.value != term && !p_4853.value.match(term))
          break Fail23524;
      if(o_4853.value == null)
        o_4853.value = term;
      else
        if(o_4853.value != term && !o_4853.value.match(term))
          break Fail23524;
      u_4853 = term;
      x_4853 = term;
      v_4853 = trans.const4562;
      y_4853 = x_4853;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, y_4853, v_4853, trans.constCons2047);
      if(term == null)
        break Fail23524;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23524;
      n_4853 = term.getSubterm(0);
      s_4853 = term.getSubterm(1);
      r_4853 = term.getSubterm(2);
      term = n_4853;
      lifted7017 lifted70170 = new lifted7017();
      lifted70170.o_4853 = o_4853;
      lifted70170.p_4853 = p_4853;
      lifted70170.q_4853 = q_4853;
      term = split_fetch_1_0.instance.invoke(context, term, lifted70170);
      if(term == null)
        break Fail23524;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail23524;
      term = hashtable_put_0_2.instance.invoke(context, r_4853, s_4853, term);
      if(term == null)
        break Fail23524;
      term = u_4853;
      if(q_4853.value == null)
        break Fail23524;
      term = q_4853.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}