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

@SuppressWarnings("all") public class declare_use_0_0 extends Strategy 
{ 
  public static declare_use_0_0 instance = new declare_use_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_use_0_0");
    Fail75880:
    { 
      IStrategoTerm term41682 = term;
      IStrategoConstructor cons1782 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41606:
      { 
        if(cons1782 == Main._conssort_1)
        { 
          Fail75881:
          { 
            IStrategoTerm n_92053 = null;
            IStrategoTerm r_92053 = null;
            n_92053 = term.getSubterm(0);
            r_92053 = term;
            IStrategoTerm term41683 = term;
            Success41607:
            { 
              Fail75882:
              { 
                IStrategoTerm o_92053 = null;
                IStrategoTerm s_92053 = null;
                IStrategoTerm u_92053 = null;
                IStrategoTerm v_92053 = null;
                o_92053 = term;
                u_92053 = term;
                s_92053 = trans.const15535;
                v_92053 = u_92053;
                term = termFactory.makeTuple(trans.const15536, n_92053);
                term = dr_set_rule_0_3.instance.invoke(context, v_92053, s_92053, n_92053, term);
                if(term == null)
                  break Fail75882;
                term = o_92053;
                if(true)
                  break Success41607;
              }
              term = term41683;
              IStrategoTerm p_92053 = null;
              IStrategoTerm q_92053 = null;
              IStrategoTerm x_92053 = null;
              p_92053 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail75881;
              q_92053 = term;
              x_92053 = p_92053;
              term = report_with_failure_0_2.instance.invoke(context, x_92053, trans.const15537, q_92053);
              if(term == null)
                break Fail75881;
            }
            term = r_92053;
            if(true)
              break Success41606;
          }
          term = term41682;
        }
        if(cons1782 == Main._consparameterized_sort_2)
        { 
          IStrategoTerm b_92052 = null;
          IStrategoTerm c_92052 = null;
          IStrategoTerm d_92052 = null;
          IStrategoTerm e_92052 = null;
          IStrategoTerm x_92052 = null;
          c_92052 = term.getSubterm(0);
          b_92052 = term.getSubterm(1);
          x_92052 = term;
          IStrategoTerm term41684 = term;
          Success41608:
          { 
            Fail75883:
            { 
              IStrategoTerm f_92052 = null;
              f_92052 = term;
              term = b_92052;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail75883;
              IStrategoTerm arg25988 = ((IStrategoList)term).head();
              if(arg25988.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg25988).getConstructor())
                break Fail75883;
              d_92052 = arg25988.getSubterm(0);
              IStrategoTerm arg25989 = ((IStrategoList)term).tail();
              if(arg25989.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg25989).isEmpty())
                break Fail75883;
              term = is_string_0_0.instance.invoke(context, c_92052);
              if(term == null)
                break Fail75883;
              term = is_string_0_0.instance.invoke(context, d_92052);
              if(term == null)
                break Fail75883;
              term = f_92052;
              { 
                IStrategoTerm a_92053 = null;
                IStrategoTerm k_92052 = null;
                IStrategoTerm m_92052 = null;
                IStrategoTerm n_92052 = null;
                IStrategoTerm s_92052 = null;
                IStrategoTerm u_92052 = null;
                IStrategoTerm v_92052 = null;
                IStrategoTerm w_92052 = null;
                IStrategoTerm e_92053 = null;
                IStrategoTerm g_92053 = null;
                IStrategoTerm h_92053 = null;
                term = c_92052;
                IStrategoTerm term41685 = term;
                Success41609:
                { 
                  Fail75884:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75884;
                    if(true)
                      break Success41609;
                  }
                  term = term41685;
                  IStrategoTerm term41686 = term;
                  Success41610:
                  { 
                    Fail75885:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75885;
                      if(true)
                        break Success41610;
                    }
                    term = term41686;
                    IStrategoTerm term41687 = term;
                    Success41611:
                    { 
                      Fail75886:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75886;
                        if(true)
                          break Success41611;
                      }
                      term = term41687;
                      IStrategoTerm term41688 = term;
                      Success41612:
                      { 
                        Fail75887:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail75887;
                          if(true)
                            break Success41612;
                        }
                        term = term41688;
                        IStrategoTerm g_92052 = null;
                        IStrategoTerm h_92052 = null;
                        IStrategoTerm j_92052 = null;
                        g_92052 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75880;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail75880;
                        h_92052 = ((IStrategoList)term).tail();
                        j_92052 = h_92052;
                        term = report_failure_0_2.instance.invoke(context, j_92052, trans.const15538, g_92052);
                        if(term == null)
                          break Fail75880;
                      }
                    }
                  }
                }
                m_92052 = term;
                k_92052 = trans.const15453;
                n_92052 = m_92052;
                term = string_replace_0_2.instance.invoke(context, n_92052, k_92052, trans.const15453);
                if(term == null)
                  break Fail75880;
                a_92053 = term;
                term = d_92052;
                IStrategoTerm term41689 = term;
                Success41613:
                { 
                  Fail75888:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75888;
                    if(true)
                      break Success41613;
                  }
                  term = term41689;
                  IStrategoTerm term41690 = term;
                  Success41614:
                  { 
                    Fail75889:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75889;
                      if(true)
                        break Success41614;
                    }
                    term = term41690;
                    IStrategoTerm term41691 = term;
                    Success41615:
                    { 
                      Fail75890:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75890;
                        if(true)
                          break Success41615;
                      }
                      term = term41691;
                      IStrategoTerm term41692 = term;
                      Success41616:
                      { 
                        Fail75891:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail75891;
                          if(true)
                            break Success41616;
                        }
                        term = term41692;
                        IStrategoTerm o_92052 = null;
                        IStrategoTerm p_92052 = null;
                        IStrategoTerm r_92052 = null;
                        o_92052 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail75880;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail75880;
                        p_92052 = ((IStrategoList)term).tail();
                        r_92052 = p_92052;
                        term = report_failure_0_2.instance.invoke(context, r_92052, trans.const15538, o_92052);
                        if(term == null)
                          break Fail75880;
                      }
                    }
                  }
                }
                u_92052 = term;
                s_92052 = trans.const15453;
                v_92052 = u_92052;
                term = string_replace_0_2.instance.invoke(context, v_92052, s_92052, trans.const15539);
                if(term == null)
                  break Fail75880;
                term = (IStrategoTerm)termFactory.makeListCons(a_92053, termFactory.makeListCons(trans.const15541, termFactory.makeListCons(term, (IStrategoList)trans.constCons7212)));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75880;
                term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
                e_92052 = term;
                w_92052 = term;
                g_92053 = term;
                e_92053 = trans.const15535;
                h_92053 = g_92053;
                term = termFactory.makeTuple(trans.const15536, e_92052);
                term = dr_set_rule_0_3.instance.invoke(context, h_92053, e_92053, e_92052, term);
                if(term == null)
                  break Fail75880;
                term = w_92052;
                if(true)
                  break Success41608;
              }
            }
            term = term41684;
          }
          term = x_92052;
        }
        else
        { 
          break Fail75880;
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