package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class ignore_prod_0_0 extends Strategy 
{ 
  public static ignore_prod_0_0 instance = new ignore_prod_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ignore_prod_0_0");
    Fail25594:
    { 
      IStrategoTerm term10119 = term;
      IStrategoConstructor cons330 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10087:
      { 
        if(cons330 == SpoofaxGenerator._consprod_3)
        { 
          Fail25595:
          { 
            IStrategoTerm arg5959 = term.getSubterm(1);
            if(arg5959.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5959).getConstructor())
              break Fail25595;
            IStrategoTerm arg5960 = arg5959.getSubterm(0);
            if(arg5960.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg5960).getConstructor())
              break Fail25595;
            if(true)
              break Success10087;
          }
          term = term10119;
        }
        Success10088:
        { 
          if(cons330 == SpoofaxGenerator._consprod_3)
          { 
            Fail25596:
            { 
              IStrategoTerm arg5963 = term.getSubterm(1);
              if(arg5963.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5963).getConstructor())
                break Fail25596;
              IStrategoTerm arg5964 = arg5963.getSubterm(0);
              if(arg5964.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consopt_1 != ((IStrategoAppl)arg5964).getConstructor())
                break Fail25596;
              IStrategoTerm arg5965 = arg5964.getSubterm(0);
              if(arg5965.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslayout_0 != ((IStrategoAppl)arg5965).getConstructor())
                break Fail25596;
              if(true)
                break Success10088;
            }
            term = term10119;
          }
          Success10089:
          { 
            if(cons330 == SpoofaxGenerator._consprod_3)
            { 
              Fail25597:
              { 
                IStrategoTerm arg5968 = term.getSubterm(1);
                if(arg5968.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslex_1 != ((IStrategoAppl)arg5968).getConstructor())
                  break Fail25597;
                if(true)
                  break Success10089;
              }
              term = term10119;
            }
            Success10090:
            { 
              if(cons330 == SpoofaxGenerator._consprod_3)
              { 
                Fail25598:
                { 
                  IStrategoTerm arg5972 = term.getSubterm(1);
                  if(arg5972.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslit_1 != ((IStrategoAppl)arg5972).getConstructor())
                    break Fail25598;
                  if(true)
                    break Success10090;
                }
                term = term10119;
              }
              Success10091:
              { 
                if(cons330 == SpoofaxGenerator._consprod_3)
                { 
                  Fail25599:
                  { 
                    IStrategoTerm arg5976 = term.getSubterm(1);
                    if(arg5976.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consci_lit_1 != ((IStrategoAppl)arg5976).getConstructor())
                      break Fail25599;
                    if(true)
                      break Success10091;
                  }
                  term = term10119;
                }
                Success10092:
                { 
                  if(cons330 == SpoofaxGenerator._consprod_3)
                  { 
                    Fail25600:
                    { 
                      IStrategoTerm arg5979 = term.getSubterm(0);
                      if(arg5979.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5979).isEmpty())
                        break Fail25600;
                      IStrategoTerm arg5980 = ((IStrategoList)arg5979).head();
                      if(arg5980.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslex_1 != ((IStrategoAppl)arg5980).getConstructor())
                        break Fail25600;
                      IStrategoTerm arg5981 = arg5980.getSubterm(0);
                      if(arg5981.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consiter_star_1 != ((IStrategoAppl)arg5981).getConstructor())
                        break Fail25600;
                      IStrategoTerm arg5982 = arg5981.getSubterm(0);
                      if(arg5982.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conschar_class_1 != ((IStrategoAppl)arg5982).getConstructor())
                        break Fail25600;
                      IStrategoTerm arg5984 = ((IStrategoList)arg5979).tail();
                      if(arg5984.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5984).isEmpty())
                        break Fail25600;
                      IStrategoTerm arg5985 = term.getSubterm(1);
                      if(arg5985.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5985).getConstructor())
                        break Fail25600;
                      IStrategoTerm arg5986 = arg5985.getSubterm(0);
                      if(arg5986.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consiter_star_1 != ((IStrategoAppl)arg5986).getConstructor())
                        break Fail25600;
                      IStrategoTerm arg5987 = arg5986.getSubterm(0);
                      if(arg5987.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conschar_class_1 != ((IStrategoAppl)arg5987).getConstructor())
                        break Fail25600;
                      if(true)
                        break Success10092;
                    }
                    term = term10119;
                  }
                  Success10093:
                  { 
                    if(cons330 == SpoofaxGenerator._consprod_3)
                    { 
                      Fail25601:
                      { 
                        IStrategoTerm c_4241 = null;
                        IStrategoTerm d_4241 = null;
                        IStrategoTerm arg5990 = term.getSubterm(0);
                        if(arg5990.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5990).isEmpty())
                          break Fail25601;
                        IStrategoTerm arg5991 = ((IStrategoList)arg5990).head();
                        if(arg5991.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslex_1 != ((IStrategoAppl)arg5991).getConstructor())
                          break Fail25601;
                        IStrategoTerm arg5993 = ((IStrategoList)arg5990).tail();
                        if(arg5993.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5993).isEmpty())
                          break Fail25601;
                        c_4241 = term.getSubterm(1);
                        d_4241 = term;
                        term = oncetd_1_0.instance.invoke(context, c_4241, lifted9148.instance);
                        if(term == null)
                          break Fail25601;
                        term = d_4241;
                        if(true)
                          break Success10093;
                      }
                      term = term10119;
                    }
                    Success10094:
                    { 
                      if(cons330 == SpoofaxGenerator._consprod_3)
                      { 
                        Fail25602:
                        { 
                          IStrategoTerm b_4241 = null;
                          IStrategoTerm arg5996 = term.getSubterm(0);
                          if(arg5996.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg5996).isEmpty())
                            break Fail25602;
                          b_4241 = ((IStrategoList)arg5996).head();
                          IStrategoTerm arg5997 = ((IStrategoList)arg5996).tail();
                          if(arg5997.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg5997).isEmpty())
                            break Fail25602;
                          IStrategoTerm arg5998 = term.getSubterm(1);
                          if(arg5998.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg5998).getConstructor())
                            break Fail25602;
                          if(arg5998.getSubterm(0) != b_4241 && !b_4241.match(arg5998.getSubterm(0)))
                            break Fail25602;
                          if(true)
                            break Success10094;
                        }
                        term = term10119;
                      }
                      Success10095:
                      { 
                        if(cons330 == SpoofaxGenerator._consprod_3)
                        { 
                          Fail25603:
                          { 
                            IStrategoTerm a_4241 = null;
                            IStrategoTerm arg6000 = term.getSubterm(0);
                            if(arg6000.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6000).isEmpty())
                              break Fail25603;
                            IStrategoTerm arg6001 = ((IStrategoList)arg6000).head();
                            if(arg6001.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consvarsym_1 != ((IStrategoAppl)arg6001).getConstructor())
                              break Fail25603;
                            IStrategoTerm arg6002 = arg6001.getSubterm(0);
                            if(arg6002.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6002).getConstructor())
                              break Fail25603;
                            a_4241 = arg6002.getSubterm(0);
                            IStrategoTerm arg6003 = ((IStrategoList)arg6000).tail();
                            if(arg6003.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6003).isEmpty())
                              break Fail25603;
                            IStrategoTerm arg6004 = term.getSubterm(1);
                            if(arg6004.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6004).getConstructor())
                              break Fail25603;
                            if(arg6004.getSubterm(0) != a_4241 && !a_4241.match(arg6004.getSubterm(0)))
                              break Fail25603;
                            if(true)
                              break Success10095;
                          }
                          term = term10119;
                        }
                        Success10096:
                        { 
                          if(cons330 == SpoofaxGenerator._consprod_3)
                          { 
                            Fail25604:
                            { 
                              IStrategoTerm x_4240 = null;
                              IStrategoTerm y_4240 = null;
                              IStrategoTerm arg6006 = term.getSubterm(0);
                              if(arg6006.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6006).isEmpty())
                                break Fail25604;
                              IStrategoTerm arg6007 = ((IStrategoList)arg6006).head();
                              if(arg6007.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslit_1 != ((IStrategoAppl)arg6007).getConstructor())
                                break Fail25604;
                              IStrategoTerm arg6009 = ((IStrategoList)arg6006).tail();
                              if(arg6009.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6009).isEmpty())
                                break Fail25604;
                              IStrategoTerm arg6010 = term.getSubterm(1);
                              if(arg6010.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)arg6010).getConstructor())
                                break Fail25604;
                              IStrategoTerm arg6011 = arg6010.getSubterm(0);
                              if(arg6011.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consalt_2 != ((IStrategoAppl)arg6011).getConstructor())
                                break Fail25604;
                              IStrategoTerm arg6012 = arg6011.getSubterm(0);
                              if(arg6012.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslit_1 != ((IStrategoAppl)arg6012).getConstructor())
                                break Fail25604;
                              x_4240 = arg6011.getSubterm(1);
                              IStrategoTerm arg6014 = term.getSubterm(2);
                              if(arg6014.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consattrs_1 != ((IStrategoAppl)arg6014).getConstructor())
                                break Fail25604;
                              IStrategoTerm arg6015 = arg6014.getSubterm(0);
                              if(arg6015.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6015).isEmpty())
                                break Fail25604;
                              y_4240 = term;
                              term = z_4240.instance.invoke(context, x_4240);
                              if(term == null)
                                break Fail25604;
                              term = y_4240;
                              if(true)
                                break Success10096;
                            }
                            term = term10119;
                          }
                          Success10097:
                          { 
                            if(cons330 == SpoofaxGenerator._consprod_3)
                            { 
                              Fail25605:
                              { 
                                IStrategoTerm arg6016 = term.getSubterm(0);
                                if(arg6016.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6016).isEmpty())
                                  break Fail25605;
                                IStrategoTerm arg6017 = ((IStrategoList)arg6016).head();
                                if(arg6017.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consstart_0 != ((IStrategoAppl)arg6017).getConstructor())
                                  break Fail25605;
                                IStrategoTerm arg6018 = ((IStrategoList)arg6016).tail();
                                if(arg6018.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6018).isEmpty())
                                  break Fail25605;
                                IStrategoTerm arg6019 = term.getSubterm(1);
                                if(arg6019.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conssort_1 != ((IStrategoAppl)arg6019).getConstructor())
                                  break Fail25605;
                                IStrategoTerm arg6020 = arg6019.getSubterm(0);
                                if(arg6020.getTermType() != IStrategoTerm.STRING || !"SURROGATE-START".equals(((IStrategoString)arg6020).stringValue()))
                                  break Fail25605;
                                if(true)
                                  break Success10097;
                              }
                              term = term10119;
                            }
                            Success10098:
                            { 
                              if(cons330 == SpoofaxGenerator._consprod_3)
                              { 
                                Fail25606:
                                { 
                                  IStrategoTerm arg6023 = term.getSubterm(1);
                                  if(arg6023.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consfile_start_0 != ((IStrategoAppl)arg6023).getConstructor())
                                    break Fail25606;
                                  if(true)
                                    break Success10098;
                                }
                                term = term10119;
                              }
                              Success10099:
                              { 
                                if(cons330 == SpoofaxGenerator._consprod_3)
                                { 
                                  Fail25607:
                                  { 
                                    IStrategoTerm v_4240 = null;
                                    IStrategoTerm w_4240 = null;
                                    IStrategoTerm arg6027 = term.getSubterm(2);
                                    if(arg6027.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consattrs_1 != ((IStrategoAppl)arg6027).getConstructor())
                                      break Fail25607;
                                    v_4240 = arg6027.getSubterm(0);
                                    w_4240 = term;
                                    term = contains_reject_0_0.instance.invoke(context, v_4240);
                                    if(term == null)
                                      break Fail25607;
                                    term = w_4240;
                                    if(true)
                                      break Success10099;
                                  }
                                  term = term10119;
                                }
                                Success10100:
                                { 
                                  if(cons330 == SpoofaxGenerator._consprod_3)
                                  { 
                                    Fail25608:
                                    { 
                                      IStrategoTerm t_4240 = null;
                                      IStrategoTerm u_4240 = null;
                                      IStrategoTerm arg6030 = term.getSubterm(2);
                                      if(arg6030.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consattrs_1 != ((IStrategoAppl)arg6030).getConstructor())
                                        break Fail25608;
                                      t_4240 = arg6030.getSubterm(0);
                                      u_4240 = term;
                                      term = contains_rtg_1_0.instance.invoke(context, t_4240, lifted9150.instance);
                                      if(term == null)
                                        break Fail25608;
                                      term = u_4240;
                                      if(true)
                                        break Success10100;
                                    }
                                    term = term10119;
                                  }
                                  IStrategoTerm term10134 = term;
                                  Success10101:
                                  { 
                                    Fail25609:
                                    { 
                                      TermReference p_4240 = new TermReference();
                                      TermReference q_4240 = new TermReference();
                                      TermReference r_4240 = new TermReference();
                                      IStrategoTerm s_4240 = null;
                                      lifted9155 lifted91550 = new lifted9155();
                                      lifted9152 lifted91520 = new lifted9152();
                                      lifted9151 lifted91510 = new lifted9151();
                                      lifted91550.p_4240 = p_4240;
                                      lifted91520.r_4240 = r_4240;
                                      lifted91510.q_4240 = q_4240;
                                      term = prod_3_0.instance.invoke(context, term, lifted91510, lifted91520, lifted91550);
                                      if(term == null)
                                        break Fail25609;
                                      s_4240 = term;
                                      if(p_4240.value == null)
                                        break Fail25609;
                                      term = contains_bracket_0_0.instance.invoke(context, p_4240.value);
                                      if(term == null)
                                        break Fail25609;
                                      if(p_4240.value == null)
                                        break Fail25609;
                                      term = p_4240.value;
                                      IStrategoTerm term10135 = term;
                                      Success10102:
                                      { 
                                        Fail25610:
                                        { 
                                          term = get_cnstr_name_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail25610;
                                          { 
                                            if(true)
                                              break Fail25609;
                                            if(true)
                                              break Success10102;
                                          }
                                        }
                                        term = term10135;
                                      }
                                      if(q_4240.value == null)
                                        break Fail25609;
                                      term = syms2trees_0_0.instance.invoke(context, q_4240.value);
                                      if(term == null)
                                        break Fail25609;
                                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                        break Fail25609;
                                      IStrategoTerm arg6031 = ((IStrategoList)term).head();
                                      if(arg6031.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)arg6031).getConstructor())
                                        break Fail25609;
                                      IStrategoTerm arg6032 = arg6031.getSubterm(0);
                                      if(arg6032.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6032).getConstructor())
                                        break Fail25609;
                                      if(r_4240.value == null)
                                        r_4240.value = arg6032.getSubterm(0);
                                      else
                                        if(r_4240.value != arg6032.getSubterm(0) && !r_4240.value.match(arg6032.getSubterm(0)))
                                          break Fail25609;
                                      IStrategoTerm arg6033 = ((IStrategoList)term).tail();
                                      if(arg6033.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6033).isEmpty())
                                        break Fail25609;
                                      term = s_4240;
                                      if(true)
                                        break Success10101;
                                    }
                                    term = is_start_prod_0_0.instance.invoke(context, term10134);
                                    if(term == null)
                                      break Fail25594;
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