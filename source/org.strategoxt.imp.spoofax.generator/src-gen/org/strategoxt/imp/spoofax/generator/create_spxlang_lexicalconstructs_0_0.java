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

@SuppressWarnings("all") public class create_spxlang_lexicalconstructs_0_0 extends Strategy 
{ 
  public static create_spxlang_lexicalconstructs_0_0 instance = new create_spxlang_lexicalconstructs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spxlang_lexicalconstructs_0_0");
    Fail26321:
    { 
      IStrategoTerm x_4328 = null;
      IStrategoTerm y_4328 = null;
      IStrategoTerm z_4328 = null;
      IStrategoTerm a_4329 = null;
      IStrategoTerm b_4329 = null;
      b_4329 = term;
      term = generator.const7502;
      z_4328 = generator.const7502;
      term = spx_file_relative_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26321;
      y_4328 = term;
      term = generator.const7196;
      a_4329 = generator.const7196;
      IStrategoTerm term10664 = term;
      Success10564:
      { 
        Fail26322:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26322;
          if(true)
            break Success10564;
        }
        term = default_package_name_0_0.instance.invoke(context, term10664);
        if(term == null)
          break Fail26321;
      }
      x_4328 = term;
      term = b_4329;
      IStrategoTerm term10665 = term;
      Success10565:
      { 
        Fail26323:
        { 
          IStrategoTerm c_4329 = null;
          c_4329 = term;
          IStrategoTerm term10666 = term;
          Success10566:
          { 
            Fail26324:
            { 
              term = termFactory.makeTuple(generator.const7198, y_4328, generator.const7009, z_4328, a_4329);
              term = conc_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26324;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26324;
              { 
                if(true)
                  break Fail26323;
                if(true)
                  break Success10566;
              }
            }
            term = term10666;
          }
          term = c_4329;
          { 
            IStrategoTerm v_4331 = null;
            IStrategoTerm a_4332 = null;
            IStrategoTerm h_4329 = null;
            IStrategoTerm j_4329 = null;
            IStrategoTerm k_4329 = null;
            IStrategoTerm w_4331 = null;
            IStrategoTerm b_4332 = null;
            IStrategoTerm r_4329 = null;
            IStrategoTerm t_4329 = null;
            IStrategoTerm u_4329 = null;
            IStrategoTerm x_4331 = null;
            IStrategoTerm c_4332 = null;
            IStrategoTerm b_4330 = null;
            IStrategoTerm d_4330 = null;
            IStrategoTerm e_4330 = null;
            IStrategoTerm y_4331 = null;
            IStrategoTerm d_4332 = null;
            IStrategoTerm l_4330 = null;
            IStrategoTerm n_4330 = null;
            IStrategoTerm o_4330 = null;
            IStrategoTerm v_4330 = null;
            IStrategoTerm x_4330 = null;
            IStrategoTerm y_4330 = null;
            IStrategoTerm f_4332 = null;
            IStrategoTerm h_4332 = null;
            IStrategoTerm i_4332 = null;
            IStrategoTerm l_4332 = null;
            IStrategoTerm d_4331 = null;
            IStrategoTerm f_4331 = null;
            IStrategoTerm g_4331 = null;
            IStrategoTerm l_4331 = null;
            IStrategoTerm n_4331 = null;
            IStrategoTerm o_4331 = null;
            a_4332 = term;
            term = x_4328;
            IStrategoTerm term10667 = term;
            Success10567:
            { 
              Fail26325:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26325;
                if(true)
                  break Success10567;
              }
              term = term10667;
              IStrategoTerm term10668 = term;
              Success10568:
              { 
                Fail26326:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26326;
                  if(true)
                    break Success10568;
                }
                term = term10668;
                IStrategoTerm term10669 = term;
                Success10569:
                { 
                  Fail26327:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26327;
                    if(true)
                      break Success10569;
                  }
                  term = term10669;
                  IStrategoTerm term10670 = term;
                  Success10570:
                  { 
                    Fail26328:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26328;
                      if(true)
                        break Success10570;
                    }
                    term = term10670;
                    IStrategoTerm d_4329 = null;
                    IStrategoTerm e_4329 = null;
                    IStrategoTerm g_4329 = null;
                    d_4329 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26321;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26321;
                    e_4329 = ((IStrategoList)term).tail();
                    g_4329 = e_4329;
                    term = report_failure_0_2.instance.invoke(context, g_4329, generator.const7503, d_4329);
                    if(term == null)
                      break Fail26321;
                  }
                }
              }
            }
            j_4329 = term;
            h_4329 = generator.const7143;
            k_4329 = j_4329;
            term = string_replace_0_2.instance.invoke(context, k_4329, h_4329, generator.const7162);
            if(term == null)
              break Fail26321;
            v_4331 = term;
            term = a_4332;
            b_4332 = a_4332;
            term = create_lang_idenditifiers_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26321;
            IStrategoTerm term10671 = term;
            Success10571:
            { 
              Fail26329:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26329;
                if(true)
                  break Success10571;
              }
              term = term10671;
              IStrategoTerm term10672 = term;
              Success10572:
              { 
                Fail26330:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26330;
                  if(true)
                    break Success10572;
                }
                term = term10672;
                IStrategoTerm term10673 = term;
                Success10573:
                { 
                  Fail26331:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26331;
                    if(true)
                      break Success10573;
                  }
                  term = term10673;
                  IStrategoTerm term10674 = term;
                  Success10574:
                  { 
                    Fail26332:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26332;
                      if(true)
                        break Success10574;
                    }
                    term = term10674;
                    IStrategoTerm n_4329 = null;
                    IStrategoTerm o_4329 = null;
                    IStrategoTerm q_4329 = null;
                    n_4329 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26321;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26321;
                    o_4329 = ((IStrategoList)term).tail();
                    q_4329 = o_4329;
                    term = report_failure_0_2.instance.invoke(context, q_4329, generator.const7503, n_4329);
                    if(term == null)
                      break Fail26321;
                  }
                }
              }
            }
            t_4329 = term;
            r_4329 = generator.const7143;
            u_4329 = t_4329;
            term = string_replace_0_2.instance.invoke(context, u_4329, r_4329, generator.const7143);
            if(term == null)
              break Fail26321;
            w_4331 = term;
            term = b_4332;
            c_4332 = b_4332;
            term = create_lang_literals_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26321;
            IStrategoTerm term10675 = term;
            Success10575:
            { 
              Fail26333:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26333;
                if(true)
                  break Success10575;
              }
              term = term10675;
              IStrategoTerm term10676 = term;
              Success10576:
              { 
                Fail26334:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26334;
                  if(true)
                    break Success10576;
                }
                term = term10676;
                IStrategoTerm term10677 = term;
                Success10577:
                { 
                  Fail26335:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26335;
                    if(true)
                      break Success10577;
                  }
                  term = term10677;
                  IStrategoTerm term10678 = term;
                  Success10578:
                  { 
                    Fail26336:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26336;
                      if(true)
                        break Success10578;
                    }
                    term = term10678;
                    IStrategoTerm x_4329 = null;
                    IStrategoTerm y_4329 = null;
                    IStrategoTerm a_4330 = null;
                    x_4329 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26321;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26321;
                    y_4329 = ((IStrategoList)term).tail();
                    a_4330 = y_4329;
                    term = report_failure_0_2.instance.invoke(context, a_4330, generator.const7503, x_4329);
                    if(term == null)
                      break Fail26321;
                  }
                }
              }
            }
            d_4330 = term;
            b_4330 = generator.const7143;
            e_4330 = d_4330;
            term = string_replace_0_2.instance.invoke(context, e_4330, b_4330, generator.const7143);
            if(term == null)
              break Fail26321;
            x_4331 = term;
            term = c_4332;
            d_4332 = c_4332;
            term = create_lang_keywords_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26321;
            IStrategoTerm term10679 = term;
            Success10579:
            { 
              Fail26337:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26337;
                if(true)
                  break Success10579;
              }
              term = term10679;
              IStrategoTerm term10680 = term;
              Success10580:
              { 
                Fail26338:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26338;
                  if(true)
                    break Success10580;
                }
                term = term10680;
                IStrategoTerm term10681 = term;
                Success10581:
                { 
                  Fail26339:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26339;
                    if(true)
                      break Success10581;
                  }
                  term = term10681;
                  IStrategoTerm term10682 = term;
                  Success10582:
                  { 
                    Fail26340:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26340;
                      if(true)
                        break Success10582;
                    }
                    term = term10682;
                    IStrategoTerm h_4330 = null;
                    IStrategoTerm i_4330 = null;
                    IStrategoTerm k_4330 = null;
                    h_4330 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26321;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26321;
                    i_4330 = ((IStrategoList)term).tail();
                    k_4330 = i_4330;
                    term = report_failure_0_2.instance.invoke(context, k_4330, generator.const7503, h_4330);
                    if(term == null)
                      break Fail26321;
                  }
                }
              }
            }
            n_4330 = term;
            l_4330 = generator.const7143;
            o_4330 = n_4330;
            term = string_replace_0_2.instance.invoke(context, o_4330, l_4330, generator.const7143);
            if(term == null)
              break Fail26321;
            y_4331 = term;
            term = d_4332;
            term = create_lang_layout_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26321;
            IStrategoTerm term10683 = term;
            Success10583:
            { 
              Fail26341:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26341;
                if(true)
                  break Success10583;
              }
              term = term10683;
              IStrategoTerm term10684 = term;
              Success10584:
              { 
                Fail26342:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26342;
                  if(true)
                    break Success10584;
                }
                term = term10684;
                IStrategoTerm term10685 = term;
                Success10585:
                { 
                  Fail26343:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26343;
                    if(true)
                      break Success10585;
                  }
                  term = term10685;
                  IStrategoTerm term10686 = term;
                  Success10586:
                  { 
                    Fail26344:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26344;
                      if(true)
                        break Success10586;
                    }
                    term = term10686;
                    IStrategoTerm r_4330 = null;
                    IStrategoTerm s_4330 = null;
                    IStrategoTerm u_4330 = null;
                    r_4330 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26321;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26321;
                    s_4330 = ((IStrategoList)term).tail();
                    u_4330 = s_4330;
                    term = report_failure_0_2.instance.invoke(context, u_4330, generator.const7503, r_4330);
                    if(term == null)
                      break Fail26321;
                  }
                }
              }
            }
            x_4330 = term;
            v_4330 = generator.const7143;
            y_4330 = x_4330;
            term = string_replace_0_2.instance.invoke(context, y_4330, v_4330, generator.const7143);
            if(term == null)
              break Fail26321;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(v_4331, termFactory.makeListCons(generator.const7504, termFactory.makeListCons(w_4331, termFactory.makeListCons(generator.const7143, termFactory.makeListCons(x_4331, termFactory.makeListCons(generator.const7143, termFactory.makeListCons(y_4331, termFactory.makeListCons(generator.const7143, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))))))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26321;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            h_4332 = term;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7206, termFactory.makeListCons(y_4328, (IStrategoList)generator.constNil7));
            f_4332 = term;
            i_4332 = h_4332;
            term = z_4328;
            IStrategoTerm term10687 = term;
            Success10587:
            { 
              Fail26345:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26345;
                if(true)
                  break Success10587;
              }
              term = term10687;
              IStrategoTerm term10688 = term;
              Success10588:
              { 
                Fail26346:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26346;
                  if(true)
                    break Success10588;
                }
                term = term10688;
                IStrategoTerm term10689 = term;
                Success10589:
                { 
                  Fail26347:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26347;
                    if(true)
                      break Success10589;
                  }
                  term = term10689;
                  IStrategoTerm term10690 = term;
                  Success10590:
                  { 
                    Fail26348:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26348;
                      if(true)
                        break Success10590;
                    }
                    term = term10690;
                    IStrategoTerm z_4330 = null;
                    IStrategoTerm a_4331 = null;
                    IStrategoTerm c_4331 = null;
                    z_4330 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26321;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26321;
                    a_4331 = ((IStrategoList)term).tail();
                    c_4331 = a_4331;
                    term = report_failure_0_2.instance.invoke(context, c_4331, generator.const7503, z_4330);
                    if(term == null)
                      break Fail26321;
                  }
                }
              }
            }
            f_4331 = term;
            d_4331 = generator.const7143;
            g_4331 = f_4331;
            term = string_replace_0_2.instance.invoke(context, g_4331, d_4331, generator.const7143);
            if(term == null)
              break Fail26321;
            l_4332 = term;
            term = a_4329;
            IStrategoTerm term10691 = term;
            Success10591:
            { 
              Fail26349:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26349;
                if(true)
                  break Success10591;
              }
              term = term10691;
              IStrategoTerm term10692 = term;
              Success10592:
              { 
                Fail26350:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26350;
                  if(true)
                    break Success10592;
                }
                term = term10692;
                IStrategoTerm term10693 = term;
                Success10593:
                { 
                  Fail26351:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26351;
                    if(true)
                      break Success10593;
                  }
                  term = term10693;
                  IStrategoTerm term10694 = term;
                  Success10594:
                  { 
                    Fail26352:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26352;
                      if(true)
                        break Success10594;
                    }
                    term = term10694;
                    IStrategoTerm h_4331 = null;
                    IStrategoTerm i_4331 = null;
                    IStrategoTerm k_4331 = null;
                    h_4331 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26321;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26321;
                    i_4331 = ((IStrategoList)term).tail();
                    k_4331 = i_4331;
                    term = report_failure_0_2.instance.invoke(context, k_4331, generator.const7503, h_4331);
                    if(term == null)
                      break Fail26321;
                  }
                }
              }
            }
            n_4331 = term;
            l_4331 = generator.const7143;
            o_4331 = n_4331;
            term = string_replace_0_2.instance.invoke(context, o_4331, l_4331, generator.const7207);
            if(term == null)
              break Fail26321;
            term = (IStrategoTerm)termFactory.makeListCons(l_4332, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26321;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            term = output_text_file_0_2.instance.invoke(context, i_4332, f_4332, term);
            if(term == null)
              break Fail26321;
            if(true)
              break Success10565;
          }
        }
        term = term10665;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}