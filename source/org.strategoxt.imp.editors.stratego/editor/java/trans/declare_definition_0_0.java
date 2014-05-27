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

@SuppressWarnings("all") public class declare_definition_0_0 extends Strategy 
{ 
  public static declare_definition_0_0 instance = new declare_definition_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_definition_0_0");
    Fail23069:
    { 
      IStrategoTerm a_4775 = null;
      IStrategoTerm b_4775 = null;
      IStrategoTerm c_4775 = null;
      IStrategoTerm i_4775 = null;
      c_4775 = term;
      i_4775 = term;
      IStrategoTerm term12397 = term;
      Success12322:
      { 
        Fail23070:
        { 
          term = signature_of_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23070;
          a_4775 = term;
          IStrategoTerm term12398 = term;
          Success12323:
          { 
            Fail23071:
            { 
              IStrategoTerm d_4775 = null;
              d_4775 = term;
              IStrategoTerm term12399 = term;
              Success12324:
              { 
                Fail23072:
                { 
                  term = $Declare$Cookie_0_0.instance.invoke(context, a_4775);
                  if(term == null)
                    break Fail23072;
                  b_4775 = term;
                  { 
                    if(true)
                      break Fail23071;
                    if(true)
                      break Success12324;
                  }
                }
                term = term12399;
              }
              term = d_4775;
              { 
                IStrategoTerm e_4775 = null;
                IStrategoTerm n_4775 = null;
                IStrategoTerm p_4775 = null;
                IStrategoTerm q_4775 = null;
                IStrategoTerm f_4775 = null;
                IStrategoTerm r_4775 = null;
                IStrategoTerm t_4775 = null;
                IStrategoTerm u_4775 = null;
                term = newterm_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail23070;
                if(b_4775 == null)
                  b_4775 = term;
                else
                  if(b_4775 != term && !b_4775.match(term))
                    break Fail23070;
                e_4775 = term;
                p_4775 = term;
                n_4775 = trans.const4568;
                q_4775 = p_4775;
                term = termFactory.makeTuple(trans.const4569, b_4775);
                term = dr_set_rule_0_3.instance.invoke(context, q_4775, n_4775, a_4775, term);
                if(term == null)
                  break Fail23070;
                term = e_4775;
                f_4775 = e_4775;
                t_4775 = term;
                r_4775 = trans.const4570;
                u_4775 = t_4775;
                term = termFactory.makeTuple(trans.const4571, c_4775);
                term = dr_set_rule_0_3.instance.invoke(context, u_4775, r_4775, b_4775, term);
                if(term == null)
                  break Fail23070;
                term = f_4775;
                if(true)
                  break Success12323;
              }
            }
            term = term12398;
          }
          if(true)
            break Success12322;
        }
        term = term12397;
        IStrategoTerm g_4775 = null;
        IStrategoTerm h_4775 = null;
        IStrategoTerm w_4775 = null;
        g_4775 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23069;
        h_4775 = term;
        w_4775 = g_4775;
        term = report_with_failure_0_2.instance.invoke(context, w_4775, trans.const4572, h_4775);
        if(term == null)
          break Fail23069;
      }
      term = i_4775;
      if(b_4775 == null)
        break Fail23069;
      term = b_4775;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}