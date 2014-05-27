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

@SuppressWarnings("all") public class declare_simple_global_0_0 extends Strategy 
{ 
  public static declare_simple_global_0_0 instance = new declare_simple_global_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_simple_global_0_0");
    Fail75878:
    { 
      IStrategoTerm n_92051 = null;
      IStrategoTerm r_92051 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._conssort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail75878;
      n_92051 = term.getSubterm(0);
      r_92051 = term;
      IStrategoTerm term41681 = term;
      Success41605:
      { 
        Fail75879:
        { 
          IStrategoTerm o_92051 = null;
          IStrategoTerm s_92051 = null;
          IStrategoTerm u_92051 = null;
          IStrategoTerm v_92051 = null;
          o_92051 = term;
          u_92051 = term;
          s_92051 = trans.const15522;
          v_92051 = u_92051;
          term = termFactory.makeTuple(trans.const15533, n_92051);
          term = dr_set_rule_0_3.instance.invoke(context, v_92051, s_92051, n_92051, term);
          if(term == null)
            break Fail75879;
          term = o_92051;
          if(true)
            break Success41605;
        }
        term = term41681;
        IStrategoTerm p_92051 = null;
        IStrategoTerm q_92051 = null;
        IStrategoTerm x_92051 = null;
        p_92051 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail75878;
        q_92051 = term;
        x_92051 = p_92051;
        term = report_with_failure_0_2.instance.invoke(context, x_92051, trans.const15534, q_92051);
        if(term == null)
          break Fail75878;
      }
      term = r_92051;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}