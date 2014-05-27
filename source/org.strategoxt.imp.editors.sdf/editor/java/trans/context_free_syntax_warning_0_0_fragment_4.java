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

@SuppressWarnings("all") public class context_free_syntax_warning_0_0_fragment_4 extends Strategy 
{ 
  public static context_free_syntax_warning_0_0_fragment_4 instance = new context_free_syntax_warning_0_0_fragment_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_warning_0_0_fragment_4");
    Fail75922:
    { 
      IStrategoTerm term41715 = term;
      Success41639:
      { 
        Fail75923:
        { 
          IStrategoTerm t_92067 = null;
          IStrategoTerm u_92067 = null;
          IStrategoTerm t_92068 = null;
          IStrategoTerm x_92068 = null;
          IStrategoTerm z_92067 = null;
          IStrategoTerm b_92068 = null;
          IStrategoTerm c_92068 = null;
          IStrategoTerm y_92068 = null;
          IStrategoTerm h_92068 = null;
          IStrategoTerm j_92068 = null;
          IStrategoTerm k_92068 = null;
          IStrategoTerm p_92068 = null;
          IStrategoTerm r_92068 = null;
          IStrategoTerm s_92068 = null;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail75923;
          IStrategoTerm arg26002 = ((IStrategoList)term).head();
          if(arg26002.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26002).getConstructor())
            break Fail75923;
          IStrategoTerm arg26003 = arg26002.getSubterm(0);
          if(arg26003.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26003).getConstructor())
            break Fail75923;
          t_92067 = arg26003.getSubterm(0);
          IStrategoTerm arg26004 = ((IStrategoList)term).tail();
          if(arg26004.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26004).isEmpty())
            break Fail75923;
          IStrategoTerm arg26005 = ((IStrategoList)arg26004).head();
          if(arg26005.getTermType() != IStrategoTerm.APPL || Main._consiter_star_1 != ((IStrategoAppl)arg26005).getConstructor())
            break Fail75923;
          IStrategoTerm arg26006 = arg26005.getSubterm(0);
          if(arg26006.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26006).getConstructor())
            break Fail75923;
          IStrategoTerm arg26007 = arg26006.getSubterm(0);
          if(arg26007.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26007).getConstructor())
            break Fail75923;
          u_92067 = arg26007.getSubterm(0);
          IStrategoTerm arg26008 = arg26006.getSubterm(1);
          if(arg26008.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26008).isEmpty())
            break Fail75923;
          IStrategoTerm arg26009 = ((IStrategoList)arg26008).head();
          if(arg26009.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26009).getConstructor())
            break Fail75923;
          if(arg26009.getSubterm(0) != t_92067 && !t_92067.match(arg26009.getSubterm(0)))
            break Fail75923;
          IStrategoTerm arg26010 = ((IStrategoList)arg26008).tail();
          if(arg26010.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26010).isEmpty())
            break Fail75923;
          t_92068 = term;
          term = t_92067;
          IStrategoTerm term41716 = term;
          Success41640:
          { 
            Fail75924:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75924;
              if(true)
                break Success41640;
            }
            term = term41716;
            IStrategoTerm term41717 = term;
            Success41641:
            { 
              Fail75925:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75925;
                if(true)
                  break Success41641;
              }
              term = term41717;
              IStrategoTerm term41718 = term;
              Success41642:
              { 
                Fail75926:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75926;
                  if(true)
                    break Success41642;
                }
                term = term41718;
                IStrategoTerm term41719 = term;
                Success41643:
                { 
                  Fail75927:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75927;
                    if(true)
                      break Success41643;
                  }
                  term = term41719;
                  IStrategoTerm v_92067 = null;
                  IStrategoTerm w_92067 = null;
                  IStrategoTerm y_92067 = null;
                  v_92067 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75923;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75923;
                  w_92067 = ((IStrategoList)term).tail();
                  y_92067 = w_92067;
                  term = report_failure_0_2.instance.invoke(context, y_92067, trans.const15549, v_92067);
                  if(term == null)
                    break Fail75923;
                }
              }
            }
          }
          b_92068 = term;
          z_92067 = trans.const15453;
          c_92068 = b_92068;
          term = string_replace_0_2.instance.invoke(context, c_92068, z_92067, trans.const15539);
          if(term == null)
            break Fail75923;
          x_92068 = term;
          term = u_92067;
          IStrategoTerm term41720 = term;
          Success41644:
          { 
            Fail75928:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75928;
              if(true)
                break Success41644;
            }
            term = term41720;
            IStrategoTerm term41721 = term;
            Success41645:
            { 
              Fail75929:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75929;
                if(true)
                  break Success41645;
              }
              term = term41721;
              IStrategoTerm term41722 = term;
              Success41646:
              { 
                Fail75930:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75930;
                  if(true)
                    break Success41646;
                }
                term = term41722;
                IStrategoTerm term41723 = term;
                Success41647:
                { 
                  Fail75931:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75931;
                    if(true)
                      break Success41647;
                  }
                  term = term41723;
                  IStrategoTerm d_92068 = null;
                  IStrategoTerm e_92068 = null;
                  IStrategoTerm g_92068 = null;
                  d_92068 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75923;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75923;
                  e_92068 = ((IStrategoList)term).tail();
                  g_92068 = e_92068;
                  term = report_failure_0_2.instance.invoke(context, g_92068, trans.const15549, d_92068);
                  if(term == null)
                    break Fail75923;
                }
              }
            }
          }
          j_92068 = term;
          h_92068 = trans.const15453;
          k_92068 = j_92068;
          term = string_replace_0_2.instance.invoke(context, k_92068, h_92068, trans.const15505);
          if(term == null)
            break Fail75923;
          y_92068 = term;
          term = u_92067;
          IStrategoTerm term41724 = term;
          Success41648:
          { 
            Fail75932:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75932;
              if(true)
                break Success41648;
            }
            term = term41724;
            IStrategoTerm term41725 = term;
            Success41649:
            { 
              Fail75933:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75933;
                if(true)
                  break Success41649;
              }
              term = term41725;
              IStrategoTerm term41726 = term;
              Success41650:
              { 
                Fail75934:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75934;
                  if(true)
                    break Success41650;
                }
                term = term41726;
                IStrategoTerm term41727 = term;
                Success41651:
                { 
                  Fail75935:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75935;
                    if(true)
                      break Success41651;
                  }
                  term = term41727;
                  IStrategoTerm l_92068 = null;
                  IStrategoTerm m_92068 = null;
                  IStrategoTerm o_92068 = null;
                  l_92068 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75923;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75923;
                  m_92068 = ((IStrategoList)term).tail();
                  o_92068 = m_92068;
                  term = report_failure_0_2.instance.invoke(context, o_92068, trans.const15549, l_92068);
                  if(term == null)
                    break Fail75923;
                }
              }
            }
          }
          r_92068 = term;
          p_92068 = trans.const15453;
          s_92068 = r_92068;
          term = string_replace_0_2.instance.invoke(context, s_92068, p_92068, trans.const15550);
          if(term == null)
            break Fail75923;
          term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(x_92068, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(y_92068, termFactory.makeListCons(trans.const15552, termFactory.makeListCons(term, (IStrategoList)trans.constCons7214))))));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75923;
          term = termFactory.makeTuple(t_92068, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
          if(true)
            break Success41639;
        }
        term = term41715;
        IStrategoTerm term41728 = term;
        Success41652:
        { 
          Fail75936:
          { 
            IStrategoTerm j_92066 = null;
            IStrategoTerm k_92066 = null;
            IStrategoTerm j_92067 = null;
            IStrategoTerm n_92067 = null;
            IStrategoTerm p_92066 = null;
            IStrategoTerm r_92066 = null;
            IStrategoTerm s_92066 = null;
            IStrategoTerm o_92067 = null;
            IStrategoTerm x_92066 = null;
            IStrategoTerm z_92066 = null;
            IStrategoTerm a_92067 = null;
            IStrategoTerm f_92067 = null;
            IStrategoTerm h_92067 = null;
            IStrategoTerm i_92067 = null;
            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
              break Fail75936;
            IStrategoTerm arg26015 = ((IStrategoList)term).head();
            if(arg26015.getTermType() != IStrategoTerm.APPL || Main._consiter_star_1 != ((IStrategoAppl)arg26015).getConstructor())
              break Fail75936;
            IStrategoTerm arg26016 = arg26015.getSubterm(0);
            if(arg26016.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26016).getConstructor())
              break Fail75936;
            IStrategoTerm arg26017 = arg26016.getSubterm(0);
            if(arg26017.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26017).getConstructor())
              break Fail75936;
            j_92066 = arg26017.getSubterm(0);
            IStrategoTerm arg26018 = arg26016.getSubterm(1);
            if(arg26018.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26018).isEmpty())
              break Fail75936;
            IStrategoTerm arg26019 = ((IStrategoList)arg26018).head();
            if(arg26019.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26019).getConstructor())
              break Fail75936;
            k_92066 = arg26019.getSubterm(0);
            IStrategoTerm arg26020 = ((IStrategoList)arg26018).tail();
            if(arg26020.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26020).isEmpty())
              break Fail75936;
            IStrategoTerm arg26021 = ((IStrategoList)term).tail();
            if(arg26021.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26021).isEmpty())
              break Fail75936;
            IStrategoTerm arg26022 = ((IStrategoList)arg26021).head();
            if(arg26022.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26022).getConstructor())
              break Fail75936;
            IStrategoTerm arg26023 = arg26022.getSubterm(0);
            if(arg26023.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26023).getConstructor())
              break Fail75936;
            if(arg26023.getSubterm(0) != j_92066 && !j_92066.match(arg26023.getSubterm(0)))
              break Fail75936;
            j_92067 = term;
            term = j_92066;
            IStrategoTerm term41729 = term;
            Success41653:
            { 
              Fail75937:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75937;
                if(true)
                  break Success41653;
              }
              term = term41729;
              IStrategoTerm term41730 = term;
              Success41654:
              { 
                Fail75938:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75938;
                  if(true)
                    break Success41654;
                }
                term = term41730;
                IStrategoTerm term41731 = term;
                Success41655:
                { 
                  Fail75939:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75939;
                    if(true)
                      break Success41655;
                  }
                  term = term41731;
                  IStrategoTerm term41732 = term;
                  Success41656:
                  { 
                    Fail75940:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75940;
                      if(true)
                        break Success41656;
                    }
                    term = term41732;
                    IStrategoTerm l_92066 = null;
                    IStrategoTerm m_92066 = null;
                    IStrategoTerm o_92066 = null;
                    l_92066 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75936;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75936;
                    m_92066 = ((IStrategoList)term).tail();
                    o_92066 = m_92066;
                    term = report_failure_0_2.instance.invoke(context, o_92066, trans.const15549, l_92066);
                    if(term == null)
                      break Fail75936;
                  }
                }
              }
            }
            r_92066 = term;
            p_92066 = trans.const15453;
            s_92066 = r_92066;
            term = string_replace_0_2.instance.invoke(context, s_92066, p_92066, trans.const15539);
            if(term == null)
              break Fail75936;
            n_92067 = term;
            term = k_92066;
            IStrategoTerm term41733 = term;
            Success41657:
            { 
              Fail75941:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75941;
                if(true)
                  break Success41657;
              }
              term = term41733;
              IStrategoTerm term41734 = term;
              Success41658:
              { 
                Fail75942:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75942;
                  if(true)
                    break Success41658;
                }
                term = term41734;
                IStrategoTerm term41735 = term;
                Success41659:
                { 
                  Fail75943:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75943;
                    if(true)
                      break Success41659;
                  }
                  term = term41735;
                  IStrategoTerm term41736 = term;
                  Success41660:
                  { 
                    Fail75944:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75944;
                      if(true)
                        break Success41660;
                    }
                    term = term41736;
                    IStrategoTerm t_92066 = null;
                    IStrategoTerm u_92066 = null;
                    IStrategoTerm w_92066 = null;
                    t_92066 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75936;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75936;
                    u_92066 = ((IStrategoList)term).tail();
                    w_92066 = u_92066;
                    term = report_failure_0_2.instance.invoke(context, w_92066, trans.const15549, t_92066);
                    if(term == null)
                      break Fail75936;
                  }
                }
              }
            }
            z_92066 = term;
            x_92066 = trans.const15453;
            a_92067 = z_92066;
            term = string_replace_0_2.instance.invoke(context, a_92067, x_92066, trans.const15505);
            if(term == null)
              break Fail75936;
            o_92067 = term;
            term = k_92066;
            IStrategoTerm term41737 = term;
            Success41661:
            { 
              Fail75945:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75945;
                if(true)
                  break Success41661;
              }
              term = term41737;
              IStrategoTerm term41738 = term;
              Success41662:
              { 
                Fail75946:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75946;
                  if(true)
                    break Success41662;
                }
                term = term41738;
                IStrategoTerm term41739 = term;
                Success41663:
                { 
                  Fail75947:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75947;
                    if(true)
                      break Success41663;
                  }
                  term = term41739;
                  IStrategoTerm term41740 = term;
                  Success41664:
                  { 
                    Fail75948:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75948;
                      if(true)
                        break Success41664;
                    }
                    term = term41740;
                    IStrategoTerm b_92067 = null;
                    IStrategoTerm c_92067 = null;
                    IStrategoTerm e_92067 = null;
                    b_92067 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75936;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75936;
                    c_92067 = ((IStrategoList)term).tail();
                    e_92067 = c_92067;
                    term = report_failure_0_2.instance.invoke(context, e_92067, trans.const15549, b_92067);
                    if(term == null)
                      break Fail75936;
                  }
                }
              }
            }
            h_92067 = term;
            f_92067 = trans.const15453;
            i_92067 = h_92067;
            term = string_replace_0_2.instance.invoke(context, i_92067, f_92067, trans.const15550);
            if(term == null)
              break Fail75936;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(n_92067, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(o_92067, termFactory.makeListCons(trans.const15552, termFactory.makeListCons(term, (IStrategoList)trans.constCons7214))))));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75936;
            term = termFactory.makeTuple(j_92067, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
            if(true)
              break Success41652;
          }
          term = term41728;
          IStrategoTerm term41741 = term;
          Success41665:
          { 
            Fail75949:
            { 
              IStrategoTerm z_92064 = null;
              IStrategoTerm a_92065 = null;
              IStrategoTerm b_92065 = null;
              IStrategoTerm c_92065 = null;
              IStrategoTerm d_92066 = null;
              IStrategoTerm h_92065 = null;
              IStrategoTerm j_92065 = null;
              IStrategoTerm k_92065 = null;
              IStrategoTerm e_92066 = null;
              IStrategoTerm p_92065 = null;
              IStrategoTerm r_92065 = null;
              IStrategoTerm s_92065 = null;
              IStrategoTerm x_92065 = null;
              IStrategoTerm z_92065 = null;
              IStrategoTerm a_92066 = null;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consprod_3 != ((IStrategoAppl)term).getConstructor())
                break Fail75949;
              IStrategoTerm arg26028 = term.getSubterm(0);
              a_92065 = arg26028;
              if(arg26028.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26028).isEmpty())
                break Fail75949;
              IStrategoTerm arg26029 = ((IStrategoList)arg26028).head();
              if(arg26029.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26029).getConstructor())
                break Fail75949;
              b_92065 = arg26029.getSubterm(0);
              IStrategoTerm arg26030 = ((IStrategoList)arg26028).tail();
              if(arg26030.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26030).isEmpty())
                break Fail75949;
              IStrategoTerm arg26031 = ((IStrategoList)arg26030).head();
              if(arg26031.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26031).getConstructor())
                break Fail75949;
              IStrategoTerm arg26032 = arg26031.getSubterm(0);
              if(arg26032.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26032).getConstructor())
                break Fail75949;
              IStrategoTerm arg26033 = arg26032.getSubterm(0);
              if(arg26033.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26033).getConstructor())
                break Fail75949;
              c_92065 = arg26033.getSubterm(0);
              IStrategoTerm arg26034 = arg26032.getSubterm(1);
              if(arg26034.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26034).isEmpty())
                break Fail75949;
              IStrategoTerm arg26035 = ((IStrategoList)arg26034).head();
              if(arg26035.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26035).getConstructor())
                break Fail75949;
              z_92064 = arg26035.getSubterm(0);
              IStrategoTerm arg26036 = ((IStrategoList)arg26034).tail();
              if(arg26036.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26036).isEmpty())
                break Fail75949;
              IStrategoTerm arg26037 = ((IStrategoList)arg26030).tail();
              if(arg26037.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26037).isEmpty())
                break Fail75949;
              IStrategoTerm arg26038 = term.getSubterm(1);
              if(arg26038.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26038).getConstructor())
                break Fail75949;
              if(arg26038.getSubterm(0) != z_92064 && !z_92064.match(arg26038.getSubterm(0)))
                break Fail75949;
              term = b_92065;
              IStrategoTerm term41742 = term;
              Success41666:
              { 
                Fail75950:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75950;
                  if(true)
                    break Success41666;
                }
                term = term41742;
                IStrategoTerm term41743 = term;
                Success41667:
                { 
                  Fail75951:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75951;
                    if(true)
                      break Success41667;
                  }
                  term = term41743;
                  IStrategoTerm term41744 = term;
                  Success41668:
                  { 
                    Fail75952:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75952;
                      if(true)
                        break Success41668;
                    }
                    term = term41744;
                    IStrategoTerm term41745 = term;
                    Success41669:
                    { 
                      Fail75953:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75953;
                        if(true)
                          break Success41669;
                      }
                      term = term41745;
                      IStrategoTerm d_92065 = null;
                      IStrategoTerm e_92065 = null;
                      IStrategoTerm g_92065 = null;
                      d_92065 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75949;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75949;
                      e_92065 = ((IStrategoList)term).tail();
                      g_92065 = e_92065;
                      term = report_failure_0_2.instance.invoke(context, g_92065, trans.const15549, d_92065);
                      if(term == null)
                        break Fail75949;
                    }
                  }
                }
              }
              j_92065 = term;
              h_92065 = trans.const15453;
              k_92065 = j_92065;
              term = string_replace_0_2.instance.invoke(context, k_92065, h_92065, trans.const15539);
              if(term == null)
                break Fail75949;
              d_92066 = term;
              term = c_92065;
              IStrategoTerm term41746 = term;
              Success41670:
              { 
                Fail75954:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75954;
                  if(true)
                    break Success41670;
                }
                term = term41746;
                IStrategoTerm term41747 = term;
                Success41671:
                { 
                  Fail75955:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75955;
                    if(true)
                      break Success41671;
                  }
                  term = term41747;
                  IStrategoTerm term41748 = term;
                  Success41672:
                  { 
                    Fail75956:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75956;
                      if(true)
                        break Success41672;
                    }
                    term = term41748;
                    IStrategoTerm term41749 = term;
                    Success41673:
                    { 
                      Fail75957:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75957;
                        if(true)
                          break Success41673;
                      }
                      term = term41749;
                      IStrategoTerm l_92065 = null;
                      IStrategoTerm m_92065 = null;
                      IStrategoTerm o_92065 = null;
                      l_92065 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75949;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75949;
                      m_92065 = ((IStrategoList)term).tail();
                      o_92065 = m_92065;
                      term = report_failure_0_2.instance.invoke(context, o_92065, trans.const15549, l_92065);
                      if(term == null)
                        break Fail75949;
                    }
                  }
                }
              }
              r_92065 = term;
              p_92065 = trans.const15453;
              s_92065 = r_92065;
              term = string_replace_0_2.instance.invoke(context, s_92065, p_92065, trans.const15505);
              if(term == null)
                break Fail75949;
              e_92066 = term;
              term = c_92065;
              IStrategoTerm term41750 = term;
              Success41674:
              { 
                Fail75958:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75958;
                  if(true)
                    break Success41674;
                }
                term = term41750;
                IStrategoTerm term41751 = term;
                Success41675:
                { 
                  Fail75959:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75959;
                    if(true)
                      break Success41675;
                  }
                  term = term41751;
                  IStrategoTerm term41752 = term;
                  Success41676:
                  { 
                    Fail75960:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75960;
                      if(true)
                        break Success41676;
                    }
                    term = term41752;
                    IStrategoTerm term41753 = term;
                    Success41677:
                    { 
                      Fail75961:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75961;
                        if(true)
                          break Success41677;
                      }
                      term = term41753;
                      IStrategoTerm t_92065 = null;
                      IStrategoTerm u_92065 = null;
                      IStrategoTerm w_92065 = null;
                      t_92065 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75949;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75949;
                      u_92065 = ((IStrategoList)term).tail();
                      w_92065 = u_92065;
                      term = report_failure_0_2.instance.invoke(context, w_92065, trans.const15549, t_92065);
                      if(term == null)
                        break Fail75949;
                    }
                  }
                }
              }
              z_92065 = term;
              x_92065 = trans.const15453;
              a_92066 = z_92065;
              term = string_replace_0_2.instance.invoke(context, a_92066, x_92065, trans.const15550);
              if(term == null)
                break Fail75949;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(d_92066, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(e_92066, termFactory.makeListCons(trans.const15554, termFactory.makeListCons(term, (IStrategoList)trans.constCons7214))))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75949;
              term = termFactory.makeTuple(a_92065, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
              if(true)
                break Success41665;
            }
            term = term41741;
            IStrategoTerm term41754 = term;
            Success41678:
            { 
              Fail75962:
              { 
                IStrategoTerm p_92063 = null;
                IStrategoTerm q_92063 = null;
                IStrategoTerm p_92064 = null;
                IStrategoTerm t_92064 = null;
                IStrategoTerm v_92063 = null;
                IStrategoTerm x_92063 = null;
                IStrategoTerm y_92063 = null;
                IStrategoTerm u_92064 = null;
                IStrategoTerm d_92064 = null;
                IStrategoTerm f_92064 = null;
                IStrategoTerm g_92064 = null;
                IStrategoTerm l_92064 = null;
                IStrategoTerm n_92064 = null;
                IStrategoTerm o_92064 = null;
                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                  break Fail75962;
                IStrategoTerm arg26043 = ((IStrategoList)term).head();
                if(arg26043.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26043).getConstructor())
                  break Fail75962;
                p_92063 = arg26043.getSubterm(0);
                IStrategoTerm arg26044 = ((IStrategoList)term).tail();
                if(arg26044.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26044).isEmpty())
                  break Fail75962;
                IStrategoTerm arg26045 = ((IStrategoList)arg26044).head();
                if(arg26045.getTermType() != IStrategoTerm.APPL || Main._consiter_star_1 != ((IStrategoAppl)arg26045).getConstructor())
                  break Fail75962;
                IStrategoTerm arg26046 = arg26045.getSubterm(0);
                if(arg26046.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26046).getConstructor())
                  break Fail75962;
                IStrategoTerm arg26047 = arg26046.getSubterm(0);
                if(arg26047.getTermType() != IStrategoTerm.APPL || Main._consopt_1 != ((IStrategoAppl)arg26047).getConstructor())
                  break Fail75962;
                IStrategoTerm arg26048 = arg26047.getSubterm(0);
                if(arg26048.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26048).getConstructor())
                  break Fail75962;
                q_92063 = arg26048.getSubterm(0);
                IStrategoTerm arg26049 = arg26046.getSubterm(1);
                if(arg26049.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26049).isEmpty())
                  break Fail75962;
                IStrategoTerm arg26050 = ((IStrategoList)arg26049).head();
                if(arg26050.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26050).getConstructor())
                  break Fail75962;
                if(arg26050.getSubterm(0) != p_92063 && !p_92063.match(arg26050.getSubterm(0)))
                  break Fail75962;
                IStrategoTerm arg26051 = ((IStrategoList)arg26049).tail();
                if(arg26051.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26051).isEmpty())
                  break Fail75962;
                p_92064 = term;
                term = p_92063;
                IStrategoTerm term41755 = term;
                Success41679:
                { 
                  Fail75963:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75963;
                    if(true)
                      break Success41679;
                  }
                  term = term41755;
                  IStrategoTerm term41756 = term;
                  Success41680:
                  { 
                    Fail75964:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75964;
                      if(true)
                        break Success41680;
                    }
                    term = term41756;
                    IStrategoTerm term41757 = term;
                    Success41681:
                    { 
                      Fail75965:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75965;
                        if(true)
                          break Success41681;
                      }
                      term = term41757;
                      IStrategoTerm term41758 = term;
                      Success41682:
                      { 
                        Fail75966:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail75966;
                          if(true)
                            break Success41682;
                        }
                        term = term41758;
                        IStrategoTerm r_92063 = null;
                        IStrategoTerm s_92063 = null;
                        IStrategoTerm u_92063 = null;
                        r_92063 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75962;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail75962;
                        s_92063 = ((IStrategoList)term).tail();
                        u_92063 = s_92063;
                        term = report_failure_0_2.instance.invoke(context, u_92063, trans.const15549, r_92063);
                        if(term == null)
                          break Fail75962;
                      }
                    }
                  }
                }
                x_92063 = term;
                v_92063 = trans.const15453;
                y_92063 = x_92063;
                term = string_replace_0_2.instance.invoke(context, y_92063, v_92063, trans.const15539);
                if(term == null)
                  break Fail75962;
                t_92064 = term;
                term = q_92063;
                IStrategoTerm term41759 = term;
                Success41683:
                { 
                  Fail75967:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75967;
                    if(true)
                      break Success41683;
                  }
                  term = term41759;
                  IStrategoTerm term41760 = term;
                  Success41684:
                  { 
                    Fail75968:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75968;
                      if(true)
                        break Success41684;
                    }
                    term = term41760;
                    IStrategoTerm term41761 = term;
                    Success41685:
                    { 
                      Fail75969:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75969;
                        if(true)
                          break Success41685;
                      }
                      term = term41761;
                      IStrategoTerm term41762 = term;
                      Success41686:
                      { 
                        Fail75970:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail75970;
                          if(true)
                            break Success41686;
                        }
                        term = term41762;
                        IStrategoTerm z_92063 = null;
                        IStrategoTerm a_92064 = null;
                        IStrategoTerm c_92064 = null;
                        z_92063 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75962;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail75962;
                        a_92064 = ((IStrategoList)term).tail();
                        c_92064 = a_92064;
                        term = report_failure_0_2.instance.invoke(context, c_92064, trans.const15549, z_92063);
                        if(term == null)
                          break Fail75962;
                      }
                    }
                  }
                }
                f_92064 = term;
                d_92064 = trans.const15453;
                g_92064 = f_92064;
                term = string_replace_0_2.instance.invoke(context, g_92064, d_92064, trans.const15505);
                if(term == null)
                  break Fail75962;
                u_92064 = term;
                term = q_92063;
                IStrategoTerm term41763 = term;
                Success41687:
                { 
                  Fail75971:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75971;
                    if(true)
                      break Success41687;
                  }
                  term = term41763;
                  IStrategoTerm term41764 = term;
                  Success41688:
                  { 
                    Fail75972:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75972;
                      if(true)
                        break Success41688;
                    }
                    term = term41764;
                    IStrategoTerm term41765 = term;
                    Success41689:
                    { 
                      Fail75973:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75973;
                        if(true)
                          break Success41689;
                      }
                      term = term41765;
                      IStrategoTerm term41766 = term;
                      Success41690:
                      { 
                        Fail75974:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail75974;
                          if(true)
                            break Success41690;
                        }
                        term = term41766;
                        IStrategoTerm h_92064 = null;
                        IStrategoTerm i_92064 = null;
                        IStrategoTerm k_92064 = null;
                        h_92064 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75962;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail75962;
                        i_92064 = ((IStrategoList)term).tail();
                        k_92064 = i_92064;
                        term = report_failure_0_2.instance.invoke(context, k_92064, trans.const15549, h_92064);
                        if(term == null)
                          break Fail75962;
                      }
                    }
                  }
                }
                n_92064 = term;
                l_92064 = trans.const15453;
                o_92064 = n_92064;
                term = string_replace_0_2.instance.invoke(context, o_92064, l_92064, trans.const15555);
                if(term == null)
                  break Fail75962;
                term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(t_92064, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(u_92064, termFactory.makeListCons(trans.const15557, termFactory.makeListCons(term, (IStrategoList)trans.constCons7215))))));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75962;
                term = termFactory.makeTuple(p_92064, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                if(true)
                  break Success41678;
              }
              term = term41754;
              term = context_free_syntax_warning_0_0_fragment_3.instance.invoke(context, term);
              if(term == null)
                break Fail75922;
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