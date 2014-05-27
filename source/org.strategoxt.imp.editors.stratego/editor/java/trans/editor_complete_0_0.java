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
    Fail21865:
    { 
      IStrategoTerm u_4270 = null;
      IStrategoTerm v_4270 = null;
      IStrategoTerm y_4270 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail21865;
      u_4270 = term.getSubterm(2);
      y_4270 = term;
      IStrategoTerm term11973 = term;
      Success11843:
      { 
        Fail21866:
        { 
          term = topdown_1_0.instance.invoke(context, u_4270, lifted6687.instance);
          if(term == null)
            break Fail21866;
          term = analyze_ast_local_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21866;
          term = $Content$Proposals_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21866;
          v_4270 = term;
          if(true)
            break Success11843;
        }
        term = term11973;
        IStrategoTerm w_4270 = null;
        IStrategoTerm x_4270 = null;
        IStrategoTerm c_4271 = null;
        w_4270 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail21865;
        x_4270 = term;
        c_4271 = w_4270;
        term = report_with_failure_0_2.instance.invoke(context, c_4271, trans.const4450, x_4270);
        if(term == null)
          break Fail21865;
      }
      term = y_4270;
      if(v_4270 == null)
        break Fail21865;
      term = v_4270;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}