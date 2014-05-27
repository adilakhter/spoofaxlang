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

@SuppressWarnings("all") public class resolve_import_0_0 extends Strategy 
{ 
  public static resolve_import_0_0 instance = new resolve_import_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("resolve_import_0_0");
    Fail75842:
    { 
      IStrategoTerm term41646 = term;
      Success41570:
      { 
        Fail75843:
        { 
          IStrategoTerm o_92047 = null;
          IStrategoTerm o_92050 = null;
          IStrategoTerm v_92047 = null;
          IStrategoTerm x_92047 = null;
          IStrategoTerm y_92047 = null;
          IStrategoTerm d_92048 = null;
          IStrategoTerm f_92048 = null;
          IStrategoTerm g_92048 = null;
          o_92047 = term;
          term = $Project$Dir_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75843;
          IStrategoTerm term41647 = term;
          Success41571:
          { 
            Fail75844:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75844;
              if(true)
                break Success41571;
            }
            term = term41647;
            IStrategoTerm term41648 = term;
            Success41572:
            { 
              Fail75845:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75845;
                if(true)
                  break Success41572;
              }
              term = term41648;
              IStrategoTerm term41649 = term;
              Success41573:
              { 
                Fail75846:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75846;
                  if(true)
                    break Success41573;
                }
                term = term41649;
                IStrategoTerm term41650 = term;
                Success41574:
                { 
                  Fail75847:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75847;
                    if(true)
                      break Success41574;
                  }
                  term = term41650;
                  IStrategoTerm r_92047 = null;
                  IStrategoTerm s_92047 = null;
                  IStrategoTerm u_92047 = null;
                  r_92047 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75843;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75843;
                  s_92047 = ((IStrategoList)term).tail();
                  u_92047 = s_92047;
                  term = report_failure_0_2.instance.invoke(context, u_92047, trans.const15527, r_92047);
                  if(term == null)
                    break Fail75843;
                }
              }
            }
          }
          x_92047 = term;
          v_92047 = trans.const15453;
          y_92047 = x_92047;
          term = string_replace_0_2.instance.invoke(context, y_92047, v_92047, trans.const15453);
          if(term == null)
            break Fail75843;
          o_92050 = term;
          term = o_92047;
          IStrategoTerm term41651 = term;
          Success41575:
          { 
            Fail75848:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75848;
              if(true)
                break Success41575;
            }
            term = term41651;
            IStrategoTerm term41652 = term;
            Success41576:
            { 
              Fail75849:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75849;
                if(true)
                  break Success41576;
              }
              term = term41652;
              IStrategoTerm term41653 = term;
              Success41577:
              { 
                Fail75850:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75850;
                  if(true)
                    break Success41577;
                }
                term = term41653;
                IStrategoTerm term41654 = term;
                Success41578:
                { 
                  Fail75851:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75851;
                    if(true)
                      break Success41578;
                  }
                  term = term41654;
                  IStrategoTerm z_92047 = null;
                  IStrategoTerm a_92048 = null;
                  IStrategoTerm c_92048 = null;
                  z_92047 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail75843;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail75843;
                  a_92048 = ((IStrategoList)term).tail();
                  c_92048 = a_92048;
                  term = report_failure_0_2.instance.invoke(context, c_92048, trans.const15527, z_92047);
                  if(term == null)
                    break Fail75843;
                }
              }
            }
          }
          f_92048 = term;
          d_92048 = trans.const15453;
          g_92048 = f_92048;
          term = string_replace_0_2.instance.invoke(context, g_92048, d_92048, trans.const15514);
          if(term == null)
            break Fail75843;
          term = (IStrategoTerm)termFactory.makeListCons(o_92050, termFactory.makeListCons(trans.const15455, termFactory.makeListCons(term, (IStrategoList)trans.constCons7210)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75843;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
          term = file_exists_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75843;
          if(true)
            break Success41570;
        }
        term = term41646;
        IStrategoTerm term41655 = term;
        Success41579:
        { 
          Fail75852:
          { 
            IStrategoTerm h_92048 = null;
            IStrategoTerm u_92050 = null;
            IStrategoTerm o_92048 = null;
            IStrategoTerm q_92048 = null;
            IStrategoTerm r_92048 = null;
            IStrategoTerm w_92048 = null;
            IStrategoTerm y_92048 = null;
            IStrategoTerm z_92048 = null;
            h_92048 = term;
            term = $Project$Dir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75852;
            IStrategoTerm term41656 = term;
            Success41580:
            { 
              Fail75853:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75853;
                if(true)
                  break Success41580;
              }
              term = term41656;
              IStrategoTerm term41657 = term;
              Success41581:
              { 
                Fail75854:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75854;
                  if(true)
                    break Success41581;
                }
                term = term41657;
                IStrategoTerm term41658 = term;
                Success41582:
                { 
                  Fail75855:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75855;
                    if(true)
                      break Success41582;
                  }
                  term = term41658;
                  IStrategoTerm term41659 = term;
                  Success41583:
                  { 
                    Fail75856:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75856;
                      if(true)
                        break Success41583;
                    }
                    term = term41659;
                    IStrategoTerm k_92048 = null;
                    IStrategoTerm l_92048 = null;
                    IStrategoTerm n_92048 = null;
                    k_92048 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75852;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75852;
                    l_92048 = ((IStrategoList)term).tail();
                    n_92048 = l_92048;
                    term = report_failure_0_2.instance.invoke(context, n_92048, trans.const15527, k_92048);
                    if(term == null)
                      break Fail75852;
                  }
                }
              }
            }
            q_92048 = term;
            o_92048 = trans.const15453;
            r_92048 = q_92048;
            term = string_replace_0_2.instance.invoke(context, r_92048, o_92048, trans.const15453);
            if(term == null)
              break Fail75852;
            u_92050 = term;
            term = h_92048;
            IStrategoTerm term41660 = term;
            Success41584:
            { 
              Fail75857:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75857;
                if(true)
                  break Success41584;
              }
              term = term41660;
              IStrategoTerm term41661 = term;
              Success41585:
              { 
                Fail75858:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75858;
                  if(true)
                    break Success41585;
                }
                term = term41661;
                IStrategoTerm term41662 = term;
                Success41586:
                { 
                  Fail75859:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75859;
                    if(true)
                      break Success41586;
                  }
                  term = term41662;
                  IStrategoTerm term41663 = term;
                  Success41587:
                  { 
                    Fail75860:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75860;
                      if(true)
                        break Success41587;
                    }
                    term = term41663;
                    IStrategoTerm s_92048 = null;
                    IStrategoTerm t_92048 = null;
                    IStrategoTerm v_92048 = null;
                    s_92048 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75852;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75852;
                    t_92048 = ((IStrategoList)term).tail();
                    v_92048 = t_92048;
                    term = report_failure_0_2.instance.invoke(context, v_92048, trans.const15527, s_92048);
                    if(term == null)
                      break Fail75852;
                  }
                }
              }
            }
            y_92048 = term;
            w_92048 = trans.const15453;
            z_92048 = y_92048;
            term = string_replace_0_2.instance.invoke(context, z_92048, w_92048, trans.const15474);
            if(term == null)
              break Fail75852;
            term = (IStrategoTerm)termFactory.makeListCons(u_92050, termFactory.makeListCons(trans.const15529, termFactory.makeListCons(term, (IStrategoList)trans.constCons7210)));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75852;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
            term = file_exists_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75852;
            if(true)
              break Success41579;
          }
          term = term41655;
          IStrategoTerm term41664 = term;
          Success41588:
          { 
            Fail75861:
            { 
              IStrategoTerm a_92049 = null;
              IStrategoTerm a_92051 = null;
              IStrategoTerm h_92049 = null;
              IStrategoTerm j_92049 = null;
              IStrategoTerm k_92049 = null;
              IStrategoTerm p_92049 = null;
              IStrategoTerm r_92049 = null;
              IStrategoTerm s_92049 = null;
              a_92049 = term;
              term = $Project$Dir_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75861;
              IStrategoTerm term41665 = term;
              Success41589:
              { 
                Fail75862:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75862;
                  if(true)
                    break Success41589;
                }
                term = term41665;
                IStrategoTerm term41666 = term;
                Success41590:
                { 
                  Fail75863:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75863;
                    if(true)
                      break Success41590;
                  }
                  term = term41666;
                  IStrategoTerm term41667 = term;
                  Success41591:
                  { 
                    Fail75864:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75864;
                      if(true)
                        break Success41591;
                    }
                    term = term41667;
                    IStrategoTerm term41668 = term;
                    Success41592:
                    { 
                      Fail75865:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75865;
                        if(true)
                          break Success41592;
                      }
                      term = term41668;
                      IStrategoTerm d_92049 = null;
                      IStrategoTerm e_92049 = null;
                      IStrategoTerm g_92049 = null;
                      d_92049 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75861;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75861;
                      e_92049 = ((IStrategoList)term).tail();
                      g_92049 = e_92049;
                      term = report_failure_0_2.instance.invoke(context, g_92049, trans.const15527, d_92049);
                      if(term == null)
                        break Fail75861;
                    }
                  }
                }
              }
              j_92049 = term;
              h_92049 = trans.const15453;
              k_92049 = j_92049;
              term = string_replace_0_2.instance.invoke(context, k_92049, h_92049, trans.const15453);
              if(term == null)
                break Fail75861;
              a_92051 = term;
              term = a_92049;
              IStrategoTerm term41669 = term;
              Success41593:
              { 
                Fail75866:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75866;
                  if(true)
                    break Success41593;
                }
                term = term41669;
                IStrategoTerm term41670 = term;
                Success41594:
                { 
                  Fail75867:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75867;
                    if(true)
                      break Success41594;
                  }
                  term = term41670;
                  IStrategoTerm term41671 = term;
                  Success41595:
                  { 
                    Fail75868:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75868;
                      if(true)
                        break Success41595;
                    }
                    term = term41671;
                    IStrategoTerm term41672 = term;
                    Success41596:
                    { 
                      Fail75869:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75869;
                        if(true)
                          break Success41596;
                      }
                      term = term41672;
                      IStrategoTerm l_92049 = null;
                      IStrategoTerm m_92049 = null;
                      IStrategoTerm o_92049 = null;
                      l_92049 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75861;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75861;
                      m_92049 = ((IStrategoList)term).tail();
                      o_92049 = m_92049;
                      term = report_failure_0_2.instance.invoke(context, o_92049, trans.const15527, l_92049);
                      if(term == null)
                        break Fail75861;
                    }
                  }
                }
              }
              r_92049 = term;
              p_92049 = trans.const15453;
              s_92049 = r_92049;
              term = string_replace_0_2.instance.invoke(context, s_92049, p_92049, trans.const15530);
              if(term == null)
                break Fail75861;
              term = (IStrategoTerm)termFactory.makeListCons(a_92051, termFactory.makeListCons(trans.const15532, termFactory.makeListCons(term, (IStrategoList)trans.constCons7211)));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75861;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75861;
              if(true)
                break Success41588;
            }
            term = term41664;
            IStrategoTerm t_92049 = null;
            IStrategoTerm g_92051 = null;
            IStrategoTerm a_92050 = null;
            IStrategoTerm c_92050 = null;
            IStrategoTerm d_92050 = null;
            IStrategoTerm i_92050 = null;
            IStrategoTerm k_92050 = null;
            IStrategoTerm l_92050 = null;
            t_92049 = term;
            term = $Current$Dir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75842;
            IStrategoTerm term41673 = term;
            Success41597:
            { 
              Fail75870:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75870;
                if(true)
                  break Success41597;
              }
              term = term41673;
              IStrategoTerm term41674 = term;
              Success41598:
              { 
                Fail75871:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75871;
                  if(true)
                    break Success41598;
                }
                term = term41674;
                IStrategoTerm term41675 = term;
                Success41599:
                { 
                  Fail75872:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75872;
                    if(true)
                      break Success41599;
                  }
                  term = term41675;
                  IStrategoTerm term41676 = term;
                  Success41600:
                  { 
                    Fail75873:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75873;
                      if(true)
                        break Success41600;
                    }
                    term = term41676;
                    IStrategoTerm w_92049 = null;
                    IStrategoTerm x_92049 = null;
                    IStrategoTerm z_92049 = null;
                    w_92049 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75842;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75842;
                    x_92049 = ((IStrategoList)term).tail();
                    z_92049 = x_92049;
                    term = report_failure_0_2.instance.invoke(context, z_92049, trans.const15527, w_92049);
                    if(term == null)
                      break Fail75842;
                  }
                }
              }
            }
            c_92050 = term;
            a_92050 = trans.const15453;
            d_92050 = c_92050;
            term = string_replace_0_2.instance.invoke(context, d_92050, a_92050, trans.const15453);
            if(term == null)
              break Fail75842;
            g_92051 = term;
            term = t_92049;
            IStrategoTerm term41677 = term;
            Success41601:
            { 
              Fail75874:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75874;
                if(true)
                  break Success41601;
              }
              term = term41677;
              IStrategoTerm term41678 = term;
              Success41602:
              { 
                Fail75875:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75875;
                  if(true)
                    break Success41602;
                }
                term = term41678;
                IStrategoTerm term41679 = term;
                Success41603:
                { 
                  Fail75876:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75876;
                    if(true)
                      break Success41603;
                  }
                  term = term41679;
                  IStrategoTerm term41680 = term;
                  Success41604:
                  { 
                    Fail75877:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75877;
                      if(true)
                        break Success41604;
                    }
                    term = term41680;
                    IStrategoTerm e_92050 = null;
                    IStrategoTerm f_92050 = null;
                    IStrategoTerm h_92050 = null;
                    e_92050 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail75842;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail75842;
                    f_92050 = ((IStrategoList)term).tail();
                    h_92050 = f_92050;
                    term = report_failure_0_2.instance.invoke(context, h_92050, trans.const15527, e_92050);
                    if(term == null)
                      break Fail75842;
                  }
                }
              }
            }
            k_92050 = term;
            i_92050 = trans.const15453;
            l_92050 = k_92050;
            term = string_replace_0_2.instance.invoke(context, l_92050, i_92050, trans.const15514);
            if(term == null)
              break Fail75842;
            term = (IStrategoTerm)termFactory.makeListCons(g_92051, termFactory.makeListCons(trans.const15455, termFactory.makeListCons(term, (IStrategoList)trans.constCons7210)));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75842;
            term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
            term = file_exists_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75842;
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