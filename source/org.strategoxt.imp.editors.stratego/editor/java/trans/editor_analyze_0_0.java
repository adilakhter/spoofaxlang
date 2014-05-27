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

@SuppressWarnings("all") public class editor_analyze_0_0 extends Strategy 
{ 
  public static editor_analyze_0_0 instance = new editor_analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_analyze_0_0");
    Fail21860:
    { 
      IStrategoTerm w_4269 = null;
      IStrategoTerm x_4269 = null;
      IStrategoTerm y_4269 = null;
      IStrategoTerm z_4269 = null;
      IStrategoTerm a_4270 = null;
      IStrategoTerm b_4270 = null;
      IStrategoTerm i_4270 = null;
      IStrategoTerm l_4270 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail21860;
      w_4269 = term.getSubterm(0);
      x_4269 = term.getSubterm(1);
      y_4269 = term.getSubterm(2);
      i_4270 = term;
      IStrategoTerm term11967 = term;
      Success11839:
      { 
        Fail21861:
        { 
          term = try_1_0.instance.invoke(context, term, dr_scope_all_end_0_0.instance);
          if(term == null)
            break Fail21861;
          term = dr_scope_all_start_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21861;
          if(true)
            break Success11839;
        }
        term = term11967;
        IStrategoTerm c_4270 = null;
        IStrategoTerm d_4270 = null;
        IStrategoTerm k_4270 = null;
        c_4270 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21860;
        d_4270 = term;
        k_4270 = c_4270;
        term = report_with_failure_0_2.instance.invoke(context, k_4270, trans.const4449, d_4270);
        if(term == null)
          break Fail21860;
      }
      term = i_4270;
      l_4270 = i_4270;
      IStrategoTerm term11968 = term;
      Success11840:
      { 
        Fail21862:
        { 
          term = termFactory.makeTuple(w_4269, x_4269, y_4269);
          term = analyze_ast_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21862;
          a_4270 = term;
          IStrategoTerm term11969 = term;
          Success11841:
          { 
            Fail21863:
            { 
              IStrategoTerm e_4270 = null;
              e_4270 = term;
              term = $No$Analysis_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21863;
              term = e_4270;
              { 
                term = collect_all_2_0.instance.invoke(context, a_4270, constraint_error_0_0.instance, conc_0_0.instance);
                if(term == null)
                  break Fail21862;
                z_4269 = term;
                term = collect_all_2_0.instance.invoke(context, a_4270, constraint_warning_0_0.instance, conc_0_0.instance);
                if(term == null)
                  break Fail21862;
                b_4270 = term;
                if(true)
                  break Success11841;
              }
            }
            term = term11969;
            Success11842:
            { 
              Fail21864:
              { 
                IStrategoTerm f_4270 = null;
                f_4270 = term;
                term = $Warn$Analysis_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21864;
                term = f_4270;
                { 
                  term = collect_all_2_0.instance.invoke(context, a_4270, constraint_error_0_0.instance, conc_0_0.instance);
                  if(term == null)
                    break Fail21862;
                  z_4269 = term;
                  term = collect_all_2_0.instance.invoke(context, a_4270, lifted6681.instance, conc_0_0.instance);
                  if(term == null)
                    break Fail21862;
                  b_4270 = term;
                  if(true)
                    break Success11842;
                }
              }
              term = collect_all_2_0.instance.invoke(context, a_4270, lifted6683.instance, conc_0_0.instance);
              if(term == null)
                break Fail21862;
              z_4269 = term;
              term = collect_all_2_0.instance.invoke(context, a_4270, constraint_warning_0_0.instance, conc_0_0.instance);
              if(term == null)
                break Fail21862;
              b_4270 = term;
            }
          }
          if(true)
            break Success11840;
        }
        term = term11968;
        IStrategoTerm g_4270 = null;
        IStrategoTerm h_4270 = null;
        IStrategoTerm n_4270 = null;
        g_4270 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21860;
        h_4270 = term;
        n_4270 = g_4270;
        term = report_with_failure_0_2.instance.invoke(context, n_4270, trans.const4449, h_4270);
        if(term == null)
          break Fail21860;
      }
      term = l_4270;
      if(a_4270 == null || (z_4269 == null || b_4270 == null))
        break Fail21860;
      term = termFactory.makeTuple(a_4270, z_4269, b_4270, trans.constNil3);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}