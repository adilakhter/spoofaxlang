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
    Fail21242:
    { 
      IStrategoTerm term11413 = term;
      IStrategoConstructor cons538 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11413:
      { 
        if(cons538 == Main._consSeq_2)
        { 
          Fail21243:
          { 
            IStrategoTerm o_4164 = null;
            IStrategoTerm p_4164 = null;
            o_4164 = term.getSubterm(0);
            p_4164 = term.getSubterm(1);
            term = is_debug_call_0_0.instance.invoke(context, p_4164);
            if(term == null)
              break Fail21243;
            term = o_4164;
            if(true)
              break Success11413;
          }
          term = term11413;
        }
        Success11414:
        { 
          if(cons538 == Main._consSeq_2)
          { 
            Fail21244:
            { 
              IStrategoTerm m_4164 = null;
              IStrategoTerm n_4164 = null;
              n_4164 = term.getSubterm(0);
              m_4164 = term.getSubterm(1);
              term = is_debug_call_0_0.instance.invoke(context, n_4164);
              if(term == null)
                break Fail21244;
              term = m_4164;
              if(true)
                break Success11414;
            }
            term = term11413;
          }
          Success11415:
          { 
            if(cons538 == Main._consGuardedLChoice_3)
            { 
              Fail21245:
              { 
                IStrategoTerm k_4164 = null;
                IStrategoTerm l_4164 = null;
                l_4164 = term.getSubterm(0);
                k_4164 = term.getSubterm(1);
                term = is_debug_call_0_0.instance.invoke(context, l_4164);
                if(term == null)
                  break Fail21245;
                term = k_4164;
                if(true)
                  break Success11415;
              }
              term = term11413;
            }
            Success11416:
            { 
              if(cons538 == Main._consGuardedLChoice_3)
              { 
                Fail21246:
                { 
                  IStrategoTerm g_4164 = null;
                  IStrategoTerm h_4164 = null;
                  IStrategoTerm i_4164 = null;
                  g_4164 = term.getSubterm(0);
                  i_4164 = term.getSubterm(1);
                  h_4164 = term.getSubterm(2);
                  term = is_debug_call_0_0.instance.invoke(context, i_4164);
                  if(term == null)
                    break Fail21246;
                  term = termFactory.makeAppl(Main._consLChoice_2, new IStrategoTerm[]{g_4164, h_4164});
                  if(true)
                    break Success11416;
                }
                term = term11413;
              }
              Success11417:
              { 
                if(cons538 == Main._consGuardedLChoice_3)
                { 
                  Fail21247:
                  { 
                    IStrategoTerm d_4164 = null;
                    IStrategoTerm e_4164 = null;
                    IStrategoTerm f_4164 = null;
                    IStrategoTerm arg7493 = term.getSubterm(0);
                    if(arg7493.getTermType() != IStrategoTerm.APPL || Main._consWhere_1 != ((IStrategoAppl)arg7493).getConstructor())
                      break Fail21247;
                    d_4164 = arg7493.getSubterm(0);
                    e_4164 = term.getSubterm(1);
                    f_4164 = term.getSubterm(2);
                    term = is_debug_call_0_0.instance.invoke(context, f_4164);
                    if(term == null)
                      break Fail21247;
                    term = termFactory.makeAppl(Main._consIfThen_2, new IStrategoTerm[]{d_4164, e_4164});
                    if(true)
                      break Success11417;
                  }
                  term = term11413;
                }
                Success11418:
                { 
                  if(cons538 == Main._consGuardedLChoice_3)
                  { 
                    Fail21248:
                    { 
                      IStrategoTerm a_4164 = null;
                      IStrategoTerm b_4164 = null;
                      IStrategoTerm c_4164 = null;
                      a_4164 = term.getSubterm(0);
                      b_4164 = term.getSubterm(1);
                      c_4164 = term.getSubterm(2);
                      term = is_debug_call_0_0.instance.invoke(context, c_4164);
                      if(term == null)
                        break Fail21248;
                      term = termFactory.makeAppl(Main._consGuardedLChoice_3, new IStrategoTerm[]{a_4164, b_4164, trans.constId0});
                      if(true)
                        break Success11418;
                    }
                    term = term11413;
                  }
                  Success11419:
                  { 
                    if(cons538 == Main._consRule_3)
                    { 
                      Fail21249:
                      { 
                        IStrategoTerm w_4163 = null;
                        IStrategoTerm x_4163 = null;
                        IStrategoTerm y_4163 = null;
                        IStrategoTerm z_4163 = null;
                        w_4163 = term.getSubterm(0);
                        IStrategoTerm arg7494 = term.getSubterm(1);
                        if(arg7494.getTermType() != IStrategoTerm.APPL || Main._consApp_2 != ((IStrategoAppl)arg7494).getConstructor())
                          break Fail21249;
                        z_4163 = arg7494.getSubterm(0);
                        x_4163 = arg7494.getSubterm(1);
                        y_4163 = term.getSubterm(2);
                        term = is_debug_call_0_0.instance.invoke(context, z_4163);
                        if(term == null)
                          break Fail21249;
                        term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{w_4163, x_4163, y_4163});
                        if(true)
                          break Success11419;
                      }
                      term = term11413;
                    }
                    Success11420:
                    { 
                      if(cons538 == Main._consRule_3)
                      { 
                        Fail21250:
                        { 
                          IStrategoTerm t_4163 = null;
                          IStrategoTerm u_4163 = null;
                          IStrategoTerm v_4163 = null;
                          t_4163 = term.getSubterm(0);
                          u_4163 = term.getSubterm(1);
                          v_4163 = term.getSubterm(2);
                          term = is_debug_call_0_0.instance.invoke(context, v_4163);
                          if(term == null)
                            break Fail21250;
                          term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{t_4163, u_4163, trans.constNil3});
                          if(true)
                            break Success11420;
                        }
                        term = term11413;
                      }
                      if(cons538 == Main._consRule_3)
                      { 
                        IStrategoTerm o_4163 = null;
                        IStrategoTerm p_4163 = null;
                        IStrategoTerm q_4163 = null;
                        o_4163 = term.getSubterm(0);
                        p_4163 = term.getSubterm(1);
                        q_4163 = term.getSubterm(2);
                        term = filter_1_0.instance.invoke(context, q_4163, lifted6429.instance);
                        if(term == null)
                          break Fail21242;
                        term = termFactory.makeAppl(Main._consRule_3, new IStrategoTerm[]{o_4163, p_4163, term});
                      }
                      else
                      { 
                        break Fail21242;
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