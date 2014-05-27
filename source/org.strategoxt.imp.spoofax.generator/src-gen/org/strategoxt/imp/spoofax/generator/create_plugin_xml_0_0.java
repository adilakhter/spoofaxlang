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

@SuppressWarnings("all") public class create_plugin_xml_0_0 extends Strategy 
{ 
  public static create_plugin_xml_0_0 instance = new create_plugin_xml_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_plugin_xml_0_0");
    Fail26527:
    { 
      IStrategoTerm j_4357 = null;
      IStrategoTerm k_4357 = null;
      IStrategoTerm l_4357 = null;
      IStrategoTerm m_4357 = null;
      IStrategoTerm n_4357 = null;
      IStrategoTerm term10896 = term;
      Success10752:
      { 
        Fail26528:
        { 
          term = file_exists_0_0.instance.invoke(context, generator.const7638);
          if(term == null)
            break Fail26528;
          if(true)
            break Success10752;
        }
        term = term10896;
        IStrategoTerm s_4361 = null;
        IStrategoTerm s_4357 = null;
        IStrategoTerm u_4357 = null;
        IStrategoTerm v_4357 = null;
        IStrategoTerm t_4361 = null;
        IStrategoTerm a_4358 = null;
        IStrategoTerm c_4358 = null;
        IStrategoTerm d_4358 = null;
        IStrategoTerm u_4361 = null;
        IStrategoTerm i_4358 = null;
        IStrategoTerm k_4358 = null;
        IStrategoTerm l_4358 = null;
        IStrategoTerm v_4361 = null;
        IStrategoTerm q_4358 = null;
        IStrategoTerm s_4358 = null;
        IStrategoTerm t_4358 = null;
        IStrategoTerm w_4361 = null;
        IStrategoTerm y_4358 = null;
        IStrategoTerm a_4359 = null;
        IStrategoTerm b_4359 = null;
        IStrategoTerm x_4361 = null;
        IStrategoTerm g_4359 = null;
        IStrategoTerm i_4359 = null;
        IStrategoTerm j_4359 = null;
        IStrategoTerm y_4361 = null;
        IStrategoTerm o_4359 = null;
        IStrategoTerm q_4359 = null;
        IStrategoTerm r_4359 = null;
        IStrategoTerm z_4361 = null;
        IStrategoTerm w_4359 = null;
        IStrategoTerm y_4359 = null;
        IStrategoTerm z_4359 = null;
        IStrategoTerm a_4362 = null;
        IStrategoTerm e_4360 = null;
        IStrategoTerm g_4360 = null;
        IStrategoTerm h_4360 = null;
        IStrategoTerm b_4362 = null;
        IStrategoTerm m_4360 = null;
        IStrategoTerm o_4360 = null;
        IStrategoTerm p_4360 = null;
        IStrategoTerm c_4362 = null;
        IStrategoTerm u_4360 = null;
        IStrategoTerm w_4360 = null;
        IStrategoTerm x_4360 = null;
        IStrategoTerm c_4361 = null;
        IStrategoTerm e_4361 = null;
        IStrategoTerm f_4361 = null;
        IStrategoTerm q_4362 = null;
        IStrategoTerm s_4362 = null;
        IStrategoTerm t_4362 = null;
        term = get_sdf_main_module_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26527;
        n_4357 = term;
        term = parse_controller_name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26527;
        m_4357 = term;
        term = get_main_class_name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26527;
        term = termFactory.makeTuple(term, generator.const7491);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26527;
        k_4357 = term;
        IStrategoTerm term10897 = term;
        Success10753:
        { 
          Fail26529:
          { 
            term = $Base$Package_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26529;
            if(true)
              break Success10753;
          }
          term = default_package_name_0_0.instance.invoke(context, term10897);
          if(term == null)
            break Fail26527;
        }
        l_4357 = term;
        term = $Editor$Extensions_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26527;
        j_4357 = term;
        term = j_4357;
        IStrategoTerm term10898 = term;
        Success10754:
        { 
          Fail26530:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26530;
            if(true)
              break Success10754;
          }
          term = term10898;
          IStrategoTerm term10899 = term;
          Success10755:
          { 
            Fail26531:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26531;
              if(true)
                break Success10755;
            }
            term = term10899;
            IStrategoTerm term10900 = term;
            Success10756:
            { 
              Fail26532:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26532;
                if(true)
                  break Success10756;
              }
              term = term10900;
              IStrategoTerm term10901 = term;
              Success10757:
              { 
                Fail26533:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26533;
                  if(true)
                    break Success10757;
                }
                term = term10901;
                IStrategoTerm o_4357 = null;
                IStrategoTerm p_4357 = null;
                IStrategoTerm r_4357 = null;
                o_4357 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                p_4357 = ((IStrategoList)term).tail();
                r_4357 = p_4357;
                term = report_failure_0_2.instance.invoke(context, r_4357, generator.const7639, o_4357);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        u_4357 = term;
        s_4357 = generator.const7143;
        v_4357 = u_4357;
        term = string_replace_0_2.instance.invoke(context, v_4357, s_4357, generator.const7640);
        if(term == null)
          break Fail26527;
        s_4361 = term;
        term = n_4357;
        IStrategoTerm term10902 = term;
        Success10758:
        { 
          Fail26534:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26534;
            if(true)
              break Success10758;
          }
          term = term10902;
          IStrategoTerm term10903 = term;
          Success10759:
          { 
            Fail26535:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26535;
              if(true)
                break Success10759;
            }
            term = term10903;
            IStrategoTerm term10904 = term;
            Success10760:
            { 
              Fail26536:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26536;
                if(true)
                  break Success10760;
              }
              term = term10904;
              IStrategoTerm term10905 = term;
              Success10761:
              { 
                Fail26537:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26537;
                  if(true)
                    break Success10761;
                }
                term = term10905;
                IStrategoTerm w_4357 = null;
                IStrategoTerm x_4357 = null;
                IStrategoTerm z_4357 = null;
                w_4357 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                x_4357 = ((IStrategoList)term).tail();
                z_4357 = x_4357;
                term = report_failure_0_2.instance.invoke(context, z_4357, generator.const7639, w_4357);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        c_4358 = term;
        a_4358 = generator.const7143;
        d_4358 = c_4358;
        term = string_replace_0_2.instance.invoke(context, d_4358, a_4358, generator.const7627);
        if(term == null)
          break Fail26527;
        t_4361 = term;
        term = n_4357;
        IStrategoTerm term10906 = term;
        Success10762:
        { 
          Fail26538:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26538;
            if(true)
              break Success10762;
          }
          term = term10906;
          IStrategoTerm term10907 = term;
          Success10763:
          { 
            Fail26539:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26539;
              if(true)
                break Success10763;
            }
            term = term10907;
            IStrategoTerm term10908 = term;
            Success10764:
            { 
              Fail26540:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26540;
                if(true)
                  break Success10764;
              }
              term = term10908;
              IStrategoTerm term10909 = term;
              Success10765:
              { 
                Fail26541:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26541;
                  if(true)
                    break Success10765;
                }
                term = term10909;
                IStrategoTerm e_4358 = null;
                IStrategoTerm f_4358 = null;
                IStrategoTerm h_4358 = null;
                e_4358 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                f_4358 = ((IStrategoList)term).tail();
                h_4358 = f_4358;
                term = report_failure_0_2.instance.invoke(context, h_4358, generator.const7639, e_4358);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        k_4358 = term;
        i_4358 = generator.const7143;
        l_4358 = k_4358;
        term = string_replace_0_2.instance.invoke(context, l_4358, i_4358, generator.const7641);
        if(term == null)
          break Fail26527;
        u_4361 = term;
        term = l_4357;
        IStrategoTerm term10910 = term;
        Success10766:
        { 
          Fail26542:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26542;
            if(true)
              break Success10766;
          }
          term = term10910;
          IStrategoTerm term10911 = term;
          Success10767:
          { 
            Fail26543:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26543;
              if(true)
                break Success10767;
            }
            term = term10911;
            IStrategoTerm term10912 = term;
            Success10768:
            { 
              Fail26544:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26544;
                if(true)
                  break Success10768;
              }
              term = term10912;
              IStrategoTerm term10913 = term;
              Success10769:
              { 
                Fail26545:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26545;
                  if(true)
                    break Success10769;
                }
                term = term10913;
                IStrategoTerm m_4358 = null;
                IStrategoTerm n_4358 = null;
                IStrategoTerm p_4358 = null;
                m_4358 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                n_4358 = ((IStrategoList)term).tail();
                p_4358 = n_4358;
                term = report_failure_0_2.instance.invoke(context, p_4358, generator.const7639, m_4358);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        s_4358 = term;
        q_4358 = generator.const7143;
        t_4358 = s_4358;
        term = string_replace_0_2.instance.invoke(context, t_4358, q_4358, generator.const7610);
        if(term == null)
          break Fail26527;
        v_4361 = term;
        term = k_4357;
        IStrategoTerm term10914 = term;
        Success10770:
        { 
          Fail26546:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26546;
            if(true)
              break Success10770;
          }
          term = term10914;
          IStrategoTerm term10915 = term;
          Success10771:
          { 
            Fail26547:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26547;
              if(true)
                break Success10771;
            }
            term = term10915;
            IStrategoTerm term10916 = term;
            Success10772:
            { 
              Fail26548:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26548;
                if(true)
                  break Success10772;
              }
              term = term10916;
              IStrategoTerm term10917 = term;
              Success10773:
              { 
                Fail26549:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26549;
                  if(true)
                    break Success10773;
                }
                term = term10917;
                IStrategoTerm u_4358 = null;
                IStrategoTerm v_4358 = null;
                IStrategoTerm x_4358 = null;
                u_4358 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                v_4358 = ((IStrategoList)term).tail();
                x_4358 = v_4358;
                term = report_failure_0_2.instance.invoke(context, x_4358, generator.const7639, u_4358);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        a_4359 = term;
        y_4358 = generator.const7143;
        b_4359 = a_4359;
        term = string_replace_0_2.instance.invoke(context, b_4359, y_4358, generator.const7642);
        if(term == null)
          break Fail26527;
        w_4361 = term;
        term = l_4357;
        IStrategoTerm term10918 = term;
        Success10774:
        { 
          Fail26550:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26550;
            if(true)
              break Success10774;
          }
          term = term10918;
          IStrategoTerm term10919 = term;
          Success10775:
          { 
            Fail26551:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26551;
              if(true)
                break Success10775;
            }
            term = term10919;
            IStrategoTerm term10920 = term;
            Success10776:
            { 
              Fail26552:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26552;
                if(true)
                  break Success10776;
              }
              term = term10920;
              IStrategoTerm term10921 = term;
              Success10777:
              { 
                Fail26553:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26553;
                  if(true)
                    break Success10777;
                }
                term = term10921;
                IStrategoTerm c_4359 = null;
                IStrategoTerm d_4359 = null;
                IStrategoTerm f_4359 = null;
                c_4359 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                d_4359 = ((IStrategoList)term).tail();
                f_4359 = d_4359;
                term = report_failure_0_2.instance.invoke(context, f_4359, generator.const7639, c_4359);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        i_4359 = term;
        g_4359 = generator.const7143;
        j_4359 = i_4359;
        term = string_replace_0_2.instance.invoke(context, j_4359, g_4359, generator.const7643);
        if(term == null)
          break Fail26527;
        x_4361 = term;
        term = k_4357;
        IStrategoTerm term10922 = term;
        Success10778:
        { 
          Fail26554:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26554;
            if(true)
              break Success10778;
          }
          term = term10922;
          IStrategoTerm term10923 = term;
          Success10779:
          { 
            Fail26555:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26555;
              if(true)
                break Success10779;
            }
            term = term10923;
            IStrategoTerm term10924 = term;
            Success10780:
            { 
              Fail26556:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26556;
                if(true)
                  break Success10780;
              }
              term = term10924;
              IStrategoTerm term10925 = term;
              Success10781:
              { 
                Fail26557:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26557;
                  if(true)
                    break Success10781;
                }
                term = term10925;
                IStrategoTerm k_4359 = null;
                IStrategoTerm l_4359 = null;
                IStrategoTerm n_4359 = null;
                k_4359 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                l_4359 = ((IStrategoList)term).tail();
                n_4359 = l_4359;
                term = report_failure_0_2.instance.invoke(context, n_4359, generator.const7639, k_4359);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        q_4359 = term;
        o_4359 = generator.const7143;
        r_4359 = q_4359;
        term = string_replace_0_2.instance.invoke(context, r_4359, o_4359, generator.const7644);
        if(term == null)
          break Fail26527;
        y_4361 = term;
        term = l_4357;
        IStrategoTerm term10926 = term;
        Success10782:
        { 
          Fail26558:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26558;
            if(true)
              break Success10782;
          }
          term = term10926;
          IStrategoTerm term10927 = term;
          Success10783:
          { 
            Fail26559:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26559;
              if(true)
                break Success10783;
            }
            term = term10927;
            IStrategoTerm term10928 = term;
            Success10784:
            { 
              Fail26560:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26560;
                if(true)
                  break Success10784;
              }
              term = term10928;
              IStrategoTerm term10929 = term;
              Success10785:
              { 
                Fail26561:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26561;
                  if(true)
                    break Success10785;
                }
                term = term10929;
                IStrategoTerm s_4359 = null;
                IStrategoTerm t_4359 = null;
                IStrategoTerm v_4359 = null;
                s_4359 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                t_4359 = ((IStrategoList)term).tail();
                v_4359 = t_4359;
                term = report_failure_0_2.instance.invoke(context, v_4359, generator.const7639, s_4359);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        y_4359 = term;
        w_4359 = generator.const7143;
        z_4359 = y_4359;
        term = string_replace_0_2.instance.invoke(context, z_4359, w_4359, generator.const7645);
        if(term == null)
          break Fail26527;
        z_4361 = term;
        term = n_4357;
        IStrategoTerm term10930 = term;
        Success10786:
        { 
          Fail26562:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26562;
            if(true)
              break Success10786;
          }
          term = term10930;
          IStrategoTerm term10931 = term;
          Success10787:
          { 
            Fail26563:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26563;
              if(true)
                break Success10787;
            }
            term = term10931;
            IStrategoTerm term10932 = term;
            Success10788:
            { 
              Fail26564:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26564;
                if(true)
                  break Success10788;
              }
              term = term10932;
              IStrategoTerm term10933 = term;
              Success10789:
              { 
                Fail26565:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26565;
                  if(true)
                    break Success10789;
                }
                term = term10933;
                IStrategoTerm a_4360 = null;
                IStrategoTerm b_4360 = null;
                IStrategoTerm d_4360 = null;
                a_4360 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                b_4360 = ((IStrategoList)term).tail();
                d_4360 = b_4360;
                term = report_failure_0_2.instance.invoke(context, d_4360, generator.const7639, a_4360);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        g_4360 = term;
        e_4360 = generator.const7143;
        h_4360 = g_4360;
        term = string_replace_0_2.instance.invoke(context, h_4360, e_4360, generator.const7646);
        if(term == null)
          break Fail26527;
        a_4362 = term;
        term = l_4357;
        IStrategoTerm term10934 = term;
        Success10790:
        { 
          Fail26566:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26566;
            if(true)
              break Success10790;
          }
          term = term10934;
          IStrategoTerm term10935 = term;
          Success10791:
          { 
            Fail26567:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26567;
              if(true)
                break Success10791;
            }
            term = term10935;
            IStrategoTerm term10936 = term;
            Success10792:
            { 
              Fail26568:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26568;
                if(true)
                  break Success10792;
              }
              term = term10936;
              IStrategoTerm term10937 = term;
              Success10793:
              { 
                Fail26569:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26569;
                  if(true)
                    break Success10793;
                }
                term = term10937;
                IStrategoTerm i_4360 = null;
                IStrategoTerm j_4360 = null;
                IStrategoTerm l_4360 = null;
                i_4360 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                j_4360 = ((IStrategoList)term).tail();
                l_4360 = j_4360;
                term = report_failure_0_2.instance.invoke(context, l_4360, generator.const7639, i_4360);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        o_4360 = term;
        m_4360 = generator.const7143;
        p_4360 = o_4360;
        term = string_replace_0_2.instance.invoke(context, p_4360, m_4360, generator.const7647);
        if(term == null)
          break Fail26527;
        b_4362 = term;
        term = m_4357;
        IStrategoTerm term10938 = term;
        Success10794:
        { 
          Fail26570:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26570;
            if(true)
              break Success10794;
          }
          term = term10938;
          IStrategoTerm term10939 = term;
          Success10795:
          { 
            Fail26571:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26571;
              if(true)
                break Success10795;
            }
            term = term10939;
            IStrategoTerm term10940 = term;
            Success10796:
            { 
              Fail26572:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26572;
                if(true)
                  break Success10796;
              }
              term = term10940;
              IStrategoTerm term10941 = term;
              Success10797:
              { 
                Fail26573:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26573;
                  if(true)
                    break Success10797;
                }
                term = term10941;
                IStrategoTerm q_4360 = null;
                IStrategoTerm r_4360 = null;
                IStrategoTerm t_4360 = null;
                q_4360 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                r_4360 = ((IStrategoList)term).tail();
                t_4360 = r_4360;
                term = report_failure_0_2.instance.invoke(context, t_4360, generator.const7639, q_4360);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        w_4360 = term;
        u_4360 = generator.const7143;
        x_4360 = w_4360;
        term = string_replace_0_2.instance.invoke(context, x_4360, u_4360, generator.const7648);
        if(term == null)
          break Fail26527;
        c_4362 = term;
        term = n_4357;
        IStrategoTerm term10942 = term;
        Success10798:
        { 
          Fail26574:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26574;
            if(true)
              break Success10798;
          }
          term = term10942;
          IStrategoTerm term10943 = term;
          Success10799:
          { 
            Fail26575:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26575;
              if(true)
                break Success10799;
            }
            term = term10943;
            IStrategoTerm term10944 = term;
            Success10800:
            { 
              Fail26576:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26576;
                if(true)
                  break Success10800;
              }
              term = term10944;
              IStrategoTerm term10945 = term;
              Success10801:
              { 
                Fail26577:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26577;
                  if(true)
                    break Success10801;
                }
                term = term10945;
                IStrategoTerm y_4360 = null;
                IStrategoTerm z_4360 = null;
                IStrategoTerm b_4361 = null;
                y_4360 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail26527;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail26527;
                z_4360 = ((IStrategoList)term).tail();
                b_4361 = z_4360;
                term = report_failure_0_2.instance.invoke(context, b_4361, generator.const7639, y_4360);
                if(term == null)
                  break Fail26527;
              }
            }
          }
        }
        e_4361 = term;
        c_4361 = generator.const7143;
        f_4361 = e_4361;
        term = string_replace_0_2.instance.invoke(context, f_4361, c_4361, generator.const7641);
        if(term == null)
          break Fail26527;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7657, termFactory.makeListCons(s_4361, termFactory.makeListCons(generator.const7656, termFactory.makeListCons(t_4361, termFactory.makeListCons(generator.const7650, termFactory.makeListCons(u_4361, termFactory.makeListCons(generator.const7655, termFactory.makeListCons(v_4361, termFactory.makeListCons(generator.const7052, termFactory.makeListCons(w_4361, termFactory.makeListCons(generator.const7654, termFactory.makeListCons(x_4361, termFactory.makeListCons(generator.const7052, termFactory.makeListCons(y_4361, termFactory.makeListCons(generator.const7653, termFactory.makeListCons(z_4361, termFactory.makeListCons(generator.const7652, termFactory.makeListCons(a_4362, termFactory.makeListCons(generator.const7651, termFactory.makeListCons(b_4362, termFactory.makeListCons(generator.const7052, termFactory.makeListCons(c_4362, termFactory.makeListCons(generator.const7650, termFactory.makeListCons(term, (IStrategoList)generator.constCons4965))))))))))))))))))))))));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26527;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        s_4362 = term;
        q_4362 = generator.constNil7;
        t_4362 = s_4362;
        term = output_text_file_0_2.instance.invoke(context, t_4362, q_4362, generator.const7638);
        if(term == null)
          break Fail26527;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}