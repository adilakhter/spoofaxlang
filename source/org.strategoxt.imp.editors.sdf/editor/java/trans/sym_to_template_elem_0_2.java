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

@SuppressWarnings("all") public class sym_to_template_elem_0_2 extends Strategy 
{ 
  public static sym_to_template_elem_0_2 instance = new sym_to_template_elem_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_92111, IStrategoTerm ref_e_92111)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference d_92111 = new TermReference(ref_d_92111);
    TermReference e_92111 = new TermReference(ref_e_92111);
    context.push("sym_to_template_elem_0_2");
    Fail75777:
    { 
      IStrategoTerm term41524 = term;
      IStrategoConstructor cons1779 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41509:
      { 
        if(cons1779 == Main._conslit_1)
        { 
          Fail75778:
          { 
            IStrategoTerm c_92040 = null;
            c_92040 = term.getSubterm(0);
            term = un_double_quote_0_0.instance.invoke(context, c_92040);
            if(term == null)
              break Fail75778;
            if(true)
              break Success41509;
          }
          term = term41524;
        }
        Success41510:
        { 
          if(cons1779 == Main._conssort_1)
          { 
            Fail75779:
            { 
              IStrategoTerm t_92038 = null;
              IStrategoTerm u_92039 = null;
              IStrategoTerm x_92039 = null;
              IStrategoTerm y_92038 = null;
              IStrategoTerm a_92039 = null;
              IStrategoTerm b_92039 = null;
              IStrategoTerm v_92039 = null;
              IStrategoTerm y_92039 = null;
              IStrategoTerm g_92039 = null;
              IStrategoTerm i_92039 = null;
              IStrategoTerm j_92039 = null;
              IStrategoTerm o_92039 = null;
              IStrategoTerm q_92039 = null;
              IStrategoTerm r_92039 = null;
              t_92038 = term.getSubterm(0);
              x_92039 = term;
              if(d_92111.value == null)
                break Fail75779;
              term = d_92111.value;
              IStrategoTerm term41526 = term;
              Success41511:
              { 
                Fail75780:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75780;
                  if(true)
                    break Success41511;
                }
                term = term41526;
                IStrategoTerm term41527 = term;
                Success41512:
                { 
                  Fail75781:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75781;
                    if(true)
                      break Success41512;
                  }
                  term = term41527;
                  IStrategoTerm term41528 = term;
                  Success41513:
                  { 
                    Fail75782:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75782;
                      if(true)
                        break Success41513;
                    }
                    term = term41528;
                    IStrategoTerm term41529 = term;
                    Success41514:
                    { 
                      Fail75783:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75783;
                        if(true)
                          break Success41514;
                      }
                      term = term41529;
                      IStrategoTerm u_92038 = null;
                      IStrategoTerm v_92038 = null;
                      IStrategoTerm x_92038 = null;
                      u_92038 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75779;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75779;
                      v_92038 = ((IStrategoList)term).tail();
                      x_92038 = v_92038;
                      term = report_failure_0_2.instance.invoke(context, x_92038, trans.const15504, u_92038);
                      if(term == null)
                        break Fail75779;
                    }
                  }
                }
              }
              a_92039 = term;
              y_92038 = trans.const15453;
              b_92039 = a_92039;
              term = string_replace_0_2.instance.invoke(context, b_92039, y_92038, trans.const15453);
              if(term == null)
                break Fail75779;
              u_92039 = term;
              y_92039 = x_92039;
              term = t_92038;
              IStrategoTerm term41530 = term;
              Success41515:
              { 
                Fail75784:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75784;
                  if(true)
                    break Success41515;
                }
                term = term41530;
                IStrategoTerm term41531 = term;
                Success41516:
                { 
                  Fail75785:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75785;
                    if(true)
                      break Success41516;
                  }
                  term = term41531;
                  IStrategoTerm term41532 = term;
                  Success41517:
                  { 
                    Fail75786:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75786;
                      if(true)
                        break Success41517;
                    }
                    term = term41532;
                    IStrategoTerm term41533 = term;
                    Success41518:
                    { 
                      Fail75787:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75787;
                        if(true)
                          break Success41518;
                      }
                      term = term41533;
                      IStrategoTerm c_92039 = null;
                      IStrategoTerm d_92039 = null;
                      IStrategoTerm f_92039 = null;
                      c_92039 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75779;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75779;
                      d_92039 = ((IStrategoList)term).tail();
                      f_92039 = d_92039;
                      term = report_failure_0_2.instance.invoke(context, f_92039, trans.const15504, c_92039);
                      if(term == null)
                        break Fail75779;
                    }
                  }
                }
              }
              i_92039 = term;
              g_92039 = trans.const15453;
              j_92039 = i_92039;
              term = string_replace_0_2.instance.invoke(context, j_92039, g_92039, trans.const15473);
              if(term == null)
                break Fail75779;
              v_92039 = term;
              term = y_92039;
              if(e_92111.value == null)
                break Fail75779;
              term = e_92111.value;
              IStrategoTerm term41534 = term;
              Success41519:
              { 
                Fail75788:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75788;
                  if(true)
                    break Success41519;
                }
                term = term41534;
                IStrategoTerm term41535 = term;
                Success41520:
                { 
                  Fail75789:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75789;
                    if(true)
                      break Success41520;
                  }
                  term = term41535;
                  IStrategoTerm term41536 = term;
                  Success41521:
                  { 
                    Fail75790:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75790;
                      if(true)
                        break Success41521;
                    }
                    term = term41536;
                    IStrategoTerm term41537 = term;
                    Success41522:
                    { 
                      Fail75791:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75791;
                        if(true)
                          break Success41522;
                      }
                      term = term41537;
                      IStrategoTerm k_92039 = null;
                      IStrategoTerm l_92039 = null;
                      IStrategoTerm n_92039 = null;
                      k_92039 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75779;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75779;
                      l_92039 = ((IStrategoList)term).tail();
                      n_92039 = l_92039;
                      term = report_failure_0_2.instance.invoke(context, n_92039, trans.const15504, k_92039);
                      if(term == null)
                        break Fail75779;
                    }
                  }
                }
              }
              q_92039 = term;
              o_92039 = trans.const15453;
              r_92039 = q_92039;
              term = string_replace_0_2.instance.invoke(context, r_92039, o_92039, trans.const15505);
              if(term == null)
                break Fail75779;
              term = (IStrategoTerm)termFactory.makeListCons(u_92039, termFactory.makeListCons(v_92039, termFactory.makeListCons(term, (IStrategoList)trans.constNil11)));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75779;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
              if(true)
                break Success41510;
            }
            term = term41524;
          }
          Success41523:
          { 
            if(cons1779 == Main._consopt_1)
            { 
              Fail75792:
              { 
                IStrategoTerm k_92037 = null;
                IStrategoTerm l_92038 = null;
                IStrategoTerm o_92038 = null;
                IStrategoTerm p_92037 = null;
                IStrategoTerm r_92037 = null;
                IStrategoTerm s_92037 = null;
                IStrategoTerm m_92038 = null;
                IStrategoTerm p_92038 = null;
                IStrategoTerm x_92037 = null;
                IStrategoTerm z_92037 = null;
                IStrategoTerm a_92038 = null;
                IStrategoTerm f_92038 = null;
                IStrategoTerm h_92038 = null;
                IStrategoTerm i_92038 = null;
                IStrategoTerm arg25943 = term.getSubterm(0);
                if(arg25943.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg25943).getConstructor())
                  break Fail75792;
                k_92037 = arg25943.getSubterm(0);
                o_92038 = term;
                if(d_92111.value == null)
                  break Fail75792;
                term = d_92111.value;
                IStrategoTerm term41539 = term;
                Success41524:
                { 
                  Fail75793:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75793;
                    if(true)
                      break Success41524;
                  }
                  term = term41539;
                  IStrategoTerm term41540 = term;
                  Success41525:
                  { 
                    Fail75794:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75794;
                      if(true)
                        break Success41525;
                    }
                    term = term41540;
                    IStrategoTerm term41541 = term;
                    Success41526:
                    { 
                      Fail75795:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75795;
                        if(true)
                          break Success41526;
                      }
                      term = term41541;
                      IStrategoTerm term41542 = term;
                      Success41527:
                      { 
                        Fail75796:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail75796;
                          if(true)
                            break Success41527;
                        }
                        term = term41542;
                        IStrategoTerm l_92037 = null;
                        IStrategoTerm m_92037 = null;
                        IStrategoTerm o_92037 = null;
                        l_92037 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75792;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail75792;
                        m_92037 = ((IStrategoList)term).tail();
                        o_92037 = m_92037;
                        term = report_failure_0_2.instance.invoke(context, o_92037, trans.const15504, l_92037);
                        if(term == null)
                          break Fail75792;
                      }
                    }
                  }
                }
                r_92037 = term;
                p_92037 = trans.const15453;
                s_92037 = r_92037;
                term = string_replace_0_2.instance.invoke(context, s_92037, p_92037, trans.const15453);
                if(term == null)
                  break Fail75792;
                l_92038 = term;
                p_92038 = o_92038;
                term = k_92037;
                IStrategoTerm term41543 = term;
                Success41528:
                { 
                  Fail75797:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75797;
                    if(true)
                      break Success41528;
                  }
                  term = term41543;
                  IStrategoTerm term41544 = term;
                  Success41529:
                  { 
                    Fail75798:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75798;
                      if(true)
                        break Success41529;
                    }
                    term = term41544;
                    IStrategoTerm term41545 = term;
                    Success41530:
                    { 
                      Fail75799:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75799;
                        if(true)
                          break Success41530;
                      }
                      term = term41545;
                      IStrategoTerm term41546 = term;
                      Success41531:
                      { 
                        Fail75800:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail75800;
                          if(true)
                            break Success41531;
                        }
                        term = term41546;
                        IStrategoTerm t_92037 = null;
                        IStrategoTerm u_92037 = null;
                        IStrategoTerm w_92037 = null;
                        t_92037 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75792;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail75792;
                        u_92037 = ((IStrategoList)term).tail();
                        w_92037 = u_92037;
                        term = report_failure_0_2.instance.invoke(context, w_92037, trans.const15504, t_92037);
                        if(term == null)
                          break Fail75792;
                      }
                    }
                  }
                }
                z_92037 = term;
                x_92037 = trans.const15453;
                a_92038 = z_92037;
                term = string_replace_0_2.instance.invoke(context, a_92038, x_92037, trans.const15473);
                if(term == null)
                  break Fail75792;
                m_92038 = term;
                term = p_92038;
                if(e_92111.value == null)
                  break Fail75792;
                term = e_92111.value;
                IStrategoTerm term41547 = term;
                Success41532:
                { 
                  Fail75801:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75801;
                    if(true)
                      break Success41532;
                  }
                  term = term41547;
                  IStrategoTerm term41548 = term;
                  Success41533:
                  { 
                    Fail75802:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75802;
                      if(true)
                        break Success41533;
                    }
                    term = term41548;
                    IStrategoTerm term41549 = term;
                    Success41534:
                    { 
                      Fail75803:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75803;
                        if(true)
                          break Success41534;
                      }
                      term = term41549;
                      IStrategoTerm term41550 = term;
                      Success41535:
                      { 
                        Fail75804:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail75804;
                          if(true)
                            break Success41535;
                        }
                        term = term41550;
                        IStrategoTerm b_92038 = null;
                        IStrategoTerm c_92038 = null;
                        IStrategoTerm e_92038 = null;
                        b_92038 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75792;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail75792;
                        c_92038 = ((IStrategoList)term).tail();
                        e_92038 = c_92038;
                        term = report_failure_0_2.instance.invoke(context, e_92038, trans.const15504, b_92038);
                        if(term == null)
                          break Fail75792;
                      }
                    }
                  }
                }
                h_92038 = term;
                f_92038 = trans.const15453;
                i_92038 = h_92038;
                term = string_replace_0_2.instance.invoke(context, i_92038, f_92038, trans.const15506);
                if(term == null)
                  break Fail75792;
                term = (IStrategoTerm)termFactory.makeListCons(l_92038, termFactory.makeListCons(m_92038, termFactory.makeListCons(trans.const15507, termFactory.makeListCons(term, (IStrategoList)trans.constNil11))));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75792;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
                if(true)
                  break Success41523;
              }
              term = term41524;
            }
            sym_to_template_elem_0_2_fragment_0 sym_to_template_elem_0_2_fragment_00 = new sym_to_template_elem_0_2_fragment_0();
            sym_to_template_elem_0_2_fragment_00.d_92111 = d_92111;
            sym_to_template_elem_0_2_fragment_00.e_92111 = e_92111;
            term = sym_to_template_elem_0_2_fragment_00.invoke(context, term);
            if(term == null)
              break Fail75777;
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}