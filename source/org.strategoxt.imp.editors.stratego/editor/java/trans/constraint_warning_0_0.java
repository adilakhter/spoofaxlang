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
    Fail21837:
    { 
      IStrategoTerm term11945 = term;
      Success11818:
      { 
        Fail21838:
        { 
          IStrategoTerm z_4268 = null;
          IStrategoTerm a_4269 = null;
          IStrategoTerm b_4269 = null;
          IStrategoTerm c_4269 = null;
          IStrategoTerm h_4269 = null;
          IStrategoTerm j_4269 = null;
          IStrategoTerm k_4269 = null;
          z_4268 = term;
          term = get_assign_var_0_0.instance.invoke(context, z_4268);
          if(term == null)
            break Fail21838;
          a_4269 = term;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
            break Fail21838;
          c_4269 = term.getSubterm(0);
          term = declaration_of_0_0.instance.invoke(context, a_4269);
          if(term == null)
            break Fail21838;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
            break Fail21838;
          b_4269 = term.getSubterm(0);
          IStrategoTerm term11946 = term;
          Success11819:
          { 
            Fail21839:
            { 
              IStrategoTerm v_4500 = null;
              IStrategoTerm a_4501 = null;
              IStrategoTerm x_4500 = null;
              a_4501 = b_4269;
              v_4500 = c_4269;
              term = a_4501;
              x_4500 = a_4501;
              term = context.invokePrimitive("SSL_EXT_origin_equal", x_4500, NO_STRATEGIES, new IStrategoTerm[]{term, v_4500});
              if(term == null)
                break Fail21839;
              { 
                if(true)
                  break Fail21838;
                if(true)
                  break Success11819;
              }
            }
            term = term11946;
          }
          term = c_4269;
          IStrategoTerm term11947 = term;
          Success11820:
          { 
            Fail21840:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21840;
              if(true)
                break Success11820;
            }
            term = term11947;
            IStrategoTerm term11948 = term;
            Success11821:
            { 
              Fail21841:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21841;
                if(true)
                  break Success11821;
              }
              term = term11948;
              IStrategoTerm term11949 = term;
              Success11822:
              { 
                Fail21842:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21842;
                  if(true)
                    break Success11822;
                }
                term = term11949;
                IStrategoTerm term11950 = term;
                Success11823:
                { 
                  Fail21843:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21843;
                    if(true)
                      break Success11823;
                  }
                  term = term11950;
                  IStrategoTerm d_4269 = null;
                  IStrategoTerm e_4269 = null;
                  IStrategoTerm g_4269 = null;
                  d_4269 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21838;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21838;
                  e_4269 = ((IStrategoList)term).tail();
                  g_4269 = e_4269;
                  term = report_failure_0_2.instance.invoke(context, g_4269, trans.const4439, d_4269);
                  if(term == null)
                    break Fail21838;
                }
              }
            }
          }
          j_4269 = term;
          h_4269 = trans.const4230;
          k_4269 = j_4269;
          term = string_replace_0_2.instance.invoke(context, k_4269, h_4269, trans.const4424);
          if(term == null)
            break Fail21838;
          term = (IStrategoTerm)termFactory.makeListCons(trans.const4426, termFactory.makeListCons(term, (IStrategoList)trans.constCons2039));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21838;
          term = termFactory.makeTuple(c_4269, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
          if(true)
            break Success11818;
        }
        term = term11945;
        IStrategoTerm term11951 = term;
        IStrategoConstructor cons555 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success11824:
        { 
          if(cons555 == Main._consVar_1)
          { 
            Fail21844:
            { 
              IStrategoTerm l_4268 = null;
              IStrategoTerm q_4268 = null;
              IStrategoTerm s_4268 = null;
              IStrategoTerm t_4268 = null;
              l_4268 = term.getSubterm(0);
              term = require_1_0.instance.invoke(context, term, lifted6672.instance);
              if(term == null)
                break Fail21844;
              term = l_4268;
              IStrategoTerm term11953 = term;
              Success11825:
              { 
                Fail21845:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21845;
                  if(true)
                    break Success11825;
                }
                term = term11953;
                IStrategoTerm term11954 = term;
                Success11826:
                { 
                  Fail21846:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21846;
                    if(true)
                      break Success11826;
                  }
                  term = term11954;
                  IStrategoTerm term11955 = term;
                  Success11827:
                  { 
                    Fail21847:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21847;
                      if(true)
                        break Success11827;
                    }
                    term = term11955;
                    IStrategoTerm term11956 = term;
                    Success11828:
                    { 
                      Fail21848:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21848;
                        if(true)
                          break Success11828;
                      }
                      term = term11956;
                      IStrategoTerm m_4268 = null;
                      IStrategoTerm n_4268 = null;
                      IStrategoTerm p_4268 = null;
                      m_4268 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21844;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail21844;
                      n_4268 = ((IStrategoList)term).tail();
                      p_4268 = n_4268;
                      term = report_failure_0_2.instance.invoke(context, p_4268, trans.const4439, m_4268);
                      if(term == null)
                        break Fail21844;
                    }
                  }
                }
              }
              s_4268 = term;
              q_4268 = trans.const4230;
              t_4268 = s_4268;
              term = string_replace_0_2.instance.invoke(context, t_4268, q_4268, trans.const4441);
              if(term == null)
                break Fail21844;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4443, termFactory.makeListCons(term, (IStrategoList)trans.constCons2040));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21844;
              term = termFactory.makeTuple(l_4268, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
              if(true)
                break Success11824;
            }
            term = term11951;
          }
          Success11829:
          { 
            if(cons555 == Main._consCallT_3)
            { 
              Fail21849:
              { 
                IStrategoTerm v_4267 = null;
                IStrategoTerm w_4267 = null;
                IStrategoTerm f_4268 = null;
                IStrategoTerm b_4268 = null;
                IStrategoTerm d_4268 = null;
                IStrategoTerm e_4268 = null;
                IStrategoTerm arg7878 = term.getSubterm(0);
                if(arg7878.getTermType() != IStrategoTerm.APPL || Main._consSVar_1 != ((IStrategoAppl)arg7878).getConstructor())
                  break Fail21849;
                f_4268 = arg7878.getSubterm(0);
                IStrategoTerm arg7879 = term.getSubterm(1);
                if(arg7879.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg7879).isEmpty())
                  break Fail21849;
                v_4267 = ((IStrategoList)arg7879).head();
                IStrategoTerm arg7880 = ((IStrategoList)arg7879).tail();
                if(arg7880.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7880).isEmpty())
                  break Fail21849;
                IStrategoTerm arg7881 = term.getSubterm(2);
                if(arg7881.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7881).isEmpty())
                  break Fail21849;
                term = f_4268;
                IStrategoTerm term11958 = term;
                Success11830:
                { 
                  Fail21850:
                  { 
                    if(term.getTermType() != IStrategoTerm.STRING || !"debug".equals(((IStrategoString)term).stringValue()))
                      break Fail21850;
                    if(true)
                      break Success11830;
                  }
                  term = term11958;
                  if(term.getTermType() != IStrategoTerm.STRING || !"say".equals(((IStrategoString)term).stringValue()))
                    break Fail21849;
                }
                Success11831:
                { 
                  Fail21851:
                  { 
                    term = v_4267;
                    if(term.getTermType() != IStrategoTerm.APPL || Main._consStrCong_1 != ((IStrategoAppl)term).getConstructor())
                      break Fail21851;
                    w_4267 = term.getSubterm(0);
                    if(true)
                      break Success11831;
                  }
                  term = v_4267;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consIntCong_1 != ((IStrategoAppl)term).getConstructor())
                    break Fail21849;
                  w_4267 = term.getSubterm(0);
                }
                term = w_4267;
                IStrategoTerm term11960 = term;
                Success11832:
                { 
                  Fail21852:
                  { 
                    term = concat_strings_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21852;
                    if(true)
                      break Success11832;
                  }
                  term = term11960;
                  IStrategoTerm term11961 = term;
                  Success11833:
                  { 
                    Fail21853:
                    { 
                      term = is_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21853;
                      if(true)
                        break Success11833;
                    }
                    term = term11961;
                    IStrategoTerm term11962 = term;
                    Success11834:
                    { 
                      Fail21854:
                      { 
                        term = int_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21854;
                        if(true)
                          break Success11834;
                      }
                      term = term11962;
                      IStrategoTerm term11963 = term;
                      Success11835:
                      { 
                        Fail21855:
                        { 
                          term = real_to_string_0_0.instance.invoke(context, term);
                          if(term == null)
                            break Fail21855;
                          if(true)
                            break Success11835;
                        }
                        term = term11963;
                        IStrategoTerm x_4267 = null;
                        IStrategoTerm y_4267 = null;
                        IStrategoTerm a_4268 = null;
                        x_4267 = term;
                        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                        if(term == null)
                          break Fail21849;
                        if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                          break Fail21849;
                        y_4267 = ((IStrategoList)term).tail();
                        a_4268 = y_4267;
                        term = report_failure_0_2.instance.invoke(context, a_4268, trans.const4439, x_4267);
                        if(term == null)
                          break Fail21849;
                      }
                    }
                  }
                }
                d_4268 = term;
                b_4268 = trans.const4230;
                e_4268 = d_4268;
                term = string_replace_0_2.instance.invoke(context, e_4268, b_4268, trans.const4335);
                if(term == null)
                  break Fail21849;
                term = (IStrategoTerm)termFactory.makeListCons(trans.const4444, termFactory.makeListCons(term, (IStrategoList)trans.constCons1979));
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21849;
                term = termFactory.makeTuple(w_4267, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
                if(true)
                  break Success11829;
              }
              term = term11951;
            }
            Success11836:
            { 
              if(cons555 == Main._consImport_1)
              { 
                Fail21856:
                { 
                  IStrategoTerm arg7883 = term.getSubterm(0);
                  if(arg7883.getTermType() != IStrategoTerm.STRING || !"Java-15".equals(((IStrategoString)arg7883).stringValue()))
                    break Fail21856;
                  term = termFactory.makeTuple(term, trans.const4445);
                  if(true)
                    break Success11836;
                }
                term = term11951;
              }
              IStrategoTerm term11965 = term;
              Success11837:
              { 
                Fail21857:
                { 
                  TermReference j_4267 = new TermReference();
                  IStrategoTerm k_4267 = null;
                  IStrategoTerm r_4267 = null;
                  IStrategoTerm s_4267 = null;
                  if(term.getTermType() != IStrategoTerm.APPL || Main._consModule_2 != ((IStrategoAppl)term).getConstructor())
                    break Fail21857;
                  if(j_4267.value == null)
                    j_4267.value = term.getSubterm(0);
                  else
                    if(j_4267.value != term.getSubterm(0) && !j_4267.value.match(term.getSubterm(0)))
                      break Fail21857;
                  k_4267 = term;
                  lifted6673 lifted66730 = new lifted6673();
                  lifted66730.j_4267 = j_4267;
                  term = require_1_0.instance.invoke(context, term, lifted66730);
                  if(term == null)
                    break Fail21857;
                  s_4267 = k_4267;
                  term = concat_strings_0_0.instance.invoke(context, trans.constCons2041);
                  if(term == null)
                    break Fail21857;
                  r_4267 = term;
                  term = s_4267;
                  if(j_4267.value == null)
                    break Fail21857;
                  term = termFactory.makeTuple(j_4267.value, termFactory.annotateTerm(r_4267, checkListAnnos(termFactory, trans.constNil3)));
                  if(true)
                    break Success11837;
                }
                term = term11965;
                IStrategoTerm d_4267 = null;
                IStrategoTerm g_4267 = null;
                if(term.getTermType() != IStrategoTerm.APPL || Main._consImport_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail21837;
                d_4267 = term.getSubterm(0);
                g_4267 = d_4267;
                term = string_starts_with_0_1.instance.invoke(context, g_4267, trans.const4447);
                if(term == null)
                  break Fail21837;
                term = concat_strings_0_0.instance.invoke(context, trans.constCons2042);
                if(term == null)
                  break Fail21837;
                term = termFactory.makeTuple(d_4267, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
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