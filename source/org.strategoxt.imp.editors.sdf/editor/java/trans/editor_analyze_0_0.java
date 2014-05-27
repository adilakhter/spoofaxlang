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

@SuppressWarnings("all") public class editor_analyze_0_0 extends Strategy 
{ 
  public static editor_analyze_0_0 instance = new editor_analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_analyze_0_0");
    Fail75896:
    { 
      IStrategoTerm x_92054 = null;
      IStrategoTerm y_92054 = null;
      IStrategoTerm z_92054 = null;
      IStrategoTerm a_92055 = null;
      IStrategoTerm b_92055 = null;
      IStrategoTerm c_92055 = null;
      IStrategoTerm d_92055 = null;
      IStrategoTerm q_92055 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail75896;
      y_92054 = term.getSubterm(0);
      x_92054 = term.getSubterm(2);
      q_92055 = term;
      IStrategoTerm term41696 = term;
      Success41620:
      { 
        Fail75897:
        { 
          term = editor_init_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75897;
          term = analyze_ast_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail75897;
          term = collect_om_2_0.instance.invoke(context, y_92054, fetch_sdf_errors_0_0.instance, conc_0_0.instance);
          if(term == null)
            break Fail75897;
          a_92055 = term;
          term = collect_om_2_0.instance.invoke(context, y_92054, fetch_sdf_warnings_0_0.instance, conc_0_0.instance);
          if(term == null)
            break Fail75897;
          c_92055 = term;
          Success41621:
          { 
            Fail75898:
            { 
              IStrategoTerm e_92055 = null;
              IStrategoTerm j_92055 = null;
              IStrategoTerm l_92055 = null;
              IStrategoTerm m_92055 = null;
              e_92055 = term;
              term = x_92054;
              IStrategoTerm term41698 = term;
              Success41622:
              { 
                Fail75899:
                { 
                  term = concat_strings_0_0.instance.invoke(context, term);
                  if(term == null)
                    break Fail75899;
                  if(true)
                    break Success41622;
                }
                term = term41698;
                IStrategoTerm term41699 = term;
                Success41623:
                { 
                  Fail75900:
                  { 
                    term = is_string_0_0.instance.invoke(context, term);
                    if(term == null)
                      break Fail75900;
                    if(true)
                      break Success41623;
                  }
                  term = term41699;
                  IStrategoTerm term41700 = term;
                  Success41624:
                  { 
                    Fail75901:
                    { 
                      term = int_to_string_0_0.instance.invoke(context, term);
                      if(term == null)
                        break Fail75901;
                      if(true)
                        break Success41624;
                    }
                    term = term41700;
                    IStrategoTerm term41701 = term;
                    Success41625:
                    { 
                      Fail75902:
                      { 
                        term = real_to_string_0_0.instance.invoke(context, term);
                        if(term == null)
                          break Fail75902;
                        if(true)
                          break Success41625;
                      }
                      term = term41701;
                      IStrategoTerm f_92055 = null;
                      IStrategoTerm g_92055 = null;
                      IStrategoTerm i_92055 = null;
                      f_92055 = term;
                      term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                      if(term == null)
                        break Fail75898;
                      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                        break Fail75898;
                      g_92055 = ((IStrategoList)term).tail();
                      i_92055 = g_92055;
                      term = report_failure_0_2.instance.invoke(context, i_92055, trans.const15543, f_92055);
                      if(term == null)
                        break Fail75898;
                    }
                  }
                }
              }
              l_92055 = term;
              j_92055 = trans.const15453;
              m_92055 = l_92055;
              term = string_replace_0_2.instance.invoke(context, m_92055, j_92055, trans.const15453);
              if(term == null)
                break Fail75898;
              term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constCons7213);
              term = concat_strings_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75898;
              term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75898;
              term = e_92055;
              { 
                term = trans.constNil11;
                z_92054 = trans.constNil11;
                if(true)
                  break Success41621;
              }
            }
            term = collect_om_2_0.instance.invoke(context, y_92054, context_free_syntax_sort_error_0_0.instance, conc_0_0.instance);
            if(term == null)
              break Fail75897;
            z_92054 = term;
          }
          Success41626:
          { 
            Fail75903:
            { 
              IStrategoTerm n_92055 = null;
              n_92055 = term;
              term = $Is$Import$Failed_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail75903;
              term = n_92055;
              { 
                b_92055 = a_92055;
                term = termFactory.makeTuple(z_92054, c_92055);
                term = conc_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail75897;
                d_92055 = term;
                if(true)
                  break Success41626;
              }
            }
            term = termFactory.makeTuple(z_92054, a_92055);
            term = conc_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail75897;
            b_92055 = term;
            term = c_92055;
            d_92055 = c_92055;
          }
          if(true)
            break Success41620;
        }
        term = term41696;
        IStrategoTerm o_92055 = null;
        IStrategoTerm p_92055 = null;
        IStrategoTerm w_92055 = null;
        o_92055 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail75896;
        p_92055 = term;
        w_92055 = o_92055;
        term = report_with_failure_0_2.instance.invoke(context, w_92055, trans.const15545, p_92055);
        if(term == null)
          break Fail75896;
      }
      term = q_92055;
      if(b_92055 == null || d_92055 == null)
        break Fail75896;
      term = termFactory.makeTuple(b_92055, d_92055, trans.constNil11);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}