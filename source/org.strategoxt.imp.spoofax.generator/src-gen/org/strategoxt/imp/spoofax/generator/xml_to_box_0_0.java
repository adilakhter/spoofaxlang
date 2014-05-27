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

@SuppressWarnings("all") public class xml_to_box_0_0 extends Strategy 
{ 
  public static xml_to_box_0_0 instance = new xml_to_box_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("xml_to_box_0_0");
    Fail25411:
    { 
      IStrategoTerm term10008 = term;
      IStrategoConstructor cons321 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10008:
      { 
        if(cons321 == SpoofaxGenerator._consDocument_3)
        { 
          Fail25412:
          { 
            IStrategoTerm u_4218 = null;
            IStrategoTerm v_4218 = null;
            IStrategoTerm w_4218 = null;
            u_4218 = term.getSubterm(0);
            v_4218 = term.getSubterm(1);
            w_4218 = term.getSubterm(2);
            term = termFactory.makeAppl(SpoofaxGenerator._consV_2, new IStrategoTerm[]{generator.constCons4515, (IStrategoTerm)termFactory.makeListCons(u_4218, termFactory.makeListCons(v_4218, termFactory.makeListCons(w_4218, (IStrategoList)generator.constNil7)))});
            if(true)
              break Success10008;
          }
          term = term10008;
        }
        Success10009:
        { 
          if(cons321 == SpoofaxGenerator._consPrologue_3)
          { 
            Fail25413:
            { 
              IStrategoTerm l_4218 = null;
              IStrategoTerm m_4218 = null;
              IStrategoTerm n_4218 = null;
              IStrategoTerm q_4218 = null;
              l_4218 = term.getSubterm(0);
              m_4218 = term.getSubterm(1);
              n_4218 = term.getSubterm(2);
              term = get_prolog_lines_0_0.instance.invoke(context, l_4218);
              if(term == null)
                break Fail25413;
              q_4218 = term;
              term = get_prolog_lines_0_0.instance.invoke(context, n_4218);
              if(term == null)
                break Fail25413;
              term = (IStrategoTerm)termFactory.makeListCons(q_4218, termFactory.makeListCons(m_4218, termFactory.makeListCons(term, (IStrategoList)generator.constNil7)));
              term = concat_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail25413;
              term = termFactory.makeAppl(SpoofaxGenerator._consV_2, new IStrategoTerm[]{generator.constCons4516, term});
              if(true)
                break Success10009;
            }
            term = term10008;
          }
          Success10010:
          { 
            if(cons321 == SpoofaxGenerator._consEpilogue_1)
            { 
              Fail25414:
              { 
                IStrategoTerm k_4218 = null;
                k_4218 = term.getSubterm(0);
                term = termFactory.makeAppl(SpoofaxGenerator._consV_2, new IStrategoTerm[]{generator.constCons4515, k_4218});
                if(true)
                  break Success10010;
              }
              term = term10008;
            }
            Success10011:
            { 
              if(cons321 == SpoofaxGenerator._consXMLDecl_3)
              { 
                Fail25415:
                { 
                  IStrategoTerm b_4218 = null;
                  IStrategoTerm c_4218 = null;
                  IStrategoTerm d_4218 = null;
                  IStrategoTerm e_4218 = null;
                  IStrategoTerm f_4218 = null;
                  IStrategoTerm g_4218 = null;
                  IStrategoTerm i_4218 = null;
                  IStrategoTerm j_4218 = null;
                  d_4218 = term.getSubterm(0);
                  b_4218 = term.getSubterm(1);
                  c_4218 = term.getSubterm(2);
                  g_4218 = term;
                  term = (IStrategoTerm)termFactory.makeListCons(b_4218, termFactory.makeListCons(c_4218, (IStrategoList)generator.constNil7));
                  term = filter_1_0.instance.invoke(context, term, lifted8989.instance);
                  if(term == null)
                    break Fail25415;
                  e_4218 = term;
                  IStrategoList list357;
                  list357 = checkListTail(e_4218);
                  if(list357 == null)
                    break Fail25415;
                  term = (IStrategoTerm)termFactory.makeListCons(d_4218, list357);
                  term = map_1_0.instance.invoke(context, term, decl_to_attribute_0_0.instance);
                  if(term == null)
                    break Fail25415;
                  f_4218 = term;
                  j_4218 = g_4218;
                  term = termFactory.makeTuple(f_4218, generator.constCons4517);
                  term = make$Conc_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail25415;
                  i_4218 = term;
                  term = j_4218;
                  IStrategoList list358;
                  list358 = checkListTail(i_4218);
                  if(list358 == null)
                    break Fail25415;
                  term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4518, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX1, list358)});
                  if(true)
                    break Success10011;
                }
                term = term10008;
              }
              Success10012:
              { 
                if(cons321 == SpoofaxGenerator._consDocTypePrologue_2)
                { 
                  Fail25416:
                  { 
                    IStrategoTerm z_4217 = null;
                    IStrategoTerm a_4218 = null;
                    z_4217 = term.getSubterm(0);
                    a_4218 = term.getSubterm(1);
                    IStrategoList list359;
                    list359 = checkListTail(a_4218);
                    if(list359 == null)
                      break Fail25416;
                    term = termFactory.makeAppl(SpoofaxGenerator._consV_2, new IStrategoTerm[]{generator.constCons4515, (IStrategoTerm)termFactory.makeListCons(z_4217, list359)});
                    if(true)
                      break Success10012;
                  }
                  term = term10008;
                }
                Success10013:
                { 
                  if(cons321 == SpoofaxGenerator._consDocTypeDecl_2)
                  { 
                    Fail25417:
                    { 
                      IStrategoTerm x_4217 = null;
                      IStrategoTerm y_4217 = null;
                      x_4217 = term.getSubterm(0);
                      y_4217 = term.getSubterm(1);
                      term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4518, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX3, termFactory.makeListCons(x_4217, termFactory.makeListCons(y_4217, (IStrategoList)generator.constCons4519)))});
                      if(true)
                        break Success10013;
                    }
                    term = term10008;
                  }
                  Success10014:
                  { 
                    if(cons321 == SpoofaxGenerator._consSystemExternalID_1)
                    { 
                      Fail25418:
                      { 
                        IStrategoTerm u_4217 = null;
                        u_4217 = term.getSubterm(0);
                        term = double_quote_0_0.instance.invoke(context, u_4217);
                        if(term == null)
                          break Fail25418;
                        term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4518, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX4, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{term}), (IStrategoList)generator.constNil7))});
                        if(true)
                          break Success10014;
                      }
                      term = term10008;
                    }
                    Success10015:
                    { 
                      if(cons321 == SpoofaxGenerator._consPublicExternalID_2)
                      { 
                        Fail25419:
                        { 
                          IStrategoTerm o_4217 = null;
                          IStrategoTerm p_4217 = null;
                          IStrategoTerm q_4217 = null;
                          o_4217 = term.getSubterm(0);
                          p_4217 = term.getSubterm(1);
                          term = double_quote_0_0.instance.invoke(context, o_4217);
                          if(term == null)
                            break Fail25419;
                          q_4217 = term;
                          term = double_quote_0_0.instance.invoke(context, p_4217);
                          if(term == null)
                            break Fail25419;
                          term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4518, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX5, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{q_4217}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{term}), (IStrategoList)generator.constNil7)))});
                          if(true)
                            break Success10015;
                        }
                        term = term10008;
                      }
                      Success10016:
                      { 
                        if(cons321 == SpoofaxGenerator._consPI_2)
                        { 
                          Fail25420:
                          { 
                            IStrategoTerm m_4217 = null;
                            IStrategoTerm n_4217 = null;
                            m_4217 = term.getSubterm(0);
                            n_4217 = term.getSubterm(1);
                            term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(generator.constFBOX6, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4518, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{m_4217}), termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{n_4217}), (IStrategoList)generator.constNil7))}), (IStrategoList)generator.constCons4517))});
                            if(true)
                              break Success10016;
                          }
                          term = term10008;
                        }
                        Success10017:
                        { 
                          if(cons321 == SpoofaxGenerator._consComment_1)
                          { 
                            Fail25421:
                            { 
                              IStrategoTerm l_4217 = null;
                              l_4217 = term.getSubterm(0);
                              term = termFactory.makeAppl(SpoofaxGenerator._consC_2, new IStrategoTerm[]{generator.constNil7, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{l_4217}), (IStrategoList)generator.constNil7)});
                              if(true)
                                break Success10017;
                            }
                            term = term10008;
                          }
                          Success10018:
                          { 
                            if(cons321 == SpoofaxGenerator._consText_1)
                            { 
                              Fail25422:
                              { 
                                IStrategoTerm k_4217 = null;
                                k_4217 = term.getSubterm(0);
                                term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, k_4217});
                                if(true)
                                  break Success10018;
                              }
                              term = term10008;
                            }
                            Success10019:
                            { 
                              if(cons321 == SpoofaxGenerator._consCDATASection_1)
                              { 
                                Fail25423:
                                { 
                                  IStrategoTerm j_4217 = null;
                                  j_4217 = term.getSubterm(0);
                                  term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(generator.constS8, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{j_4217}), (IStrategoList)generator.constCons4521))});
                                  if(true)
                                    break Success10019;
                                }
                                term = term10008;
                              }
                              Success10020:
                              { 
                                if(cons321 == SpoofaxGenerator._consEntityRef_1)
                                { 
                                  Fail25424:
                                  { 
                                    IStrategoTerm i_4217 = null;
                                    i_4217 = term.getSubterm(0);
                                    term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(generator.constS10, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{i_4217}), (IStrategoList)generator.constCons4522))});
                                    if(true)
                                      break Success10020;
                                  }
                                  term = term10008;
                                }
                                Success10021:
                                { 
                                  if(cons321 == SpoofaxGenerator._consLiteral_1)
                                  { 
                                    Fail25425:
                                    { 
                                      IStrategoTerm h_4217 = null;
                                      h_4217 = term.getSubterm(0);
                                      term = termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{h_4217});
                                      if(true)
                                        break Success10021;
                                    }
                                    term = term10008;
                                  }
                                  IStrategoTerm term10022 = term;
                                  Success10022:
                                  { 
                                    Fail25426:
                                    { 
                                      IStrategoTerm term10023 = term;
                                      Success10023:
                                      { 
                                        Fail25427:
                                        { 
                                          term = simple_element_to_box_0_0.instance.invoke(context, term);
                                          if(term == null)
                                            break Fail25427;
                                          if(true)
                                            break Success10023;
                                        }
                                        term = element_to_box_0_0.instance.invoke(context, term10023);
                                        if(term == null)
                                          break Fail25426;
                                      }
                                      if(true)
                                        break Success10022;
                                    }
                                    term = term10022;
                                    IStrategoTerm term10024 = term;
                                    IStrategoConstructor cons322 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
                                    Success10024:
                                    { 
                                      if(cons322 == SpoofaxGenerator._consAttribute_2)
                                      { 
                                        Fail25428:
                                        { 
                                          IStrategoTerm f_4217 = null;
                                          IStrategoTerm g_4217 = null;
                                          f_4217 = term.getSubterm(0);
                                          g_4217 = term.getSubterm(1);
                                          term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(f_4217, termFactory.makeListCons(generator.constFBOX7, termFactory.makeListCons(g_4217, (IStrategoList)generator.constNil7)))});
                                          if(true)
                                            break Success10024;
                                        }
                                        term = term10024;
                                      }
                                      Success10025:
                                      { 
                                        if(cons322 == SpoofaxGenerator._consDoubleQuoted_1)
                                        { 
                                          Fail25429:
                                          { 
                                            IStrategoTerm c_4217 = null;
                                            IStrategoTerm d_4217 = null;
                                            IStrategoTerm e_4217 = null;
                                            c_4217 = term.getSubterm(0);
                                            e_4217 = term;
                                            term = termFactory.makeTuple(c_4217, generator.constCons4523);
                                            term = make$Conc_0_0.instance.invoke(context, term);
                                            if(term == null)
                                              break Fail25429;
                                            d_4217 = term;
                                            term = e_4217;
                                            IStrategoList list360;
                                            list360 = checkListTail(d_4217);
                                            if(list360 == null)
                                              break Fail25429;
                                            term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(generator.constS12, list360)});
                                            if(true)
                                              break Success10025;
                                          }
                                          term = term10024;
                                        }
                                        Success10026:
                                        { 
                                          if(cons322 == SpoofaxGenerator._consSingleQuoted_1)
                                          { 
                                            Fail25430:
                                            { 
                                              IStrategoTerm z_4216 = null;
                                              IStrategoTerm a_4217 = null;
                                              IStrategoTerm b_4217 = null;
                                              z_4216 = term.getSubterm(0);
                                              b_4217 = term;
                                              term = termFactory.makeTuple(z_4216, generator.constCons4524);
                                              term = make$Conc_0_0.instance.invoke(context, term);
                                              if(term == null)
                                                break Fail25430;
                                              a_4217 = term;
                                              term = b_4217;
                                              IStrategoList list361;
                                              list361 = checkListTail(a_4217);
                                              if(list361 == null)
                                                break Fail25430;
                                              term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(generator.constS13, list361)});
                                              if(true)
                                                break Success10026;
                                            }
                                            term = term10024;
                                          }
                                          Success10027:
                                          { 
                                            if(cons322 == SpoofaxGenerator._consQName_2)
                                            { 
                                              Fail25431:
                                              { 
                                                IStrategoTerm y_4216 = null;
                                                IStrategoTerm arg5836 = term.getSubterm(0);
                                                if(arg5836.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNone_0 != ((IStrategoAppl)arg5836).getConstructor())
                                                  break Fail25431;
                                                y_4216 = term.getSubterm(1);
                                                term = termFactory.makeAppl(SpoofaxGenerator._consFBOX_2, new IStrategoTerm[]{generator.constKW0, termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{y_4216})});
                                                if(true)
                                                  break Success10027;
                                              }
                                              term = term10024;
                                            }
                                            if(cons322 == SpoofaxGenerator._consQName_2)
                                            { 
                                              IStrategoTerm w_4216 = null;
                                              IStrategoTerm x_4216 = null;
                                              IStrategoTerm arg5837 = term.getSubterm(0);
                                              if(arg5837.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSome_1 != ((IStrategoAppl)arg5837).getConstructor())
                                                break Fail25411;
                                              IStrategoTerm arg5838 = arg5837.getSubterm(0);
                                              if(arg5838.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPrefix_1 != ((IStrategoAppl)arg5838).getConstructor())
                                                break Fail25411;
                                              w_4216 = arg5838.getSubterm(0);
                                              x_4216 = term.getSubterm(1);
                                              term = termFactory.makeAppl(SpoofaxGenerator._consH_2, new IStrategoTerm[]{generator.constCons4520, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{w_4216}), termFactory.makeListCons(generator.constFBOX8, termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consS_1, new IStrategoTerm[]{x_4216}), (IStrategoList)generator.constNil7)))});
                                            }
                                            else
                                            { 
                                              break Fail25411;
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