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

@SuppressWarnings("all") public class declare_globals_0_0 extends Strategy 
{ 
  public static declare_globals_0_0 instance = new declare_globals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_globals_0_0");
    Fail21606:
    { 
      IStrategoTerm term11697 = term;
      IStrategoConstructor cons546 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11621:
      { 
        if(cons546 == Main._consSDefT_4)
        { 
          Fail21607:
          { 
            IStrategoTerm e_4228 = null;
            IStrategoTerm f_4228 = null;
            IStrategoTerm g_4228 = null;
            IStrategoTerm h_4228 = null;
            IStrategoTerm i_4228 = null;
            IStrategoTerm j_4228 = null;
            IStrategoTerm m_4228 = null;
            g_4228 = term.getSubterm(0);
            e_4228 = term.getSubterm(1);
            f_4228 = term.getSubterm(2);
            i_4228 = term.getSubterm(3);
            m_4228 = term;
            IStrategoTerm term11698 = term;
            Success11622:
            { 
              Fail21608:
              { 
                term = declare_definition_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21608;
                term = termFactory.annotateTerm(g_4228, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
                h_4228 = term;
                term = topdown_1_0.instance.invoke(context, i_4228, lifted6581.instance);
                if(term == null)
                  break Fail21608;
                j_4228 = term;
                if(true)
                  break Success11622;
              }
              term = term11698;
              IStrategoTerm k_4228 = null;
              IStrategoTerm l_4228 = null;
              IStrategoTerm q_4228 = null;
              k_4228 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21607;
              l_4228 = term;
              q_4228 = k_4228;
              term = report_with_failure_0_2.instance.invoke(context, q_4228, trans.const4365, l_4228);
              if(term == null)
                break Fail21607;
            }
            term = m_4228;
            if(h_4228 == null || j_4228 == null)
              break Fail21607;
            term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{h_4228, e_4228, f_4228, j_4228});
            if(true)
              break Success11621;
          }
          term = term11697;
        }
        Success11623:
        { 
          if(cons546 == Main._consExtSDef_3)
          { 
            Fail21609:
            { 
              IStrategoTerm x_4227 = null;
              x_4227 = term;
              IStrategoTerm term11700 = term;
              Success11624:
              { 
                Fail21610:
                { 
                  term = redeclare_definition_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21610;
                  if(true)
                    break Success11624;
                }
                term = term11700;
                IStrategoTerm v_4227 = null;
                IStrategoTerm w_4227 = null;
                IStrategoTerm z_4227 = null;
                v_4227 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail21609;
                w_4227 = term;
                z_4227 = v_4227;
                term = report_with_failure_0_2.instance.invoke(context, z_4227, trans.const4365, w_4227);
                if(term == null)
                  break Fail21609;
              }
              term = x_4227;
              if(true)
                break Success11623;
            }
            term = term11697;
          }
          Success11625:
          { 
            if(cons546 == Main._consOpDecl_2)
            { 
              Fail21611:
              { 
                IStrategoTerm q_4226 = null;
                IStrategoTerm r_4226 = null;
                IStrategoTerm s_4226 = null;
                IStrategoTerm t_4226 = null;
                IStrategoTerm u_4226 = null;
                IStrategoTerm v_4226 = null;
                IStrategoTerm w_4226 = null;
                IStrategoTerm c_4227 = null;
                IStrategoTerm h_4227 = null;
                r_4226 = term.getSubterm(0);
                q_4226 = term.getSubterm(1);
                c_4227 = term;
                IStrategoTerm term11702 = term;
                Success11626:
                { 
                  Fail21612:
                  { 
                    IStrategoTerm d_4227 = null;
                    term = redeclare_definition_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21612;
                    d_4227 = term;
                    w_4226 = term;
                    term = termFactory.annotateTerm(r_4226, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(d_4227, (IStrategoList)trans.constNil3)));
                    s_4226 = term;
                    if(true)
                      break Success11626;
                  }
                  term = term11702;
                  IStrategoTerm x_4226 = null;
                  IStrategoTerm y_4226 = null;
                  IStrategoTerm g_4227 = null;
                  x_4226 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21611;
                  y_4226 = term;
                  g_4227 = x_4226;
                  term = report_with_failure_0_2.instance.invoke(context, g_4227, trans.const4365, y_4226);
                  if(term == null)
                    break Fail21611;
                }
                term = c_4227;
                h_4227 = c_4227;
                IStrategoTerm term11703 = term;
                Success11627:
                { 
                  Fail21613:
                  { 
                    IStrategoTerm z_4226 = null;
                    IStrategoTerm k_4227 = null;
                    IStrategoTerm m_4227 = null;
                    IStrategoTerm n_4227 = null;
                    term = signature_of_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21613;
                    if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                      break Fail21613;
                    t_4226 = term.getSubterm(0);
                    u_4226 = term.getSubterm(1);
                    term = termFactory.makeTuple(t_4226, u_4226, trans.const4227);
                    v_4226 = term;
                    z_4226 = term;
                    m_4227 = term;
                    k_4227 = trans.const4358;
                    term = m_4227;
                    n_4227 = m_4227;
                    if(w_4226 == null)
                      break Fail21613;
                    term = termFactory.makeTuple(trans.const4359, w_4226);
                    term = dr_set_rule_0_3.instance.invoke(context, n_4227, k_4227, v_4226, term);
                    if(term == null)
                      break Fail21613;
                    term = z_4226;
                    if(true)
                      break Success11627;
                  }
                  term = term11703;
                  IStrategoTerm a_4227 = null;
                  IStrategoTerm b_4227 = null;
                  IStrategoTerm p_4227 = null;
                  a_4227 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21611;
                  b_4227 = term;
                  p_4227 = a_4227;
                  term = report_with_failure_0_2.instance.invoke(context, p_4227, trans.const4365, b_4227);
                  if(term == null)
                    break Fail21611;
                }
                term = h_4227;
                if(s_4226 == null)
                  break Fail21611;
                term = termFactory.makeAppl(Main._consOpDecl_2, new IStrategoTerm[]{s_4226, q_4226});
                if(true)
                  break Success11625;
              }
              term = term11697;
            }
            Success11628:
            { 
              if(cons546 == Main._consExtOpDecl_2)
              { 
                Fail21614:
                { 
                  IStrategoTerm g_4226 = null;
                  g_4226 = term;
                  IStrategoTerm term11705 = term;
                  Success11629:
                  { 
                    Fail21615:
                    { 
                      term = redeclare_definition_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21615;
                      if(true)
                        break Success11629;
                    }
                    term = term11705;
                    IStrategoTerm e_4226 = null;
                    IStrategoTerm f_4226 = null;
                    IStrategoTerm i_4226 = null;
                    e_4226 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail21614;
                    f_4226 = term;
                    i_4226 = e_4226;
                    term = report_with_failure_0_2.instance.invoke(context, i_4226, trans.const4365, f_4226);
                    if(term == null)
                      break Fail21614;
                  }
                  term = g_4226;
                  if(true)
                    break Success11628;
                }
                term = term11697;
              }
              Success11630:
              { 
                if(cons546 == Main._consOverlay_3)
                { 
                  Fail21616:
                  { 
                    IStrategoTerm z_4224 = null;
                    IStrategoTerm a_4225 = null;
                    IStrategoTerm b_4225 = null;
                    IStrategoTerm c_4225 = null;
                    IStrategoTerm d_4225 = null;
                    IStrategoTerm e_4225 = null;
                    IStrategoTerm f_4225 = null;
                    IStrategoTerm g_4225 = null;
                    IStrategoTerm m_4225 = null;
                    IStrategoTerm r_4225 = null;
                    b_4225 = term.getSubterm(0);
                    z_4224 = term.getSubterm(1);
                    a_4225 = term.getSubterm(2);
                    m_4225 = term;
                    IStrategoTerm term11707 = term;
                    Success11631:
                    { 
                      Fail21617:
                      { 
                        IStrategoTerm n_4225 = null;
                        term = redeclare_definition_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21617;
                        n_4225 = term;
                        g_4225 = term;
                        term = termFactory.annotateTerm(b_4225, checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(n_4225, (IStrategoList)trans.constNil3)));
                        c_4225 = term;
                        if(true)
                          break Success11631;
                      }
                      term = term11707;
                      IStrategoTerm h_4225 = null;
                      IStrategoTerm i_4225 = null;
                      IStrategoTerm q_4225 = null;
                      h_4225 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21616;
                      i_4225 = term;
                      q_4225 = h_4225;
                      term = report_with_failure_0_2.instance.invoke(context, q_4225, trans.const4365, i_4225);
                      if(term == null)
                        break Fail21616;
                    }
                    term = m_4225;
                    r_4225 = m_4225;
                    IStrategoTerm term11708 = term;
                    Success11632:
                    { 
                      Fail21618:
                      { 
                        IStrategoTerm j_4225 = null;
                        IStrategoTerm u_4225 = null;
                        IStrategoTerm w_4225 = null;
                        IStrategoTerm x_4225 = null;
                        term = signature_of_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21618;
                        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
                          break Fail21618;
                        d_4225 = term.getSubterm(0);
                        e_4225 = term.getSubterm(1);
                        term = termFactory.makeTuple(d_4225, e_4225, trans.const4227);
                        f_4225 = term;
                        j_4225 = term;
                        w_4225 = term;
                        u_4225 = trans.const4358;
                        term = w_4225;
                        x_4225 = w_4225;
                        if(g_4225 == null)
                          break Fail21618;
                        term = termFactory.makeTuple(trans.const4359, g_4225);
                        term = dr_set_rule_0_3.instance.invoke(context, x_4225, u_4225, f_4225, term);
                        if(term == null)
                          break Fail21618;
                        term = j_4225;
                        if(true)
                          break Success11632;
                      }
                      term = term11708;
                      IStrategoTerm k_4225 = null;
                      IStrategoTerm l_4225 = null;
                      IStrategoTerm z_4225 = null;
                      k_4225 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21616;
                      l_4225 = term;
                      z_4225 = k_4225;
                      term = report_with_failure_0_2.instance.invoke(context, z_4225, trans.const4365, l_4225);
                      if(term == null)
                        break Fail21616;
                    }
                    term = r_4225;
                    if(c_4225 == null)
                      break Fail21616;
                    term = termFactory.makeAppl(Main._consOverlay_3, new IStrategoTerm[]{c_4225, z_4224, a_4225});
                    if(true)
                      break Success11630;
                  }
                  term = term11697;
                }
                Success11633:
                { 
                  if(cons546 == Main._consImport_1)
                  { 
                    Fail21619:
                    { 
                      IStrategoTerm j_4224 = null;
                      j_4224 = term.getSubterm(0);
                      IStrategoTerm term11710 = term;
                      Success11634:
                      { 
                        Fail21620:
                        { 
                          IStrategoTerm term11711 = term;
                          Success11635:
                          { 
                            Fail21621:
                            { 
                              term = open_import_3_0.instance.invoke(context, j_4224, resolve_import_decl_0_0.instance, read_stratego_signatures_0_0.instance, declare_globals_top_0_0.instance);
                              if(term == null)
                                break Fail21621;
                              if(true)
                                break Success11635;
                            }
                            term = term11711;
                            IStrategoTerm k_4224 = null;
                            IStrategoTerm o_4224 = null;
                            IStrategoTerm q_4224 = null;
                            IStrategoTerm r_4224 = null;
                            k_4224 = term;
                            q_4224 = term;
                            o_4224 = trans.const4366;
                            r_4224 = q_4224;
                            term = termFactory.makeTuple(trans.const4367, j_4224);
                            term = dr_set_rule_0_3.instance.invoke(context, r_4224, o_4224, j_4224, term);
                            if(term == null)
                              break Fail21620;
                            term = k_4224;
                          }
                          if(true)
                            break Success11634;
                        }
                        term = term11710;
                        IStrategoTerm l_4224 = null;
                        IStrategoTerm m_4224 = null;
                        IStrategoTerm t_4224 = null;
                        l_4224 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail21619;
                        m_4224 = term;
                        t_4224 = l_4224;
                        term = report_with_failure_0_2.instance.invoke(context, t_4224, trans.const4365, m_4224);
                        if(term == null)
                          break Fail21619;
                      }
                      term = termFactory.makeAppl(Main._consImport_1, new IStrategoTerm[]{j_4224});
                      if(true)
                        break Success11633;
                    }
                    term = term11697;
                  }
                  if(cons546 == Main._consImportWildcard_1)
                  { 
                    IStrategoTerm r_4223 = null;
                    r_4223 = term.getSubterm(0);
                    IStrategoTerm term11712 = term;
                    Success11636:
                    { 
                      Fail21622:
                      { 
                        IStrategoTerm term11713 = term;
                        Success11637:
                        { 
                          Fail21623:
                          { 
                            term = open_wildcard_import_4_0.instance.invoke(context, r_4223, resolve_import_path_0_0.instance, read_stratego_signatures_0_0.instance, declare_globals_top_0_0.instance, lifted6589.instance);
                            if(term == null)
                              break Fail21623;
                            if(true)
                              break Success11637;
                          }
                          term = term11713;
                          IStrategoTerm s_4223 = null;
                          IStrategoTerm a_4224 = null;
                          IStrategoTerm c_4224 = null;
                          IStrategoTerm d_4224 = null;
                          s_4223 = term;
                          c_4224 = term;
                          a_4224 = trans.const4366;
                          d_4224 = c_4224;
                          term = termFactory.makeTuple(trans.const4367, r_4223);
                          term = dr_set_rule_0_3.instance.invoke(context, d_4224, a_4224, r_4223, term);
                          if(term == null)
                            break Fail21622;
                          term = s_4223;
                        }
                        if(true)
                          break Success11636;
                      }
                      term = term11712;
                      IStrategoTerm t_4223 = null;
                      IStrategoTerm u_4223 = null;
                      IStrategoTerm f_4224 = null;
                      t_4223 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21606;
                      u_4223 = term;
                      f_4224 = t_4223;
                      term = report_with_failure_0_2.instance.invoke(context, f_4224, trans.const4365, u_4223);
                      if(term == null)
                        break Fail21606;
                    }
                    term = termFactory.makeAppl(Main._consImportWildcard_1, new IStrategoTerm[]{r_4223});
                  }
                  else
                  { 
                    break Fail21606;
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