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
    Fail23225:
    { 
      IStrategoTerm term12552 = term;
      Success12444:
      { 
        Fail23226:
        { 
          IStrategoTerm q_4812 = null;
          IStrategoTerm r_4812 = null;
          IStrategoTerm v_4812 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail23226;
          q_4812 = term.getSubterm(0);
          IStrategoTerm arg8266 = term.getSubterm(1);
          if(arg8266.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg8266).intValue())
            break Fail23226;
          v_4812 = term;
          IStrategoTerm term12553 = term;
          Success12445:
          { 
            Fail23227:
            { 
              Success12446:
              { 
                Fail23228:
                { 
                  IStrategoTerm s_4812 = null;
                  s_4812 = term;
                  term = is_constructor_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23228;
                  term = s_4812;
                  { 
                    term = trans.constCons2115;
                    r_4812 = trans.constCons2115;
                    if(true)
                      break Success12446;
                  }
                }
                term = trans.constNil4;
                r_4812 = trans.constNil4;
              }
              if(true)
                break Success12445;
            }
            term = term12553;
            IStrategoTerm t_4812 = null;
            IStrategoTerm u_4812 = null;
            IStrategoTerm x_4812 = null;
            t_4812 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail23226;
            u_4812 = term;
            x_4812 = t_4812;
            term = report_with_failure_0_2.instance.invoke(context, x_4812, trans.const4616, u_4812);
            if(term == null)
              break Fail23226;
          }
          term = v_4812;
          if(r_4812 == null)
            break Fail23226;
          IStrategoList list199;
          list199 = checkListTail(r_4812);
          if(list199 == null)
            break Fail23226;
          term = (IStrategoTerm)termFactory.makeListCons(q_4812, list199);
          if(true)
            break Success12444;
        }
        term = term12552;
        IStrategoTerm term12555 = term;
        Success12447:
        { 
          Fail23229:
          { 
            IStrategoTerm d_4812 = null;
            IStrategoTerm e_4812 = null;
            IStrategoTerm f_4812 = null;
            IStrategoTerm i_4812 = null;
            IStrategoTerm j_4812 = null;
            IStrategoTerm m_4812 = null;
            IStrategoTerm n_4812 = null;
            if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
              break Fail23229;
            d_4812 = term.getSubterm(0);
            e_4812 = term.getSubterm(1);
            i_4812 = term;
            term = termFactory.makeTuple(e_4812, trans.const4437);
            term = gt_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23229;
            term = i_4812;
            j_4812 = i_4812;
            IStrategoTerm term12556 = term;
            Success12448:
            { 
              Fail23230:
              { 
                term = termFactory.makeTuple(e_4812, trans.const4617);
                term = numbered_arguments_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23230;
                f_4812 = term;
                if(true)
                  break Success12448;
              }
              term = term12556;
              IStrategoTerm g_4812 = null;
              IStrategoTerm h_4812 = null;
              IStrategoTerm l_4812 = null;
              g_4812 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23229;
              h_4812 = term;
              l_4812 = g_4812;
              term = report_with_failure_0_2.instance.invoke(context, l_4812, trans.const4616, h_4812);
              if(term == null)
                break Fail23229;
            }
            term = j_4812;
            n_4812 = j_4812;
            if(f_4812 == null)
              break Fail23229;
            term = termFactory.makeTuple(f_4812, trans.constCons2044);
            term = make$Conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23229;
            m_4812 = term;
            term = n_4812;
            IStrategoList list200;
            list200 = checkListTail(m_4812);
            if(list200 == null)
              break Fail23229;
            term = (IStrategoTerm)termFactory.makeListCons(d_4812, termFactory.makeListCons(trans.const4452, list200));
            if(true)
              break Success12447;
          }
          term = term12555;
          IStrategoTerm term12557 = term;
          Success12449:
          { 
            Fail23231:
            { 
              IStrategoTerm a_4812 = null;
              if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                break Fail23231;
              a_4812 = term.getSubterm(0);
              IStrategoTerm arg8267 = term.getSubterm(1);
              if(arg8267.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg8267).intValue())
                break Fail23231;
              IStrategoTerm arg8268 = term.getSubterm(2);
              if(arg8268.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg8268).intValue())
                break Fail23231;
              term = (IStrategoTerm)termFactory.makeListCons(a_4812, (IStrategoList)trans.constCons2116);
              if(true)
                break Success12449;
            }
            term = term12557;
            IStrategoTerm term12558 = term;
            Success12450:
            { 
              Fail23232:
              { 
                IStrategoTerm p_4811 = null;
                IStrategoTerm q_4811 = null;
                IStrategoTerm r_4811 = null;
                IStrategoTerm u_4811 = null;
                IStrategoTerm v_4811 = null;
                IStrategoTerm y_4811 = null;
                IStrategoTerm z_4811 = null;
                if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                  break Fail23232;
                p_4811 = term.getSubterm(0);
                q_4811 = term.getSubterm(1);
                IStrategoTerm arg8269 = term.getSubterm(2);
                if(arg8269.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg8269).intValue())
                  break Fail23232;
                u_4811 = term;
                term = termFactory.makeTuple(q_4811, trans.const4437);
                term = gt_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23232;
                term = u_4811;
                v_4811 = u_4811;
                IStrategoTerm term12559 = term;
                Success12451:
                { 
                  Fail23233:
                  { 
                    term = termFactory.makeTuple(q_4811, trans.const4618);
                    term = numbered_arguments_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23233;
                    r_4811 = term;
                    if(true)
                      break Success12451;
                  }
                  term = term12559;
                  IStrategoTerm s_4811 = null;
                  IStrategoTerm t_4811 = null;
                  IStrategoTerm x_4811 = null;
                  s_4811 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23232;
                  t_4811 = term;
                  x_4811 = s_4811;
                  term = report_with_failure_0_2.instance.invoke(context, x_4811, trans.const4616, t_4811);
                  if(term == null)
                    break Fail23232;
                }
                term = v_4811;
                z_4811 = v_4811;
                if(r_4811 == null)
                  break Fail23232;
                term = termFactory.makeTuple(r_4811, trans.constCons2044);
                term = make$Conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23232;
                y_4811 = term;
                term = z_4811;
                IStrategoList list201;
                list201 = checkListTail(y_4811);
                if(list201 == null)
                  break Fail23232;
                term = (IStrategoTerm)termFactory.makeListCons(p_4811, termFactory.makeListCons(trans.const4452, list201));
                if(true)
                  break Success12450;
              }
              term = term12558;
              IStrategoTerm term12560 = term;
              Success12452:
              { 
                Fail23234:
                { 
                  IStrategoTerm c_4811 = null;
                  IStrategoTerm d_4811 = null;
                  IStrategoTerm e_4811 = null;
                  IStrategoTerm h_4811 = null;
                  IStrategoTerm i_4811 = null;
                  IStrategoTerm l_4811 = null;
                  IStrategoTerm m_4811 = null;
                  if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                    break Fail23234;
                  c_4811 = term.getSubterm(0);
                  IStrategoTerm arg8270 = term.getSubterm(1);
                  if(arg8270.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)arg8270).intValue())
                    break Fail23234;
                  d_4811 = term.getSubterm(2);
                  h_4811 = term;
                  term = termFactory.makeTuple(d_4811, trans.const4437);
                  term = gt_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23234;
                  term = h_4811;
                  i_4811 = h_4811;
                  IStrategoTerm term12561 = term;
                  Success12453:
                  { 
                    Fail23235:
                    { 
                      term = termFactory.makeTuple(d_4811, trans.const4617);
                      term = numbered_arguments_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23235;
                      e_4811 = term;
                      if(true)
                        break Success12453;
                    }
                    term = term12561;
                    IStrategoTerm f_4811 = null;
                    IStrategoTerm g_4811 = null;
                    IStrategoTerm k_4811 = null;
                    f_4811 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail23234;
                    g_4811 = term;
                    k_4811 = f_4811;
                    term = report_with_failure_0_2.instance.invoke(context, k_4811, trans.const4616, g_4811);
                    if(term == null)
                      break Fail23234;
                  }
                  term = i_4811;
                  m_4811 = i_4811;
                  if(e_4811 == null)
                    break Fail23234;
                  term = termFactory.makeTuple(e_4811, trans.constCons2044);
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23234;
                  l_4811 = term;
                  term = m_4811;
                  IStrategoList list202;
                  list202 = checkListTail(l_4811);
                  if(list202 == null)
                    break Fail23234;
                  term = (IStrategoTerm)termFactory.makeListCons(c_4811, termFactory.makeListCons(trans.const4619, list202));
                  if(true)
                    break Success12452;
                }
                term = term12560;
                IStrategoTerm term12562 = term;
                Success12454:
                { 
                  Fail23236:
                  { 
                    IStrategoTerm l_4810 = null;
                    IStrategoTerm m_4810 = null;
                    IStrategoTerm n_4810 = null;
                    IStrategoTerm o_4810 = null;
                    IStrategoTerm p_4810 = null;
                    IStrategoTerm s_4810 = null;
                    IStrategoTerm t_4810 = null;
                    IStrategoTerm w_4810 = null;
                    IStrategoTerm x_4810 = null;
                    IStrategoTerm y_4810 = null;
                    IStrategoTerm z_4810 = null;
                    if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                      break Fail23236;
                    l_4810 = term.getSubterm(0);
                    m_4810 = term.getSubterm(1);
                    o_4810 = term.getSubterm(2);
                    s_4810 = term;
                    term = termFactory.makeTuple(m_4810, trans.const4437);
                    term = gt_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23236;
                    term = termFactory.makeTuple(o_4810, trans.const4437);
                    term = gt_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23236;
                    term = s_4810;
                    t_4810 = s_4810;
                    IStrategoTerm term12563 = term;
                    Success12455:
                    { 
                      Fail23237:
                      { 
                        term = termFactory.makeTuple(m_4810, trans.const4618);
                        term = numbered_arguments_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23237;
                        n_4810 = term;
                        term = termFactory.makeTuple(o_4810, trans.const4617);
                        term = numbered_arguments_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23237;
                        p_4810 = term;
                        if(true)
                          break Success12455;
                      }
                      term = term12563;
                      IStrategoTerm q_4810 = null;
                      IStrategoTerm r_4810 = null;
                      IStrategoTerm v_4810 = null;
                      q_4810 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23236;
                      r_4810 = term;
                      v_4810 = q_4810;
                      term = report_with_failure_0_2.instance.invoke(context, v_4810, trans.const4616, r_4810);
                      if(term == null)
                        break Fail23236;
                    }
                    term = t_4810;
                    x_4810 = t_4810;
                    z_4810 = term;
                    if(p_4810 == null)
                      break Fail23236;
                    term = termFactory.makeTuple(p_4810, trans.constCons2044);
                    term = make$Conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23236;
                    y_4810 = term;
                    term = z_4810;
                    if(n_4810 == null)
                      break Fail23236;
                    IStrategoList list203;
                    list203 = checkListTail(y_4810);
                    if(list203 == null)
                      break Fail23236;
                    term = termFactory.makeTuple(n_4810, (IStrategoTerm)termFactory.makeListCons(trans.const4620, list203));
                    term = make$Conc_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23236;
                    w_4810 = term;
                    term = x_4810;
                    IStrategoList list204;
                    list204 = checkListTail(w_4810);
                    if(list204 == null)
                      break Fail23236;
                    term = (IStrategoTerm)termFactory.makeListCons(l_4810, termFactory.makeListCons(trans.const4452, list204));
                    if(true)
                      break Success12454;
                  }
                  term = term12562;
                  IStrategoTerm i_4810 = null;
                  if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
                    break Fail23225;
                  i_4810 = term.getSubterm(0);
                  IStrategoTerm arg8271 = term.getSubterm(1);
                  if(arg8271.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8271).isEmpty())
                    break Fail23225;
                  IStrategoTerm arg8272 = ((IStrategoList)arg8271).head();
                  if(arg8272.getTermType() != IStrategoTerm.APPL || Main._consDR_DUMMY_0 != ((IStrategoAppl)arg8272).getConstructor())
                    break Fail23225;
                  IStrategoTerm arg8273 = ((IStrategoList)arg8271).tail();
                  if(arg8273.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8273).isEmpty())
                    break Fail23225;
                  IStrategoTerm arg8274 = term.getSubterm(2);
                  if(arg8274.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8274).isEmpty())
                    break Fail23225;
                  IStrategoTerm arg8275 = ((IStrategoList)arg8274).head();
                  if(arg8275.getTermType() != IStrategoTerm.APPL || Main._consDR_DUMMY_0 != ((IStrategoAppl)arg8275).getConstructor())
                    break Fail23225;
                  IStrategoTerm arg8276 = ((IStrategoList)arg8274).tail();
                  if(arg8276.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8276).isEmpty())
                    break Fail23225;
                  term = i_4810;
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