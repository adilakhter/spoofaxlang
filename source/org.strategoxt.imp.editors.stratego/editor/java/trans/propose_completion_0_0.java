package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class propose_completion_0_0 extends Strategy 
{ 
  public static propose_completion_0_0 instance = new propose_completion_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("propose_completion_0_0");
    Fail21736:
    { 
      IStrategoTerm term11828 = term;
      Success11725:
      { 
        Fail21737:
        { 
          TermReference d_4255 = new TermReference();
          IStrategoTerm e_4255 = null;
          IStrategoTerm f_4255 = null;
          IStrategoTerm g_4255 = null;
          IStrategoTerm h_4255 = null;
          IStrategoTerm t_4255 = null;
          IStrategoTerm u_4255 = null;
          e_4255 = term;
          t_4255 = term;
          IStrategoTerm term11829 = term;
          Success11726:
          { 
            Fail21738:
            { 
              term = signature_of_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21738;
              lifted6645 lifted66450 = new lifted6645();
              lifted66450.d_4255 = d_4255;
              term = SRTS_one.instance.invoke(context, term, lifted66450);
              if(term == null)
                break Fail21738;
              if(true)
                break Success11726;
            }
            term = term11829;
            lifted6646 lifted66460 = new lifted6646();
            lifted66460.d_4255 = d_4255;
            term = SRTS_one.instance.invoke(context, term, lifted66460);
            if(term == null)
              break Fail21737;
          }
          term = t_4255;
          u_4255 = t_4255;
          IStrategoTerm term11830 = term;
          Success11727:
          { 
            Fail21739:
            { 
              IStrategoTerm i_4255 = null;
              IStrategoTerm j_4255 = null;
              IStrategoTerm o_4255 = null;
              IStrategoTerm p_4255 = null;
              IStrategoTerm x_4255 = null;
              IStrategoTerm y_4255 = null;
              IStrategoTerm a_4256 = null;
              IStrategoTerm b_4256 = null;
              IStrategoTerm c_4256 = null;
              term = all_keys_$Declare$Cookie_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21739;
              term = filter_by_prefix_0_1.instance.invoke(context, term, d_4255.value);
              if(term == null)
                break Fail21739;
              f_4255 = term;
              j_4255 = term;
              i_4255 = e_4255;
              term = j_4255;
              IStrategoTerm term11831 = term;
              Success11728:
              { 
                Fail21740:
                { 
                  IStrategoTerm k_4255 = null;
                  k_4255 = term;
                  term = i_4255;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail21740;
                  term = k_4255;
                  { 
                    term = try_1_0.instance.invoke(context, f_4255, lifted6647.instance);
                    if(term == null)
                      break Fail21739;
                    g_4255 = term;
                    if(true)
                      break Success11728;
                  }
                }
                term = term11831;
                IStrategoTerm term11833 = term;
                Success11729:
                { 
                  Fail21741:
                  { 
                    IStrategoTerm l_4255 = null;
                    l_4255 = term;
                    term = i_4255;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail21741;
                    term = l_4255;
                    { 
                      term = filter_1_0.instance.invoke(context, f_4255, lifted6649.instance);
                      if(term == null)
                        break Fail21739;
                      g_4255 = term;
                      if(true)
                        break Success11729;
                    }
                  }
                  term = term11833;
                  IStrategoTerm term11834 = term;
                  Success11730:
                  { 
                    Fail21742:
                    { 
                      IStrategoTerm m_4255 = null;
                      m_4255 = term;
                      term = i_4255;
                      if(term.getTermType() != IStrategoTerm.APPL || Main._consDynRuleScopeId_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail21742;
                      term = m_4255;
                      { 
                        term = filter_1_0.instance.invoke(context, f_4255, lifted6650.instance);
                        if(term == null)
                          break Fail21739;
                        g_4255 = term;
                        if(true)
                          break Success11730;
                      }
                    }
                    term = term11834;
                    Success11731:
                    { 
                      Fail21743:
                      { 
                        IStrategoTerm n_4255 = null;
                        n_4255 = term;
                        term = i_4255;
                        if(term.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail21743;
                        term = n_4255;
                        { 
                          term = trans.constNil3;
                          g_4255 = trans.constNil3;
                          if(true)
                            break Success11731;
                        }
                      }
                      term = filter_1_0.instance.invoke(context, f_4255, lifted6651.instance);
                      if(term == null)
                        break Fail21739;
                      g_4255 = term;
                    }
                  }
                }
              }
              term = map_1_0.instance.invoke(context, g_4255, signature_to_proposal_0_0.instance);
              if(term == null)
                break Fail21739;
              h_4255 = term;
              o_4255 = term;
              term = h_4255;
              p_4255 = h_4255;
              a_4256 = term;
              x_4255 = trans.const4401;
              b_4256 = a_4256;
              y_4255 = trans.constCons1966;
              c_4256 = b_4256;
              term = termFactory.makeTuple(trans.const4402, p_4255);
              term = dr_set_rule_0_3.instance.invoke(context, c_4256, x_4255, y_4255, term);
              if(term == null)
                break Fail21739;
              term = o_4255;
              if(true)
                break Success11727;
            }
            term = term11830;
            IStrategoTerm r_4255 = null;
            IStrategoTerm s_4255 = null;
            IStrategoTerm e_4256 = null;
            r_4255 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail21737;
            s_4255 = term;
            e_4256 = r_4255;
            term = report_with_failure_0_2.instance.invoke(context, e_4256, trans.const4403, s_4255);
            if(term == null)
              break Fail21737;
          }
          term = u_4255;
          if(h_4255 == null)
            break Fail21737;
          term = h_4255;
          if(true)
            break Success11725;
        }
        term = term11828;
        IStrategoTerm c_4254 = null;
        IStrategoTerm d_4254 = null;
        IStrategoTerm e_4254 = null;
        IStrategoTerm f_4254 = null;
        IStrategoTerm m_4254 = null;
        IStrategoTerm n_4254 = null;
        if(term.getTermType() != IStrategoTerm.APPL || Main._consRule_3 != ((IStrategoAppl)term).getConstructor())
          break Fail21736;
        c_4254 = term.getSubterm(0);
        IStrategoTerm arg7791 = term.getSubterm(1);
        e_4254 = arg7791;
        if(arg7791.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)arg7791).getConstructor())
          break Fail21736;
        IStrategoTerm arg7792 = arg7791.getSubterm(0);
        if(arg7792.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)arg7792).getConstructor())
          break Fail21736;
        m_4254 = term;
        term = c_4254;
        IStrategoTerm term11838 = term;
        Success11732:
        { 
          Fail21744:
          { 
            term = oncetd_1_0.instance.invoke(context, term, lifted6653.instance);
            if(term == null)
              break Fail21744;
            { 
              if(true)
                break Fail21736;
              if(true)
                break Success11732;
            }
          }
          term = term11838;
        }
        term = m_4254;
        n_4254 = m_4254;
        IStrategoTerm term11840 = term;
        Success11733:
        { 
          Fail21745:
          { 
            IStrategoTerm o_4254 = null;
            IStrategoTerm q_4254 = null;
            IStrategoTerm p_4254 = null;
            IStrategoTerm r_4254 = null;
            IStrategoTerm h_4254 = null;
            IStrategoTerm i_4254 = null;
            IStrategoTerm s_4254 = null;
            IStrategoTerm t_4254 = null;
            IStrategoTerm v_4254 = null;
            IStrategoTerm w_4254 = null;
            IStrategoTerm x_4254 = null;
            term = topdown_1_0.instance.invoke(context, c_4254, lifted6654.instance);
            if(term == null)
              break Fail21745;
            d_4254 = term;
            q_4254 = term;
            term = pp_stratego_string_0_0.instance.invoke(context, d_4254);
            if(term == null)
              break Fail21745;
            o_4254 = term;
            r_4254 = q_4254;
            term = this.invoke(context, e_4254);
            if(term == null)
              break Fail21745;
            p_4254 = term;
            term = r_4254;
            IStrategoList list187;
            list187 = checkListTail(p_4254);
            if(list187 == null)
              break Fail21745;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(o_4254, (IStrategoList)trans.constNil3), trans.const4262), list187);
            f_4254 = term;
            h_4254 = term;
            term = f_4254;
            i_4254 = f_4254;
            v_4254 = term;
            s_4254 = trans.const4401;
            w_4254 = v_4254;
            t_4254 = trans.constCons1966;
            x_4254 = w_4254;
            term = termFactory.makeTuple(trans.const4402, i_4254);
            term = dr_set_rule_0_3.instance.invoke(context, x_4254, s_4254, t_4254, term);
            if(term == null)
              break Fail21745;
            term = h_4254;
            if(true)
              break Success11733;
          }
          term = term11840;
          IStrategoTerm k_4254 = null;
          IStrategoTerm l_4254 = null;
          IStrategoTerm z_4254 = null;
          k_4254 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail21736;
          l_4254 = term;
          z_4254 = k_4254;
          term = report_with_failure_0_2.instance.invoke(context, z_4254, trans.const4403, l_4254);
          if(term == null)
            break Fail21736;
        }
        term = n_4254;
        if(f_4254 == null)
          break Fail21736;
        term = f_4254;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}