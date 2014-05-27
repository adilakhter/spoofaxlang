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

@SuppressWarnings("all") public class redeclare_definition_0_0 extends Strategy 
{ 
  public static redeclare_definition_0_0 instance = new redeclare_definition_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("redeclare_definition_0_0");
    Fail23073:
    { 
      IStrategoTerm b_4776 = null;
      IStrategoTerm c_4776 = null;
      IStrategoTerm d_4776 = null;
      IStrategoTerm i_4776 = null;
      d_4776 = term;
      i_4776 = term;
      IStrategoTerm term12400 = term;
      Success12325:
      { 
        Fail23074:
        { 
          IStrategoTerm e_4776 = null;
          IStrategoTerm n_4776 = null;
          IStrategoTerm p_4776 = null;
          IStrategoTerm q_4776 = null;
          IStrategoTerm f_4776 = null;
          IStrategoTerm r_4776 = null;
          IStrategoTerm t_4776 = null;
          IStrategoTerm u_4776 = null;
          term = signature_of_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23074;
          b_4776 = term;
          term = newterm_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23074;
          c_4776 = term;
          e_4776 = term;
          p_4776 = term;
          n_4776 = trans.const4568;
          q_4776 = p_4776;
          term = termFactory.makeTuple(trans.const4569, c_4776);
          term = dr_set_rule_0_3.instance.invoke(context, q_4776, n_4776, b_4776, term);
          if(term == null)
            break Fail23074;
          term = e_4776;
          f_4776 = e_4776;
          t_4776 = term;
          r_4776 = trans.const4570;
          u_4776 = t_4776;
          term = termFactory.makeTuple(trans.const4571, d_4776);
          term = dr_set_rule_0_3.instance.invoke(context, u_4776, r_4776, c_4776, term);
          if(term == null)
            break Fail23074;
          term = f_4776;
          if(true)
            break Success12325;
        }
        term = term12400;
        IStrategoTerm g_4776 = null;
        IStrategoTerm h_4776 = null;
        IStrategoTerm w_4776 = null;
        g_4776 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23073;
        h_4776 = term;
        w_4776 = g_4776;
        term = report_with_failure_0_2.instance.invoke(context, w_4776, trans.const4573, h_4776);
        if(term == null)
          break Fail23073;
      }
      term = i_4776;
      if(c_4776 == null)
        break Fail23073;
      term = c_4776;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}