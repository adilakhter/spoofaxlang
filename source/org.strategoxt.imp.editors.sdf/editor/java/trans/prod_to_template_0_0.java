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

@SuppressWarnings("all") public class prod_to_template_0_0 extends Strategy 
{ 
  public static prod_to_template_0_0 instance = new prod_to_template_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("prod_to_template_0_0");
    Fail75722:
    { 
      IStrategoTerm term41474 = term;
      Success41460:
      { 
        Fail75723:
        { 
          IStrategoTerm p_92026 = null;
          IStrategoTerm q_92026 = null;
          TermReference r_92026 = new TermReference();
          TermReference s_92026 = new TermReference();
          IStrategoTerm t_92026 = null;
          IStrategoTerm u_92026 = null;
          IStrategoTerm h_92029 = null;
          IStrategoTerm j_92029 = null;
          IStrategoTerm m_92029 = null;
          IStrategoTerm u_92029 = null;
          IStrategoTerm z_92026 = null;
          IStrategoTerm b_92027 = null;
          IStrategoTerm c_92027 = null;
          IStrategoTerm n_92029 = null;
          IStrategoTerm v_92029 = null;
          IStrategoTerm h_92027 = null;
          IStrategoTerm j_92027 = null;
          IStrategoTerm k_92027 = null;
          IStrategoTerm o_92029 = null;
          IStrategoTerm w_92029 = null;
          IStrategoTerm p_92027 = null;
          IStrategoTerm r_92027 = null;
          IStrategoTerm s_92027 = null;
          IStrategoTerm p_92029 = null;
          IStrategoTerm x_92029 = null;
          IStrategoTerm x_92027 = null;
          IStrategoTerm z_92027 = null;
          IStrategoTerm a_92028 = null;
          IStrategoTerm q_92029 = null;
          IStrategoTerm y_92029 = null;
          IStrategoTerm f_92028 = null;
          IStrategoTerm h_92028 = null;
          IStrategoTerm i_92028 = null;
          IStrategoTerm r_92029 = null;
          IStrategoTerm z_92029 = null;
          IStrategoTerm n_92028 = null;
          IStrategoTerm p_92028 = null;
          IStrategoTerm q_92028 = null;
          IStrategoTerm s_92029 = null;
          IStrategoTerm v_92028 = null;
          IStrategoTerm x_92028 = null;
          IStrategoTerm y_92028 = null;
          IStrategoTerm d_92029 = null;
          IStrategoTerm f_92029 = null;
          IStrategoTerm g_92029 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consprod_3 != ((IStrategoAppl)term).getConstructor())
            break Fail75723;
          t_92026 = term.getSubterm(0);
          IStrategoTerm arg25912 = term.getSubterm(1);
          if(arg25912.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg25912).getConstructor())
            break Fail75723;
          p_92026 = arg25912.getSubterm(0);
          q_92026 = term.getSubterm(2);
          h_92029 = term;
          term = get_delimiters_0_0.instance.invoke(context, t_92026);
          if(term == null)
            break Fail75723;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail75723;
          if(r_92026.value == null)
            r_92026.value = term.getSubterm(0);
          else
            if(r_92026.value != term.getSubterm(0) && !r_92026.value.match(term.getSubterm(0)))
              break Fail75723;
          if(s_92026.value == null)
            s_92026.value = term.getSubterm(1);
          else
            if(s_92026.value != term.getSubterm(1) && !s_92026.value.match(term.getSubterm(1)))
              break Fail75723;
          term = t_92026;
          lifted21520 lifted215200 = new lifted21520();
          lifted215200.r_92026 = r_92026;
          lifted215200.s_92026 = s_92026;
          term = map_1_0.instance.invoke(context, term, lifted215200);
          if(term == null)
            break Fail75723;
          j_92029 = term;
          term = separate_by_0_1.instance.invoke(context, j_92029, trans.const15471);
          if(term == null)
            break Fail75723;
          u_92026 = term;
          term = h_92029;
          u_92029 = term;
          term = p_92026;
          IStrategoTerm term41475 = term;
          Success41461:
          { 
            Fail75724:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75724;
              if(true)
                break Success41461;
            }
            term = term41475;
            IStrategoTerm term41476 = term;
            Success41462:
            { 
              Fail75725:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75725;
                if(true)
                  break Success41462;
              }
              term = term41476;
              IStrategoTerm term41477 = term;
              Success41463:
              { 
                Fail75726:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75726;
                  if(true)
                    break Success41463;
                }
                term = term41477;
                IStrategoTerm term41478 = term;
                Success41464:
                { 
                  Fail75727:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75727;
                    if(true)
                      break Success41464;
                  }
                  term = term41478;
                  IStrategoTerm v_92026 = null;
                  IStrategoTerm w_92026 = null;
                  IStrategoTerm y_92026 = null;
                  v_92026 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75723;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75723;
                  w_92026 = ((IStrategoList)term).tail();
                  y_92026 = w_92026;
                  term = report_failure_0_2.instance.invoke(context, y_92026, trans.const15472, v_92026);
                  if(term == null)
                    break Fail75723;
                }
              }
            }
          }
          b_92027 = term;
          z_92026 = trans.const15453;
          c_92027 = b_92027;
          term = string_replace_0_2.instance.invoke(context, c_92027, z_92026, trans.const15453);
          if(term == null)
            break Fail75723;
          m_92029 = term;
          v_92029 = u_92029;
          term = pp_cons_0_0.instance.invoke(context, q_92026);
          if(term == null)
            break Fail75723;
          IStrategoTerm term41479 = term;
          Success41465:
          { 
            Fail75728:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75728;
              if(true)
                break Success41465;
            }
            term = term41479;
            IStrategoTerm term41480 = term;
            Success41466:
            { 
              Fail75729:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75729;
                if(true)
                  break Success41466;
              }
              term = term41480;
              IStrategoTerm term41481 = term;
              Success41467:
              { 
                Fail75730:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75730;
                  if(true)
                    break Success41467;
                }
                term = term41481;
                IStrategoTerm term41482 = term;
                Success41468:
                { 
                  Fail75731:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75731;
                    if(true)
                      break Success41468;
                  }
                  term = term41482;
                  IStrategoTerm d_92027 = null;
                  IStrategoTerm e_92027 = null;
                  IStrategoTerm g_92027 = null;
                  d_92027 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75723;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75723;
                  e_92027 = ((IStrategoList)term).tail();
                  g_92027 = e_92027;
                  term = report_failure_0_2.instance.invoke(context, g_92027, trans.const15472, d_92027);
                  if(term == null)
                    break Fail75723;
                }
              }
            }
          }
          j_92027 = term;
          h_92027 = trans.const15453;
          k_92027 = j_92027;
          term = string_replace_0_2.instance.invoke(context, k_92027, h_92027, trans.const15473);
          if(term == null)
            break Fail75723;
          n_92029 = term;
          term = v_92029;
          w_92029 = v_92029;
          if(r_92026.value == null)
            break Fail75723;
          term = r_92026.value;
          IStrategoTerm term41483 = term;
          Success41469:
          { 
            Fail75732:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75732;
              if(true)
                break Success41469;
            }
            term = term41483;
            IStrategoTerm term41484 = term;
            Success41470:
            { 
              Fail75733:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75733;
                if(true)
                  break Success41470;
              }
              term = term41484;
              IStrategoTerm term41485 = term;
              Success41471:
              { 
                Fail75734:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75734;
                  if(true)
                    break Success41471;
                }
                term = term41485;
                IStrategoTerm term41486 = term;
                Success41472:
                { 
                  Fail75735:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75735;
                    if(true)
                      break Success41472;
                  }
                  term = term41486;
                  IStrategoTerm l_92027 = null;
                  IStrategoTerm m_92027 = null;
                  IStrategoTerm o_92027 = null;
                  l_92027 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75723;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75723;
                  m_92027 = ((IStrategoList)term).tail();
                  o_92027 = m_92027;
                  term = report_failure_0_2.instance.invoke(context, o_92027, trans.const15472, l_92027);
                  if(term == null)
                    break Fail75723;
                }
              }
            }
          }
          r_92027 = term;
          p_92027 = trans.const15453;
          s_92027 = r_92027;
          term = string_replace_0_2.instance.invoke(context, s_92027, p_92027, trans.const15474);
          if(term == null)
            break Fail75723;
          o_92029 = term;
          term = w_92029;
          x_92029 = w_92029;
          if(r_92026.value == null)
            break Fail75723;
          term = r_92026.value;
          IStrategoTerm term41487 = term;
          Success41473:
          { 
            Fail75736:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75736;
              if(true)
                break Success41473;
            }
            term = term41487;
            IStrategoTerm term41488 = term;
            Success41474:
            { 
              Fail75737:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75737;
                if(true)
                  break Success41474;
              }
              term = term41488;
              IStrategoTerm term41489 = term;
              Success41475:
              { 
                Fail75738:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75738;
                  if(true)
                    break Success41475;
                }
                term = term41489;
                IStrategoTerm term41490 = term;
                Success41476:
                { 
                  Fail75739:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75739;
                    if(true)
                      break Success41476;
                  }
                  term = term41490;
                  IStrategoTerm t_92027 = null;
                  IStrategoTerm u_92027 = null;
                  IStrategoTerm w_92027 = null;
                  t_92027 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75723;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75723;
                  u_92027 = ((IStrategoList)term).tail();
                  w_92027 = u_92027;
                  term = report_failure_0_2.instance.invoke(context, w_92027, trans.const15472, t_92027);
                  if(term == null)
                    break Fail75723;
                }
              }
            }
          }
          z_92027 = term;
          x_92027 = trans.const15453;
          a_92028 = z_92027;
          term = string_replace_0_2.instance.invoke(context, a_92028, x_92027, trans.const15475);
          if(term == null)
            break Fail75723;
          p_92029 = term;
          y_92029 = x_92029;
          term = u_92026;
          IStrategoTerm term41491 = term;
          Success41477:
          { 
            Fail75740:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75740;
              if(true)
                break Success41477;
            }
            term = term41491;
            IStrategoTerm term41492 = term;
            Success41478:
            { 
              Fail75741:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75741;
                if(true)
                  break Success41478;
              }
              term = term41492;
              IStrategoTerm term41493 = term;
              Success41479:
              { 
                Fail75742:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75742;
                  if(true)
                    break Success41479;
                }
                term = term41493;
                IStrategoTerm term41494 = term;
                Success41480:
                { 
                  Fail75743:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75743;
                    if(true)
                      break Success41480;
                  }
                  term = term41494;
                  IStrategoTerm b_92028 = null;
                  IStrategoTerm c_92028 = null;
                  IStrategoTerm e_92028 = null;
                  b_92028 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75723;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75723;
                  c_92028 = ((IStrategoList)term).tail();
                  e_92028 = c_92028;
                  term = report_failure_0_2.instance.invoke(context, e_92028, trans.const15472, b_92028);
                  if(term == null)
                    break Fail75723;
                }
              }
            }
          }
          h_92028 = term;
          f_92028 = trans.const15453;
          i_92028 = h_92028;
          term = string_replace_0_2.instance.invoke(context, i_92028, f_92028, trans.const15476);
          if(term == null)
            break Fail75723;
          q_92029 = term;
          term = y_92029;
          z_92029 = y_92029;
          if(s_92026.value == null)
            break Fail75723;
          term = s_92026.value;
          IStrategoTerm term41495 = term;
          Success41481:
          { 
            Fail75744:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75744;
              if(true)
                break Success41481;
            }
            term = term41495;
            IStrategoTerm term41496 = term;
            Success41482:
            { 
              Fail75745:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75745;
                if(true)
                  break Success41482;
              }
              term = term41496;
              IStrategoTerm term41497 = term;
              Success41483:
              { 
                Fail75746:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75746;
                  if(true)
                    break Success41483;
                }
                term = term41497;
                IStrategoTerm term41498 = term;
                Success41484:
                { 
                  Fail75747:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75747;
                    if(true)
                      break Success41484;
                  }
                  term = term41498;
                  IStrategoTerm j_92028 = null;
                  IStrategoTerm k_92028 = null;
                  IStrategoTerm m_92028 = null;
                  j_92028 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75723;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75723;
                  k_92028 = ((IStrategoList)term).tail();
                  m_92028 = k_92028;
                  term = report_failure_0_2.instance.invoke(context, m_92028, trans.const15472, j_92028);
                  if(term == null)
                    break Fail75723;
                }
              }
            }
          }
          p_92028 = term;
          n_92028 = trans.const15453;
          q_92028 = p_92028;
          term = string_replace_0_2.instance.invoke(context, q_92028, n_92028, trans.const15477);
          if(term == null)
            break Fail75723;
          r_92029 = term;
          term = z_92029;
          if(s_92026.value == null)
            break Fail75723;
          term = s_92026.value;
          IStrategoTerm term41499 = term;
          Success41485:
          { 
            Fail75748:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75748;
              if(true)
                break Success41485;
            }
            term = term41499;
            IStrategoTerm term41500 = term;
            Success41486:
            { 
              Fail75749:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75749;
                if(true)
                  break Success41486;
              }
              term = term41500;
              IStrategoTerm term41501 = term;
              Success41487:
              { 
                Fail75750:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75750;
                  if(true)
                    break Success41487;
                }
                term = term41501;
                IStrategoTerm term41502 = term;
                Success41488:
                { 
                  Fail75751:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75751;
                    if(true)
                      break Success41488;
                  }
                  term = term41502;
                  IStrategoTerm r_92028 = null;
                  IStrategoTerm s_92028 = null;
                  IStrategoTerm u_92028 = null;
                  r_92028 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75723;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75723;
                  s_92028 = ((IStrategoList)term).tail();
                  u_92028 = s_92028;
                  term = report_failure_0_2.instance.invoke(context, u_92028, trans.const15472, r_92028);
                  if(term == null)
                    break Fail75723;
                }
              }
            }
          }
          x_92028 = term;
          v_92028 = trans.const15453;
          y_92028 = x_92028;
          term = string_replace_0_2.instance.invoke(context, y_92028, v_92028, trans.const15478);
          if(term == null)
            break Fail75723;
          s_92029 = term;
          term = pp_attrs_0_0.instance.invoke(context, q_92026);
          if(term == null)
            break Fail75723;
          IStrategoTerm term41503 = term;
          Success41489:
          { 
            Fail75752:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75752;
              if(true)
                break Success41489;
            }
            term = term41503;
            IStrategoTerm term41504 = term;
            Success41490:
            { 
              Fail75753:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75753;
                if(true)
                  break Success41490;
              }
              term = term41504;
              IStrategoTerm term41505 = term;
              Success41491:
              { 
                Fail75754:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75754;
                  if(true)
                    break Success41491;
                }
                term = term41505;
                IStrategoTerm term41506 = term;
                Success41492:
                { 
                  Fail75755:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75755;
                    if(true)
                      break Success41492;
                  }
                  term = term41506;
                  IStrategoTerm z_92028 = null;
                  IStrategoTerm a_92029 = null;
                  IStrategoTerm c_92029 = null;
                  z_92028 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75723;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75723;
                  a_92029 = ((IStrategoList)term).tail();
                  c_92029 = a_92029;
                  term = report_failure_0_2.instance.invoke(context, c_92029, trans.const15472, z_92028);
                  if(term == null)
                    break Fail75723;
                }
              }
            }
          }
          f_92029 = term;
          d_92029 = trans.const15453;
          g_92029 = f_92029;
          term = string_replace_0_2.instance.invoke(context, g_92029, d_92029, trans.const15479);
          if(term == null)
            break Fail75723;
          term = (IStrategoTerm)termFactory.makeListCons(m_92029, termFactory.makeListCons(n_92029, termFactory.makeListCons(trans.const15480, termFactory.makeListCons(o_92029, termFactory.makeListCons(p_92029, termFactory.makeListCons(q_92029, termFactory.makeListCons(r_92029, termFactory.makeListCons(s_92029, termFactory.makeListCons(term, (IStrategoList)trans.constNil11)))))))));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75723;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
          if(true)
            break Success41460;
        }
        term = debug_1_0.instance.invoke(context, term41474, lifted21521.instance);
        if(term == null)
          break Fail75722;
        if(true)
          break Fail75722;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}