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

@SuppressWarnings("all") public class basic_desugar_0_0 extends Strategy 
{ 
  public static basic_desugar_0_0 instance = new basic_desugar_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("basic_desugar_0_0");
    Fail21496:
    { 
      IStrategoTerm term11600 = term;
      IStrategoConstructor cons542 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11531:
      { 
        if(cons542 == Main._consSDef_3)
        { 
          Fail21497:
          { 
            IStrategoTerm z_4209 = null;
            IStrategoTerm a_4210 = null;
            IStrategoTerm b_4210 = null;
            z_4209 = term.getSubterm(0);
            a_4210 = term.getSubterm(1);
            b_4210 = term.getSubterm(2);
            term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{z_4209, a_4210, trans.constNil3, b_4210});
            if(true)
              break Success11531;
          }
          term = term11600;
        }
        Success11532:
        { 
          if(cons542 == Main._consRDef_3)
          { 
            Fail21498:
            { 
              IStrategoTerm w_4209 = null;
              IStrategoTerm x_4209 = null;
              IStrategoTerm y_4209 = null;
              w_4209 = term.getSubterm(0);
              x_4209 = term.getSubterm(1);
              y_4209 = term.getSubterm(2);
              term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{w_4209, x_4209, trans.constNil3, termFactory.makeAppl(Main._consSRule_1, new IStrategoTerm[]{y_4209})});
              if(true)
                break Success11532;
            }
            term = term11600;
          }
          Success11533:
          { 
            if(cons542 == Main._consRDefT_4)
            { 
              Fail21499:
              { 
                IStrategoTerm s_4209 = null;
                IStrategoTerm t_4209 = null;
                IStrategoTerm u_4209 = null;
                IStrategoTerm v_4209 = null;
                s_4209 = term.getSubterm(0);
                t_4209 = term.getSubterm(1);
                u_4209 = term.getSubterm(2);
                v_4209 = term.getSubterm(3);
                term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{s_4209, t_4209, u_4209, termFactory.makeAppl(Main._consSRule_1, new IStrategoTerm[]{v_4209})});
                if(true)
                  break Success11533;
              }
              term = term11600;
            }
            Success11534:
            { 
              if(cons542 == Main._consRDec_2)
              { 
                Fail21500:
                { 
                  IStrategoTerm q_4209 = null;
                  IStrategoTerm r_4209 = null;
                  q_4209 = term.getSubterm(0);
                  r_4209 = term.getSubterm(1);
                  term = termFactory.makeAppl(Main._consRDecT_3, new IStrategoTerm[]{q_4209, r_4209, trans.constNil3});
                  if(true)
                    break Success11534;
                }
                term = term11600;
              }
              Success11535:
              { 
                if(cons542 == Main._consSDefNoArgs_2)
                { 
                  Fail21501:
                  { 
                    IStrategoTerm o_4209 = null;
                    IStrategoTerm p_4209 = null;
                    o_4209 = term.getSubterm(0);
                    p_4209 = term.getSubterm(1);
                    term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{o_4209, trans.constNil3, trans.constNil3, p_4209});
                    if(true)
                      break Success11535;
                  }
                  term = term11600;
                }
                Success11536:
                { 
                  if(cons542 == Main._consRDefNoArgs_2)
                  { 
                    Fail21502:
                    { 
                      IStrategoTerm m_4209 = null;
                      IStrategoTerm n_4209 = null;
                      m_4209 = term.getSubterm(0);
                      n_4209 = term.getSubterm(1);
                      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{m_4209, trans.constNil3, trans.constNil3, termFactory.makeAppl(Main._consSRule_1, new IStrategoTerm[]{n_4209})});
                      if(true)
                        break Success11536;
                    }
                    term = term11600;
                  }
                  Success11537:
                  { 
                    if(cons542 == Main._consRule_3)
                    { 
                      Fail21503:
                      { 
                        IStrategoTerm i_4209 = null;
                        IStrategoTerm j_4209 = null;
                        IStrategoTerm k_4209 = null;
                        i_4209 = term.getSubterm(0);
                        j_4209 = term.getSubterm(1);
                        k_4209 = term.getSubterm(2);
                        term = k_4209;
                        IStrategoTerm term11607 = term;
                        Success11538:
                        { 
                          Fail21504:
                          { 
                            term = is_list_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail21504;
                            { 
                              if(true)
                                break Fail21503;
                              if(true)
                                break Success11538;
                            }
                          }
                          term = term11607;
                        }
                        term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{i_4209, j_4209, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consWhereClause_1, new IStrategoTerm[]{k_4209}), (IStrategoList)trans.constNil3)});
                        if(true)
                          break Success11537;
                      }
                      term = term11600;
                    }
                    Success11539:
                    { 
                      if(cons542 == Main._consOverlayNoArgs_2)
                      { 
                        Fail21505:
                        { 
                          IStrategoTerm g_4209 = null;
                          IStrategoTerm h_4209 = null;
                          g_4209 = term.getSubterm(0);
                          h_4209 = term.getSubterm(1);
                          term = termFactory.makeAppl(Main._consOverlay_3, new IStrategoTerm[]{g_4209, trans.constNil3, h_4209});
                          if(true)
                            break Success11539;
                        }
                        term = term11600;
                      }
                      Success11540:
                      { 
                        if(cons542 == Main._consRDecNoArgs_1)
                        { 
                          Fail21506:
                          { 
                            IStrategoTerm f_4209 = null;
                            f_4209 = term.getSubterm(0);
                            term = termFactory.makeAppl(Main._consRDecT_3, new IStrategoTerm[]{f_4209, trans.constNil3, trans.constNil3});
                            if(true)
                              break Success11540;
                          }
                          term = term11600;
                        }
                        Success11541:
                        { 
                          if(cons542 == Main._consCall_2)
                          { 
                            Fail21507:
                            { 
                              IStrategoTerm d_4209 = null;
                              IStrategoTerm e_4209 = null;
                              d_4209 = term.getSubterm(0);
                              e_4209 = term.getSubterm(1);
                              term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{d_4209, e_4209, trans.constNil3});
                              if(true)
                                break Success11541;
                            }
                            term = term11600;
                          }
                          Success11542:
                          { 
                            if(cons542 == Main._consCallNoArgs_1)
                            { 
                              Fail21508:
                              { 
                                IStrategoTerm c_4209 = null;
                                c_4209 = term.getSubterm(0);
                                term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{c_4209, trans.constNil3, trans.constNil3});
                                if(true)
                                  break Success11542;
                              }
                              term = term11600;
                            }
                            Success11543:
                            { 
                              if(cons542 == Main._consListVar_1)
                              { 
                                Fail21509:
                                { 
                                  IStrategoTerm b_4209 = null;
                                  b_4209 = term.getSubterm(0);
                                  term = b_4209;
                                  if(true)
                                    break Success11543;
                                }
                                term = term11600;
                              }
                              Success11544:
                              { 
                                if(cons542 == Main._consDefaultVarDec_1)
                                { 
                                  Fail21510:
                                  { 
                                    IStrategoTerm a_4209 = null;
                                    a_4209 = term.getSubterm(0);
                                    term = termFactory.makeAppl(Main._consVarDec_2, new IStrategoTerm[]{a_4209, trans.constConstType0});
                                    if(true)
                                      break Success11544;
                                  }
                                  term = term11600;
                                }
                                Success11545:
                                { 
                                  if(cons542 == Main._consRuleNoCond_2)
                                  { 
                                    Fail21511:
                                    { 
                                      IStrategoTerm y_4208 = null;
                                      IStrategoTerm z_4208 = null;
                                      y_4208 = term.getSubterm(0);
                                      z_4208 = term.getSubterm(1);
                                      term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{y_4208, z_4208, trans.constNil3});
                                      if(true)
                                        break Success11545;
                                    }
                                    term = term11600;
                                  }
                                  Success11546:
                                  { 
                                    if(cons542 == Main._consLRule_1)
                                    { 
                                      Fail21512:
                                      { 
                                        IStrategoTerm s_4208 = null;
                                        IStrategoTerm t_4208 = null;
                                        IStrategoTerm u_4208 = null;
                                        s_4208 = term.getSubterm(0);
                                        term = topdown_1_0.instance.invoke(context, s_4208, lifted6557.instance);
                                        if(term == null)
                                          break Fail21512;
                                        t_4208 = term;
                                        if(term.getTermType() != IStrategoTerm.APPL || Main._consRule_3 != ((IStrategoAppl)term).getConstructor())
                                          break Fail21512;
                                        u_4208 = term.getSubterm(0);
                                        term = collect_all_1_0.instance.invoke(context, u_4208, lifted6560.instance);
                                        if(term == null)
                                          break Fail21512;
                                        term = termFactory.makeAppl(Main._consScope_2, new IStrategoTerm[]{term, termFactory.makeAppl(Main._consSRule_1, new IStrategoTerm[]{t_4208})});
                                        if(true)
                                          break Success11546;
                                      }
                                      term = term11600;
                                    }
                                    Success11547:
                                    { 
                                      if(cons542 == Main._consChoice_2)
                                      { 
                                        Fail21513:
                                        { 
                                          IStrategoTerm q_4208 = null;
                                          IStrategoTerm r_4208 = null;
                                          q_4208 = term.getSubterm(0);
                                          r_4208 = term.getSubterm(1);
                                          term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{q_4208, trans.constId0, r_4208});
                                          term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                          if(term == null)
                                            break Fail21513;
                                          if(true)
                                            break Success11547;
                                        }
                                        term = term11600;
                                      }
                                      Success11548:
                                      { 
                                        if(cons542 == Main._consLChoice_2)
                                        { 
                                          Fail21514:
                                          { 
                                            IStrategoTerm o_4208 = null;
                                            IStrategoTerm p_4208 = null;
                                            o_4208 = term.getSubterm(0);
                                            p_4208 = term.getSubterm(1);
                                            term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{o_4208, trans.constId0, p_4208});
                                            term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                            if(term == null)
                                              break Fail21514;
                                            if(true)
                                              break Success11548;
                                          }
                                          term = term11600;
                                        }
                                        Success11549:
                                        { 
                                          if(cons542 == Main._consRChoice_2)
                                          { 
                                            Fail21515:
                                            { 
                                              IStrategoTerm m_4208 = null;
                                              IStrategoTerm n_4208 = null;
                                              n_4208 = term.getSubterm(0);
                                              m_4208 = term.getSubterm(1);
                                              term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{m_4208, trans.constId0, n_4208});
                                              term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                              if(term == null)
                                                break Fail21515;
                                              if(true)
                                                break Success11549;
                                            }
                                            term = term11600;
                                          }
                                          Success11550:
                                          { 
                                            if(cons542 == Main._consCondChoice_3)
                                            { 
                                              Fail21516:
                                              { 
                                                IStrategoTerm j_4208 = null;
                                                IStrategoTerm k_4208 = null;
                                                IStrategoTerm l_4208 = null;
                                                j_4208 = term.getSubterm(0);
                                                k_4208 = term.getSubterm(1);
                                                l_4208 = term.getSubterm(2);
                                                term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consWhere_1, new IStrategoTerm[]{j_4208}), k_4208, l_4208});
                                                term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                                if(term == null)
                                                  break Fail21516;
                                                if(true)
                                                  break Success11550;
                                              }
                                              term = term11600;
                                            }
                                            Success11551:
                                            { 
                                              if(cons542 == Main._consIfThen_2)
                                              { 
                                                Fail21517:
                                                { 
                                                  IStrategoTerm h_4208 = null;
                                                  IStrategoTerm i_4208 = null;
                                                  h_4208 = term.getSubterm(0);
                                                  i_4208 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consWhere_1, new IStrategoTerm[]{h_4208}), i_4208, trans.constId0});
                                                  term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                                  if(term == null)
                                                    break Fail21517;
                                                  if(true)
                                                    break Success11551;
                                                }
                                                term = term11600;
                                              }
                                              Success11552:
                                              { 
                                                if(cons542 == Main._consGuardedLChoice_3)
                                                { 
                                                  Fail21518:
                                                  { 
                                                    IStrategoTerm e_4208 = null;
                                                    IStrategoTerm f_4208 = null;
                                                    IStrategoTerm g_4208 = null;
                                                    IStrategoTerm arg7705 = term.getSubterm(0);
                                                    if(arg7705.getTermType() != IStrategoTerm.APPL || Main._consWhere_1 != ((IStrategoAppl)arg7705).getConstructor())
                                                      break Fail21518;
                                                    IStrategoTerm arg7706 = arg7705.getSubterm(0);
                                                    if(arg7706.getTermType() != IStrategoTerm.APPL || Main._consNot_1 != ((IStrategoAppl)arg7706).getConstructor())
                                                      break Fail21518;
                                                    e_4208 = arg7706.getSubterm(0);
                                                    g_4208 = term.getSubterm(1);
                                                    f_4208 = term.getSubterm(2);
                                                    term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consWhere_1, new IStrategoTerm[]{e_4208}), f_4208, g_4208});
                                                    if(true)
                                                      break Success11552;
                                                  }
                                                  term = term11600;
                                                }
                                                Success11553:
                                                { 
                                                  if(cons542 == Main._consGuardedLChoice_3)
                                                  { 
                                                    Fail21519:
                                                    { 
                                                      IStrategoTerm b_4208 = null;
                                                      IStrategoTerm c_4208 = null;
                                                      IStrategoTerm d_4208 = null;
                                                      IStrategoTerm arg7707 = term.getSubterm(0);
                                                      if(arg7707.getTermType() != IStrategoTerm.APPL || Main._consNot_1 != ((IStrategoAppl)arg7707).getConstructor())
                                                        break Fail21519;
                                                      b_4208 = arg7707.getSubterm(0);
                                                      d_4208 = term.getSubterm(1);
                                                      c_4208 = term.getSubterm(2);
                                                      term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consWhere_1, new IStrategoTerm[]{b_4208}), c_4208, d_4208});
                                                      if(true)
                                                        break Success11553;
                                                    }
                                                    term = term11600;
                                                  }
                                                  Success11554:
                                                  { 
                                                    if(cons542 == Main._consToMetaExpr_1)
                                                    { 
                                                      Fail21520:
                                                      { 
                                                        IStrategoTerm y_4207 = null;
                                                        y_4207 = term.getSubterm(0);
                                                        term = extract_meta_expr_escapes_0_0.instance.invoke(context, y_4207);
                                                        if(term == null)
                                                          break Fail21520;
                                                        term = termFactory.makeAppl(Main._consToMetaExpr_1, new IStrategoTerm[]{term});
                                                        if(true)
                                                          break Success11554;
                                                      }
                                                      term = term11600;
                                                    }
                                                    Success11555:
                                                    { 
                                                      if(cons542 == Main._consToBuild_1)
                                                      { 
                                                        Fail21521:
                                                        { 
                                                          IStrategoTerm v_4207 = null;
                                                          v_4207 = term.getSubterm(0);
                                                          term = extract_meta_expr_escapes_0_0.instance.invoke(context, v_4207);
                                                          if(term == null)
                                                            break Fail21521;
                                                          term = termFactory.makeAppl(Main._consToBuild_1, new IStrategoTerm[]{term});
                                                          if(true)
                                                            break Success11555;
                                                        }
                                                        term = term11600;
                                                      }
                                                      Success11556:
                                                      { 
                                                        if(cons542 == Main._consToTerm_1)
                                                        { 
                                                          Fail21522:
                                                          { 
                                                            IStrategoTerm s_4207 = null;
                                                            s_4207 = term.getSubterm(0);
                                                            term = extract_meta_expr_escapes_0_0.instance.invoke(context, s_4207);
                                                            if(term == null)
                                                              break Fail21522;
                                                            term = termFactory.makeAppl(Main._consToTerm_1, new IStrategoTerm[]{term});
                                                            if(true)
                                                              break Success11556;
                                                          }
                                                          term = term11600;
                                                        }
                                                        Success11557:
                                                        { 
                                                          if(cons542 == Main._consToMetaListExpr_1)
                                                          { 
                                                            Fail21523:
                                                            { 
                                                              IStrategoTerm p_4207 = null;
                                                              p_4207 = term.getSubterm(0);
                                                              term = extract_meta_expr_escapes_0_0.instance.invoke(context, p_4207);
                                                              if(term == null)
                                                                break Fail21523;
                                                              term = termFactory.makeAppl(Main._consToMetaListExpr_1, new IStrategoTerm[]{term});
                                                              if(true)
                                                                break Success11557;
                                                            }
                                                            term = term11600;
                                                          }
                                                          Success11558:
                                                          { 
                                                            if(cons542 == Main._consToStrategy_1)
                                                            { 
                                                              Fail21524:
                                                              { 
                                                                IStrategoTerm m_4207 = null;
                                                                m_4207 = term.getSubterm(0);
                                                                term = extract_meta_expr_escapes_0_0.instance.invoke(context, m_4207);
                                                                if(term == null)
                                                                  break Fail21524;
                                                                term = termFactory.makeAppl(Main._consToStrategy_1, new IStrategoTerm[]{term});
                                                                if(true)
                                                                  break Success11558;
                                                              }
                                                              term = term11600;
                                                            }
                                                            Success11559:
                                                            { 
                                                              if(cons542 == Main._consSwitchChoiceNoOtherwise_2)
                                                              { 
                                                                Fail21525:
                                                                { 
                                                                  IStrategoTerm k_4207 = null;
                                                                  IStrategoTerm l_4207 = null;
                                                                  k_4207 = term.getSubterm(0);
                                                                  l_4207 = term.getSubterm(1);
                                                                  term = termFactory.makeAppl(Main._consSwitchChoice_3, new IStrategoTerm[]{k_4207, l_4207, trans.constFail0});
                                                                  term = this.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail21525;
                                                                  if(true)
                                                                    break Success11559;
                                                                }
                                                                term = term11600;
                                                              }
                                                              Success11560:
                                                              { 
                                                                if(cons542 == Main._consSwitchChoice_3)
                                                                { 
                                                                  Fail21526:
                                                                  { 
                                                                    IStrategoTerm f_4207 = null;
                                                                    IStrategoTerm g_4207 = null;
                                                                    IStrategoTerm h_4207 = null;
                                                                    IStrategoTerm i_4207 = null;
                                                                    IStrategoTerm j_4207 = null;
                                                                    f_4207 = term.getSubterm(0);
                                                                    IStrategoTerm arg7708 = term.getSubterm(1);
                                                                    if(arg7708.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7708).isEmpty())
                                                                      break Fail21526;
                                                                    IStrategoTerm arg7709 = ((IStrategoList)arg7708).head();
                                                                    if(arg7709.getTermType() != IStrategoTerm.APPL || Main._consSwitchCase_2 != ((IStrategoAppl)arg7709).getConstructor())
                                                                      break Fail21526;
                                                                    g_4207 = arg7709.getSubterm(0);
                                                                    h_4207 = arg7709.getSubterm(1);
                                                                    i_4207 = ((IStrategoList)arg7708).tail();
                                                                    j_4207 = term.getSubterm(2);
                                                                    term = termFactory.makeAppl(Main._consSeq_2, new IStrategoTerm[]{f_4207, termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{g_4207, h_4207, termFactory.makeAppl(Main._consSwitchChoice_3, new IStrategoTerm[]{trans.constId0, i_4207, j_4207})})});
                                                                    if(true)
                                                                      break Success11560;
                                                                  }
                                                                  term = term11600;
                                                                }
                                                                if(cons542 == Main._consSwitchChoice_3)
                                                                { 
                                                                  IStrategoTerm d_4207 = null;
                                                                  IStrategoTerm e_4207 = null;
                                                                  d_4207 = term.getSubterm(0);
                                                                  IStrategoTerm arg7710 = term.getSubterm(1);
                                                                  if(arg7710.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7710).isEmpty())
                                                                    break Fail21496;
                                                                  e_4207 = term.getSubterm(2);
                                                                  term = termFactory.makeAppl(Main._consSeq_2, new IStrategoTerm[]{d_4207, e_4207});
                                                                }
                                                                else
                                                                { 
                                                                  break Fail21496;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
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