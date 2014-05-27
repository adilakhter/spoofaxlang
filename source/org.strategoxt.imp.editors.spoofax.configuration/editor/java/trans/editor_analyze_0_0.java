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

@SuppressWarnings("all") public class editor_analyze_0_0 extends Strategy 
{ 
  public static editor_analyze_0_0 instance = new editor_analyze_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("editor_analyze_0_0");
    Fail22903:
    { 
      IStrategoTerm m_4629 = null;
      IStrategoTerm n_4629 = null;
      IStrategoTerm o_4629 = null;
      IStrategoTerm p_4629 = null;
      IStrategoTerm s_4629 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail22903;
      m_4629 = term.getSubterm(0);
      s_4629 = term;
      IStrategoTerm term12223 = term;
      Success12200:
      { 
        Fail22904:
        { 
          term = editor_init_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22904;
          term = alltd_1_0.instance.invoke(context, m_4629, normalized_spxproject_reference_0_0.instance);
          if(term == null)
            break Fail22904;
          term = collect_all_2_0.instance.invoke(context, term, constraint_error_0_0.instance, conc_0_0.instance);
          if(term == null)
            break Fail22904;
          n_4629 = term;
          o_4629 = trans.constNil4;
          term = trans.constNil4;
          p_4629 = trans.constNil4;
          if(true)
            break Success12200;
        }
        term = term12223;
        IStrategoTerm q_4629 = null;
        IStrategoTerm r_4629 = null;
        IStrategoTerm u_4629 = null;
        q_4629 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail22903;
        r_4629 = term;
        u_4629 = q_4629;
        term = report_with_failure_0_2.instance.invoke(context, u_4629, trans.const4501, r_4629);
        if(term == null)
          break Fail22903;
      }
      term = s_4629;
      if(n_4629 == null || (o_4629 == null || p_4629 == null))
        break Fail22903;
      term = termFactory.makeTuple(m_4629, n_4629, o_4629, p_4629);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}