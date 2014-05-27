package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class import_cache_path_0_0 extends Strategy 
{ 
  public static import_cache_path_0_0 instance = new import_cache_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("import_cache_path_0_0");
    Fail22851:
    { 
      IStrategoTerm q_4622 = null;
      IStrategoTerm r_4622 = null;
      IStrategoTerm s_4622 = null;
      IStrategoTerm t_4622 = null;
      IStrategoTerm u_4622 = null;
      IStrategoTerm v_4623 = null;
      r_4622 = term;
      v_4623 = term;
      IStrategoTerm term12200 = term;
      Success12181:
      { 
        Fail22852:
        { 
          IStrategoTerm z_4622 = null;
          IStrategoTerm b_4623 = null;
          IStrategoTerm c_4623 = null;
          IStrategoTerm c_4624 = null;
          IStrategoTerm e_4624 = null;
          IStrategoTerm f_4624 = null;
          IStrategoTerm g_4624 = null;
          IStrategoTerm i_4624 = null;
          IStrategoTerm j_4624 = null;
          IStrategoTerm k_4624 = null;
          IStrategoTerm m_4624 = null;
          IStrategoTerm n_4624 = null;
          IStrategoTerm q_4624 = null;
          IStrategoTerm h_4623 = null;
          IStrategoTerm j_4623 = null;
          IStrategoTerm k_4623 = null;
          IStrategoTerm p_4623 = null;
          IStrategoTerm r_4623 = null;
          IStrategoTerm s_4623 = null;
          term = project_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22852;
          q_4622 = term;
          term = q_4622;
          IStrategoTerm term12201 = term;
          Success12182:
          { 
            Fail22853:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22853;
              if(true)
                break Success12182;
            }
            term = term12201;
            IStrategoTerm term12202 = term;
            Success12183:
            { 
              Fail22854:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22854;
                if(true)
                  break Success12183;
              }
              term = term12202;
              IStrategoTerm term12203 = term;
              Success12184:
              { 
                Fail22855:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22855;
                  if(true)
                    break Success12184;
                }
                term = term12203;
                IStrategoTerm term12204 = term;
                Success12185:
                { 
                  Fail22856:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail22856;
                    if(true)
                      break Success12185;
                  }
                  term = term12204;
                  IStrategoTerm v_4622 = null;
                  IStrategoTerm w_4622 = null;
                  IStrategoTerm y_4622 = null;
                  v_4622 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail22852;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail22852;
                  w_4622 = ((IStrategoList)term).tail();
                  y_4622 = w_4622;
                  term = report_failure_0_2.instance.invoke(context, y_4622, trans.const4491, v_4622);
                  if(term == null)
                    break Fail22852;
                }
              }
            }
          }
          b_4623 = term;
          z_4622 = trans.const4457;
          c_4623 = b_4623;
          term = string_replace_0_2.instance.invoke(context, c_4623, z_4622, trans.const4457);
          if(term == null)
            break Fail22852;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2048);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22852;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
          IStrategoTerm term12205 = term;
          Success12186:
          { 
            Fail22857:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22857;
              if(true)
                break Success12186;
            }
            term = mkdir_0_0.instance.invoke(context, term12205);
            if(term == null)
              break Fail22852;
          }
          s_4622 = term;
          e_4624 = r_4622;
          c_4624 = trans.const4459;
          f_4624 = e_4624;
          term = string_replace_0_2.instance.invoke(context, f_4624, c_4624, trans.const4493);
          if(term == null)
            break Fail22852;
          i_4624 = term;
          g_4624 = trans.const4494;
          j_4624 = i_4624;
          term = string_replace_0_2.instance.invoke(context, j_4624, g_4624, trans.const4493);
          if(term == null)
            break Fail22852;
          m_4624 = term;
          k_4624 = trans.const4495;
          n_4624 = m_4624;
          term = string_replace_0_2.instance.invoke(context, n_4624, k_4624, trans.const4493);
          if(term == null)
            break Fail22852;
          t_4622 = term;
          term = s_4622;
          IStrategoTerm term12206 = term;
          Success12187:
          { 
            Fail22858:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22858;
              if(true)
                break Success12187;
            }
            term = term12206;
            IStrategoTerm term12207 = term;
            Success12188:
            { 
              Fail22859:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22859;
                if(true)
                  break Success12188;
              }
              term = term12207;
              IStrategoTerm term12208 = term;
              Success12189:
              { 
                Fail22860:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22860;
                  if(true)
                    break Success12189;
                }
                term = term12208;
                IStrategoTerm term12209 = term;
                Success12190:
                { 
                  Fail22861:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail22861;
                    if(true)
                      break Success12190;
                  }
                  term = term12209;
                  IStrategoTerm d_4623 = null;
                  IStrategoTerm e_4623 = null;
                  IStrategoTerm g_4623 = null;
                  d_4623 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail22852;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail22852;
                  e_4623 = ((IStrategoList)term).tail();
                  g_4623 = e_4623;
                  term = report_failure_0_2.instance.invoke(context, g_4623, trans.const4491, d_4623);
                  if(term == null)
                    break Fail22852;
                }
              }
            }
          }
          j_4623 = term;
          h_4623 = trans.const4457;
          k_4623 = j_4623;
          term = string_replace_0_2.instance.invoke(context, k_4623, h_4623, trans.const4457);
          if(term == null)
            break Fail22852;
          q_4624 = term;
          term = t_4622;
          IStrategoTerm term12210 = term;
          Success12191:
          { 
            Fail22862:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22862;
              if(true)
                break Success12191;
            }
            term = term12210;
            IStrategoTerm term12211 = term;
            Success12192:
            { 
              Fail22863:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22863;
                if(true)
                  break Success12192;
              }
              term = term12211;
              IStrategoTerm term12212 = term;
              Success12193:
              { 
                Fail22864:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22864;
                  if(true)
                    break Success12193;
                }
                term = term12212;
                IStrategoTerm term12213 = term;
                Success12194:
                { 
                  Fail22865:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail22865;
                    if(true)
                      break Success12194;
                  }
                  term = term12213;
                  IStrategoTerm l_4623 = null;
                  IStrategoTerm m_4623 = null;
                  IStrategoTerm o_4623 = null;
                  l_4623 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail22852;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail22852;
                  m_4623 = ((IStrategoList)term).tail();
                  o_4623 = m_4623;
                  term = report_failure_0_2.instance.invoke(context, o_4623, trans.const4491, l_4623);
                  if(term == null)
                    break Fail22852;
                }
              }
            }
          }
          r_4623 = term;
          p_4623 = trans.const4457;
          s_4623 = r_4623;
          term = string_replace_0_2.instance.invoke(context, s_4623, p_4623, trans.const4472);
          if(term == null)
            break Fail22852;
          term = (IStrategoTerm)termFactory.makeListCons(q_4624, termFactory.makeListCons(trans.const4459, termFactory.makeListCons(term, (IStrategoList)trans.constCons2049)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22852;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
          u_4622 = term;
          if(true)
            break Success12181;
        }
        term = term12200;
        IStrategoTerm t_4623 = null;
        IStrategoTerm u_4623 = null;
        IStrategoTerm v_4624 = null;
        t_4623 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail22851;
        u_4623 = term;
        v_4624 = t_4623;
        term = report_with_failure_0_2.instance.invoke(context, v_4624, trans.const4497, u_4623);
        if(term == null)
          break Fail22851;
      }
      term = v_4623;
      if(u_4622 == null)
        break Fail22851;
      term = u_4622;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}