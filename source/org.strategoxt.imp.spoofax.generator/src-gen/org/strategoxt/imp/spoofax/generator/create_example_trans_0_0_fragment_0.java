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

@SuppressWarnings("all") final class create_example_trans_0_0_fragment_0 extends Strategy 
{ 
  TermReference v_4370;

  TermReference w_4370;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail28499:
    { 
      IStrategoTerm term10982 = term;
      Success11245:
      { 
        Fail28500:
        { 
          term = trans_module_name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28500;
          term = termFactory.makeTuple(generator.const7762, term, generator.const7763);
          term = conc_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28500;
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28500;
          if(true)
            break Success11245;
        }
        term = term10982;
        IStrategoTerm w_4373 = null;
        IStrategoTerm z_4373 = null;
        IStrategoTerm b_4371 = null;
        IStrategoTerm d_4371 = null;
        IStrategoTerm e_4371 = null;
        IStrategoTerm x_4373 = null;
        IStrategoTerm a_4374 = null;
        IStrategoTerm j_4371 = null;
        IStrategoTerm l_4371 = null;
        IStrategoTerm m_4371 = null;
        IStrategoTerm r_4371 = null;
        IStrategoTerm t_4371 = null;
        IStrategoTerm u_4371 = null;
        IStrategoTerm c_4374 = null;
        IStrategoTerm e_4374 = null;
        IStrategoTerm f_4374 = null;
        IStrategoTerm z_4371 = null;
        IStrategoTerm b_4372 = null;
        IStrategoTerm c_4372 = null;
        term = trans_module_name_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28499;
        if(v_4370.value == null)
          v_4370.value = term;
        else
          if(v_4370.value != term && !v_4370.value.match(term))
            break Fail28499;
        term = get_sdf_main_module_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28499;
        if(w_4370.value == null)
          w_4370.value = term;
        else
          if(w_4370.value != term && !w_4370.value.match(term))
            break Fail28499;
        z_4373 = term;
        if(v_4370.value == null)
          break Fail28499;
        term = v_4370.value;
        IStrategoTerm term10983 = term;
        Success11246:
        { 
          Fail28501:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28501;
            if(true)
              break Success11246;
          }
          term = term10983;
          IStrategoTerm term10984 = term;
          Success11247:
          { 
            Fail28502:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28502;
              if(true)
                break Success11247;
            }
            term = term10984;
            IStrategoTerm term10985 = term;
            Success11248:
            { 
              Fail28503:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28503;
                if(true)
                  break Success11248;
              }
              term = term10985;
              IStrategoTerm term10986 = term;
              Success11249:
              { 
                Fail28504:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail28504;
                  if(true)
                    break Success11249;
                }
                term = term10986;
                IStrategoTerm x_4370 = null;
                IStrategoTerm y_4370 = null;
                IStrategoTerm a_4371 = null;
                x_4370 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail28499;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail28499;
                y_4370 = ((IStrategoList)term).tail();
                a_4371 = y_4370;
                term = report_failure_0_2.instance.invoke(context, a_4371, generator.const7764, x_4370);
                if(term == null)
                  break Fail28499;
              }
            }
          }
        }
        d_4371 = term;
        b_4371 = generator.const7143;
        e_4371 = d_4371;
        term = string_replace_0_2.instance.invoke(context, e_4371, b_4371, generator.const7159);
        if(term == null)
          break Fail28499;
        w_4373 = term;
        term = z_4373;
        a_4374 = z_4373;
        if(w_4370.value == null)
          break Fail28499;
        term = w_4370.value;
        IStrategoTerm term10987 = term;
        Success11250:
        { 
          Fail28505:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28505;
            if(true)
              break Success11250;
          }
          term = term10987;
          IStrategoTerm term10988 = term;
          Success11251:
          { 
            Fail28506:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28506;
              if(true)
                break Success11251;
            }
            term = term10988;
            IStrategoTerm term10989 = term;
            Success11252:
            { 
              Fail28507:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28507;
                if(true)
                  break Success11252;
              }
              term = term10989;
              IStrategoTerm term10990 = term;
              Success11253:
              { 
                Fail28508:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail28508;
                  if(true)
                    break Success11253;
                }
                term = term10990;
                IStrategoTerm f_4371 = null;
                IStrategoTerm g_4371 = null;
                IStrategoTerm i_4371 = null;
                f_4371 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail28499;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail28499;
                g_4371 = ((IStrategoList)term).tail();
                i_4371 = g_4371;
                term = report_failure_0_2.instance.invoke(context, i_4371, generator.const7764, f_4371);
                if(term == null)
                  break Fail28499;
              }
            }
          }
        }
        l_4371 = term;
        j_4371 = generator.const7143;
        m_4371 = l_4371;
        term = string_replace_0_2.instance.invoke(context, m_4371, j_4371, generator.const7765);
        if(term == null)
          break Fail28499;
        x_4373 = term;
        term = a_4374;
        if(w_4370.value == null)
          break Fail28499;
        term = w_4370.value;
        IStrategoTerm term10991 = term;
        Success11254:
        { 
          Fail28509:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28509;
            if(true)
              break Success11254;
          }
          term = term10991;
          IStrategoTerm term10992 = term;
          Success11255:
          { 
            Fail28510:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28510;
              if(true)
                break Success11255;
            }
            term = term10992;
            IStrategoTerm term10993 = term;
            Success11256:
            { 
              Fail28511:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28511;
                if(true)
                  break Success11256;
              }
              term = term10993;
              IStrategoTerm term10994 = term;
              Success11257:
              { 
                Fail28512:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail28512;
                  if(true)
                    break Success11257;
                }
                term = term10994;
                IStrategoTerm n_4371 = null;
                IStrategoTerm o_4371 = null;
                IStrategoTerm q_4371 = null;
                n_4371 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail28499;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail28499;
                o_4371 = ((IStrategoList)term).tail();
                q_4371 = o_4371;
                term = report_failure_0_2.instance.invoke(context, q_4371, generator.const7764, n_4371);
                if(term == null)
                  break Fail28499;
              }
            }
          }
        }
        t_4371 = term;
        r_4371 = generator.const7143;
        u_4371 = t_4371;
        term = string_replace_0_2.instance.invoke(context, u_4371, r_4371, generator.const7766);
        if(term == null)
          break Fail28499;
        term = (IStrategoTerm)termFactory.makeListCons(generator.const7191, termFactory.makeListCons(w_4373, termFactory.makeListCons(generator.const7770, termFactory.makeListCons(x_4373, termFactory.makeListCons(generator.const7769, termFactory.makeListCons(term, (IStrategoList)generator.constCons5074))))));
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28499;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        e_4374 = term;
        c_4374 = generator.constCons5075;
        term = e_4374;
        f_4374 = e_4374;
        if(v_4370.value == null)
          break Fail28499;
        term = v_4370.value;
        IStrategoTerm term10995 = term;
        Success11258:
        { 
          Fail28513:
          { 
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail28513;
            if(true)
              break Success11258;
          }
          term = term10995;
          IStrategoTerm term10996 = term;
          Success11259:
          { 
            Fail28514:
            { 
              term = is_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28514;
              if(true)
                break Success11259;
            }
            term = term10996;
            IStrategoTerm term10997 = term;
            Success11260:
            { 
              Fail28515:
              { 
                term = int_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail28515;
                if(true)
                  break Success11260;
              }
              term = term10997;
              IStrategoTerm term10998 = term;
              Success11261:
              { 
                Fail28516:
                { 
                  term = real_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail28516;
                  if(true)
                    break Success11261;
                }
                term = term10998;
                IStrategoTerm v_4371 = null;
                IStrategoTerm w_4371 = null;
                IStrategoTerm y_4371 = null;
                v_4371 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail28499;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail28499;
                w_4371 = ((IStrategoList)term).tail();
                y_4371 = w_4371;
                term = report_failure_0_2.instance.invoke(context, y_4371, generator.const7764, v_4371);
                if(term == null)
                  break Fail28499;
              }
            }
          }
        }
        b_4372 = term;
        z_4371 = generator.const7143;
        c_4372 = b_4372;
        term = string_replace_0_2.instance.invoke(context, c_4372, z_4371, generator.const7143);
        if(term == null)
          break Fail28499;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constCons5076);
        term = concat_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28499;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
        term = output_text_file_0_2.instance.invoke(context, f_4374, c_4374, term);
        if(term == null)
          break Fail28499;
        IStrategoTerm term10999 = term;
        Success11262:
        { 
          Fail28517:
          { 
            IStrategoTerm d_4372 = null;
            d_4372 = term;
            IStrategoTerm term11000 = term;
            Success11263:
            { 
              Fail28518:
              { 
                term = file_exists_0_0.instance.invoke(context, generator.const7772);
                if(term == null)
                  break Fail28518;
                { 
                  if(true)
                    break Fail28517;
                  if(true)
                    break Success11263;
                }
              }
              term = term11000;
            }
            term = d_4372;
            { 
              IStrategoTerm i_4372 = null;
              IStrategoTerm k_4372 = null;
              IStrategoTerm l_4372 = null;
              IStrategoTerm o_4374 = null;
              IStrategoTerm q_4374 = null;
              IStrategoTerm r_4374 = null;
              if(w_4370.value == null)
                break Fail28499;
              term = w_4370.value;
              IStrategoTerm term11001 = term;
              Success11264:
              { 
                Fail28519:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail28519;
                  if(true)
                    break Success11264;
                }
                term = term11001;
                IStrategoTerm term11002 = term;
                Success11265:
                { 
                  Fail28520:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail28520;
                    if(true)
                      break Success11265;
                  }
                  term = term11002;
                  IStrategoTerm term11003 = term;
                  Success11266:
                  { 
                    Fail28521:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail28521;
                      if(true)
                        break Success11266;
                    }
                    term = term11003;
                    IStrategoTerm term11004 = term;
                    Success11267:
                    { 
                      Fail28522:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail28522;
                        if(true)
                          break Success11267;
                      }
                      term = term11004;
                      IStrategoTerm e_4372 = null;
                      IStrategoTerm f_4372 = null;
                      IStrategoTerm h_4372 = null;
                      e_4372 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail28499;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail28499;
                      f_4372 = ((IStrategoList)term).tail();
                      h_4372 = f_4372;
                      term = report_failure_0_2.instance.invoke(context, h_4372, generator.const7764, e_4372);
                      if(term == null)
                        break Fail28499;
                    }
                  }
                }
              }
              k_4372 = term;
              i_4372 = generator.const7143;
              l_4372 = k_4372;
              term = string_replace_0_2.instance.invoke(context, l_4372, i_4372, generator.const7765);
              if(term == null)
                break Fail28499;
              term = (IStrategoTerm)termFactory.makeListCons(generator.const7782, termFactory.makeListCons(term, (IStrategoList)generator.constCons5095));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28499;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
              q_4374 = term;
              o_4374 = generator.constCons5075;
              r_4374 = q_4374;
              term = output_text_file_0_2.instance.invoke(context, r_4374, o_4374, generator.const7783);
              if(term == null)
                break Fail28499;
              if(true)
                break Success11262;
            }
          }
          term = term10999;
        }
        IStrategoTerm term11005 = term;
        Success11268:
        { 
          Fail28523:
          { 
            IStrategoTerm m_4372 = null;
            m_4372 = term;
            IStrategoTerm term11006 = term;
            Success11269:
            { 
              Fail28524:
              { 
                term = file_exists_0_0.instance.invoke(context, generator.const7784);
                if(term == null)
                  break Fail28524;
                { 
                  if(true)
                    break Fail28523;
                  if(true)
                    break Success11269;
                }
              }
              term = term11006;
            }
            term = m_4372;
            { 
              IStrategoTerm r_4372 = null;
              IStrategoTerm t_4372 = null;
              IStrategoTerm u_4372 = null;
              IStrategoTerm w_4374 = null;
              IStrategoTerm y_4374 = null;
              IStrategoTerm z_4374 = null;
              if(w_4370.value == null)
                break Fail28499;
              term = w_4370.value;
              IStrategoTerm term11007 = term;
              Success11270:
              { 
                Fail28525:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail28525;
                  if(true)
                    break Success11270;
                }
                term = term11007;
                IStrategoTerm term11008 = term;
                Success11271:
                { 
                  Fail28526:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail28526;
                    if(true)
                      break Success11271;
                  }
                  term = term11008;
                  IStrategoTerm term11009 = term;
                  Success11272:
                  { 
                    Fail28527:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail28527;
                      if(true)
                        break Success11272;
                    }
                    term = term11009;
                    IStrategoTerm term11010 = term;
                    Success11273:
                    { 
                      Fail28528:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail28528;
                        if(true)
                          break Success11273;
                      }
                      term = term11010;
                      IStrategoTerm n_4372 = null;
                      IStrategoTerm o_4372 = null;
                      IStrategoTerm q_4372 = null;
                      n_4372 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail28499;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail28499;
                      o_4372 = ((IStrategoList)term).tail();
                      q_4372 = o_4372;
                      term = report_failure_0_2.instance.invoke(context, q_4372, generator.const7764, n_4372);
                      if(term == null)
                        break Fail28499;
                    }
                  }
                }
              }
              t_4372 = term;
              r_4372 = generator.const7143;
              u_4372 = t_4372;
              term = string_replace_0_2.instance.invoke(context, u_4372, r_4372, generator.const7765);
              if(term == null)
                break Fail28499;
              term = (IStrategoTerm)termFactory.makeListCons(generator.const7790, termFactory.makeListCons(term, (IStrategoList)generator.constCons5104));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28499;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
              y_4374 = term;
              w_4374 = generator.constCons5075;
              z_4374 = y_4374;
              term = output_text_file_0_2.instance.invoke(context, z_4374, w_4374, generator.const7791);
              if(term == null)
                break Fail28499;
              if(true)
                break Success11268;
            }
          }
          term = term11005;
        }
        IStrategoTerm term11011 = term;
        Success11274:
        { 
          Fail28529:
          { 
            IStrategoTerm v_4372 = null;
            v_4372 = term;
            IStrategoTerm term11012 = term;
            Success11275:
            { 
              Fail28530:
              { 
                term = file_exists_0_0.instance.invoke(context, generator.const7792);
                if(term == null)
                  break Fail28530;
                { 
                  if(true)
                    break Fail28529;
                  if(true)
                    break Success11275;
                }
              }
              term = term11012;
            }
            term = v_4372;
            { 
              IStrategoTerm c_4375 = null;
              IStrategoTerm e_4375 = null;
              IStrategoTerm a_4373 = null;
              IStrategoTerm c_4373 = null;
              IStrategoTerm d_4373 = null;
              IStrategoTerm k_4373 = null;
              IStrategoTerm m_4373 = null;
              IStrategoTerm n_4373 = null;
              IStrategoTerm g_4375 = null;
              IStrategoTerm i_4375 = null;
              IStrategoTerm j_4375 = null;
              e_4375 = term;
              if(w_4370.value == null)
                break Fail28499;
              term = w_4370.value;
              IStrategoTerm term11013 = term;
              Success11276:
              { 
                Fail28531:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail28531;
                  if(true)
                    break Success11276;
                }
                term = term11013;
                IStrategoTerm term11014 = term;
                Success11277:
                { 
                  Fail28532:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail28532;
                    if(true)
                      break Success11277;
                  }
                  term = term11014;
                  IStrategoTerm term11015 = term;
                  Success11278:
                  { 
                    Fail28533:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail28533;
                      if(true)
                        break Success11278;
                    }
                    term = term11015;
                    IStrategoTerm term11016 = term;
                    Success11279:
                    { 
                      Fail28534:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail28534;
                        if(true)
                          break Success11279;
                      }
                      term = term11016;
                      IStrategoTerm w_4372 = null;
                      IStrategoTerm x_4372 = null;
                      IStrategoTerm z_4372 = null;
                      w_4372 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail28499;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail28499;
                      x_4372 = ((IStrategoList)term).tail();
                      z_4372 = x_4372;
                      term = report_failure_0_2.instance.invoke(context, z_4372, generator.const7764, w_4372);
                      if(term == null)
                        break Fail28499;
                    }
                  }
                }
              }
              c_4373 = term;
              a_4373 = generator.const7143;
              d_4373 = c_4373;
              term = string_replace_0_2.instance.invoke(context, d_4373, a_4373, generator.const7765);
              if(term == null)
                break Fail28499;
              c_4375 = term;
              term = e_4375;
              term = get_sdf_main_module_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28499;
              IStrategoTerm term11017 = term;
              Success11280:
              { 
                Fail28535:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail28535;
                  if(true)
                    break Success11280;
                }
                term = term11017;
                IStrategoTerm term11018 = term;
                Success11281:
                { 
                  Fail28536:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail28536;
                    if(true)
                      break Success11281;
                  }
                  term = term11018;
                  IStrategoTerm term11019 = term;
                  Success11282:
                  { 
                    Fail28537:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail28537;
                      if(true)
                        break Success11282;
                    }
                    term = term11019;
                    IStrategoTerm term11020 = term;
                    Success11283:
                    { 
                      Fail28538:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail28538;
                        if(true)
                          break Success11283;
                      }
                      term = term11020;
                      IStrategoTerm g_4373 = null;
                      IStrategoTerm h_4373 = null;
                      IStrategoTerm j_4373 = null;
                      g_4373 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail28499;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail28499;
                      h_4373 = ((IStrategoList)term).tail();
                      j_4373 = h_4373;
                      term = report_failure_0_2.instance.invoke(context, j_4373, generator.const7764, g_4373);
                      if(term == null)
                        break Fail28499;
                    }
                  }
                }
              }
              m_4373 = term;
              k_4373 = generator.const7143;
              n_4373 = m_4373;
              term = string_replace_0_2.instance.invoke(context, n_4373, k_4373, generator.const7634);
              if(term == null)
                break Fail28499;
              term = (IStrategoTerm)termFactory.makeListCons(generator.const7795, termFactory.makeListCons(c_4375, termFactory.makeListCons(generator.const7794, termFactory.makeListCons(term, (IStrategoList)generator.constCons5105))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail28499;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, generator.constNil7));
              i_4375 = term;
              g_4375 = generator.constCons5075;
              j_4375 = i_4375;
              term = output_text_file_0_2.instance.invoke(context, j_4375, g_4375, generator.const7796);
              if(term == null)
                break Fail28499;
              if(true)
                break Success11274;
            }
          }
          term = term11011;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}