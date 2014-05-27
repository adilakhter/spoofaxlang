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

@SuppressWarnings("all") public class declare_bodies_0_0 extends Strategy 
{ 
  public static declare_bodies_0_0 instance = new declare_bodies_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_bodies_0_0");
    Fail23162:
    { 
      IStrategoTerm term12490 = term;
      Success12394:
      { 
        Fail23163:
        { 
          IStrategoTerm m_4801 = null;
          TermReference n_4801 = new TermReference();
          TermReference o_4801 = new TermReference();
          TermReference p_4801 = new TermReference();
          TermReference q_4801 = new TermReference();
          TermReference r_4801 = new TermReference();
          TermReference s_4801 = new TermReference();
          IStrategoTerm v_4801 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
            break Fail23163;
          m_4801 = term.getSubterm(0);
          if(n_4801.value == null)
            n_4801.value = term.getSubterm(1);
          else
            if(n_4801.value != term.getSubterm(1) && !n_4801.value.match(term.getSubterm(1)))
              break Fail23163;
          if(p_4801.value == null)
            p_4801.value = term.getSubterm(2);
          else
            if(p_4801.value != term.getSubterm(2) && !p_4801.value.match(term.getSubterm(2)))
              break Fail23163;
          if(r_4801.value == null)
            r_4801.value = term.getSubterm(3);
          else
            if(r_4801.value != term.getSubterm(3) && !r_4801.value.match(term.getSubterm(3)))
              break Fail23163;
          v_4801 = term;
          IStrategoTerm term12491 = term;
          Success12395:
          { 
            Fail23164:
            { 
              IStrategoTerm w_4801 = null;
              IStrategoTerm x_4801 = null;
              x_4801 = term;
              w_4801 = trans.const4568;
              term = x_4801;
              lifted6879 lifted68790 = new lifted6879();
              lifted68790.n_4801 = n_4801;
              lifted68790.o_4801 = o_4801;
              lifted68790.p_4801 = p_4801;
              lifted68790.q_4801 = q_4801;
              lifted68790.r_4801 = r_4801;
              lifted68790.s_4801 = s_4801;
              term = dr_scope_1_1.instance.invoke(context, term, lifted68790, w_4801);
              if(term == null)
                break Fail23164;
              if(true)
                break Success12395;
            }
            term = term12491;
            IStrategoTerm t_4801 = null;
            IStrategoTerm u_4801 = null;
            IStrategoTerm z_4801 = null;
            t_4801 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail23163;
            u_4801 = term;
            z_4801 = t_4801;
            term = report_with_failure_0_2.instance.invoke(context, z_4801, trans.const4602, u_4801);
            if(term == null)
              break Fail23163;
          }
          term = v_4801;
          if(o_4801.value == null || (q_4801.value == null || s_4801.value == null))
            break Fail23163;
          term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{m_4801, o_4801.value, q_4801.value, s_4801.value});
          if(true)
            break Success12394;
        }
        term = term12490;
        IStrategoTerm term12493 = term;
        Success12396:
        { 
          Fail23165:
          { 
            TermReference b_4801 = new TermReference();
            TermReference c_4801 = new TermReference();
            TermReference d_4801 = new TermReference();
            TermReference e_4801 = new TermReference();
            IStrategoTerm h_4801 = null;
            if(term.getTermType() != IStrategoTerm.APPL || Main._consLet_2 != ((IStrategoAppl)term).getConstructor())
              break Fail23165;
            if(b_4801.value == null)
              b_4801.value = term.getSubterm(0);
            else
              if(b_4801.value != term.getSubterm(0) && !b_4801.value.match(term.getSubterm(0)))
                break Fail23165;
            if(d_4801.value == null)
              d_4801.value = term.getSubterm(1);
            else
              if(d_4801.value != term.getSubterm(1) && !d_4801.value.match(term.getSubterm(1)))
                break Fail23165;
            h_4801 = term;
            IStrategoTerm term12494 = term;
            Success12397:
            { 
              Fail23166:
              { 
                lifted6885 lifted68850 = new lifted6885();
                lifted6884 lifted68840 = new lifted6884();
                lifted68850.b_4801 = b_4801;
                lifted68850.c_4801 = c_4801;
                lifted68850.d_4801 = d_4801;
                lifted68850.e_4801 = e_4801;
                lifted68840.b_4801 = b_4801;
                term = dr_scope_declare_cookies_2_0.instance.invoke(context, term, lifted68840, lifted68850);
                if(term == null)
                  break Fail23166;
                if(true)
                  break Success12397;
              }
              term = term12494;
              IStrategoTerm f_4801 = null;
              IStrategoTerm g_4801 = null;
              IStrategoTerm j_4801 = null;
              f_4801 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23165;
              g_4801 = term;
              j_4801 = f_4801;
              term = report_with_failure_0_2.instance.invoke(context, j_4801, trans.const4602, g_4801);
              if(term == null)
                break Fail23165;
            }
            term = h_4801;
            if(c_4801.value == null || e_4801.value == null)
              break Fail23165;
            term = termFactory.makeAppl(Main._consRec_2, new IStrategoTerm[]{c_4801.value, e_4801.value});
            if(true)
              break Success12396;
          }
          term = term12493;
          IStrategoTerm term12495 = term;
          Success12398:
          { 
            Fail23167:
            { 
              TermReference n_4800 = new TermReference();
              TermReference o_4800 = new TermReference();
              TermReference p_4800 = new TermReference();
              TermReference q_4800 = new TermReference();
              TermReference r_4800 = new TermReference();
              IStrategoTerm u_4800 = null;
              if(o_4800.value == null)
                o_4800.value = term;
              else
                if(o_4800.value != term && !o_4800.value.match(term))
                  break Fail23167;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consRec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail23167;
              if(n_4800.value == null)
                n_4800.value = term.getSubterm(0);
              else
                if(n_4800.value != term.getSubterm(0) && !n_4800.value.match(term.getSubterm(0)))
                  break Fail23167;
              if(q_4800.value == null)
                q_4800.value = term.getSubterm(1);
              else
                if(q_4800.value != term.getSubterm(1) && !q_4800.value.match(term.getSubterm(1)))
                  break Fail23167;
              u_4800 = term;
              IStrategoTerm term12496 = term;
              Success12399:
              { 
                Fail23168:
                { 
                  lifted6888 lifted68880 = new lifted6888();
                  lifted6887 lifted68870 = new lifted6887();
                  lifted68880.o_4800 = o_4800;
                  lifted68880.n_4800 = n_4800;
                  lifted68880.p_4800 = p_4800;
                  lifted68880.q_4800 = q_4800;
                  lifted68880.r_4800 = r_4800;
                  lifted68870.o_4800 = o_4800;
                  term = dr_scope_declare_cookies_2_0.instance.invoke(context, term, lifted68870, lifted68880);
                  if(term == null)
                    break Fail23168;
                  if(true)
                    break Success12399;
                }
                term = term12496;
                IStrategoTerm s_4800 = null;
                IStrategoTerm t_4800 = null;
                IStrategoTerm y_4800 = null;
                s_4800 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail23167;
                t_4800 = term;
                y_4800 = s_4800;
                term = report_with_failure_0_2.instance.invoke(context, y_4800, trans.const4602, t_4800);
                if(term == null)
                  break Fail23167;
              }
              term = u_4800;
              if(p_4800.value == null || r_4800.value == null)
                break Fail23167;
              term = termFactory.makeAppl(Main._consRec_2, new IStrategoTerm[]{p_4800.value, r_4800.value});
              if(true)
                break Success12398;
            }
            term = term12495;
            IStrategoTerm term12497 = term;
            Success12400:
            { 
              Fail23169:
              { 
                IStrategoTerm z_4799 = null;
                TermReference a_4800 = new TermReference();
                TermReference b_4800 = new TermReference();
                TermReference c_4800 = new TermReference();
                TermReference d_4800 = new TermReference();
                IStrategoTerm g_4800 = null;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail23169;
                z_4799 = term.getSubterm(0);
                if(a_4800.value == null)
                  a_4800.value = term.getSubterm(1);
                else
                  if(a_4800.value != term.getSubterm(1) && !a_4800.value.match(term.getSubterm(1)))
                    break Fail23169;
                if(c_4800.value == null)
                  c_4800.value = term.getSubterm(2);
                else
                  if(c_4800.value != term.getSubterm(2) && !c_4800.value.match(term.getSubterm(2)))
                    break Fail23169;
                g_4800 = term;
                IStrategoTerm term12498 = term;
                Success12401:
                { 
                  Fail23170:
                  { 
                    IStrategoTerm h_4800 = null;
                    IStrategoTerm i_4800 = null;
                    i_4800 = term;
                    h_4800 = trans.const4568;
                    term = i_4800;
                    lifted6889 lifted68890 = new lifted6889();
                    lifted68890.a_4800 = a_4800;
                    lifted68890.b_4800 = b_4800;
                    lifted68890.c_4800 = c_4800;
                    lifted68890.d_4800 = d_4800;
                    term = dr_scope_1_1.instance.invoke(context, term, lifted68890, h_4800);
                    if(term == null)
                      break Fail23170;
                    if(true)
                      break Success12401;
                  }
                  term = term12498;
                  IStrategoTerm e_4800 = null;
                  IStrategoTerm f_4800 = null;
                  IStrategoTerm k_4800 = null;
                  e_4800 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23169;
                  f_4800 = term;
                  k_4800 = e_4800;
                  term = report_with_failure_0_2.instance.invoke(context, k_4800, trans.const4602, f_4800);
                  if(term == null)
                    break Fail23169;
                }
                term = g_4800;
                if(b_4800.value == null || d_4800.value == null)
                  break Fail23169;
                term = termFactory.makeAppl(Main._consOverlay_3, new IStrategoTerm[]{z_4799, b_4800.value, d_4800.value});
                if(true)
                  break Success12400;
              }
              term = term12497;
              IStrategoTerm term12499 = term;
              IStrategoConstructor cons592 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
              Success12402:
              { 
                if(cons592 == Main._consScopeDefault_1)
                { 
                  Fail23171:
                  { 
                    IStrategoTerm o_4799 = null;
                    IStrategoTerm p_4799 = null;
                    IStrategoTerm s_4799 = null;
                    o_4799 = term.getSubterm(0);
                    s_4799 = term;
                    IStrategoTerm term12500 = term;
                    Success12403:
                    { 
                      Fail23172:
                      { 
                        term = tvars_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23172;
                        term = termFactory.makeTuple(term, o_4799);
                        term = scope_variables_1_0.instance.invoke(context, term, declare_bodies_top_0_0.instance);
                        if(term == null)
                          break Fail23172;
                        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                          break Fail23172;
                        p_4799 = term.getSubterm(1);
                        if(true)
                          break Success12403;
                      }
                      term = term12500;
                      IStrategoTerm q_4799 = null;
                      IStrategoTerm r_4799 = null;
                      IStrategoTerm w_4799 = null;
                      q_4799 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23171;
                      r_4799 = term;
                      w_4799 = q_4799;
                      term = report_with_failure_0_2.instance.invoke(context, w_4799, trans.const4602, r_4799);
                      if(term == null)
                        break Fail23171;
                    }
                    term = s_4799;
                    if(p_4799 == null)
                      break Fail23171;
                    term = termFactory.makeAppl(Main._consScopeDefault_1, new IStrategoTerm[]{p_4799});
                    if(true)
                      break Success12402;
                  }
                  term = term12499;
                }
                Success12404:
                { 
                  if(cons592 == Main._consScope_2)
                  { 
                    Fail23173:
                    { 
                      IStrategoTerm d_4799 = null;
                      IStrategoTerm e_4799 = null;
                      IStrategoTerm f_4799 = null;
                      IStrategoTerm g_4799 = null;
                      IStrategoTerm j_4799 = null;
                      d_4799 = term.getSubterm(0);
                      e_4799 = term.getSubterm(1);
                      j_4799 = term;
                      IStrategoTerm term12502 = term;
                      Success12405:
                      { 
                        Fail23174:
                        { 
                          term = termFactory.makeTuple(d_4799, e_4799);
                          term = scope_variables_1_0.instance.invoke(context, term, declare_bodies_top_0_0.instance);
                          if(term == null)
                            break Fail23174;
                          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                            break Fail23174;
                          f_4799 = term.getSubterm(0);
                          g_4799 = term.getSubterm(1);
                          if(true)
                            break Success12405;
                        }
                        term = term12502;
                        IStrategoTerm h_4799 = null;
                        IStrategoTerm i_4799 = null;
                        IStrategoTerm l_4799 = null;
                        h_4799 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail23173;
                        i_4799 = term;
                        l_4799 = h_4799;
                        term = report_with_failure_0_2.instance.invoke(context, l_4799, trans.const4602, i_4799);
                        if(term == null)
                          break Fail23173;
                      }
                      term = j_4799;
                      if(f_4799 == null || g_4799 == null)
                        break Fail23173;
                      term = termFactory.makeAppl(Main._consScope_2, new IStrategoTerm[]{f_4799, g_4799});
                      if(true)
                        break Success12404;
                    }
                    term = term12499;
                  }
                  Success12406:
                  { 
                    if(cons592 == Main._consMatch_1)
                    { 
                      Fail23175:
                      { 
                        IStrategoTerm u_4798 = null;
                        IStrategoTerm v_4798 = null;
                        IStrategoTerm y_4798 = null;
                        u_4798 = term.getSubterm(0);
                        y_4798 = term;
                        IStrategoTerm term12504 = term;
                        Success12407:
                        { 
                          Fail23176:
                          { 
                            term = declare_match_0_0.instance.invoke(context, u_4798);
                            if(term == null)
                              break Fail23176;
                            v_4798 = term;
                            if(true)
                              break Success12407;
                          }
                          term = term12504;
                          IStrategoTerm w_4798 = null;
                          IStrategoTerm x_4798 = null;
                          IStrategoTerm a_4799 = null;
                          w_4798 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail23175;
                          x_4798 = term;
                          a_4799 = w_4798;
                          term = report_with_failure_0_2.instance.invoke(context, a_4799, trans.const4602, x_4798);
                          if(term == null)
                            break Fail23175;
                        }
                        term = y_4798;
                        if(v_4798 == null)
                          break Fail23175;
                        term = termFactory.makeAppl(Main._consMatch_1, new IStrategoTerm[]{v_4798});
                        if(true)
                          break Success12406;
                      }
                      term = term12499;
                    }
                    Success12408:
                    { 
                      if(cons592 == Main._consRule_3)
                      { 
                        Fail23177:
                        { 
                          IStrategoTerm h_4798 = null;
                          IStrategoTerm i_4798 = null;
                          IStrategoTerm j_4798 = null;
                          IStrategoTerm k_4798 = null;
                          IStrategoTerm l_4798 = null;
                          IStrategoTerm m_4798 = null;
                          IStrategoTerm p_4798 = null;
                          h_4798 = term.getSubterm(0);
                          l_4798 = term.getSubterm(1);
                          j_4798 = term.getSubterm(2);
                          p_4798 = term;
                          IStrategoTerm term12506 = term;
                          Success12409:
                          { 
                            Fail23178:
                            { 
                              term = declare_match_0_0.instance.invoke(context, h_4798);
                              if(term == null)
                                break Fail23178;
                              i_4798 = term;
                              term = declare_bodies_top_0_0.instance.invoke(context, j_4798);
                              if(term == null)
                                break Fail23178;
                              k_4798 = term;
                              term = declare_bodies_top_0_0.instance.invoke(context, l_4798);
                              if(term == null)
                                break Fail23178;
                              m_4798 = term;
                              if(true)
                                break Success12409;
                            }
                            term = term12506;
                            IStrategoTerm n_4798 = null;
                            IStrategoTerm o_4798 = null;
                            IStrategoTerm r_4798 = null;
                            n_4798 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail23177;
                            o_4798 = term;
                            r_4798 = n_4798;
                            term = report_with_failure_0_2.instance.invoke(context, r_4798, trans.const4602, o_4798);
                            if(term == null)
                              break Fail23177;
                          }
                          term = p_4798;
                          if(i_4798 == null || (m_4798 == null || k_4798 == null))
                            break Fail23177;
                          term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{i_4798, m_4798, k_4798});
                          if(true)
                            break Success12408;
                        }
                        term = term12499;
                      }
                      IStrategoTerm term12507 = term;
                      Success12410:
                      { 
                        Fail23179:
                        { 
                          TermReference u_4797 = new TermReference();
                          TermReference v_4797 = new TermReference();
                          TermReference w_4797 = new TermReference();
                          TermReference x_4797 = new TermReference();
                          IStrategoTerm a_4798 = null;
                          if(term.getTermType() != IStrategoTerm.APPL || Main._consSetDynRule_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail23179;
                          if(u_4797.value == null)
                            u_4797.value = term.getSubterm(0);
                          else
                            if(u_4797.value != term.getSubterm(0) && !u_4797.value.match(term.getSubterm(0)))
                              break Fail23179;
                          if(w_4797.value == null)
                            w_4797.value = term.getSubterm(1);
                          else
                            if(w_4797.value != term.getSubterm(1) && !w_4797.value.match(term.getSubterm(1)))
                              break Fail23179;
                          a_4798 = term;
                          IStrategoTerm term12508 = term;
                          Success12411:
                          { 
                            Fail23180:
                            { 
                              IStrategoTerm b_4798 = null;
                              IStrategoTerm c_4798 = null;
                              c_4798 = term;
                              b_4798 = trans.const4568;
                              term = c_4798;
                              lifted6893 lifted68930 = new lifted6893();
                              lifted68930.u_4797 = u_4797;
                              lifted68930.v_4797 = v_4797;
                              lifted68930.w_4797 = w_4797;
                              lifted68930.x_4797 = x_4797;
                              term = dr_scope_1_1.instance.invoke(context, term, lifted68930, b_4798);
                              if(term == null)
                                break Fail23180;
                              if(true)
                                break Success12411;
                            }
                            term = term12508;
                            IStrategoTerm y_4797 = null;
                            IStrategoTerm z_4797 = null;
                            IStrategoTerm e_4798 = null;
                            y_4797 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail23179;
                            z_4797 = term;
                            e_4798 = y_4797;
                            term = report_with_failure_0_2.instance.invoke(context, e_4798, trans.const4602, z_4797);
                            if(term == null)
                              break Fail23179;
                          }
                          term = a_4798;
                          if(v_4797.value == null || x_4797.value == null)
                            break Fail23179;
                          term = termFactory.makeAppl(Main._consSetDynRule_2, new IStrategoTerm[]{v_4797.value, x_4797.value});
                          if(true)
                            break Success12410;
                        }
                        term = term12507;
                        IStrategoTerm term12509 = term;
                        IStrategoConstructor cons593 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                        Success12412:
                        { 
                          if(cons593 == Main._consDynRuleScopeId_1)
                          { 
                            Fail23181:
                            { 
                              IStrategoTerm n_4797 = null;
                              n_4797 = term.getSubterm(0);
                              term = declare_cookie_of_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail23181;
                              term = termFactory.annotateTerm(n_4797, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
                              term = termFactory.makeAppl(Main._consDynRuleScopeId_1, new IStrategoTerm[]{term});
                              if(true)
                                break Success12412;
                            }
                            term = term12509;
                          }
                          Success12413:
                          { 
                            if(cons593 == Main._consLabeledDynRuleScopeId_2)
                            { 
                              Fail23182:
                              { 
                                IStrategoTerm g_4797 = null;
                                IStrategoTerm h_4797 = null;
                                IStrategoTerm i_4797 = null;
                                g_4797 = term.getSubterm(0);
                                i_4797 = term.getSubterm(1);
                                term = signature_of_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail23182;
                                term = $Declare$Cookie_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail23182;
                                term = termFactory.annotateTerm(g_4797, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
                                h_4797 = term;
                                term = declare_bodies_top_0_0.instance.invoke(context, i_4797);
                                if(term == null)
                                  break Fail23182;
                                term = termFactory.makeAppl(Main._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{h_4797, term});
                                if(true)
                                  break Success12413;
                              }
                              term = term12509;
                            }
                            Success12414:
                            { 
                              if(cons593 == Main._consAssign_2)
                              { 
                                Fail23183:
                                { 
                                  IStrategoTerm x_4796 = null;
                                  IStrategoTerm y_4796 = null;
                                  IStrategoTerm z_4796 = null;
                                  IStrategoTerm a_4797 = null;
                                  IStrategoTerm d_4797 = null;
                                  z_4796 = term.getSubterm(0);
                                  x_4796 = term.getSubterm(1);
                                  d_4797 = term;
                                  IStrategoTerm term12512 = term;
                                  Success12415:
                                  { 
                                    Fail23184:
                                    { 
                                      term = declare_bodies_top_0_0.instance.invoke(context, x_4796);
                                      if(term == null)
                                        break Fail23184;
                                      y_4796 = term;
                                      term = declare_match_0_0.instance.invoke(context, z_4796);
                                      if(term == null)
                                        break Fail23184;
                                      a_4797 = term;
                                      if(true)
                                        break Success12415;
                                    }
                                    term = term12512;
                                    IStrategoTerm b_4797 = null;
                                    IStrategoTerm c_4797 = null;
                                    IStrategoTerm f_4797 = null;
                                    b_4797 = term;
                                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                    if(term == null)
                                      break Fail23183;
                                    c_4797 = term;
                                    f_4797 = b_4797;
                                    term = report_with_failure_0_2.instance.invoke(context, f_4797, trans.const4602, c_4797);
                                    if(term == null)
                                      break Fail23183;
                                  }
                                  term = d_4797;
                                  if(a_4797 == null || y_4796 == null)
                                    break Fail23183;
                                  term = termFactory.makeAppl(Main._consAssign_2, new IStrategoTerm[]{a_4797, y_4796});
                                  if(true)
                                    break Success12414;
                                }
                                term = term12509;
                              }
                              Success12416:
                              { 
                                if(cons593 == Main._consAM_2)
                                { 
                                  Fail23185:
                                  { 
                                    IStrategoTerm m_4796 = null;
                                    IStrategoTerm n_4796 = null;
                                    IStrategoTerm o_4796 = null;
                                    IStrategoTerm p_4796 = null;
                                    IStrategoTerm s_4796 = null;
                                    m_4796 = term.getSubterm(0);
                                    o_4796 = term.getSubterm(1);
                                    s_4796 = term;
                                    IStrategoTerm term12514 = term;
                                    Success12417:
                                    { 
                                      Fail23186:
                                      { 
                                        term = declare_bodies_top_0_0.instance.invoke(context, m_4796);
                                        if(term == null)
                                          break Fail23186;
                                        n_4796 = term;
                                        term = declare_match_0_0.instance.invoke(context, o_4796);
                                        if(term == null)
                                          break Fail23186;
                                        p_4796 = term;
                                        if(true)
                                          break Success12417;
                                      }
                                      term = term12514;
                                      IStrategoTerm q_4796 = null;
                                      IStrategoTerm r_4796 = null;
                                      IStrategoTerm u_4796 = null;
                                      q_4796 = term;
                                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                      if(term == null)
                                        break Fail23185;
                                      r_4796 = term;
                                      u_4796 = q_4796;
                                      term = report_with_failure_0_2.instance.invoke(context, u_4796, trans.const4602, r_4796);
                                      if(term == null)
                                        break Fail23185;
                                    }
                                    term = s_4796;
                                    if(n_4796 == null || p_4796 == null)
                                      break Fail23185;
                                    term = termFactory.makeAppl(Main._consAM_2, new IStrategoTerm[]{n_4796, p_4796});
                                    if(true)
                                      break Success12416;
                                  }
                                  term = term12509;
                                }
                                IStrategoTerm term12515 = term;
                                Success12418:
                                { 
                                  Fail23187:
                                  { 
                                    TermReference x_4795 = new TermReference();
                                    TermReference y_4795 = new TermReference();
                                    TermReference z_4795 = new TermReference();
                                    TermReference a_4796 = new TermReference();
                                    TermReference b_4796 = new TermReference();
                                    TermReference c_4796 = new TermReference();
                                    IStrategoTerm f_4796 = null;
                                    if(term.getTermType() != IStrategoTerm.APPL || Main._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
                                      break Fail23187;
                                    if(x_4795.value == null)
                                      x_4795.value = term.getSubterm(0);
                                    else
                                      if(x_4795.value != term.getSubterm(0) && !x_4795.value.match(term.getSubterm(0)))
                                        break Fail23187;
                                    if(z_4795.value == null)
                                      z_4795.value = term.getSubterm(1);
                                    else
                                      if(z_4795.value != term.getSubterm(1) && !z_4795.value.match(term.getSubterm(1)))
                                        break Fail23187;
                                    if(b_4796.value == null)
                                      b_4796.value = term.getSubterm(2);
                                    else
                                      if(b_4796.value != term.getSubterm(2) && !b_4796.value.match(term.getSubterm(2)))
                                        break Fail23187;
                                    f_4796 = term;
                                    IStrategoTerm term12516 = term;
                                    Success12419:
                                    { 
                                      Fail23188:
                                      { 
                                        IStrategoTerm g_4796 = null;
                                        IStrategoTerm h_4796 = null;
                                        h_4796 = term;
                                        g_4796 = trans.constCons2114;
                                        term = h_4796;
                                        lifted6895 lifted68950 = new lifted6895();
                                        lifted6894 lifted68940 = new lifted6894();
                                        lifted68950.b_4796 = b_4796;
                                        lifted68950.c_4796 = c_4796;
                                        lifted68940.x_4795 = x_4795;
                                        lifted68940.y_4795 = y_4795;
                                        lifted68940.z_4795 = z_4795;
                                        lifted68940.a_4796 = a_4796;
                                        term = dr_fork_and_union_2_1.instance.invoke(context, term, lifted68940, lifted68950, g_4796);
                                        if(term == null)
                                          break Fail23188;
                                        if(true)
                                          break Success12419;
                                      }
                                      term = term12516;
                                      IStrategoTerm d_4796 = null;
                                      IStrategoTerm e_4796 = null;
                                      IStrategoTerm j_4796 = null;
                                      d_4796 = term;
                                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                      if(term == null)
                                        break Fail23187;
                                      e_4796 = term;
                                      j_4796 = d_4796;
                                      term = report_with_failure_0_2.instance.invoke(context, j_4796, trans.const4602, e_4796);
                                      if(term == null)
                                        break Fail23187;
                                    }
                                    term = f_4796;
                                    if(y_4795.value == null || (a_4796.value == null || c_4796.value == null))
                                      break Fail23187;
                                    term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{y_4795.value, a_4796.value, c_4796.value});
                                    if(true)
                                      break Success12418;
                                  }
                                  term = term12515;
                                  IStrategoTerm term12517 = term;
                                  IStrategoConstructor cons594 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                                  Success12420:
                                  { 
                                    if(cons594 == Main._consVar_1)
                                    { 
                                      Fail23189:
                                      { 
                                        IStrategoTerm q_4795 = null;
                                        IStrategoTerm arg8235 = term.getSubterm(0);
                                        q_4795 = arg8235;
                                        IStrategoList annos713 = arg8235.getAnnotations();
                                        if(annos713.getTermType() != IStrategoTerm.LIST || !((IStrategoList)annos713).isEmpty())
                                          break Fail23189;
                                        term = declare_cookie_of_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail23189;
                                        term = termFactory.annotateTerm(q_4795, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
                                        term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{term});
                                        if(true)
                                          break Success12420;
                                      }
                                      term = term12517;
                                    }
                                    Success12421:
                                    { 
                                      if(cons594 == Main._consCallT_3)
                                      { 
                                        Fail23190:
                                        { 
                                          IStrategoTerm y_4794 = null;
                                          IStrategoTerm z_4794 = null;
                                          IStrategoTerm a_4795 = null;
                                          IStrategoTerm b_4795 = null;
                                          IStrategoTerm c_4795 = null;
                                          IStrategoTerm d_4795 = null;
                                          IStrategoTerm i_4795 = null;
                                          IStrategoTerm n_4795 = null;
                                          IStrategoTerm arg8236 = term.getSubterm(0);
                                          if(arg8236.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg8236).getConstructor())
                                            break Fail23190;
                                          y_4794 = arg8236.getSubterm(0);
                                          c_4795 = term.getSubterm(1);
                                          a_4795 = term.getSubterm(2);
                                          i_4795 = term;
                                          IStrategoTerm term12519 = term;
                                          Success12422:
                                          { 
                                            Fail23191:
                                            { 
                                              Success12423:
                                              { 
                                                Fail23192:
                                                { 
                                                  term = declare_cookie_of_0_0.instance.invoke(context, term);
                                                  if(term == null)
                                                    break Fail23192;
                                                  term = termFactory.annotateTerm(y_4794, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
                                                  z_4794 = term;
                                                  if(true)
                                                    break Success12423;
                                                }
                                                term = y_4794;
                                                z_4794 = y_4794;
                                              }
                                              if(true)
                                                break Success12422;
                                            }
                                            term = term12519;
                                            IStrategoTerm e_4795 = null;
                                            IStrategoTerm f_4795 = null;
                                            IStrategoTerm m_4795 = null;
                                            e_4795 = term;
                                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                            if(term == null)
                                              break Fail23190;
                                            f_4795 = term;
                                            m_4795 = e_4795;
                                            term = report_with_failure_0_2.instance.invoke(context, m_4795, trans.const4602, f_4795);
                                            if(term == null)
                                              break Fail23190;
                                          }
                                          term = i_4795;
                                          n_4795 = i_4795;
                                          IStrategoTerm term12521 = term;
                                          Success12424:
                                          { 
                                            Fail23193:
                                            { 
                                              term = declare_bodies_top_0_0.instance.invoke(context, a_4795);
                                              if(term == null)
                                                break Fail23193;
                                              b_4795 = term;
                                              term = map_1_0.instance.invoke(context, c_4795, lifted6896.instance);
                                              if(term == null)
                                                break Fail23193;
                                              d_4795 = term;
                                              if(true)
                                                break Success12424;
                                            }
                                            term = term12521;
                                            IStrategoTerm g_4795 = null;
                                            IStrategoTerm h_4795 = null;
                                            IStrategoTerm p_4795 = null;
                                            g_4795 = term;
                                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                            if(term == null)
                                              break Fail23190;
                                            h_4795 = term;
                                            p_4795 = g_4795;
                                            term = report_with_failure_0_2.instance.invoke(context, p_4795, trans.const4602, h_4795);
                                            if(term == null)
                                              break Fail23190;
                                          }
                                          term = n_4795;
                                          if(z_4794 == null || (d_4795 == null || b_4795 == null))
                                            break Fail23190;
                                          term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consSVar_1, new IStrategoTerm[]{z_4794}), d_4795, b_4795});
                                          if(true)
                                            break Success12421;
                                        }
                                        term = term12517;
                                      }
                                      if(cons594 == Main._consOp_2)
                                      { 
                                        IStrategoTerm i_4794 = null;
                                        IStrategoTerm j_4794 = null;
                                        IStrategoTerm k_4794 = null;
                                        IStrategoTerm l_4794 = null;
                                        IStrategoTerm o_4794 = null;
                                        IStrategoTerm r_4794 = null;
                                        i_4794 = term.getSubterm(0);
                                        k_4794 = term.getSubterm(1);
                                        o_4794 = term;
                                        term = declare_cookie_of_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail23162;
                                        term = termFactory.annotateTerm(i_4794, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4)));
                                        j_4794 = term;
                                        term = o_4794;
                                        r_4794 = o_4794;
                                        IStrategoTerm term12523 = term;
                                        Success12425:
                                        { 
                                          Fail23194:
                                          { 
                                            term = declare_bodies_top_0_0.instance.invoke(context, k_4794);
                                            if(term == null)
                                              break Fail23194;
                                            l_4794 = term;
                                            if(true)
                                              break Success12425;
                                          }
                                          term = term12523;
                                          IStrategoTerm m_4794 = null;
                                          IStrategoTerm n_4794 = null;
                                          IStrategoTerm t_4794 = null;
                                          m_4794 = term;
                                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                          if(term == null)
                                            break Fail23162;
                                          n_4794 = term;
                                          t_4794 = m_4794;
                                          term = report_with_failure_0_2.instance.invoke(context, t_4794, trans.const4602, n_4794);
                                          if(term == null)
                                            break Fail23162;
                                        }
                                        term = r_4794;
                                        if(l_4794 == null)
                                          break Fail23162;
                                        term = termFactory.makeAppl(Main._consOp_2, new IStrategoTerm[]{j_4794, l_4794});
                                      }
                                      else
                                      { 
                                        break Fail23162;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}