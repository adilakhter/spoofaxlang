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

@SuppressWarnings("all") final class lifted9532 extends Strategy 
{ 
  TermReference x_4393;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28411:
    { 
      IStrategoTerm term11150 = term;
      Success11195:
      { 
        Fail28412:
        { 
          term = generate_spoofaxlang_example_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28412;
          if(true)
            break Success11195;
        }
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term11150, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail28411;
        if(x_4393.value == null)
          x_4393.value = term;
        else
          if(x_4393.value != term && !x_4393.value.match(term))
            break Fail28411;
        term = report_failure_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail28411;
      }
      if(true)
        return term;
    }
    return null;
  }
}