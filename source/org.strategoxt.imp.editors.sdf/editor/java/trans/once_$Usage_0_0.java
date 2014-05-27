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

@SuppressWarnings("all") public class once_$Usage_0_0 extends Strategy 
{ 
  public static once_$Usage_0_0 instance = new once_$Usage_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_Usage_0_0");
    Fail76314:
    { 
      IStrategoTerm s_92109 = null;
      TermReference t_92109 = new TermReference();
      TermReference u_92109 = new TermReference();
      TermReference v_92109 = new TermReference();
      IStrategoTerm w_92109 = null;
      IStrategoTerm x_92109 = null;
      IStrategoTerm z_92109 = null;
      IStrategoTerm b_92110 = null;
      if(u_92109.value == null)
        u_92109.value = term;
      else
        if(u_92109.value != term && !u_92109.value.match(term))
          break Fail76314;
      if(t_92109.value == null)
        t_92109.value = term;
      else
        if(t_92109.value != term && !t_92109.value.match(term))
          break Fail76314;
      z_92109 = term;
      b_92110 = term;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, b_92110, trans.const15535, u_92109.value);
      if(term == null)
        break Fail76314;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail76314;
      s_92109 = term.getSubterm(0);
      x_92109 = term.getSubterm(1);
      w_92109 = term.getSubterm(2);
      term = s_92109;
      lifted21655 lifted216550 = new lifted21655();
      lifted216550.t_92109 = t_92109;
      lifted216550.u_92109 = u_92109;
      lifted216550.v_92109 = v_92109;
      term = split_fetch_1_0.instance.invoke(context, term, lifted216550);
      if(term == null)
        break Fail76314;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail76314;
      term = hashtable_put_0_2.instance.invoke(context, w_92109, x_92109, term);
      if(term == null)
        break Fail76314;
      term = z_92109;
      if(v_92109.value == null)
        break Fail76314;
      term = v_92109.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}