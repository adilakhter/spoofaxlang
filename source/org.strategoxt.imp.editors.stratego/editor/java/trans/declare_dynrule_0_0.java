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

@SuppressWarnings("all") public class declare_dynrule_0_0 extends Strategy 
{ 
  public static declare_dynrule_0_0 instance = new declare_dynrule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_dynrule_0_0");
    Fail23146:
    { 
      IStrategoTerm k_4789 = null;
      IStrategoTerm l_4789 = null;
      IStrategoTerm m_4789 = null;
      IStrategoTerm n_4789 = null;
      IStrategoTerm o_4789 = null;
      TermReference p_4789 = new TermReference();
      TermReference q_4789 = new TermReference();
      TermReference r_4789 = new TermReference();
      TermReference s_4789 = new TermReference();
      IStrategoTerm y_4789 = null;
      IStrategoTerm z_4789 = null;
      o_4789 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail23146;
      if(p_4789.value == null)
        p_4789.value = term.getSubterm(0);
      else
        if(p_4789.value != term.getSubterm(0) && !p_4789.value.match(term.getSubterm(0)))
          break Fail23146;
      l_4789 = term.getSubterm(1);
      m_4789 = term.getSubterm(2);
      y_4789 = term;
      IStrategoTerm term12475 = term;
      Success12382:
      { 
        Fail23147:
        { 
          if(p_4789.value == null)
            break Fail23147;
          term = p_4789.value;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
            break Fail23147;
          { 
            if(true)
              break Fail23146;
            if(true)
              break Success12382;
          }
        }
        term = term12475;
      }
      term = y_4789;
      z_4789 = y_4789;
      IStrategoTerm term12476 = term;
      Success12383:
      { 
        Fail23148:
        { 
          IStrategoTerm term12477 = term;
          Success12384:
          { 
            Fail23149:
            { 
              IStrategoTerm a_4790 = null;
              IStrategoTerm b_4790 = null;
              b_4790 = term;
              term = declare_cookie_of_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23149;
              a_4790 = term;
              term = b_4790;
              if(p_4789.value == null)
                break Fail23149;
              term = termFactory.annotateTerm(p_4789.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(a_4790, (IStrategoList)trans.constNil4)));
              k_4789 = term;
              if(true)
                break Success12384;
            }
            term = term12477;
            IStrategoTerm t_4789 = null;
            IStrategoTerm e_4790 = null;
            IStrategoTerm g_4790 = null;
            IStrategoTerm h_4790 = null;
            IStrategoTerm u_4789 = null;
            IStrategoTerm i_4790 = null;
            IStrategoTerm k_4790 = null;
            IStrategoTerm l_4790 = null;
            IStrategoTerm m_4790 = null;
            IStrategoTerm o_4790 = null;
            IStrategoTerm p_4790 = null;
            IStrategoTerm q_4790 = null;
            IStrategoTerm s_4790 = null;
            IStrategoTerm t_4790 = null;
            IStrategoTerm u_4790 = null;
            IStrategoTerm w_4790 = null;
            IStrategoTerm x_4790 = null;
            IStrategoTerm z_4790 = null;
            IStrategoTerm b_4791 = null;
            IStrategoTerm c_4791 = null;
            IStrategoTerm e_4791 = null;
            IStrategoTerm f_4791 = null;
            IStrategoTerm i_4791 = null;
            IStrategoTerm k_4791 = null;
            IStrategoTerm l_4791 = null;
            term = newterm_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23148;
            if(q_4789.value == null)
              q_4789.value = term;
            else
              if(q_4789.value != term && !q_4789.value.match(term))
                break Fail23148;
            if(p_4789.value == null || q_4789.value == null)
              break Fail23148;
            term = termFactory.annotateTerm(p_4789.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(q_4789.value, (IStrategoList)trans.constNil4)));
            k_4789 = term;
            term = length_0_0.instance.invoke(context, l_4789);
            if(term == null)
              break Fail23148;
            if(r_4789.value == null)
              r_4789.value = term;
            else
              if(r_4789.value != term && !r_4789.value.match(term))
                break Fail23148;
            term = length_0_0.instance.invoke(context, m_4789);
            if(term == null)
              break Fail23148;
            if(s_4789.value == null)
              s_4789.value = term;
            else
              if(s_4789.value != term && !s_4789.value.match(term))
                break Fail23148;
            if(p_4789.value == null || (r_4789.value == null || s_4789.value == null))
              break Fail23148;
            term = termFactory.makeTuple(p_4789.value, r_4789.value, s_4789.value);
            n_4789 = term;
            t_4789 = term;
            g_4790 = term;
            e_4790 = trans.const4568;
            term = g_4790;
            h_4790 = g_4790;
            if(q_4789.value == null)
              break Fail23148;
            term = termFactory.makeTuple(trans.const4569, q_4789.value);
            term = dr_set_rule_0_3.instance.invoke(context, h_4790, e_4790, n_4789, term);
            if(term == null)
              break Fail23148;
            term = t_4789;
            u_4789 = t_4789;
            k_4790 = term;
            i_4790 = trans.const4568;
            term = k_4790;
            l_4790 = k_4790;
            if(q_4789.value == null)
              break Fail23148;
            term = termFactory.makeTuple(trans.const4569, q_4789.value);
            term = dr_set_rule_0_3.instance.invoke(context, l_4790, i_4790, p_4789.value, term);
            if(term == null)
              break Fail23148;
            term = u_4789;
            o_4790 = term;
            m_4790 = trans.const4570;
            p_4790 = o_4790;
            term = termFactory.makeTuple(trans.const4571, o_4789);
            term = dr_set_rule_0_3.instance.invoke(context, p_4790, m_4790, q_4789.value, term);
            if(term == null)
              break Fail23148;
            s_4790 = trans.const4512;
            q_4790 = trans.const4437;
            t_4790 = s_4790;
            term = declare_dr_rule_0_4.instance.invoke(context, t_4790, p_4789.value, q_4789.value, q_4790, trans.const4596);
            if(term == null)
              break Fail23148;
            w_4790 = trans.const4511;
            u_4790 = trans.const4437;
            x_4790 = w_4790;
            term = declare_dr_rule_0_4.instance.invoke(context, x_4790, p_4789.value, q_4789.value, u_4790, trans.const4597);
            if(term == null)
              break Fail23148;
            term = trans.const4510;
            z_4790 = trans.const4510;
            if(s_4789.value == null)
              break Fail23148;
            term = inc_0_0.instance.invoke(context, s_4789.value);
            if(term == null)
              break Fail23148;
            term = declare_dr_rule_0_4.instance.invoke(context, z_4790, p_4789.value, q_4789.value, r_4789.value, term);
            if(term == null)
              break Fail23148;
            term = trans.const4509;
            b_4791 = trans.const4509;
            if(r_4789.value == null)
              break Fail23148;
            term = inc_0_0.instance.invoke(context, r_4789.value);
            if(term == null)
              break Fail23148;
            term = declare_dr_rule_0_4.instance.invoke(context, b_4791, p_4789.value, q_4789.value, term, s_4789.value);
            if(term == null)
              break Fail23148;
            e_4791 = trans.const4508;
            c_4791 = trans.const4597;
            f_4791 = e_4791;
            term = declare_dr_rule_0_4.instance.invoke(context, f_4791, p_4789.value, q_4789.value, c_4791, trans.const4437);
            if(term == null)
              break Fail23148;
            term = trans.constCons2103;
            lifted6872 lifted68720 = new lifted6872();
            lifted68720.s_4789 = s_4789;
            lifted68720.p_4789 = p_4789;
            lifted68720.q_4789 = q_4789;
            lifted68720.r_4789 = r_4789;
            term = map_1_0.instance.invoke(context, term, lifted68720);
            if(term == null)
              break Fail23148;
            term = trans.const4505;
            k_4791 = trans.const4505;
            if(r_4789.value == null)
              break Fail23148;
            term = inc_0_0.instance.invoke(context, r_4789.value);
            if(term == null)
              break Fail23148;
            i_4791 = term;
            term = k_4791;
            l_4791 = k_4791;
            if(s_4789.value == null)
              break Fail23148;
            term = inc_0_0.instance.invoke(context, s_4789.value);
            if(term == null)
              break Fail23148;
            term = declare_dr_rule_0_4.instance.invoke(context, l_4791, p_4789.value, q_4789.value, i_4791, term);
            if(term == null)
              break Fail23148;
            term = trans.constCons2062;
            lifted6873 lifted68730 = new lifted6873();
            lifted68730.r_4789 = r_4789;
            lifted68730.p_4789 = p_4789;
            lifted68730.q_4789 = q_4789;
            lifted68730.s_4789 = s_4789;
            term = map_1_0.instance.invoke(context, term, lifted68730);
            if(term == null)
              break Fail23148;
            term = trans.constCons2113;
            lifted6874 lifted68740 = new lifted6874();
            lifted68740.p_4789 = p_4789;
            lifted68740.q_4789 = q_4789;
            lifted68740.r_4789 = r_4789;
            lifted68740.s_4789 = s_4789;
            term = map_1_0.instance.invoke(context, term, lifted68740);
            if(term == null)
              break Fail23148;
          }
          if(true)
            break Success12383;
        }
        term = term12476;
        IStrategoTerm w_4789 = null;
        IStrategoTerm x_4789 = null;
        IStrategoTerm p_4791 = null;
        w_4789 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23146;
        x_4789 = term;
        p_4791 = w_4789;
        term = report_with_failure_0_2.instance.invoke(context, p_4791, trans.const4598, x_4789);
        if(term == null)
          break Fail23146;
      }
      term = z_4789;
      if(k_4789 == null)
        break Fail23146;
      term = termFactory.makeAppl(Main._consRDecT_3, new IStrategoTerm[]{k_4789, l_4789, m_4789});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}