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

@SuppressWarnings("all") public class global_constraint_error_0_0 extends Strategy 
{ 
  public static global_constraint_error_0_0 instance = new global_constraint_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("global_constraint_error_0_0");
    Fail21762:
    { 
      IStrategoTerm term11855 = term;
      IStrategoConstructor cons551 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11747:
      { 
        if(cons551 == Main._consCallT_3)
        { 
          Fail21763:
          { 
            IStrategoTerm p_4262 = null;
            IStrategoTerm u_4262 = null;
            IStrategoTerm w_4262 = null;
            IStrategoTerm x_4262 = null;
            IStrategoTerm arg7810 = term.getSubterm(0);
            if(arg7810.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7810).getConstructor())
              break Fail21763;
            p_4262 = arg7810.getSubterm(0);
            IStrategoTerm term11856 = term;
            Success11748:
            { 
              Fail21764:
              { 
                term = is_declared_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21764;
                { 
                  if(true)
                    break Fail21763;
                  if(true)
                    break Success11748;
                }
              }
              term = term11856;
            }
            term = p_4262;
            IStrategoTerm term11857 = term;
            Success11749:
            { 
              Fail21765:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21765;
                if(true)
                  break Success11749;
              }
              term = term11857;
              IStrategoTerm term11858 = term;
              Success11750:
              { 
                Fail21766:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21766;
                  if(true)
                    break Success11750;
                }
                term = term11858;
                IStrategoTerm term11859 = term;
                Success11751:
                { 
                  Fail21767:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21767;
                    if(true)
                      break Success11751;
                  }
                  term = term11859;
                  IStrategoTerm term11860 = term;
                  Success11752:
                  { 
                    Fail21768:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21768;
                      if(true)
                        break Success11752;
                    }
                    term = term11860;
                    IStrategoTerm q_4262 = null;
                    IStrategoTerm r_4262 = null;
                    IStrategoTerm t_4262 = null;
                    q_4262 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail21763;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail21763;
                    r_4262 = ((IStrategoList)term).tail();
                    t_4262 = r_4262;
                    term = report_failure_0_2.instance.invoke(context, t_4262, trans.const4411, q_4262);
                    if(term == null)
                      break Fail21763;
                  }
                }
              }
            }
            w_4262 = term;
            u_4262 = trans.const4230;
            x_4262 = w_4262;
            term = string_replace_0_2.instance.invoke(context, x_4262, u_4262, trans.const4412);
            if(term == null)
              break Fail21763;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const4414, termFactory.makeListCons(term, (IStrategoList)trans.constCons2036));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21763;
            term = termFactory.makeTuple(p_4262, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
            if(true)
              break Success11747;
          }
          term = term11855;
        }
        Success11753:
        { 
          if(cons551 == Main._consOp_2)
          { 
            Fail21769:
            { 
              IStrategoTerm o_4261 = null;
              IStrategoTerm p_4261 = null;
              IStrategoTerm j_4262 = null;
              IStrategoTerm u_4261 = null;
              IStrategoTerm w_4261 = null;
              IStrategoTerm x_4261 = null;
              IStrategoTerm c_4262 = null;
              IStrategoTerm e_4262 = null;
              IStrategoTerm f_4262 = null;
              o_4261 = term.getSubterm(0);
              p_4261 = term.getSubterm(1);
              term = require_1_0.instance.invoke(context, term, is_declared_0_0.instance);
              if(term == null)
                break Fail21769;
              term = o_4261;
              IStrategoTerm term11862 = term;
              Success11754:
              { 
                Fail21770:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21770;
                  if(true)
                    break Success11754;
                }
                term = term11862;
                IStrategoTerm term11863 = term;
                Success11755:
                { 
                  Fail21771:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21771;
                    if(true)
                      break Success11755;
                  }
                  term = term11863;
                  IStrategoTerm term11864 = term;
                  Success11756:
                  { 
                    Fail21772:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21772;
                      if(true)
                        break Success11756;
                    }
                    term = term11864;
                    IStrategoTerm term11865 = term;
                    Success11757:
                    { 
                      Fail21773:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21773;
                        if(true)
                          break Success11757;
                      }
                      term = term11865;
                      IStrategoTerm q_4261 = null;
                      IStrategoTerm r_4261 = null;
                      IStrategoTerm t_4261 = null;
                      q_4261 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21769;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail21769;
                      r_4261 = ((IStrategoList)term).tail();
                      t_4261 = r_4261;
                      term = report_failure_0_2.instance.invoke(context, t_4261, trans.const4411, q_4261);
                      if(term == null)
                        break Fail21769;
                    }
                  }
                }
              }
              w_4261 = term;
              u_4261 = trans.const4230;
              x_4261 = w_4261;
              term = string_replace_0_2.instance.invoke(context, x_4261, u_4261, trans.const4335);
              if(term == null)
                break Fail21769;
              j_4262 = term;
              term = length_0_0.instance.invoke(context, p_4261);
              if(term == null)
                break Fail21769;
              IStrategoTerm term11866 = term;
              Success11758:
              { 
                Fail21774:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21774;
                  if(true)
                    break Success11758;
                }
                term = term11866;
                IStrategoTerm term11867 = term;
                Success11759:
                { 
                  Fail21775:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21775;
                    if(true)
                      break Success11759;
                  }
                  term = term11867;
                  IStrategoTerm term11868 = term;
                  Success11760:
                  { 
                    Fail21776:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21776;
                      if(true)
                        break Success11760;
                    }
                    term = term11868;
                    IStrategoTerm term11869 = term;
                    Success11761:
                    { 
                      Fail21777:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21777;
                        if(true)
                          break Success11761;
                      }
                      term = term11869;
                      IStrategoTerm y_4261 = null;
                      IStrategoTerm z_4261 = null;
                      IStrategoTerm b_4262 = null;
                      y_4261 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21769;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail21769;
                      z_4261 = ((IStrategoList)term).tail();
                      b_4262 = z_4261;
                      term = report_failure_0_2.instance.invoke(context, b_4262, trans.const4411, y_4261);
                      if(term == null)
                        break Fail21769;
                    }
                  }
                }
              }
              e_4262 = term;
              c_4262 = trans.const4230;
              f_4262 = e_4262;
              term = string_replace_0_2.instance.invoke(context, f_4262, c_4262, trans.const4415);
              if(term == null)
                break Fail21769;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4417, termFactory.makeListCons(j_4262, termFactory.makeListCons(trans.const4270, termFactory.makeListCons(term, (IStrategoList)trans.constCons2037))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21769;
              term = termFactory.makeTuple(o_4261, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
              if(true)
                break Success11753;
            }
            term = term11855;
          }
          IStrategoTerm term11870 = term;
          Success11762:
          { 
            Fail21778:
            { 
              TermReference a_4261 = new TermReference();
              IStrategoTerm j_4261 = null;
              IStrategoTerm k_4261 = null;
              IStrategoTerm l_4261 = null;
              IStrategoTerm f_4261 = null;
              IStrategoTerm h_4261 = null;
              IStrategoTerm i_4261 = null;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)term).getConstructor())
                break Fail21778;
              if(a_4261.value == null)
                a_4261.value = term.getSubterm(0);
              else
                if(a_4261.value != term.getSubterm(0) && !a_4261.value.match(term.getSubterm(0)))
                  break Fail21778;
              j_4261 = term;
              lifted6660 lifted66600 = new lifted6660();
              lifted66600.a_4261 = a_4261;
              term = require_1_0.instance.invoke(context, term, lifted66600);
              if(term == null)
                break Fail21778;
              term = j_4261;
              l_4261 = j_4261;
              if(a_4261.value == null)
                break Fail21778;
              term = a_4261.value;
              IStrategoTerm term11872 = term;
              Success11763:
              { 
                Fail21779:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21779;
                  if(true)
                    break Success11763;
                }
                term = term11872;
                IStrategoTerm term11873 = term;
                Success11764:
                { 
                  Fail21780:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21780;
                    if(true)
                      break Success11764;
                  }
                  term = term11873;
                  IStrategoTerm term11874 = term;
                  Success11765:
                  { 
                    Fail21781:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21781;
                      if(true)
                        break Success11765;
                    }
                    term = term11874;
                    IStrategoTerm term11875 = term;
                    Success11766:
                    { 
                      Fail21782:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21782;
                        if(true)
                          break Success11766;
                      }
                      term = term11875;
                      IStrategoTerm b_4261 = null;
                      IStrategoTerm c_4261 = null;
                      IStrategoTerm e_4261 = null;
                      b_4261 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21778;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail21778;
                      c_4261 = ((IStrategoList)term).tail();
                      e_4261 = c_4261;
                      term = report_failure_0_2.instance.invoke(context, e_4261, trans.const4411, b_4261);
                      if(term == null)
                        break Fail21778;
                    }
                  }
                }
              }
              h_4261 = term;
              f_4261 = trans.const4230;
              i_4261 = h_4261;
              term = string_replace_0_2.instance.invoke(context, i_4261, f_4261, trans.const4412);
              if(term == null)
                break Fail21778;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4418, termFactory.makeListCons(term, (IStrategoList)trans.constCons1979));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21778;
              k_4261 = term;
              term = l_4261;
              if(a_4261.value == null)
                break Fail21778;
              term = termFactory.makeTuple(a_4261.value, termFactory.annotateTerm(k_4261, checkListAnnos(termFactory, trans.constNil3)));
              if(true)
                break Success11762;
            }
            term = term11870;
            IStrategoTerm term11876 = term;
            IStrategoConstructor cons552 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
            Success11767:
            { 
              if(cons552 == Main._consDynRuleScopeId_1)
              { 
                Fail21783:
                { 
                  IStrategoTerm m_4260 = null;
                  IStrategoTerm r_4260 = null;
                  IStrategoTerm t_4260 = null;
                  IStrategoTerm u_4260 = null;
                  m_4260 = term.getSubterm(0);
                  term = require_1_0.instance.invoke(context, term, is_declared_0_0.instance);
                  if(term == null)
                    break Fail21783;
                  term = m_4260;
                  IStrategoTerm term11877 = term;
                  Success11768:
                  { 
                    Fail21784:
                    { 
                      term = concat_strings_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21784;
                      if(true)
                        break Success11768;
                    }
                    term = term11877;
                    IStrategoTerm term11878 = term;
                    Success11769:
                    { 
                      Fail21785:
                      { 
                        term = is_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21785;
                        if(true)
                          break Success11769;
                      }
                      term = term11878;
                      IStrategoTerm term11879 = term;
                      Success11770:
                      { 
                        Fail21786:
                        { 
                          term = int_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail21786;
                          if(true)
                            break Success11770;
                        }
                        term = term11879;
                        IStrategoTerm term11880 = term;
                        Success11771:
                        { 
                          Fail21787:
                          { 
                            term = real_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail21787;
                            if(true)
                              break Success11771;
                          }
                          term = term11880;
                          IStrategoTerm n_4260 = null;
                          IStrategoTerm o_4260 = null;
                          IStrategoTerm q_4260 = null;
                          n_4260 = term;
                          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                          if(term == null)
                            break Fail21783;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail21783;
                          o_4260 = ((IStrategoList)term).tail();
                          q_4260 = o_4260;
                          term = report_failure_0_2.instance.invoke(context, q_4260, trans.const4411, n_4260);
                          if(term == null)
                            break Fail21783;
                        }
                      }
                    }
                  }
                  t_4260 = term;
                  r_4260 = trans.const4230;
                  u_4260 = t_4260;
                  term = string_replace_0_2.instance.invoke(context, u_4260, r_4260, trans.const4419);
                  if(term == null)
                    break Fail21783;
                  term = (IStrategoTerm)termFactory.makeListCons(trans.const4420, termFactory.makeListCons(term, (IStrategoList)trans.constCons2036));
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21783;
                  term = termFactory.makeTuple(m_4260, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
                  if(true)
                    break Success11767;
                }
                term = term11876;
              }
              Success11772:
              { 
                if(cons552 == Main._consLabeledDynRuleId_2)
                { 
                  Fail21788:
                  { 
                    IStrategoTerm y_4259 = null;
                    IStrategoTerm d_4260 = null;
                    IStrategoTerm f_4260 = null;
                    IStrategoTerm g_4260 = null;
                    y_4259 = term.getSubterm(0);
                    term = require_1_0.instance.invoke(context, term, is_declared_0_0.instance);
                    if(term == null)
                      break Fail21788;
                    term = y_4259;
                    IStrategoTerm term11882 = term;
                    Success11773:
                    { 
                      Fail21789:
                      { 
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21789;
                        if(true)
                          break Success11773;
                      }
                      term = term11882;
                      IStrategoTerm term11883 = term;
                      Success11774:
                      { 
                        Fail21790:
                        { 
                          term = is_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail21790;
                          if(true)
                            break Success11774;
                        }
                        term = term11883;
                        IStrategoTerm term11884 = term;
                        Success11775:
                        { 
                          Fail21791:
                          { 
                            term = int_to_string_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail21791;
                            if(true)
                              break Success11775;
                          }
                          term = term11884;
                          IStrategoTerm term11885 = term;
                          Success11776:
                          { 
                            Fail21792:
                            { 
                              term = real_to_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail21792;
                              if(true)
                                break Success11776;
                            }
                            term = term11885;
                            IStrategoTerm z_4259 = null;
                            IStrategoTerm a_4260 = null;
                            IStrategoTerm c_4260 = null;
                            z_4259 = term;
                            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                            if(term == null)
                              break Fail21788;
                            if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                              break Fail21788;
                            a_4260 = ((IStrategoList)term).tail();
                            c_4260 = a_4260;
                            term = report_failure_0_2.instance.invoke(context, c_4260, trans.const4411, z_4259);
                            if(term == null)
                              break Fail21788;
                          }
                        }
                      }
                    }
                    f_4260 = term;
                    d_4260 = trans.const4230;
                    g_4260 = f_4260;
                    term = string_replace_0_2.instance.invoke(context, g_4260, d_4260, trans.const4419);
                    if(term == null)
                      break Fail21788;
                    term = (IStrategoTerm)termFactory.makeListCons(trans.const4420, termFactory.makeListCons(term, (IStrategoList)trans.constCons2036));
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21788;
                    term = termFactory.makeTuple(y_4259, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
                    if(true)
                      break Success11772;
                  }
                  term = term11876;
                }
                IStrategoTerm j_4259 = null;
                TermReference k_4259 = new TermReference();
                IStrategoTerm p_4259 = null;
                IStrategoTerm r_4259 = null;
                IStrategoTerm s_4259 = null;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
                  break Fail21762;
                IStrategoTerm arg7818 = term.getSubterm(0);
                j_4259 = arg7818;
                IStrategoList annos686 = arg7818.getAnnotations();
                if(annos686.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos686).isEmpty())
                  break Fail21762;
                if(k_4259.value == null)
                  k_4259.value = ((IStrategoList)annos686).head();
                else
                  if(k_4259.value != ((IStrategoList)annos686).head() && !k_4259.value.match(((IStrategoList)annos686).head()))
                    break Fail21762;
                IStrategoTerm arg7819 = ((IStrategoList)annos686).tail();
                if(arg7819.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7819).isEmpty())
                  break Fail21762;
                lifted6663 lifted66630 = new lifted6663();
                lifted66630.k_4259 = k_4259;
                term = require_1_0.instance.invoke(context, term, lifted66630);
                if(term == null)
                  break Fail21762;
                term = j_4259;
                IStrategoTerm term11887 = term;
                Success11777:
                { 
                  Fail21793:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21793;
                    if(true)
                      break Success11777;
                  }
                  term = term11887;
                  IStrategoTerm term11888 = term;
                  Success11778:
                  { 
                    Fail21794:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21794;
                      if(true)
                        break Success11778;
                    }
                    term = term11888;
                    IStrategoTerm term11889 = term;
                    Success11779:
                    { 
                      Fail21795:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21795;
                        if(true)
                          break Success11779;
                      }
                      term = term11889;
                      IStrategoTerm term11890 = term;
                      Success11780:
                      { 
                        Fail21796:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail21796;
                          if(true)
                            break Success11780;
                        }
                        term = term11890;
                        IStrategoTerm l_4259 = null;
                        IStrategoTerm m_4259 = null;
                        IStrategoTerm o_4259 = null;
                        l_4259 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail21762;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail21762;
                        m_4259 = ((IStrategoList)term).tail();
                        o_4259 = m_4259;
                        term = report_failure_0_2.instance.invoke(context, o_4259, trans.const4411, l_4259);
                        if(term == null)
                          break Fail21762;
                      }
                    }
                  }
                }
                r_4259 = term;
                p_4259 = trans.const4230;
                s_4259 = r_4259;
                term = string_replace_0_2.instance.invoke(context, s_4259, p_4259, trans.const4421);
                if(term == null)
                  break Fail21762;
                term = (IStrategoTerm)termFactory.makeListCons(trans.const4422, termFactory.makeListCons(term, (IStrategoList)trans.constCons1979));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21762;
                term = termFactory.makeTuple(j_4259, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
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