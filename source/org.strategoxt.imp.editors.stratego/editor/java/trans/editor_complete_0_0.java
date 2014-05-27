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

@SuppressWarnings("all") public class editor_complete_0_0 extends Strategy 
{ 
  public static editor_complete_0_0 instance = new editor_complete_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("editor_complete_0_0");
    Fail23341:
    { 
      IStrategoTerm m_4824 = null;
      IStrategoTerm n_4824 = null;
      IStrategoTerm q_4824 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail23341;
      m_4824 = term.getSubterm(2);
      q_4824 = term;
      IStrategoTerm term12682 = term;
      Success12552:
      { 
        Fail23342:
        { 
          term = topdown_1_0.instance.invoke(context, m_4824, lifted6958.instance);
          if(term == null)
            break Fail23342;
          term = analyze_ast_local_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23342;
          term = $Content$Proposals_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail23342;
          n_4824 = term;
          if(true)
            break Success12552;
        }
        term = term12682;
        IStrategoTerm o_4824 = null;
        IStrategoTerm p_4824 = null;
        IStrategoTerm u_4824 = null;
        o_4824 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23341;
        p_4824 = term;
        u_4824 = o_4824;
        term = report_with_failure_0_2.instance.invoke(context, u_4824, trans.const4660, p_4824);
        if(term == null)
          break Fail23341;
      }
      term = q_4824;
      if(n_4824 == null)
        break Fail23341;
      term = n_4824;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}