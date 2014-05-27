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

@SuppressWarnings("all") public class signature_to_proposal_0_0 extends Strategy 
{ 
  public static signature_to_proposal_0_0 instance = new signature_to_proposal_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("signature_to_proposal_0_0");
    Fail21749:
    { 
      IStrategoTerm term11843 = term;
      Success11735:
      { 
        Fail21750:
        { 
          IStrategoTerm y_4258 = null;
          IStrategoTerm z_4258 = null;
          IStrategoTerm d_4259 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21750;
          y_4258 = term.getSubterm(0);
          IStrategoTerm arg7799 = term.getSubterm(1);
          if(arg7799.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg7799).intValue())
            break Fail21750;
          d_4259 = term;
          IStrategoTerm term11844 = term;
          Success11736:
          { 
            Fail21751:
            { 
              Success11737:
              { 
                Fail21752:
                { 
                  IStrategoTerm a_4259 = null;
                  a_4259 = term;
                  term = is_constructor_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21752;
                  term = a_4259;
                  { 
                    term = trans.constCons2034;
                    z_4258 = trans.constCons2034;
                    if(true)
                      break Success11737;
                  }
                }
                term = trans.constNil3;
                z_4258 = trans.constNil3;
              }
              if(true)
                break Success11736;
            }
            term = term11844;
            IStrategoTerm b_4259 = null;
            IStrategoTerm c_4259 = null;
            IStrategoTerm f_4259 = null;
            b_4259 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail21750;
            c_4259 = term;
            f_4259 = b_4259;
            term = report_with_failure_0_2.instance.invoke(context, f_4259, trans.const4406, c_4259);
            if(term == null)
              break Fail21750;
          }
          term = d_4259;
          if(z_4258 == null)
            break Fail21750;
          IStrategoList list188;
          list188 = checkListTail(z_4258);
          if(list188 == null)
            break Fail21750;
          term = (IStrategoTerm)termFactory.makeListCons(y_4258, list188);
          if(true)
            break Success11735;
        }
        term = term11843;
        IStrategoTerm term11846 = term;
        Success11738:
        { 
          Fail21753:
          { 
            IStrategoTerm l_4258 = null;
            IStrategoTerm m_4258 = null;
            IStrategoTerm n_4258 = null;
            IStrategoTerm q_4258 = null;
            IStrategoTerm r_4258 = null;
            IStrategoTerm u_4258 = null;
            IStrategoTerm v_4258 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail21753;
            l_4258 = term.getSubterm(0);
            m_4258 = term.getSubterm(1);
            q_4258 = term;
            term = termFactory.makeTuple(m_4258, trans.const4227);
            term = gt_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21753;
            term = q_4258;
            r_4258 = q_4258;
            IStrategoTerm term11847 = term;
            Success11739:
            { 
              Fail21754:
              { 
                term = termFactory.makeTuple(m_4258, trans.const4407);
                term = numbered_arguments_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21754;
                n_4258 = term;
                if(true)
                  break Success11739;
              }
              term = term11847;
              IStrategoTerm o_4258 = null;
              IStrategoTerm p_4258 = null;
              IStrategoTerm t_4258 = null;
              o_4258 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21753;
              p_4258 = term;
              t_4258 = o_4258;
              term = report_with_failure_0_2.instance.invoke(context, t_4258, trans.const4406, p_4258);
              if(term == null)
                break Fail21753;
            }
            term = r_4258;
            v_4258 = r_4258;
            if(n_4258 == null)
              break Fail21753;
            term = termFactory.makeTuple(n_4258, trans.constCons1963);
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21753;
            u_4258 = term;
            term = v_4258;
            IStrategoList list189;
            list189 = checkListTail(u_4258);
            if(list189 == null)
              break Fail21753;
            term = (IStrategoTerm)termFactory.makeListCons(l_4258, termFactory.makeListCons(trans.const4242, list189));
            if(true)
              break Success11738;
          }
          term = term11846;
          IStrategoTerm term11848 = term;
          Success11740:
          { 
            Fail21755:
            { 
              IStrategoTerm i_4258 = null;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                break Fail21755;
              i_4258 = term.getSubterm(0);
              IStrategoTerm arg7800 = term.getSubterm(1);
              if(arg7800.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg7800).intValue())
                break Fail21755;
              IStrategoTerm arg7801 = term.getSubterm(2);
              if(arg7801.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg7801).intValue())
                break Fail21755;
              term = (IStrategoTerm)termFactory.makeListCons(i_4258, (IStrategoList)trans.constCons2035);
              if(true)
                break Success11740;
            }
            term = term11848;
            IStrategoTerm term11849 = term;
            Success11741:
            { 
              Fail21756:
              { 
                IStrategoTerm x_4257 = null;
                IStrategoTerm y_4257 = null;
                IStrategoTerm z_4257 = null;
                IStrategoTerm c_4258 = null;
                IStrategoTerm d_4258 = null;
                IStrategoTerm g_4258 = null;
                IStrategoTerm h_4258 = null;
                if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                  break Fail21756;
                x_4257 = term.getSubterm(0);
                y_4257 = term.getSubterm(1);
                IStrategoTerm arg7802 = term.getSubterm(2);
                if(arg7802.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg7802).intValue())
                  break Fail21756;
                c_4258 = term;
                term = termFactory.makeTuple(y_4257, trans.const4227);
                term = gt_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21756;
                term = c_4258;
                d_4258 = c_4258;
                IStrategoTerm term11850 = term;
                Success11742:
                { 
                  Fail21757:
                  { 
                    term = termFactory.makeTuple(y_4257, trans.const4408);
                    term = numbered_arguments_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21757;
                    z_4257 = term;
                    if(true)
                      break Success11742;
                  }
                  term = term11850;
                  IStrategoTerm a_4258 = null;
                  IStrategoTerm b_4258 = null;
                  IStrategoTerm f_4258 = null;
                  a_4258 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21756;
                  b_4258 = term;
                  f_4258 = a_4258;
                  term = report_with_failure_0_2.instance.invoke(context, f_4258, trans.const4406, b_4258);
                  if(term == null)
                    break Fail21756;
                }
                term = d_4258;
                h_4258 = d_4258;
                if(z_4257 == null)
                  break Fail21756;
                term = termFactory.makeTuple(z_4257, trans.constCons1963);
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21756;
                g_4258 = term;
                term = h_4258;
                IStrategoList list190;
                list190 = checkListTail(g_4258);
                if(list190 == null)
                  break Fail21756;
                term = (IStrategoTerm)termFactory.makeListCons(x_4257, termFactory.makeListCons(trans.const4242, list190));
                if(true)
                  break Success11741;
              }
              term = term11849;
              IStrategoTerm term11851 = term;
              Success11743:
              { 
                Fail21758:
                { 
                  IStrategoTerm k_4257 = null;
                  IStrategoTerm l_4257 = null;
                  IStrategoTerm m_4257 = null;
                  IStrategoTerm p_4257 = null;
                  IStrategoTerm q_4257 = null;
                  IStrategoTerm t_4257 = null;
                  IStrategoTerm u_4257 = null;
                  if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                    break Fail21758;
                  k_4257 = term.getSubterm(0);
                  IStrategoTerm arg7803 = term.getSubterm(1);
                  if(arg7803.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg7803).intValue())
                    break Fail21758;
                  l_4257 = term.getSubterm(2);
                  p_4257 = term;
                  term = termFactory.makeTuple(l_4257, trans.const4227);
                  term = gt_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21758;
                  term = p_4257;
                  q_4257 = p_4257;
                  IStrategoTerm term11852 = term;
                  Success11744:
                  { 
                    Fail21759:
                    { 
                      term = termFactory.makeTuple(l_4257, trans.const4407);
                      term = numbered_arguments_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21759;
                      m_4257 = term;
                      if(true)
                        break Success11744;
                    }
                    term = term11852;
                    IStrategoTerm n_4257 = null;
                    IStrategoTerm o_4257 = null;
                    IStrategoTerm s_4257 = null;
                    n_4257 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail21758;
                    o_4257 = term;
                    s_4257 = n_4257;
                    term = report_with_failure_0_2.instance.invoke(context, s_4257, trans.const4406, o_4257);
                    if(term == null)
                      break Fail21758;
                  }
                  term = q_4257;
                  u_4257 = q_4257;
                  if(m_4257 == null)
                    break Fail21758;
                  term = termFactory.makeTuple(m_4257, trans.constCons1963);
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21758;
                  t_4257 = term;
                  term = u_4257;
                  IStrategoList list191;
                  list191 = checkListTail(t_4257);
                  if(list191 == null)
                    break Fail21758;
                  term = (IStrategoTerm)termFactory.makeListCons(k_4257, termFactory.makeListCons(trans.const4409, list191));
                  if(true)
                    break Success11743;
                }
                term = term11851;
                IStrategoTerm term11853 = term;
                Success11745:
                { 
                  Fail21760:
                  { 
                    IStrategoTerm t_4256 = null;
                    IStrategoTerm u_4256 = null;
                    IStrategoTerm v_4256 = null;
                    IStrategoTerm w_4256 = null;
                    IStrategoTerm x_4256 = null;
                    IStrategoTerm a_4257 = null;
                    IStrategoTerm b_4257 = null;
                    IStrategoTerm e_4257 = null;
                    IStrategoTerm f_4257 = null;
                    IStrategoTerm g_4257 = null;
                    IStrategoTerm h_4257 = null;
                    if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                      break Fail21760;
                    t_4256 = term.getSubterm(0);
                    u_4256 = term.getSubterm(1);
                    w_4256 = term.getSubterm(2);
                    a_4257 = term;
                    term = termFactory.makeTuple(u_4256, trans.const4227);
                    term = gt_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21760;
                    term = termFactory.makeTuple(w_4256, trans.const4227);
                    term = gt_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21760;
                    term = a_4257;
                    b_4257 = a_4257;
                    IStrategoTerm term11854 = term;
                    Success11746:
                    { 
                      Fail21761:
                      { 
                        term = termFactory.makeTuple(u_4256, trans.const4408);
                        term = numbered_arguments_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21761;
                        v_4256 = term;
                        term = termFactory.makeTuple(w_4256, trans.const4407);
                        term = numbered_arguments_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21761;
                        x_4256 = term;
                        if(true)
                          break Success11746;
                      }
                      term = term11854;
                      IStrategoTerm y_4256 = null;
                      IStrategoTerm z_4256 = null;
                      IStrategoTerm d_4257 = null;
                      y_4256 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21760;
                      z_4256 = term;
                      d_4257 = y_4256;
                      term = report_with_failure_0_2.instance.invoke(context, d_4257, trans.const4406, z_4256);
                      if(term == null)
                        break Fail21760;
                    }
                    term = b_4257;
                    f_4257 = b_4257;
                    h_4257 = term;
                    if(x_4256 == null)
                      break Fail21760;
                    term = termFactory.makeTuple(x_4256, trans.constCons1963);
                    term = make$Conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21760;
                    g_4257 = term;
                    term = h_4257;
                    if(v_4256 == null)
                      break Fail21760;
                    IStrategoList list192;
                    list192 = checkListTail(g_4257);
                    if(list192 == null)
                      break Fail21760;
                    term = termFactory.makeTuple(v_4256, (IStrategoTerm)termFactory.makeListCons(trans.const4410, list192));
                    term = make$Conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21760;
                    e_4257 = term;
                    term = f_4257;
                    IStrategoList list193;
                    list193 = checkListTail(e_4257);
                    if(list193 == null)
                      break Fail21760;
                    term = (IStrategoTerm)termFactory.makeListCons(t_4256, termFactory.makeListCons(trans.const4242, list193));
                    if(true)
                      break Success11745;
                  }
                  term = term11853;
                  IStrategoTerm q_4256 = null;
                  if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                    break Fail21749;
                  q_4256 = term.getSubterm(0);
                  IStrategoTerm arg7804 = term.getSubterm(1);
                  if(arg7804.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7804).isEmpty())
                    break Fail21749;
                  IStrategoTerm arg7805 = ((IStrategoList)arg7804).head();
                  if(arg7805.getTermType() != IStrategoTerm.APPL || Main._consDR_DUMMY_0 != ((IStrategoAppl)arg7805).getConstructor())
                    break Fail21749;
                  IStrategoTerm arg7806 = ((IStrategoList)arg7804).tail();
                  if(arg7806.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7806).isEmpty())
                    break Fail21749;
                  IStrategoTerm arg7807 = term.getSubterm(2);
                  if(arg7807.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7807).isEmpty())
                    break Fail21749;
                  IStrategoTerm arg7808 = ((IStrategoList)arg7807).head();
                  if(arg7808.getTermType() != IStrategoTerm.APPL || Main._consDR_DUMMY_0 != ((IStrategoAppl)arg7808).getConstructor())
                    break Fail21749;
                  IStrategoTerm arg7809 = ((IStrategoList)arg7807).tail();
                  if(arg7809.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7809).isEmpty())
                    break Fail21749;
                  term = q_4256;
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