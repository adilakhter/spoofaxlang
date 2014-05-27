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
    Fail21884:
    { 
      IStrategoTerm term11979 = term;
      Success11849:
      { 
        Fail21885:
        { 
          IStrategoTerm m_4275 = null;
          m_4275 = term;
          term = undefine_$Project$Dir_0_1.instance.invoke(context, m_4275, trans.const4262);
          if(term == null)
            break Fail21885;
          if(true)
            break Success11849;
        }
        term = term11979;
        IStrategoTerm term11980 = term;
        Success11850:
        { 
          Fail21886:
          { 
            IStrategoTerm k_4275 = null;
            k_4275 = term;
            term = undefine_$Current$File_0_1.instance.invoke(context, k_4275, trans.const4262);
            if(term == null)
              break Fail21886;
            if(true)
              break Success11850;
          }
          term = term11980;
          IStrategoTerm term11981 = term;
          Success11851:
          { 
            Fail21887:
            { 
              IStrategoTerm i_4275 = null;
              i_4275 = term;
              term = undefine_$Is$Imported_0_1.instance.invoke(context, i_4275, trans.const4262);
              if(term == null)
                break Fail21887;
              if(true)
                break Success11851;
            }
            term = term11981;
            IStrategoTerm term11982 = term;
            Success11852:
            { 
              Fail21888:
              { 
                IStrategoTerm g_4275 = null;
                g_4275 = term;
                term = undefine_$Source$Dir_0_1.instance.invoke(context, g_4275, trans.const4262);
                if(term == null)
                  break Fail21888;
                if(true)
                  break Success11852;
              }
              term = term11982;
              IStrategoTerm term11983 = term;
              Success11853:
              { 
                Fail21889:
                { 
                  IStrategoTerm e_4275 = null;
                  e_4275 = term;
                  term = undefine_$Decorated$Ast_0_1.instance.invoke(context, e_4275, trans.const4262);
                  if(term == null)
                    break Fail21889;
                  if(true)
                    break Success11853;
                }
                term = term11983;
                IStrategoTerm term11984 = term;
                Success11854:
                { 
                  Fail21890:
                  { 
                    IStrategoTerm c_4275 = null;
                    c_4275 = term;
                    term = undefine_$Warn$Analysis_0_1.instance.invoke(context, c_4275, trans.const4262);
                    if(term == null)
                      break Fail21890;
                    if(true)
                      break Success11854;
                  }
                  term = term11984;
                  IStrategoTerm term11985 = term;
                  Success11855:
                  { 
                    Fail21891:
                    { 
                      IStrategoTerm a_4275 = null;
                      a_4275 = term;
                      term = undefine_$No$Analysis_0_1.instance.invoke(context, a_4275, trans.const4262);
                      if(term == null)
                        break Fail21891;
                      if(true)
                        break Success11855;
                    }
                    term = term11985;
                    IStrategoTerm term11986 = term;
                    Success11856:
                    { 
                      Fail21892:
                      { 
                        IStrategoTerm y_4274 = null;
                        y_4274 = term;
                        term = undefine_$Current$Dir_0_1.instance.invoke(context, y_4274, trans.const4262);
                        if(term == null)
                          break Fail21892;
                        if(true)
                          break Success11856;
                      }
                      term = term11986;
                      IStrategoTerm term11987 = term;
                      Success11857:
                      { 
                        Fail21893:
                        { 
                          IStrategoTerm w_4274 = null;
                          w_4274 = term;
                          term = undefine_$Declaration_0_1.instance.invoke(context, w_4274, trans.const4262);
                          if(term == null)
                            break Fail21893;
                          if(true)
                            break Success11857;
                        }
                        term = term11987;
                        IStrategoTerm term11988 = term;
                        Success11858:
                        { 
                          Fail21894:
                          { 
                            IStrategoTerm u_4274 = null;
                            u_4274 = term;
                            term = undefine_$Declare$Cookie_0_1.instance.invoke(context, u_4274, trans.const4262);
                            if(term == null)
                              break Fail21894;
                            if(true)
                              break Success11858;
                          }
                          term = term11988;
                          IStrategoTerm term11989 = term;
                          Success11859:
                          { 
                            Fail21895:
                            { 
                              IStrategoTerm s_4274 = null;
                              s_4274 = term;
                              term = undefine_$Is$Imported$Failed_0_1.instance.invoke(context, s_4274, trans.const4262);
                              if(term == null)
                                break Fail21895;
                              if(true)
                                break Success11859;
                            }
                            term = term11989;
                            IStrategoTerm term11990 = term;
                            Success11860:
                            { 
                              Fail21896:
                              { 
                                IStrategoTerm q_4274 = null;
                                q_4274 = term;
                                term = undefine_$Memoize$Include$Properties_0_1.instance.invoke(context, q_4274, trans.const4262);
                                if(term == null)
                                  break Fail21896;
                                if(true)
                                  break Success11860;
                              }
                              term = term11990;
                              IStrategoTerm term11991 = term;
                              Success11861:
                              { 
                                Fail21897:
                                { 
                                  IStrategoTerm l_4274 = null;
                                  IStrategoTerm n_4274 = null;
                                  IStrategoTerm o_4274 = null;
                                  n_4274 = term;
                                  l_4274 = trans.const4262;
                                  o_4274 = n_4274;
                                  term = new_$Declare$Cookie_0_2.instance.invoke(context, o_4274, l_4274, trans.const4262);
                                  if(term == null)
                                    break Fail21897;
                                  if(true)
                                    break Success11861;
                                }
                                term = term11991;
                                IStrategoTerm term11992 = term;
                                Success11862:
                                { 
                                  Fail21898:
                                  { 
                                    IStrategoTerm k_4274 = null;
                                    k_4274 = term;
                                    term = undefine_$Outer$Cookie_0_1.instance.invoke(context, k_4274, trans.const4262);
                                    if(term == null)
                                      break Fail21898;
                                    if(true)
                                      break Success11862;
                                  }
                                  term = term11992;
                                  IStrategoTerm term11993 = term;
                                  Success11863:
                                  { 
                                    Fail21899:
                                    { 
                                      IStrategoTerm i_4274 = null;
                                      i_4274 = term;
                                      term = undefine_$Content$Proposals_0_1.instance.invoke(context, i_4274, trans.const4262);
                                      if(term == null)
                                        break Fail21899;
                                      if(true)
                                        break Success11863;
                                    }
                                    term = term11993;
                                    IStrategoTerm g_4274 = null;
                                    g_4274 = term;
                                    term = undefine_$Is$No$Conflict_0_1.instance.invoke(context, g_4274, trans.const4262);
                                    if(term == null)
                                      break Fail21884;
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