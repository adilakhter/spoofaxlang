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
    Fail21686:
    { 
      IStrategoTerm term11781 = term;
      Success11685:
      { 
        Fail21687:
        { 
          IStrategoTerm u_4247 = null;
          TermReference v_4247 = new TermReference();
          TermReference w_4247 = new TermReference();
          TermReference x_4247 = new TermReference();
          TermReference y_4247 = new TermReference();
          TermReference z_4247 = new TermReference();
          TermReference a_4248 = new TermReference();
          IStrategoTerm d_4248 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
            break Fail21687;
          u_4247 = term.getSubterm(0);
          if(v_4247.value == null)
            v_4247.value = term.getSubterm(1);
          else
            if(v_4247.value != term.getSubterm(1) && !v_4247.value.match(term.getSubterm(1)))
              break Fail21687;
          if(x_4247.value == null)
            x_4247.value = term.getSubterm(2);
          else
            if(x_4247.value != term.getSubterm(2) && !x_4247.value.match(term.getSubterm(2)))
              break Fail21687;
          if(z_4247.value == null)
            z_4247.value = term.getSubterm(3);
          else
            if(z_4247.value != term.getSubterm(3) && !z_4247.value.match(term.getSubterm(3)))
              break Fail21687;
          d_4248 = term;
          IStrategoTerm term11782 = term;
          Success11686:
          { 
            Fail21688:
            { 
              IStrategoTerm e_4248 = null;
              IStrategoTerm f_4248 = null;
              f_4248 = term;
              e_4248 = trans.const4358;
              term = f_4248;
              lifted6608 lifted66080 = new lifted6608();
              lifted66080.v_4247 = v_4247;
              lifted66080.w_4247 = w_4247;
              lifted66080.x_4247 = x_4247;
              lifted66080.y_4247 = y_4247;
              lifted66080.z_4247 = z_4247;
              lifted66080.a_4248 = a_4248;
              term = dr_scope_1_1.instance.invoke(context, term, lifted66080, e_4248);
              if(term == null)
                break Fail21688;
              if(true)
                break Success11686;
            }
            term = term11782;
            IStrategoTerm b_4248 = null;
            IStrategoTerm c_4248 = null;
            IStrategoTerm h_4248 = null;
            b_4248 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail21687;
            c_4248 = term;
            h_4248 = b_4248;
            term = report_with_failure_0_2.instance.invoke(context, h_4248, trans.const4392, c_4248);
            if(term == null)
              break Fail21687;
          }
          term = d_4248;
          if(w_4247.value == null || (y_4247.value == null || a_4248.value == null))
            break Fail21687;
          term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{u_4247, w_4247.value, y_4247.value, a_4248.value});
          if(true)
            break Success11685;
        }
        term = term11781;
        IStrategoTerm term11784 = term;
        Success11687:
        { 
          Fail21689:
          { 
            TermReference j_4247 = new TermReference();
            TermReference k_4247 = new TermReference();
            TermReference l_4247 = new TermReference();
            TermReference m_4247 = new TermReference();
            IStrategoTerm p_4247 = null;
            if(term.getTermType() != IStrategoTerm.APPL || Main._consLet_2 != ((IStrategoAppl)term).getConstructor())
              break Fail21689;
            if(j_4247.value == null)
              j_4247.value = term.getSubterm(0);
            else
              if(j_4247.value != term.getSubterm(0) && !j_4247.value.match(term.getSubterm(0)))
                break Fail21689;
            if(l_4247.value == null)
              l_4247.value = term.getSubterm(1);
            else
              if(l_4247.value != term.getSubterm(1) && !l_4247.value.match(term.getSubterm(1)))
                break Fail21689;
            p_4247 = term;
            IStrategoTerm term11785 = term;
            Success11688:
            { 
              Fail21690:
              { 
                lifted6614 lifted66140 = new lifted6614();
                lifted6613 lifted66130 = new lifted6613();
                lifted66140.j_4247 = j_4247;
                lifted66140.k_4247 = k_4247;
                lifted66140.l_4247 = l_4247;
                lifted66140.m_4247 = m_4247;
                lifted66130.j_4247 = j_4247;
                term = dr_scope_declare_cookies_2_0.instance.invoke(context, term, lifted66130, lifted66140);
                if(term == null)
                  break Fail21690;
                if(true)
                  break Success11688;
              }
              term = term11785;
              IStrategoTerm n_4247 = null;
              IStrategoTerm o_4247 = null;
              IStrategoTerm r_4247 = null;
              n_4247 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21689;
              o_4247 = term;
              r_4247 = n_4247;
              term = report_with_failure_0_2.instance.invoke(context, r_4247, trans.const4392, o_4247);
              if(term == null)
                break Fail21689;
            }
            term = p_4247;
            if(k_4247.value == null || m_4247.value == null)
              break Fail21689;
            term = termFactory.makeAppl(Main._consRec_2, new IStrategoTerm[]{k_4247.value, m_4247.value});
            if(true)
              break Success11687;
          }
          term = term11784;
          IStrategoTerm term11786 = term;
          Success11689:
          { 
            Fail21691:
            { 
              TermReference v_4246 = new TermReference();
              TermReference w_4246 = new TermReference();
              TermReference x_4246 = new TermReference();
              TermReference y_4246 = new TermReference();
              TermReference z_4246 = new TermReference();
              IStrategoTerm c_4247 = null;
              if(w_4246.value == null)
                w_4246.value = term;
              else
                if(w_4246.value != term && !w_4246.value.match(term))
                  break Fail21691;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consRec_2 != ((IStrategoAppl)term).getConstructor())
                break Fail21691;
              if(v_4246.value == null)
                v_4246.value = term.getSubterm(0);
              else
                if(v_4246.value != term.getSubterm(0) && !v_4246.value.match(term.getSubterm(0)))
                  break Fail21691;
              if(y_4246.value == null)
                y_4246.value = term.getSubterm(1);
              else
                if(y_4246.value != term.getSubterm(1) && !y_4246.value.match(term.getSubterm(1)))
                  break Fail21691;
              c_4247 = term;
              IStrategoTerm term11787 = term;
              Success11690:
              { 
                Fail21692:
                { 
                  lifted6617 lifted66170 = new lifted6617();
                  lifted6616 lifted66160 = new lifted6616();
                  lifted66170.w_4246 = w_4246;
                  lifted66170.v_4246 = v_4246;
                  lifted66170.x_4246 = x_4246;
                  lifted66170.y_4246 = y_4246;
                  lifted66170.z_4246 = z_4246;
                  lifted66160.w_4246 = w_4246;
                  term = dr_scope_declare_cookies_2_0.instance.invoke(context, term, lifted66160, lifted66170);
                  if(term == null)
                    break Fail21692;
                  if(true)
                    break Success11690;
                }
                term = term11787;
                IStrategoTerm a_4247 = null;
                IStrategoTerm b_4247 = null;
                IStrategoTerm g_4247 = null;
                a_4247 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail21691;
                b_4247 = term;
                g_4247 = a_4247;
                term = report_with_failure_0_2.instance.invoke(context, g_4247, trans.const4392, b_4247);
                if(term == null)
                  break Fail21691;
              }
              term = c_4247;
              if(x_4246.value == null || z_4246.value == null)
                break Fail21691;
              term = termFactory.makeAppl(Main._consRec_2, new IStrategoTerm[]{x_4246.value, z_4246.value});
              if(true)
                break Success11689;
            }
            term = term11786;
            IStrategoTerm term11788 = term;
            Success11691:
            { 
              Fail21693:
              { 
                IStrategoTerm h_4246 = null;
                TermReference i_4246 = new TermReference();
                TermReference j_4246 = new TermReference();
                TermReference k_4246 = new TermReference();
                TermReference l_4246 = new TermReference();
                IStrategoTerm o_4246 = null;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consOverlay_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail21693;
                h_4246 = term.getSubterm(0);
                if(i_4246.value == null)
                  i_4246.value = term.getSubterm(1);
                else
                  if(i_4246.value != term.getSubterm(1) && !i_4246.value.match(term.getSubterm(1)))
                    break Fail21693;
                if(k_4246.value == null)
                  k_4246.value = term.getSubterm(2);
                else
                  if(k_4246.value != term.getSubterm(2) && !k_4246.value.match(term.getSubterm(2)))
                    break Fail21693;
                o_4246 = term;
                IStrategoTerm term11789 = term;
                Success11692:
                { 
                  Fail21694:
                  { 
                    IStrategoTerm p_4246 = null;
                    IStrategoTerm q_4246 = null;
                    q_4246 = term;
                    p_4246 = trans.const4358;
                    term = q_4246;
                    lifted6618 lifted66180 = new lifted6618();
                    lifted66180.i_4246 = i_4246;
                    lifted66180.j_4246 = j_4246;
                    lifted66180.k_4246 = k_4246;
                    lifted66180.l_4246 = l_4246;
                    term = dr_scope_1_1.instance.invoke(context, term, lifted66180, p_4246);
                    if(term == null)
                      break Fail21694;
                    if(true)
                      break Success11692;
                  }
                  term = term11789;
                  IStrategoTerm m_4246 = null;
                  IStrategoTerm n_4246 = null;
                  IStrategoTerm s_4246 = null;
                  m_4246 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21693;
                  n_4246 = term;
                  s_4246 = m_4246;
                  term = report_with_failure_0_2.instance.invoke(context, s_4246, trans.const4392, n_4246);
                  if(term == null)
                    break Fail21693;
                }
                term = o_4246;
                if(j_4246.value == null || l_4246.value == null)
                  break Fail21693;
                term = termFactory.makeAppl(Main._consOverlay_3, new IStrategoTerm[]{h_4246, j_4246.value, l_4246.value});
                if(true)
                  break Success11691;
              }
              term = term11788;
              IStrategoTerm term11790 = term;
              IStrategoConstructor cons548 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
              Success11693:
              { 
                if(cons548 == Main._consScopeDefault_1)
                { 
                  Fail21695:
                  { 
                    IStrategoTerm w_4245 = null;
                    IStrategoTerm x_4245 = null;
                    IStrategoTerm a_4246 = null;
                    w_4245 = term.getSubterm(0);
                    a_4246 = term;
                    IStrategoTerm term11791 = term;
                    Success11694:
                    { 
                      Fail21696:
                      { 
                        term = tvars_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21696;
                        term = termFactory.makeTuple(term, w_4245);
                        term = scope_variables_1_0.instance.invoke(context, term, declare_bodies_top_0_0.instance);
                        if(term == null)
                          break Fail21696;
                        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                          break Fail21696;
                        x_4245 = term.getSubterm(1);
                        if(true)
                          break Success11694;
                      }
                      term = term11791;
                      IStrategoTerm y_4245 = null;
                      IStrategoTerm z_4245 = null;
                      IStrategoTerm e_4246 = null;
                      y_4245 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21695;
                      z_4245 = term;
                      e_4246 = y_4245;
                      term = report_with_failure_0_2.instance.invoke(context, e_4246, trans.const4392, z_4245);
                      if(term == null)
                        break Fail21695;
                    }
                    term = a_4246;
                    if(x_4245 == null)
                      break Fail21695;
                    term = termFactory.makeAppl(Main._consScopeDefault_1, new IStrategoTerm[]{x_4245});
                    if(true)
                      break Success11693;
                  }
                  term = term11790;
                }
                Success11695:
                { 
                  if(cons548 == Main._consScope_2)
                  { 
                    Fail21697:
                    { 
                      IStrategoTerm l_4245 = null;
                      IStrategoTerm m_4245 = null;
                      IStrategoTerm n_4245 = null;
                      IStrategoTerm o_4245 = null;
                      IStrategoTerm r_4245 = null;
                      l_4245 = term.getSubterm(0);
                      m_4245 = term.getSubterm(1);
                      r_4245 = term;
                      IStrategoTerm term11793 = term;
                      Success11696:
                      { 
                        Fail21698:
                        { 
                          term = termFactory.makeTuple(l_4245, m_4245);
                          term = scope_variables_1_0.instance.invoke(context, term, declare_bodies_top_0_0.instance);
                          if(term == null)
                            break Fail21698;
                          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                            break Fail21698;
                          n_4245 = term.getSubterm(0);
                          o_4245 = term.getSubterm(1);
                          if(true)
                            break Success11696;
                        }
                        term = term11793;
                        IStrategoTerm p_4245 = null;
                        IStrategoTerm q_4245 = null;
                        IStrategoTerm t_4245 = null;
                        p_4245 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail21697;
                        q_4245 = term;
                        t_4245 = p_4245;
                        term = report_with_failure_0_2.instance.invoke(context, t_4245, trans.const4392, q_4245);
                        if(term == null)
                          break Fail21697;
                      }
                      term = r_4245;
                      if(n_4245 == null || o_4245 == null)
                        break Fail21697;
                      term = termFactory.makeAppl(Main._consScope_2, new IStrategoTerm[]{n_4245, o_4245});
                      if(true)
                        break Success11695;
                    }
                    term = term11790;
                  }
                  Success11697:
                  { 
                    if(cons548 == Main._consMatch_1)
                    { 
                      Fail21699:
                      { 
                        IStrategoTerm c_4245 = null;
                        IStrategoTerm d_4245 = null;
                        IStrategoTerm g_4245 = null;
                        c_4245 = term.getSubterm(0);
                        g_4245 = term;
                        IStrategoTerm term11795 = term;
                        Success11698:
                        { 
                          Fail21700:
                          { 
                            term = declare_match_0_0.instance.invoke(context, c_4245);
                            if(term == null)
                              break Fail21700;
                            d_4245 = term;
                            if(true)
                              break Success11698;
                          }
                          term = term11795;
                          IStrategoTerm e_4245 = null;
                          IStrategoTerm f_4245 = null;
                          IStrategoTerm i_4245 = null;
                          e_4245 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail21699;
                          f_4245 = term;
                          i_4245 = e_4245;
                          term = report_with_failure_0_2.instance.invoke(context, i_4245, trans.const4392, f_4245);
                          if(term == null)
                            break Fail21699;
                        }
                        term = g_4245;
                        if(d_4245 == null)
                          break Fail21699;
                        term = termFactory.makeAppl(Main._consMatch_1, new IStrategoTerm[]{d_4245});
                        if(true)
                          break Success11697;
                      }
                      term = term11790;
                    }
                    Success11699:
                    { 
                      if(cons548 == Main._consRule_3)
                      { 
                        Fail21701:
                        { 
                          IStrategoTerm p_4244 = null;
                          IStrategoTerm q_4244 = null;
                          IStrategoTerm r_4244 = null;
                          IStrategoTerm s_4244 = null;
                          IStrategoTerm t_4244 = null;
                          IStrategoTerm u_4244 = null;
                          IStrategoTerm x_4244 = null;
                          p_4244 = term.getSubterm(0);
                          t_4244 = term.getSubterm(1);
                          r_4244 = term.getSubterm(2);
                          x_4244 = term;
                          IStrategoTerm term11797 = term;
                          Success11700:
                          { 
                            Fail21702:
                            { 
                              term = declare_match_0_0.instance.invoke(context, p_4244);
                              if(term == null)
                                break Fail21702;
                              q_4244 = term;
                              term = declare_bodies_top_0_0.instance.invoke(context, r_4244);
                              if(term == null)
                                break Fail21702;
                              s_4244 = term;
                              term = declare_bodies_top_0_0.instance.invoke(context, t_4244);
                              if(term == null)
                                break Fail21702;
                              u_4244 = term;
                              if(true)
                                break Success11700;
                            }
                            term = term11797;
                            IStrategoTerm v_4244 = null;
                            IStrategoTerm w_4244 = null;
                            IStrategoTerm z_4244 = null;
                            v_4244 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail21701;
                            w_4244 = term;
                            z_4244 = v_4244;
                            term = report_with_failure_0_2.instance.invoke(context, z_4244, trans.const4392, w_4244);
                            if(term == null)
                              break Fail21701;
                          }
                          term = x_4244;
                          if(q_4244 == null || (u_4244 == null || s_4244 == null))
                            break Fail21701;
                          term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{q_4244, u_4244, s_4244});
                          if(true)
                            break Success11699;
                        }
                        term = term11790;
                      }
                      IStrategoTerm term11798 = term;
                      Success11701:
                      { 
                        Fail21703:
                        { 
                          TermReference c_4244 = new TermReference();
                          TermReference d_4244 = new TermReference();
                          TermReference e_4244 = new TermReference();
                          TermReference f_4244 = new TermReference();
                          IStrategoTerm i_4244 = null;
                          if(term.getTermType() != IStrategoTerm.APPL || Main._consSetDynRule_2 != ((IStrategoAppl)term).getConstructor())
                            break Fail21703;
                          if(c_4244.value == null)
                            c_4244.value = term.getSubterm(0);
                          else
                            if(c_4244.value != term.getSubterm(0) && !c_4244.value.match(term.getSubterm(0)))
                              break Fail21703;
                          if(e_4244.value == null)
                            e_4244.value = term.getSubterm(1);
                          else
                            if(e_4244.value != term.getSubterm(1) && !e_4244.value.match(term.getSubterm(1)))
                              break Fail21703;
                          i_4244 = term;
                          IStrategoTerm term11799 = term;
                          Success11702:
                          { 
                            Fail21704:
                            { 
                              IStrategoTerm j_4244 = null;
                              IStrategoTerm k_4244 = null;
                              k_4244 = term;
                              j_4244 = trans.const4358;
                              term = k_4244;
                              lifted6622 lifted66220 = new lifted6622();
                              lifted66220.c_4244 = c_4244;
                              lifted66220.d_4244 = d_4244;
                              lifted66220.e_4244 = e_4244;
                              lifted66220.f_4244 = f_4244;
                              term = dr_scope_1_1.instance.invoke(context, term, lifted66220, j_4244);
                              if(term == null)
                                break Fail21704;
                              if(true)
                                break Success11702;
                            }
                            term = term11799;
                            IStrategoTerm g_4244 = null;
                            IStrategoTerm h_4244 = null;
                            IStrategoTerm m_4244 = null;
                            g_4244 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail21703;
                            h_4244 = term;
                            m_4244 = g_4244;
                            term = report_with_failure_0_2.instance.invoke(context, m_4244, trans.const4392, h_4244);
                            if(term == null)
                              break Fail21703;
                          }
                          term = i_4244;
                          if(d_4244.value == null || f_4244.value == null)
                            break Fail21703;
                          term = termFactory.makeAppl(Main._consSetDynRule_2, new IStrategoTerm[]{d_4244.value, f_4244.value});
                          if(true)
                            break Success11701;
                        }
                        term = term11798;
                        IStrategoTerm term11800 = term;
                        IStrategoConstructor cons549 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                        Success11703:
                        { 
                          if(cons549 == Main._consDynRuleScopeId_1)
                          { 
                            Fail21705:
                            { 
                              IStrategoTerm v_4243 = null;
                              v_4243 = term.getSubterm(0);
                              term = declare_cookie_of_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail21705;
                              term = termFactory.annotateTerm(v_4243, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                              term = termFactory.makeAppl(Main._consDynRuleScopeId_1, new IStrategoTerm[]{term});
                              if(true)
                                break Success11703;
                            }
                            term = term11800;
                          }
                          Success11704:
                          { 
                            if(cons549 == Main._consLabeledDynRuleScopeId_2)
                            { 
                              Fail21706:
                              { 
                                IStrategoTerm o_4243 = null;
                                IStrategoTerm p_4243 = null;
                                IStrategoTerm q_4243 = null;
                                o_4243 = term.getSubterm(0);
                                q_4243 = term.getSubterm(1);
                                term = signature_of_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail21706;
                                term = $Declare$Cookie_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail21706;
                                term = termFactory.annotateTerm(o_4243, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                                p_4243 = term;
                                term = declare_bodies_top_0_0.instance.invoke(context, q_4243);
                                if(term == null)
                                  break Fail21706;
                                term = termFactory.makeAppl(Main._consLabeledDynRuleScopeId_2, new IStrategoTerm[]{p_4243, term});
                                if(true)
                                  break Success11704;
                              }
                              term = term11800;
                            }
                            Success11705:
                            { 
                              if(cons549 == Main._consAssign_2)
                              { 
                                Fail21707:
                                { 
                                  IStrategoTerm f_4243 = null;
                                  IStrategoTerm g_4243 = null;
                                  IStrategoTerm h_4243 = null;
                                  IStrategoTerm i_4243 = null;
                                  IStrategoTerm l_4243 = null;
                                  h_4243 = term.getSubterm(0);
                                  f_4243 = term.getSubterm(1);
                                  l_4243 = term;
                                  IStrategoTerm term11803 = term;
                                  Success11706:
                                  { 
                                    Fail21708:
                                    { 
                                      term = declare_bodies_top_0_0.instance.invoke(context, f_4243);
                                      if(term == null)
                                        break Fail21708;
                                      g_4243 = term;
                                      term = declare_match_0_0.instance.invoke(context, h_4243);
                                      if(term == null)
                                        break Fail21708;
                                      i_4243 = term;
                                      if(true)
                                        break Success11706;
                                    }
                                    term = term11803;
                                    IStrategoTerm j_4243 = null;
                                    IStrategoTerm k_4243 = null;
                                    IStrategoTerm n_4243 = null;
                                    j_4243 = term;
                                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                    if(term == null)
                                      break Fail21707;
                                    k_4243 = term;
                                    n_4243 = j_4243;
                                    term = report_with_failure_0_2.instance.invoke(context, n_4243, trans.const4392, k_4243);
                                    if(term == null)
                                      break Fail21707;
                                  }
                                  term = l_4243;
                                  if(i_4243 == null || g_4243 == null)
                                    break Fail21707;
                                  term = termFactory.makeAppl(Main._consAssign_2, new IStrategoTerm[]{i_4243, g_4243});
                                  if(true)
                                    break Success11705;
                                }
                                term = term11800;
                              }
                              Success11707:
                              { 
                                if(cons549 == Main._consAM_2)
                                { 
                                  Fail21709:
                                  { 
                                    IStrategoTerm u_4242 = null;
                                    IStrategoTerm v_4242 = null;
                                    IStrategoTerm w_4242 = null;
                                    IStrategoTerm x_4242 = null;
                                    IStrategoTerm a_4243 = null;
                                    u_4242 = term.getSubterm(0);
                                    w_4242 = term.getSubterm(1);
                                    a_4243 = term;
                                    IStrategoTerm term11805 = term;
                                    Success11708:
                                    { 
                                      Fail21710:
                                      { 
                                        term = declare_bodies_top_0_0.instance.invoke(context, u_4242);
                                        if(term == null)
                                          break Fail21710;
                                        v_4242 = term;
                                        term = declare_match_0_0.instance.invoke(context, w_4242);
                                        if(term == null)
                                          break Fail21710;
                                        x_4242 = term;
                                        if(true)
                                          break Success11708;
                                      }
                                      term = term11805;
                                      IStrategoTerm y_4242 = null;
                                      IStrategoTerm z_4242 = null;
                                      IStrategoTerm c_4243 = null;
                                      y_4242 = term;
                                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                      if(term == null)
                                        break Fail21709;
                                      z_4242 = term;
                                      c_4243 = y_4242;
                                      term = report_with_failure_0_2.instance.invoke(context, c_4243, trans.const4392, z_4242);
                                      if(term == null)
                                        break Fail21709;
                                    }
                                    term = a_4243;
                                    if(v_4242 == null || x_4242 == null)
                                      break Fail21709;
                                    term = termFactory.makeAppl(Main._consAM_2, new IStrategoTerm[]{v_4242, x_4242});
                                    if(true)
                                      break Success11707;
                                  }
                                  term = term11800;
                                }
                                IStrategoTerm term11806 = term;
                                Success11709:
                                { 
                                  Fail21711:
                                  { 
                                    TermReference f_4242 = new TermReference();
                                    TermReference g_4242 = new TermReference();
                                    TermReference h_4242 = new TermReference();
                                    TermReference i_4242 = new TermReference();
                                    TermReference j_4242 = new TermReference();
                                    TermReference k_4242 = new TermReference();
                                    IStrategoTerm n_4242 = null;
                                    if(term.getTermType() != IStrategoTerm.APPL || Main._consGuardedLChoice_3 != ((IStrategoAppl)term).getConstructor())
                                      break Fail21711;
                                    if(f_4242.value == null)
                                      f_4242.value = term.getSubterm(0);
                                    else
                                      if(f_4242.value != term.getSubterm(0) && !f_4242.value.match(term.getSubterm(0)))
                                        break Fail21711;
                                    if(h_4242.value == null)
                                      h_4242.value = term.getSubterm(1);
                                    else
                                      if(h_4242.value != term.getSubterm(1) && !h_4242.value.match(term.getSubterm(1)))
                                        break Fail21711;
                                    if(j_4242.value == null)
                                      j_4242.value = term.getSubterm(2);
                                    else
                                      if(j_4242.value != term.getSubterm(2) && !j_4242.value.match(term.getSubterm(2)))
                                        break Fail21711;
                                    n_4242 = term;
                                    IStrategoTerm term11807 = term;
                                    Success11710:
                                    { 
                                      Fail21712:
                                      { 
                                        IStrategoTerm o_4242 = null;
                                        IStrategoTerm p_4242 = null;
                                        p_4242 = term;
                                        o_4242 = trans.constCons2033;
                                        term = p_4242;
                                        lifted6624 lifted66240 = new lifted6624();
                                        lifted6623 lifted66230 = new lifted6623();
                                        lifted66240.j_4242 = j_4242;
                                        lifted66240.k_4242 = k_4242;
                                        lifted66230.f_4242 = f_4242;
                                        lifted66230.g_4242 = g_4242;
                                        lifted66230.h_4242 = h_4242;
                                        lifted66230.i_4242 = i_4242;
                                        term = dr_fork_and_union_2_1.instance.invoke(context, term, lifted66230, lifted66240, o_4242);
                                        if(term == null)
                                          break Fail21712;
                                        if(true)
                                          break Success11710;
                                      }
                                      term = term11807;
                                      IStrategoTerm l_4242 = null;
                                      IStrategoTerm m_4242 = null;
                                      IStrategoTerm r_4242 = null;
                                      l_4242 = term;
                                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                      if(term == null)
                                        break Fail21711;
                                      m_4242 = term;
                                      r_4242 = l_4242;
                                      term = report_with_failure_0_2.instance.invoke(context, r_4242, trans.const4392, m_4242);
                                      if(term == null)
                                        break Fail21711;
                                    }
                                    term = n_4242;
                                    if(g_4242.value == null || (i_4242.value == null || k_4242.value == null))
                                      break Fail21711;
                                    term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{g_4242.value, i_4242.value, k_4242.value});
                                    if(true)
                                      break Success11709;
                                  }
                                  term = term11806;
                                  IStrategoTerm term11808 = term;
                                  IStrategoConstructor cons550 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                                  Success11711:
                                  { 
                                    if(cons550 == Main._consVar_1)
                                    { 
                                      Fail21713:
                                      { 
                                        IStrategoTerm y_4241 = null;
                                        IStrategoTerm arg7768 = term.getSubterm(0);
                                        y_4241 = arg7768;
                                        IStrategoList annos685 = arg7768.getAnnotations();
                                        if(annos685.getTermType() != IStrategoTerm.LIST || !((IStrategoList)annos685).isEmpty())
                                          break Fail21713;
                                        term = declare_cookie_of_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail21713;
                                        term = termFactory.annotateTerm(y_4241, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                                        term = termFactory.makeAppl(Main._consVar_1, new IStrategoTerm[]{term});
                                        if(true)
                                          break Success11711;
                                      }
                                      term = term11808;
                                    }
                                    Success11712:
                                    { 
                                      if(cons550 == Main._consCallT_3)
                                      { 
                                        Fail21714:
                                        { 
                                          IStrategoTerm g_4241 = null;
                                          IStrategoTerm h_4241 = null;
                                          IStrategoTerm i_4241 = null;
                                          IStrategoTerm j_4241 = null;
                                          IStrategoTerm k_4241 = null;
                                          IStrategoTerm l_4241 = null;
                                          IStrategoTerm q_4241 = null;
                                          IStrategoTerm v_4241 = null;
                                          IStrategoTerm arg7769 = term.getSubterm(0);
                                          if(arg7769.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7769).getConstructor())
                                            break Fail21714;
                                          g_4241 = arg7769.getSubterm(0);
                                          k_4241 = term.getSubterm(1);
                                          i_4241 = term.getSubterm(2);
                                          q_4241 = term;
                                          IStrategoTerm term11810 = term;
                                          Success11713:
                                          { 
                                            Fail21715:
                                            { 
                                              Success11714:
                                              { 
                                                Fail21716:
                                                { 
                                                  term = declare_cookie_of_0_0.instance.invoke(context, term);
                                                  if(term == null)
                                                    break Fail21716;
                                                  term = termFactory.annotateTerm(g_4241, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                                                  h_4241 = term;
                                                  if(true)
                                                    break Success11714;
                                                }
                                                term = g_4241;
                                                h_4241 = g_4241;
                                              }
                                              if(true)
                                                break Success11713;
                                            }
                                            term = term11810;
                                            IStrategoTerm m_4241 = null;
                                            IStrategoTerm n_4241 = null;
                                            IStrategoTerm u_4241 = null;
                                            m_4241 = term;
                                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                            if(term == null)
                                              break Fail21714;
                                            n_4241 = term;
                                            u_4241 = m_4241;
                                            term = report_with_failure_0_2.instance.invoke(context, u_4241, trans.const4392, n_4241);
                                            if(term == null)
                                              break Fail21714;
                                          }
                                          term = q_4241;
                                          v_4241 = q_4241;
                                          IStrategoTerm term11812 = term;
                                          Success11715:
                                          { 
                                            Fail21717:
                                            { 
                                              term = declare_bodies_top_0_0.instance.invoke(context, i_4241);
                                              if(term == null)
                                                break Fail21717;
                                              j_4241 = term;
                                              term = map_1_0.instance.invoke(context, k_4241, lifted6625.instance);
                                              if(term == null)
                                                break Fail21717;
                                              l_4241 = term;
                                              if(true)
                                                break Success11715;
                                            }
                                            term = term11812;
                                            IStrategoTerm o_4241 = null;
                                            IStrategoTerm p_4241 = null;
                                            IStrategoTerm x_4241 = null;
                                            o_4241 = term;
                                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                            if(term == null)
                                              break Fail21714;
                                            p_4241 = term;
                                            x_4241 = o_4241;
                                            term = report_with_failure_0_2.instance.invoke(context, x_4241, trans.const4392, p_4241);
                                            if(term == null)
                                              break Fail21714;
                                          }
                                          term = v_4241;
                                          if(h_4241 == null || (l_4241 == null || j_4241 == null))
                                            break Fail21714;
                                          term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consSVar_1, new IStrategoTerm[]{h_4241}), l_4241, j_4241});
                                          if(true)
                                            break Success11712;
                                        }
                                        term = term11808;
                                      }
                                      if(cons550 == Main._consOp_2)
                                      { 
                                        IStrategoTerm q_4240 = null;
                                        IStrategoTerm r_4240 = null;
                                        IStrategoTerm s_4240 = null;
                                        IStrategoTerm t_4240 = null;
                                        IStrategoTerm w_4240 = null;
                                        IStrategoTerm z_4240 = null;
                                        q_4240 = term.getSubterm(0);
                                        s_4240 = term.getSubterm(1);
                                        w_4240 = term;
                                        term = declare_cookie_of_0_0.instance.invoke(context, term);
                                        if(term == null)
                                          break Fail21686;
                                        term = termFactory.annotateTerm(q_4240, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                                        r_4240 = term;
                                        term = w_4240;
                                        z_4240 = w_4240;
                                        IStrategoTerm term11814 = term;
                                        Success11716:
                                        { 
                                          Fail21718:
                                          { 
                                            term = declare_bodies_top_0_0.instance.invoke(context, s_4240);
                                            if(term == null)
                                              break Fail21718;
                                            t_4240 = term;
                                            if(true)
                                              break Success11716;
                                          }
                                          term = term11814;
                                          IStrategoTerm u_4240 = null;
                                          IStrategoTerm v_4240 = null;
                                          IStrategoTerm b_4241 = null;
                                          u_4240 = term;
                                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                          if(term == null)
                                            break Fail21686;
                                          v_4240 = term;
                                          b_4241 = u_4240;
                                          term = report_with_failure_0_2.instance.invoke(context, b_4241, trans.const4392, v_4240);
                                          if(term == null)
                                            break Fail21686;
                                        }
                                        term = z_4240;
                                        if(t_4240 == null)
                                          break Fail21686;
                                        term = termFactory.makeAppl(Main._consOp_2, new IStrategoTerm[]{r_4240, t_4240});
                                      }
                                      else
                                      { 
                                        break Fail21686;
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