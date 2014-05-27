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

@SuppressWarnings("all") public class constraint_error_0_0 extends Strategy 
{ 
  public static constraint_error_0_0 instance = new constraint_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("constraint_error_0_0");
    Fail23273:
    { 
      IStrategoTerm term12600 = term;
      Success12490:
      { 
        Fail23274:
        { 
          IStrategoTerm x_4819 = null;
          IStrategoTerm c_4820 = null;
          IStrategoTerm e_4820 = null;
          IStrategoTerm f_4820 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
            break Fail23274;
          x_4819 = term.getSubterm(0);
          IStrategoTerm term12601 = term;
          Success12491:
          { 
            Fail23275:
            { 
              term = is_declared_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23275;
              { 
                if(true)
                  break Fail23274;
                if(true)
                  break Success12491;
              }
            }
            term = term12601;
          }
          term = x_4819;
          IStrategoTerm term12602 = term;
          Success12492:
          { 
            Fail23276:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23276;
              if(true)
                break Success12492;
            }
            term = term12602;
            IStrategoTerm term12603 = term;
            Success12493:
            { 
              Fail23277:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23277;
                if(true)
                  break Success12493;
              }
              term = term12603;
              IStrategoTerm term12604 = term;
              Success12494:
              { 
                Fail23278:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23278;
                  if(true)
                    break Success12494;
                }
                term = term12604;
                IStrategoTerm term12605 = term;
                Success12495:
                { 
                  Fail23279:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23279;
                    if(true)
                      break Success12495;
                  }
                  term = term12605;
                  IStrategoTerm y_4819 = null;
                  IStrategoTerm z_4819 = null;
                  IStrategoTerm b_4820 = null;
                  y_4819 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail23274;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail23274;
                  z_4819 = ((IStrategoList)term).tail();
                  b_4820 = z_4819;
                  term = report_failure_0_2.instance.invoke(context, b_4820, trans.const4633, y_4819);
                  if(term == null)
                    break Fail23274;
                }
              }
            }
          }
          e_4820 = term;
          c_4820 = trans.const4440;
          f_4820 = e_4820;
          term = string_replace_0_2.instance.invoke(context, f_4820, c_4820, trans.const4634);
          if(term == null)
            break Fail23274;
          term = (IStrategoTerm)termFactory.makeListCons(trans.const4636, termFactory.makeListCons(term, (IStrategoList)trans.constCons2119));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23274;
          term = termFactory.makeTuple(x_4819, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4)));
          if(true)
            break Success12490;
        }
        term = term12600;
        IStrategoTerm term12606 = term;
        Success12496:
        { 
          Fail23280:
          { 
            IStrategoTerm v_4818 = null;
            TermReference x_4818 = new TermReference();
            TermReference y_4818 = new TermReference();
            IStrategoTerm l_4819 = null;
            IStrategoTerm s_4819 = null;
            IStrategoTerm t_4819 = null;
            IStrategoTerm u_4819 = null;
            IStrategoTerm h_4819 = null;
            IStrategoTerm j_4819 = null;
            IStrategoTerm k_4819 = null;
            if(term.getTermType() != IStrategoTerm.APPL || Main._consAnnoDef_2 != ((IStrategoAppl)term).getConstructor())
              break Fail23280;
            if(x_4818.value == null)
              x_4818.value = term.getSubterm(0);
            else
              if(x_4818.value != term.getSubterm(0) && !x_4818.value.match(term.getSubterm(0)))
                break Fail23280;
            IStrategoTerm arg8293 = term.getSubterm(1);
            if(y_4818.value == null)
              y_4818.value = arg8293;
            else
              if(y_4818.value != arg8293 && !y_4818.value.match(arg8293))
                break Fail23280;
            if(arg8293.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)arg8293).getConstructor())
              break Fail23280;
            v_4818 = arg8293.getSubterm(0);
            l_4819 = term;
            IStrategoTerm term12607 = term;
            Success12497:
            { 
              Fail23281:
              { 
                IStrategoTerm term12608 = term;
                Success12498:
                { 
                  Fail23282:
                  { 
                    IStrategoTerm z_4818 = null;
                    z_4818 = term;
                    IStrategoTerm term12609 = term;
                    Success12499:
                    { 
                      Fail23283:
                      { 
                        if(x_4818.value == null)
                          break Fail23283;
                        term = x_4818.value;
                        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                          break Fail23283;
                        { 
                          if(true)
                            break Fail23282;
                          if(true)
                            break Success12499;
                        }
                      }
                      term = term12609;
                    }
                    term = z_4818;
                    { 
                      IStrategoTerm a_4819 = null;
                      IStrategoTerm m_4819 = null;
                      IStrategoTerm o_4819 = null;
                      IStrategoTerm p_4819 = null;
                      if(y_4818.value == null)
                        break Fail23281;
                      term = signature_of_0_0.instance.invoke(context, y_4818.value);
                      if(term == null)
                        break Fail23281;
                      a_4819 = term;
                      o_4819 = term;
                      m_4819 = trans.const4637;
                      term = o_4819;
                      p_4819 = o_4819;
                      if(y_4818.value == null)
                        break Fail23281;
                      term = termFactory.makeTuple(trans.const4638, y_4818.value);
                      term = dr_set_rule_0_3.instance.invoke(context, p_4819, m_4819, y_4818.value, term);
                      if(term == null)
                        break Fail23281;
                      term = a_4819;
                      if(true)
                        break Success12498;
                    }
                  }
                  term = term12608;
                }
                if(true)
                  break Success12497;
              }
              term = term12607;
              IStrategoTerm b_4819 = null;
              IStrategoTerm c_4819 = null;
              IStrategoTerm r_4819 = null;
              b_4819 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail23280;
              c_4819 = term;
              r_4819 = b_4819;
              term = report_with_failure_0_2.instance.invoke(context, r_4819, trans.const4639, c_4819);
              if(term == null)
                break Fail23280;
            }
            term = l_4819;
            s_4819 = l_4819;
            lifted6935 lifted69350 = new lifted6935();
            lifted69350.x_4818 = x_4818;
            lifted69350.y_4818 = y_4818;
            term = require_1_0.instance.invoke(context, term, lifted69350);
            if(term == null)
              break Fail23280;
            u_4819 = s_4819;
            term = v_4818;
            IStrategoTerm term12612 = term;
            Success12500:
            { 
              Fail23284:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23284;
                if(true)
                  break Success12500;
              }
              term = term12612;
              IStrategoTerm term12613 = term;
              Success12501:
              { 
                Fail23285:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23285;
                  if(true)
                    break Success12501;
                }
                term = term12613;
                IStrategoTerm term12614 = term;
                Success12502:
                { 
                  Fail23286:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23286;
                    if(true)
                      break Success12502;
                  }
                  term = term12614;
                  IStrategoTerm term12615 = term;
                  Success12503:
                  { 
                    Fail23287:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23287;
                      if(true)
                        break Success12503;
                    }
                    term = term12615;
                    IStrategoTerm d_4819 = null;
                    IStrategoTerm e_4819 = null;
                    IStrategoTerm g_4819 = null;
                    d_4819 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail23280;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail23280;
                    e_4819 = ((IStrategoList)term).tail();
                    g_4819 = e_4819;
                    term = report_failure_0_2.instance.invoke(context, g_4819, trans.const4633, d_4819);
                    if(term == null)
                      break Fail23280;
                  }
                }
              }
            }
            j_4819 = term;
            h_4819 = trans.const4440;
            k_4819 = j_4819;
            term = string_replace_0_2.instance.invoke(context, k_4819, h_4819, trans.const4640);
            if(term == null)
              break Fail23280;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const4641, termFactory.makeListCons(term, (IStrategoList)trans.constCons2060));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail23280;
            t_4819 = term;
            term = u_4819;
            if(x_4818.value == null)
              break Fail23280;
            term = termFactory.makeTuple(x_4818.value, termFactory.annotateTerm(t_4819, checkListAnnos(termFactory, trans.constNil4)));
            if(true)
              break Success12496;
          }
          term = term12606;
          IStrategoTerm term12616 = term;
          Success12504:
          { 
            Fail23288:
            { 
              IStrategoTerm e_4817 = null;
              IStrategoTerm f_4817 = null;
              TermReference g_4817 = new TermReference();
              TermReference h_4817 = new TermReference();
              TermReference i_4817 = new TermReference();
              IStrategoTerm h_4818 = null;
              IStrategoTerm i_4818 = null;
              IStrategoTerm k_4818 = null;
              IStrategoTerm n_4817 = null;
              IStrategoTerm p_4817 = null;
              IStrategoTerm q_4817 = null;
              IStrategoTerm j_4818 = null;
              IStrategoTerm n_4818 = null;
              IStrategoTerm o_4818 = null;
              IStrategoTerm v_4817 = null;
              IStrategoTerm x_4817 = null;
              IStrategoTerm y_4817 = null;
              IStrategoTerm d_4818 = null;
              IStrategoTerm f_4818 = null;
              IStrategoTerm g_4818 = null;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consOpDecl_2 != ((IStrategoAppl)term).getConstructor())
                break Fail23288;
              IStrategoTerm arg8303 = term.getSubterm(0);
              e_4817 = arg8303;
              IStrategoList annos715 = arg8303.getAnnotations();
              if(annos715.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos715).isEmpty())
                break Fail23288;
              if(g_4817.value == null)
                g_4817.value = ((IStrategoList)annos715).head();
              else
                if(g_4817.value != ((IStrategoList)annos715).head() && !g_4817.value.match(((IStrategoList)annos715).head()))
                  break Fail23288;
              IStrategoTerm arg8304 = ((IStrategoList)annos715).tail();
              if(arg8304.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8304).isEmpty())
                break Fail23288;
              f_4817 = term.getSubterm(1);
              h_4818 = term;
              lifted6936 lifted69360 = new lifted6936();
              lifted69360.g_4817 = g_4817;
              lifted69360.h_4817 = h_4817;
              lifted69360.i_4817 = i_4817;
              term = require_1_0.instance.invoke(context, term, lifted69360);
              if(term == null)
                break Fail23288;
              term = h_4818;
              k_4818 = h_4818;
              if(i_4817.value == null)
                break Fail23288;
              term = i_4817.value;
              IStrategoTerm term12618 = term;
              Success12505:
              { 
                Fail23289:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23289;
                  if(true)
                    break Success12505;
                }
                term = term12618;
                IStrategoTerm term12619 = term;
                Success12506:
                { 
                  Fail23290:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23290;
                    if(true)
                      break Success12506;
                  }
                  term = term12619;
                  IStrategoTerm term12620 = term;
                  Success12507:
                  { 
                    Fail23291:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23291;
                      if(true)
                        break Success12507;
                    }
                    term = term12620;
                    IStrategoTerm term12621 = term;
                    Success12508:
                    { 
                      Fail23292:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23292;
                        if(true)
                          break Success12508;
                      }
                      term = term12621;
                      IStrategoTerm j_4817 = null;
                      IStrategoTerm k_4817 = null;
                      IStrategoTerm m_4817 = null;
                      j_4817 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23288;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail23288;
                      k_4817 = ((IStrategoList)term).tail();
                      m_4817 = k_4817;
                      term = report_failure_0_2.instance.invoke(context, m_4817, trans.const4633, j_4817);
                      if(term == null)
                        break Fail23288;
                    }
                  }
                }
              }
              p_4817 = term;
              n_4817 = trans.const4440;
              q_4817 = p_4817;
              term = string_replace_0_2.instance.invoke(context, q_4817, n_4817, trans.const4642);
              if(term == null)
                break Fail23288;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4643, termFactory.makeListCons(term, (IStrategoList)trans.constCons2060));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23288;
              i_4818 = term;
              n_4818 = k_4818;
              term = e_4817;
              IStrategoTerm term12622 = term;
              Success12509:
              { 
                Fail23293:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23293;
                  if(true)
                    break Success12509;
                }
                term = term12622;
                IStrategoTerm term12623 = term;
                Success12510:
                { 
                  Fail23294:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23294;
                    if(true)
                      break Success12510;
                  }
                  term = term12623;
                  IStrategoTerm term12624 = term;
                  Success12511:
                  { 
                    Fail23295:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23295;
                      if(true)
                        break Success12511;
                    }
                    term = term12624;
                    IStrategoTerm term12625 = term;
                    Success12512:
                    { 
                      Fail23296:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23296;
                        if(true)
                          break Success12512;
                      }
                      term = term12625;
                      IStrategoTerm r_4817 = null;
                      IStrategoTerm s_4817 = null;
                      IStrategoTerm u_4817 = null;
                      r_4817 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23288;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail23288;
                      s_4817 = ((IStrategoList)term).tail();
                      u_4817 = s_4817;
                      term = report_failure_0_2.instance.invoke(context, u_4817, trans.const4633, r_4817);
                      if(term == null)
                        break Fail23288;
                    }
                  }
                }
              }
              x_4817 = term;
              v_4817 = trans.const4440;
              y_4817 = x_4817;
              term = string_replace_0_2.instance.invoke(context, y_4817, v_4817, trans.const4644);
              if(term == null)
                break Fail23288;
              o_4818 = term;
              term = length_0_0.instance.invoke(context, f_4817);
              if(term == null)
                break Fail23288;
              IStrategoTerm term12626 = term;
              Success12513:
              { 
                Fail23297:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail23297;
                  if(true)
                    break Success12513;
                }
                term = term12626;
                IStrategoTerm term12627 = term;
                Success12514:
                { 
                  Fail23298:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail23298;
                    if(true)
                      break Success12514;
                  }
                  term = term12627;
                  IStrategoTerm term12628 = term;
                  Success12515:
                  { 
                    Fail23299:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail23299;
                      if(true)
                        break Success12515;
                    }
                    term = term12628;
                    IStrategoTerm term12629 = term;
                    Success12516:
                    { 
                      Fail23300:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail23300;
                        if(true)
                          break Success12516;
                      }
                      term = term12629;
                      IStrategoTerm z_4817 = null;
                      IStrategoTerm a_4818 = null;
                      IStrategoTerm c_4818 = null;
                      z_4817 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail23288;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail23288;
                      a_4818 = ((IStrategoList)term).tail();
                      c_4818 = a_4818;
                      term = report_failure_0_2.instance.invoke(context, c_4818, trans.const4633, z_4817);
                      if(term == null)
                        break Fail23288;
                    }
                  }
                }
              }
              f_4818 = term;
              d_4818 = trans.const4440;
              g_4818 = f_4818;
              term = string_replace_0_2.instance.invoke(context, g_4818, d_4818, trans.const4645);
              if(term == null)
                break Fail23288;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4646, termFactory.makeListCons(o_4818, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constNil4))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23288;
              j_4818 = term;
              term = n_4818;
              if(h_4817.value == null)
                break Fail23288;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(e_4817, termFactory.annotateTerm(i_4818, checkListAnnos(termFactory, trans.constNil4))), termFactory.makeListCons(termFactory.makeTuple(h_4817.value, termFactory.annotateTerm(j_4818, checkListAnnos(termFactory, trans.constNil4))), (IStrategoList)trans.constNil4));
              if(true)
                break Success12504;
            }
            term = term12616;
            IStrategoTerm term12630 = term;
            IStrategoConstructor cons598 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
            Success12517:
            { 
              if(cons598 == Main._consBuild_1)
              { 
                Fail23301:
                { 
                  IStrategoTerm d_4817 = null;
                  d_4817 = term.getSubterm(0);
                  term = constraint_error_bad_build_0_0.instance.invoke(context, d_4817);
                  if(term == null)
                    break Fail23301;
                  if(true)
                    break Success12517;
                }
                term = term12630;
              }
              Success12518:
              { 
                if(cons598 == Main._consAssign_2)
                { 
                  Fail23302:
                  { 
                    IStrategoTerm c_4817 = null;
                    c_4817 = term.getSubterm(1);
                    term = constraint_error_bad_build_0_0.instance.invoke(context, c_4817);
                    if(term == null)
                      break Fail23302;
                    if(true)
                      break Success12518;
                  }
                  term = term12630;
                }
                Success12519:
                { 
                  if(cons598 == Main._consRule_3)
                  { 
                    Fail23303:
                    { 
                      IStrategoTerm b_4817 = null;
                      b_4817 = term.getSubterm(1);
                      term = constraint_error_bad_build_0_0.instance.invoke(context, b_4817);
                      if(term == null)
                        break Fail23303;
                      if(true)
                        break Success12519;
                    }
                    term = term12630;
                  }
                  Success12520:
                  { 
                    if(cons598 == Main._consBA_2)
                    { 
                      Fail23304:
                      { 
                        IStrategoTerm a_4817 = null;
                        a_4817 = term.getSubterm(1);
                        term = constraint_error_bad_build_0_0.instance.invoke(context, a_4817);
                        if(term == null)
                          break Fail23304;
                        if(true)
                          break Success12520;
                      }
                      term = term12630;
                    }
                    Success12521:
                    { 
                      if(cons598 == Main._consApp_2)
                      { 
                        Fail23305:
                        { 
                          IStrategoTerm z_4816 = null;
                          z_4816 = term.getSubterm(1);
                          term = constraint_error_bad_build_0_0.instance.invoke(context, z_4816);
                          if(term == null)
                            break Fail23305;
                          if(true)
                            break Success12521;
                        }
                        term = term12630;
                      }
                      Success12522:
                      { 
                        if(cons598 == Main._consMatch_1)
                        { 
                          Fail23306:
                          { 
                            IStrategoTerm y_4816 = null;
                            y_4816 = term.getSubterm(0);
                            term = constraint_error_bad_match_0_0.instance.invoke(context, y_4816);
                            if(term == null)
                              break Fail23306;
                            if(true)
                              break Success12522;
                          }
                          term = term12630;
                        }
                        Success12523:
                        { 
                          if(cons598 == Main._consAssign_2)
                          { 
                            Fail23307:
                            { 
                              IStrategoTerm x_4816 = null;
                              x_4816 = term.getSubterm(0);
                              term = constraint_error_bad_match_0_0.instance.invoke(context, x_4816);
                              if(term == null)
                                break Fail23307;
                              if(true)
                                break Success12523;
                            }
                            term = term12630;
                          }
                          Success12524:
                          { 
                            if(cons598 == Main._consAM_2)
                            { 
                              Fail23308:
                              { 
                                IStrategoTerm w_4816 = null;
                                w_4816 = term.getSubterm(1);
                                term = constraint_error_bad_match_0_0.instance.invoke(context, w_4816);
                                if(term == null)
                                  break Fail23308;
                                if(true)
                                  break Success12524;
                              }
                              term = term12630;
                            }
                            if(cons598 == Main._consRule_3)
                            { 
                              IStrategoTerm v_4816 = null;
                              v_4816 = term.getSubterm(0);
                              term = constraint_error_bad_match_0_0.instance.invoke(context, v_4816);
                              if(term == null)
                                break Fail23273;
                            }
                            else
                            { 
                              break Fail23273;
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