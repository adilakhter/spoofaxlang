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

@SuppressWarnings("all") public class global_constraint_error_0_0 extends Strategy 
{ 
  public static global_constraint_error_0_0 instance = new global_constraint_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("global_constraint_error_0_0");
    Fail23238:
    { 
      IStrategoTerm term12564 = term;
      IStrategoConstructor cons595 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12456:
      { 
        if(cons595 == Main._consCallT_3)
        { 
          Fail23239:
          { 
            IStrategoTerm h_4816 = null;
            IStrategoTerm m_4816 = null;
            IStrategoTerm o_4816 = null;
            IStrategoTerm p_4816 = null;
            IStrategoTerm arg8277 = term.getSubterm(0);
            if(arg8277.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg8277).getConstructor())
              break Fail23239;
            h_4816 = arg8277.getSubterm(0);
            IStrategoTerm term12565 = term;
            Success12457:
            { 
              Fail23240:
              { 
                term = is_declared_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23240;
                { 
                  if(true)
                    break Fail23239;
                  if(true)
                    break Success12457;
                }
              }
              term = term12565;
            }
            term = h_4816;
            IStrategoTerm term12566 = term;
            Success12458:
            { 
              Fail23241:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23241;
                if(true)
                  break Success12458;
              }
              term = term12566;
              IStrategoTerm term12567 = term;
              Success12459:
              { 
                Fail23242:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23242;
                  if(true)
                    break Success12459;
                }
                term = term12567;
                IStrategoTerm term12568 = term;
                Success12460:
                { 
                  Fail23243:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23243;
                    if(true)
                      break Success12460;
                  }
                  term = term12568;
                  IStrategoTerm term12569 = term;
                  Success12461:
                  { 
                    Fail23244:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23244;
                      if(true)
                        break Success12461;
                    }
                    term = term12569;
                    IStrategoTerm i_4816 = null;
                    IStrategoTerm j_4816 = null;
                    IStrategoTerm l_4816 = null;
                    i_4816 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail23239;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail23239;
                    j_4816 = ((IStrategoList)term).tail();
                    l_4816 = j_4816;
                    term = report_failure_0_2.instance.invoke(context, l_4816, trans.const4621, i_4816);
                    if(term == null)
                      break Fail23239;
                  }
                }
              }
            }
            o_4816 = term;
            m_4816 = trans.const4440;
            p_4816 = o_4816;
            term = string_replace_0_2.instance.invoke(context, p_4816, m_4816, trans.const4622);
            if(term == null)
              break Fail23239;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const4624, termFactory.makeListCons(term, (IStrategoList)trans.constCons2117));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23239;
            term = termFactory.makeTuple(h_4816, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
            if(true)
              break Success12456;
          }
          term = term12564;
        }
        Success12462:
        { 
          if(cons595 == Main._consOp_2)
          { 
            Fail23245:
            { 
              IStrategoTerm g_4815 = null;
              IStrategoTerm h_4815 = null;
              IStrategoTerm b_4816 = null;
              IStrategoTerm m_4815 = null;
              IStrategoTerm o_4815 = null;
              IStrategoTerm p_4815 = null;
              IStrategoTerm u_4815 = null;
              IStrategoTerm w_4815 = null;
              IStrategoTerm x_4815 = null;
              g_4815 = term.getSubterm(0);
              h_4815 = term.getSubterm(1);
              term = require_1_0.instance.invoke(context, term, is_declared_0_0.instance);
              if(term == null)
                break Fail23245;
              term = g_4815;
              IStrategoTerm term12571 = term;
              Success12463:
              { 
                Fail23246:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23246;
                  if(true)
                    break Success12463;
                }
                term = term12571;
                IStrategoTerm term12572 = term;
                Success12464:
                { 
                  Fail23247:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23247;
                    if(true)
                      break Success12464;
                  }
                  term = term12572;
                  IStrategoTerm term12573 = term;
                  Success12465:
                  { 
                    Fail23248:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23248;
                      if(true)
                        break Success12465;
                    }
                    term = term12573;
                    IStrategoTerm term12574 = term;
                    Success12466:
                    { 
                      Fail23249:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23249;
                        if(true)
                          break Success12466;
                      }
                      term = term12574;
                      IStrategoTerm i_4815 = null;
                      IStrategoTerm j_4815 = null;
                      IStrategoTerm l_4815 = null;
                      i_4815 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23245;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail23245;
                      j_4815 = ((IStrategoList)term).tail();
                      l_4815 = j_4815;
                      term = report_failure_0_2.instance.invoke(context, l_4815, trans.const4621, i_4815);
                      if(term == null)
                        break Fail23245;
                    }
                  }
                }
              }
              o_4815 = term;
              m_4815 = trans.const4440;
              p_4815 = o_4815;
              term = string_replace_0_2.instance.invoke(context, p_4815, m_4815, trans.const4545);
              if(term == null)
                break Fail23245;
              b_4816 = term;
              term = length_0_0.instance.invoke(context, h_4815);
              if(term == null)
                break Fail23245;
              IStrategoTerm term12575 = term;
              Success12467:
              { 
                Fail23250:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23250;
                  if(true)
                    break Success12467;
                }
                term = term12575;
                IStrategoTerm term12576 = term;
                Success12468:
                { 
                  Fail23251:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23251;
                    if(true)
                      break Success12468;
                  }
                  term = term12576;
                  IStrategoTerm term12577 = term;
                  Success12469:
                  { 
                    Fail23252:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23252;
                      if(true)
                        break Success12469;
                    }
                    term = term12577;
                    IStrategoTerm term12578 = term;
                    Success12470:
                    { 
                      Fail23253:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23253;
                        if(true)
                          break Success12470;
                      }
                      term = term12578;
                      IStrategoTerm q_4815 = null;
                      IStrategoTerm r_4815 = null;
                      IStrategoTerm t_4815 = null;
                      q_4815 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23245;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail23245;
                      r_4815 = ((IStrategoList)term).tail();
                      t_4815 = r_4815;
                      term = report_failure_0_2.instance.invoke(context, t_4815, trans.const4621, q_4815);
                      if(term == null)
                        break Fail23245;
                    }
                  }
                }
              }
              w_4815 = term;
              u_4815 = trans.const4440;
              x_4815 = w_4815;
              term = string_replace_0_2.instance.invoke(context, x_4815, u_4815, trans.const4625);
              if(term == null)
                break Fail23245;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4627, termFactory.makeListCons(b_4816, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constCons2118))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23245;
              term = termFactory.makeTuple(g_4815, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
              if(true)
                break Success12462;
            }
            term = term12564;
          }
          IStrategoTerm term12579 = term;
          Success12471:
          { 
            Fail23254:
            { 
              TermReference s_4814 = new TermReference();
              IStrategoTerm b_4815 = null;
              IStrategoTerm c_4815 = null;
              IStrategoTerm d_4815 = null;
              IStrategoTerm x_4814 = null;
              IStrategoTerm z_4814 = null;
              IStrategoTerm a_4815 = null;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)term).getConstructor())
                break Fail23254;
              if(s_4814.value == null)
                s_4814.value = term.getSubterm(0);
              else
                if(s_4814.value != term.getSubterm(0) && !s_4814.value.match(term.getSubterm(0)))
                  break Fail23254;
              b_4815 = term;
              lifted6931 lifted69310 = new lifted6931();
              lifted69310.s_4814 = s_4814;
              term = require_1_0.instance.invoke(context, term, lifted69310);
              if(term == null)
                break Fail23254;
              term = b_4815;
              d_4815 = b_4815;
              if(s_4814.value == null)
                break Fail23254;
              term = s_4814.value;
              IStrategoTerm term12581 = term;
              Success12472:
              { 
                Fail23255:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23255;
                  if(true)
                    break Success12472;
                }
                term = term12581;
                IStrategoTerm term12582 = term;
                Success12473:
                { 
                  Fail23256:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23256;
                    if(true)
                      break Success12473;
                  }
                  term = term12582;
                  IStrategoTerm term12583 = term;
                  Success12474:
                  { 
                    Fail23257:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23257;
                      if(true)
                        break Success12474;
                    }
                    term = term12583;
                    IStrategoTerm term12584 = term;
                    Success12475:
                    { 
                      Fail23258:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23258;
                        if(true)
                          break Success12475;
                      }
                      term = term12584;
                      IStrategoTerm t_4814 = null;
                      IStrategoTerm u_4814 = null;
                      IStrategoTerm w_4814 = null;
                      t_4814 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23254;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail23254;
                      u_4814 = ((IStrategoList)term).tail();
                      w_4814 = u_4814;
                      term = report_failure_0_2.instance.invoke(context, w_4814, trans.const4621, t_4814);
                      if(term == null)
                        break Fail23254;
                    }
                  }
                }
              }
              z_4814 = term;
              x_4814 = trans.const4440;
              a_4815 = z_4814;
              term = string_replace_0_2.instance.invoke(context, a_4815, x_4814, trans.const4622);
              if(term == null)
                break Fail23254;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4628, termFactory.makeListCons(term, (IStrategoList)trans.constCons2060));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23254;
              c_4815 = term;
              term = d_4815;
              if(s_4814.value == null)
                break Fail23254;
              term = termFactory.makeTuple(s_4814.value, termFactory.annotateTerm(c_4815, checkListAnnos(termFactory, trans.constNil4)));
              if(true)
                break Success12471;
            }
            term = term12579;
            IStrategoTerm term12585 = term;
            IStrategoConstructor cons596 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
            Success12476:
            { 
              if(cons596 == Main._consDynRuleScopeId_1)
              { 
                Fail23259:
                { 
                  IStrategoTerm e_4814 = null;
                  IStrategoTerm j_4814 = null;
                  IStrategoTerm l_4814 = null;
                  IStrategoTerm m_4814 = null;
                  e_4814 = term.getSubterm(0);
                  term = require_1_0.instance.invoke(context, term, is_declared_0_0.instance);
                  if(term == null)
                    break Fail23259;
                  term = e_4814;
                  IStrategoTerm term12586 = term;
                  Success12477:
                  { 
                    Fail23260:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23260;
                      if(true)
                        break Success12477;
                    }
                    term = term12586;
                    IStrategoTerm term12587 = term;
                    Success12478:
                    { 
                      Fail23261:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23261;
                        if(true)
                          break Success12478;
                      }
                      term = term12587;
                      IStrategoTerm term12588 = term;
                      Success12479:
                      { 
                        Fail23262:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail23262;
                          if(true)
                            break Success12479;
                        }
                        term = term12588;
                        IStrategoTerm term12589 = term;
                        Success12480:
                        { 
                          Fail23263:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail23263;
                            if(true)
                              break Success12480;
                          }
                          term = term12589;
                          IStrategoTerm f_4814 = null;
                          IStrategoTerm g_4814 = null;
                          IStrategoTerm i_4814 = null;
                          f_4814 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail23259;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail23259;
                          g_4814 = ((IStrategoList)term).tail();
                          i_4814 = g_4814;
                          term = report_failure_0_2.instance.invoke(context, i_4814, trans.const4621, f_4814);
                          if(term == null)
                            break Fail23259;
                        }
                      }
                    }
                  }
                  l_4814 = term;
                  j_4814 = trans.const4440;
                  m_4814 = l_4814;
                  term = string_replace_0_2.instance.invoke(context, m_4814, j_4814, trans.const4629);
                  if(term == null)
                    break Fail23259;
                  term = (IStrategoTerm)termFactory.makeListCons(trans.const4630, termFactory.makeListCons(term, (IStrategoList)trans.constCons2117));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23259;
                  term = termFactory.makeTuple(e_4814, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
                  if(true)
                    break Success12476;
                }
                term = term12585;
              }
              Success12481:
              { 
                if(cons596 == Main._consLabeledDynRuleId_2)
                { 
                  Fail23264:
                  { 
                    IStrategoTerm q_4813 = null;
                    IStrategoTerm v_4813 = null;
                    IStrategoTerm x_4813 = null;
                    IStrategoTerm y_4813 = null;
                    q_4813 = term.getSubterm(0);
                    term = require_1_0.instance.invoke(context, term, is_declared_0_0.instance);
                    if(term == null)
                      break Fail23264;
                    term = q_4813;
                    IStrategoTerm term12591 = term;
                    Success12482:
                    { 
                      Fail23265:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23265;
                        if(true)
                          break Success12482;
                      }
                      term = term12591;
                      IStrategoTerm term12592 = term;
                      Success12483:
                      { 
                        Fail23266:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail23266;
                          if(true)
                            break Success12483;
                        }
                        term = term12592;
                        IStrategoTerm term12593 = term;
                        Success12484:
                        { 
                          Fail23267:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail23267;
                            if(true)
                              break Success12484;
                          }
                          term = term12593;
                          IStrategoTerm term12594 = term;
                          Success12485:
                          { 
                            Fail23268:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail23268;
                              if(true)
                                break Success12485;
                            }
                            term = term12594;
                            IStrategoTerm r_4813 = null;
                            IStrategoTerm s_4813 = null;
                            IStrategoTerm u_4813 = null;
                            r_4813 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail23264;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail23264;
                            s_4813 = ((IStrategoList)term).tail();
                            u_4813 = s_4813;
                            term = report_failure_0_2.instance.invoke(context, u_4813, trans.const4621, r_4813);
                            if(term == null)
                              break Fail23264;
                          }
                        }
                      }
                    }
                    x_4813 = term;
                    v_4813 = trans.const4440;
                    y_4813 = x_4813;
                    term = string_replace_0_2.instance.invoke(context, y_4813, v_4813, trans.const4629);
                    if(term == null)
                      break Fail23264;
                    term = (IStrategoTerm)termFactory.makeListCons(trans.const4630, termFactory.makeListCons(term, (IStrategoList)trans.constCons2117));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23264;
                    term = termFactory.makeTuple(q_4813, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
                    if(true)
                      break Success12481;
                  }
                  term = term12585;
                }
                IStrategoTerm b_4813 = null;
                TermReference c_4813 = new TermReference();
                IStrategoTerm h_4813 = null;
                IStrategoTerm j_4813 = null;
                IStrategoTerm k_4813 = null;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
                  break Fail23238;
                IStrategoTerm arg8285 = term.getSubterm(0);
                b_4813 = arg8285;
                IStrategoList annos714 = arg8285.getAnnotations();
                if(annos714.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos714).isEmpty())
                  break Fail23238;
                if(c_4813.value == null)
                  c_4813.value = ((IStrategoList)annos714).head();
                else
                  if(c_4813.value != ((IStrategoList)annos714).head() && !c_4813.value.match(((IStrategoList)annos714).head()))
                    break Fail23238;
                IStrategoTerm arg8286 = ((IStrategoList)annos714).tail();
                if(arg8286.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8286).isEmpty())
                  break Fail23238;
                lifted6934 lifted69340 = new lifted6934();
                lifted69340.c_4813 = c_4813;
                term = require_1_0.instance.invoke(context, term, lifted69340);
                if(term == null)
                  break Fail23238;
                term = b_4813;
                IStrategoTerm term12596 = term;
                Success12486:
                { 
                  Fail23269:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23269;
                    if(true)
                      break Success12486;
                  }
                  term = term12596;
                  IStrategoTerm term12597 = term;
                  Success12487:
                  { 
                    Fail23270:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23270;
                      if(true)
                        break Success12487;
                    }
                    term = term12597;
                    IStrategoTerm term12598 = term;
                    Success12488:
                    { 
                      Fail23271:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23271;
                        if(true)
                          break Success12488;
                      }
                      term = term12598;
                      IStrategoTerm term12599 = term;
                      Success12489:
                      { 
                        Fail23272:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail23272;
                          if(true)
                            break Success12489;
                        }
                        term = term12599;
                        IStrategoTerm d_4813 = null;
                        IStrategoTerm e_4813 = null;
                        IStrategoTerm g_4813 = null;
                        d_4813 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail23238;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail23238;
                        e_4813 = ((IStrategoList)term).tail();
                        g_4813 = e_4813;
                        term = report_failure_0_2.instance.invoke(context, g_4813, trans.const4621, d_4813);
                        if(term == null)
                          break Fail23238;
                      }
                    }
                  }
                }
                j_4813 = term;
                h_4813 = trans.const4440;
                k_4813 = j_4813;
                term = string_replace_0_2.instance.invoke(context, k_4813, h_4813, trans.const4631);
                if(term == null)
                  break Fail23238;
                term = (IStrategoTerm)termFactory.makeListCons(trans.const4632, termFactory.makeListCons(term, (IStrategoList)trans.constCons2060));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23238;
                term = termFactory.makeTuple(b_4813, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
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