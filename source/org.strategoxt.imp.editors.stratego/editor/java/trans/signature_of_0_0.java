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

@SuppressWarnings("all") public class signature_of_0_0 extends Strategy 
{ 
  public static signature_of_0_0 instance = new signature_of_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("signature_of_0_0");
    Fail21568:
    { 
      IStrategoTerm term11669 = term;
      IStrategoConstructor cons543 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11594:
      { 
        if(cons543 == Main._consSDefT_4)
        { 
          Fail21569:
          { 
            IStrategoTerm b_4220 = null;
            IStrategoTerm c_4220 = null;
            IStrategoTerm d_4220 = null;
            IStrategoTerm e_4220 = null;
            IStrategoTerm f_4220 = null;
            b_4220 = term.getSubterm(0);
            c_4220 = term.getSubterm(1);
            d_4220 = term.getSubterm(2);
            term = remove_quote_0_0.instance.invoke(context, b_4220);
            if(term == null)
              break Fail21569;
            e_4220 = term;
            term = length_0_0.instance.invoke(context, c_4220);
            if(term == null)
              break Fail21569;
            f_4220 = term;
            term = length_0_0.instance.invoke(context, d_4220);
            if(term == null)
              break Fail21569;
            term = termFactory.makeTuple(e_4220, f_4220, term);
            if(true)
              break Success11594;
          }
          term = term11669;
        }
        Success11595:
        { 
          if(cons543 == Main._consRDecT_3)
          { 
            Fail21570:
            { 
              IStrategoTerm r_4219 = null;
              IStrategoTerm s_4219 = null;
              IStrategoTerm t_4219 = null;
              IStrategoTerm u_4219 = null;
              IStrategoTerm v_4219 = null;
              r_4219 = term.getSubterm(0);
              s_4219 = term.getSubterm(1);
              t_4219 = term.getSubterm(2);
              term = remove_quote_0_0.instance.invoke(context, r_4219);
              if(term == null)
                break Fail21570;
              u_4219 = term;
              term = length_0_0.instance.invoke(context, s_4219);
              if(term == null)
                break Fail21570;
              v_4219 = term;
              term = length_0_0.instance.invoke(context, t_4219);
              if(term == null)
                break Fail21570;
              term = termFactory.makeTuple(u_4219, v_4219, term);
              if(true)
                break Success11595;
            }
            term = term11669;
          }
          Success11596:
          { 
            if(cons543 == Main._consExtSDef_3)
            { 
              Fail21571:
              { 
                IStrategoTerm i_4219 = null;
                IStrategoTerm j_4219 = null;
                IStrategoTerm k_4219 = null;
                IStrategoTerm l_4219 = null;
                IStrategoTerm m_4219 = null;
                i_4219 = term.getSubterm(0);
                j_4219 = term.getSubterm(1);
                k_4219 = term.getSubterm(2);
                term = remove_quote_0_0.instance.invoke(context, i_4219);
                if(term == null)
                  break Fail21571;
                l_4219 = term;
                term = length_0_0.instance.invoke(context, j_4219);
                if(term == null)
                  break Fail21571;
                m_4219 = term;
                term = length_0_0.instance.invoke(context, k_4219);
                if(term == null)
                  break Fail21571;
                term = termFactory.makeTuple(l_4219, m_4219, term);
                if(true)
                  break Success11596;
              }
              term = term11669;
            }
            Success11597:
            { 
              if(cons543 == Main._consCallT_3)
              { 
                Fail21572:
                { 
                  IStrategoTerm z_4218 = null;
                  IStrategoTerm a_4219 = null;
                  IStrategoTerm b_4219 = null;
                  IStrategoTerm c_4219 = null;
                  IStrategoTerm d_4219 = null;
                  IStrategoTerm arg7725 = term.getSubterm(0);
                  if(arg7725.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7725).getConstructor())
                    break Fail21572;
                  z_4218 = arg7725.getSubterm(0);
                  a_4219 = term.getSubterm(1);
                  b_4219 = term.getSubterm(2);
                  term = remove_quote_0_0.instance.invoke(context, z_4218);
                  if(term == null)
                    break Fail21572;
                  c_4219 = term;
                  term = length_0_0.instance.invoke(context, a_4219);
                  if(term == null)
                    break Fail21572;
                  d_4219 = term;
                  term = length_0_0.instance.invoke(context, b_4219);
                  if(term == null)
                    break Fail21572;
                  term = termFactory.makeTuple(c_4219, d_4219, term);
                  if(true)
                    break Success11597;
                }
                term = term11669;
              }
              Success11598:
              { 
                if(cons543 == Main._consVar_1)
                { 
                  Fail21573:
                  { 
                    IStrategoTerm w_4218 = null;
                    w_4218 = term.getSubterm(0);
                    term = remove_quote_0_0.instance.invoke(context, w_4218);
                    if(term == null)
                      break Fail21573;
                    term = termFactory.makeTuple(term, trans.const4227);
                    if(true)
                      break Success11598;
                  }
                  term = term11669;
                }
                Success11599:
                { 
                  if(cons543 == Main._consVarDec_2)
                  { 
                    Fail21574:
                    { 
                      IStrategoTerm t_4218 = null;
                      t_4218 = term.getSubterm(0);
                      term = remove_quote_0_0.instance.invoke(context, t_4218);
                      if(term == null)
                        break Fail21574;
                      term = termFactory.makeTuple(term, trans.const4227);
                      if(true)
                        break Success11599;
                    }
                    term = term11669;
                  }
                  Success11600:
                  { 
                    if(cons543 == Main._consOp_2)
                    { 
                      Fail21575:
                      { 
                        IStrategoTerm m_4218 = null;
                        IStrategoTerm n_4218 = null;
                        IStrategoTerm o_4218 = null;
                        m_4218 = term.getSubterm(0);
                        n_4218 = term.getSubterm(1);
                        term = remove_quote_0_0.instance.invoke(context, m_4218);
                        if(term == null)
                          break Fail21575;
                        o_4218 = term;
                        term = length_0_0.instance.invoke(context, n_4218);
                        if(term == null)
                          break Fail21575;
                        term = termFactory.makeTuple(o_4218, term);
                        if(true)
                          break Success11600;
                      }
                      term = term11669;
                    }
                    Success11601:
                    { 
                      if(cons543 == Main._consOpDecl_2)
                      { 
                        Fail21576:
                        { 
                          IStrategoTerm g_4218 = null;
                          IStrategoTerm h_4218 = null;
                          IStrategoTerm i_4218 = null;
                          g_4218 = term.getSubterm(0);
                          h_4218 = term.getSubterm(1);
                          term = remove_quote_0_0.instance.invoke(context, g_4218);
                          if(term == null)
                            break Fail21576;
                          i_4218 = term;
                          term = occurrences_1_0.instance.invoke(context, h_4218, lifted6575.instance);
                          if(term == null)
                            break Fail21576;
                          term = dec_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail21576;
                          term = termFactory.makeTuple(i_4218, term);
                          if(true)
                            break Success11601;
                        }
                        term = term11669;
                      }
                      Success11602:
                      { 
                        if(cons543 == Main._consExtOpDecl_2)
                        { 
                          Fail21577:
                          { 
                            IStrategoTerm a_4218 = null;
                            IStrategoTerm b_4218 = null;
                            IStrategoTerm c_4218 = null;
                            a_4218 = term.getSubterm(0);
                            b_4218 = term.getSubterm(1);
                            term = remove_quote_0_0.instance.invoke(context, a_4218);
                            if(term == null)
                              break Fail21577;
                            c_4218 = term;
                            term = occurrences_1_0.instance.invoke(context, b_4218, lifted6576.instance);
                            if(term == null)
                              break Fail21577;
                            term = dec_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail21577;
                            term = termFactory.makeTuple(c_4218, term);
                            if(true)
                              break Success11602;
                          }
                          term = term11669;
                        }
                        Success11603:
                        { 
                          if(cons543 == Main._consOverlay_3)
                          { 
                            Fail21578:
                            { 
                              IStrategoTerm u_4217 = null;
                              IStrategoTerm v_4217 = null;
                              IStrategoTerm w_4217 = null;
                              u_4217 = term.getSubterm(0);
                              v_4217 = term.getSubterm(1);
                              term = remove_quote_0_0.instance.invoke(context, u_4217);
                              if(term == null)
                                break Fail21578;
                              w_4217 = term;
                              term = length_0_0.instance.invoke(context, v_4217);
                              if(term == null)
                                break Fail21578;
                              term = termFactory.makeTuple(w_4217, term);
                              if(true)
                                break Success11603;
                            }
                            term = term11669;
                          }
                          Success11604:
                          { 
                            if(cons543 == Main._consRec_2)
                            { 
                              Fail21579:
                              { 
                                IStrategoTerm r_4217 = null;
                                r_4217 = term.getSubterm(0);
                                term = remove_quote_0_0.instance.invoke(context, r_4217);
                                if(term == null)
                                  break Fail21579;
                                term = termFactory.makeTuple(term, trans.const4227, trans.const4227);
                                if(true)
                                  break Success11604;
                              }
                              term = term11669;
                            }
                            Success11605:
                            { 
                              if(cons543 == Main._consLabeledDynRuleScopeId_2)
                              { 
                                Fail21580:
                                { 
                                  IStrategoTerm p_4217 = null;
                                  p_4217 = term.getSubterm(0);
                                  term = remove_quote_0_0.instance.invoke(context, p_4217);
                                  if(term == null)
                                    break Fail21580;
                                  if(true)
                                    break Success11605;
                                }
                                term = term11669;
                              }
                              if(cons543 == Main._consDynRuleScopeId_1)
                              { 
                                IStrategoTerm o_4217 = null;
                                o_4217 = term.getSubterm(0);
                                term = remove_quote_0_0.instance.invoke(context, o_4217);
                                if(term == null)
                                  break Fail21568;
                              }
                              else
                              { 
                                break Fail21568;
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