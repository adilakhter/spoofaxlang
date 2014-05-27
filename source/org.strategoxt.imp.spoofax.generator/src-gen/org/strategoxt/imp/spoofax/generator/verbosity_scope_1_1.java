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

@SuppressWarnings("all") public class verbosity_scope_1_1 extends Strategy 
{ 
  public static verbosity_scope_1_1 instance = new verbosity_scope_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4320, IStrategoTerm v_4320)
  { 
    context.push("verbosity_scope_1_1");
    Fail26250:
    { 
      TermReference w_4320 = new TermReference();
      IStrategoTerm x_4320 = null;
      x_4320 = term;
      IStrategoTerm term10611 = term;
      Success10525:
      { 
        Fail26251:
        { 
          term = verbosity_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26251;
          if(w_4320.value == null)
            w_4320.value = term;
          else
            if(w_4320.value != term && !w_4320.value.match(term))
              break Fail26251;
          term = set_verbosity_0_0.instance.invoke(context, v_4320);
          if(term == null)
            break Fail26251;
          if(true)
            break Success10525;
        }
        term = term10611;
        TermReference y_4320 = new TermReference();
        if(y_4320.value == null)
          y_4320.value = term;
        else
          if(y_4320.value != term && !y_4320.value.match(term))
            break Fail26250;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26250;
        lifted9437 lifted94370 = new lifted9437();
        lifted94370.y_4320 = y_4320;
        term = report_failure_1_0.instance.invoke(context, term, lifted94370);
        if(term == null)
          break Fail26250;
      }
      term = x_4320;
      lifted9438 lifted94380 = new lifted9438();
      lifted94380.w_4320 = w_4320;
      term = finally_2_0.instance.invoke(context, term, z_4320, lifted94380);
      if(term == null)
        break Fail26250;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}