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

@SuppressWarnings("all") public class analyze_ast_0_0 extends Strategy 
{ 
  public static analyze_ast_0_0 instance = new analyze_ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_ast_0_0");
    Fail21536:
    { 
      IStrategoTerm h_4212 = null;
      IStrategoTerm i_4212 = null;
      IStrategoTerm j_4212 = null;
      IStrategoTerm k_4212 = null;
      IStrategoTerm b_4215 = null;
      IStrategoTerm c_4217 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21536;
      j_4212 = term.getSubterm(0);
      h_4212 = term.getSubterm(1);
      i_4212 = term.getSubterm(2);
      b_4215 = term;
      IStrategoTerm term11639 = term;
      Success11564:
      { 
        Fail21537:
        { 
          IStrategoTerm l_4212 = null;
          IStrategoTerm m_4212 = null;
          IStrategoTerm e_4215 = null;
          IStrategoTerm r_4212 = null;
          IStrategoTerm t_4212 = null;
          IStrategoTerm u_4212 = null;
          IStrategoTerm z_4212 = null;
          IStrategoTerm b_4213 = null;
          IStrategoTerm c_4213 = null;
          IStrategoTerm i_4215 = null;
          IStrategoTerm j_4215 = null;
          IStrategoTerm l_4215 = null;
          IStrategoTerm m_4215 = null;
          IStrategoTerm n_4215 = null;
          IStrategoTerm e_4213 = null;
          IStrategoTerm f_4213 = null;
          IStrategoTerm q_4215 = null;
          IStrategoTerm k_4213 = null;
          IStrategoTerm m_4213 = null;
          IStrategoTerm n_4213 = null;
          IStrategoTerm s_4213 = null;
          IStrategoTerm u_4213 = null;
          IStrategoTerm v_4213 = null;
          IStrategoTerm u_4215 = null;
          IStrategoTerm v_4215 = null;
          IStrategoTerm x_4215 = null;
          IStrategoTerm y_4215 = null;
          IStrategoTerm z_4215 = null;
          IStrategoTerm x_4213 = null;
          IStrategoTerm y_4213 = null;
          IStrategoTerm a_4216 = null;
          IStrategoTerm b_4216 = null;
          IStrategoTerm d_4216 = null;
          IStrategoTerm e_4216 = null;
          IStrategoTerm f_4216 = null;
          l_4212 = term;
          term = i_4212;
          IStrategoTerm term11640 = term;
          Success11565:
          { 
            Fail21538:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21538;
              if(true)
                break Success11565;
            }
            term = term11640;
            IStrategoTerm term11641 = term;
            Success11566:
            { 
              Fail21539:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21539;
                if(true)
                  break Success11566;
              }
              term = term11641;
              IStrategoTerm term11642 = term;
              Success11567:
              { 
                Fail21540:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21540;
                  if(true)
                    break Success11567;
                }
                term = term11642;
                IStrategoTerm term11643 = term;
                Success11568:
                { 
                  Fail21541:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21541;
                    if(true)
                      break Success11568;
                  }
                  term = term11643;
                  IStrategoTerm n_4212 = null;
                  IStrategoTerm o_4212 = null;
                  IStrategoTerm q_4212 = null;
                  n_4212 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21537;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21537;
                  o_4212 = ((IStrategoList)term).tail();
                  q_4212 = o_4212;
                  term = report_failure_0_2.instance.invoke(context, q_4212, trans.const4344, n_4212);
                  if(term == null)
                    break Fail21537;
                }
              }
            }
          }
          t_4212 = term;
          r_4212 = trans.const4230;
          u_4212 = t_4212;
          term = string_replace_0_2.instance.invoke(context, u_4212, r_4212, trans.const4230);
          if(term == null)
            break Fail21537;
          e_4215 = term;
          term = h_4212;
          IStrategoTerm term11644 = term;
          Success11569:
          { 
            Fail21542:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21542;
              if(true)
                break Success11569;
            }
            term = term11644;
            IStrategoTerm term11645 = term;
            Success11570:
            { 
              Fail21543:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21543;
                if(true)
                  break Success11570;
              }
              term = term11645;
              IStrategoTerm term11646 = term;
              Success11571:
              { 
                Fail21544:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21544;
                  if(true)
                    break Success11571;
                }
                term = term11646;
                IStrategoTerm term11647 = term;
                Success11572:
                { 
                  Fail21545:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21545;
                    if(true)
                      break Success11572;
                  }
                  term = term11647;
                  IStrategoTerm v_4212 = null;
                  IStrategoTerm w_4212 = null;
                  IStrategoTerm y_4212 = null;
                  v_4212 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21537;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21537;
                  w_4212 = ((IStrategoList)term).tail();
                  y_4212 = w_4212;
                  term = report_failure_0_2.instance.invoke(context, y_4212, trans.const4344, v_4212);
                  if(term == null)
                    break Fail21537;
                }
              }
            }
          }
          b_4213 = term;
          z_4212 = trans.const4230;
          c_4213 = b_4213;
          term = string_replace_0_2.instance.invoke(context, c_4213, z_4212, trans.const4345);
          if(term == null)
            break Fail21537;
          term = (IStrategoTerm)termFactory.makeListCons(e_4215, termFactory.makeListCons(trans.const4270, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21537;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          m_4212 = term;
          l_4215 = term;
          i_4215 = trans.const4263;
          m_4215 = l_4215;
          j_4215 = trans.constCons1966;
          n_4215 = m_4215;
          term = termFactory.makeTuple(trans.const4264, m_4212);
          term = dr_set_rule_0_3.instance.invoke(context, n_4215, i_4215, j_4215, term);
          if(term == null)
            break Fail21537;
          e_4213 = l_4212;
          term = i_4212;
          IStrategoTerm term11648 = term;
          Success11573:
          { 
            Fail21546:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21546;
              if(true)
                break Success11573;
            }
            term = term11648;
            IStrategoTerm term11649 = term;
            Success11574:
            { 
              Fail21547:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21547;
                if(true)
                  break Success11574;
              }
              term = term11649;
              IStrategoTerm term11650 = term;
              Success11575:
              { 
                Fail21548:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21548;
                  if(true)
                    break Success11575;
                }
                term = term11650;
                IStrategoTerm term11651 = term;
                Success11576:
                { 
                  Fail21549:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21549;
                    if(true)
                      break Success11576;
                  }
                  term = term11651;
                  IStrategoTerm g_4213 = null;
                  IStrategoTerm h_4213 = null;
                  IStrategoTerm j_4213 = null;
                  g_4213 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21537;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21537;
                  h_4213 = ((IStrategoList)term).tail();
                  j_4213 = h_4213;
                  term = report_failure_0_2.instance.invoke(context, j_4213, trans.const4344, g_4213);
                  if(term == null)
                    break Fail21537;
                }
              }
            }
          }
          m_4213 = term;
          k_4213 = trans.const4230;
          n_4213 = m_4213;
          term = string_replace_0_2.instance.invoke(context, n_4213, k_4213, trans.const4230);
          if(term == null)
            break Fail21537;
          q_4215 = term;
          term = h_4212;
          IStrategoTerm term11652 = term;
          Success11577:
          { 
            Fail21550:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21550;
              if(true)
                break Success11577;
            }
            term = term11652;
            IStrategoTerm term11653 = term;
            Success11578:
            { 
              Fail21551:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21551;
                if(true)
                  break Success11578;
              }
              term = term11653;
              IStrategoTerm term11654 = term;
              Success11579:
              { 
                Fail21552:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21552;
                  if(true)
                    break Success11579;
                }
                term = term11654;
                IStrategoTerm term11655 = term;
                Success11580:
                { 
                  Fail21553:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21553;
                    if(true)
                      break Success11580;
                  }
                  term = term11655;
                  IStrategoTerm o_4213 = null;
                  IStrategoTerm p_4213 = null;
                  IStrategoTerm r_4213 = null;
                  o_4213 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21537;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21537;
                  p_4213 = ((IStrategoList)term).tail();
                  r_4213 = p_4213;
                  term = report_failure_0_2.instance.invoke(context, r_4213, trans.const4344, o_4213);
                  if(term == null)
                    break Fail21537;
                }
              }
            }
          }
          u_4213 = term;
          s_4213 = trans.const4230;
          v_4213 = u_4213;
          term = string_replace_0_2.instance.invoke(context, v_4213, s_4213, trans.const4345);
          if(term == null)
            break Fail21537;
          term = (IStrategoTerm)termFactory.makeListCons(q_4215, termFactory.makeListCons(trans.const4270, termFactory.makeListCons(term, (IStrategoList)trans.constNil3)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21537;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
          term = dirname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21537;
          f_4213 = term;
          x_4215 = term;
          u_4215 = trans.const4346;
          y_4215 = x_4215;
          v_4215 = trans.constCons1966;
          z_4215 = y_4215;
          term = termFactory.makeTuple(trans.const4347, f_4213);
          term = dr_set_rule_0_3.instance.invoke(context, z_4215, u_4215, v_4215, term);
          if(term == null)
            break Fail21537;
          x_4213 = e_4213;
          term = i_4212;
          y_4213 = i_4212;
          d_4216 = term;
          a_4216 = trans.const4265;
          e_4216 = d_4216;
          b_4216 = trans.constCons1966;
          f_4216 = e_4216;
          term = termFactory.makeTuple(trans.const4266, y_4213);
          term = dr_set_rule_0_3.instance.invoke(context, f_4216, a_4216, b_4216, term);
          if(term == null)
            break Fail21537;
          term = try_1_0.instance.invoke(context, x_4213, get_source_base_dir_0_0.instance);
          if(term == null)
            break Fail21537;
          IStrategoTerm term11656 = term;
          Success11581:
          { 
            Fail21554:
            { 
              IStrategoTerm a_4214 = null;
              IStrategoTerm f_4214 = null;
              IStrategoTerm h_4214 = null;
              IStrategoTerm i_4214 = null;
              a_4214 = term;
              term = i_4212;
              IStrategoTerm term11657 = term;
              Success11582:
              { 
                Fail21555:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21555;
                  if(true)
                    break Success11582;
                }
                term = term11657;
                IStrategoTerm term11658 = term;
                Success11583:
                { 
                  Fail21556:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21556;
                    if(true)
                      break Success11583;
                  }
                  term = term11658;
                  IStrategoTerm term11659 = term;
                  Success11584:
                  { 
                    Fail21557:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21557;
                      if(true)
                        break Success11584;
                    }
                    term = term11659;
                    IStrategoTerm term11660 = term;
                    Success11585:
                    { 
                      Fail21558:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21558;
                        if(true)
                          break Success11585;
                      }
                      term = term11660;
                      IStrategoTerm b_4214 = null;
                      IStrategoTerm c_4214 = null;
                      IStrategoTerm e_4214 = null;
                      b_4214 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21554;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail21554;
                      c_4214 = ((IStrategoList)term).tail();
                      e_4214 = c_4214;
                      term = report_failure_0_2.instance.invoke(context, e_4214, trans.const4344, b_4214);
                      if(term == null)
                        break Fail21554;
                    }
                  }
                }
              }
              h_4214 = term;
              f_4214 = trans.const4230;
              i_4214 = h_4214;
              term = string_replace_0_2.instance.invoke(context, i_4214, f_4214, trans.const4230);
              if(term == null)
                break Fail21554;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2008);
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21554;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21554;
              term = a_4214;
              { 
                IStrategoTerm j_4214 = null;
                IStrategoTerm k_4216 = null;
                IStrategoTerm l_4216 = null;
                IStrategoTerm n_4216 = null;
                IStrategoTerm o_4216 = null;
                IStrategoTerm p_4216 = null;
                j_4214 = term;
                n_4216 = term;
                k_4216 = trans.const4349;
                o_4216 = n_4216;
                l_4216 = trans.constCons1966;
                p_4216 = o_4216;
                term = dr_set_rule_0_3.instance.invoke(context, p_4216, k_4216, l_4216, trans.const4350);
                if(term == null)
                  break Fail21537;
                term = j_4214;
                if(true)
                  break Success11581;
              }
            }
            term = term11656;
          }
          IStrategoTerm term11661 = term;
          Success11586:
          { 
            Fail21559:
            { 
              IStrategoTerm k_4214 = null;
              IStrategoTerm p_4214 = null;
              IStrategoTerm r_4214 = null;
              IStrategoTerm s_4214 = null;
              k_4214 = term;
              term = i_4212;
              IStrategoTerm term11662 = term;
              Success11587:
              { 
                Fail21560:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21560;
                  if(true)
                    break Success11587;
                }
                term = term11662;
                IStrategoTerm term11663 = term;
                Success11588:
                { 
                  Fail21561:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21561;
                    if(true)
                      break Success11588;
                  }
                  term = term11663;
                  IStrategoTerm term11664 = term;
                  Success11589:
                  { 
                    Fail21562:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21562;
                      if(true)
                        break Success11589;
                    }
                    term = term11664;
                    IStrategoTerm term11665 = term;
                    Success11590:
                    { 
                      Fail21563:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21563;
                        if(true)
                          break Success11590;
                      }
                      term = term11665;
                      IStrategoTerm l_4214 = null;
                      IStrategoTerm m_4214 = null;
                      IStrategoTerm o_4214 = null;
                      l_4214 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21559;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail21559;
                      m_4214 = ((IStrategoList)term).tail();
                      o_4214 = m_4214;
                      term = report_failure_0_2.instance.invoke(context, o_4214, trans.const4344, l_4214);
                      if(term == null)
                        break Fail21559;
                    }
                  }
                }
              }
              r_4214 = term;
              p_4214 = trans.const4230;
              s_4214 = r_4214;
              term = string_replace_0_2.instance.invoke(context, s_4214, p_4214, trans.const4230);
              if(term == null)
                break Fail21559;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2009);
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21559;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3));
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21559;
              term = k_4214;
              { 
                IStrategoTerm t_4214 = null;
                IStrategoTerm u_4216 = null;
                IStrategoTerm v_4216 = null;
                IStrategoTerm x_4216 = null;
                IStrategoTerm y_4216 = null;
                IStrategoTerm z_4216 = null;
                t_4214 = term;
                x_4216 = term;
                u_4216 = trans.const4352;
                y_4216 = x_4216;
                v_4216 = trans.constCons1966;
                z_4216 = y_4216;
                term = dr_set_rule_0_3.instance.invoke(context, z_4216, u_4216, v_4216, trans.const4353);
                if(term == null)
                  break Fail21537;
                term = t_4214;
                if(true)
                  break Success11586;
              }
            }
            term = term11661;
          }
          if(true)
            break Success11564;
        }
        term = term11639;
        IStrategoTerm u_4214 = null;
        IStrategoTerm v_4214 = null;
        IStrategoTerm b_4217 = null;
        u_4214 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21536;
        v_4214 = term;
        b_4217 = u_4214;
        term = report_with_failure_0_2.instance.invoke(context, b_4217, trans.const4354, v_4214);
        if(term == null)
          break Fail21536;
      }
      term = b_4215;
      c_4217 = b_4215;
      IStrategoTerm term11666 = term;
      Success11591:
      { 
        Fail21564:
        { 
          IStrategoTerm w_4214 = null;
          IStrategoTerm x_4214 = null;
          IStrategoTerm f_4217 = null;
          IStrategoTerm g_4217 = null;
          IStrategoTerm i_4217 = null;
          IStrategoTerm j_4217 = null;
          IStrategoTerm k_4217 = null;
          term = topdown_1_0.instance.invoke(context, j_4212, lifted6572.instance);
          if(term == null)
            break Fail21564;
          term = declare_globals_top_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21564;
          term = declare_bodies_top_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21564;
          k_4212 = term;
          w_4214 = term;
          term = k_4212;
          x_4214 = k_4212;
          i_4217 = term;
          f_4217 = trans.const4355;
          j_4217 = i_4217;
          g_4217 = trans.constCons1966;
          k_4217 = j_4217;
          term = termFactory.makeTuple(trans.const4356, x_4214);
          term = dr_set_rule_0_3.instance.invoke(context, k_4217, f_4217, g_4217, term);
          if(term == null)
            break Fail21564;
          term = w_4214;
          if(true)
            break Success11591;
        }
        term = term11666;
        IStrategoTerm z_4214 = null;
        IStrategoTerm a_4215 = null;
        IStrategoTerm m_4217 = null;
        z_4214 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21536;
        a_4215 = term;
        m_4217 = z_4214;
        term = report_with_failure_0_2.instance.invoke(context, m_4217, trans.const4354, a_4215);
        if(term == null)
          break Fail21536;
      }
      term = c_4217;
      if(k_4212 == null)
        break Fail21536;
      term = k_4212;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}