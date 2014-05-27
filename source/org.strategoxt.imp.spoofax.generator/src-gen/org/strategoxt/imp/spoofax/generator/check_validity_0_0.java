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

@SuppressWarnings("all") public class check_validity_0_0 extends Strategy 
{ 
  public static check_validity_0_0 instance = new check_validity_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("check_validity_0_0");
    Fail26274:
    { 
      IStrategoTerm o_4323 = null;
      IStrategoTerm r_4323 = null;
      r_4323 = term;
      IStrategoTerm term10629 = term;
      Success10543:
      { 
        Fail26275:
        { 
          term = collect_all_1_0.instance.invoke(context, term, constraint_error_0_0.instance);
          if(term == null)
            break Fail26275;
          o_4323 = term;
          if(true)
            break Success10543;
        }
        term = term10629;
        IStrategoTerm p_4323 = null;
        IStrategoTerm q_4323 = null;
        IStrategoTerm v_4323 = null;
        p_4323 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail26274;
        q_4323 = term;
        v_4323 = p_4323;
        term = report_with_failure_0_2.instance.invoke(context, v_4323, generator.const7475, q_4323);
        if(term == null)
          break Fail26274;
      }
      term = r_4323;
      if(o_4323 == null)
        break Fail26274;
      term = o_4323;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}