package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class create_spxlang_adapters_0_0 extends Strategy 
{ 
  public static create_spxlang_adapters_0_0 instance = new create_spxlang_adapters_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spxlang_adapters_0_0");
    Fail26466:
    { 
      IStrategoTerm l_4349 = null;
      IStrategoTerm m_4349 = null;
      IStrategoTerm n_4349 = null;
      IStrategoTerm o_4349 = null;
      IStrategoTerm p_4349 = null;
      p_4349 = term;
      term = generator.const7611;
      n_4349 = generator.const7611;
      term = spx_file_relative_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26466;
      m_4349 = term;
      term = generator.const7196;
      o_4349 = generator.const7196;
      IStrategoTerm term10842 = term;
      Success10698:
      { 
        Fail26467:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26467;
          if(true)
            break Success10698;
        }
        term = default_package_name_0_0.instance.invoke(context, term10842);
        if(term == null)
          break Fail26466;
      }
      l_4349 = term;
      term = p_4349;
      IStrategoTerm term10843 = term;
      Success10699:
      { 
        Fail26468:
        { 
          IStrategoTerm q_4349 = null;
          q_4349 = term;
          IStrategoTerm term10844 = term;
          Success10700:
          { 
            Fail26469:
            { 
              term = termFactory.makeTuple(generator.const7198, m_4349, generator.const7009, n_4349, o_4349);
              term = conc_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26469;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26469;
              { 
                if(true)
                  break Fail26468;
                if(true)
                  break Success10700;
              }
            }
            term = term10844;
          }
          term = q_4349;
          { 
            IStrategoTerm j_4352 = null;
            IStrategoTerm o_4352 = null;
            IStrategoTerm v_4349 = null;
            IStrategoTerm x_4349 = null;
            IStrategoTerm y_4349 = null;
            IStrategoTerm k_4352 = null;
            IStrategoTerm p_4352 = null;
            IStrategoTerm f_4350 = null;
            IStrategoTerm h_4350 = null;
            IStrategoTerm i_4350 = null;
            IStrategoTerm l_4352 = null;
            IStrategoTerm q_4352 = null;
            IStrategoTerm p_4350 = null;
            IStrategoTerm r_4350 = null;
            IStrategoTerm s_4350 = null;
            IStrategoTerm m_4352 = null;
            IStrategoTerm r_4352 = null;
            IStrategoTerm z_4350 = null;
            IStrategoTerm b_4351 = null;
            IStrategoTerm c_4351 = null;
            IStrategoTerm j_4351 = null;
            IStrategoTerm l_4351 = null;
            IStrategoTerm m_4351 = null;
            IStrategoTerm t_4352 = null;
            IStrategoTerm v_4352 = null;
            IStrategoTerm w_4352 = null;
            IStrategoTerm z_4352 = null;
            IStrategoTerm r_4351 = null;
            IStrategoTerm t_4351 = null;
            IStrategoTerm u_4351 = null;
            IStrategoTerm z_4351 = null;
            IStrategoTerm b_4352 = null;
            IStrategoTerm c_4352 = null;
            o_4352 = term;
            term = l_4349;
            IStrategoTerm term10845 = term;
            Success10701:
            { 
              Fail26470:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26470;
                if(true)
                  break Success10701;
              }
              term = term10845;
              IStrategoTerm term10846 = term;
              Success10702:
              { 
                Fail26471:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26471;
                  if(true)
                    break Success10702;
                }
                term = term10846;
                IStrategoTerm term10847 = term;
                Success10703:
                { 
                  Fail26472:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26472;
                    if(true)
                      break Success10703;
                  }
                  term = term10847;
                  IStrategoTerm term10848 = term;
                  Success10704:
                  { 
                    Fail26473:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26473;
                      if(true)
                        break Success10704;
                    }
                    term = term10848;
                    IStrategoTerm r_4349 = null;
                    IStrategoTerm s_4349 = null;
                    IStrategoTerm u_4349 = null;
                    r_4349 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26466;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26466;
                    s_4349 = ((IStrategoList)term).tail();
                    u_4349 = s_4349;
                    term = report_failure_0_2.instance.invoke(context, u_4349, generator.const7612, r_4349);
                    if(term == null)
                      break Fail26466;
                  }
                }
              }
            }
            x_4349 = term;
            v_4349 = generator.const7143;
            y_4349 = x_4349;
            term = string_replace_0_2.instance.invoke(context, y_4349, v_4349, generator.const7162);
            if(term == null)
              break Fail26466;
            j_4352 = term;
            term = o_4352;
            p_4352 = o_4352;
            term = create_main_adapters_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26466;
            IStrategoTerm term10849 = term;
            Success10705:
            { 
              Fail26474:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26474;
                if(true)
                  break Success10705;
              }
              term = term10849;
              IStrategoTerm term10850 = term;
              Success10706:
              { 
                Fail26475:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26475;
                  if(true)
                    break Success10706;
                }
                term = term10850;
                IStrategoTerm term10851 = term;
                Success10707:
                { 
                  Fail26476:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26476;
                    if(true)
                      break Success10707;
                  }
                  term = term10851;
                  IStrategoTerm term10852 = term;
                  Success10708:
                  { 
                    Fail26477:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26477;
                      if(true)
                        break Success10708;
                    }
                    term = term10852;
                    IStrategoTerm b_4350 = null;
                    IStrategoTerm c_4350 = null;
                    IStrategoTerm e_4350 = null;
                    b_4350 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26466;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26466;
                    c_4350 = ((IStrategoList)term).tail();
                    e_4350 = c_4350;
                    term = report_failure_0_2.instance.invoke(context, e_4350, generator.const7612, b_4350);
                    if(term == null)
                      break Fail26466;
                  }
                }
              }
            }
            h_4350 = term;
            f_4350 = generator.const7143;
            i_4350 = h_4350;
            term = string_replace_0_2.instance.invoke(context, i_4350, f_4350, generator.const7143);
            if(term == null)
              break Fail26466;
            k_4352 = term;
            term = p_4352;
            q_4352 = p_4352;
            term = create_builders_definition_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26466;
            IStrategoTerm term10853 = term;
            Success10709:
            { 
              Fail26478:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26478;
                if(true)
                  break Success10709;
              }
              term = term10853;
              IStrategoTerm term10854 = term;
              Success10710:
              { 
                Fail26479:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26479;
                  if(true)
                    break Success10710;
                }
                term = term10854;
                IStrategoTerm term10855 = term;
                Success10711:
                { 
                  Fail26480:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26480;
                    if(true)
                      break Success10711;
                  }
                  term = term10855;
                  IStrategoTerm term10856 = term;
                  Success10712:
                  { 
                    Fail26481:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26481;
                      if(true)
                        break Success10712;
                    }
                    term = term10856;
                    IStrategoTerm l_4350 = null;
                    IStrategoTerm m_4350 = null;
                    IStrategoTerm o_4350 = null;
                    l_4350 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26466;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26466;
                    m_4350 = ((IStrategoList)term).tail();
                    o_4350 = m_4350;
                    term = report_failure_0_2.instance.invoke(context, o_4350, generator.const7612, l_4350);
                    if(term == null)
                      break Fail26466;
                  }
                }
              }
            }
            r_4350 = term;
            p_4350 = generator.const7143;
            s_4350 = r_4350;
            term = string_replace_0_2.instance.invoke(context, s_4350, p_4350, generator.const7143);
            if(term == null)
              break Fail26466;
            l_4352 = term;
            term = q_4352;
            r_4352 = q_4352;
            term = create_reference_resolver_definition_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26466;
            IStrategoTerm term10857 = term;
            Success10713:
            { 
              Fail26482:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26482;
                if(true)
                  break Success10713;
              }
              term = term10857;
              IStrategoTerm term10858 = term;
              Success10714:
              { 
                Fail26483:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26483;
                  if(true)
                    break Success10714;
                }
                term = term10858;
                IStrategoTerm term10859 = term;
                Success10715:
                { 
                  Fail26484:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26484;
                    if(true)
                      break Success10715;
                  }
                  term = term10859;
                  IStrategoTerm term10860 = term;
                  Success10716:
                  { 
                    Fail26485:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26485;
                      if(true)
                        break Success10716;
                    }
                    term = term10860;
                    IStrategoTerm v_4350 = null;
                    IStrategoTerm w_4350 = null;
                    IStrategoTerm y_4350 = null;
                    v_4350 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26466;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26466;
                    w_4350 = ((IStrategoList)term).tail();
                    y_4350 = w_4350;
                    term = report_failure_0_2.instance.invoke(context, y_4350, generator.const7612, v_4350);
                    if(term == null)
                      break Fail26466;
                  }
                }
              }
            }
            b_4351 = term;
            z_4350 = generator.const7143;
            c_4351 = b_4351;
            term = string_replace_0_2.instance.invoke(context, c_4351, z_4350, generator.const7143);
            if(term == null)
              break Fail26466;
            m_4352 = term;
            term = r_4352;
            term = create_semantic_completion_definition_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26466;
            IStrategoTerm term10861 = term;
            Success10717:
            { 
              Fail26486:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26486;
                if(true)
                  break Success10717;
              }
              term = term10861;
              IStrategoTerm term10862 = term;
              Success10718:
              { 
                Fail26487:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26487;
                  if(true)
                    break Success10718;
                }
                term = term10862;
                IStrategoTerm term10863 = term;
                Success10719:
                { 
                  Fail26488:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26488;
                    if(true)
                      break Success10719;
                  }
                  term = term10863;
                  IStrategoTerm term10864 = term;
                  Success10720:
                  { 
                    Fail26489:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26489;
                      if(true)
                        break Success10720;
                    }
                    term = term10864;
                    IStrategoTerm f_4351 = null;
                    IStrategoTerm g_4351 = null;
                    IStrategoTerm i_4351 = null;
                    f_4351 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26466;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26466;
                    g_4351 = ((IStrategoList)term).tail();
                    i_4351 = g_4351;
                    term = report_failure_0_2.instance.invoke(context, i_4351, generator.const7612, f_4351);
                    if(term == null)
                      break Fail26466;
                  }
                }
              }
            }
            l_4351 = term;
            j_4351 = generator.const7143;
            m_4351 = l_4351;
            term = string_replace_0_2.instance.invoke(context, m_4351, j_4351, generator.const7143);
            if(term == null)
              break Fail26466;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(j_4352, termFactory.makeListCons(generator.const7504, termFactory.makeListCons(k_4352, termFactory.makeListCons(generator.const7143, termFactory.makeListCons(l_4352, termFactory.makeListCons(generator.const7613, termFactory.makeListCons(m_4352, termFactory.makeListCons(generator.const7143, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))))))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26466;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            v_4352 = term;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7206, termFactory.makeListCons(m_4349, (IStrategoList)generator.constNil7));
            t_4352 = term;
            w_4352 = v_4352;
            term = n_4349;
            IStrategoTerm term10865 = term;
            Success10721:
            { 
              Fail26490:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26490;
                if(true)
                  break Success10721;
              }
              term = term10865;
              IStrategoTerm term10866 = term;
              Success10722:
              { 
                Fail26491:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26491;
                  if(true)
                    break Success10722;
                }
                term = term10866;
                IStrategoTerm term10867 = term;
                Success10723:
                { 
                  Fail26492:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26492;
                    if(true)
                      break Success10723;
                  }
                  term = term10867;
                  IStrategoTerm term10868 = term;
                  Success10724:
                  { 
                    Fail26493:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26493;
                      if(true)
                        break Success10724;
                    }
                    term = term10868;
                    IStrategoTerm n_4351 = null;
                    IStrategoTerm o_4351 = null;
                    IStrategoTerm q_4351 = null;
                    n_4351 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26466;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26466;
                    o_4351 = ((IStrategoList)term).tail();
                    q_4351 = o_4351;
                    term = report_failure_0_2.instance.invoke(context, q_4351, generator.const7612, n_4351);
                    if(term == null)
                      break Fail26466;
                  }
                }
              }
            }
            t_4351 = term;
            r_4351 = generator.const7143;
            u_4351 = t_4351;
            term = string_replace_0_2.instance.invoke(context, u_4351, r_4351, generator.const7143);
            if(term == null)
              break Fail26466;
            z_4352 = term;
            term = o_4349;
            IStrategoTerm term10869 = term;
            Success10725:
            { 
              Fail26494:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26494;
                if(true)
                  break Success10725;
              }
              term = term10869;
              IStrategoTerm term10870 = term;
              Success10726:
              { 
                Fail26495:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26495;
                  if(true)
                    break Success10726;
                }
                term = term10870;
                IStrategoTerm term10871 = term;
                Success10727:
                { 
                  Fail26496:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26496;
                    if(true)
                      break Success10727;
                  }
                  term = term10871;
                  IStrategoTerm term10872 = term;
                  Success10728:
                  { 
                    Fail26497:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26497;
                      if(true)
                        break Success10728;
                    }
                    term = term10872;
                    IStrategoTerm v_4351 = null;
                    IStrategoTerm w_4351 = null;
                    IStrategoTerm y_4351 = null;
                    v_4351 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26466;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26466;
                    w_4351 = ((IStrategoList)term).tail();
                    y_4351 = w_4351;
                    term = report_failure_0_2.instance.invoke(context, y_4351, generator.const7612, v_4351);
                    if(term == null)
                      break Fail26466;
                  }
                }
              }
            }
            b_4352 = term;
            z_4351 = generator.const7143;
            c_4352 = b_4352;
            term = string_replace_0_2.instance.invoke(context, c_4352, z_4351, generator.const7207);
            if(term == null)
              break Fail26466;
            term = (IStrategoTerm)termFactory.makeListCons(z_4352, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26466;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            term = output_text_file_0_2.instance.invoke(context, w_4352, t_4352, term);
            if(term == null)
              break Fail26466;
            if(true)
              break Success10699;
          }
        }
        term = term10843;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}