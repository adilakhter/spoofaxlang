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

@SuppressWarnings("all") public class declare_globals_0_0 extends Strategy 
{ 
  public static declare_globals_0_0 instance = new declare_globals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_globals_0_0");
    Fail75825:
    { 
      IStrategoTerm term41629 = term;
      IStrategoConstructor cons1780 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41554:
      { 
        if(cons1780 == Main._consrenamed_module_2)
        { 
          Fail75826:
          { 
            IStrategoTerm j_92047 = null;
            IStrategoTerm k_92047 = null;
            IStrategoTerm arg25971 = term.getSubterm(1);
            if(arg25971.getTermType() != IStrategoTerm.APPL || Main._consrenamings_1 != ((IStrategoAppl)arg25971).getConstructor())
              break Fail75826;
            j_92047 = arg25971.getSubterm(0);
            k_92047 = term;
            term = SRTS_all.instance.invoke(context, j_92047, lifted21532.instance);
            if(term == null)
              break Fail75826;
            term = k_92047;
            if(true)
              break Success41554;
          }
          term = term41629;
        }
        Success41555:
        { 
          if(cons1780 == Main._consunparameterized_1)
          { 
            Fail75827:
            { 
              IStrategoTerm z_92046 = null;
              z_92046 = term.getSubterm(0);
              IStrategoTerm term41631 = term;
              Success41556:
              { 
                Fail75828:
                { 
                  term = open_import_3_0.instance.invoke(context, z_92046, resolve_import_0_0.instance, parse_sdf_file_0_0.instance, lifted21536.instance);
                  if(term == null)
                    break Fail75828;
                  if(true)
                    break Success41556;
                }
                term = term41631;
                IStrategoTerm a_92047 = null;
                IStrategoTerm c_92047 = null;
                IStrategoTerm d_92047 = null;
                IStrategoTerm f_92047 = null;
                IStrategoTerm g_92047 = null;
                IStrategoTerm h_92047 = null;
                a_92047 = term;
                f_92047 = term;
                c_92047 = trans.const15520;
                g_92047 = f_92047;
                d_92047 = trans.constCons7205;
                h_92047 = g_92047;
                term = dr_set_rule_0_3.instance.invoke(context, h_92047, c_92047, d_92047, trans.const15521);
                if(term == null)
                  break Fail75827;
                term = a_92047;
              }
              term = termFactory.makeAppl(Main._consunparameterized_1, new IStrategoTerm[]{z_92046});
              if(true)
                break Success41555;
            }
            term = term41629;
          }
          Success41557:
          { 
            if(cons1780 == Main._consparameterized_2)
            { 
              Fail75829:
              { 
                IStrategoTerm v_92046 = null;
                IStrategoTerm w_92046 = null;
                v_92046 = term.getSubterm(0);
                w_92046 = term.getSubterm(1);
                term = termFactory.makeAppl(Main._consunparameterized_1, new IStrategoTerm[]{v_92046});
                term = this.invoke(context, term);
                if(term == null)
                  break Fail75829;
                term = alltd_1_0.instance.invoke(context, w_92046, declare_simple_global_0_0.instance);
                if(term == null)
                  break Fail75829;
                term = termFactory.makeAppl(Main._consparameterized_2, new IStrategoTerm[]{v_92046, w_92046});
                if(true)
                  break Success41557;
              }
              term = term41629;
            }
            Success41558:
            { 
              if(cons1780 == Main._consprod_3)
              { 
                Fail75830:
                { 
                  IStrategoTerm o_92045 = null;
                  IStrategoTerm p_92045 = null;
                  IStrategoTerm q_92045 = null;
                  IStrategoTerm r_92045 = null;
                  IStrategoTerm s_92045 = null;
                  IStrategoTerm z_92045 = null;
                  IStrategoTerm d_92046 = null;
                  IStrategoTerm q_92046 = null;
                  p_92045 = term;
                  s_92045 = term.getSubterm(0);
                  o_92045 = term.getSubterm(1);
                  z_92045 = term;
                  term = try_1_0.instance.invoke(context, o_92045, lifted21539.instance);
                  if(term == null)
                    break Fail75830;
                  term = repeat_1_0.instance.invoke(context, term, lifted21540.instance);
                  if(term == null)
                    break Fail75830;
                  IStrategoTerm term41635 = term;
                  IStrategoConstructor cons1781 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                  Success41559:
                  { 
                    if(cons1781 == Main._conssort_1)
                    { 
                      Fail75831:
                      { 
                        q_92045 = term.getSubterm(0);
                        if(true)
                          break Success41559;
                      }
                      term = term41635;
                    }
                    if(cons1781 == Main._consparameterized_sort_2)
                    { 
                      q_92045 = term.getSubterm(0);
                    }
                    else
                    { 
                      break Fail75830;
                    }
                  }
                  term = z_92045;
                  d_92046 = z_92045;
                  IStrategoTerm term41636 = term;
                  Success41560:
                  { 
                    Fail75832:
                    { 
                      IStrategoTerm term41637 = term;
                      Success41561:
                      { 
                        Fail75833:
                        { 
                          term = $Declaration_0_0.instance.invoke(context, q_92045);
                          if(term == null)
                            break Fail75833;
                          if(true)
                            break Success41561;
                        }
                        term = term41637;
                        IStrategoTerm t_92045 = null;
                        IStrategoTerm g_92046 = null;
                        IStrategoTerm i_92046 = null;
                        IStrategoTerm j_92046 = null;
                        IStrategoTerm u_92045 = null;
                        IStrategoTerm k_92046 = null;
                        IStrategoTerm m_92046 = null;
                        IStrategoTerm n_92046 = null;
                        term = $Current$File_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75832;
                        r_92045 = term;
                        t_92045 = term;
                        i_92046 = term;
                        g_92046 = trans.const15522;
                        j_92046 = i_92046;
                        term = termFactory.makeTuple(trans.const15523, p_92045);
                        term = dr_set_rule_0_3.instance.invoke(context, j_92046, g_92046, q_92045, term);
                        if(term == null)
                          break Fail75832;
                        term = t_92045;
                        u_92045 = t_92045;
                        m_92046 = term;
                        k_92046 = trans.const15524;
                        n_92046 = m_92046;
                        term = termFactory.makeTuple(trans.const15525, r_92045);
                        term = dr_set_rule_0_3.instance.invoke(context, n_92046, k_92046, q_92045, term);
                        if(term == null)
                          break Fail75832;
                        term = u_92045;
                      }
                      if(true)
                        break Success41560;
                    }
                    term = term41636;
                    IStrategoTerm v_92045 = null;
                    IStrategoTerm w_92045 = null;
                    IStrategoTerm p_92046 = null;
                    v_92045 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75830;
                    w_92045 = term;
                    p_92046 = v_92045;
                    term = report_with_failure_0_2.instance.invoke(context, p_92046, trans.const15526, w_92045);
                    if(term == null)
                      break Fail75830;
                  }
                  term = d_92046;
                  q_92046 = d_92046;
                  IStrategoTerm term41638 = term;
                  Success41562:
                  { 
                    Fail75834:
                    { 
                      term = alltd_1_0.instance.invoke(context, s_92045, declare_use_0_0.instance);
                      if(term == null)
                        break Fail75834;
                      if(true)
                        break Success41562;
                    }
                    term = term41638;
                    IStrategoTerm x_92045 = null;
                    IStrategoTerm y_92045 = null;
                    IStrategoTerm s_92046 = null;
                    x_92045 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75830;
                    y_92045 = term;
                    s_92046 = x_92045;
                    term = report_with_failure_0_2.instance.invoke(context, s_92046, trans.const15526, y_92045);
                    if(term == null)
                      break Fail75830;
                  }
                  term = q_92046;
                  if(true)
                    break Success41558;
                }
                term = term41629;
              }
              Success41563:
              { 
                if(cons1780 == Main._conssorts_1)
                { 
                  Fail75835:
                  { 
                    IStrategoTerm d_92045 = null;
                    d_92045 = term;
                    IStrategoTerm term41640 = term;
                    Success41564:
                    { 
                      Fail75836:
                      { 
                        term = alltd_1_0.instance.invoke(context, term, declare_use_0_0.instance);
                        if(term == null)
                          break Fail75836;
                        if(true)
                          break Success41564;
                      }
                      term = term41640;
                      IStrategoTerm b_92045 = null;
                      IStrategoTerm c_92045 = null;
                      IStrategoTerm f_92045 = null;
                      b_92045 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75835;
                      c_92045 = term;
                      f_92045 = b_92045;
                      term = report_with_failure_0_2.instance.invoke(context, f_92045, trans.const15526, c_92045);
                      if(term == null)
                        break Fail75835;
                    }
                    term = d_92045;
                    if(true)
                      break Success41563;
                  }
                  term = term41629;
                }
                Success41565:
                { 
                  if(cons1780 == Main._conscontext_free_start_symbols_1)
                  { 
                    Fail75837:
                    { 
                      IStrategoTerm u_92044 = null;
                      u_92044 = term;
                      IStrategoTerm term41642 = term;
                      Success41566:
                      { 
                        Fail75838:
                        { 
                          term = alltd_1_0.instance.invoke(context, term, declare_use_0_0.instance);
                          if(term == null)
                            break Fail75838;
                          if(true)
                            break Success41566;
                        }
                        term = term41642;
                        IStrategoTerm s_92044 = null;
                        IStrategoTerm t_92044 = null;
                        IStrategoTerm w_92044 = null;
                        s_92044 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75837;
                        t_92044 = term;
                        w_92044 = s_92044;
                        term = report_with_failure_0_2.instance.invoke(context, w_92044, trans.const15526, t_92044);
                        if(term == null)
                          break Fail75837;
                      }
                      term = u_92044;
                      if(true)
                        break Success41565;
                    }
                    term = term41629;
                  }
                  Success41567:
                  { 
                    if(cons1780 == Main._conslexical_start_symbols_1)
                    { 
                      Fail75839:
                      { 
                        IStrategoTerm l_92044 = null;
                        l_92044 = term;
                        IStrategoTerm term41644 = term;
                        Success41568:
                        { 
                          Fail75840:
                          { 
                            term = alltd_1_0.instance.invoke(context, term, declare_use_0_0.instance);
                            if(term == null)
                              break Fail75840;
                            if(true)
                              break Success41568;
                          }
                          term = term41644;
                          IStrategoTerm j_92044 = null;
                          IStrategoTerm k_92044 = null;
                          IStrategoTerm n_92044 = null;
                          j_92044 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail75839;
                          k_92044 = term;
                          n_92044 = j_92044;
                          term = report_with_failure_0_2.instance.invoke(context, n_92044, trans.const15526, k_92044);
                          if(term == null)
                            break Fail75839;
                        }
                        term = l_92044;
                        if(true)
                          break Success41567;
                      }
                      term = term41629;
                    }
                    if(cons1780 == Main._conskernel_start_symbols_1)
                    { 
                      IStrategoTerm c_92044 = null;
                      c_92044 = term;
                      IStrategoTerm term41645 = term;
                      Success41569:
                      { 
                        Fail75841:
                        { 
                          term = alltd_1_0.instance.invoke(context, term, declare_use_0_0.instance);
                          if(term == null)
                            break Fail75841;
                          if(true)
                            break Success41569;
                        }
                        term = term41645;
                        IStrategoTerm a_92044 = null;
                        IStrategoTerm b_92044 = null;
                        IStrategoTerm e_92044 = null;
                        a_92044 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75825;
                        b_92044 = term;
                        e_92044 = a_92044;
                        term = report_with_failure_0_2.instance.invoke(context, e_92044, trans.const15526, b_92044);
                        if(term == null)
                          break Fail75825;
                      }
                      term = c_92044;
                    }
                    else
                    { 
                      break Fail75825;
                    }
                  }
                }
              }
            }
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