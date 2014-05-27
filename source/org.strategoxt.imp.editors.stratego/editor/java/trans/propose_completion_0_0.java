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
    Fail23212:
    { 
      IStrategoTerm term12537 = term;
      Success12434:
      { 
        Fail23213:
        { 
          TermReference v_4808 = new TermReference();
          IStrategoTerm w_4808 = null;
          IStrategoTerm x_4808 = null;
          IStrategoTerm y_4808 = null;
          IStrategoTerm z_4808 = null;
          IStrategoTerm l_4809 = null;
          IStrategoTerm m_4809 = null;
          w_4808 = term;
          l_4809 = term;
          IStrategoTerm term12538 = term;
          Success12435:
          { 
            Fail23214:
            { 
              term = signature_of_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23214;
              lifted6916 lifted69160 = new lifted6916();
              lifted69160.v_4808 = v_4808;
              term = SRTS_one.instance.invoke(context, term, lifted69160);
              if(term == null)
                break Fail23214;
              if(true)
                break Success12435;
            }
            term = term12538;
            lifted6917 lifted69170 = new lifted6917();
            lifted69170.v_4808 = v_4808;
            term = SRTS_one.instance.invoke(context, term, lifted69170);
            if(term == null)
              break Fail23213;
          }
          term = l_4809;
          m_4809 = l_4809;
          IStrategoTerm term12539 = term;
          Success12436:
          { 
            Fail23215:
            { 
              IStrategoTerm a_4809 = null;
              IStrategoTerm b_4809 = null;
              IStrategoTerm g_4809 = null;
              IStrategoTerm h_4809 = null;
              IStrategoTerm p_4809 = null;
              IStrategoTerm q_4809 = null;
              IStrategoTerm s_4809 = null;
              IStrategoTerm t_4809 = null;
              IStrategoTerm u_4809 = null;
              term = all_keys_$Declare$Cookie_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23215;
              term = filter_by_prefix_0_1.instance.invoke(context, term, v_4808.value);
              if(term == null)
                break Fail23215;
              x_4808 = term;
              b_4809 = term;
              a_4809 = w_4808;
              term = b_4809;
              IStrategoTerm term12540 = term;
              Success12437:
              { 
                Fail23216:
                { 
                  IStrategoTerm c_4809 = null;
                  c_4809 = term;
                  term = a_4809;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail23216;
                  term = c_4809;
                  { 
                    term = try_1_0.instance.invoke(context, x_4808, lifted6918.instance);
                    if(term == null)
                      break Fail23215;
                    y_4808 = term;
                    if(true)
                      break Success12437;
                  }
                }
                term = term12540;
                IStrategoTerm term12542 = term;
                Success12438:
                { 
                  Fail23217:
                  { 
                    IStrategoTerm d_4809 = null;
                    d_4809 = term;
                    term = a_4809;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail23217;
                    term = d_4809;
                    { 
                      term = filter_1_0.instance.invoke(context, x_4808, lifted6920.instance);
                      if(term == null)
                        break Fail23215;
                      y_4808 = term;
                      if(true)
                        break Success12438;
                    }
                  }
                  term = term12542;
                  IStrategoTerm term12543 = term;
                  Success12439:
                  { 
                    Fail23218:
                    { 
                      IStrategoTerm e_4809 = null;
                      e_4809 = term;
                      term = a_4809;
                      if(term.getTermType() != IStrategoTerm.APPL || Main._consDynRuleScopeId_1 != ((IStrategoAppl)term).getConstructor())
                        break Fail23218;
                      term = e_4809;
                      { 
                        term = filter_1_0.instance.invoke(context, x_4808, lifted6921.instance);
                        if(term == null)
                          break Fail23215;
                        y_4808 = term;
                        if(true)
                          break Success12439;
                      }
                    }
                    term = term12543;
                    Success12440:
                    { 
                      Fail23219:
                      { 
                        IStrategoTerm f_4809 = null;
                        f_4809 = term;
                        term = a_4809;
                        if(term.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)term).getConstructor())
                          break Fail23219;
                        term = f_4809;
                        { 
                          term = trans.constNil4;
                          y_4808 = trans.constNil4;
                          if(true)
                            break Success12440;
                        }
                      }
                      term = filter_1_0.instance.invoke(context, x_4808, lifted6922.instance);
                      if(term == null)
                        break Fail23215;
                      y_4808 = term;
                    }
                  }
                }
              }
              term = map_1_0.instance.invoke(context, y_4808, signature_to_proposal_0_0.instance);
              if(term == null)
                break Fail23215;
              z_4808 = term;
              g_4809 = term;
              term = z_4808;
              h_4809 = z_4808;
              s_4809 = term;
              p_4809 = trans.const4611;
              t_4809 = s_4809;
              q_4809 = trans.constCons2047;
              u_4809 = t_4809;
              term = termFactory.makeTuple(trans.const4612, h_4809);
              term = dr_set_rule_0_3.instance.invoke(context, u_4809, p_4809, q_4809, term);
              if(term == null)
                break Fail23215;
              term = g_4809;
              if(true)
                break Success12436;
            }
            term = term12539;
            IStrategoTerm j_4809 = null;
            IStrategoTerm k_4809 = null;
            IStrategoTerm w_4809 = null;
            j_4809 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail23213;
            k_4809 = term;
            w_4809 = j_4809;
            term = report_with_failure_0_2.instance.invoke(context, w_4809, trans.const4613, k_4809);
            if(term == null)
              break Fail23213;
          }
          term = m_4809;
          if(z_4808 == null)
            break Fail23213;
          term = z_4808;
          if(true)
            break Success12434;
        }
        term = term12537;
        IStrategoTerm u_4807 = null;
        IStrategoTerm v_4807 = null;
        IStrategoTerm w_4807 = null;
        IStrategoTerm x_4807 = null;
        IStrategoTerm e_4808 = null;
        IStrategoTerm f_4808 = null;
        if(term.getTermType() != IStrategoTerm.APPL || Main._consRule_3 != ((IStrategoAppl)term).getConstructor())
          break Fail23212;
        u_4807 = term.getSubterm(0);
        IStrategoTerm arg8258 = term.getSubterm(1);
        w_4807 = arg8258;
        if(arg8258.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)arg8258).getConstructor())
          break Fail23212;
        IStrategoTerm arg8259 = arg8258.getSubterm(0);
        if(arg8259.getTermType() != IStrategoTerm.APPL || Main._consCOMPLETION_1 != ((IStrategoAppl)arg8259).getConstructor())
          break Fail23212;
        e_4808 = term;
        term = u_4807;
        IStrategoTerm term12547 = term;
        Success12441:
        { 
          Fail23220:
          { 
            term = oncetd_1_0.instance.invoke(context, term, lifted6924.instance);
            if(term == null)
              break Fail23220;
            { 
              if(true)
                break Fail23212;
              if(true)
                break Success12441;
            }
          }
          term = term12547;
        }
        term = e_4808;
        f_4808 = e_4808;
        IStrategoTerm term12549 = term;
        Success12442:
        { 
          Fail23221:
          { 
            IStrategoTerm g_4808 = null;
            IStrategoTerm i_4808 = null;
            IStrategoTerm h_4808 = null;
            IStrategoTerm j_4808 = null;
            IStrategoTerm z_4807 = null;
            IStrategoTerm a_4808 = null;
            IStrategoTerm k_4808 = null;
            IStrategoTerm l_4808 = null;
            IStrategoTerm n_4808 = null;
            IStrategoTerm o_4808 = null;
            IStrategoTerm p_4808 = null;
            term = topdown_1_0.instance.invoke(context, u_4807, lifted6925.instance);
            if(term == null)
              break Fail23221;
            v_4807 = term;
            i_4808 = term;
            term = pp_stratego_string_0_0.instance.invoke(context, v_4807);
            if(term == null)
              break Fail23221;
            g_4808 = term;
            j_4808 = i_4808;
            term = this.invoke(context, w_4807);
            if(term == null)
              break Fail23221;
            h_4808 = term;
            term = j_4808;
            IStrategoList list198;
            list198 = checkListTail(h_4808);
            if(list198 == null)
              break Fail23221;
            term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(g_4808, (IStrategoList)trans.constNil4), trans.const4472), list198);
            x_4807 = term;
            z_4807 = term;
            term = x_4807;
            a_4808 = x_4807;
            n_4808 = term;
            k_4808 = trans.const4611;
            o_4808 = n_4808;
            l_4808 = trans.constCons2047;
            p_4808 = o_4808;
            term = termFactory.makeTuple(trans.const4612, a_4808);
            term = dr_set_rule_0_3.instance.invoke(context, p_4808, k_4808, l_4808, term);
            if(term == null)
              break Fail23221;
            term = z_4807;
            if(true)
              break Success12442;
          }
          term = term12549;
          IStrategoTerm c_4808 = null;
          IStrategoTerm d_4808 = null;
          IStrategoTerm r_4808 = null;
          c_4808 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail23212;
          d_4808 = term;
          r_4808 = c_4808;
          term = report_with_failure_0_2.instance.invoke(context, r_4808, trans.const4613, d_4808);
          if(term == null)
            break Fail23212;
        }
        term = f_4808;
        if(x_4807 == null)
          break Fail23212;
        term = x_4807;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}