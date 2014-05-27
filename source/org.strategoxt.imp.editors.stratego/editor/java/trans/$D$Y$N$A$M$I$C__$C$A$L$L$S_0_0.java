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

@SuppressWarnings("all") public class $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0 extends Strategy 
{ 
  public static $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0 instance = new $D$Y$N$A$M$I$C__$C$A$L$L$S_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("DYNAMIC__CALLS_0_0");
    Fail23360:
    { 
      IStrategoTerm term12688 = term;
      Success12558:
      { 
        Fail23361:
        { 
          IStrategoTerm e_4829 = null;
          e_4829 = term;
          term = undefine_$Project$Dir_0_1.instance.invoke(context, e_4829, trans.const4472);
          if(term == null)
            break Fail23361;
          if(true)
            break Success12558;
        }
        term = term12688;
        IStrategoTerm term12689 = term;
        Success12559:
        { 
          Fail23362:
          { 
            IStrategoTerm c_4829 = null;
            c_4829 = term;
            term = undefine_$Current$File_0_1.instance.invoke(context, c_4829, trans.const4472);
            if(term == null)
              break Fail23362;
            if(true)
              break Success12559;
          }
          term = term12689;
          IStrategoTerm term12690 = term;
          Success12560:
          { 
            Fail23363:
            { 
              IStrategoTerm a_4829 = null;
              a_4829 = term;
              term = undefine_$Is$Imported_0_1.instance.invoke(context, a_4829, trans.const4472);
              if(term == null)
                break Fail23363;
              if(true)
                break Success12560;
            }
            term = term12690;
            IStrategoTerm term12691 = term;
            Success12561:
            { 
              Fail23364:
              { 
                IStrategoTerm y_4828 = null;
                y_4828 = term;
                term = undefine_$Source$Dir_0_1.instance.invoke(context, y_4828, trans.const4472);
                if(term == null)
                  break Fail23364;
                if(true)
                  break Success12561;
              }
              term = term12691;
              IStrategoTerm term12692 = term;
              Success12562:
              { 
                Fail23365:
                { 
                  IStrategoTerm w_4828 = null;
                  w_4828 = term;
                  term = undefine_$Decorated$Ast_0_1.instance.invoke(context, w_4828, trans.const4472);
                  if(term == null)
                    break Fail23365;
                  if(true)
                    break Success12562;
                }
                term = term12692;
                IStrategoTerm term12693 = term;
                Success12563:
                { 
                  Fail23366:
                  { 
                    IStrategoTerm u_4828 = null;
                    u_4828 = term;
                    term = undefine_$Warn$Analysis_0_1.instance.invoke(context, u_4828, trans.const4472);
                    if(term == null)
                      break Fail23366;
                    if(true)
                      break Success12563;
                  }
                  term = term12693;
                  IStrategoTerm term12694 = term;
                  Success12564:
                  { 
                    Fail23367:
                    { 
                      IStrategoTerm s_4828 = null;
                      s_4828 = term;
                      term = undefine_$No$Analysis_0_1.instance.invoke(context, s_4828, trans.const4472);
                      if(term == null)
                        break Fail23367;
                      if(true)
                        break Success12564;
                    }
                    term = term12694;
                    IStrategoTerm term12695 = term;
                    Success12565:
                    { 
                      Fail23368:
                      { 
                        IStrategoTerm q_4828 = null;
                        q_4828 = term;
                        term = undefine_$Current$Dir_0_1.instance.invoke(context, q_4828, trans.const4472);
                        if(term == null)
                          break Fail23368;
                        if(true)
                          break Success12565;
                      }
                      term = term12695;
                      IStrategoTerm term12696 = term;
                      Success12566:
                      { 
                        Fail23369:
                        { 
                          IStrategoTerm o_4828 = null;
                          o_4828 = term;
                          term = undefine_$Declaration_0_1.instance.invoke(context, o_4828, trans.const4472);
                          if(term == null)
                            break Fail23369;
                          if(true)
                            break Success12566;
                        }
                        term = term12696;
                        IStrategoTerm term12697 = term;
                        Success12567:
                        { 
                          Fail23370:
                          { 
                            IStrategoTerm m_4828 = null;
                            m_4828 = term;
                            term = undefine_$Declare$Cookie_0_1.instance.invoke(context, m_4828, trans.const4472);
                            if(term == null)
                              break Fail23370;
                            if(true)
                              break Success12567;
                          }
                          term = term12697;
                          IStrategoTerm term12698 = term;
                          Success12568:
                          { 
                            Fail23371:
                            { 
                              IStrategoTerm k_4828 = null;
                              k_4828 = term;
                              term = undefine_$Is$Imported$Failed_0_1.instance.invoke(context, k_4828, trans.const4472);
                              if(term == null)
                                break Fail23371;
                              if(true)
                                break Success12568;
                            }
                            term = term12698;
                            IStrategoTerm term12699 = term;
                            Success12569:
                            { 
                              Fail23372:
                              { 
                                IStrategoTerm i_4828 = null;
                                i_4828 = term;
                                term = undefine_$Memoize$Include$Properties_0_1.instance.invoke(context, i_4828, trans.const4472);
                                if(term == null)
                                  break Fail23372;
                                if(true)
                                  break Success12569;
                              }
                              term = term12699;
                              IStrategoTerm term12700 = term;
                              Success12570:
                              { 
                                Fail23373:
                                { 
                                  IStrategoTerm d_4828 = null;
                                  IStrategoTerm f_4828 = null;
                                  IStrategoTerm g_4828 = null;
                                  f_4828 = term;
                                  d_4828 = trans.const4472;
                                  g_4828 = f_4828;
                                  term = new_$Declare$Cookie_0_2.instance.invoke(context, g_4828, d_4828, trans.const4472);
                                  if(term == null)
                                    break Fail23373;
                                  if(true)
                                    break Success12570;
                                }
                                term = term12700;
                                IStrategoTerm term12701 = term;
                                Success12571:
                                { 
                                  Fail23374:
                                  { 
                                    IStrategoTerm c_4828 = null;
                                    c_4828 = term;
                                    term = undefine_$Outer$Cookie_0_1.instance.invoke(context, c_4828, trans.const4472);
                                    if(term == null)
                                      break Fail23374;
                                    if(true)
                                      break Success12571;
                                  }
                                  term = term12701;
                                  IStrategoTerm term12702 = term;
                                  Success12572:
                                  { 
                                    Fail23375:
                                    { 
                                      IStrategoTerm a_4828 = null;
                                      a_4828 = term;
                                      term = undefine_$Content$Proposals_0_1.instance.invoke(context, a_4828, trans.const4472);
                                      if(term == null)
                                        break Fail23375;
                                      if(true)
                                        break Success12572;
                                    }
                                    term = term12702;
                                    IStrategoTerm y_4827 = null;
                                    y_4827 = term;
                                    term = undefine_$Is$No$Conflict_0_1.instance.invoke(context, y_4827, trans.const4472);
                                    if(term == null)
                                      break Fail23360;
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