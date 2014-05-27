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

@SuppressWarnings("all") public class verify_2_0 extends Strategy 
{ 
  public static verify_2_0 instance = new verify_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4234, Strategy v_4234)
  { 
    context.push("verify_2_0");
    Fail25544:
    { 
      IStrategoTerm term10091 = term;
      Success10069:
      { 
        Fail25545:
        { 
          term = u_4234.invoke(context, term);
          if(term == null)
            break Fail25545;
          if(true)
            break Success10069;
        }
        term = term10091;
        IStrategoTerm w_4234 = null;
        IStrategoTerm x_4234 = null;
        IStrategoTerm z_4234 = null;
        IStrategoTerm a_4235 = null;
        IStrategoTerm d_4235 = null;
        z_4234 = term;
        w_4234 = generator.constCritical0;
        term = z_4234;
        a_4235 = z_4234;
        term = as_string_1_0.instance.invoke(context, term, v_4234);
        if(term == null)
          break Fail25544;
        x_4234 = term;
        term = a_4235;
        d_4235 = a_4235;
        term = log_0_3.instance.invoke(context, d_4235, w_4234, x_4234, term);
        if(term == null)
          break Fail25544;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail25544;
        term = report_failure_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail25544;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}