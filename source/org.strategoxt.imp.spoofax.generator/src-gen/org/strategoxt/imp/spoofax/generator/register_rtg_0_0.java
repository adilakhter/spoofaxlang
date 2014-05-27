package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class register_rtg_0_0 extends Strategy 
{ 
  public static register_rtg_0_0 instance = new register_rtg_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("register_rtg_0_0");
    Fail26278:
    { 
      IStrategoTerm z_4323 = null;
      z_4323 = term;
      IStrategoTerm term10631 = term;
      Success10545:
      { 
        Fail26279:
        { 
          term = list_loop_1_0.instance.invoke(context, term, heuristic_register_production_0_0.instance);
          if(term == null)
            break Fail26279;
          term = verified_start_symbol_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26279;
          if(true)
            break Success10545;
        }
        term = term10631;
        TermReference a_4324 = new TermReference();
        if(a_4324.value == null)
          a_4324.value = term;
        else
          if(a_4324.value != term && !a_4324.value.match(term))
            break Fail26278;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26278;
        lifted9441 lifted94410 = new lifted9441();
        lifted94410.a_4324 = a_4324;
        term = report_failure_1_0.instance.invoke(context, term, lifted94410);
        if(term == null)
          break Fail26278;
      }
      term = z_4323;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}