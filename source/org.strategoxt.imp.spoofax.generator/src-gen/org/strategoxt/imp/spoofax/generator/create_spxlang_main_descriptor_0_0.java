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

@SuppressWarnings("all") public class create_spxlang_main_descriptor_0_0 extends Strategy 
{ 
  public static create_spxlang_main_descriptor_0_0 instance = new create_spxlang_main_descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_spxlang_main_descriptor_0_0");
    Fail25975:
    { 
      IStrategoTerm k_4286 = null;
      IStrategoTerm l_4286 = null;
      TermReference m_4286 = new TermReference();
      TermReference n_4286 = new TermReference();
      TermReference o_4286 = new TermReference();
      IStrategoTerm p_4286 = null;
      p_4286 = term;
      term = get_sdf_main_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25975;
      term = generator.const7195;
      if(n_4286.value == null)
        n_4286.value = term;
      else
        if(n_4286.value != term && !n_4286.value.match(term))
          break Fail25975;
      term = spx_file_relative_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25975;
      if(m_4286.value == null)
        m_4286.value = term;
      else
        if(m_4286.value != term && !m_4286.value.match(term))
          break Fail25975;
      term = generator.const7196;
      if(o_4286.value == null)
        o_4286.value = term;
      else
        if(o_4286.value != term && !o_4286.value.match(term))
          break Fail25975;
      IStrategoTerm term10381 = term;
      Success10304:
      { 
        Fail25976:
        { 
          term = $Base$Package_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25976;
          if(true)
            break Success10304;
        }
        term = default_package_name_0_0.instance.invoke(context, term10381);
        if(term == null)
          break Fail25975;
      }
      l_4286 = term;
      term = concat_strings_0_0.instance.invoke(context, generator.constCons4647);
      if(term == null)
        break Fail25975;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
      k_4286 = term;
      term = p_4286;
      IStrategoTerm term10382 = term;
      Success10305:
      { 
        Fail25977:
        { 
          IStrategoTerm q_4286 = null;
          q_4286 = term;
          IStrategoTerm term10383 = term;
          Success10306:
          { 
            Fail25978:
            { 
              if(m_4286.value == null || (n_4286.value == null || o_4286.value == null))
                break Fail25978;
              term = termFactory.makeTuple(generator.const7198, m_4286.value, generator.const7009, n_4286.value, o_4286.value);
              term = conc_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25978;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25978;
              { 
                if(true)
                  break Fail25977;
                if(true)
                  break Success10306;
              }
            }
            term = term10383;
          }
          term = q_4286;
          { 
            IStrategoTerm z_4288 = null;
            IStrategoTerm d_4289 = null;
            IStrategoTerm v_4286 = null;
            IStrategoTerm x_4286 = null;
            IStrategoTerm y_4286 = null;
            IStrategoTerm a_4289 = null;
            IStrategoTerm e_4289 = null;
            IStrategoTerm d_4287 = null;
            IStrategoTerm f_4287 = null;
            IStrategoTerm g_4287 = null;
            IStrategoTerm b_4289 = null;
            IStrategoTerm f_4289 = null;
            IStrategoTerm l_4287 = null;
            IStrategoTerm n_4287 = null;
            IStrategoTerm o_4287 = null;
            IStrategoTerm v_4287 = null;
            IStrategoTerm x_4287 = null;
            IStrategoTerm y_4287 = null;
            IStrategoTerm q_4687 = null;
            IStrategoTerm h_4289 = null;
            IStrategoTerm j_4289 = null;
            IStrategoTerm k_4289 = null;
            IStrategoTerm n_4289 = null;
            IStrategoTerm p_4289 = null;
            IStrategoTerm d_4288 = null;
            IStrategoTerm f_4288 = null;
            IStrategoTerm g_4288 = null;
            IStrategoTerm l_4288 = null;
            IStrategoTerm n_4288 = null;
            IStrategoTerm o_4288 = null;
            d_4289 = term;
            term = l_4286;
            IStrategoTerm term10384 = term;
            Success10307:
            { 
              Fail25979:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25979;
                if(true)
                  break Success10307;
              }
              term = term10384;
              IStrategoTerm term10385 = term;
              Success10308:
              { 
                Fail25980:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25980;
                  if(true)
                    break Success10308;
                }
                term = term10385;
                IStrategoTerm term10386 = term;
                Success10309:
                { 
                  Fail25981:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25981;
                    if(true)
                      break Success10309;
                  }
                  term = term10386;
                  IStrategoTerm term10387 = term;
                  Success10310:
                  { 
                    Fail25982:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail25982;
                      if(true)
                        break Success10310;
                    }
                    term = term10387;
                    IStrategoTerm r_4286 = null;
                    IStrategoTerm s_4286 = null;
                    IStrategoTerm u_4286 = null;
                    r_4286 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail25975;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail25975;
                    s_4286 = ((IStrategoList)term).tail();
                    u_4286 = s_4286;
                    term = report_failure_0_2.instance.invoke(context, u_4286, generator.const7199, r_4286);
                    if(term == null)
                      break Fail25975;
                  }
                }
              }
            }
            x_4286 = term;
            v_4286 = generator.const7143;
            y_4286 = x_4286;
            term = string_replace_0_2.instance.invoke(context, y_4286, v_4286, generator.const7162);
            if(term == null)
              break Fail25975;
            z_4288 = term;
            e_4289 = d_4289;
            term = k_4286;
            IStrategoTerm term10388 = term;
            Success10311:
            { 
              Fail25983:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25983;
                if(true)
                  break Success10311;
              }
              term = term10388;
              IStrategoTerm term10389 = term;
              Success10312:
              { 
                Fail25984:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25984;
                  if(true)
                    break Success10312;
                }
                term = term10389;
                IStrategoTerm term10390 = term;
                Success10313:
                { 
                  Fail25985:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25985;
                    if(true)
                      break Success10313;
                  }
                  term = term10390;
                  IStrategoTerm term10391 = term;
                  Success10314:
                  { 
                    Fail25986:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail25986;
                      if(true)
                        break Success10314;
                    }
                    term = term10391;
                    IStrategoTerm z_4286 = null;
                    IStrategoTerm a_4287 = null;
                    IStrategoTerm c_4287 = null;
                    z_4286 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail25975;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail25975;
                    a_4287 = ((IStrategoList)term).tail();
                    c_4287 = a_4287;
                    term = report_failure_0_2.instance.invoke(context, c_4287, generator.const7199, z_4286);
                    if(term == null)
                      break Fail25975;
                  }
                }
              }
            }
            f_4287 = term;
            d_4287 = generator.const7143;
            g_4287 = f_4287;
            term = string_replace_0_2.instance.invoke(context, g_4287, d_4287, generator.const7159);
            if(term == null)
              break Fail25975;
            a_4289 = term;
            f_4289 = e_4289;
            term = l_4286;
            IStrategoTerm term10392 = term;
            Success10315:
            { 
              Fail25987:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25987;
                if(true)
                  break Success10315;
              }
              term = term10392;
              IStrategoTerm term10393 = term;
              Success10316:
              { 
                Fail25988:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25988;
                  if(true)
                    break Success10316;
                }
                term = term10393;
                IStrategoTerm term10394 = term;
                Success10317:
                { 
                  Fail25989:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25989;
                    if(true)
                      break Success10317;
                  }
                  term = term10394;
                  IStrategoTerm term10395 = term;
                  Success10318:
                  { 
                    Fail25990:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail25990;
                      if(true)
                        break Success10318;
                    }
                    term = term10395;
                    IStrategoTerm h_4287 = null;
                    IStrategoTerm i_4287 = null;
                    IStrategoTerm k_4287 = null;
                    h_4287 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail25975;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail25975;
                    i_4287 = ((IStrategoList)term).tail();
                    k_4287 = i_4287;
                    term = report_failure_0_2.instance.invoke(context, k_4287, generator.const7199, h_4287);
                    if(term == null)
                      break Fail25975;
                  }
                }
              }
            }
            n_4287 = term;
            l_4287 = generator.const7143;
            o_4287 = n_4287;
            term = string_replace_0_2.instance.invoke(context, o_4287, l_4287, generator.const7162);
            if(term == null)
              break Fail25975;
            b_4289 = term;
            term = f_4289;
            term = default_spx_main_descriptor_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25975;
            if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
              break Fail25975;
            q_4687 = term.getSubterm(2);
            term = pp_descriptor_to_string_0_0.instance.invoke(context, q_4687);
            if(term == null)
              break Fail25975;
            term = debug_1_0.instance.invoke(context, term, lifted9332.instance);
            if(term == null)
              break Fail25975;
            IStrategoTerm term10396 = term;
            Success10319:
            { 
              Fail25991:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25991;
                if(true)
                  break Success10319;
              }
              term = term10396;
              IStrategoTerm term10397 = term;
              Success10320:
              { 
                Fail25992:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25992;
                  if(true)
                    break Success10320;
                }
                term = term10397;
                IStrategoTerm term10398 = term;
                Success10321:
                { 
                  Fail25993:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25993;
                    if(true)
                      break Success10321;
                  }
                  term = term10398;
                  IStrategoTerm term10399 = term;
                  Success10322:
                  { 
                    Fail25994:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail25994;
                      if(true)
                        break Success10322;
                    }
                    term = term10399;
                    IStrategoTerm r_4287 = null;
                    IStrategoTerm s_4287 = null;
                    IStrategoTerm u_4287 = null;
                    r_4287 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail25975;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail25975;
                    s_4287 = ((IStrategoList)term).tail();
                    u_4287 = s_4287;
                    term = report_failure_0_2.instance.invoke(context, u_4287, generator.const7199, r_4287);
                    if(term == null)
                      break Fail25975;
                  }
                }
              }
            }
            x_4287 = term;
            v_4287 = generator.const7143;
            y_4287 = x_4287;
            term = string_replace_0_2.instance.invoke(context, y_4287, v_4287, generator.const7143);
            if(term == null)
              break Fail25975;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7205, termFactory.makeListCons(z_4288, termFactory.makeListCons(generator.const7204, termFactory.makeListCons(a_4289, termFactory.makeListCons(generator.const7203, termFactory.makeListCons(b_4289, termFactory.makeListCons(generator.const7202, termFactory.makeListCons(term, (IStrategoList)generator.constCons4648))))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25975;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            j_4289 = term;
            if(m_4286.value == null)
              break Fail25975;
            term = (IStrategoTerm)termFactory.makeListCons(generator.const7206, termFactory.makeListCons(m_4286.value, (IStrategoList)generator.constNil7));
            h_4289 = term;
            term = j_4289;
            k_4289 = j_4289;
            p_4289 = term;
            if(n_4286.value == null)
              break Fail25975;
            term = n_4286.value;
            IStrategoTerm term10400 = term;
            Success10323:
            { 
              Fail25995:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25995;
                if(true)
                  break Success10323;
              }
              term = term10400;
              IStrategoTerm term10401 = term;
              Success10324:
              { 
                Fail25996:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25996;
                  if(true)
                    break Success10324;
                }
                term = term10401;
                IStrategoTerm term10402 = term;
                Success10325:
                { 
                  Fail25997:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail25997;
                    if(true)
                      break Success10325;
                  }
                  term = term10402;
                  IStrategoTerm term10403 = term;
                  Success10326:
                  { 
                    Fail25998:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail25998;
                      if(true)
                        break Success10326;
                    }
                    term = term10403;
                    IStrategoTerm z_4287 = null;
                    IStrategoTerm a_4288 = null;
                    IStrategoTerm c_4288 = null;
                    z_4287 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail25975;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail25975;
                    a_4288 = ((IStrategoList)term).tail();
                    c_4288 = a_4288;
                    term = report_failure_0_2.instance.invoke(context, c_4288, generator.const7199, z_4287);
                    if(term == null)
                      break Fail25975;
                  }
                }
              }
            }
            f_4288 = term;
            d_4288 = generator.const7143;
            g_4288 = f_4288;
            term = string_replace_0_2.instance.invoke(context, g_4288, d_4288, generator.const7143);
            if(term == null)
              break Fail25975;
            n_4289 = term;
            term = p_4289;
            if(o_4286.value == null)
              break Fail25975;
            term = o_4286.value;
            IStrategoTerm term10404 = term;
            Success10327:
            { 
              Fail25999:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail25999;
                if(true)
                  break Success10327;
              }
              term = term10404;
              IStrategoTerm term10405 = term;
              Success10328:
              { 
                Fail26000:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail26000;
                  if(true)
                    break Success10328;
                }
                term = term10405;
                IStrategoTerm term10406 = term;
                Success10329:
                { 
                  Fail26001:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail26001;
                    if(true)
                      break Success10329;
                  }
                  term = term10406;
                  IStrategoTerm term10407 = term;
                  Success10330:
                  { 
                    Fail26002:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail26002;
                      if(true)
                        break Success10330;
                    }
                    term = term10407;
                    IStrategoTerm h_4288 = null;
                    IStrategoTerm i_4288 = null;
                    IStrategoTerm k_4288 = null;
                    h_4288 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail25975;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail25975;
                    i_4288 = ((IStrategoList)term).tail();
                    k_4288 = i_4288;
                    term = report_failure_0_2.instance.invoke(context, k_4288, generator.const7199, h_4288);
                    if(term == null)
                      break Fail25975;
                  }
                }
              }
            }
            n_4288 = term;
            l_4288 = generator.const7143;
            o_4288 = n_4288;
            term = string_replace_0_2.instance.invoke(context, o_4288, l_4288, generator.const7207);
            if(term == null)
              break Fail25975;
            term = (IStrategoTerm)termFactory.makeListCons(n_4289, termFactory.makeListCons(term, (IStrategoList)generator.constNil7));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25975;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
            term = output_text_file_0_2.instance.invoke(context, k_4289, h_4289, term);
            if(term == null)
              break Fail25975;
            if(true)
              break Success10305;
          }
        }
        term = term10382;
        lifted9334 lifted93340 = new lifted9334();
        lifted93340.m_4286 = m_4286;
        lifted93340.n_4286 = n_4286;
        lifted93340.o_4286 = o_4286;
        term = verbose_msg_2_0.instance.invoke(context, term, lifted9333.instance, lifted93340);
        if(term == null)
          break Fail25975;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}