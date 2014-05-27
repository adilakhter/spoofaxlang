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

@SuppressWarnings("all") public class output_spx_editor_services_0_0 extends Strategy 
{ 
  public static output_spx_editor_services_0_0 instance = new output_spx_editor_services_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("output_spx_editor_services_0_0");
    Fail26047:
    { 
      IStrategoTerm w_4294 = null;
      TermReference x_4294 = new TermReference();
      TermReference y_4294 = new TermReference();
      TermReference z_4294 = new TermReference();
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26047;
      term = generator.const7213;
      if(y_4294.value == null)
        y_4294.value = term;
      else
        if(y_4294.value != term && !y_4294.value.match(term))
          break Fail26047;
      term = spx_file_relative_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26047;
      if(x_4294.value == null)
        x_4294.value = term;
      else
        if(x_4294.value != term && !x_4294.value.match(term))
          break Fail26047;
      term = generator.const7196;
      if(z_4294.value == null)
        z_4294.value = term;
      else
        if(z_4294.value != term && !z_4294.value.match(term))
          break Fail26047;
      IStrategoTerm term10450 = term;
      Success10373:
      { 
        Fail26048:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26048;
          if(true)
            break Success10373;
        }
        term = default_package_name_0_0.instance.invoke(context, term10450);
        if(term == null)
          break Fail26047;
      }
      w_4294 = term;
      IStrategoTerm term10451 = term;
      Success10374:
      { 
        Fail26049:
        { 
          IStrategoTerm a_4295 = null;
          a_4295 = term;
          IStrategoTerm term10452 = term;
          Success10375:
          { 
            Fail26050:
            { 
              if(x_4294.value == null || (y_4294.value == null || z_4294.value == null))
                break Fail26050;
              term = (IStrategoTerm)termFactory.makeListCons(generator.const7198, termFactory.makeListCons(x_4294.value, termFactory.makeListCons(generator.const7009, termFactory.makeListCons(y_4294.value, termFactory.makeListCons(z_4294.value, (IStrategoList)generator.constNil7)))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26050;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26050;
              { 
                if(true)
                  break Fail26049;
                if(true)
                  break Success10375;
              }
            }
            term = term10452;
          }
          term = a_4295;
          { 
            IStrategoTerm f_4298 = null;
            IStrategoTerm l_4298 = null;
            IStrategoTerm f_4295 = null;
            IStrategoTerm h_4295 = null;
            IStrategoTerm i_4295 = null;
            IStrategoTerm g_4298 = null;
            IStrategoTerm m_4298 = null;
            IStrategoTerm p_4295 = null;
            IStrategoTerm r_4295 = null;
            IStrategoTerm s_4295 = null;
            IStrategoTerm h_4298 = null;
            IStrategoTerm n_4298 = null;
            IStrategoTerm z_4295 = null;
            IStrategoTerm b_4296 = null;
            IStrategoTerm c_4296 = null;
            IStrategoTerm i_4298 = null;
            IStrategoTerm o_4298 = null;
            IStrategoTerm j_4296 = null;
            IStrategoTerm l_4296 = null;
            IStrategoTerm m_4296 = null;
            IStrategoTerm j_4298 = null;
            IStrategoTerm p_4298 = null;
            IStrategoTerm t_4296 = null;
            IStrategoTerm v_4296 = null;
            IStrategoTerm w_4296 = null;
            IStrategoTerm d_4297 = null;
            IStrategoTerm f_4297 = null;
            IStrategoTerm g_4297 = null;
            IStrategoTerm r_4298 = null;
            IStrategoTerm t_4298 = null;
            IStrategoTerm u_4298 = null;
            IStrategoTerm x_4298 = null;
            IStrategoTerm z_4298 = null;
            IStrategoTerm l_4297 = null;
            IStrategoTerm n_4297 = null;
            IStrategoTerm o_4297 = null;
            IStrategoTerm t_4297 = null;
            IStrategoTerm v_4297 = null;
            IStrategoTerm w_4297 = null;
            l_4298 = term;
            term = w_4294;
            IStrategoTerm term10453 = term;
            Success10376:
            { 
              Fail26051:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26051;
                if(true)
                  break Success10376;
              }
              term = term10453;
              IStrategoTerm term10454 = term;
              Success10377:
              { 
                Fail26052:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26052;
                  if(true)
                    break Success10377;
                }
                term = term10454;
                IStrategoTerm term10455 = term;
                Success10378:
                { 
                  Fail26053:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26053;
                    if(true)
                      break Success10378;
                  }
                  term = term10455;
                  IStrategoTerm term10456 = term;
                  Success10379:
                  { 
                    Fail26054:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26054;
                      if(true)
                        break Success10379;
                    }
                    term = term10456;
                    IStrategoTerm b_4295 = null;
                    IStrategoTerm c_4295 = null;
                    IStrategoTerm e_4295 = null;
                    b_4295 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26047;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26047;
                    c_4295 = ((IStrategoList)term).tail();
                    e_4295 = c_4295;
                    term = report_failure_0_2.instance.invoke(context, e_4295, generator.const7214, b_4295);
                    if(term == null)
                      break Fail26047;
                  }
                }
              }
            }
            h_4295 = term;
            f_4295 = generator.const7143;
            i_4295 = h_4295;
            term = string_replace_0_2.instance.invoke(context, i_4295, f_4295, generator.const7162);
            if(term == null)
              break Fail26047;
            f_4298 = term;
            term = l_4298;
            m_4298 = l_4298;
            term = create_spx_outliner_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26047;
            IStrategoTerm term10457 = term;
            Success10380:
            { 
              Fail26055:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26055;
                if(true)
                  break Success10380;
              }
              term = term10457;
              IStrategoTerm term10458 = term;
              Success10381:
              { 
                Fail26056:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26056;
                  if(true)
                    break Success10381;
                }
                term = term10458;
                IStrategoTerm term10459 = term;
                Success10382:
                { 
                  Fail26057:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26057;
                    if(true)
                      break Success10382;
                  }
                  term = term10459;
                  IStrategoTerm term10460 = term;
                  Success10383:
                  { 
                    Fail26058:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26058;
                      if(true)
                        break Success10383;
                    }
                    term = term10460;
                    IStrategoTerm l_4295 = null;
                    IStrategoTerm m_4295 = null;
                    IStrategoTerm o_4295 = null;
                    l_4295 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26047;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26047;
                    m_4295 = ((IStrategoList)term).tail();
                    o_4295 = m_4295;
                    term = report_failure_0_2.instance.invoke(context, o_4295, generator.const7214, l_4295);
                    if(term == null)
                      break Fail26047;
                  }
                }
              }
            }
            r_4295 = term;
            p_4295 = generator.const7143;
            s_4295 = r_4295;
            term = string_replace_0_2.instance.invoke(context, s_4295, p_4295, generator.const7143);
            if(term == null)
              break Fail26047;
            g_4298 = term;
            term = m_4298;
            n_4298 = m_4298;
            term = create_spx_contentfolding_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26047;
            IStrategoTerm term10461 = term;
            Success10384:
            { 
              Fail26059:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26059;
                if(true)
                  break Success10384;
              }
              term = term10461;
              IStrategoTerm term10462 = term;
              Success10385:
              { 
                Fail26060:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26060;
                  if(true)
                    break Success10385;
                }
                term = term10462;
                IStrategoTerm term10463 = term;
                Success10386:
                { 
                  Fail26061:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26061;
                    if(true)
                      break Success10386;
                  }
                  term = term10463;
                  IStrategoTerm term10464 = term;
                  Success10387:
                  { 
                    Fail26062:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26062;
                      if(true)
                        break Success10387;
                    }
                    term = term10464;
                    IStrategoTerm v_4295 = null;
                    IStrategoTerm w_4295 = null;
                    IStrategoTerm y_4295 = null;
                    v_4295 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26047;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26047;
                    w_4295 = ((IStrategoList)term).tail();
                    y_4295 = w_4295;
                    term = report_failure_0_2.instance.invoke(context, y_4295, generator.const7214, v_4295);
                    if(term == null)
                      break Fail26047;
                  }
                }
              }
            }
            b_4296 = term;
            z_4295 = generator.const7143;
            c_4296 = b_4296;
            term = string_replace_0_2.instance.invoke(context, c_4296, z_4295, generator.const7143);
            if(term == null)
              break Fail26047;
            h_4298 = term;
            term = n_4298;
            o_4298 = n_4298;
            term = create_spx_colorer_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26047;
            IStrategoTerm term10465 = term;
            Success10388:
            { 
              Fail26063:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26063;
                if(true)
                  break Success10388;
              }
              term = term10465;
              IStrategoTerm term10466 = term;
              Success10389:
              { 
                Fail26064:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26064;
                  if(true)
                    break Success10389;
                }
                term = term10466;
                IStrategoTerm term10467 = term;
                Success10390:
                { 
                  Fail26065:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26065;
                    if(true)
                      break Success10390;
                  }
                  term = term10467;
                  IStrategoTerm term10468 = term;
                  Success10391:
                  { 
                    Fail26066:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26066;
                      if(true)
                        break Success10391;
                    }
                    term = term10468;
                    IStrategoTerm f_4296 = null;
                    IStrategoTerm g_4296 = null;
                    IStrategoTerm i_4296 = null;
                    f_4296 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26047;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26047;
                    g_4296 = ((IStrategoList)term).tail();
                    i_4296 = g_4296;
                    term = report_failure_0_2.instance.invoke(context, i_4296, generator.const7214, f_4296);
                    if(term == null)
                      break Fail26047;
                  }
                }
              }
            }
            l_4296 = term;
            j_4296 = generator.const7143;
            m_4296 = l_4296;
            term = string_replace_0_2.instance.invoke(context, m_4296, j_4296, generator.const7143);
            if(term == null)
              break Fail26047;
            i_4298 = term;
            term = o_4298;
            p_4298 = o_4298;
            term = create_spx_contentcompletion_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26047;
            IStrategoTerm term10469 = term;
            Success10392:
            { 
              Fail26067:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26067;
                if(true)
                  break Success10392;
              }
              term = term10469;
              IStrategoTerm term10470 = term;
              Success10393:
              { 
                Fail26068:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26068;
                  if(true)
                    break Success10393;
                }
                term = term10470;
                IStrategoTerm term10471 = term;
                Success10394:
                { 
                  Fail26069:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26069;
                    if(true)
                      break Success10394;
                  }
                  term = term10471;
                  IStrategoTerm term10472 = term;
                  Success10395:
                  { 
                    Fail26070:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26070;
                      if(true)
                        break Success10395;
                    }
                    term = term10472;
                    IStrategoTerm p_4296 = null;
                    IStrategoTerm q_4296 = null;
                    IStrategoTerm s_4296 = null;
                    p_4296 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26047;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26047;
                    q_4296 = ((IStrategoList)term).tail();
                    s_4296 = q_4296;
                    term = report_failure_0_2.instance.invoke(context, s_4296, generator.const7214, p_4296);
                    if(term == null)
                      break Fail26047;
                  }
                }
              }
            }
            v_4296 = term;
            t_4296 = generator.const7143;
            w_4296 = v_4296;
            term = string_replace_0_2.instance.invoke(context, w_4296, t_4296, generator.const7143);
            if(term == null)
              break Fail26047;
            j_4298 = term;
            term = p_4298;
            term = create_spx_syntax_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26047;
            IStrategoTerm term10473 = term;
            Success10396:
            { 
              Fail26071:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26071;
                if(true)
                  break Success10396;
              }
              term = term10473;
              IStrategoTerm term10474 = term;
              Success10397:
              { 
                Fail26072:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26072;
                  if(true)
                    break Success10397;
                }
                term = term10474;
                IStrategoTerm term10475 = term;
                Success10398:
                { 
                  Fail26073:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26073;
                    if(true)
                      break Success10398;
                  }
                  term = term10475;
                  IStrategoTerm term10476 = term;
                  Success10399:
                  { 
                    Fail26074:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26074;
                      if(true)
                        break Success10399;
                    }
                    term = term10476;
                    IStrategoTerm z_4296 = null;
                    IStrategoTerm a_4297 = null;
                    IStrategoTerm c_4297 = null;
                    z_4296 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26047;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26047;
                    a_4297 = ((IStrategoList)term).tail();
                    c_4297 = a_4297;
                    term = report_failure_0_2.instance.invoke(context, c_4297, generator.const7214, z_4296);
                    if(term == null)
                      break Fail26047;
                  }
                }
              }
            }
            f_4297 = term;
            d_4297 = generator.const7143;
            g_4297 = f_4297;
            term = string_replace_0_2.instance.invoke(context, g_4297, d_4297, generator.const7143);
            if(term == null)
              break Fail26047;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(f_4298, termFactory.makeListCons(generator.const7215, termFactory.makeListCons(g_4298, termFactory.makeListCons(generator.const7215, termFactory.makeListCons(h_4298, termFactory.makeListCons(generator.const7201, termFactory.makeListCons(i_4298, termFactory.makeListCons(generator.const7215, termFactory.makeListCons(j_4298, termFactory.makeListCons(generator.const7201, termFactory.makeListCons(term, (IStrategoList)generator.constCons4646))))))))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26047;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            t_4298 = term;
            if(x_4294.value == null)
              break Fail26047;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7206, termFactory.makeListCons(x_4294.value, (IStrategoList)generator.constNil7));
            r_4298 = term;
            term = t_4298;
            u_4298 = t_4298;
            z_4298 = term;
            if(y_4294.value == null)
              break Fail26047;
            term = y_4294.value;
            IStrategoTerm term10477 = term;
            Success10400:
            { 
              Fail26075:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26075;
                if(true)
                  break Success10400;
              }
              term = term10477;
              IStrategoTerm term10478 = term;
              Success10401:
              { 
                Fail26076:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26076;
                  if(true)
                    break Success10401;
                }
                term = term10478;
                IStrategoTerm term10479 = term;
                Success10402:
                { 
                  Fail26077:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26077;
                    if(true)
                      break Success10402;
                  }
                  term = term10479;
                  IStrategoTerm term10480 = term;
                  Success10403:
                  { 
                    Fail26078:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26078;
                      if(true)
                        break Success10403;
                    }
                    term = term10480;
                    IStrategoTerm h_4297 = null;
                    IStrategoTerm i_4297 = null;
                    IStrategoTerm k_4297 = null;
                    h_4297 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26047;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26047;
                    i_4297 = ((IStrategoList)term).tail();
                    k_4297 = i_4297;
                    term = report_failure_0_2.instance.invoke(context, k_4297, generator.const7214, h_4297);
                    if(term == null)
                      break Fail26047;
                  }
                }
              }
            }
            n_4297 = term;
            l_4297 = generator.const7143;
            o_4297 = n_4297;
            term = string_replace_0_2.instance.invoke(context, o_4297, l_4297, generator.const7143);
            if(term == null)
              break Fail26047;
            x_4298 = term;
            term = z_4298;
            if(z_4294.value == null)
              break Fail26047;
            term = z_4294.value;
            IStrategoTerm term10481 = term;
            Success10404:
            { 
              Fail26079:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26079;
                if(true)
                  break Success10404;
              }
              term = term10481;
              IStrategoTerm term10482 = term;
              Success10405:
              { 
                Fail26080:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26080;
                  if(true)
                    break Success10405;
                }
                term = term10482;
                IStrategoTerm term10483 = term;
                Success10406:
                { 
                  Fail26081:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26081;
                    if(true)
                      break Success10406;
                  }
                  term = term10483;
                  IStrategoTerm term10484 = term;
                  Success10407:
                  { 
                    Fail26082:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26082;
                      if(true)
                        break Success10407;
                    }
                    term = term10484;
                    IStrategoTerm p_4297 = null;
                    IStrategoTerm q_4297 = null;
                    IStrategoTerm s_4297 = null;
                    p_4297 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26047;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26047;
                    q_4297 = ((IStrategoList)term).tail();
                    s_4297 = q_4297;
                    term = report_failure_0_2.instance.invoke(context, s_4297, generator.const7214, p_4297);
                    if(term == null)
                      break Fail26047;
                  }
                }
              }
            }
            v_4297 = term;
            t_4297 = generator.const7143;
            w_4297 = v_4297;
            term = string_replace_0_2.instance.invoke(context, w_4297, t_4297, generator.const7207);
            if(term == null)
              break Fail26047;
            term = (IStrategoTerm)termFactory.makeListCons(x_4298, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26047;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            term = output_text_file_0_2.instance.invoke(context, u_4298, r_4298, term);
            if(term == null)
              break Fail26047;
            if(true)
              break Success10374;
          }
        }
        term = term10451;
        lifted9338 lifted93380 = new lifted9338();
        lifted93380.x_4294 = x_4294;
        lifted93380.y_4294 = y_4294;
        lifted93380.z_4294 = z_4294;
        term = verbose_msg_2_0.instance.invoke(context, term, lifted9337.instance, lifted93380);
        if(term == null)
          break Fail26047;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}