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

@SuppressWarnings("all") public class import_cache_path_0_0 extends Strategy 
{ 
  public static import_cache_path_0_0 instance = new import_cache_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("import_cache_path_0_0");
    Fail22919:
    { 
      IStrategoTerm d_4754 = null;
      IStrategoTerm e_4754 = null;
      IStrategoTerm f_4754 = null;
      IStrategoTerm g_4754 = null;
      IStrategoTerm h_4754 = null;
      IStrategoTerm i_4755 = null;
      e_4754 = term;
      i_4755 = term;
      IStrategoTerm term12286 = term;
      Success12221:
      { 
        Fail22920:
        { 
          IStrategoTerm m_4754 = null;
          IStrategoTerm o_4754 = null;
          IStrategoTerm p_4754 = null;
          IStrategoTerm p_4755 = null;
          IStrategoTerm r_4755 = null;
          IStrategoTerm s_4755 = null;
          IStrategoTerm t_4755 = null;
          IStrategoTerm v_4755 = null;
          IStrategoTerm w_4755 = null;
          IStrategoTerm x_4755 = null;
          IStrategoTerm z_4755 = null;
          IStrategoTerm a_4756 = null;
          IStrategoTerm d_4756 = null;
          IStrategoTerm u_4754 = null;
          IStrategoTerm w_4754 = null;
          IStrategoTerm x_4754 = null;
          IStrategoTerm c_4755 = null;
          IStrategoTerm e_4755 = null;
          IStrategoTerm f_4755 = null;
          term = project_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22920;
          d_4754 = term;
          term = d_4754;
          IStrategoTerm term12287 = term;
          Success12222:
          { 
            Fail22921:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22921;
              if(true)
                break Success12222;
            }
            term = term12287;
            IStrategoTerm term12288 = term;
            Success12223:
            { 
              Fail22922:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22922;
                if(true)
                  break Success12223;
              }
              term = term12288;
              IStrategoTerm term12289 = term;
              Success12224:
              { 
                Fail22923:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22923;
                  if(true)
                    break Success12224;
                }
                term = term12289;
                IStrategoTerm term12290 = term;
                Success12225:
                { 
                  Fail22924:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail22924;
                    if(true)
                      break Success12225;
                  }
                  term = term12290;
                  IStrategoTerm i_4754 = null;
                  IStrategoTerm j_4754 = null;
                  IStrategoTerm l_4754 = null;
                  i_4754 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail22920;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail22920;
                  j_4754 = ((IStrategoList)term).tail();
                  l_4754 = j_4754;
                  term = report_failure_0_2.instance.invoke(context, l_4754, trans.const4540, i_4754);
                  if(term == null)
                    break Fail22920;
                }
              }
            }
          }
          o_4754 = term;
          m_4754 = trans.const4440;
          p_4754 = o_4754;
          term = string_replace_0_2.instance.invoke(context, p_4754, m_4754, trans.const4440);
          if(term == null)
            break Fail22920;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons2086);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22920;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
          IStrategoTerm term12291 = term;
          Success12226:
          { 
            Fail22925:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22925;
              if(true)
                break Success12226;
            }
            term = mkdir_0_0.instance.invoke(context, term12291);
            if(term == null)
              break Fail22920;
          }
          f_4754 = term;
          r_4755 = e_4754;
          p_4755 = trans.const4480;
          s_4755 = r_4755;
          term = string_replace_0_2.instance.invoke(context, s_4755, p_4755, trans.const4542);
          if(term == null)
            break Fail22920;
          v_4755 = term;
          t_4755 = trans.const4543;
          w_4755 = v_4755;
          term = string_replace_0_2.instance.invoke(context, w_4755, t_4755, trans.const4542);
          if(term == null)
            break Fail22920;
          z_4755 = term;
          x_4755 = trans.const4544;
          a_4756 = z_4755;
          term = string_replace_0_2.instance.invoke(context, a_4756, x_4755, trans.const4542);
          if(term == null)
            break Fail22920;
          g_4754 = term;
          term = f_4754;
          IStrategoTerm term12292 = term;
          Success12227:
          { 
            Fail22926:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22926;
              if(true)
                break Success12227;
            }
            term = term12292;
            IStrategoTerm term12293 = term;
            Success12228:
            { 
              Fail22927:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22927;
                if(true)
                  break Success12228;
              }
              term = term12293;
              IStrategoTerm term12294 = term;
              Success12229:
              { 
                Fail22928:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22928;
                  if(true)
                    break Success12229;
                }
                term = term12294;
                IStrategoTerm term12295 = term;
                Success12230:
                { 
                  Fail22929:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail22929;
                    if(true)
                      break Success12230;
                  }
                  term = term12295;
                  IStrategoTerm q_4754 = null;
                  IStrategoTerm r_4754 = null;
                  IStrategoTerm t_4754 = null;
                  q_4754 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail22920;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail22920;
                  r_4754 = ((IStrategoList)term).tail();
                  t_4754 = r_4754;
                  term = report_failure_0_2.instance.invoke(context, t_4754, trans.const4540, q_4754);
                  if(term == null)
                    break Fail22920;
                }
              }
            }
          }
          w_4754 = term;
          u_4754 = trans.const4440;
          x_4754 = w_4754;
          term = string_replace_0_2.instance.invoke(context, x_4754, u_4754, trans.const4440);
          if(term == null)
            break Fail22920;
          d_4756 = term;
          term = g_4754;
          IStrategoTerm term12296 = term;
          Success12231:
          { 
            Fail22930:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22930;
              if(true)
                break Success12231;
            }
            term = term12296;
            IStrategoTerm term12297 = term;
            Success12232:
            { 
              Fail22931:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22931;
                if(true)
                  break Success12232;
              }
              term = term12297;
              IStrategoTerm term12298 = term;
              Success12233:
              { 
                Fail22932:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail22932;
                  if(true)
                    break Success12233;
                }
                term = term12298;
                IStrategoTerm term12299 = term;
                Success12234:
                { 
                  Fail22933:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail22933;
                    if(true)
                      break Success12234;
                  }
                  term = term12299;
                  IStrategoTerm y_4754 = null;
                  IStrategoTerm z_4754 = null;
                  IStrategoTerm b_4755 = null;
                  y_4754 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail22920;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail22920;
                  z_4754 = ((IStrategoList)term).tail();
                  b_4755 = z_4754;
                  term = report_failure_0_2.instance.invoke(context, b_4755, trans.const4540, y_4754);
                  if(term == null)
                    break Fail22920;
                }
              }
            }
          }
          e_4755 = term;
          c_4755 = trans.const4440;
          f_4755 = e_4755;
          term = string_replace_0_2.instance.invoke(context, f_4755, c_4755, trans.const4545);
          if(term == null)
            break Fail22920;
          term = (IStrategoTerm)termFactory.makeListCons(d_4756, termFactory.makeListCons(trans.const4480, termFactory.makeListCons(term, (IStrategoList)trans.constCons2087)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22920;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
          h_4754 = term;
          if(true)
            break Success12221;
        }
        term = term12286;
        IStrategoTerm g_4755 = null;
        IStrategoTerm h_4755 = null;
        IStrategoTerm i_4756 = null;
        g_4755 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail22919;
        h_4755 = term;
        i_4756 = g_4755;
        term = report_with_failure_0_2.instance.invoke(context, i_4756, trans.const4547, h_4755);
        if(term == null)
          break Fail22919;
      }
      term = i_4755;
      if(h_4754 == null)
        break Fail22919;
      term = h_4754;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}