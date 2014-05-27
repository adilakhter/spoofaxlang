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
    Fail21670:
    { 
      IStrategoTerm s_4235 = null;
      IStrategoTerm t_4235 = null;
      IStrategoTerm u_4235 = null;
      IStrategoTerm v_4235 = null;
      IStrategoTerm w_4235 = null;
      TermReference x_4235 = new TermReference();
      TermReference y_4235 = new TermReference();
      TermReference z_4235 = new TermReference();
      TermReference a_4236 = new TermReference();
      IStrategoTerm g_4236 = null;
      IStrategoTerm h_4236 = null;
      w_4235 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consRDecT_3 != ((IStrategoAppl)term).getConstructor())
        break Fail21670;
      if(x_4235.value == null)
        x_4235.value = term.getSubterm(0);
      else
        if(x_4235.value != term.getSubterm(0) && !x_4235.value.match(term.getSubterm(0)))
          break Fail21670;
      t_4235 = term.getSubterm(1);
      u_4235 = term.getSubterm(2);
      g_4236 = term;
      IStrategoTerm term11766 = term;
      Success11673:
      { 
        Fail21671:
        { 
          if(x_4235.value == null)
            break Fail21671;
          term = x_4235.value;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)term).getConstructor())
            break Fail21671;
          { 
            if(true)
              break Fail21670;
            if(true)
              break Success11673;
          }
        }
        term = term11766;
      }
      term = g_4236;
      h_4236 = g_4236;
      IStrategoTerm term11767 = term;
      Success11674:
      { 
        Fail21672:
        { 
          IStrategoTerm term11768 = term;
          Success11675:
          { 
            Fail21673:
            { 
              IStrategoTerm i_4236 = null;
              IStrategoTerm j_4236 = null;
              j_4236 = term;
              term = declare_cookie_of_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21673;
              i_4236 = term;
              term = j_4236;
              if(x_4235.value == null)
                break Fail21673;
              term = termFactory.annotateTerm(x_4235.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(i_4236, (IStrategoList)trans.constNil3)));
              s_4235 = term;
              if(true)
                break Success11675;
            }
            term = term11768;
            IStrategoTerm b_4236 = null;
            IStrategoTerm m_4236 = null;
            IStrategoTerm o_4236 = null;
            IStrategoTerm p_4236 = null;
            IStrategoTerm c_4236 = null;
            IStrategoTerm q_4236 = null;
            IStrategoTerm s_4236 = null;
            IStrategoTerm t_4236 = null;
            IStrategoTerm u_4236 = null;
            IStrategoTerm w_4236 = null;
            IStrategoTerm x_4236 = null;
            IStrategoTerm y_4236 = null;
            IStrategoTerm a_4237 = null;
            IStrategoTerm b_4237 = null;
            IStrategoTerm c_4237 = null;
            IStrategoTerm e_4237 = null;
            IStrategoTerm f_4237 = null;
            IStrategoTerm h_4237 = null;
            IStrategoTerm j_4237 = null;
            IStrategoTerm k_4237 = null;
            IStrategoTerm m_4237 = null;
            IStrategoTerm n_4237 = null;
            IStrategoTerm q_4237 = null;
            IStrategoTerm s_4237 = null;
            IStrategoTerm t_4237 = null;
            term = newterm_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21672;
            if(y_4235.value == null)
              y_4235.value = term;
            else
              if(y_4235.value != term && !y_4235.value.match(term))
                break Fail21672;
            if(x_4235.value == null || y_4235.value == null)
              break Fail21672;
            term = termFactory.annotateTerm(x_4235.value, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(y_4235.value, (IStrategoList)trans.constNil3)));
            s_4235 = term;
            term = length_0_0.instance.invoke(context, t_4235);
            if(term == null)
              break Fail21672;
            if(z_4235.value == null)
              z_4235.value = term;
            else
              if(z_4235.value != term && !z_4235.value.match(term))
                break Fail21672;
            term = length_0_0.instance.invoke(context, u_4235);
            if(term == null)
              break Fail21672;
            if(a_4236.value == null)
              a_4236.value = term;
            else
              if(a_4236.value != term && !a_4236.value.match(term))
                break Fail21672;
            if(x_4235.value == null || (z_4235.value == null || a_4236.value == null))
              break Fail21672;
            term = termFactory.makeTuple(x_4235.value, z_4235.value, a_4236.value);
            v_4235 = term;
            b_4236 = term;
            o_4236 = term;
            m_4236 = trans.const4358;
            term = o_4236;
            p_4236 = o_4236;
            if(y_4235.value == null)
              break Fail21672;
            term = termFactory.makeTuple(trans.const4359, y_4235.value);
            term = dr_set_rule_0_3.instance.invoke(context, p_4236, m_4236, v_4235, term);
            if(term == null)
              break Fail21672;
            term = b_4236;
            c_4236 = b_4236;
            s_4236 = term;
            q_4236 = trans.const4358;
            term = s_4236;
            t_4236 = s_4236;
            if(y_4235.value == null)
              break Fail21672;
            term = termFactory.makeTuple(trans.const4359, y_4235.value);
            term = dr_set_rule_0_3.instance.invoke(context, t_4236, q_4236, x_4235.value, term);
            if(term == null)
              break Fail21672;
            term = c_4236;
            w_4236 = term;
            u_4236 = trans.const4360;
            x_4236 = w_4236;
            term = termFactory.makeTuple(trans.const4361, w_4235);
            term = dr_set_rule_0_3.instance.invoke(context, x_4236, u_4236, y_4235.value, term);
            if(term == null)
              break Fail21672;
            a_4237 = trans.const4302;
            y_4236 = trans.const4227;
            b_4237 = a_4237;
            term = declare_dr_rule_0_4.instance.invoke(context, b_4237, x_4235.value, y_4235.value, y_4236, trans.const4386);
            if(term == null)
              break Fail21672;
            e_4237 = trans.const4301;
            c_4237 = trans.const4227;
            f_4237 = e_4237;
            term = declare_dr_rule_0_4.instance.invoke(context, f_4237, x_4235.value, y_4235.value, c_4237, trans.const4387);
            if(term == null)
              break Fail21672;
            term = trans.const4300;
            h_4237 = trans.const4300;
            if(a_4236.value == null)
              break Fail21672;
            term = inc_0_0.instance.invoke(context, a_4236.value);
            if(term == null)
              break Fail21672;
            term = declare_dr_rule_0_4.instance.invoke(context, h_4237, x_4235.value, y_4235.value, z_4235.value, term);
            if(term == null)
              break Fail21672;
            term = trans.const4299;
            j_4237 = trans.const4299;
            if(z_4235.value == null)
              break Fail21672;
            term = inc_0_0.instance.invoke(context, z_4235.value);
            if(term == null)
              break Fail21672;
            term = declare_dr_rule_0_4.instance.invoke(context, j_4237, x_4235.value, y_4235.value, term, a_4236.value);
            if(term == null)
              break Fail21672;
            m_4237 = trans.const4298;
            k_4237 = trans.const4387;
            n_4237 = m_4237;
            term = declare_dr_rule_0_4.instance.invoke(context, n_4237, x_4235.value, y_4235.value, k_4237, trans.const4227);
            if(term == null)
              break Fail21672;
            term = trans.constCons2022;
            lifted6601 lifted66010 = new lifted6601();
            lifted66010.a_4236 = a_4236;
            lifted66010.x_4235 = x_4235;
            lifted66010.y_4235 = y_4235;
            lifted66010.z_4235 = z_4235;
            term = map_1_0.instance.invoke(context, term, lifted66010);
            if(term == null)
              break Fail21672;
            term = trans.const4295;
            s_4237 = trans.const4295;
            if(z_4235.value == null)
              break Fail21672;
            term = inc_0_0.instance.invoke(context, z_4235.value);
            if(term == null)
              break Fail21672;
            q_4237 = term;
            term = s_4237;
            t_4237 = s_4237;
            if(a_4236.value == null)
              break Fail21672;
            term = inc_0_0.instance.invoke(context, a_4236.value);
            if(term == null)
              break Fail21672;
            term = declare_dr_rule_0_4.instance.invoke(context, t_4237, x_4235.value, y_4235.value, q_4237, term);
            if(term == null)
              break Fail21672;
            term = trans.constCons1981;
            lifted6602 lifted66020 = new lifted6602();
            lifted66020.z_4235 = z_4235;
            lifted66020.x_4235 = x_4235;
            lifted66020.y_4235 = y_4235;
            lifted66020.a_4236 = a_4236;
            term = map_1_0.instance.invoke(context, term, lifted66020);
            if(term == null)
              break Fail21672;
            term = trans.constCons2032;
            lifted6603 lifted66030 = new lifted6603();
            lifted66030.x_4235 = x_4235;
            lifted66030.y_4235 = y_4235;
            lifted66030.z_4235 = z_4235;
            lifted66030.a_4236 = a_4236;
            term = map_1_0.instance.invoke(context, term, lifted66030);
            if(term == null)
              break Fail21672;
          }
          if(true)
            break Success11674;
        }
        term = term11767;
        IStrategoTerm e_4236 = null;
        IStrategoTerm f_4236 = null;
        IStrategoTerm x_4237 = null;
        e_4236 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21670;
        f_4236 = term;
        x_4237 = e_4236;
        term = report_with_failure_0_2.instance.invoke(context, x_4237, trans.const4388, f_4236);
        if(term == null)
          break Fail21670;
      }
      term = h_4236;
      if(s_4235 == null)
        break Fail21670;
      term = termFactory.makeAppl(Main._consRDecT_3, new IStrategoTerm[]{s_4235, t_4235, u_4235});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}