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
    Fail21597:
    { 
      IStrategoTerm j_4222 = null;
      IStrategoTerm k_4222 = null;
      IStrategoTerm l_4222 = null;
      IStrategoTerm q_4222 = null;
      l_4222 = term;
      q_4222 = term;
      IStrategoTerm term11691 = term;
      Success11616:
      { 
        Fail21598:
        { 
          IStrategoTerm m_4222 = null;
          IStrategoTerm v_4222 = null;
          IStrategoTerm x_4222 = null;
          IStrategoTerm y_4222 = null;
          IStrategoTerm n_4222 = null;
          IStrategoTerm z_4222 = null;
          IStrategoTerm b_4223 = null;
          IStrategoTerm c_4223 = null;
          term = signature_of_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21598;
          j_4222 = term;
          term = newterm_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21598;
          k_4222 = term;
          m_4222 = term;
          x_4222 = term;
          v_4222 = trans.const4358;
          y_4222 = x_4222;
          term = termFactory.makeTuple(trans.const4359, k_4222);
          term = dr_set_rule_0_3.instance.invoke(context, y_4222, v_4222, j_4222, term);
          if(term == null)
            break Fail21598;
          term = m_4222;
          n_4222 = m_4222;
          b_4223 = term;
          z_4222 = trans.const4360;
          c_4223 = b_4223;
          term = termFactory.makeTuple(trans.const4361, l_4222);
          term = dr_set_rule_0_3.instance.invoke(context, c_4223, z_4222, k_4222, term);
          if(term == null)
            break Fail21598;
          term = n_4222;
          if(true)
            break Success11616;
        }
        term = term11691;
        IStrategoTerm o_4222 = null;
        IStrategoTerm p_4222 = null;
        IStrategoTerm e_4223 = null;
        o_4222 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21597;
        p_4222 = term;
        e_4223 = o_4222;
        term = report_with_failure_0_2.instance.invoke(context, e_4223, trans.const4363, p_4222);
        if(term == null)
          break Fail21597;
      }
      term = q_4222;
      if(k_4222 == null)
        break Fail21597;
      term = k_4222;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}