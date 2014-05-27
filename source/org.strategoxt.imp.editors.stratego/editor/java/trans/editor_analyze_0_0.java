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
    Fail23336:
    { 
      IStrategoTerm o_4823 = null;
      IStrategoTerm p_4823 = null;
      IStrategoTerm q_4823 = null;
      IStrategoTerm r_4823 = null;
      IStrategoTerm s_4823 = null;
      IStrategoTerm t_4823 = null;
      IStrategoTerm a_4824 = null;
      IStrategoTerm d_4824 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail23336;
      o_4823 = term.getSubterm(0);
      p_4823 = term.getSubterm(1);
      q_4823 = term.getSubterm(2);
      a_4824 = term;
      IStrategoTerm term12676 = term;
      Success12548:
      { 
        Fail23337:
        { 
          term = try_1_0.instance.invoke(context, term, dr_scope_all_end_0_0.instance);
          if(term == null)
            break Fail23337;
          term = dr_scope_all_start_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23337;
          if(true)
            break Success12548;
        }
        term = term12676;
        IStrategoTerm u_4823 = null;
        IStrategoTerm v_4823 = null;
        IStrategoTerm c_4824 = null;
        u_4823 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23336;
        v_4823 = term;
        c_4824 = u_4823;
        term = report_with_failure_0_2.instance.invoke(context, c_4824, trans.const4659, v_4823);
        if(term == null)
          break Fail23336;
      }
      term = a_4824;
      d_4824 = a_4824;
      IStrategoTerm term12677 = term;
      Success12549:
      { 
        Fail23338:
        { 
          term = termFactory.makeTuple(o_4823, p_4823, q_4823);
          term = analyze_ast_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23338;
          s_4823 = term;
          IStrategoTerm term12678 = term;
          Success12550:
          { 
            Fail23339:
            { 
              IStrategoTerm w_4823 = null;
              w_4823 = term;
              term = $No$Analysis_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail23339;
              term = w_4823;
              { 
                term = collect_all_2_0.instance.invoke(context, s_4823, constraint_error_0_0.instance, conc_0_0.instance);
                if(term == null)
                  break Fail23338;
                r_4823 = term;
                term = collect_all_2_0.instance.invoke(context, s_4823, constraint_warning_0_0.instance, conc_0_0.instance);
                if(term == null)
                  break Fail23338;
                t_4823 = term;
                if(true)
                  break Success12550;
              }
            }
            term = term12678;
            Success12551:
            { 
              Fail23340:
              { 
                IStrategoTerm x_4823 = null;
                x_4823 = term;
                term = $Warn$Analysis_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23340;
                term = x_4823;
                { 
                  term = collect_all_2_0.instance.invoke(context, s_4823, constraint_error_0_0.instance, conc_0_0.instance);
                  if(term == null)
                    break Fail23338;
                  r_4823 = term;
                  term = collect_all_2_0.instance.invoke(context, s_4823, lifted6952.instance, conc_0_0.instance);
                  if(term == null)
                    break Fail23338;
                  t_4823 = term;
                  if(true)
                    break Success12551;
                }
              }
              term = collect_all_2_0.instance.invoke(context, s_4823, lifted6954.instance, conc_0_0.instance);
              if(term == null)
                break Fail23338;
              r_4823 = term;
              term = collect_all_2_0.instance.invoke(context, s_4823, constraint_warning_0_0.instance, conc_0_0.instance);
              if(term == null)
                break Fail23338;
              t_4823 = term;
            }
          }
          if(true)
            break Success12549;
        }
        term = term12677;
        IStrategoTerm y_4823 = null;
        IStrategoTerm z_4823 = null;
        IStrategoTerm f_4824 = null;
        y_4823 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23336;
        z_4823 = term;
        f_4824 = y_4823;
        term = report_with_failure_0_2.instance.invoke(context, f_4824, trans.const4659, z_4823);
        if(term == null)
          break Fail23336;
      }
      term = d_4824;
      if(s_4823 == null || (r_4823 == null || t_4823 == null))
        break Fail23336;
      term = termFactory.makeTuple(s_4823, r_4823, t_4823, trans.constNil4);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}