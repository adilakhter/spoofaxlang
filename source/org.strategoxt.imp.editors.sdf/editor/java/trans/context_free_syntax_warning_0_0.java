package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class context_free_syntax_warning_0_0 extends Strategy 
{ 
  public static context_free_syntax_warning_0_0 instance = new context_free_syntax_warning_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_warning_0_0");
    Fail76032:
    { 
      IStrategoTerm term41823 = term;
      IStrategoConstructor cons1790 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success41747:
      { 
        if(cons1790 == Main._consprod_3)
        { 
          Fail76033:
          { 
            IStrategoTerm w_92072 = null;
            IStrategoTerm x_92072 = null;
            IStrategoTerm y_92072 = null;
            IStrategoTerm z_92072 = null;
            IStrategoTerm a_92073 = null;
            w_92072 = term.getSubterm(0);
            z_92072 = term.getSubterm(1);
            y_92072 = term.getSubterm(2);
            Success41748:
            { 
              Fail76034:
              { 
                IStrategoTerm term41825 = term;
                Success41749:
                { 
                  Fail76035:
                  { 
                    term = occurrences_1_0.instance.invoke(context, w_92072, lifted21558.instance);
                    if(term == null)
                      break Fail76035;
                    if(term.getTermType() != IStrategoTerm.INT || 1 != ((IStrategoInt)term).intValue())
                      break Fail76035;
                    term = occurrences_1_0.instance.invoke(context, w_92072, lifted21559.instance);
                    if(term == null)
                      break Fail76035;
                    if(term.getTermType() != IStrategoTerm.INT || 0 != ((IStrategoInt)term).intValue())
                      break Fail76035;
                    { 
                      if(true)
                        break Fail76034;
                      if(true)
                        break Success41749;
                    }
                  }
                  term = term41825;
                }
                if(true)
                  break Success41748;
              }
              term = oncetd_1_0.instance.invoke(context, w_92072, lifted21560.instance);
              if(term == null)
                break Fail76033;
            }
            Success41750:
            { 
              Fail76036:
              { 
                IStrategoTerm b_92073 = null;
                b_92073 = term;
                term = y_92072;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consattrs_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail76036;
                x_92072 = term.getSubterm(0);
                term = b_92073;
                { 
                  IStrategoTerm term41828 = term;
                  Success41751:
                  { 
                    Fail76037:
                    { 
                      term = SRTS_one.instance.invoke(context, x_92072, lifted21561.instance);
                      if(term == null)
                        break Fail76037;
                      { 
                        if(true)
                          break Fail76033;
                        if(true)
                          break Success41751;
                      }
                    }
                    term = term41828;
                  }
                  IStrategoTerm term41831 = term;
                  Success41752:
                  { 
                    Fail76038:
                    { 
                      term = SRTS_one.instance.invoke(context, x_92072, lifted21569.instance);
                      if(term == null)
                        break Fail76038;
                      { 
                        if(true)
                          break Fail76033;
                        if(true)
                          break Success41752;
                      }
                    }
                    term = term41831;
                  }
                  IStrategoTerm term41833 = term;
                  Success41753:
                  { 
                    Fail76039:
                    { 
                      term = z_92072;
                      IStrategoTerm term41834 = term;
                      Success41754:
                      { 
                        Fail76040:
                        { 
                          term = sort_1_0.instance.invoke(context, term, lifted21570.instance);
                          if(term == null)
                            break Fail76040;
                          if(true)
                            break Success41754;
                        }
                        term = sort_1_0.instance.invoke(context, term41834, lifted21571.instance);
                        if(term == null)
                          break Fail76039;
                      }
                      { 
                        if(true)
                          break Fail76033;
                        if(true)
                          break Success41753;
                      }
                    }
                    term = term41833;
                  }
                  term = y_92072;
                  a_92073 = y_92072;
                  if(true)
                    break Success41750;
                }
              }
              term = z_92072;
              a_92073 = z_92072;
            }
            term = concat_strings_0_0.instance.invoke(context, trans.constCons7217);
            if(term == null)
              break Fail76033;
            term = termFactory.makeTuple(a_92073, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
            if(true)
              break Success41747;
          }
          term = term41823;
        }
        Success41755:
        { 
          if(cons1790 == Main._consterm_1)
          { 
            Fail76041:
            { 
              IStrategoTerm r_92072 = null;
              IStrategoTerm s_92072 = null;
              r_92072 = term;
              IStrategoTerm arg26127 = term.getSubterm(0);
              if(arg26127.getTermType() != IStrategoTerm.APPL || Main._consdefault_1 != ((IStrategoAppl)arg26127).getConstructor())
                break Fail76041;
              IStrategoTerm arg26128 = arg26127.getSubterm(0);
              if(arg26128.getTermType() != IStrategoTerm.APPL || Main._consappl_2 != ((IStrategoAppl)arg26128).getConstructor())
                break Fail76041;
              IStrategoTerm arg26129 = arg26128.getSubterm(0);
              if(arg26129.getTermType() != IStrategoTerm.APPL || Main._consunquoted_1 != ((IStrategoAppl)arg26129).getConstructor())
                break Fail76041;
              IStrategoTerm arg26130 = arg26129.getSubterm(0);
              if(arg26130.getTermType() != IStrategoTerm.STRING || !"cons".equals(((IStrategoString)arg26130).stringValue()))
                break Fail76041;
              s_92072 = arg26128.getSubterm(1);
              IStrategoTerm term41836 = term;
              Success41756:
              { 
                Fail76042:
                { 
                  term = length_0_0.instance.invoke(context, s_92072);
                  if(term == null)
                    break Fail76042;
                  if(term.getTermType() != IStrategoTerm.INT || 1 != ((IStrategoInt)term).intValue())
                    break Fail76042;
                  { 
                    if(true)
                      break Fail76041;
                    if(true)
                      break Success41756;
                  }
                }
                term = term41836;
              }
              term = concat_strings_0_0.instance.invoke(context, trans.constCons7218);
              if(term == null)
                break Fail76041;
              term = termFactory.makeTuple(r_92072, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
              if(true)
                break Success41755;
            }
            term = term41823;
          }
          Success41757:
          { 
            if(cons1790 == Main._consterm_1)
            { 
              Fail76043:
              { 
                IStrategoTerm o_92072 = null;
                IStrategoTerm arg26131 = term.getSubterm(0);
                if(arg26131.getTermType() != IStrategoTerm.APPL || Main._consdefault_1 != ((IStrategoAppl)arg26131).getConstructor())
                  break Fail76043;
                IStrategoTerm arg26132 = arg26131.getSubterm(0);
                if(arg26132.getTermType() != IStrategoTerm.APPL || Main._consappl_2 != ((IStrategoAppl)arg26132).getConstructor())
                  break Fail76043;
                IStrategoTerm arg26133 = arg26132.getSubterm(0);
                if(arg26133.getTermType() != IStrategoTerm.APPL || Main._consunquoted_1 != ((IStrategoAppl)arg26133).getConstructor())
                  break Fail76043;
                IStrategoTerm arg26134 = arg26133.getSubterm(0);
                if(arg26134.getTermType() != IStrategoTerm.STRING || !"cons".equals(((IStrategoString)arg26134).stringValue()))
                  break Fail76043;
                IStrategoTerm arg26135 = arg26132.getSubterm(1);
                if(arg26135.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26135).isEmpty())
                  break Fail76043;
                IStrategoTerm arg26136 = ((IStrategoList)arg26135).head();
                o_92072 = arg26136;
                if(arg26136.getTermType() != IStrategoTerm.APPL || Main._consfun_1 != ((IStrategoAppl)arg26136).getConstructor())
                  break Fail76043;
                IStrategoTerm arg26137 = arg26136.getSubterm(0);
                if(arg26137.getTermType() != IStrategoTerm.APPL || Main._consquoted_1 != ((IStrategoAppl)arg26137).getConstructor())
                  break Fail76043;
                IStrategoTerm arg26138 = arg26137.getSubterm(0);
                if(arg26138.getTermType() != IStrategoTerm.STRING || !"\"Nil\"".equals(((IStrategoString)arg26138).stringValue()))
                  break Fail76043;
                IStrategoTerm arg26139 = ((IStrategoList)arg26135).tail();
                if(arg26139.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26139).isEmpty())
                  break Fail76043;
                term = concat_strings_0_0.instance.invoke(context, trans.constCons7219);
                if(term == null)
                  break Fail76043;
                term = termFactory.makeTuple(o_92072, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                if(true)
                  break Success41757;
              }
              term = term41823;
            }
            Success41758:
            { 
              if(cons1790 == Main._consterm_1)
              { 
                Fail76044:
                { 
                  IStrategoTerm l_92072 = null;
                  l_92072 = term;
                  IStrategoTerm arg26140 = term.getSubterm(0);
                  if(arg26140.getTermType() != IStrategoTerm.APPL || Main._consdefault_1 != ((IStrategoAppl)arg26140).getConstructor())
                    break Fail76044;
                  IStrategoTerm arg26141 = arg26140.getSubterm(0);
                  if(arg26141.getTermType() != IStrategoTerm.APPL || Main._consannotated_2 != ((IStrategoAppl)arg26141).getConstructor())
                    break Fail76044;
                  term = concat_strings_0_0.instance.invoke(context, trans.constCons7220);
                  if(term == null)
                    break Fail76044;
                  term = termFactory.makeTuple(l_92072, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                  if(true)
                    break Success41758;
                }
                term = term41823;
              }
              Success41759:
              { 
                if(cons1790 == Main._consalt_2)
                { 
                  Fail76045:
                  { 
                    IStrategoTerm h_92072 = null;
                    h_92072 = term;
                    term = concat_strings_0_0.instance.invoke(context, trans.constCons7221);
                    if(term == null)
                      break Fail76045;
                    term = termFactory.makeTuple(h_92072, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                    if(true)
                      break Success41759;
                  }
                  term = term41823;
                }
                Success41760:
                { 
                  if(cons1790 == Main._consopt_1)
                  { 
                    Fail76046:
                    { 
                      IStrategoTerm b_92072 = null;
                      IStrategoTerm arg26144 = term.getSubterm(0);
                      b_92072 = arg26144;
                      if(arg26144.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26144).getConstructor())
                        break Fail76046;
                      IStrategoTerm term41841 = term;
                      Success41761:
                      { 
                        Fail76047:
                        { 
                          term = occurrences_1_0.instance.invoke(context, b_92072, is_non_terminal_0_0.instance);
                          if(term == null)
                            break Fail76047;
                          if(term.getTermType() != IStrategoTerm.INT || 1 != ((IStrategoInt)term).intValue())
                            break Fail76047;
                          { 
                            if(true)
                              break Fail76046;
                            if(true)
                              break Success41761;
                          }
                        }
                        term = term41841;
                      }
                      term = concat_strings_0_0.instance.invoke(context, trans.constCons7222);
                      if(term == null)
                        break Fail76046;
                      term = termFactory.makeTuple(b_92072, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                      if(true)
                        break Success41760;
                    }
                    term = term41823;
                  }
                  Success41762:
                  { 
                    if(cons1790 == Main._consopt_1)
                    { 
                      Fail76048:
                      { 
                        IStrategoTerm x_92071 = null;
                        IStrategoTerm arg26147 = term.getSubterm(0);
                        if(arg26147.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26147).getConstructor())
                          break Fail76048;
                        x_92071 = term;
                        term = concat_strings_0_0.instance.invoke(context, trans.constCons7223);
                        if(term == null)
                          break Fail76048;
                        term = termFactory.makeTuple(x_92071, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                        if(true)
                          break Success41762;
                      }
                      term = term41823;
                    }
                    IStrategoTerm term41843 = term;
                    Success41763:
                    { 
                      Fail76049:
                      { 
                        IStrategoTerm n_92070 = null;
                        IStrategoTerm o_92070 = null;
                        IStrategoTerm n_92071 = null;
                        IStrategoTerm r_92071 = null;
                        IStrategoTerm t_92070 = null;
                        IStrategoTerm v_92070 = null;
                        IStrategoTerm w_92070 = null;
                        IStrategoTerm s_92071 = null;
                        IStrategoTerm b_92071 = null;
                        IStrategoTerm d_92071 = null;
                        IStrategoTerm e_92071 = null;
                        IStrategoTerm j_92071 = null;
                        IStrategoTerm l_92071 = null;
                        IStrategoTerm m_92071 = null;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail76049;
                        IStrategoTerm arg26149 = ((IStrategoList)term).head();
                        if(arg26149.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26149).getConstructor())
                          break Fail76049;
                        n_92070 = arg26149.getSubterm(0);
                        IStrategoTerm arg26150 = ((IStrategoList)term).tail();
                        if(arg26150.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26150).isEmpty())
                          break Fail76049;
                        IStrategoTerm arg26151 = ((IStrategoList)arg26150).head();
                        if(arg26151.getTermType() != IStrategoTerm.APPL || Main._consiter_star_1 != ((IStrategoAppl)arg26151).getConstructor())
                          break Fail76049;
                        IStrategoTerm arg26152 = arg26151.getSubterm(0);
                        if(arg26152.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26152).getConstructor())
                          break Fail76049;
                        IStrategoTerm arg26153 = arg26152.getSubterm(0);
                        if(arg26153.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26153).getConstructor())
                          break Fail76049;
                        o_92070 = arg26153.getSubterm(0);
                        IStrategoTerm arg26154 = arg26152.getSubterm(1);
                        if(arg26154.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26154).isEmpty())
                          break Fail76049;
                        IStrategoTerm arg26155 = ((IStrategoList)arg26154).head();
                        if(arg26155.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26155).getConstructor())
                          break Fail76049;
                        if(arg26155.getSubterm(0) != n_92070 && !n_92070.match(arg26155.getSubterm(0)))
                          break Fail76049;
                        IStrategoTerm arg26156 = ((IStrategoList)arg26154).tail();
                        if(arg26156.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26156).isEmpty())
                          break Fail76049;
                        n_92071 = term;
                        term = n_92070;
                        IStrategoTerm term41844 = term;
                        Success41764:
                        { 
                          Fail76050:
                          { 
                            term = concat_strings_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail76050;
                            if(true)
                              break Success41764;
                          }
                          term = term41844;
                          IStrategoTerm term41845 = term;
                          Success41765:
                          { 
                            Fail76051:
                            { 
                              term = is_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail76051;
                              if(true)
                                break Success41765;
                            }
                            term = term41845;
                            IStrategoTerm term41846 = term;
                            Success41766:
                            { 
                              Fail76052:
                              { 
                                term = int_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail76052;
                                if(true)
                                  break Success41766;
                              }
                              term = term41846;
                              IStrategoTerm term41847 = term;
                              Success41767:
                              { 
                                Fail76053:
                                { 
                                  term = real_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail76053;
                                  if(true)
                                    break Success41767;
                                }
                                term = term41847;
                                IStrategoTerm p_92070 = null;
                                IStrategoTerm q_92070 = null;
                                IStrategoTerm s_92070 = null;
                                p_92070 = term;
                                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                if(term == null)
                                  break Fail76049;
                                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                  break Fail76049;
                                q_92070 = ((IStrategoList)term).tail();
                                s_92070 = q_92070;
                                term = report_failure_0_2.instance.invoke(context, s_92070, trans.const15549, p_92070);
                                if(term == null)
                                  break Fail76049;
                              }
                            }
                          }
                        }
                        v_92070 = term;
                        t_92070 = trans.const15453;
                        w_92070 = v_92070;
                        term = string_replace_0_2.instance.invoke(context, w_92070, t_92070, trans.const15539);
                        if(term == null)
                          break Fail76049;
                        r_92071 = term;
                        term = o_92070;
                        IStrategoTerm term41848 = term;
                        Success41768:
                        { 
                          Fail76054:
                          { 
                            term = concat_strings_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail76054;
                            if(true)
                              break Success41768;
                          }
                          term = term41848;
                          IStrategoTerm term41849 = term;
                          Success41769:
                          { 
                            Fail76055:
                            { 
                              term = is_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail76055;
                              if(true)
                                break Success41769;
                            }
                            term = term41849;
                            IStrategoTerm term41850 = term;
                            Success41770:
                            { 
                              Fail76056:
                              { 
                                term = int_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail76056;
                                if(true)
                                  break Success41770;
                              }
                              term = term41850;
                              IStrategoTerm term41851 = term;
                              Success41771:
                              { 
                                Fail76057:
                                { 
                                  term = real_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail76057;
                                  if(true)
                                    break Success41771;
                                }
                                term = term41851;
                                IStrategoTerm x_92070 = null;
                                IStrategoTerm y_92070 = null;
                                IStrategoTerm a_92071 = null;
                                x_92070 = term;
                                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                if(term == null)
                                  break Fail76049;
                                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                  break Fail76049;
                                y_92070 = ((IStrategoList)term).tail();
                                a_92071 = y_92070;
                                term = report_failure_0_2.instance.invoke(context, a_92071, trans.const15549, x_92070);
                                if(term == null)
                                  break Fail76049;
                              }
                            }
                          }
                        }
                        d_92071 = term;
                        b_92071 = trans.const15453;
                        e_92071 = d_92071;
                        term = string_replace_0_2.instance.invoke(context, e_92071, b_92071, trans.const15505);
                        if(term == null)
                          break Fail76049;
                        s_92071 = term;
                        term = o_92070;
                        IStrategoTerm term41852 = term;
                        Success41772:
                        { 
                          Fail76058:
                          { 
                            term = concat_strings_0_0.instance.invoke(context, term);
                            if(term == null)
                              break Fail76058;
                            if(true)
                              break Success41772;
                          }
                          term = term41852;
                          IStrategoTerm term41853 = term;
                          Success41773:
                          { 
                            Fail76059:
                            { 
                              term = is_string_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail76059;
                              if(true)
                                break Success41773;
                            }
                            term = term41853;
                            IStrategoTerm term41854 = term;
                            Success41774:
                            { 
                              Fail76060:
                              { 
                                term = int_to_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail76060;
                                if(true)
                                  break Success41774;
                              }
                              term = term41854;
                              IStrategoTerm term41855 = term;
                              Success41775:
                              { 
                                Fail76061:
                                { 
                                  term = real_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail76061;
                                  if(true)
                                    break Success41775;
                                }
                                term = term41855;
                                IStrategoTerm f_92071 = null;
                                IStrategoTerm g_92071 = null;
                                IStrategoTerm i_92071 = null;
                                f_92071 = term;
                                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                if(term == null)
                                  break Fail76049;
                                if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                  break Fail76049;
                                g_92071 = ((IStrategoList)term).tail();
                                i_92071 = g_92071;
                                term = report_failure_0_2.instance.invoke(context, i_92071, trans.const15549, f_92071);
                                if(term == null)
                                  break Fail76049;
                              }
                            }
                          }
                        }
                        l_92071 = term;
                        j_92071 = trans.const15453;
                        m_92071 = l_92071;
                        term = string_replace_0_2.instance.invoke(context, m_92071, j_92071, trans.const15550);
                        if(term == null)
                          break Fail76049;
                        term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(r_92071, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(s_92071, termFactory.makeListCons(trans.const15554, termFactory.makeListCons(term, (IStrategoList)trans.constCons7214))))));
                        term = concat_strings_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail76049;
                        term = termFactory.makeTuple(n_92071, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                        if(true)
                          break Success41763;
                      }
                      term = term41843;
                      IStrategoTerm term41856 = term;
                      Success41776:
                      { 
                        Fail76062:
                        { 
                          IStrategoTerm d_92069 = null;
                          IStrategoTerm e_92069 = null;
                          IStrategoTerm d_92070 = null;
                          IStrategoTerm h_92070 = null;
                          IStrategoTerm j_92069 = null;
                          IStrategoTerm l_92069 = null;
                          IStrategoTerm m_92069 = null;
                          IStrategoTerm i_92070 = null;
                          IStrategoTerm r_92069 = null;
                          IStrategoTerm t_92069 = null;
                          IStrategoTerm u_92069 = null;
                          IStrategoTerm z_92069 = null;
                          IStrategoTerm b_92070 = null;
                          IStrategoTerm c_92070 = null;
                          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                            break Fail76062;
                          IStrategoTerm arg26161 = ((IStrategoList)term).head();
                          if(arg26161.getTermType() != IStrategoTerm.APPL || Main._consiter_star_1 != ((IStrategoAppl)arg26161).getConstructor())
                            break Fail76062;
                          IStrategoTerm arg26162 = arg26161.getSubterm(0);
                          if(arg26162.getTermType() != IStrategoTerm.APPL || Main._consseq_2 != ((IStrategoAppl)arg26162).getConstructor())
                            break Fail76062;
                          IStrategoTerm arg26163 = arg26162.getSubterm(0);
                          if(arg26163.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26163).getConstructor())
                            break Fail76062;
                          d_92069 = arg26163.getSubterm(0);
                          IStrategoTerm arg26164 = arg26162.getSubterm(1);
                          if(arg26164.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26164).isEmpty())
                            break Fail76062;
                          IStrategoTerm arg26165 = ((IStrategoList)arg26164).head();
                          if(arg26165.getTermType() != IStrategoTerm.APPL || Main._conslit_1 != ((IStrategoAppl)arg26165).getConstructor())
                            break Fail76062;
                          e_92069 = arg26165.getSubterm(0);
                          IStrategoTerm arg26166 = ((IStrategoList)arg26164).tail();
                          if(arg26166.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26166).isEmpty())
                            break Fail76062;
                          IStrategoTerm arg26167 = ((IStrategoList)term).tail();
                          if(arg26167.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26167).isEmpty())
                            break Fail76062;
                          IStrategoTerm arg26168 = ((IStrategoList)arg26167).head();
                          if(arg26168.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)arg26168).getConstructor())
                            break Fail76062;
                          if(arg26168.getSubterm(0) != d_92069 && !d_92069.match(arg26168.getSubterm(0)))
                            break Fail76062;
                          d_92070 = term;
                          term = d_92069;
                          IStrategoTerm term41857 = term;
                          Success41777:
                          { 
                            Fail76063:
                            { 
                              term = concat_strings_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail76063;
                              if(true)
                                break Success41777;
                            }
                            term = term41857;
                            IStrategoTerm term41858 = term;
                            Success41778:
                            { 
                              Fail76064:
                              { 
                                term = is_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail76064;
                                if(true)
                                  break Success41778;
                              }
                              term = term41858;
                              IStrategoTerm term41859 = term;
                              Success41779:
                              { 
                                Fail76065:
                                { 
                                  term = int_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail76065;
                                  if(true)
                                    break Success41779;
                                }
                                term = term41859;
                                IStrategoTerm term41860 = term;
                                Success41780:
                                { 
                                  Fail76066:
                                  { 
                                    term = real_to_string_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail76066;
                                    if(true)
                                      break Success41780;
                                  }
                                  term = term41860;
                                  IStrategoTerm f_92069 = null;
                                  IStrategoTerm g_92069 = null;
                                  IStrategoTerm i_92069 = null;
                                  f_92069 = term;
                                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                  if(term == null)
                                    break Fail76062;
                                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                    break Fail76062;
                                  g_92069 = ((IStrategoList)term).tail();
                                  i_92069 = g_92069;
                                  term = report_failure_0_2.instance.invoke(context, i_92069, trans.const15549, f_92069);
                                  if(term == null)
                                    break Fail76062;
                                }
                              }
                            }
                          }
                          l_92069 = term;
                          j_92069 = trans.const15453;
                          m_92069 = l_92069;
                          term = string_replace_0_2.instance.invoke(context, m_92069, j_92069, trans.const15539);
                          if(term == null)
                            break Fail76062;
                          h_92070 = term;
                          term = e_92069;
                          IStrategoTerm term41861 = term;
                          Success41781:
                          { 
                            Fail76067:
                            { 
                              term = concat_strings_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail76067;
                              if(true)
                                break Success41781;
                            }
                            term = term41861;
                            IStrategoTerm term41862 = term;
                            Success41782:
                            { 
                              Fail76068:
                              { 
                                term = is_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail76068;
                                if(true)
                                  break Success41782;
                              }
                              term = term41862;
                              IStrategoTerm term41863 = term;
                              Success41783:
                              { 
                                Fail76069:
                                { 
                                  term = int_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail76069;
                                  if(true)
                                    break Success41783;
                                }
                                term = term41863;
                                IStrategoTerm term41864 = term;
                                Success41784:
                                { 
                                  Fail76070:
                                  { 
                                    term = real_to_string_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail76070;
                                    if(true)
                                      break Success41784;
                                  }
                                  term = term41864;
                                  IStrategoTerm n_92069 = null;
                                  IStrategoTerm o_92069 = null;
                                  IStrategoTerm q_92069 = null;
                                  n_92069 = term;
                                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                  if(term == null)
                                    break Fail76062;
                                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                    break Fail76062;
                                  o_92069 = ((IStrategoList)term).tail();
                                  q_92069 = o_92069;
                                  term = report_failure_0_2.instance.invoke(context, q_92069, trans.const15549, n_92069);
                                  if(term == null)
                                    break Fail76062;
                                }
                              }
                            }
                          }
                          t_92069 = term;
                          r_92069 = trans.const15453;
                          u_92069 = t_92069;
                          term = string_replace_0_2.instance.invoke(context, u_92069, r_92069, trans.const15505);
                          if(term == null)
                            break Fail76062;
                          i_92070 = term;
                          term = e_92069;
                          IStrategoTerm term41865 = term;
                          Success41785:
                          { 
                            Fail76071:
                            { 
                              term = concat_strings_0_0.instance.invoke(context, term);
                              if(term == null)
                                break Fail76071;
                              if(true)
                                break Success41785;
                            }
                            term = term41865;
                            IStrategoTerm term41866 = term;
                            Success41786:
                            { 
                              Fail76072:
                              { 
                                term = is_string_0_0.instance.invoke(context, term);
                                if(term == null)
                                  break Fail76072;
                                if(true)
                                  break Success41786;
                              }
                              term = term41866;
                              IStrategoTerm term41867 = term;
                              Success41787:
                              { 
                                Fail76073:
                                { 
                                  term = int_to_string_0_0.instance.invoke(context, term);
                                  if(term == null)
                                    break Fail76073;
                                  if(true)
                                    break Success41787;
                                }
                                term = term41867;
                                IStrategoTerm term41868 = term;
                                Success41788:
                                { 
                                  Fail76074:
                                  { 
                                    term = real_to_string_0_0.instance.invoke(context, term);
                                    if(term == null)
                                      break Fail76074;
                                    if(true)
                                      break Success41788;
                                  }
                                  term = term41868;
                                  IStrategoTerm v_92069 = null;
                                  IStrategoTerm w_92069 = null;
                                  IStrategoTerm y_92069 = null;
                                  v_92069 = term;
                                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                                  if(term == null)
                                    break Fail76062;
                                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                                    break Fail76062;
                                  w_92069 = ((IStrategoList)term).tail();
                                  y_92069 = w_92069;
                                  term = report_failure_0_2.instance.invoke(context, y_92069, trans.const15549, v_92069);
                                  if(term == null)
                                    break Fail76062;
                                }
                              }
                            }
                          }
                          b_92070 = term;
                          z_92069 = trans.const15453;
                          c_92070 = b_92070;
                          term = string_replace_0_2.instance.invoke(context, c_92070, z_92069, trans.const15550);
                          if(term == null)
                            break Fail76062;
                          term = (IStrategoTerm)termFactory.makeListCons(trans.const15553, termFactory.makeListCons(h_92070, termFactory.makeListCons(trans.const15471, termFactory.makeListCons(i_92070, termFactory.makeListCons(trans.const15554, termFactory.makeListCons(term, (IStrategoList)trans.constCons7214))))));
                          term = concat_strings_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail76062;
                          term = termFactory.makeTuple(d_92070, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
                          if(true)
                            break Success41776;
                        }
                        term = term41856;
                        term = context_free_syntax_warning_0_0_fragment_4.instance.invoke(context, term);
                        if(term == null)
                          break Fail76032;
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