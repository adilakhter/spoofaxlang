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

@SuppressWarnings("all") public class output_spx_derived_editor_services_0_0 extends Strategy 
{ 
  public static output_spx_derived_editor_services_0_0 instance = new output_spx_derived_editor_services_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("output_spx_derived_editor_services_0_0");
    Fail26004:
    { 
      IStrategoTerm s_4289 = null;
      TermReference t_4289 = new TermReference();
      TermReference u_4289 = new TermReference();
      TermReference v_4289 = new TermReference();
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26004;
      term = generator.const7208;
      if(u_4289.value == null)
        u_4289.value = term;
      else
        if(u_4289.value != term && !u_4289.value.match(term))
          break Fail26004;
      term = spx_file_relative_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26004;
      if(t_4289.value == null)
        t_4289.value = term;
      else
        if(t_4289.value != term && !t_4289.value.match(term))
          break Fail26004;
      term = generator.const7196;
      if(v_4289.value == null)
        v_4289.value = term;
      else
        if(v_4289.value != term && !v_4289.value.match(term))
          break Fail26004;
      IStrategoTerm term10408 = term;
      Success10331:
      { 
        Fail26005:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26005;
          if(true)
            break Success10331;
        }
        term = default_package_name_0_0.instance.invoke(context, term10408);
        if(term == null)
          break Fail26004;
      }
      s_4289 = term;
      IStrategoTerm term10409 = term;
      Success10332:
      { 
        Fail26006:
        { 
          IStrategoTerm w_4289 = null;
          w_4289 = term;
          term = is_heuristic_services_needed_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26006;
          term = w_4289;
          { 
            IStrategoTerm v_4293 = null;
            IStrategoTerm d_4294 = null;
            IStrategoTerm b_4290 = null;
            IStrategoTerm d_4290 = null;
            IStrategoTerm e_4290 = null;
            IStrategoTerm w_4293 = null;
            IStrategoTerm e_4294 = null;
            IStrategoTerm l_4290 = null;
            IStrategoTerm n_4290 = null;
            IStrategoTerm o_4290 = null;
            IStrategoTerm x_4293 = null;
            IStrategoTerm f_4294 = null;
            IStrategoTerm v_4290 = null;
            IStrategoTerm x_4290 = null;
            IStrategoTerm y_4290 = null;
            IStrategoTerm y_4293 = null;
            IStrategoTerm g_4294 = null;
            IStrategoTerm f_4291 = null;
            IStrategoTerm h_4291 = null;
            IStrategoTerm i_4291 = null;
            IStrategoTerm z_4293 = null;
            IStrategoTerm h_4294 = null;
            IStrategoTerm p_4291 = null;
            IStrategoTerm r_4291 = null;
            IStrategoTerm s_4291 = null;
            IStrategoTerm a_4294 = null;
            IStrategoTerm i_4294 = null;
            IStrategoTerm z_4291 = null;
            IStrategoTerm b_4292 = null;
            IStrategoTerm c_4292 = null;
            IStrategoTerm b_4294 = null;
            IStrategoTerm j_4294 = null;
            IStrategoTerm j_4292 = null;
            IStrategoTerm l_4292 = null;
            IStrategoTerm m_4292 = null;
            IStrategoTerm t_4292 = null;
            IStrategoTerm v_4292 = null;
            IStrategoTerm w_4292 = null;
            IStrategoTerm l_4294 = null;
            IStrategoTerm n_4294 = null;
            IStrategoTerm o_4294 = null;
            IStrategoTerm r_4294 = null;
            IStrategoTerm t_4294 = null;
            IStrategoTerm b_4293 = null;
            IStrategoTerm d_4293 = null;
            IStrategoTerm e_4293 = null;
            IStrategoTerm j_4293 = null;
            IStrategoTerm l_4293 = null;
            IStrategoTerm m_4293 = null;
            d_4294 = term;
            term = s_4289;
            IStrategoTerm term10410 = term;
            Success10333:
            { 
              Fail26007:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26007;
                if(true)
                  break Success10333;
              }
              term = term10410;
              IStrategoTerm term10411 = term;
              Success10334:
              { 
                Fail26008:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26008;
                  if(true)
                    break Success10334;
                }
                term = term10411;
                IStrategoTerm term10412 = term;
                Success10335:
                { 
                  Fail26009:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26009;
                    if(true)
                      break Success10335;
                  }
                  term = term10412;
                  IStrategoTerm term10413 = term;
                  Success10336:
                  { 
                    Fail26010:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26010;
                      if(true)
                        break Success10336;
                    }
                    term = term10413;
                    IStrategoTerm x_4289 = null;
                    IStrategoTerm y_4289 = null;
                    IStrategoTerm a_4290 = null;
                    x_4289 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    y_4289 = ((IStrategoList)term).tail();
                    a_4290 = y_4289;
                    term = report_failure_0_2.instance.invoke(context, a_4290, generator.const7209, x_4289);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            d_4290 = term;
            b_4290 = generator.const7143;
            e_4290 = d_4290;
            term = string_replace_0_2.instance.invoke(context, e_4290, b_4290, generator.const7162);
            if(term == null)
              break Fail26004;
            v_4293 = term;
            term = d_4294;
            e_4294 = d_4294;
            term = create_spx_derived_builders_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26004;
            IStrategoTerm term10414 = term;
            Success10337:
            { 
              Fail26011:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26011;
                if(true)
                  break Success10337;
              }
              term = term10414;
              IStrategoTerm term10415 = term;
              Success10338:
              { 
                Fail26012:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26012;
                  if(true)
                    break Success10338;
                }
                term = term10415;
                IStrategoTerm term10416 = term;
                Success10339:
                { 
                  Fail26013:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26013;
                    if(true)
                      break Success10339;
                  }
                  term = term10416;
                  IStrategoTerm term10417 = term;
                  Success10340:
                  { 
                    Fail26014:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26014;
                      if(true)
                        break Success10340;
                    }
                    term = term10417;
                    IStrategoTerm h_4290 = null;
                    IStrategoTerm i_4290 = null;
                    IStrategoTerm k_4290 = null;
                    h_4290 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    i_4290 = ((IStrategoList)term).tail();
                    k_4290 = i_4290;
                    term = report_failure_0_2.instance.invoke(context, k_4290, generator.const7209, h_4290);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            n_4290 = term;
            l_4290 = generator.const7143;
            o_4290 = n_4290;
            term = string_replace_0_2.instance.invoke(context, o_4290, l_4290, generator.const7143);
            if(term == null)
              break Fail26004;
            w_4293 = term;
            term = e_4294;
            f_4294 = e_4294;
            term = create_spx_derived_references_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26004;
            IStrategoTerm term10418 = term;
            Success10341:
            { 
              Fail26015:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26015;
                if(true)
                  break Success10341;
              }
              term = term10418;
              IStrategoTerm term10419 = term;
              Success10342:
              { 
                Fail26016:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26016;
                  if(true)
                    break Success10342;
                }
                term = term10419;
                IStrategoTerm term10420 = term;
                Success10343:
                { 
                  Fail26017:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26017;
                    if(true)
                      break Success10343;
                  }
                  term = term10420;
                  IStrategoTerm term10421 = term;
                  Success10344:
                  { 
                    Fail26018:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26018;
                      if(true)
                        break Success10344;
                    }
                    term = term10421;
                    IStrategoTerm r_4290 = null;
                    IStrategoTerm s_4290 = null;
                    IStrategoTerm u_4290 = null;
                    r_4290 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    s_4290 = ((IStrategoList)term).tail();
                    u_4290 = s_4290;
                    term = report_failure_0_2.instance.invoke(context, u_4290, generator.const7209, r_4290);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            x_4290 = term;
            v_4290 = generator.const7143;
            y_4290 = x_4290;
            term = string_replace_0_2.instance.invoke(context, y_4290, v_4290, generator.const7143);
            if(term == null)
              break Fail26004;
            x_4293 = term;
            term = f_4294;
            g_4294 = f_4294;
            term = create_spx_derived_outliner_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26004;
            IStrategoTerm term10422 = term;
            Success10345:
            { 
              Fail26019:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26019;
                if(true)
                  break Success10345;
              }
              term = term10422;
              IStrategoTerm term10423 = term;
              Success10346:
              { 
                Fail26020:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26020;
                  if(true)
                    break Success10346;
                }
                term = term10423;
                IStrategoTerm term10424 = term;
                Success10347:
                { 
                  Fail26021:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26021;
                    if(true)
                      break Success10347;
                  }
                  term = term10424;
                  IStrategoTerm term10425 = term;
                  Success10348:
                  { 
                    Fail26022:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26022;
                      if(true)
                        break Success10348;
                    }
                    term = term10425;
                    IStrategoTerm b_4291 = null;
                    IStrategoTerm c_4291 = null;
                    IStrategoTerm e_4291 = null;
                    b_4291 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    c_4291 = ((IStrategoList)term).tail();
                    e_4291 = c_4291;
                    term = report_failure_0_2.instance.invoke(context, e_4291, generator.const7209, b_4291);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            h_4291 = term;
            f_4291 = generator.const7143;
            i_4291 = h_4291;
            term = string_replace_0_2.instance.invoke(context, i_4291, f_4291, generator.const7143);
            if(term == null)
              break Fail26004;
            y_4293 = term;
            term = g_4294;
            h_4294 = g_4294;
            term = create_spx_derived_contentfolding_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26004;
            IStrategoTerm term10426 = term;
            Success10349:
            { 
              Fail26023:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26023;
                if(true)
                  break Success10349;
              }
              term = term10426;
              IStrategoTerm term10427 = term;
              Success10350:
              { 
                Fail26024:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26024;
                  if(true)
                    break Success10350;
                }
                term = term10427;
                IStrategoTerm term10428 = term;
                Success10351:
                { 
                  Fail26025:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26025;
                    if(true)
                      break Success10351;
                  }
                  term = term10428;
                  IStrategoTerm term10429 = term;
                  Success10352:
                  { 
                    Fail26026:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26026;
                      if(true)
                        break Success10352;
                    }
                    term = term10429;
                    IStrategoTerm l_4291 = null;
                    IStrategoTerm m_4291 = null;
                    IStrategoTerm o_4291 = null;
                    l_4291 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    m_4291 = ((IStrategoList)term).tail();
                    o_4291 = m_4291;
                    term = report_failure_0_2.instance.invoke(context, o_4291, generator.const7209, l_4291);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            r_4291 = term;
            p_4291 = generator.const7143;
            s_4291 = r_4291;
            term = string_replace_0_2.instance.invoke(context, s_4291, p_4291, generator.const7143);
            if(term == null)
              break Fail26004;
            z_4293 = term;
            term = h_4294;
            i_4294 = h_4294;
            term = create_spx_derived_colorer_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26004;
            IStrategoTerm term10430 = term;
            Success10353:
            { 
              Fail26027:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26027;
                if(true)
                  break Success10353;
              }
              term = term10430;
              IStrategoTerm term10431 = term;
              Success10354:
              { 
                Fail26028:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26028;
                  if(true)
                    break Success10354;
                }
                term = term10431;
                IStrategoTerm term10432 = term;
                Success10355:
                { 
                  Fail26029:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26029;
                    if(true)
                      break Success10355;
                  }
                  term = term10432;
                  IStrategoTerm term10433 = term;
                  Success10356:
                  { 
                    Fail26030:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26030;
                      if(true)
                        break Success10356;
                    }
                    term = term10433;
                    IStrategoTerm v_4291 = null;
                    IStrategoTerm w_4291 = null;
                    IStrategoTerm y_4291 = null;
                    v_4291 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    w_4291 = ((IStrategoList)term).tail();
                    y_4291 = w_4291;
                    term = report_failure_0_2.instance.invoke(context, y_4291, generator.const7209, v_4291);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            b_4292 = term;
            z_4291 = generator.const7143;
            c_4292 = b_4292;
            term = string_replace_0_2.instance.invoke(context, c_4292, z_4291, generator.const7143);
            if(term == null)
              break Fail26004;
            a_4294 = term;
            term = i_4294;
            j_4294 = i_4294;
            term = create_spx_derived_contentcompletion_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26004;
            IStrategoTerm term10434 = term;
            Success10357:
            { 
              Fail26031:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26031;
                if(true)
                  break Success10357;
              }
              term = term10434;
              IStrategoTerm term10435 = term;
              Success10358:
              { 
                Fail26032:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26032;
                  if(true)
                    break Success10358;
                }
                term = term10435;
                IStrategoTerm term10436 = term;
                Success10359:
                { 
                  Fail26033:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26033;
                    if(true)
                      break Success10359;
                  }
                  term = term10436;
                  IStrategoTerm term10437 = term;
                  Success10360:
                  { 
                    Fail26034:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26034;
                      if(true)
                        break Success10360;
                    }
                    term = term10437;
                    IStrategoTerm f_4292 = null;
                    IStrategoTerm g_4292 = null;
                    IStrategoTerm i_4292 = null;
                    f_4292 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    g_4292 = ((IStrategoList)term).tail();
                    i_4292 = g_4292;
                    term = report_failure_0_2.instance.invoke(context, i_4292, generator.const7209, f_4292);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            l_4292 = term;
            j_4292 = generator.const7143;
            m_4292 = l_4292;
            term = string_replace_0_2.instance.invoke(context, m_4292, j_4292, generator.const7143);
            if(term == null)
              break Fail26004;
            b_4294 = term;
            term = j_4294;
            term = create_spx_derived_syntax_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26004;
            IStrategoTerm term10438 = term;
            Success10361:
            { 
              Fail26035:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26035;
                if(true)
                  break Success10361;
              }
              term = term10438;
              IStrategoTerm term10439 = term;
              Success10362:
              { 
                Fail26036:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26036;
                  if(true)
                    break Success10362;
                }
                term = term10439;
                IStrategoTerm term10440 = term;
                Success10363:
                { 
                  Fail26037:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26037;
                    if(true)
                      break Success10363;
                  }
                  term = term10440;
                  IStrategoTerm term10441 = term;
                  Success10364:
                  { 
                    Fail26038:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26038;
                      if(true)
                        break Success10364;
                    }
                    term = term10441;
                    IStrategoTerm p_4292 = null;
                    IStrategoTerm q_4292 = null;
                    IStrategoTerm s_4292 = null;
                    p_4292 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    q_4292 = ((IStrategoList)term).tail();
                    s_4292 = q_4292;
                    term = report_failure_0_2.instance.invoke(context, s_4292, generator.const7209, p_4292);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            v_4292 = term;
            t_4292 = generator.const7143;
            w_4292 = v_4292;
            term = string_replace_0_2.instance.invoke(context, w_4292, t_4292, generator.const7143);
            if(term == null)
              break Fail26004;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(v_4293, termFactory.makeListCons(generator.const7212, termFactory.makeListCons(w_4293, termFactory.makeListCons(generator.const7211, termFactory.makeListCons(x_4293, termFactory.makeListCons(generator.const7211, termFactory.makeListCons(y_4293, termFactory.makeListCons(generator.const7211, termFactory.makeListCons(z_4293, termFactory.makeListCons(generator.const7211, termFactory.makeListCons(a_4294, termFactory.makeListCons(generator.const7211, termFactory.makeListCons(b_4294, termFactory.makeListCons(generator.const7211, termFactory.makeListCons(term, (IStrategoList)generator.constCons4649))))))))))))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26004;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            n_4294 = term;
            if(t_4289.value == null)
              break Fail26004;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7206, termFactory.makeListCons(t_4289.value, (IStrategoList)generator.constNil7));
            l_4294 = term;
            term = n_4294;
            o_4294 = n_4294;
            t_4294 = term;
            if(u_4289.value == null)
              break Fail26004;
            term = u_4289.value;
            IStrategoTerm term10442 = term;
            Success10365:
            { 
              Fail26039:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26039;
                if(true)
                  break Success10365;
              }
              term = term10442;
              IStrategoTerm term10443 = term;
              Success10366:
              { 
                Fail26040:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26040;
                  if(true)
                    break Success10366;
                }
                term = term10443;
                IStrategoTerm term10444 = term;
                Success10367:
                { 
                  Fail26041:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26041;
                    if(true)
                      break Success10367;
                  }
                  term = term10444;
                  IStrategoTerm term10445 = term;
                  Success10368:
                  { 
                    Fail26042:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26042;
                      if(true)
                        break Success10368;
                    }
                    term = term10445;
                    IStrategoTerm x_4292 = null;
                    IStrategoTerm y_4292 = null;
                    IStrategoTerm a_4293 = null;
                    x_4292 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    y_4292 = ((IStrategoList)term).tail();
                    a_4293 = y_4292;
                    term = report_failure_0_2.instance.invoke(context, a_4293, generator.const7209, x_4292);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            d_4293 = term;
            b_4293 = generator.const7143;
            e_4293 = d_4293;
            term = string_replace_0_2.instance.invoke(context, e_4293, b_4293, generator.const7143);
            if(term == null)
              break Fail26004;
            r_4294 = term;
            term = t_4294;
            if(v_4289.value == null)
              break Fail26004;
            term = v_4289.value;
            IStrategoTerm term10446 = term;
            Success10369:
            { 
              Fail26043:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail26043;
                if(true)
                  break Success10369;
              }
              term = term10446;
              IStrategoTerm term10447 = term;
              Success10370:
              { 
                Fail26044:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26044;
                  if(true)
                    break Success10370;
                }
                term = term10447;
                IStrategoTerm term10448 = term;
                Success10371:
                { 
                  Fail26045:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26045;
                    if(true)
                      break Success10371;
                  }
                  term = term10448;
                  IStrategoTerm term10449 = term;
                  Success10372:
                  { 
                    Fail26046:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26046;
                      if(true)
                        break Success10372;
                    }
                    term = term10449;
                    IStrategoTerm f_4293 = null;
                    IStrategoTerm g_4293 = null;
                    IStrategoTerm i_4293 = null;
                    f_4293 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail26004;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail26004;
                    g_4293 = ((IStrategoList)term).tail();
                    i_4293 = g_4293;
                    term = report_failure_0_2.instance.invoke(context, i_4293, generator.const7209, f_4293);
                    if(term == null)
                      break Fail26004;
                  }
                }
              }
            }
            l_4293 = term;
            j_4293 = generator.const7143;
            m_4293 = l_4293;
            term = string_replace_0_2.instance.invoke(context, m_4293, j_4293, generator.const7207);
            if(term == null)
              break Fail26004;
            term = (IStrategoTerm)termFactory.makeListCons(r_4294, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26004;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            term = output_text_file_0_2.instance.invoke(context, o_4294, l_4294, term);
            if(term == null)
              break Fail26004;
            if(true)
              break Success10332;
          }
        }
        term = term10409;
        lifted9336 lifted93360 = new lifted9336();
        lifted93360.t_4289 = t_4289;
        lifted93360.u_4289 = u_4289;
        lifted93360.v_4289 = v_4289;
        term = verbose_msg_2_0.instance.invoke(context, term, lifted9335.instance, lifted93360);
        if(term == null)
          break Fail26004;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}