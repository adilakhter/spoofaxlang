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

@SuppressWarnings("all") public class constraint_warning_0_0 extends Strategy 
{ 
  public static constraint_warning_0_0 instance = new constraint_warning_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("constraint_warning_0_0");
    Fail23313:
    { 
      IStrategoTerm term12654 = term;
      Success12527:
      { 
        Fail23314:
        { 
          IStrategoTerm r_4822 = null;
          IStrategoTerm s_4822 = null;
          IStrategoTerm t_4822 = null;
          IStrategoTerm u_4822 = null;
          IStrategoTerm z_4822 = null;
          IStrategoTerm b_4823 = null;
          IStrategoTerm c_4823 = null;
          r_4822 = term;
          term = get_assign_var_0_0.instance.invoke(context, r_4822);
          if(term == null)
            break Fail23314;
          s_4822 = term;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
            break Fail23314;
          u_4822 = term.getSubterm(0);
          term = declaration_of_0_0.instance.invoke(context, s_4822);
          if(term == null)
            break Fail23314;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
            break Fail23314;
          t_4822 = term.getSubterm(0);
          IStrategoTerm term12655 = term;
          Success12528:
          { 
            Fail23315:
            { 
              IStrategoTerm n_5054 = null;
              IStrategoTerm s_5054 = null;
              IStrategoTerm p_5054 = null;
              s_5054 = t_4822;
              n_5054 = u_4822;
              term = s_5054;
              p_5054 = s_5054;
              term = context.invokePrimitive("SSL_EXT_origin_equal", p_5054, NO_STRATEGIES, new IStrategoTerm[]{term, n_5054});
              if(term == null)
                break Fail23315;
              { 
                if(true)
                  break Fail23314;
                if(true)
                  break Success12528;
              }
            }
            term = term12655;
          }
          term = u_4822;
          IStrategoTerm term12656 = term;
          Success12529:
          { 
            Fail23316:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23316;
              if(true)
                break Success12529;
            }
            term = term12656;
            IStrategoTerm term12657 = term;
            Success12530:
            { 
              Fail23317:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23317;
                if(true)
                  break Success12530;
              }
              term = term12657;
              IStrategoTerm term12658 = term;
              Success12531:
              { 
                Fail23318:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23318;
                  if(true)
                    break Success12531;
                }
                term = term12658;
                IStrategoTerm term12659 = term;
                Success12532:
                { 
                  Fail23319:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23319;
                    if(true)
                      break Success12532;
                  }
                  term = term12659;
                  IStrategoTerm v_4822 = null;
                  IStrategoTerm w_4822 = null;
                  IStrategoTerm y_4822 = null;
                  v_4822 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23314;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail23314;
                  w_4822 = ((IStrategoList)term).tail();
                  y_4822 = w_4822;
                  term = report_failure_0_2.instance.invoke(context, y_4822, trans.const4649, v_4822);
                  if(term == null)
                    break Fail23314;
                }
              }
            }
          }
          b_4823 = term;
          z_4822 = trans.const4440;
          c_4823 = b_4823;
          term = string_replace_0_2.instance.invoke(context, c_4823, z_4822, trans.const4634);
          if(term == null)
            break Fail23314;
          term = (IStrategoTerm)termFactory.makeListCons(trans.const4636, termFactory.makeListCons(term, (IStrategoList)trans.constCons2120));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23314;
          term = termFactory.makeTuple(u_4822, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
          if(true)
            break Success12527;
        }
        term = term12654;
        IStrategoTerm term12660 = term;
        IStrategoConstructor cons599 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success12533:
        { 
          if(cons599 == Main._consVar_1)
          { 
            Fail23320:
            { 
              IStrategoTerm d_4822 = null;
              IStrategoTerm i_4822 = null;
              IStrategoTerm k_4822 = null;
              IStrategoTerm l_4822 = null;
              d_4822 = term.getSubterm(0);
              term = require_1_0.instance.invoke(context, term, lifted6943.instance);
              if(term == null)
                break Fail23320;
              term = d_4822;
              IStrategoTerm term12662 = term;
              Success12534:
              { 
                Fail23321:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23321;
                  if(true)
                    break Success12534;
                }
                term = term12662;
                IStrategoTerm term12663 = term;
                Success12535:
                { 
                  Fail23322:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23322;
                    if(true)
                      break Success12535;
                  }
                  term = term12663;
                  IStrategoTerm term12664 = term;
                  Success12536:
                  { 
                    Fail23323:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23323;
                      if(true)
                        break Success12536;
                    }
                    term = term12664;
                    IStrategoTerm term12665 = term;
                    Success12537:
                    { 
                      Fail23324:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23324;
                        if(true)
                          break Success12537;
                      }
                      term = term12665;
                      IStrategoTerm e_4822 = null;
                      IStrategoTerm f_4822 = null;
                      IStrategoTerm h_4822 = null;
                      e_4822 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23320;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail23320;
                      f_4822 = ((IStrategoList)term).tail();
                      h_4822 = f_4822;
                      term = report_failure_0_2.instance.invoke(context, h_4822, trans.const4649, e_4822);
                      if(term == null)
                        break Fail23320;
                    }
                  }
                }
              }
              k_4822 = term;
              i_4822 = trans.const4440;
              l_4822 = k_4822;
              term = string_replace_0_2.instance.invoke(context, l_4822, i_4822, trans.const4651);
              if(term == null)
                break Fail23320;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4653, termFactory.makeListCons(term, (IStrategoList)trans.constCons2121));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23320;
              term = termFactory.makeTuple(d_4822, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
              if(true)
                break Success12533;
            }
            term = term12660;
          }
          Success12538:
          { 
            if(cons599 == Main._consCallT_3)
            { 
              Fail23325:
              { 
                IStrategoTerm n_4821 = null;
                IStrategoTerm o_4821 = null;
                IStrategoTerm x_4821 = null;
                IStrategoTerm t_4821 = null;
                IStrategoTerm v_4821 = null;
                IStrategoTerm w_4821 = null;
                IStrategoTerm arg8345 = term.getSubterm(0);
                if(arg8345.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg8345).getConstructor())
                  break Fail23325;
                x_4821 = arg8345.getSubterm(0);
                IStrategoTerm arg8346 = term.getSubterm(1);
                if(arg8346.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg8346).isEmpty())
                  break Fail23325;
                n_4821 = ((IStrategoList)arg8346).head();
                IStrategoTerm arg8347 = ((IStrategoList)arg8346).tail();
                if(arg8347.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8347).isEmpty())
                  break Fail23325;
                IStrategoTerm arg8348 = term.getSubterm(2);
                if(arg8348.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8348).isEmpty())
                  break Fail23325;
                term = x_4821;
                IStrategoTerm term12667 = term;
                Success12539:
                { 
                  Fail23326:
                  { 
                    if(term.getTermType() != IStrategoTerm.STRING || !"debug".equals(((IStrategoString)term).stringValue()))
                      break Fail23326;
                    if(true)
                      break Success12539;
                  }
                  term = term12667;
                  if(term.getTermType() != IStrategoTerm.STRING || !"say".equals(((IStrategoString)term).stringValue()))
                    break Fail23325;
                }
                Success12540:
                { 
                  Fail23327:
                  { 
                    term = n_4821;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consStrCong_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail23327;
                    o_4821 = term.getSubterm(0);
                    if(true)
                      break Success12540;
                  }
                  term = n_4821;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consIntCong_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail23325;
                  o_4821 = term.getSubterm(0);
                }
                term = o_4821;
                IStrategoTerm term12669 = term;
                Success12541:
                { 
                  Fail23328:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23328;
                    if(true)
                      break Success12541;
                  }
                  term = term12669;
                  IStrategoTerm term12670 = term;
                  Success12542:
                  { 
                    Fail23329:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23329;
                      if(true)
                        break Success12542;
                    }
                    term = term12670;
                    IStrategoTerm term12671 = term;
                    Success12543:
                    { 
                      Fail23330:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23330;
                        if(true)
                          break Success12543;
                      }
                      term = term12671;
                      IStrategoTerm term12672 = term;
                      Success12544:
                      { 
                        Fail23331:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail23331;
                          if(true)
                            break Success12544;
                        }
                        term = term12672;
                        IStrategoTerm p_4821 = null;
                        IStrategoTerm q_4821 = null;
                        IStrategoTerm s_4821 = null;
                        p_4821 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail23325;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail23325;
                        q_4821 = ((IStrategoList)term).tail();
                        s_4821 = q_4821;
                        term = report_failure_0_2.instance.invoke(context, s_4821, trans.const4649, p_4821);
                        if(term == null)
                          break Fail23325;
                      }
                    }
                  }
                }
                v_4821 = term;
                t_4821 = trans.const4440;
                w_4821 = v_4821;
                term = string_replace_0_2.instance.invoke(context, w_4821, t_4821, trans.const4545);
                if(term == null)
                  break Fail23325;
                term = (IStrategoTerm)termFactory.makeListCons(trans.const4654, termFactory.makeListCons(term, (IStrategoList)trans.constCons2060));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23325;
                term = termFactory.makeTuple(o_4821, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
                if(true)
                  break Success12538;
              }
              term = term12660;
            }
            Success12545:
            { 
              if(cons599 == Main._consImport_1)
              { 
                Fail23332:
                { 
                  IStrategoTerm arg8350 = term.getSubterm(0);
                  if(arg8350.getTermType() != IStrategoTerm.STRING || !"Java-15".equals(((IStrategoString)arg8350).stringValue()))
                    break Fail23332;
                  term = termFactory.makeTuple(term, trans.const4655);
                  if(true)
                    break Success12545;
                }
                term = term12660;
              }
              IStrategoTerm term12674 = term;
              Success12546:
              { 
                Fail23333:
                { 
                  TermReference b_4821 = new TermReference();
                  IStrategoTerm c_4821 = null;
                  IStrategoTerm j_4821 = null;
                  IStrategoTerm k_4821 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail23333;
                  if(b_4821.value == null)
                    b_4821.value = term.getSubterm(0);
                  else
                    if(b_4821.value != term.getSubterm(0) && !b_4821.value.match(term.getSubterm(0)))
                      break Fail23333;
                  c_4821 = term;
                  lifted6944 lifted69440 = new lifted6944();
                  lifted69440.b_4821 = b_4821;
                  term = require_1_0.instance.invoke(context, term, lifted69440);
                  if(term == null)
                    break Fail23333;
                  k_4821 = c_4821;
                  term = concat_strings_0_0.instance.invoke(context, trans.constCons2122);
                  if(term == null)
                    break Fail23333;
                  j_4821 = term;
                  term = k_4821;
                  if(b_4821.value == null)
                    break Fail23333;
                  term = termFactory.makeTuple(b_4821.value, termFactory.annotateTerm(j_4821, checkListAnnos(termFactory, trans.constNil4)));
                  if(true)
                    break Success12546;
                }
                term = term12674;
                IStrategoTerm v_4820 = null;
                IStrategoTerm y_4820 = null;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail23313;
                v_4820 = term.getSubterm(0);
                y_4820 = v_4820;
                term = string_starts_with_0_1.instance.invoke(context, y_4820, trans.const4657);
                if(term == null)
                  break Fail23313;
                term = concat_strings_0_0.instance.invoke(context, trans.constCons2123);
                if(term == null)
                  break Fail23313;
                term = termFactory.makeTuple(v_4820, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
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