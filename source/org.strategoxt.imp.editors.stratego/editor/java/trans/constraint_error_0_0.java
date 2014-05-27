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
    Fail21797:
    { 
      IStrategoTerm term11891 = term;
      Success11781:
      { 
        Fail21798:
        { 
          IStrategoTerm f_4266 = null;
          IStrategoTerm k_4266 = null;
          IStrategoTerm m_4266 = null;
          IStrategoTerm n_4266 = null;
          if(term.getTermType() != IStrategoTerm.APPL || Main._consVar_1 != ((IStrategoAppl)term).getConstructor())
            break Fail21798;
          f_4266 = term.getSubterm(0);
          IStrategoTerm term11892 = term;
          Success11782:
          { 
            Fail21799:
            { 
              term = is_declared_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21799;
              { 
                if(true)
                  break Fail21798;
                if(true)
                  break Success11782;
              }
            }
            term = term11892;
          }
          term = f_4266;
          IStrategoTerm term11893 = term;
          Success11783:
          { 
            Fail21800:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21800;
              if(true)
                break Success11783;
            }
            term = term11893;
            IStrategoTerm term11894 = term;
            Success11784:
            { 
              Fail21801:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21801;
                if(true)
                  break Success11784;
              }
              term = term11894;
              IStrategoTerm term11895 = term;
              Success11785:
              { 
                Fail21802:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21802;
                  if(true)
                    break Success11785;
                }
                term = term11895;
                IStrategoTerm term11896 = term;
                Success11786:
                { 
                  Fail21803:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21803;
                    if(true)
                      break Success11786;
                  }
                  term = term11896;
                  IStrategoTerm g_4266 = null;
                  IStrategoTerm h_4266 = null;
                  IStrategoTerm j_4266 = null;
                  g_4266 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail21798;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail21798;
                  h_4266 = ((IStrategoList)term).tail();
                  j_4266 = h_4266;
                  term = report_failure_0_2.instance.invoke(context, j_4266, trans.const4423, g_4266);
                  if(term == null)
                    break Fail21798;
                }
              }
            }
          }
          m_4266 = term;
          k_4266 = trans.const4230;
          n_4266 = m_4266;
          term = string_replace_0_2.instance.invoke(context, n_4266, k_4266, trans.const4424);
          if(term == null)
            break Fail21798;
          term = (IStrategoTerm)termFactory.makeListCons(trans.const4426, termFactory.makeListCons(term, (IStrategoList)trans.constCons2038));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21798;
          term = termFactory.makeTuple(f_4266, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil3)));
          if(true)
            break Success11781;
        }
        term = term11891;
        IStrategoTerm term11897 = term;
        Success11787:
        { 
          Fail21804:
          { 
            IStrategoTerm d_4265 = null;
            TermReference f_4265 = new TermReference();
            TermReference g_4265 = new TermReference();
            IStrategoTerm t_4265 = null;
            IStrategoTerm a_4266 = null;
            IStrategoTerm b_4266 = null;
            IStrategoTerm c_4266 = null;
            IStrategoTerm p_4265 = null;
            IStrategoTerm r_4265 = null;
            IStrategoTerm s_4265 = null;
            if(term.getTermType() != IStrategoTerm.APPL || Main._consAnnoDef_2 != ((IStrategoAppl)term).getConstructor())
              break Fail21804;
            if(f_4265.value == null)
              f_4265.value = term.getSubterm(0);
            else
              if(f_4265.value != term.getSubterm(0) && !f_4265.value.match(term.getSubterm(0)))
                break Fail21804;
            IStrategoTerm arg7826 = term.getSubterm(1);
            if(g_4265.value == null)
              g_4265.value = arg7826;
            else
              if(g_4265.value != arg7826 && !g_4265.value.match(arg7826))
                break Fail21804;
            if(arg7826.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)arg7826).getConstructor())
              break Fail21804;
            d_4265 = arg7826.getSubterm(0);
            t_4265 = term;
            IStrategoTerm term11898 = term;
            Success11788:
            { 
              Fail21805:
              { 
                IStrategoTerm term11899 = term;
                Success11789:
                { 
                  Fail21806:
                  { 
                    IStrategoTerm h_4265 = null;
                    h_4265 = term;
                    IStrategoTerm term11900 = term;
                    Success11790:
                    { 
                      Fail21807:
                      { 
                        if(f_4265.value == null)
                          break Fail21807;
                        term = f_4265.value;
                        if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
                          break Fail21807;
                        { 
                          if(true)
                            break Fail21806;
                          if(true)
                            break Success11790;
                        }
                      }
                      term = term11900;
                    }
                    term = h_4265;
                    { 
                      IStrategoTerm i_4265 = null;
                      IStrategoTerm u_4265 = null;
                      IStrategoTerm w_4265 = null;
                      IStrategoTerm x_4265 = null;
                      if(g_4265.value == null)
                        break Fail21805;
                      term = signature_of_0_0.instance.invoke(context, g_4265.value);
                      if(term == null)
                        break Fail21805;
                      i_4265 = term;
                      w_4265 = term;
                      u_4265 = trans.const4427;
                      term = w_4265;
                      x_4265 = w_4265;
                      if(g_4265.value == null)
                        break Fail21805;
                      term = termFactory.makeTuple(trans.const4428, g_4265.value);
                      term = dr_set_rule_0_3.instance.invoke(context, x_4265, u_4265, g_4265.value, term);
                      if(term == null)
                        break Fail21805;
                      term = i_4265;
                      if(true)
                        break Success11789;
                    }
                  }
                  term = term11899;
                }
                if(true)
                  break Success11788;
              }
              term = term11898;
              IStrategoTerm j_4265 = null;
              IStrategoTerm k_4265 = null;
              IStrategoTerm z_4265 = null;
              j_4265 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail21804;
              k_4265 = term;
              z_4265 = j_4265;
              term = report_with_failure_0_2.instance.invoke(context, z_4265, trans.const4429, k_4265);
              if(term == null)
                break Fail21804;
            }
            term = t_4265;
            a_4266 = t_4265;
            lifted6664 lifted66640 = new lifted6664();
            lifted66640.f_4265 = f_4265;
            lifted66640.g_4265 = g_4265;
            term = require_1_0.instance.invoke(context, term, lifted66640);
            if(term == null)
              break Fail21804;
            c_4266 = a_4266;
            term = d_4265;
            IStrategoTerm term11903 = term;
            Success11791:
            { 
              Fail21808:
              { 
                term = concat_strings_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21808;
                if(true)
                  break Success11791;
              }
              term = term11903;
              IStrategoTerm term11904 = term;
              Success11792:
              { 
                Fail21809:
                { 
                  term = is_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21809;
                  if(true)
                    break Success11792;
                }
                term = term11904;
                IStrategoTerm term11905 = term;
                Success11793:
                { 
                  Fail21810:
                  { 
                    term = int_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21810;
                    if(true)
                      break Success11793;
                  }
                  term = term11905;
                  IStrategoTerm term11906 = term;
                  Success11794:
                  { 
                    Fail21811:
                    { 
                      term = real_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21811;
                      if(true)
                        break Success11794;
                    }
                    term = term11906;
                    IStrategoTerm l_4265 = null;
                    IStrategoTerm m_4265 = null;
                    IStrategoTerm o_4265 = null;
                    l_4265 = term;
                    term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                    if(term == null)
                      break Fail21804;
                    if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                      break Fail21804;
                    m_4265 = ((IStrategoList)term).tail();
                    o_4265 = m_4265;
                    term = report_failure_0_2.instance.invoke(context, o_4265, trans.const4423, l_4265);
                    if(term == null)
                      break Fail21804;
                  }
                }
              }
            }
            r_4265 = term;
            p_4265 = trans.const4230;
            s_4265 = r_4265;
            term = string_replace_0_2.instance.invoke(context, s_4265, p_4265, trans.const4430);
            if(term == null)
              break Fail21804;
            term = (IStrategoTerm)termFactory.makeListCons(trans.const4431, termFactory.makeListCons(term, (IStrategoList)trans.constCons1979));
            term = concat_strings_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21804;
            b_4266 = term;
            term = c_4266;
            if(f_4265.value == null)
              break Fail21804;
            term = termFactory.makeTuple(f_4265.value, termFactory.annotateTerm(b_4266, checkListAnnos(termFactory, trans.constNil3)));
            if(true)
              break Success11787;
          }
          term = term11897;
          IStrategoTerm term11907 = term;
          Success11795:
          { 
            Fail21812:
            { 
              IStrategoTerm m_4263 = null;
              IStrategoTerm n_4263 = null;
              TermReference o_4263 = new TermReference();
              TermReference p_4263 = new TermReference();
              TermReference q_4263 = new TermReference();
              IStrategoTerm p_4264 = null;
              IStrategoTerm q_4264 = null;
              IStrategoTerm s_4264 = null;
              IStrategoTerm v_4263 = null;
              IStrategoTerm x_4263 = null;
              IStrategoTerm y_4263 = null;
              IStrategoTerm r_4264 = null;
              IStrategoTerm v_4264 = null;
              IStrategoTerm w_4264 = null;
              IStrategoTerm d_4264 = null;
              IStrategoTerm f_4264 = null;
              IStrategoTerm g_4264 = null;
              IStrategoTerm l_4264 = null;
              IStrategoTerm n_4264 = null;
              IStrategoTerm o_4264 = null;
              if(term.getTermType() != IStrategoTerm.APPL || Main._consOpDecl_2 != ((IStrategoAppl)term).getConstructor())
                break Fail21812;
              IStrategoTerm arg7836 = term.getSubterm(0);
              m_4263 = arg7836;
              IStrategoList annos687 = arg7836.getAnnotations();
              if(annos687.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos687).isEmpty())
                break Fail21812;
              if(o_4263.value == null)
                o_4263.value = ((IStrategoList)annos687).head();
              else
                if(o_4263.value != ((IStrategoList)annos687).head() && !o_4263.value.match(((IStrategoList)annos687).head()))
                  break Fail21812;
              IStrategoTerm arg7837 = ((IStrategoList)annos687).tail();
              if(arg7837.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7837).isEmpty())
                break Fail21812;
              n_4263 = term.getSubterm(1);
              p_4264 = term;
              lifted6665 lifted66650 = new lifted6665();
              lifted66650.o_4263 = o_4263;
              lifted66650.p_4263 = p_4263;
              lifted66650.q_4263 = q_4263;
              term = require_1_0.instance.invoke(context, term, lifted66650);
              if(term == null)
                break Fail21812;
              term = p_4264;
              s_4264 = p_4264;
              if(q_4263.value == null)
                break Fail21812;
              term = q_4263.value;
              IStrategoTerm term11909 = term;
              Success11796:
              { 
                Fail21813:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21813;
                  if(true)
                    break Success11796;
                }
                term = term11909;
                IStrategoTerm term11910 = term;
                Success11797:
                { 
                  Fail21814:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21814;
                    if(true)
                      break Success11797;
                  }
                  term = term11910;
                  IStrategoTerm term11911 = term;
                  Success11798:
                  { 
                    Fail21815:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21815;
                      if(true)
                        break Success11798;
                    }
                    term = term11911;
                    IStrategoTerm term11912 = term;
                    Success11799:
                    { 
                      Fail21816:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21816;
                        if(true)
                          break Success11799;
                      }
                      term = term11912;
                      IStrategoTerm r_4263 = null;
                      IStrategoTerm s_4263 = null;
                      IStrategoTerm u_4263 = null;
                      r_4263 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21812;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail21812;
                      s_4263 = ((IStrategoList)term).tail();
                      u_4263 = s_4263;
                      term = report_failure_0_2.instance.invoke(context, u_4263, trans.const4423, r_4263);
                      if(term == null)
                        break Fail21812;
                    }
                  }
                }
              }
              x_4263 = term;
              v_4263 = trans.const4230;
              y_4263 = x_4263;
              term = string_replace_0_2.instance.invoke(context, y_4263, v_4263, trans.const4432);
              if(term == null)
                break Fail21812;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4433, termFactory.makeListCons(term, (IStrategoList)trans.constCons1979));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21812;
              q_4264 = term;
              v_4264 = s_4264;
              term = m_4263;
              IStrategoTerm term11913 = term;
              Success11800:
              { 
                Fail21817:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21817;
                  if(true)
                    break Success11800;
                }
                term = term11913;
                IStrategoTerm term11914 = term;
                Success11801:
                { 
                  Fail21818:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21818;
                    if(true)
                      break Success11801;
                  }
                  term = term11914;
                  IStrategoTerm term11915 = term;
                  Success11802:
                  { 
                    Fail21819:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21819;
                      if(true)
                        break Success11802;
                    }
                    term = term11915;
                    IStrategoTerm term11916 = term;
                    Success11803:
                    { 
                      Fail21820:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21820;
                        if(true)
                          break Success11803;
                      }
                      term = term11916;
                      IStrategoTerm z_4263 = null;
                      IStrategoTerm a_4264 = null;
                      IStrategoTerm c_4264 = null;
                      z_4263 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21812;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail21812;
                      a_4264 = ((IStrategoList)term).tail();
                      c_4264 = a_4264;
                      term = report_failure_0_2.instance.invoke(context, c_4264, trans.const4423, z_4263);
                      if(term == null)
                        break Fail21812;
                    }
                  }
                }
              }
              f_4264 = term;
              d_4264 = trans.const4230;
              g_4264 = f_4264;
              term = string_replace_0_2.instance.invoke(context, g_4264, d_4264, trans.const4434);
              if(term == null)
                break Fail21812;
              w_4264 = term;
              term = length_0_0.instance.invoke(context, n_4263);
              if(term == null)
                break Fail21812;
              IStrategoTerm term11917 = term;
              Success11804:
              { 
                Fail21821:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail21821;
                  if(true)
                    break Success11804;
                }
                term = term11917;
                IStrategoTerm term11918 = term;
                Success11805:
                { 
                  Fail21822:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail21822;
                    if(true)
                      break Success11805;
                  }
                  term = term11918;
                  IStrategoTerm term11919 = term;
                  Success11806:
                  { 
                    Fail21823:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail21823;
                      if(true)
                        break Success11806;
                    }
                    term = term11919;
                    IStrategoTerm term11920 = term;
                    Success11807:
                    { 
                      Fail21824:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail21824;
                        if(true)
                          break Success11807;
                      }
                      term = term11920;
                      IStrategoTerm h_4264 = null;
                      IStrategoTerm i_4264 = null;
                      IStrategoTerm k_4264 = null;
                      h_4264 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail21812;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail21812;
                      i_4264 = ((IStrategoList)term).tail();
                      k_4264 = i_4264;
                      term = report_failure_0_2.instance.invoke(context, k_4264, trans.const4423, h_4264);
                      if(term == null)
                        break Fail21812;
                    }
                  }
                }
              }
              n_4264 = term;
              l_4264 = trans.const4230;
              o_4264 = n_4264;
              term = string_replace_0_2.instance.invoke(context, o_4264, l_4264, trans.const4435);
              if(term == null)
                break Fail21812;
              term = (IStrategoTerm)termFactory.makeListCons(trans.const4436, termFactory.makeListCons(w_4264, termFactory.makeListCons(trans.const4270, termFactory.makeListCons(term, (IStrategoList)trans.constNil3))));
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21812;
              r_4264 = term;
              term = v_4264;
              if(p_4263.value == null)
                break Fail21812;
              term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(m_4263, termFactory.annotateTerm(q_4264, checkListAnnos(termFactory, trans.constNil3))), termFactory.makeListCons(termFactory.makeTuple(p_4263.value, termFactory.annotateTerm(r_4264, checkListAnnos(termFactory, trans.constNil3))), (IStrategoList)trans.constNil3));
              if(true)
                break Success11795;
            }
            term = term11907;
            IStrategoTerm term11921 = term;
            IStrategoConstructor cons554 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
            Success11808:
            { 
              if(cons554 == Main._consBuild_1)
              { 
                Fail21825:
                { 
                  IStrategoTerm l_4263 = null;
                  l_4263 = term.getSubterm(0);
                  term = constraint_error_bad_build_0_0.instance.invoke(context, l_4263);
                  if(term == null)
                    break Fail21825;
                  if(true)
                    break Success11808;
                }
                term = term11921;
              }
              Success11809:
              { 
                if(cons554 == Main._consAssign_2)
                { 
                  Fail21826:
                  { 
                    IStrategoTerm k_4263 = null;
                    k_4263 = term.getSubterm(1);
                    term = constraint_error_bad_build_0_0.instance.invoke(context, k_4263);
                    if(term == null)
                      break Fail21826;
                    if(true)
                      break Success11809;
                  }
                  term = term11921;
                }
                Success11810:
                { 
                  if(cons554 == Main._consRule_3)
                  { 
                    Fail21827:
                    { 
                      IStrategoTerm j_4263 = null;
                      j_4263 = term.getSubterm(1);
                      term = constraint_error_bad_build_0_0.instance.invoke(context, j_4263);
                      if(term == null)
                        break Fail21827;
                      if(true)
                        break Success11810;
                    }
                    term = term11921;
                  }
                  Success11811:
                  { 
                    if(cons554 == Main._consBA_2)
                    { 
                      Fail21828:
                      { 
                        IStrategoTerm i_4263 = null;
                        i_4263 = term.getSubterm(1);
                        term = constraint_error_bad_build_0_0.instance.invoke(context, i_4263);
                        if(term == null)
                          break Fail21828;
                        if(true)
                          break Success11811;
                      }
                      term = term11921;
                    }
                    Success11812:
                    { 
                      if(cons554 == Main._consApp_2)
                      { 
                        Fail21829:
                        { 
                          IStrategoTerm h_4263 = null;
                          h_4263 = term.getSubterm(1);
                          term = constraint_error_bad_build_0_0.instance.invoke(context, h_4263);
                          if(term == null)
                            break Fail21829;
                          if(true)
                            break Success11812;
                        }
                        term = term11921;
                      }
                      Success11813:
                      { 
                        if(cons554 == Main._consMatch_1)
                        { 
                          Fail21830:
                          { 
                            IStrategoTerm g_4263 = null;
                            g_4263 = term.getSubterm(0);
                            term = constraint_error_bad_match_0_0.instance.invoke(context, g_4263);
                            if(term == null)
                              break Fail21830;
                            if(true)
                              break Success11813;
                          }
                          term = term11921;
                        }
                        Success11814:
                        { 
                          if(cons554 == Main._consAssign_2)
                          { 
                            Fail21831:
                            { 
                              IStrategoTerm f_4263 = null;
                              f_4263 = term.getSubterm(0);
                              term = constraint_error_bad_match_0_0.instance.invoke(context, f_4263);
                              if(term == null)
                                break Fail21831;
                              if(true)
                                break Success11814;
                            }
                            term = term11921;
                          }
                          Success11815:
                          { 
                            if(cons554 == Main._consAM_2)
                            { 
                              Fail21832:
                              { 
                                IStrategoTerm e_4263 = null;
                                e_4263 = term.getSubterm(1);
                                term = constraint_error_bad_match_0_0.instance.invoke(context, e_4263);
                                if(term == null)
                                  break Fail21832;
                                if(true)
                                  break Success11815;
                              }
                              term = term11921;
                            }
                            if(cons554 == Main._consRule_3)
                            { 
                              IStrategoTerm d_4263 = null;
                              d_4263 = term.getSubterm(0);
                              term = constraint_error_bad_match_0_0.instance.invoke(context, d_4263);
                              if(term == null)
                                break Fail21797;
                            }
                            else
                            { 
                              break Fail21797;
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