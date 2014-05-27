package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class sym_to_template_elem_0_2_fragment_0 extends Strategy 
{ 
  TermReference d_92111;

  TermReference e_92111;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail76431:
    { 
      IStrategoTerm term41551 = term;
      IStrategoConstructor cons1794 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41868:
      { 
        if(cons1794 == Main._consiter_star_1)
        { 
          Fail76432:
          { 
            IStrategoTerm b_92036 = null;
            IStrategoTerm c_92037 = null;
            IStrategoTerm f_92037 = null;
            IStrategoTerm g_92036 = null;
            IStrategoTerm i_92036 = null;
            IStrategoTerm j_92036 = null;
            IStrategoTerm d_92037 = null;
            IStrategoTerm g_92037 = null;
            IStrategoTerm o_92036 = null;
            IStrategoTerm q_92036 = null;
            IStrategoTerm r_92036 = null;
            IStrategoTerm w_92036 = null;
            IStrategoTerm y_92036 = null;
            IStrategoTerm z_92036 = null;
            IStrategoTerm arg25947 = term.getSubterm(0);
            if(arg25947.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg25947).getConstructor())
              break Fail76432;
            b_92036 = arg25947.getSubterm(0);
            f_92037 = term;
            if(d_92111.value == null)
              break Fail76432;
            term = d_92111.value;
            IStrategoTerm term41552 = term;
            Success41869:
            { 
              Fail76433:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail76433;
                if(true)
                  break Success41869;
              }
              term = term41552;
              IStrategoTerm term41553 = term;
              Success41870:
              { 
                Fail76434:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76434;
                  if(true)
                    break Success41870;
                }
                term = term41553;
                IStrategoTerm term41554 = term;
                Success41871:
                { 
                  Fail76435:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76435;
                    if(true)
                      break Success41871;
                  }
                  term = term41554;
                  IStrategoTerm term41555 = term;
                  Success41872:
                  { 
                    Fail76436:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76436;
                      if(true)
                        break Success41872;
                    }
                    term = term41555;
                    IStrategoTerm c_92036 = null;
                    IStrategoTerm d_92036 = null;
                    IStrategoTerm f_92036 = null;
                    c_92036 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail76432;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail76432;
                    d_92036 = ((IStrategoList)term).tail();
                    f_92036 = d_92036;
                    term = report_failure_0_2.instance.invoke(context, f_92036, trans.const15504, c_92036);
                    if(term == null)
                      break Fail76432;
                  }
                }
              }
            }
            i_92036 = term;
            g_92036 = trans.const15453;
            j_92036 = i_92036;
            term = string_replace_0_2.instance.invoke(context, j_92036, g_92036, trans.const15453);
            if(term == null)
              break Fail76432;
            c_92037 = term;
            g_92037 = f_92037;
            term = b_92036;
            IStrategoTerm term41556 = term;
            Success41873:
            { 
              Fail76437:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail76437;
                if(true)
                  break Success41873;
              }
              term = term41556;
              IStrategoTerm term41557 = term;
              Success41874:
              { 
                Fail76438:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76438;
                  if(true)
                    break Success41874;
                }
                term = term41557;
                IStrategoTerm term41558 = term;
                Success41875:
                { 
                  Fail76439:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76439;
                    if(true)
                      break Success41875;
                  }
                  term = term41558;
                  IStrategoTerm term41559 = term;
                  Success41876:
                  { 
                    Fail76440:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76440;
                      if(true)
                        break Success41876;
                    }
                    term = term41559;
                    IStrategoTerm k_92036 = null;
                    IStrategoTerm l_92036 = null;
                    IStrategoTerm n_92036 = null;
                    k_92036 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail76432;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail76432;
                    l_92036 = ((IStrategoList)term).tail();
                    n_92036 = l_92036;
                    term = report_failure_0_2.instance.invoke(context, n_92036, trans.const15504, k_92036);
                    if(term == null)
                      break Fail76432;
                  }
                }
              }
            }
            q_92036 = term;
            o_92036 = trans.const15453;
            r_92036 = q_92036;
            term = string_replace_0_2.instance.invoke(context, r_92036, o_92036, trans.const15473);
            if(term == null)
              break Fail76432;
            d_92037 = term;
            term = g_92037;
            if(e_92111.value == null)
              break Fail76432;
            term = e_92111.value;
            IStrategoTerm term41560 = term;
            Success41877:
            { 
              Fail76441:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail76441;
                if(true)
                  break Success41877;
              }
              term = term41560;
              IStrategoTerm term41561 = term;
              Success41878:
              { 
                Fail76442:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76442;
                  if(true)
                    break Success41878;
                }
                term = term41561;
                IStrategoTerm term41562 = term;
                Success41879:
                { 
                  Fail76443:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76443;
                    if(true)
                      break Success41879;
                  }
                  term = term41562;
                  IStrategoTerm term41563 = term;
                  Success41880:
                  { 
                    Fail76444:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76444;
                      if(true)
                        break Success41880;
                    }
                    term = term41563;
                    IStrategoTerm s_92036 = null;
                    IStrategoTerm t_92036 = null;
                    IStrategoTerm v_92036 = null;
                    s_92036 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail76432;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail76432;
                    t_92036 = ((IStrategoList)term).tail();
                    v_92036 = t_92036;
                    term = report_failure_0_2.instance.invoke(context, v_92036, trans.const15504, s_92036);
                    if(term == null)
                      break Fail76432;
                  }
                }
              }
            }
            y_92036 = term;
            w_92036 = trans.const15453;
            z_92036 = y_92036;
            term = string_replace_0_2.instance.invoke(context, z_92036, w_92036, trans.const15506);
            if(term == null)
              break Fail76432;
            term = (IStrategoTerm)termFactory.makeListCons(c_92037, termFactory.makeListCons(d_92037, termFactory.makeListCons(trans.const15508, termFactory.makeListCons(term, (IStrategoList)trans.constNil11))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail76432;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
            if(true)
              break Success41868;
          }
          term = term41551;
        }
        Success41881:
        { 
          if(cons1794 == Main._consiter_1)
          { 
            Fail76445:
            { 
              IStrategoTerm s_92034 = null;
              IStrategoTerm t_92035 = null;
              IStrategoTerm w_92035 = null;
              IStrategoTerm x_92034 = null;
              IStrategoTerm z_92034 = null;
              IStrategoTerm a_92035 = null;
              IStrategoTerm u_92035 = null;
              IStrategoTerm x_92035 = null;
              IStrategoTerm f_92035 = null;
              IStrategoTerm h_92035 = null;
              IStrategoTerm i_92035 = null;
              IStrategoTerm n_92035 = null;
              IStrategoTerm p_92035 = null;
              IStrategoTerm q_92035 = null;
              IStrategoTerm arg25951 = term.getSubterm(0);
              if(arg25951.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg25951).getConstructor())
                break Fail76445;
              s_92034 = arg25951.getSubterm(0);
              w_92035 = term;
              if(d_92111.value == null)
                break Fail76445;
              term = d_92111.value;
              IStrategoTerm term41565 = term;
              Success41882:
              { 
                Fail76446:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76446;
                  if(true)
                    break Success41882;
                }
                term = term41565;
                IStrategoTerm term41566 = term;
                Success41883:
                { 
                  Fail76447:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76447;
                    if(true)
                      break Success41883;
                  }
                  term = term41566;
                  IStrategoTerm term41567 = term;
                  Success41884:
                  { 
                    Fail76448:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76448;
                      if(true)
                        break Success41884;
                    }
                    term = term41567;
                    IStrategoTerm term41568 = term;
                    Success41885:
                    { 
                      Fail76449:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76449;
                        if(true)
                          break Success41885;
                      }
                      term = term41568;
                      IStrategoTerm t_92034 = null;
                      IStrategoTerm u_92034 = null;
                      IStrategoTerm w_92034 = null;
                      t_92034 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail76445;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail76445;
                      u_92034 = ((IStrategoList)term).tail();
                      w_92034 = u_92034;
                      term = report_failure_0_2.instance.invoke(context, w_92034, trans.const15504, t_92034);
                      if(term == null)
                        break Fail76445;
                    }
                  }
                }
              }
              z_92034 = term;
              x_92034 = trans.const15453;
              a_92035 = z_92034;
              term = string_replace_0_2.instance.invoke(context, a_92035, x_92034, trans.const15453);
              if(term == null)
                break Fail76445;
              t_92035 = term;
              x_92035 = w_92035;
              term = s_92034;
              IStrategoTerm term41569 = term;
              Success41886:
              { 
                Fail76450:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76450;
                  if(true)
                    break Success41886;
                }
                term = term41569;
                IStrategoTerm term41570 = term;
                Success41887:
                { 
                  Fail76451:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76451;
                    if(true)
                      break Success41887;
                  }
                  term = term41570;
                  IStrategoTerm term41571 = term;
                  Success41888:
                  { 
                    Fail76452:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76452;
                      if(true)
                        break Success41888;
                    }
                    term = term41571;
                    IStrategoTerm term41572 = term;
                    Success41889:
                    { 
                      Fail76453:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76453;
                        if(true)
                          break Success41889;
                      }
                      term = term41572;
                      IStrategoTerm b_92035 = null;
                      IStrategoTerm c_92035 = null;
                      IStrategoTerm e_92035 = null;
                      b_92035 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail76445;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail76445;
                      c_92035 = ((IStrategoList)term).tail();
                      e_92035 = c_92035;
                      term = report_failure_0_2.instance.invoke(context, e_92035, trans.const15504, b_92035);
                      if(term == null)
                        break Fail76445;
                    }
                  }
                }
              }
              h_92035 = term;
              f_92035 = trans.const15453;
              i_92035 = h_92035;
              term = string_replace_0_2.instance.invoke(context, i_92035, f_92035, trans.const15473);
              if(term == null)
                break Fail76445;
              u_92035 = term;
              term = x_92035;
              if(e_92111.value == null)
                break Fail76445;
              term = e_92111.value;
              IStrategoTerm term41573 = term;
              Success41890:
              { 
                Fail76454:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76454;
                  if(true)
                    break Success41890;
                }
                term = term41573;
                IStrategoTerm term41574 = term;
                Success41891:
                { 
                  Fail76455:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76455;
                    if(true)
                      break Success41891;
                  }
                  term = term41574;
                  IStrategoTerm term41575 = term;
                  Success41892:
                  { 
                    Fail76456:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76456;
                      if(true)
                        break Success41892;
                    }
                    term = term41575;
                    IStrategoTerm term41576 = term;
                    Success41893:
                    { 
                      Fail76457:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76457;
                        if(true)
                          break Success41893;
                      }
                      term = term41576;
                      IStrategoTerm j_92035 = null;
                      IStrategoTerm k_92035 = null;
                      IStrategoTerm m_92035 = null;
                      j_92035 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail76445;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail76445;
                      k_92035 = ((IStrategoList)term).tail();
                      m_92035 = k_92035;
                      term = report_failure_0_2.instance.invoke(context, m_92035, trans.const15504, j_92035);
                      if(term == null)
                        break Fail76445;
                    }
                  }
                }
              }
              p_92035 = term;
              n_92035 = trans.const15453;
              q_92035 = p_92035;
              term = string_replace_0_2.instance.invoke(context, q_92035, n_92035, trans.const15506);
              if(term == null)
                break Fail76445;
              term = (IStrategoTerm)termFactory.makeListCons(t_92035, termFactory.makeListCons(u_92035, termFactory.makeListCons(trans.const15458, termFactory.makeListCons(term, (IStrategoList)trans.constNil11))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail76445;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
              if(true)
                break Success41881;
            }
            term = term41551;
          }
          Success41894:
          { 
            if(cons1794 == Main._consiter_star_sep_2)
            { 
              Fail76458:
              { 
                IStrategoTerm y_92032 = null;
                IStrategoTerm z_92032 = null;
                IStrategoTerm i_92034 = null;
                IStrategoTerm m_92034 = null;
                IStrategoTerm e_92033 = null;
                IStrategoTerm g_92033 = null;
                IStrategoTerm h_92033 = null;
                IStrategoTerm j_92034 = null;
                IStrategoTerm n_92034 = null;
                IStrategoTerm m_92033 = null;
                IStrategoTerm o_92033 = null;
                IStrategoTerm p_92033 = null;
                IStrategoTerm k_92034 = null;
                IStrategoTerm o_92034 = null;
                IStrategoTerm u_92033 = null;
                IStrategoTerm w_92033 = null;
                IStrategoTerm x_92033 = null;
                IStrategoTerm c_92034 = null;
                IStrategoTerm e_92034 = null;
                IStrategoTerm f_92034 = null;
                IStrategoTerm arg25955 = term.getSubterm(0);
                if(arg25955.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg25955).getConstructor())
                  break Fail76458;
                y_92032 = arg25955.getSubterm(0);
                IStrategoTerm arg25956 = term.getSubterm(1);
                if(arg25956.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg25956).getConstructor())
                  break Fail76458;
                z_92032 = arg25956.getSubterm(0);
                m_92034 = term;
                if(d_92111.value == null)
                  break Fail76458;
                term = d_92111.value;
                IStrategoTerm term41578 = term;
                Success41895:
                { 
                  Fail76459:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76459;
                    if(true)
                      break Success41895;
                  }
                  term = term41578;
                  IStrategoTerm term41579 = term;
                  Success41896:
                  { 
                    Fail76460:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76460;
                      if(true)
                        break Success41896;
                    }
                    term = term41579;
                    IStrategoTerm term41580 = term;
                    Success41897:
                    { 
                      Fail76461:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76461;
                        if(true)
                          break Success41897;
                      }
                      term = term41580;
                      IStrategoTerm term41581 = term;
                      Success41898:
                      { 
                        Fail76462:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76462;
                          if(true)
                            break Success41898;
                        }
                        term = term41581;
                        IStrategoTerm a_92033 = null;
                        IStrategoTerm b_92033 = null;
                        IStrategoTerm d_92033 = null;
                        a_92033 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail76458;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76458;
                        b_92033 = ((IStrategoList)term).tail();
                        d_92033 = b_92033;
                        term = report_failure_0_2.instance.invoke(context, d_92033, trans.const15504, a_92033);
                        if(term == null)
                          break Fail76458;
                      }
                    }
                  }
                }
                g_92033 = term;
                e_92033 = trans.const15453;
                h_92033 = g_92033;
                term = string_replace_0_2.instance.invoke(context, h_92033, e_92033, trans.const15453);
                if(term == null)
                  break Fail76458;
                i_92034 = term;
                n_92034 = m_92034;
                term = y_92032;
                IStrategoTerm term41582 = term;
                Success41899:
                { 
                  Fail76463:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76463;
                    if(true)
                      break Success41899;
                  }
                  term = term41582;
                  IStrategoTerm term41583 = term;
                  Success41900:
                  { 
                    Fail76464:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76464;
                      if(true)
                        break Success41900;
                    }
                    term = term41583;
                    IStrategoTerm term41584 = term;
                    Success41901:
                    { 
                      Fail76465:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76465;
                        if(true)
                          break Success41901;
                      }
                      term = term41584;
                      IStrategoTerm term41585 = term;
                      Success41902:
                      { 
                        Fail76466:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76466;
                          if(true)
                            break Success41902;
                        }
                        term = term41585;
                        IStrategoTerm i_92033 = null;
                        IStrategoTerm j_92033 = null;
                        IStrategoTerm l_92033 = null;
                        i_92033 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail76458;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76458;
                        j_92033 = ((IStrategoList)term).tail();
                        l_92033 = j_92033;
                        term = report_failure_0_2.instance.invoke(context, l_92033, trans.const15504, i_92033);
                        if(term == null)
                          break Fail76458;
                      }
                    }
                  }
                }
                o_92033 = term;
                m_92033 = trans.const15453;
                p_92033 = o_92033;
                term = string_replace_0_2.instance.invoke(context, p_92033, m_92033, trans.const15473);
                if(term == null)
                  break Fail76458;
                j_92034 = term;
                o_92034 = n_92034;
                term = z_92032;
                IStrategoTerm term41586 = term;
                Success41903:
                { 
                  Fail76467:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76467;
                    if(true)
                      break Success41903;
                  }
                  term = term41586;
                  IStrategoTerm term41587 = term;
                  Success41904:
                  { 
                    Fail76468:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76468;
                      if(true)
                        break Success41904;
                    }
                    term = term41587;
                    IStrategoTerm term41588 = term;
                    Success41905:
                    { 
                      Fail76469:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76469;
                        if(true)
                          break Success41905;
                      }
                      term = term41588;
                      IStrategoTerm term41589 = term;
                      Success41906:
                      { 
                        Fail76470:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76470;
                          if(true)
                            break Success41906;
                        }
                        term = term41589;
                        IStrategoTerm q_92033 = null;
                        IStrategoTerm r_92033 = null;
                        IStrategoTerm t_92033 = null;
                        q_92033 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail76458;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76458;
                        r_92033 = ((IStrategoList)term).tail();
                        t_92033 = r_92033;
                        term = report_failure_0_2.instance.invoke(context, t_92033, trans.const15504, q_92033);
                        if(term == null)
                          break Fail76458;
                      }
                    }
                  }
                }
                w_92033 = term;
                u_92033 = trans.const15453;
                x_92033 = w_92033;
                term = string_replace_0_2.instance.invoke(context, x_92033, u_92033, trans.const15474);
                if(term == null)
                  break Fail76458;
                k_92034 = term;
                term = o_92034;
                if(e_92111.value == null)
                  break Fail76458;
                term = e_92111.value;
                IStrategoTerm term41590 = term;
                Success41907:
                { 
                  Fail76471:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76471;
                    if(true)
                      break Success41907;
                  }
                  term = term41590;
                  IStrategoTerm term41591 = term;
                  Success41908:
                  { 
                    Fail76472:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76472;
                      if(true)
                        break Success41908;
                    }
                    term = term41591;
                    IStrategoTerm term41592 = term;
                    Success41909:
                    { 
                      Fail76473:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76473;
                        if(true)
                          break Success41909;
                      }
                      term = term41592;
                      IStrategoTerm term41593 = term;
                      Success41910:
                      { 
                        Fail76474:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76474;
                          if(true)
                            break Success41910;
                        }
                        term = term41593;
                        IStrategoTerm y_92033 = null;
                        IStrategoTerm z_92033 = null;
                        IStrategoTerm b_92034 = null;
                        y_92033 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail76458;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76458;
                        z_92033 = ((IStrategoList)term).tail();
                        b_92034 = z_92033;
                        term = report_failure_0_2.instance.invoke(context, b_92034, trans.const15504, y_92033);
                        if(term == null)
                          break Fail76458;
                      }
                    }
                  }
                }
                e_92034 = term;
                c_92034 = trans.const15453;
                f_92034 = e_92034;
                term = string_replace_0_2.instance.invoke(context, f_92034, c_92034, trans.const15509);
                if(term == null)
                  break Fail76458;
                term = (IStrategoTerm)termFactory.makeListCons(i_92034, termFactory.makeListCons(j_92034, termFactory.makeListCons(trans.const15510, termFactory.makeListCons(k_92034, termFactory.makeListCons(term, (IStrategoList)trans.constNil11)))));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail76458;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
                if(true)
                  break Success41894;
              }
              term = term41551;
            }
            Success41911:
            { 
              if(cons1794 == Main._consiter_sep_2)
              { 
                Fail76475:
                { 
                  IStrategoTerm e_92031 = null;
                  IStrategoTerm f_92031 = null;
                  IStrategoTerm o_92032 = null;
                  IStrategoTerm s_92032 = null;
                  IStrategoTerm k_92031 = null;
                  IStrategoTerm m_92031 = null;
                  IStrategoTerm n_92031 = null;
                  IStrategoTerm p_92032 = null;
                  IStrategoTerm t_92032 = null;
                  IStrategoTerm s_92031 = null;
                  IStrategoTerm u_92031 = null;
                  IStrategoTerm v_92031 = null;
                  IStrategoTerm q_92032 = null;
                  IStrategoTerm u_92032 = null;
                  IStrategoTerm a_92032 = null;
                  IStrategoTerm c_92032 = null;
                  IStrategoTerm d_92032 = null;
                  IStrategoTerm i_92032 = null;
                  IStrategoTerm k_92032 = null;
                  IStrategoTerm l_92032 = null;
                  IStrategoTerm arg25961 = term.getSubterm(0);
                  if(arg25961.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg25961).getConstructor())
                    break Fail76475;
                  e_92031 = arg25961.getSubterm(0);
                  IStrategoTerm arg25962 = term.getSubterm(1);
                  if(arg25962.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg25962).getConstructor())
                    break Fail76475;
                  f_92031 = arg25962.getSubterm(0);
                  s_92032 = term;
                  if(d_92111.value == null)
                    break Fail76475;
                  term = d_92111.value;
                  IStrategoTerm term41595 = term;
                  Success41912:
                  { 
                    Fail76476:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76476;
                      if(true)
                        break Success41912;
                    }
                    term = term41595;
                    IStrategoTerm term41596 = term;
                    Success41913:
                    { 
                      Fail76477:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76477;
                        if(true)
                          break Success41913;
                      }
                      term = term41596;
                      IStrategoTerm term41597 = term;
                      Success41914:
                      { 
                        Fail76478:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76478;
                          if(true)
                            break Success41914;
                        }
                        term = term41597;
                        IStrategoTerm term41598 = term;
                        Success41915:
                        { 
                          Fail76479:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail76479;
                            if(true)
                              break Success41915;
                          }
                          term = term41598;
                          IStrategoTerm g_92031 = null;
                          IStrategoTerm h_92031 = null;
                          IStrategoTerm j_92031 = null;
                          g_92031 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail76475;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail76475;
                          h_92031 = ((IStrategoList)term).tail();
                          j_92031 = h_92031;
                          term = report_failure_0_2.instance.invoke(context, j_92031, trans.const15504, g_92031);
                          if(term == null)
                            break Fail76475;
                        }
                      }
                    }
                  }
                  m_92031 = term;
                  k_92031 = trans.const15453;
                  n_92031 = m_92031;
                  term = string_replace_0_2.instance.invoke(context, n_92031, k_92031, trans.const15453);
                  if(term == null)
                    break Fail76475;
                  o_92032 = term;
                  t_92032 = s_92032;
                  term = e_92031;
                  IStrategoTerm term41599 = term;
                  Success41916:
                  { 
                    Fail76480:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76480;
                      if(true)
                        break Success41916;
                    }
                    term = term41599;
                    IStrategoTerm term41600 = term;
                    Success41917:
                    { 
                      Fail76481:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76481;
                        if(true)
                          break Success41917;
                      }
                      term = term41600;
                      IStrategoTerm term41601 = term;
                      Success41918:
                      { 
                        Fail76482:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76482;
                          if(true)
                            break Success41918;
                        }
                        term = term41601;
                        IStrategoTerm term41602 = term;
                        Success41919:
                        { 
                          Fail76483:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail76483;
                            if(true)
                              break Success41919;
                          }
                          term = term41602;
                          IStrategoTerm o_92031 = null;
                          IStrategoTerm p_92031 = null;
                          IStrategoTerm r_92031 = null;
                          o_92031 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail76475;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail76475;
                          p_92031 = ((IStrategoList)term).tail();
                          r_92031 = p_92031;
                          term = report_failure_0_2.instance.invoke(context, r_92031, trans.const15504, o_92031);
                          if(term == null)
                            break Fail76475;
                        }
                      }
                    }
                  }
                  u_92031 = term;
                  s_92031 = trans.const15453;
                  v_92031 = u_92031;
                  term = string_replace_0_2.instance.invoke(context, v_92031, s_92031, trans.const15473);
                  if(term == null)
                    break Fail76475;
                  p_92032 = term;
                  u_92032 = t_92032;
                  term = f_92031;
                  IStrategoTerm term41603 = term;
                  Success41920:
                  { 
                    Fail76484:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76484;
                      if(true)
                        break Success41920;
                    }
                    term = term41603;
                    IStrategoTerm term41604 = term;
                    Success41921:
                    { 
                      Fail76485:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76485;
                        if(true)
                          break Success41921;
                      }
                      term = term41604;
                      IStrategoTerm term41605 = term;
                      Success41922:
                      { 
                        Fail76486:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76486;
                          if(true)
                            break Success41922;
                        }
                        term = term41605;
                        IStrategoTerm term41606 = term;
                        Success41923:
                        { 
                          Fail76487:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail76487;
                            if(true)
                              break Success41923;
                          }
                          term = term41606;
                          IStrategoTerm w_92031 = null;
                          IStrategoTerm x_92031 = null;
                          IStrategoTerm z_92031 = null;
                          w_92031 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail76475;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail76475;
                          x_92031 = ((IStrategoList)term).tail();
                          z_92031 = x_92031;
                          term = report_failure_0_2.instance.invoke(context, z_92031, trans.const15504, w_92031);
                          if(term == null)
                            break Fail76475;
                        }
                      }
                    }
                  }
                  c_92032 = term;
                  a_92032 = trans.const15453;
                  d_92032 = c_92032;
                  term = string_replace_0_2.instance.invoke(context, d_92032, a_92032, trans.const15474);
                  if(term == null)
                    break Fail76475;
                  q_92032 = term;
                  term = u_92032;
                  if(e_92111.value == null)
                    break Fail76475;
                  term = e_92111.value;
                  IStrategoTerm term41607 = term;
                  Success41924:
                  { 
                    Fail76488:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76488;
                      if(true)
                        break Success41924;
                    }
                    term = term41607;
                    IStrategoTerm term41608 = term;
                    Success41925:
                    { 
                      Fail76489:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76489;
                        if(true)
                          break Success41925;
                      }
                      term = term41608;
                      IStrategoTerm term41609 = term;
                      Success41926:
                      { 
                        Fail76490:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76490;
                          if(true)
                            break Success41926;
                        }
                        term = term41609;
                        IStrategoTerm term41610 = term;
                        Success41927:
                        { 
                          Fail76491:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail76491;
                            if(true)
                              break Success41927;
                          }
                          term = term41610;
                          IStrategoTerm e_92032 = null;
                          IStrategoTerm f_92032 = null;
                          IStrategoTerm h_92032 = null;
                          e_92032 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail76475;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail76475;
                          f_92032 = ((IStrategoList)term).tail();
                          h_92032 = f_92032;
                          term = report_failure_0_2.instance.invoke(context, h_92032, trans.const15504, e_92032);
                          if(term == null)
                            break Fail76475;
                        }
                      }
                    }
                  }
                  k_92032 = term;
                  i_92032 = trans.const15453;
                  l_92032 = k_92032;
                  term = string_replace_0_2.instance.invoke(context, l_92032, i_92032, trans.const15509);
                  if(term == null)
                    break Fail76475;
                  term = (IStrategoTerm)termFactory.makeListCons(o_92032, termFactory.makeListCons(p_92032, termFactory.makeListCons(trans.const15511, termFactory.makeListCons(q_92032, termFactory.makeListCons(term, (IStrategoList)trans.constNil11)))));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76475;
                  term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
                  if(true)
                    break Success41911;
                }
                term = term41551;
              }
              term = debug_1_0.instance.invoke(context, term, lifted21530.instance);
              if(term == null)
                break Fail76431;
              if(true)
                break Fail76431;
            }
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}