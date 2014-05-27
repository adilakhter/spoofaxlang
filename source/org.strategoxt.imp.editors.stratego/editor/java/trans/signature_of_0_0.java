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
    Fail23044:
    { 
      IStrategoTerm term12378 = term;
      IStrategoConstructor cons587 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12303:
      { 
        if(cons587 == Main._consSDefT_4)
        { 
          Fail23045:
          { 
            IStrategoTerm t_4773 = null;
            IStrategoTerm u_4773 = null;
            IStrategoTerm v_4773 = null;
            IStrategoTerm w_4773 = null;
            IStrategoTerm x_4773 = null;
            t_4773 = term.getSubterm(0);
            u_4773 = term.getSubterm(1);
            v_4773 = term.getSubterm(2);
            term = remove_quote_0_0.instance.invoke(context, t_4773);
            if(term == null)
              break Fail23045;
            w_4773 = term;
            term = length_0_0.instance.invoke(context, u_4773);
            if(term == null)
              break Fail23045;
            x_4773 = term;
            term = length_0_0.instance.invoke(context, v_4773);
            if(term == null)
              break Fail23045;
            term = termFactory.makeTuple(w_4773, x_4773, term);
            if(true)
              break Success12303;
          }
          term = term12378;
        }
        Success12304:
        { 
          if(cons587 == Main._consRDecT_3)
          { 
            Fail23046:
            { 
              IStrategoTerm j_4773 = null;
              IStrategoTerm k_4773 = null;
              IStrategoTerm l_4773 = null;
              IStrategoTerm m_4773 = null;
              IStrategoTerm n_4773 = null;
              j_4773 = term.getSubterm(0);
              k_4773 = term.getSubterm(1);
              l_4773 = term.getSubterm(2);
              term = remove_quote_0_0.instance.invoke(context, j_4773);
              if(term == null)
                break Fail23046;
              m_4773 = term;
              term = length_0_0.instance.invoke(context, k_4773);
              if(term == null)
                break Fail23046;
              n_4773 = term;
              term = length_0_0.instance.invoke(context, l_4773);
              if(term == null)
                break Fail23046;
              term = termFactory.makeTuple(m_4773, n_4773, term);
              if(true)
                break Success12304;
            }
            term = term12378;
          }
          Success12305:
          { 
            if(cons587 == Main._consExtSDef_3)
            { 
              Fail23047:
              { 
                IStrategoTerm a_4773 = null;
                IStrategoTerm b_4773 = null;
                IStrategoTerm c_4773 = null;
                IStrategoTerm d_4773 = null;
                IStrategoTerm e_4773 = null;
                a_4773 = term.getSubterm(0);
                b_4773 = term.getSubterm(1);
                c_4773 = term.getSubterm(2);
                term = remove_quote_0_0.instance.invoke(context, a_4773);
                if(term == null)
                  break Fail23047;
                d_4773 = term;
                term = length_0_0.instance.invoke(context, b_4773);
                if(term == null)
                  break Fail23047;
                e_4773 = term;
                term = length_0_0.instance.invoke(context, c_4773);
                if(term == null)
                  break Fail23047;
                term = termFactory.makeTuple(d_4773, e_4773, term);
                if(true)
                  break Success12305;
              }
              term = term12378;
            }
            Success12306:
            { 
              if(cons587 == Main._consCallT_3)
              { 
                Fail23048:
                { 
                  IStrategoTerm r_4772 = null;
                  IStrategoTerm s_4772 = null;
                  IStrategoTerm t_4772 = null;
                  IStrategoTerm u_4772 = null;
                  IStrategoTerm v_4772 = null;
                  IStrategoTerm arg8192 = term.getSubterm(0);
                  if(arg8192.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg8192).getConstructor())
                    break Fail23048;
                  r_4772 = arg8192.getSubterm(0);
                  s_4772 = term.getSubterm(1);
                  t_4772 = term.getSubterm(2);
                  term = remove_quote_0_0.instance.invoke(context, r_4772);
                  if(term == null)
                    break Fail23048;
                  u_4772 = term;
                  term = length_0_0.instance.invoke(context, s_4772);
                  if(term == null)
                    break Fail23048;
                  v_4772 = term;
                  term = length_0_0.instance.invoke(context, t_4772);
                  if(term == null)
                    break Fail23048;
                  term = termFactory.makeTuple(u_4772, v_4772, term);
                  if(true)
                    break Success12306;
                }
                term = term12378;
              }
              Success12307:
              { 
                if(cons587 == Main._consVar_1)
                { 
                  Fail23049:
                  { 
                    IStrategoTerm o_4772 = null;
                    o_4772 = term.getSubterm(0);
                    term = remove_quote_0_0.instance.invoke(context, o_4772);
                    if(term == null)
                      break Fail23049;
                    term = termFactory.makeTuple(term, trans.const4437);
                    if(true)
                      break Success12307;
                  }
                  term = term12378;
                }
                Success12308:
                { 
                  if(cons587 == Main._consVarDec_2)
                  { 
                    Fail23050:
                    { 
                      IStrategoTerm l_4772 = null;
                      l_4772 = term.getSubterm(0);
                      term = remove_quote_0_0.instance.invoke(context, l_4772);
                      if(term == null)
                        break Fail23050;
                      term = termFactory.makeTuple(term, trans.const4437);
                      if(true)
                        break Success12308;
                    }
                    term = term12378;
                  }
                  Success12309:
                  { 
                    if(cons587 == Main._consOp_2)
                    { 
                      Fail23051:
                      { 
                        IStrategoTerm e_4772 = null;
                        IStrategoTerm f_4772 = null;
                        IStrategoTerm g_4772 = null;
                        e_4772 = term.getSubterm(0);
                        f_4772 = term.getSubterm(1);
                        term = remove_quote_0_0.instance.invoke(context, e_4772);
                        if(term == null)
                          break Fail23051;
                        g_4772 = term;
                        term = length_0_0.instance.invoke(context, f_4772);
                        if(term == null)
                          break Fail23051;
                        term = termFactory.makeTuple(g_4772, term);
                        if(true)
                          break Success12309;
                      }
                      term = term12378;
                    }
                    Success12310:
                    { 
                      if(cons587 == Main._consOpDecl_2)
                      { 
                        Fail23052:
                        { 
                          IStrategoTerm y_4771 = null;
                          IStrategoTerm z_4771 = null;
                          IStrategoTerm a_4772 = null;
                          y_4771 = term.getSubterm(0);
                          z_4771 = term.getSubterm(1);
                          term = remove_quote_0_0.instance.invoke(context, y_4771);
                          if(term == null)
                            break Fail23052;
                          a_4772 = term;
                          term = occurrences_1_0.instance.invoke(context, z_4771, lifted6846.instance);
                          if(term == null)
                            break Fail23052;
                          term = dec_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail23052;
                          term = termFactory.makeTuple(a_4772, term);
                          if(true)
                            break Success12310;
                        }
                        term = term12378;
                      }
                      Success12311:
                      { 
                        if(cons587 == Main._consExtOpDecl_2)
                        { 
                          Fail23053:
                          { 
                            IStrategoTerm s_4771 = null;
                            IStrategoTerm t_4771 = null;
                            IStrategoTerm u_4771 = null;
                            s_4771 = term.getSubterm(0);
                            t_4771 = term.getSubterm(1);
                            term = remove_quote_0_0.instance.invoke(context, s_4771);
                            if(term == null)
                              break Fail23053;
                            u_4771 = term;
                            term = occurrences_1_0.instance.invoke(context, t_4771, lifted6847.instance);
                            if(term == null)
                              break Fail23053;
                            term = dec_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail23053;
                            term = termFactory.makeTuple(u_4771, term);
                            if(true)
                              break Success12311;
                          }
                          term = term12378;
                        }
                        Success12312:
                        { 
                          if(cons587 == Main._consOverlay_3)
                          { 
                            Fail23054:
                            { 
                              IStrategoTerm m_4771 = null;
                              IStrategoTerm n_4771 = null;
                              IStrategoTerm o_4771 = null;
                              m_4771 = term.getSubterm(0);
                              n_4771 = term.getSubterm(1);
                              term = remove_quote_0_0.instance.invoke(context, m_4771);
                              if(term == null)
                                break Fail23054;
                              o_4771 = term;
                              term = length_0_0.instance.invoke(context, n_4771);
                              if(term == null)
                                break Fail23054;
                              term = termFactory.makeTuple(o_4771, term);
                              if(true)
                                break Success12312;
                            }
                            term = term12378;
                          }
                          Success12313:
                          { 
                            if(cons587 == Main._consRec_2)
                            { 
                              Fail23055:
                              { 
                                IStrategoTerm j_4771 = null;
                                j_4771 = term.getSubterm(0);
                                term = remove_quote_0_0.instance.invoke(context, j_4771);
                                if(term == null)
                                  break Fail23055;
                                term = termFactory.makeTuple(term, trans.const4437, trans.const4437);
                                if(true)
                                  break Success12313;
                              }
                              term = term12378;
                            }
                            Success12314:
                            { 
                              if(cons587 == Main._consLabeledDynRuleScopeId_2)
                              { 
                                Fail23056:
                                { 
                                  IStrategoTerm h_4771 = null;
                                  h_4771 = term.getSubterm(0);
                                  term = remove_quote_0_0.instance.invoke(context, h_4771);
                                  if(term == null)
                                    break Fail23056;
                                  if(true)
                                    break Success12314;
                                }
                                term = term12378;
                              }
                              if(cons587 == Main._consDynRuleScopeId_1)
                              { 
                                IStrategoTerm g_4771 = null;
                                g_4771 = term.getSubterm(0);
                                term = remove_quote_0_0.instance.invoke(context, g_4771);
                                if(term == null)
                                  break Fail23044;
                              }
                              else
                              { 
                                break Fail23044;
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