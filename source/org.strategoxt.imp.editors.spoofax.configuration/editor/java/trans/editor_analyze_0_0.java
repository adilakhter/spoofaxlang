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
    Fail87711:
    { 
      IStrategoTerm j_17573 = null;
      IStrategoTerm k_17573 = null;
      IStrategoTerm l_17573 = null;
      IStrategoTerm m_17573 = null;
      IStrategoTerm p_17573 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail87711;
      j_17573 = term.getSubterm(0);
      p_17573 = term;
      IStrategoTerm term47310 = term;
      Success47287:
      { 
        Fail87712:
        { 
          term = editor_init_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail87712;
          term = alltd_1_0.instance.invoke(context, j_17573, normalized_spxproject_reference_0_0.instance);
          if(term == null)
            break Fail87712;
          term = collect_all_2_0.instance.invoke(context, term, constraint_error_0_0.instance, conc_0_0.instance);
          if(term == null)
            break Fail87712;
          k_17573 = term;
          l_17573 = trans.constNil14;
          term = trans.constNil14;
          m_17573 = trans.constNil14;
          if(true)
            break Success47287;
        }
        term = term47310;
        IStrategoTerm n_17573 = null;
        IStrategoTerm o_17573 = null;
        IStrategoTerm r_17573 = null;
        n_17573 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail87711;
        o_17573 = term;
        r_17573 = n_17573;
        term = report_with_failure_0_2.instance.invoke(context, r_17573, trans.const17888, o_17573);
        if(term == null)
          break Fail87711;
      }
      term = p_17573;
      if(k_17573 == null || (l_17573 == null || m_17573 == null))
        break Fail87711;
      term = termFactory.makeTuple(j_17573, k_17573, l_17573, m_17573);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}