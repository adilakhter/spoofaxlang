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

@SuppressWarnings("all") public class context_free_syntax_warning_0_0_fragment_3 extends Strategy 
{ 
  public static context_free_syntax_warning_0_0_fragment_3 instance = new context_free_syntax_warning_0_0_fragment_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_warning_0_0_fragment_3");
    Fail75975:
    { 
      IStrategoTerm term41767 = term;
      Success41691:
      { 
        Fail75976:
        { 
          IStrategoTerm f_92062 = null;
          IStrategoTerm g_92062 = null;
          IStrategoTerm f_92063 = null;
          IStrategoTerm j_92063 = null;
          IStrategoTerm l_92062 = null;
          IStrategoTerm n_92062 = null;
          IStrategoTerm o_92062 = null;
          IStrategoTerm k_92063 = null;
          IStrategoTerm t_92062 = null;
          IStrategoTerm v_92062 = null;
          IStrategoTerm w_92062 = null;
          IStrategoTerm b_92063 = null;
          IStrategoTerm d_92063 = null;
          IStrategoTerm e_92063 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail75976;
          IStrategoTerm arg26056 = ((IStrategoList)term).head();
          if(arg26056.getTermType() != IStrategoTerm.APPL || Main._consiter_star_1 != ((IStrategoAppl)arg26056).getConstructor())
            break Fail75976;
          IStrategoTerm arg26057 = arg26056.getSubterm(0);
          if(arg26057.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26057).getConstructor())
            break Fail75976;
          IStrategoTerm arg26058 = arg26057.getSubterm(0);
          if(arg26058.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26058).getConstructor())
            break Fail75976;
          f_92062 = arg26058.getSubterm(0);
          IStrategoTerm arg26059 = arg26057.getSubterm(1);
          if(arg26059.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26059).isEmpty())
            break Fail75976;
          IStrategoTerm arg26060 = ((IStrategoList)arg26059).head();
          if(arg26060.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26060).getConstructor())
            break Fail75976;
          IStrategoTerm arg26061 = arg26060.getSubterm(0);
          if(arg26061.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26061).getConstructor())
            break Fail75976;
          g_92062 = arg26061.getSubterm(0);
          IStrategoTerm arg26062 = ((IStrategoList)arg26059).tail();
          if(arg26062.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26062).isEmpty())
            break Fail75976;
          IStrategoTerm arg26063 = ((IStrategoList)term).tail();
          if(arg26063.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26063).isEmpty())
            break Fail75976;
          IStrategoTerm arg26064 = ((IStrategoList)arg26063).head();
          if(arg26064.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26064).getConstructor())
            break Fail75976;
          if(arg26064.getSubterm(0) != f_92062 && !f_92062.match(arg26064.getSubterm(0)))
            break Fail75976;
          f_92063 = term;
          term = f_92062;
          IStrategoTerm term41768 = term;
          Success41692:
          { 
            Fail75977:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75977;
              if(true)
                break Success41692;
            }
            term = term41768;
            IStrategoTerm term41769 = term;
            Success41693:
            { 
              Fail75978:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75978;
                if(true)
                  break Success41693;
              }
              term = term41769;
              IStrategoTerm term41770 = term;
              Success41694:
              { 
                Fail75979:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75979;
                  if(true)
                    break Success41694;
                }
                term = term41770;
                IStrategoTerm term41771 = term;
                Success41695:
                { 
                  Fail75980:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75980;
                    if(true)
                      break Success41695;
                  }
                  term = term41771;
                  IStrategoTerm h_92062 = null;
                  IStrategoTerm i_92062 = null;
                  IStrategoTerm k_92062 = null;
                  h_92062 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75976;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75976;
                  i_92062 = ((IStrategoList)term).tail();
                  k_92062 = i_92062;
                  term = report_failure_0_2.instance.invoke(context, k_92062, trans.const15549, h_92062);
                  if(term == null)
                    break Fail75976;
                }
              }
            }
          }
          n_92062 = term;
          l_92062 = trans.const15453;
          o_92062 = n_92062;
          term = string_replace_0_2.instance.invoke(context, o_92062, l_92062, trans.const15539);
          if(term == null)
            break Fail75976;
          j_92063 = term;
          term = g_92062;
          IStrategoTerm term41772 = term;
          Success41696:
          { 
            Fail75981:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75981;
              if(true)
                break Success41696;
            }
            term = term41772;
            IStrategoTerm term41773 = term;
            Success41697:
            { 
              Fail75982:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75982;
                if(true)
                  break Success41697;
              }
              term = term41773;
              IStrategoTerm term41774 = term;
              Success41698:
              { 
                Fail75983:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75983;
                  if(true)
                    break Success41698;
                }
                term = term41774;
                IStrategoTerm term41775 = term;
                Success41699:
                { 
                  Fail75984:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75984;
                    if(true)
                      break Success41699;
                  }
                  term = term41775;
                  IStrategoTerm p_92062 = null;
                  IStrategoTerm q_92062 = null;
                  IStrategoTerm s_92062 = null;
                  p_92062 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75976;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75976;
                  q_92062 = ((IStrategoList)term).tail();
                  s_92062 = q_92062;
                  term = report_failure_0_2.instance.invoke(context, s_92062, trans.const15549, p_92062);
                  if(term == null)
                    break Fail75976;
                }
              }
            }
          }
          v_92062 = term;
          t_92062 = trans.const15453;
          w_92062 = v_92062;
          term = string_replace_0_2.instance.invoke(context, w_92062, t_92062, trans.const15505);
          if(term == null)
            break Fail75976;
          k_92063 = term;
          term = g_92062;
          IStrategoTerm term41776 = term;
          Success41700:
          { 
            Fail75985:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75985;
              if(true)
                break Success41700;
            }
            term = term41776;
            IStrategoTerm term41777 = term;
            Success41701:
            { 
              Fail75986:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75986;
                if(true)
                  break Success41701;
              }
              term = term41777;
              IStrategoTerm term41778 = term;
              Success41702:
              { 
                Fail75987:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75987;
                  if(true)
                    break Success41702;
                }
                term = term41778;
                IStrategoTerm term41779 = term;
                Success41703:
                { 
                  Fail75988:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75988;
                    if(true)
                      break Success41703;
                  }
                  term = term41779;
                  IStrategoTerm x_92062 = null;
                  IStrategoTerm y_92062 = null;
                  IStrategoTerm a_92063 = null;
                  x_92062 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75976;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75976;
                  y_92062 = ((IStrategoList)term).tail();
                  a_92063 = y_92062;
                  term = report_failure_0_2.instance.invoke(context, a_92063, trans.const15549, x_92062);
                  if(term == null)
                    break Fail75976;
                }
              }
            }
          }
          d_92063 = term;
          b_92063 = trans.const15453;
          e_92063 = d_92063;
          term = string_replace_0_2.instance.invoke(context, e_92063, b_92063, trans.const15555);
          if(term == null)
            break Fail75976;
          term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(j_92063, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(k_92063, termFactory.makeListCons(trans.const15557, termFactory.makeListCons(term, (IStrategoList)trans.constCons7215))))));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75976;
          term = termFactory.makeTuple(f_92063, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
          if(true)
            break Success41691;
        }
        term = term41767;
        IStrategoTerm term41780 = term;
        Success41704:
        { 
          Fail75989:
          { 
            IStrategoTerm v_92060 = null;
            IStrategoTerm w_92060 = null;
            IStrategoTerm v_92061 = null;
            IStrategoTerm z_92061 = null;
            IStrategoTerm b_92061 = null;
            IStrategoTerm d_92061 = null;
            IStrategoTerm e_92061 = null;
            IStrategoTerm a_92062 = null;
            IStrategoTerm j_92061 = null;
            IStrategoTerm l_92061 = null;
            IStrategoTerm m_92061 = null;
            IStrategoTerm r_92061 = null;
            IStrategoTerm t_92061 = null;
            IStrategoTerm u_92061 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail75989;
            IStrategoTerm arg26069 = ((IStrategoList)term).head();
            if(arg26069.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26069).getConstructor())
              break Fail75989;
            IStrategoTerm arg26070 = arg26069.getSubterm(0);
            if(arg26070.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26070).getConstructor())
              break Fail75989;
            v_92060 = arg26070.getSubterm(0);
            IStrategoTerm arg26071 = ((IStrategoList)term).tail();
            if(arg26071.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26071).isEmpty())
              break Fail75989;
            IStrategoTerm arg26072 = ((IStrategoList)arg26071).head();
            if(arg26072.getTermType() != IStrategoTerm.APPL || Main._consiter_star_1 != ((IStrategoAppl)arg26072).getConstructor())
              break Fail75989;
            IStrategoTerm arg26073 = arg26072.getSubterm(0);
            if(arg26073.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26073).getConstructor())
              break Fail75989;
            IStrategoTerm arg26074 = arg26073.getSubterm(0);
            if(arg26074.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26074).getConstructor())
              break Fail75989;
            IStrategoTerm arg26075 = arg26074.getSubterm(0);
            if(arg26075.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26075).getConstructor())
              break Fail75989;
            w_92060 = arg26075.getSubterm(0);
            IStrategoTerm arg26076 = arg26073.getSubterm(1);
            if(arg26076.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26076).isEmpty())
              break Fail75989;
            IStrategoTerm arg26077 = ((IStrategoList)arg26076).head();
            if(arg26077.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26077).getConstructor())
              break Fail75989;
            if(arg26077.getSubterm(0) != v_92060 && !v_92060.match(arg26077.getSubterm(0)))
              break Fail75989;
            IStrategoTerm arg26078 = ((IStrategoList)arg26076).tail();
            if(arg26078.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26078).isEmpty())
              break Fail75989;
            v_92061 = term;
            term = v_92060;
            IStrategoTerm term41781 = term;
            Success41705:
            { 
              Fail75990:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75990;
                if(true)
                  break Success41705;
              }
              term = term41781;
              IStrategoTerm term41782 = term;
              Success41706:
              { 
                Fail75991:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75991;
                  if(true)
                    break Success41706;
                }
                term = term41782;
                IStrategoTerm term41783 = term;
                Success41707:
                { 
                  Fail75992:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75992;
                    if(true)
                      break Success41707;
                  }
                  term = term41783;
                  IStrategoTerm term41784 = term;
                  Success41708:
                  { 
                    Fail75993:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75993;
                      if(true)
                        break Success41708;
                    }
                    term = term41784;
                    IStrategoTerm x_92060 = null;
                    IStrategoTerm y_92060 = null;
                    IStrategoTerm a_92061 = null;
                    x_92060 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75989;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75989;
                    y_92060 = ((IStrategoList)term).tail();
                    a_92061 = y_92060;
                    term = report_failure_0_2.instance.invoke(context, a_92061, trans.const15549, x_92060);
                    if(term == null)
                      break Fail75989;
                  }
                }
              }
            }
            d_92061 = term;
            b_92061 = trans.const15453;
            e_92061 = d_92061;
            term = string_replace_0_2.instance.invoke(context, e_92061, b_92061, trans.const15539);
            if(term == null)
              break Fail75989;
            z_92061 = term;
            term = w_92060;
            IStrategoTerm term41785 = term;
            Success41709:
            { 
              Fail75994:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75994;
                if(true)
                  break Success41709;
              }
              term = term41785;
              IStrategoTerm term41786 = term;
              Success41710:
              { 
                Fail75995:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75995;
                  if(true)
                    break Success41710;
                }
                term = term41786;
                IStrategoTerm term41787 = term;
                Success41711:
                { 
                  Fail75996:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75996;
                    if(true)
                      break Success41711;
                  }
                  term = term41787;
                  IStrategoTerm term41788 = term;
                  Success41712:
                  { 
                    Fail75997:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75997;
                      if(true)
                        break Success41712;
                    }
                    term = term41788;
                    IStrategoTerm f_92061 = null;
                    IStrategoTerm g_92061 = null;
                    IStrategoTerm i_92061 = null;
                    f_92061 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75989;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75989;
                    g_92061 = ((IStrategoList)term).tail();
                    i_92061 = g_92061;
                    term = report_failure_0_2.instance.invoke(context, i_92061, trans.const15549, f_92061);
                    if(term == null)
                      break Fail75989;
                  }
                }
              }
            }
            l_92061 = term;
            j_92061 = trans.const15453;
            m_92061 = l_92061;
            term = string_replace_0_2.instance.invoke(context, m_92061, j_92061, trans.const15505);
            if(term == null)
              break Fail75989;
            a_92062 = term;
            term = w_92060;
            IStrategoTerm term41789 = term;
            Success41713:
            { 
              Fail75998:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75998;
                if(true)
                  break Success41713;
              }
              term = term41789;
              IStrategoTerm term41790 = term;
              Success41714:
              { 
                Fail75999:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75999;
                  if(true)
                    break Success41714;
                }
                term = term41790;
                IStrategoTerm term41791 = term;
                Success41715:
                { 
                  Fail76000:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76000;
                    if(true)
                      break Success41715;
                  }
                  term = term41791;
                  IStrategoTerm term41792 = term;
                  Success41716:
                  { 
                    Fail76001:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76001;
                      if(true)
                        break Success41716;
                    }
                    term = term41792;
                    IStrategoTerm n_92061 = null;
                    IStrategoTerm o_92061 = null;
                    IStrategoTerm q_92061 = null;
                    n_92061 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75989;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75989;
                    o_92061 = ((IStrategoList)term).tail();
                    q_92061 = o_92061;
                    term = report_failure_0_2.instance.invoke(context, q_92061, trans.const15549, n_92061);
                    if(term == null)
                      break Fail75989;
                  }
                }
              }
            }
            t_92061 = term;
            r_92061 = trans.const15453;
            u_92061 = t_92061;
            term = string_replace_0_2.instance.invoke(context, u_92061, r_92061, trans.const15555);
            if(term == null)
              break Fail75989;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(z_92061, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(a_92062, termFactory.makeListCons(trans.const15558, termFactory.makeListCons(term, (IStrategoList)trans.constCons7215))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75989;
            term = termFactory.makeTuple(v_92061, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
            if(true)
              break Success41704;
          }
          term = term41780;
          IStrategoTerm term41793 = term;
          Success41717:
          { 
            Fail76002:
            { 
              IStrategoTerm l_92059 = null;
              IStrategoTerm m_92059 = null;
              IStrategoTerm l_92060 = null;
              IStrategoTerm p_92060 = null;
              IStrategoTerm r_92059 = null;
              IStrategoTerm t_92059 = null;
              IStrategoTerm u_92059 = null;
              IStrategoTerm q_92060 = null;
              IStrategoTerm z_92059 = null;
              IStrategoTerm b_92060 = null;
              IStrategoTerm c_92060 = null;
              IStrategoTerm h_92060 = null;
              IStrategoTerm j_92060 = null;
              IStrategoTerm k_92060 = null;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail76002;
              IStrategoTerm arg26083 = ((IStrategoList)term).head();
              if(arg26083.getTermType() != IStrategoTerm.APPL || Main._consiter_star_1 != ((IStrategoAppl)arg26083).getConstructor())
                break Fail76002;
              IStrategoTerm arg26084 = arg26083.getSubterm(0);
              if(arg26084.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26084).getConstructor())
                break Fail76002;
              IStrategoTerm arg26085 = arg26084.getSubterm(0);
              if(arg26085.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26085).getConstructor())
                break Fail76002;
              l_92059 = arg26085.getSubterm(0);
              IStrategoTerm arg26086 = arg26084.getSubterm(1);
              if(arg26086.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26086).isEmpty())
                break Fail76002;
              IStrategoTerm arg26087 = ((IStrategoList)arg26086).head();
              if(arg26087.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26087).getConstructor())
                break Fail76002;
              IStrategoTerm arg26088 = arg26087.getSubterm(0);
              if(arg26088.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26088).getConstructor())
                break Fail76002;
              m_92059 = arg26088.getSubterm(0);
              IStrategoTerm arg26089 = ((IStrategoList)arg26086).tail();
              if(arg26089.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26089).isEmpty())
                break Fail76002;
              IStrategoTerm arg26090 = ((IStrategoList)term).tail();
              if(arg26090.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26090).isEmpty())
                break Fail76002;
              IStrategoTerm arg26091 = ((IStrategoList)arg26090).head();
              if(arg26091.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26091).getConstructor())
                break Fail76002;
              IStrategoTerm arg26092 = arg26091.getSubterm(0);
              if(arg26092.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26092).getConstructor())
                break Fail76002;
              if(arg26092.getSubterm(0) != l_92059 && !l_92059.match(arg26092.getSubterm(0)))
                break Fail76002;
              l_92060 = term;
              term = l_92059;
              IStrategoTerm term41794 = term;
              Success41718:
              { 
                Fail76003:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76003;
                  if(true)
                    break Success41718;
                }
                term = term41794;
                IStrategoTerm term41795 = term;
                Success41719:
                { 
                  Fail76004:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76004;
                    if(true)
                      break Success41719;
                  }
                  term = term41795;
                  IStrategoTerm term41796 = term;
                  Success41720:
                  { 
                    Fail76005:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76005;
                      if(true)
                        break Success41720;
                    }
                    term = term41796;
                    IStrategoTerm term41797 = term;
                    Success41721:
                    { 
                      Fail76006:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76006;
                        if(true)
                          break Success41721;
                      }
                      term = term41797;
                      IStrategoTerm n_92059 = null;
                      IStrategoTerm o_92059 = null;
                      IStrategoTerm q_92059 = null;
                      n_92059 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail76002;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail76002;
                      o_92059 = ((IStrategoList)term).tail();
                      q_92059 = o_92059;
                      term = report_failure_0_2.instance.invoke(context, q_92059, trans.const15549, n_92059);
                      if(term == null)
                        break Fail76002;
                    }
                  }
                }
              }
              t_92059 = term;
              r_92059 = trans.const15453;
              u_92059 = t_92059;
              term = string_replace_0_2.instance.invoke(context, u_92059, r_92059, trans.const15539);
              if(term == null)
                break Fail76002;
              p_92060 = term;
              term = m_92059;
              IStrategoTerm term41798 = term;
              Success41722:
              { 
                Fail76007:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76007;
                  if(true)
                    break Success41722;
                }
                term = term41798;
                IStrategoTerm term41799 = term;
                Success41723:
                { 
                  Fail76008:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76008;
                    if(true)
                      break Success41723;
                  }
                  term = term41799;
                  IStrategoTerm term41800 = term;
                  Success41724:
                  { 
                    Fail76009:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76009;
                      if(true)
                        break Success41724;
                    }
                    term = term41800;
                    IStrategoTerm term41801 = term;
                    Success41725:
                    { 
                      Fail76010:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76010;
                        if(true)
                          break Success41725;
                      }
                      term = term41801;
                      IStrategoTerm v_92059 = null;
                      IStrategoTerm w_92059 = null;
                      IStrategoTerm y_92059 = null;
                      v_92059 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail76002;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail76002;
                      w_92059 = ((IStrategoList)term).tail();
                      y_92059 = w_92059;
                      term = report_failure_0_2.instance.invoke(context, y_92059, trans.const15549, v_92059);
                      if(term == null)
                        break Fail76002;
                    }
                  }
                }
              }
              b_92060 = term;
              z_92059 = trans.const15453;
              c_92060 = b_92060;
              term = string_replace_0_2.instance.invoke(context, c_92060, z_92059, trans.const15505);
              if(term == null)
                break Fail76002;
              q_92060 = term;
              term = m_92059;
              IStrategoTerm term41802 = term;
              Success41726:
              { 
                Fail76011:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail76011;
                  if(true)
                    break Success41726;
                }
                term = term41802;
                IStrategoTerm term41803 = term;
                Success41727:
                { 
                  Fail76012:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76012;
                    if(true)
                      break Success41727;
                  }
                  term = term41803;
                  IStrategoTerm term41804 = term;
                  Success41728:
                  { 
                    Fail76013:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76013;
                      if(true)
                        break Success41728;
                    }
                    term = term41804;
                    IStrategoTerm term41805 = term;
                    Success41729:
                    { 
                      Fail76014:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76014;
                        if(true)
                          break Success41729;
                      }
                      term = term41805;
                      IStrategoTerm d_92060 = null;
                      IStrategoTerm e_92060 = null;
                      IStrategoTerm g_92060 = null;
                      d_92060 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail76002;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail76002;
                      e_92060 = ((IStrategoList)term).tail();
                      g_92060 = e_92060;
                      term = report_failure_0_2.instance.invoke(context, g_92060, trans.const15549, d_92060);
                      if(term == null)
                        break Fail76002;
                    }
                  }
                }
              }
              j_92060 = term;
              h_92060 = trans.const15453;
              k_92060 = j_92060;
              term = string_replace_0_2.instance.invoke(context, k_92060, h_92060, trans.const15555);
              if(term == null)
                break Fail76002;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(p_92060, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(q_92060, termFactory.makeListCons(trans.const15558, termFactory.makeListCons(term, (IStrategoList)trans.constCons7215))))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail76002;
              term = termFactory.makeTuple(l_92060, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
              if(true)
                break Success41717;
            }
            term = term41793;
            IStrategoTerm term41806 = term;
            Success41730:
            { 
              Fail76015:
              { 
                IStrategoTerm b_92058 = null;
                IStrategoTerm c_92058 = null;
                IStrategoTerm d_92058 = null;
                IStrategoTerm e_92058 = null;
                IStrategoTerm f_92059 = null;
                IStrategoTerm j_92058 = null;
                IStrategoTerm l_92058 = null;
                IStrategoTerm m_92058 = null;
                IStrategoTerm g_92059 = null;
                IStrategoTerm r_92058 = null;
                IStrategoTerm t_92058 = null;
                IStrategoTerm u_92058 = null;
                IStrategoTerm z_92058 = null;
                IStrategoTerm b_92059 = null;
                IStrategoTerm c_92059 = null;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consprod_3 != ((IStrategoAppl)term).getConstructor())
                  break Fail76015;
                IStrategoTerm arg26097 = term.getSubterm(0);
                c_92058 = arg26097;
                if(arg26097.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26097).isEmpty())
                  break Fail76015;
                IStrategoTerm arg26098 = ((IStrategoList)arg26097).head();
                if(arg26098.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26098).getConstructor())
                  break Fail76015;
                d_92058 = arg26098.getSubterm(0);
                IStrategoTerm arg26099 = ((IStrategoList)arg26097).tail();
                if(arg26099.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26099).isEmpty())
                  break Fail76015;
                IStrategoTerm arg26100 = ((IStrategoList)arg26099).head();
                if(arg26100.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26100).getConstructor())
                  break Fail76015;
                IStrategoTerm arg26101 = arg26100.getSubterm(0);
                if(arg26101.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26101).getConstructor())
                  break Fail76015;
                IStrategoTerm arg26102 = arg26101.getSubterm(0);
                if(arg26102.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26102).getConstructor())
                  break Fail76015;
                IStrategoTerm arg26103 = arg26102.getSubterm(0);
                if(arg26103.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26103).getConstructor())
                  break Fail76015;
                e_92058 = arg26103.getSubterm(0);
                IStrategoTerm arg26104 = arg26101.getSubterm(1);
                if(arg26104.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26104).isEmpty())
                  break Fail76015;
                IStrategoTerm arg26105 = ((IStrategoList)arg26104).head();
                if(arg26105.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26105).getConstructor())
                  break Fail76015;
                b_92058 = arg26105.getSubterm(0);
                IStrategoTerm arg26106 = ((IStrategoList)arg26104).tail();
                if(arg26106.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26106).isEmpty())
                  break Fail76015;
                IStrategoTerm arg26107 = ((IStrategoList)arg26099).tail();
                if(arg26107.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26107).isEmpty())
                  break Fail76015;
                IStrategoTerm arg26108 = term.getSubterm(1);
                if(arg26108.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26108).getConstructor())
                  break Fail76015;
                if(arg26108.getSubterm(0) != b_92058 && !b_92058.match(arg26108.getSubterm(0)))
                  break Fail76015;
                term = d_92058;
                IStrategoTerm term41807 = term;
                Success41731:
                { 
                  Fail76016:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76016;
                    if(true)
                      break Success41731;
                  }
                  term = term41807;
                  IStrategoTerm term41808 = term;
                  Success41732:
                  { 
                    Fail76017:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76017;
                      if(true)
                        break Success41732;
                    }
                    term = term41808;
                    IStrategoTerm term41809 = term;
                    Success41733:
                    { 
                      Fail76018:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76018;
                        if(true)
                          break Success41733;
                      }
                      term = term41809;
                      IStrategoTerm term41810 = term;
                      Success41734:
                      { 
                        Fail76019:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76019;
                          if(true)
                            break Success41734;
                        }
                        term = term41810;
                        IStrategoTerm f_92058 = null;
                        IStrategoTerm g_92058 = null;
                        IStrategoTerm i_92058 = null;
                        f_92058 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail76015;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76015;
                        g_92058 = ((IStrategoList)term).tail();
                        i_92058 = g_92058;
                        term = report_failure_0_2.instance.invoke(context, i_92058, trans.const15549, f_92058);
                        if(term == null)
                          break Fail76015;
                      }
                    }
                  }
                }
                l_92058 = term;
                j_92058 = trans.const15453;
                m_92058 = l_92058;
                term = string_replace_0_2.instance.invoke(context, m_92058, j_92058, trans.const15539);
                if(term == null)
                  break Fail76015;
                f_92059 = term;
                term = e_92058;
                IStrategoTerm term41811 = term;
                Success41735:
                { 
                  Fail76020:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76020;
                    if(true)
                      break Success41735;
                  }
                  term = term41811;
                  IStrategoTerm term41812 = term;
                  Success41736:
                  { 
                    Fail76021:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76021;
                      if(true)
                        break Success41736;
                    }
                    term = term41812;
                    IStrategoTerm term41813 = term;
                    Success41737:
                    { 
                      Fail76022:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76022;
                        if(true)
                          break Success41737;
                      }
                      term = term41813;
                      IStrategoTerm term41814 = term;
                      Success41738:
                      { 
                        Fail76023:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76023;
                          if(true)
                            break Success41738;
                        }
                        term = term41814;
                        IStrategoTerm n_92058 = null;
                        IStrategoTerm o_92058 = null;
                        IStrategoTerm q_92058 = null;
                        n_92058 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail76015;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76015;
                        o_92058 = ((IStrategoList)term).tail();
                        q_92058 = o_92058;
                        term = report_failure_0_2.instance.invoke(context, q_92058, trans.const15549, n_92058);
                        if(term == null)
                          break Fail76015;
                      }
                    }
                  }
                }
                t_92058 = term;
                r_92058 = trans.const15453;
                u_92058 = t_92058;
                term = string_replace_0_2.instance.invoke(context, u_92058, r_92058, trans.const15505);
                if(term == null)
                  break Fail76015;
                g_92059 = term;
                term = e_92058;
                IStrategoTerm term41815 = term;
                Success41739:
                { 
                  Fail76024:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail76024;
                    if(true)
                      break Success41739;
                  }
                  term = term41815;
                  IStrategoTerm term41816 = term;
                  Success41740:
                  { 
                    Fail76025:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail76025;
                      if(true)
                        break Success41740;
                    }
                    term = term41816;
                    IStrategoTerm term41817 = term;
                    Success41741:
                    { 
                      Fail76026:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76026;
                        if(true)
                          break Success41741;
                      }
                      term = term41817;
                      IStrategoTerm term41818 = term;
                      Success41742:
                      { 
                        Fail76027:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76027;
                          if(true)
                            break Success41742;
                        }
                        term = term41818;
                        IStrategoTerm v_92058 = null;
                        IStrategoTerm w_92058 = null;
                        IStrategoTerm y_92058 = null;
                        v_92058 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail76015;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76015;
                        w_92058 = ((IStrategoList)term).tail();
                        y_92058 = w_92058;
                        term = report_failure_0_2.instance.invoke(context, y_92058, trans.const15549, v_92058);
                        if(term == null)
                          break Fail76015;
                      }
                    }
                  }
                }
                b_92059 = term;
                z_92058 = trans.const15453;
                c_92059 = b_92059;
                term = string_replace_0_2.instance.invoke(context, c_92059, z_92058, trans.const15555);
                if(term == null)
                  break Fail76015;
                term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(f_92059, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(g_92059, termFactory.makeListCons(trans.const15557, termFactory.makeListCons(term, (IStrategoList)trans.constCons7215))))));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail76015;
                term = termFactory.makeTuple(c_92058, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                if(true)
                  break Success41730;
              }
              term = term41806;
              IStrategoTerm term41819 = term;
              Success41743:
              { 
                Fail76028:
                { 
                  IStrategoTerm a_92058 = null;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail76028;
                  a_92058 = ((IStrategoList)term).tail();
                  term = context_free_syntax_warning_0_0.instance.invoke(context, a_92058);
                  if(term == null)
                    break Fail76028;
                  if(true)
                    break Success41743;
                }
                term = term41819;
                IStrategoTerm term41820 = term;
                IStrategoConstructor cons1789 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                Success41744:
                { 
                  if(cons1789 == Main._consiter_star_1)
                  { 
                    Fail76029:
                    { 
                      IStrategoTerm u_92057 = null;
                      IStrategoTerm v_92057 = null;
                      IStrategoTerm w_92057 = null;
                      u_92057 = term.getSubterm(0);
                      v_92057 = term;
                      term = oncetd_1_0.instance.invoke(context, u_92057, lifted21556.instance);
                      if(term == null)
                        break Fail76029;
                      term = v_92057;
                      w_92057 = term;
                      term = concat_strings_0_0.instance.invoke(context, trans.constCons7216);
                      if(term == null)
                        break Fail76029;
                      term = termFactory.makeTuple(w_92057, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                      if(true)
                        break Success41744;
                    }
                    term = term41820;
                  }
                  Success41745:
                  { 
                    if(cons1789 == Main._consiter_1)
                    { 
                      Fail76030:
                      { 
                        IStrategoTerm o_92057 = null;
                        IStrategoTerm p_92057 = null;
                        IStrategoTerm q_92057 = null;
                        o_92057 = term.getSubterm(0);
                        p_92057 = term;
                        term = oncetd_1_0.instance.invoke(context, o_92057, lifted21557.instance);
                        if(term == null)
                          break Fail76030;
                        term = p_92057;
                        q_92057 = term;
                        term = concat_strings_0_0.instance.invoke(context, trans.constCons7216);
                        if(term == null)
                          break Fail76030;
                        term = termFactory.makeTuple(q_92057, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                        if(true)
                          break Success41745;
                      }
                      term = term41820;
                    }
                    Success41746:
                    { 
                      if(cons1789 == Main._consiter_sep_2)
                      { 
                        Fail76031:
                        { 
                          IStrategoTerm n_92057 = null;
                          IStrategoTerm arg26119 = term.getSubterm(1);
                          n_92057 = arg26119;
                          if(arg26119.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26119).getConstructor())
                            break Fail76031;
                          term = termFactory.makeTuple(n_92057, trans.const15560);
                          if(true)
                            break Success41746;
                        }
                        term = term41820;
                      }
                      if(cons1789 == Main._consiter_star_sep_2)
                      { 
                        IStrategoTerm m_92057 = null;
                        IStrategoTerm arg26122 = term.getSubterm(1);
                        m_92057 = arg26122;
                        if(arg26122.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26122).getConstructor())
                          break Fail75975;
                        term = termFactory.makeTuple(m_92057, trans.const15560);
                      }
                      else
                      { 
                        break Fail75975;
                      }
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