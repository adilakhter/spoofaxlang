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

@SuppressWarnings("all") public class declare_svar_0_0 extends Strategy 
{ 
  public static declare_svar_0_0 instance = new declare_svar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_svar_0_0");
    Fail21724:
    { 
      IStrategoTerm s_4250 = null;
      IStrategoTerm t_4250 = null;
      IStrategoTerm u_4250 = null;
      TermReference v_4250 = new TermReference();
      TermReference w_4250 = new TermReference();
      IStrategoTerm b_4251 = null;
      u_4250 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consVarDec_2 != ((IStrategoAppl)term).getConstructor())
        break Fail21724;
      if(w_4250.value == null)
        w_4250.value = term.getSubterm(0);
      else
        if(w_4250.value != term.getSubterm(0) && !w_4250.value.match(term.getSubterm(0)))
          break Fail21724;
      s_4250 = term.getSubterm(1);
      b_4251 = term;
      IStrategoTerm term11822 = term;
      Success11719:
      { 
        Fail21725:
        { 
          IStrategoTerm x_4250 = null;
          IStrategoTerm e_4251 = null;
          IStrategoTerm f_4251 = null;
          IStrategoTerm h_4251 = null;
          IStrategoTerm i_4251 = null;
          IStrategoTerm j_4251 = null;
          IStrategoTerm y_4250 = null;
          IStrategoTerm k_4251 = null;
          IStrategoTerm m_4251 = null;
          IStrategoTerm n_4251 = null;
          term = newterm_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21725;
          if(v_4250.value == null)
            v_4250.value = term;
          else
            if(v_4250.value != term && !v_4250.value.match(term))
              break Fail21725;
          if(w_4250.value == null || v_4250.value == null)
            break Fail21725;
          term = termFactory.annotateTerm(w_4250.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(v_4250.value, (IStrategoList)trans.constNil3)));
          t_4250 = term;
          x_4250 = term;
          h_4251 = term;
          e_4251 = trans.const4358;
          term = h_4251;
          i_4251 = h_4251;
          if(w_4250.value == null)
            break Fail21725;
          term = termFactory.annotateTerm(termFactory.makeTuple(w_4250.value, trans.constCons1966, trans.constCons1966), checkListAnnos(termFactory, trans.constCons1966));
          f_4251 = term;
          term = i_4251;
          j_4251 = i_4251;
          if(v_4250.value == null)
            break Fail21725;
          term = termFactory.makeTuple(trans.const4397, v_4250.value);
          term = dr_set_rule_0_3.instance.invoke(context, j_4251, e_4251, f_4251, term);
          if(term == null)
            break Fail21725;
          term = x_4250;
          y_4250 = x_4250;
          m_4251 = term;
          k_4251 = trans.const4360;
          n_4251 = m_4251;
          term = termFactory.makeTuple(trans.const4361, u_4250);
          term = dr_set_rule_0_3.instance.invoke(context, n_4251, k_4251, v_4250.value, term);
          if(term == null)
            break Fail21725;
          term = all_keys_$Declare$Cookie_0_0.instance.invoke(context, y_4250);
          if(term == null)
            break Fail21725;
          lifted6643 lifted66430 = new lifted6643();
          lifted66430.v_4250 = v_4250;
          lifted66430.w_4250 = w_4250;
          term = filter_1_0.instance.invoke(context, term, lifted66430);
          if(term == null)
            break Fail21725;
          if(true)
            break Success11719;
        }
        term = term11822;
        IStrategoTerm z_4250 = null;
        IStrategoTerm a_4251 = null;
        IStrategoTerm p_4251 = null;
        z_4250 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21724;
        a_4251 = term;
        p_4251 = z_4250;
        term = report_with_failure_0_2.instance.invoke(context, p_4251, trans.const4398, a_4251);
        if(term == null)
          break Fail21724;
      }
      term = b_4251;
      if(t_4250 == null)
        break Fail21724;
      term = termFactory.makeAppl(Main._consVarDec_2, new IStrategoTerm[]{t_4250, s_4250});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}