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

@SuppressWarnings("all") public class $Symbol2$String_0_0 extends Strategy 
{ 
  public static $Symbol2$String_0_0 instance = new $Symbol2$String_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Symbol2String_0_0");
    Fail25681:
    { 
      IStrategoTerm term10182 = term;
      IStrategoConstructor cons337 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10146:
      { 
        if(cons337 == SpoofaxGenerator._conscf_1)
        { 
          Fail25682:
          { 
            IStrategoTerm v_4248 = null;
            v_4248 = term.getSubterm(0);
            term = this.invoke(context, v_4248);
            if(term == null)
              break Fail25682;
            if(true)
              break Success10146;
          }
          term = term10182;
        }
        Success10147:
        { 
          if(cons337 == SpoofaxGenerator._conslex_1)
          { 
            Fail25683:
            { 
              IStrategoTerm u_4248 = null;
              u_4248 = term.getSubterm(0);
              term = this.invoke(context, u_4248);
              if(term == null)
                break Fail25683;
              if(true)
                break Success10147;
            }
            term = term10182;
          }
          Success10148:
          { 
            if(cons337 == SpoofaxGenerator._conschar_class_1)
            { 
              Fail25684:
              { 
                term = generator.const7115;
                if(true)
                  break Success10148;
              }
              term = term10182;
            }
            Success10149:
            { 
              if(cons337 == SpoofaxGenerator._conslit_1)
              { 
                Fail25685:
                { 
                  term = generator.const7116;
                  if(true)
                    break Success10149;
                }
                term = term10182;
              }
              Success10150:
              { 
                if(cons337 == SpoofaxGenerator._consci_lit_1)
                { 
                  Fail25686:
                  { 
                    term = generator.const7117;
                    if(true)
                      break Success10150;
                  }
                  term = term10182;
                }
                Success10151:
                { 
                  if(cons337 == SpoofaxGenerator._consiter_1)
                  { 
                    Fail25687:
                    { 
                      IStrategoTerm r_4248 = null;
                      r_4248 = term.getSubterm(0);
                      term = this.invoke(context, r_4248);
                      if(term == null)
                        break Fail25687;
                      term = termFactory.makeTuple(generator.const7118, term);
                      term = conc_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail25687;
                      if(true)
                        break Success10151;
                    }
                    term = term10182;
                  }
                  Success10152:
                  { 
                    if(cons337 == SpoofaxGenerator._consiter_star_1)
                    { 
                      Fail25688:
                      { 
                        IStrategoTerm o_4248 = null;
                        o_4248 = term.getSubterm(0);
                        term = this.invoke(context, o_4248);
                        if(term == null)
                          break Fail25688;
                        term = termFactory.makeTuple(generator.const7119, term);
                        term = conc_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail25688;
                        if(true)
                          break Success10152;
                      }
                      term = term10182;
                    }
                    Success10153:
                    { 
                      if(cons337 == SpoofaxGenerator._consiter_sep_2)
                      { 
                        Fail25689:
                        { 
                          IStrategoTerm l_4248 = null;
                          l_4248 = term.getSubterm(0);
                          term = this.invoke(context, l_4248);
                          if(term == null)
                            break Fail25689;
                          term = termFactory.makeTuple(generator.const7118, term);
                          term = conc_strings_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail25689;
                          if(true)
                            break Success10153;
                        }
                        term = term10182;
                      }
                      Success10154:
                      { 
                        if(cons337 == SpoofaxGenerator._consiter_star_sep_2)
                        { 
                          Fail25690:
                          { 
                            IStrategoTerm h_4248 = null;
                            h_4248 = term.getSubterm(0);
                            term = this.invoke(context, h_4248);
                            if(term == null)
                              break Fail25690;
                            term = termFactory.makeTuple(generator.const7119, term);
                            term = conc_strings_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail25690;
                            if(true)
                              break Success10154;
                          }
                          term = term10182;
                        }
                        Success10155:
                        { 
                          if(cons337 == SpoofaxGenerator._conssort_1)
                          { 
                            Fail25691:
                            { 
                              IStrategoTerm e_4248 = null;
                              e_4248 = term.getSubterm(0);
                              term = is_string_0_0.instance.invoke(context, e_4248);
                              if(term == null)
                                break Fail25691;
                              term = e_4248;
                              if(true)
                                break Success10155;
                            }
                            term = term10182;
                          }
                          Success10156:
                          { 
                            if(cons337 == SpoofaxGenerator._consparameterized_sort_2)
                            { 
                              Fail25692:
                              { 
                                IStrategoTerm a_4248 = null;
                                IStrategoTerm b_4248 = null;
                                IStrategoTerm c_4248 = null;
                                IStrategoTerm d_4248 = null;
                                a_4248 = term.getSubterm(0);
                                b_4248 = term.getSubterm(1);
                                d_4248 = term;
                                term = is_string_0_0.instance.invoke(context, a_4248);
                                if(term == null)
                                  break Fail25692;
                                term = map_1_0.instance.invoke(context, b_4248, $Symbol2$String_0_0.instance);
                                if(term == null)
                                  break Fail25692;
                                c_4248 = term;
                                term = d_4248;
                                IStrategoList list384;
                                list384 = checkListTail(c_4248);
                                if(list384 == null)
                                  break Fail25692;
                                term = (IStrategoTerm)termFactory.makeListCons(a_4248, termFactory.makeListCons(generator.const7120, list384));
                                term = concat_strings_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail25692;
                                if(true)
                                  break Success10156;
                              }
                              term = term10182;
                            }
                            Success10157:
                            { 
                              if(cons337 == SpoofaxGenerator._conslabel_2)
                              { 
                                Fail25693:
                                { 
                                  IStrategoTerm z_4247 = null;
                                  z_4247 = term.getSubterm(1);
                                  term = this.invoke(context, z_4247);
                                  if(term == null)
                                    break Fail25693;
                                  if(true)
                                    break Success10157;
                                }
                                term = term10182;
                              }
                              Success10158:
                              { 
                                if(cons337 == SpoofaxGenerator._consopt_1)
                                { 
                                  Fail25694:
                                  { 
                                    IStrategoTerm w_4247 = null;
                                    w_4247 = term.getSubterm(0);
                                    term = this.invoke(context, w_4247);
                                    if(term == null)
                                      break Fail25694;
                                    term = termFactory.makeTuple(generator.const7121, term);
                                    term = conc_strings_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail25694;
                                    if(true)
                                      break Success10158;
                                  }
                                  term = term10182;
                                }
                                Success10159:
                                { 
                                  if(cons337 == SpoofaxGenerator._consseq_2)
                                  { 
                                    Fail25695:
                                    { 
                                      IStrategoTerm s_4247 = null;
                                      IStrategoTerm t_4247 = null;
                                      s_4247 = term.getSubterm(0);
                                      t_4247 = term.getSubterm(1);
                                      IStrategoList list385;
                                      list385 = checkListTail(t_4247);
                                      if(list385 == null)
                                        break Fail25695;
                                      term = (IStrategoTerm)termFactory.makeListCons(s_4247, list385);
                                      term = filter_1_0.instance.invoke(context, term, lifted9192.instance);
                                      if(term == null)
                                        break Fail25695;
                                      term = map_1_0.instance.invoke(context, term, $Symbol2$String_0_0.instance);
                                      if(term == null)
                                        break Fail25695;
                                      term = termFactory.makeTuple(generator.const7120, term);
                                      term = separate_by_0_0.instance.invoke(context, term);
                                      if(term == null)
                                        break Fail25695;
                                      term = concat_strings_0_0.instance.invoke(context, term);
                                      if(term == null)
                                        break Fail25695;
                                      if(true)
                                        break Success10159;
                                    }
                                    term = term10182;
                                  }
                                  if(cons337 == SpoofaxGenerator._consalt_2)
                                  { 
                                    IStrategoTerm m_4247 = null;
                                    IStrategoTerm n_4247 = null;
                                    IStrategoTerm o_4247 = null;
                                    m_4247 = term.getSubterm(0);
                                    n_4247 = term.getSubterm(1);
                                    term = this.invoke(context, m_4247);
                                    if(term == null)
                                      break Fail25681;
                                    o_4247 = term;
                                    term = this.invoke(context, n_4247);
                                    if(term == null)
                                      break Fail25681;
                                    term = (IStrategoTerm)termFactory.makeListCons(o_4247, termFactory.makeListCons(generator.const7120, termFactory.makeListCons(term, (IStrategoList)generator.constNil7)));
                                    term = concat_strings_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail25681;
                                  }
                                  else
                                  { 
                                    break Fail25681;
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