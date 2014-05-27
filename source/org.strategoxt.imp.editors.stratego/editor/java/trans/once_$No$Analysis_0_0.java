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

@SuppressWarnings("all") public class once_$No$Analysis_0_0 extends Strategy 
{ 
  public static once_$No$Analysis_0_0 instance = new once_$No$Analysis_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("once_NoAnalysis_0_0");
    Fail22074:
    { 
      IStrategoTerm p_4304 = null;
      TermReference q_4304 = new TermReference();
      TermReference r_4304 = new TermReference();
      TermReference s_4304 = new TermReference();
      IStrategoTerm t_4304 = null;
      IStrategoTerm u_4304 = null;
      IStrategoTerm w_4304 = null;
      IStrategoTerm x_4304 = null;
      IStrategoTerm z_4304 = null;
      IStrategoTerm a_4305 = null;
      if(r_4304.value == null)
        r_4304.value = term;
      else
        if(r_4304.value != term && !r_4304.value.match(term))
          break Fail22074;
      if(q_4304.value == null)
        q_4304.value = term;
      else
        if(q_4304.value != term && !q_4304.value.match(term))
          break Fail22074;
      w_4304 = term;
      z_4304 = term;
      x_4304 = trans.const4349;
      a_4305 = z_4304;
      term = dr_lookup_rule_pointer_0_2.instance.invoke(context, a_4305, x_4304, trans.constCons1966);
      if(term == null)
        break Fail22074;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22074;
      p_4304 = term.getSubterm(0);
      u_4304 = term.getSubterm(1);
      t_4304 = term.getSubterm(2);
      term = p_4304;
      lifted6755 lifted67550 = new lifted6755();
      lifted67550.q_4304 = q_4304;
      lifted67550.r_4304 = r_4304;
      lifted67550.s_4304 = s_4304;
      term = split_fetch_1_0.instance.invoke(context, term, lifted67550);
      if(term == null)
        break Fail22074;
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22074;
      term = hashtable_put_0_2.instance.invoke(context, t_4304, u_4304, term);
      if(term == null)
        break Fail22074;
      term = w_4304;
      if(s_4304.value == null)
        break Fail22074;
      term = s_4304.value;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}