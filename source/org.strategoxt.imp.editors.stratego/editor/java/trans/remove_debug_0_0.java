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

@SuppressWarnings("all") public class remove_debug_0_0 extends Strategy 
{ 
  public static remove_debug_0_0 instance = new remove_debug_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("remove_debug_0_0");
    Fail22718:
    { 
      IStrategoTerm term12122 = term;
      IStrategoConstructor cons582 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12122:
      { 
        if(cons582 == Main._consSeq_2)
        { 
          Fail22719:
          { 
            IStrategoTerm g_4718 = null;
            IStrategoTerm h_4718 = null;
            g_4718 = term.getSubterm(0);
            h_4718 = term.getSubterm(1);
            term = is_debug_call_0_0.instance.invoke(context, h_4718);
            if(term == null)
              break Fail22719;
            term = g_4718;
            if(true)
              break Success12122;
          }
          term = term12122;
        }
        Success12123:
        { 
          if(cons582 == Main._consSeq_2)
          { 
            Fail22720:
            { 
              IStrategoTerm e_4718 = null;
              IStrategoTerm f_4718 = null;
              f_4718 = term.getSubterm(0);
              e_4718 = term.getSubterm(1);
              term = is_debug_call_0_0.instance.invoke(context, f_4718);
              if(term == null)
                break Fail22720;
              term = e_4718;
              if(true)
                break Success12123;
            }
            term = term12122;
          }
          Success12124:
          { 
            if(cons582 == Main._consGuardedLChoice_3)
            { 
              Fail22721:
              { 
                IStrategoTerm c_4718 = null;
                IStrategoTerm d_4718 = null;
                d_4718 = term.getSubterm(0);
                c_4718 = term.getSubterm(1);
                term = is_debug_call_0_0.instance.invoke(context, d_4718);
                if(term == null)
                  break Fail22721;
                term = c_4718;
                if(true)
                  break Success12124;
              }
              term = term12122;
            }
            Success12125:
            { 
              if(cons582 == Main._consGuardedLChoice_3)
              { 
                Fail22722:
                { 
                  IStrategoTerm y_4717 = null;
                  IStrategoTerm z_4717 = null;
                  IStrategoTerm a_4718 = null;
                  y_4717 = term.getSubterm(0);
                  a_4718 = term.getSubterm(1);
                  z_4717 = term.getSubterm(2);
                  term = is_debug_call_0_0.instance.invoke(context, a_4718);
                  if(term == null)
                    break Fail22722;
                  term = termFactory.makeAppl(Main._consLChoice_2, new IStrategoTerm[]{y_4717, z_4717});
                  if(true)
                    break Success12125;
                }
                term = term12122;
              }
              Success12126:
              { 
                if(cons582 == Main._consGuardedLChoice_3)
                { 
                  Fail22723:
                  { 
                    IStrategoTerm v_4717 = null;
                    IStrategoTerm w_4717 = null;
                    IStrategoTerm x_4717 = null;
                    IStrategoTerm arg7960 = term.getSubterm(0);
                    if(arg7960.getTermType() != IStrategoTerm.APPL || Main._consWhere_1 != ((IStrategoAppl)arg7960).getConstructor())
                      break Fail22723;
                    v_4717 = arg7960.getSubterm(0);
                    w_4717 = term.getSubterm(1);
                    x_4717 = term.getSubterm(2);
                    term = is_debug_call_0_0.instance.invoke(context, x_4717);
                    if(term == null)
                      break Fail22723;
                    term = termFactory.makeAppl(Main._consIfThen_2, new IStrategoTerm[]{v_4717, w_4717});
                    if(true)
                      break Success12126;
                  }
                  term = term12122;
                }
                Success12127:
                { 
                  if(cons582 == Main._consGuardedLChoice_3)
                  { 
                    Fail22724:
                    { 
                      IStrategoTerm s_4717 = null;
                      IStrategoTerm t_4717 = null;
                      IStrategoTerm u_4717 = null;
                      s_4717 = term.getSubterm(0);
                      t_4717 = term.getSubterm(1);
                      u_4717 = term.getSubterm(2);
                      term = is_debug_call_0_0.instance.invoke(context, u_4717);
                      if(term == null)
                        break Fail22724;
                      term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{s_4717, t_4717, trans.constId0});
                      if(true)
                        break Success12127;
                    }
                    term = term12122;
                  }
                  Success12128:
                  { 
                    if(cons582 == Main._consRule_3)
                    { 
                      Fail22725:
                      { 
                        IStrategoTerm o_4717 = null;
                        IStrategoTerm p_4717 = null;
                        IStrategoTerm q_4717 = null;
                        IStrategoTerm r_4717 = null;
                        o_4717 = term.getSubterm(0);
                        IStrategoTerm arg7961 = term.getSubterm(1);
                        if(arg7961.getTermType() != IStrategoTerm.APPL || Main._consApp_2 != ((IStrategoAppl)arg7961).getConstructor())
                          break Fail22725;
                        r_4717 = arg7961.getSubterm(0);
                        p_4717 = arg7961.getSubterm(1);
                        q_4717 = term.getSubterm(2);
                        term = is_debug_call_0_0.instance.invoke(context, r_4717);
                        if(term == null)
                          break Fail22725;
                        term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{o_4717, p_4717, q_4717});
                        if(true)
                          break Success12128;
                      }
                      term = term12122;
                    }
                    Success12129:
                    { 
                      if(cons582 == Main._consRule_3)
                      { 
                        Fail22726:
                        { 
                          IStrategoTerm l_4717 = null;
                          IStrategoTerm m_4717 = null;
                          IStrategoTerm n_4717 = null;
                          l_4717 = term.getSubterm(0);
                          m_4717 = term.getSubterm(1);
                          n_4717 = term.getSubterm(2);
                          term = is_debug_call_0_0.instance.invoke(context, n_4717);
                          if(term == null)
                            break Fail22726;
                          term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{l_4717, m_4717, trans.constNil4});
                          if(true)
                            break Success12129;
                        }
                        term = term12122;
                      }
                      if(cons582 == Main._consRule_3)
                      { 
                        IStrategoTerm g_4717 = null;
                        IStrategoTerm h_4717 = null;
                        IStrategoTerm i_4717 = null;
                        g_4717 = term.getSubterm(0);
                        h_4717 = term.getSubterm(1);
                        i_4717 = term.getSubterm(2);
                        term = filter_1_0.instance.invoke(context, i_4717, lifted6700.instance);
                        if(term == null)
                          break Fail22718;
                        term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{g_4717, h_4717, term});
                      }
                      else
                      { 
                        break Fail22718;
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