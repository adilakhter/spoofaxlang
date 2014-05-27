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

@SuppressWarnings("all") public class create_spxlang_definitions_0_0 extends Strategy 
{ 
  public static create_spxlang_definitions_0_0 instance = new create_spxlang_definitions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spxlang_definitions_0_0");
    Fail26357:
    { 
      IStrategoTerm x_4332 = null;
      IStrategoTerm y_4332 = null;
      IStrategoTerm z_4332 = null;
      IStrategoTerm a_4333 = null;
      IStrategoTerm b_4333 = null;
      b_4333 = term;
      term = generator.const7511;
      z_4332 = generator.const7511;
      term = spx_file_relative_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26357;
      y_4332 = term;
      term = generator.const7196;
      a_4333 = generator.const7196;
      IStrategoTerm term10695 = term;
      Success10595:
      { 
        Fail26358:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26358;
          if(true)
            break Success10595;
        }
        term = default_package_name_0_0.instance.invoke(context, term10695);
        if(term == null)
          break Fail26357;
      }
      x_4332 = term;
      term = b_4333;
      IStrategoTerm term10696 = term;
      Success10596:
      { 
        Fail26359:
        { 
          IStrategoTerm c_4333 = null;
          c_4333 = term;
          IStrategoTerm term10697 = term;
          Success10597:
          { 
            Fail26360:
            { 
              term = termFactory.makeTuple(generator.const7198, y_4332, generator.const7009, z_4332, a_4333);
              term = conc_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26360;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26360;
              { 
                if(true)
                  break Fail26359;
                if(true)
                  break Success10597;
              }
            }
            term = term10697;
          }
          term = c_4333;
          { 
            IStrategoTerm l_4335 = null;
            IStrategoTerm p_4335 = null;
            IStrategoTerm h_4333 = null;
            IStrategoTerm j_4333 = null;
            IStrategoTerm k_4333 = null;
            IStrategoTerm m_4335 = null;
            IStrategoTerm q_4335 = null;
            IStrategoTerm r_4333 = null;
            IStrategoTerm t_4333 = null;
            IStrategoTerm u_4333 = null;
            IStrategoTerm n_4335 = null;
            IStrategoTerm r_4335 = null;
            IStrategoTerm b_4334 = null;
            IStrategoTerm d_4334 = null;
            IStrategoTerm e_4334 = null;
            IStrategoTerm l_4334 = null;
            IStrategoTerm n_4334 = null;
            IStrategoTerm o_4334 = null;
            IStrategoTerm t_4335 = null;
            IStrategoTerm v_4335 = null;
            IStrategoTerm w_4335 = null;
            IStrategoTerm z_4335 = null;
            IStrategoTerm t_4334 = null;
            IStrategoTerm v_4334 = null;
            IStrategoTerm w_4334 = null;
            IStrategoTerm b_4335 = null;
            IStrategoTerm d_4335 = null;
            IStrategoTerm e_4335 = null;
            p_4335 = term;
            term = x_4332;
            IStrategoTerm term10698 = term;
            Success10598:
            { 
              Fail26361:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26361;
                if(true)
                  break Success10598;
              }
              term = term10698;
              IStrategoTerm term10699 = term;
              Success10599:
              { 
                Fail26362:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26362;
                  if(true)
                    break Success10599;
                }
                term = term10699;
                IStrategoTerm term10700 = term;
                Success10600:
                { 
                  Fail26363:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26363;
                    if(true)
                      break Success10600;
                  }
                  term = term10700;
                  IStrategoTerm term10701 = term;
                  Success10601:
                  { 
                    Fail26364:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26364;
                      if(true)
                        break Success10601;
                    }
                    term = term10701;
                    IStrategoTerm d_4333 = null;
                    IStrategoTerm e_4333 = null;
                    IStrategoTerm g_4333 = null;
                    d_4333 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26357;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26357;
                    e_4333 = ((IStrategoList)term).tail();
                    g_4333 = e_4333;
                    term = report_failure_0_2.instance.invoke(context, g_4333, generator.const7512, d_4333);
                    if(term == null)
                      break Fail26357;
                  }
                }
              }
            }
            j_4333 = term;
            h_4333 = generator.const7143;
            k_4333 = j_4333;
            term = string_replace_0_2.instance.invoke(context, k_4333, h_4333, generator.const7162);
            if(term == null)
              break Fail26357;
            l_4335 = term;
            term = p_4335;
            q_4335 = p_4335;
            term = create_main_language_constructs_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26357;
            IStrategoTerm term10702 = term;
            Success10602:
            { 
              Fail26365:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26365;
                if(true)
                  break Success10602;
              }
              term = term10702;
              IStrategoTerm term10703 = term;
              Success10603:
              { 
                Fail26366:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26366;
                  if(true)
                    break Success10603;
                }
                term = term10703;
                IStrategoTerm term10704 = term;
                Success10604:
                { 
                  Fail26367:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26367;
                    if(true)
                      break Success10604;
                  }
                  term = term10704;
                  IStrategoTerm term10705 = term;
                  Success10605:
                  { 
                    Fail26368:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26368;
                      if(true)
                        break Success10605;
                    }
                    term = term10705;
                    IStrategoTerm n_4333 = null;
                    IStrategoTerm o_4333 = null;
                    IStrategoTerm q_4333 = null;
                    n_4333 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26357;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26357;
                    o_4333 = ((IStrategoList)term).tail();
                    q_4333 = o_4333;
                    term = report_failure_0_2.instance.invoke(context, q_4333, generator.const7512, n_4333);
                    if(term == null)
                      break Fail26357;
                  }
                }
              }
            }
            t_4333 = term;
            r_4333 = generator.const7143;
            u_4333 = t_4333;
            term = string_replace_0_2.instance.invoke(context, u_4333, r_4333, generator.const7143);
            if(term == null)
              break Fail26357;
            m_4335 = term;
            term = q_4335;
            r_4335 = q_4335;
            term = create_lang_type_system_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26357;
            IStrategoTerm term10706 = term;
            Success10606:
            { 
              Fail26369:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26369;
                if(true)
                  break Success10606;
              }
              term = term10706;
              IStrategoTerm term10707 = term;
              Success10607:
              { 
                Fail26370:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26370;
                  if(true)
                    break Success10607;
                }
                term = term10707;
                IStrategoTerm term10708 = term;
                Success10608:
                { 
                  Fail26371:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26371;
                    if(true)
                      break Success10608;
                  }
                  term = term10708;
                  IStrategoTerm term10709 = term;
                  Success10609:
                  { 
                    Fail26372:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26372;
                      if(true)
                        break Success10609;
                    }
                    term = term10709;
                    IStrategoTerm x_4333 = null;
                    IStrategoTerm y_4333 = null;
                    IStrategoTerm a_4334 = null;
                    x_4333 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26357;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26357;
                    y_4333 = ((IStrategoList)term).tail();
                    a_4334 = y_4333;
                    term = report_failure_0_2.instance.invoke(context, a_4334, generator.const7512, x_4333);
                    if(term == null)
                      break Fail26357;
                  }
                }
              }
            }
            d_4334 = term;
            b_4334 = generator.const7143;
            e_4334 = d_4334;
            term = string_replace_0_2.instance.invoke(context, e_4334, b_4334, generator.const7143);
            if(term == null)
              break Fail26357;
            n_4335 = term;
            term = r_4335;
            term = create_symantic_analyzer_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26357;
            IStrategoTerm term10710 = term;
            Success10610:
            { 
              Fail26373:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26373;
                if(true)
                  break Success10610;
              }
              term = term10710;
              IStrategoTerm term10711 = term;
              Success10611:
              { 
                Fail26374:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26374;
                  if(true)
                    break Success10611;
                }
                term = term10711;
                IStrategoTerm term10712 = term;
                Success10612:
                { 
                  Fail26375:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26375;
                    if(true)
                      break Success10612;
                  }
                  term = term10712;
                  IStrategoTerm term10713 = term;
                  Success10613:
                  { 
                    Fail26376:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26376;
                      if(true)
                        break Success10613;
                    }
                    term = term10713;
                    IStrategoTerm h_4334 = null;
                    IStrategoTerm i_4334 = null;
                    IStrategoTerm k_4334 = null;
                    h_4334 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26357;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26357;
                    i_4334 = ((IStrategoList)term).tail();
                    k_4334 = i_4334;
                    term = report_failure_0_2.instance.invoke(context, k_4334, generator.const7512, h_4334);
                    if(term == null)
                      break Fail26357;
                  }
                }
              }
            }
            n_4334 = term;
            l_4334 = generator.const7143;
            o_4334 = n_4334;
            term = string_replace_0_2.instance.invoke(context, o_4334, l_4334, generator.const7143);
            if(term == null)
              break Fail26357;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(l_4335, termFactory.makeListCons(generator.const7504, termFactory.makeListCons(m_4335, termFactory.makeListCons(generator.const7143, termFactory.makeListCons(n_4335, termFactory.makeListCons(generator.const7143, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26357;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            v_4335 = term;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7206, termFactory.makeListCons(y_4332, (IStrategoList)generator.constNil7));
            t_4335 = term;
            w_4335 = v_4335;
            term = z_4332;
            IStrategoTerm term10714 = term;
            Success10614:
            { 
              Fail26377:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26377;
                if(true)
                  break Success10614;
              }
              term = term10714;
              IStrategoTerm term10715 = term;
              Success10615:
              { 
                Fail26378:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26378;
                  if(true)
                    break Success10615;
                }
                term = term10715;
                IStrategoTerm term10716 = term;
                Success10616:
                { 
                  Fail26379:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26379;
                    if(true)
                      break Success10616;
                  }
                  term = term10716;
                  IStrategoTerm term10717 = term;
                  Success10617:
                  { 
                    Fail26380:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26380;
                      if(true)
                        break Success10617;
                    }
                    term = term10717;
                    IStrategoTerm p_4334 = null;
                    IStrategoTerm q_4334 = null;
                    IStrategoTerm s_4334 = null;
                    p_4334 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26357;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26357;
                    q_4334 = ((IStrategoList)term).tail();
                    s_4334 = q_4334;
                    term = report_failure_0_2.instance.invoke(context, s_4334, generator.const7512, p_4334);
                    if(term == null)
                      break Fail26357;
                  }
                }
              }
            }
            v_4334 = term;
            t_4334 = generator.const7143;
            w_4334 = v_4334;
            term = string_replace_0_2.instance.invoke(context, w_4334, t_4334, generator.const7143);
            if(term == null)
              break Fail26357;
            z_4335 = term;
            term = a_4333;
            IStrategoTerm term10718 = term;
            Success10618:
            { 
              Fail26381:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26381;
                if(true)
                  break Success10618;
              }
              term = term10718;
              IStrategoTerm term10719 = term;
              Success10619:
              { 
                Fail26382:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26382;
                  if(true)
                    break Success10619;
                }
                term = term10719;
                IStrategoTerm term10720 = term;
                Success10620:
                { 
                  Fail26383:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26383;
                    if(true)
                      break Success10620;
                  }
                  term = term10720;
                  IStrategoTerm term10721 = term;
                  Success10621:
                  { 
                    Fail26384:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26384;
                      if(true)
                        break Success10621;
                    }
                    term = term10721;
                    IStrategoTerm x_4334 = null;
                    IStrategoTerm y_4334 = null;
                    IStrategoTerm a_4335 = null;
                    x_4334 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26357;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26357;
                    y_4334 = ((IStrategoList)term).tail();
                    a_4335 = y_4334;
                    term = report_failure_0_2.instance.invoke(context, a_4335, generator.const7512, x_4334);
                    if(term == null)
                      break Fail26357;
                  }
                }
              }
            }
            d_4335 = term;
            b_4335 = generator.const7143;
            e_4335 = d_4335;
            term = string_replace_0_2.instance.invoke(context, e_4335, b_4335, generator.const7207);
            if(term == null)
              break Fail26357;
            term = (IStrategoTerm)termFactory.makeListCons(z_4335, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26357;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            term = output_text_file_0_2.instance.invoke(context, w_4335, t_4335, term);
            if(term == null)
              break Fail26357;
            if(true)
              break Success10596;
          }
        }
        term = term10696;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}