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
    Fail87659:
    { 
      IStrategoTerm n_17566 = null;
      IStrategoTerm o_17566 = null;
      IStrategoTerm p_17566 = null;
      IStrategoTerm q_17566 = null;
      IStrategoTerm r_17566 = null;
      IStrategoTerm s_17567 = null;
      o_17566 = term;
      s_17567 = term;
      IStrategoTerm term47287 = term;
      Success47268:
      { 
        Fail87660:
        { 
          IStrategoTerm w_17566 = null;
          IStrategoTerm y_17566 = null;
          IStrategoTerm z_17566 = null;
          IStrategoTerm z_17567 = null;
          IStrategoTerm b_17568 = null;
          IStrategoTerm c_17568 = null;
          IStrategoTerm d_17568 = null;
          IStrategoTerm f_17568 = null;
          IStrategoTerm g_17568 = null;
          IStrategoTerm h_17568 = null;
          IStrategoTerm j_17568 = null;
          IStrategoTerm k_17568 = null;
          IStrategoTerm n_17568 = null;
          IStrategoTerm e_17567 = null;
          IStrategoTerm g_17567 = null;
          IStrategoTerm h_17567 = null;
          IStrategoTerm m_17567 = null;
          IStrategoTerm o_17567 = null;
          IStrategoTerm p_17567 = null;
          term = project_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87660;
          n_17566 = term;
          term = n_17566;
          IStrategoTerm term47288 = term;
          Success47269:
          { 
            Fail87661:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87661;
              if(true)
                break Success47269;
            }
            term = term47288;
            IStrategoTerm term47289 = term;
            Success47270:
            { 
              Fail87662:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87662;
                if(true)
                  break Success47270;
              }
              term = term47289;
              IStrategoTerm term47290 = term;
              Success47271:
              { 
                Fail87663:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail87663;
                  if(true)
                    break Success47271;
                }
                term = term47290;
                IStrategoTerm term47291 = term;
                Success47272:
                { 
                  Fail87664:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail87664;
                    if(true)
                      break Success47272;
                  }
                  term = term47291;
                  IStrategoTerm s_17566 = null;
                  IStrategoTerm t_17566 = null;
                  IStrategoTerm v_17566 = null;
                  s_17566 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail87660;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail87660;
                  t_17566 = ((IStrategoList)term).tail();
                  v_17566 = t_17566;
                  term = report_failure_0_2.instance.invoke(context, v_17566, trans.const17878, s_17566);
                  if(term == null)
                    break Fail87660;
                }
              }
            }
          }
          y_17566 = term;
          w_17566 = trans.const17844;
          z_17566 = y_17566;
          term = string_replace_0_2.instance.invoke(context, z_17566, w_17566, trans.const17844);
          if(term == null)
            break Fail87660;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons8529);
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87660;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14));
          IStrategoTerm term47292 = term;
          Success47273:
          { 
            Fail87665:
            { 
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87665;
              if(true)
                break Success47273;
            }
            term = mkdir_0_0.instance.invoke(context, term47292);
            if(term == null)
              break Fail87660;
          }
          p_17566 = term;
          b_17568 = o_17566;
          z_17567 = trans.const17846;
          c_17568 = b_17568;
          term = string_replace_0_2.instance.invoke(context, c_17568, z_17567, trans.const17880);
          if(term == null)
            break Fail87660;
          f_17568 = term;
          d_17568 = trans.const17881;
          g_17568 = f_17568;
          term = string_replace_0_2.instance.invoke(context, g_17568, d_17568, trans.const17880);
          if(term == null)
            break Fail87660;
          j_17568 = term;
          h_17568 = trans.const17882;
          k_17568 = j_17568;
          term = string_replace_0_2.instance.invoke(context, k_17568, h_17568, trans.const17880);
          if(term == null)
            break Fail87660;
          q_17566 = term;
          term = p_17566;
          IStrategoTerm term47293 = term;
          Success47274:
          { 
            Fail87666:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87666;
              if(true)
                break Success47274;
            }
            term = term47293;
            IStrategoTerm term47294 = term;
            Success47275:
            { 
              Fail87667:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87667;
                if(true)
                  break Success47275;
              }
              term = term47294;
              IStrategoTerm term47295 = term;
              Success47276:
              { 
                Fail87668:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail87668;
                  if(true)
                    break Success47276;
                }
                term = term47295;
                IStrategoTerm term47296 = term;
                Success47277:
                { 
                  Fail87669:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail87669;
                    if(true)
                      break Success47277;
                  }
                  term = term47296;
                  IStrategoTerm a_17567 = null;
                  IStrategoTerm b_17567 = null;
                  IStrategoTerm d_17567 = null;
                  a_17567 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail87660;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail87660;
                  b_17567 = ((IStrategoList)term).tail();
                  d_17567 = b_17567;
                  term = report_failure_0_2.instance.invoke(context, d_17567, trans.const17878, a_17567);
                  if(term == null)
                    break Fail87660;
                }
              }
            }
          }
          g_17567 = term;
          e_17567 = trans.const17844;
          h_17567 = g_17567;
          term = string_replace_0_2.instance.invoke(context, h_17567, e_17567, trans.const17844);
          if(term == null)
            break Fail87660;
          n_17568 = term;
          term = q_17566;
          IStrategoTerm term47297 = term;
          Success47278:
          { 
            Fail87670:
            { 
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail87670;
              if(true)
                break Success47278;
            }
            term = term47297;
            IStrategoTerm term47298 = term;
            Success47279:
            { 
              Fail87671:
              { 
                term = is_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail87671;
                if(true)
                  break Success47279;
              }
              term = term47298;
              IStrategoTerm term47299 = term;
              Success47280:
              { 
                Fail87672:
                { 
                  term = int_to_string_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail87672;
                  if(true)
                    break Success47280;
                }
                term = term47299;
                IStrategoTerm term47300 = term;
                Success47281:
                { 
                  Fail87673:
                  { 
                    term = real_to_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail87673;
                    if(true)
                      break Success47281;
                  }
                  term = term47300;
                  IStrategoTerm i_17567 = null;
                  IStrategoTerm j_17567 = null;
                  IStrategoTerm l_17567 = null;
                  i_17567 = term;
                  term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                  if(term == null)
                    break Fail87660;
                  if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                    break Fail87660;
                  j_17567 = ((IStrategoList)term).tail();
                  l_17567 = j_17567;
                  term = report_failure_0_2.instance.invoke(context, l_17567, trans.const17878, i_17567);
                  if(term == null)
                    break Fail87660;
                }
              }
            }
          }
          o_17567 = term;
          m_17567 = trans.const17844;
          p_17567 = o_17567;
          term = string_replace_0_2.instance.invoke(context, p_17567, m_17567, trans.const17859);
          if(term == null)
            break Fail87660;
          term = (IStrategoTerm)termFactory.makeListCons(n_17568, termFactory.makeListCons(trans.const17846, termFactory.makeListCons(term, (IStrategoList)trans.constCons8530)));
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87660;
          term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil14));
          r_17566 = term;
          if(true)
            break Success47268;
        }
        term = term47287;
        IStrategoTerm q_17567 = null;
        IStrategoTerm r_17567 = null;
        IStrategoTerm s_17568 = null;
        q_17567 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail87659;
        r_17567 = term;
        s_17568 = q_17567;
        term = report_with_failure_0_2.instance.invoke(context, s_17568, trans.const17884, r_17567);
        if(term == null)
          break Fail87659;
      }
      term = s_17567;
      if(r_17566 == null)
        break Fail87659;
      term = r_17566;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}