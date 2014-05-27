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
    Fail22972:
    { 
      IStrategoTerm term12309 = term;
      IStrategoConstructor cons586 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12240:
      { 
        if(cons586 == Main._consSDef_3)
        { 
          Fail22973:
          { 
            IStrategoTerm r_4763 = null;
            IStrategoTerm s_4763 = null;
            IStrategoTerm t_4763 = null;
            r_4763 = term.getSubterm(0);
            s_4763 = term.getSubterm(1);
            t_4763 = term.getSubterm(2);
            term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{r_4763, s_4763, trans.constNil4, t_4763});
            if(true)
              break Success12240;
          }
          term = term12309;
        }
        Success12241:
        { 
          if(cons586 == Main._consRDef_3)
          { 
            Fail22974:
            { 
              IStrategoTerm o_4763 = null;
              IStrategoTerm p_4763 = null;
              IStrategoTerm q_4763 = null;
              o_4763 = term.getSubterm(0);
              p_4763 = term.getSubterm(1);
              q_4763 = term.getSubterm(2);
              term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{o_4763, p_4763, trans.constNil4, termFactory.makeAppl(Main._consSRule_1, new IStrategoTerm[]{q_4763})});
              if(true)
                break Success12241;
            }
            term = term12309;
          }
          Success12242:
          { 
            if(cons586 == Main._consRDefT_4)
            { 
              Fail22975:
              { 
                IStrategoTerm k_4763 = null;
                IStrategoTerm l_4763 = null;
                IStrategoTerm m_4763 = null;
                IStrategoTerm n_4763 = null;
                k_4763 = term.getSubterm(0);
                l_4763 = term.getSubterm(1);
                m_4763 = term.getSubterm(2);
                n_4763 = term.getSubterm(3);
                term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{k_4763, l_4763, m_4763, termFactory.makeAppl(Main._consSRule_1, new IStrategoTerm[]{n_4763})});
                if(true)
                  break Success12242;
              }
              term = term12309;
            }
            Success12243:
            { 
              if(cons586 == Main._consRDec_2)
              { 
                Fail22976:
                { 
                  IStrategoTerm i_4763 = null;
                  IStrategoTerm j_4763 = null;
                  i_4763 = term.getSubterm(0);
                  j_4763 = term.getSubterm(1);
                  term = termFactory.makeAppl(Main._consRDecT_3, new IStrategoTerm[]{i_4763, j_4763, trans.constNil4});
                  if(true)
                    break Success12243;
                }
                term = term12309;
              }
              Success12244:
              { 
                if(cons586 == Main._consSDefNoArgs_2)
                { 
                  Fail22977:
                  { 
                    IStrategoTerm g_4763 = null;
                    IStrategoTerm h_4763 = null;
                    g_4763 = term.getSubterm(0);
                    h_4763 = term.getSubterm(1);
                    term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{g_4763, trans.constNil4, trans.constNil4, h_4763});
                    if(true)
                      break Success12244;
                  }
                  term = term12309;
                }
                Success12245:
                { 
                  if(cons586 == Main._consRDefNoArgs_2)
                  { 
                    Fail22978:
                    { 
                      IStrategoTerm e_4763 = null;
                      IStrategoTerm f_4763 = null;
                      e_4763 = term.getSubterm(0);
                      f_4763 = term.getSubterm(1);
                      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{e_4763, trans.constNil4, trans.constNil4, termFactory.makeAppl(Main._consSRule_1, new IStrategoTerm[]{f_4763})});
                      if(true)
                        break Success12245;
                    }
                    term = term12309;
                  }
                  Success12246:
                  { 
                    if(cons586 == Main._consRule_3)
                    { 
                      Fail22979:
                      { 
                        IStrategoTerm a_4763 = null;
                        IStrategoTerm b_4763 = null;
                        IStrategoTerm c_4763 = null;
                        a_4763 = term.getSubterm(0);
                        b_4763 = term.getSubterm(1);
                        c_4763 = term.getSubterm(2);
                        term = c_4763;
                        IStrategoTerm term12316 = term;
                        Success12247:
                        { 
                          Fail22980:
                          { 
                            term = is_list_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail22980;
                            { 
                              if(true)
                                break Fail22979;
                              if(true)
                                break Success12247;
                            }
                          }
                          term = term12316;
                        }
                        term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{a_4763, b_4763, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(Main._consWhereClause_1, new IStrategoTerm[]{c_4763}), (IStrategoList)trans.constNil4)});
                        if(true)
                          break Success12246;
                      }
                      term = term12309;
                    }
                    Success12248:
                    { 
                      if(cons586 == Main._consOverlayNoArgs_2)
                      { 
                        Fail22981:
                        { 
                          IStrategoTerm y_4762 = null;
                          IStrategoTerm z_4762 = null;
                          y_4762 = term.getSubterm(0);
                          z_4762 = term.getSubterm(1);
                          term = termFactory.makeAppl(Main._consOverlay_3, new IStrategoTerm[]{y_4762, trans.constNil4, z_4762});
                          if(true)
                            break Success12248;
                        }
                        term = term12309;
                      }
                      Success12249:
                      { 
                        if(cons586 == Main._consRDecNoArgs_1)
                        { 
                          Fail22982:
                          { 
                            IStrategoTerm x_4762 = null;
                            x_4762 = term.getSubterm(0);
                            term = termFactory.makeAppl(Main._consRDecT_3, new IStrategoTerm[]{x_4762, trans.constNil4, trans.constNil4});
                            if(true)
                              break Success12249;
                          }
                          term = term12309;
                        }
                        Success12250:
                        { 
                          if(cons586 == Main._consCall_2)
                          { 
                            Fail22983:
                            { 
                              IStrategoTerm v_4762 = null;
                              IStrategoTerm w_4762 = null;
                              v_4762 = term.getSubterm(0);
                              w_4762 = term.getSubterm(1);
                              term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{v_4762, w_4762, trans.constNil4});
                              if(true)
                                break Success12250;
                            }
                            term = term12309;
                          }
                          Success12251:
                          { 
                            if(cons586 == Main._consCallNoArgs_1)
                            { 
                              Fail22984:
                              { 
                                IStrategoTerm u_4762 = null;
                                u_4762 = term.getSubterm(0);
                                term = termFactory.makeAppl(Main._consCallT_3, new IStrategoTerm[]{u_4762, trans.constNil4, trans.constNil4});
                                if(true)
                                  break Success12251;
                              }
                              term = term12309;
                            }
                            Success12252:
                            { 
                              if(cons586 == Main._consListVar_1)
                              { 
                                Fail22985:
                                { 
                                  IStrategoTerm t_4762 = null;
                                  t_4762 = term.getSubterm(0);
                                  term = t_4762;
                                  if(true)
                                    break Success12252;
                                }
                                term = term12309;
                              }
                              Success12253:
                              { 
                                if(cons586 == Main._consDefaultVarDec_1)
                                { 
                                  Fail22986:
                                  { 
                                    IStrategoTerm s_4762 = null;
                                    s_4762 = term.getSubterm(0);
                                    term = termFactory.makeAppl(Main._consVarDec_2, new IStrategoTerm[]{s_4762, trans.constConstType0});
                                    if(true)
                                      break Success12253;
                                  }
                                  term = term12309;
                                }
                                Success12254:
                                { 
                                  if(cons586 == Main._consRuleNoCond_2)
                                  { 
                                    Fail22987:
                                    { 
                                      IStrategoTerm q_4762 = null;
                                      IStrategoTerm r_4762 = null;
                                      q_4762 = term.getSubterm(0);
                                      r_4762 = term.getSubterm(1);
                                      term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{q_4762, r_4762, trans.constNil4});
                                      if(true)
                                        break Success12254;
                                    }
                                    term = term12309;
                                  }
                                  Success12255:
                                  { 
                                    if(cons586 == Main._consLRule_1)
                                    { 
                                      Fail22988:
                                      { 
                                        IStrategoTerm k_4762 = null;
                                        IStrategoTerm l_4762 = null;
                                        IStrategoTerm m_4762 = null;
                                        k_4762 = term.getSubterm(0);
                                        term = topdown_1_0.instance.invoke(context, k_4762, lifted6828.instance);
                                        if(term == null)
                                          break Fail22988;
                                        l_4762 = term;
                                        if(term.getTermType() != IStrategoTerm.APPL || Main._consRule_3 != ((IStrategoAppl)term).getConstructor())
                                          break Fail22988;
                                        m_4762 = term.getSubterm(0);
                                        term = collect_all_1_0.instance.invoke(context, m_4762, lifted6831.instance);
                                        if(term == null)
                                          break Fail22988;
                                        term = termFactory.makeAppl(Main._consScope_2, new IStrategoTerm[]{term, termFactory.makeAppl(Main._consSRule_1, new IStrategoTerm[]{l_4762})});
                                        if(true)
                                          break Success12255;
                                      }
                                      term = term12309;
                                    }
                                    Success12256:
                                    { 
                                      if(cons586 == Main._consChoice_2)
                                      { 
                                        Fail22989:
                                        { 
                                          IStrategoTerm i_4762 = null;
                                          IStrategoTerm j_4762 = null;
                                          i_4762 = term.getSubterm(0);
                                          j_4762 = term.getSubterm(1);
                                          term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{i_4762, trans.constId0, j_4762});
                                          term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                          if(term == null)
                                            break Fail22989;
                                          if(true)
                                            break Success12256;
                                        }
                                        term = term12309;
                                      }
                                      Success12257:
                                      { 
                                        if(cons586 == Main._consLChoice_2)
                                        { 
                                          Fail22990:
                                          { 
                                            IStrategoTerm g_4762 = null;
                                            IStrategoTerm h_4762 = null;
                                            g_4762 = term.getSubterm(0);
                                            h_4762 = term.getSubterm(1);
                                            term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{g_4762, trans.constId0, h_4762});
                                            term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                            if(term == null)
                                              break Fail22990;
                                            if(true)
                                              break Success12257;
                                          }
                                          term = term12309;
                                        }
                                        Success12258:
                                        { 
                                          if(cons586 == Main._consRChoice_2)
                                          { 
                                            Fail22991:
                                            { 
                                              IStrategoTerm e_4762 = null;
                                              IStrategoTerm f_4762 = null;
                                              f_4762 = term.getSubterm(0);
                                              e_4762 = term.getSubterm(1);
                                              term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{e_4762, trans.constId0, f_4762});
                                              term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                              if(term == null)
                                                break Fail22991;
                                              if(true)
                                                break Success12258;
                                            }
                                            term = term12309;
                                          }
                                          Success12259:
                                          { 
                                            if(cons586 == Main._consCondChoice_3)
                                            { 
                                              Fail22992:
                                              { 
                                                IStrategoTerm b_4762 = null;
                                                IStrategoTerm c_4762 = null;
                                                IStrategoTerm d_4762 = null;
                                                b_4762 = term.getSubterm(0);
                                                c_4762 = term.getSubterm(1);
                                                d_4762 = term.getSubterm(2);
                                                term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consWhere_1, new IStrategoTerm[]{b_4762}), c_4762, d_4762});
                                                term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                                if(term == null)
                                                  break Fail22992;
                                                if(true)
                                                  break Success12259;
                                              }
                                              term = term12309;
                                            }
                                            Success12260:
                                            { 
                                              if(cons586 == Main._consIfThen_2)
                                              { 
                                                Fail22993:
                                                { 
                                                  IStrategoTerm z_4761 = null;
                                                  IStrategoTerm a_4762 = null;
                                                  z_4761 = term.getSubterm(0);
                                                  a_4762 = term.getSubterm(1);
                                                  term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consWhere_1, new IStrategoTerm[]{z_4761}), a_4762, trans.constId0});
                                                  term = try_1_0.instance.invoke(context, term, basic_desugar_0_0.instance);
                                                  if(term == null)
                                                    break Fail22993;
                                                  if(true)
                                                    break Success12260;
                                                }
                                                term = term12309;
                                              }
                                              Success12261:
                                              { 
                                                if(cons586 == Main._consGuardedLChoice_3)
                                                { 
                                                  Fail22994:
                                                  { 
                                                    IStrategoTerm w_4761 = null;
                                                    IStrategoTerm x_4761 = null;
                                                    IStrategoTerm y_4761 = null;
                                                    IStrategoTerm arg8172 = term.getSubterm(0);
                                                    if(arg8172.getTermType() != IStrategoTerm.APPL || Main._consWhere_1 != ((IStrategoAppl)arg8172).getConstructor())
                                                      break Fail22994;
                                                    IStrategoTerm arg8173 = arg8172.getSubterm(0);
                                                    if(arg8173.getTermType() != IStrategoTerm.APPL || Main._consNot_1 != ((IStrategoAppl)arg8173).getConstructor())
                                                      break Fail22994;
                                                    w_4761 = arg8173.getSubterm(0);
                                                    y_4761 = term.getSubterm(1);
                                                    x_4761 = term.getSubterm(2);
                                                    term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consWhere_1, new IStrategoTerm[]{w_4761}), x_4761, y_4761});
                                                    if(true)
                                                      break Success12261;
                                                  }
                                                  term = term12309;
                                                }
                                                Success12262:
                                                { 
                                                  if(cons586 == Main._consGuardedLChoice_3)
                                                  { 
                                                    Fail22995:
                                                    { 
                                                      IStrategoTerm t_4761 = null;
                                                      IStrategoTerm u_4761 = null;
                                                      IStrategoTerm v_4761 = null;
                                                      IStrategoTerm arg8174 = term.getSubterm(0);
                                                      if(arg8174.getTermType() != IStrategoTerm.APPL || Main._consNot_1 != ((IStrategoAppl)arg8174).getConstructor())
                                                        break Fail22995;
                                                      t_4761 = arg8174.getSubterm(0);
                                                      v_4761 = term.getSubterm(1);
                                                      u_4761 = term.getSubterm(2);
                                                      term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{termFactory.makeAppl(Main._consWhere_1, new IStrategoTerm[]{t_4761}), u_4761, v_4761});
                                                      if(true)
                                                        break Success12262;
                                                    }
                                                    term = term12309;
                                                  }
                                                  Success12263:
                                                  { 
                                                    if(cons586 == Main._consToMetaExpr_1)
                                                    { 
                                                      Fail22996:
                                                      { 
                                                        IStrategoTerm q_4761 = null;
                                                        q_4761 = term.getSubterm(0);
                                                        term = extract_meta_expr_escapes_0_0.instance.invoke(context, q_4761);
                                                        if(term == null)
                                                          break Fail22996;
                                                        term = termFactory.makeAppl(Main._consToMetaExpr_1, new IStrategoTerm[]{term});
                                                        if(true)
                                                          break Success12263;
                                                      }
                                                      term = term12309;
                                                    }
                                                    Success12264:
                                                    { 
                                                      if(cons586 == Main._consToBuild_1)
                                                      { 
                                                        Fail22997:
                                                        { 
                                                          IStrategoTerm n_4761 = null;
                                                          n_4761 = term.getSubterm(0);
                                                          term = extract_meta_expr_escapes_0_0.instance.invoke(context, n_4761);
                                                          if(term == null)
                                                            break Fail22997;
                                                          term = termFactory.makeAppl(Main._consToBuild_1, new IStrategoTerm[]{term});
                                                          if(true)
                                                            break Success12264;
                                                        }
                                                        term = term12309;
                                                      }
                                                      Success12265:
                                                      { 
                                                        if(cons586 == Main._consToTerm_1)
                                                        { 
                                                          Fail22998:
                                                          { 
                                                            IStrategoTerm k_4761 = null;
                                                            k_4761 = term.getSubterm(0);
                                                            term = extract_meta_expr_escapes_0_0.instance.invoke(context, k_4761);
                                                            if(term == null)
                                                              break Fail22998;
                                                            term = termFactory.makeAppl(Main._consToTerm_1, new IStrategoTerm[]{term});
                                                            if(true)
                                                              break Success12265;
                                                          }
                                                          term = term12309;
                                                        }
                                                        Success12266:
                                                        { 
                                                          if(cons586 == Main._consToMetaListExpr_1)
                                                          { 
                                                            Fail22999:
                                                            { 
                                                              IStrategoTerm h_4761 = null;
                                                              h_4761 = term.getSubterm(0);
                                                              term = extract_meta_expr_escapes_0_0.instance.invoke(context, h_4761);
                                                              if(term == null)
                                                                break Fail22999;
                                                              term = termFactory.makeAppl(Main._consToMetaListExpr_1, new IStrategoTerm[]{term});
                                                              if(true)
                                                                break Success12266;
                                                            }
                                                            term = term12309;
                                                          }
                                                          Success12267:
                                                          { 
                                                            if(cons586 == Main._consToStrategy_1)
                                                            { 
                                                              Fail23000:
                                                              { 
                                                                IStrategoTerm e_4761 = null;
                                                                e_4761 = term.getSubterm(0);
                                                                term = extract_meta_expr_escapes_0_0.instance.invoke(context, e_4761);
                                                                if(term == null)
                                                                  break Fail23000;
                                                                term = termFactory.makeAppl(Main._consToStrategy_1, new IStrategoTerm[]{term});
                                                                if(true)
                                                                  break Success12267;
                                                              }
                                                              term = term12309;
                                                            }
                                                            Success12268:
                                                            { 
                                                              if(cons586 == Main._consSwitchChoiceNoOtherwise_2)
                                                              { 
                                                                Fail23001:
                                                                { 
                                                                  IStrategoTerm c_4761 = null;
                                                                  IStrategoTerm d_4761 = null;
                                                                  c_4761 = term.getSubterm(0);
                                                                  d_4761 = term.getSubterm(1);
                                                                  term = termFactory.makeAppl(Main._consSwitchChoice_3, new IStrategoTerm[]{c_4761, d_4761, trans.constFail0});
                                                                  term = this.invoke(context, term);
                                                                  if(term == null)
                                                                    break Fail23001;
                                                                  if(true)
                                                                    break Success12268;
                                                                }
                                                                term = term12309;
                                                              }
                                                              Success12269:
                                                              { 
                                                                if(cons586 == Main._consSwitchChoice_3)
                                                                { 
                                                                  Fail23002:
                                                                  { 
                                                                    IStrategoTerm x_4760 = null;
                                                                    IStrategoTerm y_4760 = null;
                                                                    IStrategoTerm z_4760 = null;
                                                                    IStrategoTerm a_4761 = null;
                                                                    IStrategoTerm b_4761 = null;
                                                                    x_4760 = term.getSubterm(0);
                                                                    IStrategoTerm arg8175 = term.getSubterm(1);
                                                                    if(arg8175.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8175).isEmpty())
                                                                      break Fail23002;
                                                                    IStrategoTerm arg8176 = ((IStrategoList)arg8175).head();
                                                                    if(arg8176.getTermType() != IStrategoTerm.APPL || Main._consSwitchCase_2 != ((IStrategoAppl)arg8176).getConstructor())
                                                                      break Fail23002;
                                                                    y_4760 = arg8176.getSubterm(0);
                                                                    z_4760 = arg8176.getSubterm(1);
                                                                    a_4761 = ((IStrategoList)arg8175).tail();
                                                                    b_4761 = term.getSubterm(2);
                                                                    term = termFactory.makeAppl(Main._consSeq_2, new IStrategoTerm[]{x_4760, termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{y_4760, z_4760, termFactory.makeAppl(Main._consSwitchChoice_3, new IStrategoTerm[]{trans.constId0, a_4761, b_4761})})});
                                                                    if(true)
                                                                      break Success12269;
                                                                  }
                                                                  term = term12309;
                                                                }
                                                                if(cons586 == Main._consSwitchChoice_3)
                                                                { 
                                                                  IStrategoTerm v_4760 = null;
                                                                  IStrategoTerm w_4760 = null;
                                                                  v_4760 = term.getSubterm(0);
                                                                  IStrategoTerm arg8177 = term.getSubterm(1);
                                                                  if(arg8177.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8177).isEmpty())
                                                                    break Fail22972;
                                                                  w_4760 = term.getSubterm(2);
                                                                  term = termFactory.makeAppl(Main._consSeq_2, new IStrategoTerm[]{v_4760, w_4760});
                                                                }
                                                                else
                                                                { 
                                                                  break Fail22972;
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