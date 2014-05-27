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

@SuppressWarnings("all") public class analyze_ast_0_0 extends Strategy 
{ 
  public static analyze_ast_0_0 instance = new analyze_ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_ast_0_0");
    Fail75805:
    { 
      IStrategoTerm l_92040 = null;
      IStrategoTerm m_92040 = null;
      IStrategoTerm n_92040 = null;
      IStrategoTerm o_92040 = null;
      IStrategoTerm p_92040 = null;
      IStrategoTerm k_92042 = null;
      IStrategoTerm v_92043 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail75805;
      o_92040 = term.getSubterm(0);
      l_92040 = term.getSubterm(1);
      n_92040 = term.getSubterm(2);
      k_92042 = term;
      IStrategoTerm term41611 = term;
      Success41536:
      { 
        Fail75806:
        { 
          IStrategoTerm n_92042 = null;
          IStrategoTerm u_92040 = null;
          IStrategoTerm w_92040 = null;
          IStrategoTerm x_92040 = null;
          IStrategoTerm c_92041 = null;
          IStrategoTerm e_92041 = null;
          IStrategoTerm f_92041 = null;
          IStrategoTerm g_92041 = null;
          IStrategoTerm h_92041 = null;
          IStrategoTerm t_92042 = null;
          IStrategoTerm m_92041 = null;
          IStrategoTerm o_92041 = null;
          IStrategoTerm p_92041 = null;
          IStrategoTerm u_92041 = null;
          IStrategoTerm w_92041 = null;
          IStrategoTerm x_92041 = null;
          IStrategoTerm x_92042 = null;
          IStrategoTerm y_92042 = null;
          IStrategoTerm a_92043 = null;
          IStrategoTerm b_92043 = null;
          IStrategoTerm c_92043 = null;
          IStrategoTerm z_92041 = null;
          IStrategoTerm a_92042 = null;
          IStrategoTerm d_92043 = null;
          IStrategoTerm e_92043 = null;
          IStrategoTerm g_92043 = null;
          IStrategoTerm h_92043 = null;
          IStrategoTerm i_92043 = null;
          IStrategoTerm c_92042 = null;
          IStrategoTerm j_92043 = null;
          IStrategoTerm l_92043 = null;
          IStrategoTerm m_92043 = null;
          IStrategoTerm d_92042 = null;
          IStrategoTerm e_92042 = null;
          IStrategoTerm n_92043 = null;
          IStrategoTerm o_92043 = null;
          IStrategoTerm q_92043 = null;
          IStrategoTerm r_92043 = null;
          IStrategoTerm s_92043 = null;
          term = n_92040;
          IStrategoTerm term41612 = term;
          Success41537:
          { 
            Fail75807:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75807;
              if(true)
                break Success41537;
            }
            term = term41612;
            IStrategoTerm term41613 = term;
            Success41538:
            { 
              Fail75808:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75808;
                if(true)
                  break Success41538;
              }
              term = term41613;
              IStrategoTerm term41614 = term;
              Success41539:
              { 
                Fail75809:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75809;
                  if(true)
                    break Success41539;
                }
                term = term41614;
                IStrategoTerm term41615 = term;
                Success41540:
                { 
                  Fail75810:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75810;
                    if(true)
                      break Success41540;
                  }
                  term = term41615;
                  IStrategoTerm q_92040 = null;
                  IStrategoTerm r_92040 = null;
                  IStrategoTerm t_92040 = null;
                  q_92040 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75806;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75806;
                  r_92040 = ((IStrategoList)term).tail();
                  t_92040 = r_92040;
                  term = report_failure_0_2.instance.invoke(context, t_92040, trans.const15513, q_92040);
                  if(term == null)
                    break Fail75806;
                }
              }
            }
          }
          w_92040 = term;
          u_92040 = trans.const15453;
          x_92040 = w_92040;
          term = string_replace_0_2.instance.invoke(context, x_92040, u_92040, trans.const15453);
          if(term == null)
            break Fail75806;
          n_92042 = term;
          term = l_92040;
          IStrategoTerm term41616 = term;
          Success41541:
          { 
            Fail75811:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75811;
              if(true)
                break Success41541;
            }
            term = term41616;
            IStrategoTerm term41617 = term;
            Success41542:
            { 
              Fail75812:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75812;
                if(true)
                  break Success41542;
              }
              term = term41617;
              IStrategoTerm term41618 = term;
              Success41543:
              { 
                Fail75813:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75813;
                  if(true)
                    break Success41543;
                }
                term = term41618;
                IStrategoTerm term41619 = term;
                Success41544:
                { 
                  Fail75814:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75814;
                    if(true)
                      break Success41544;
                  }
                  term = term41619;
                  IStrategoTerm y_92040 = null;
                  IStrategoTerm z_92040 = null;
                  IStrategoTerm b_92041 = null;
                  y_92040 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75806;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75806;
                  z_92040 = ((IStrategoList)term).tail();
                  b_92041 = z_92040;
                  term = report_failure_0_2.instance.invoke(context, b_92041, trans.const15513, y_92040);
                  if(term == null)
                    break Fail75806;
                }
              }
            }
          }
          e_92041 = term;
          c_92041 = trans.const15453;
          f_92041 = e_92041;
          term = string_replace_0_2.instance.invoke(context, f_92041, c_92041, trans.const15514);
          if(term == null)
            break Fail75806;
          term = (IStrategoTerm)termFactory.makeListCons(n_92042, termFactory.makeListCons(trans.const15455, termFactory.makeListCons(term, (IStrategoList)trans.constNil11)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75806;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
          m_92040 = term;
          g_92041 = term;
          term = n_92040;
          IStrategoTerm term41620 = term;
          Success41545:
          { 
            Fail75815:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75815;
              if(true)
                break Success41545;
            }
            term = term41620;
            IStrategoTerm term41621 = term;
            Success41546:
            { 
              Fail75816:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75816;
                if(true)
                  break Success41546;
              }
              term = term41621;
              IStrategoTerm term41622 = term;
              Success41547:
              { 
                Fail75817:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75817;
                  if(true)
                    break Success41547;
                }
                term = term41622;
                IStrategoTerm term41623 = term;
                Success41548:
                { 
                  Fail75818:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75818;
                    if(true)
                      break Success41548;
                  }
                  term = term41623;
                  IStrategoTerm i_92041 = null;
                  IStrategoTerm j_92041 = null;
                  IStrategoTerm l_92041 = null;
                  i_92041 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75806;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75806;
                  j_92041 = ((IStrategoList)term).tail();
                  l_92041 = j_92041;
                  term = report_failure_0_2.instance.invoke(context, l_92041, trans.const15513, i_92041);
                  if(term == null)
                    break Fail75806;
                }
              }
            }
          }
          o_92041 = term;
          m_92041 = trans.const15453;
          p_92041 = o_92041;
          term = string_replace_0_2.instance.invoke(context, p_92041, m_92041, trans.const15453);
          if(term == null)
            break Fail75806;
          t_92042 = term;
          term = l_92040;
          IStrategoTerm term41624 = term;
          Success41549:
          { 
            Fail75819:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75819;
              if(true)
                break Success41549;
            }
            term = term41624;
            IStrategoTerm term41625 = term;
            Success41550:
            { 
              Fail75820:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75820;
                if(true)
                  break Success41550;
              }
              term = term41625;
              IStrategoTerm term41626 = term;
              Success41551:
              { 
                Fail75821:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75821;
                  if(true)
                    break Success41551;
                }
                term = term41626;
                IStrategoTerm term41627 = term;
                Success41552:
                { 
                  Fail75822:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75822;
                    if(true)
                      break Success41552;
                  }
                  term = term41627;
                  IStrategoTerm q_92041 = null;
                  IStrategoTerm r_92041 = null;
                  IStrategoTerm t_92041 = null;
                  q_92041 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75806;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75806;
                  r_92041 = ((IStrategoList)term).tail();
                  t_92041 = r_92041;
                  term = report_failure_0_2.instance.invoke(context, t_92041, trans.const15513, q_92041);
                  if(term == null)
                    break Fail75806;
                }
              }
            }
          }
          w_92041 = term;
          u_92041 = trans.const15453;
          x_92041 = w_92041;
          term = string_replace_0_2.instance.invoke(context, x_92041, u_92041, trans.const15514);
          if(term == null)
            break Fail75806;
          term = (IStrategoTerm)termFactory.makeListCons(t_92042, termFactory.makeListCons(trans.const15455, termFactory.makeListCons(term, (IStrategoList)trans.constNil11)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75806;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
          term = dirname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75806;
          h_92041 = term;
          a_92043 = term;
          x_92042 = trans.const15515;
          b_92043 = a_92043;
          y_92042 = trans.constCons7205;
          c_92043 = b_92043;
          term = termFactory.makeTuple(trans.const15516, h_92041);
          term = dr_set_rule_0_3.instance.invoke(context, c_92043, x_92042, y_92042, term);
          if(term == null)
            break Fail75806;
          z_92041 = g_92041;
          term = base_filename_0_0.instance.invoke(context, l_92040);
          if(term == null)
            break Fail75806;
          a_92042 = term;
          g_92043 = term;
          d_92043 = trans.const15448;
          h_92043 = g_92043;
          e_92043 = trans.constCons7205;
          i_92043 = h_92043;
          term = termFactory.makeTuple(trans.const15449, a_92042);
          term = dr_set_rule_0_3.instance.invoke(context, i_92043, d_92043, e_92043, term);
          if(term == null)
            break Fail75806;
          term = z_92041;
          c_92042 = z_92041;
          l_92043 = term;
          j_92043 = trans.const15450;
          m_92043 = l_92043;
          term = termFactory.makeTuple(trans.const15451, m_92040);
          term = dr_set_rule_0_3.instance.invoke(context, m_92043, j_92043, m_92040, term);
          if(term == null)
            break Fail75806;
          d_92042 = c_92042;
          term = n_92040;
          e_92042 = n_92040;
          q_92043 = term;
          n_92043 = trans.const15517;
          r_92043 = q_92043;
          o_92043 = trans.constCons7205;
          s_92043 = r_92043;
          term = termFactory.makeTuple(trans.const15518, e_92042);
          term = dr_set_rule_0_3.instance.invoke(context, s_92043, n_92043, o_92043, term);
          if(term == null)
            break Fail75806;
          term = d_92042;
          if(true)
            break Success41536;
        }
        term = term41611;
        IStrategoTerm g_92042 = null;
        IStrategoTerm h_92042 = null;
        IStrategoTerm u_92043 = null;
        g_92042 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail75805;
        h_92042 = term;
        u_92043 = g_92042;
        term = report_with_failure_0_2.instance.invoke(context, u_92043, trans.const15519, h_92042);
        if(term == null)
          break Fail75805;
      }
      term = k_92042;
      v_92043 = k_92042;
      IStrategoTerm term41628 = term;
      Success41553:
      { 
        Fail75823:
        { 
          term = declare_globals_top_0_0.instance.invoke(context, o_92040);
          if(term == null)
            break Fail75823;
          p_92040 = term;
          if(true)
            break Success41553;
        }
        term = term41628;
        IStrategoTerm i_92042 = null;
        IStrategoTerm j_92042 = null;
        IStrategoTerm x_92043 = null;
        i_92042 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail75805;
        j_92042 = term;
        x_92043 = i_92042;
        term = report_with_failure_0_2.instance.invoke(context, x_92043, trans.const15519, j_92042);
        if(term == null)
          break Fail75805;
      }
      term = v_92043;
      if(p_92040 == null)
        break Fail75805;
      term = p_92040;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}