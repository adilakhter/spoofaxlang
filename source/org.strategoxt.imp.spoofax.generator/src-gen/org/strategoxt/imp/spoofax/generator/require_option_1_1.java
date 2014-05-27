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

@SuppressWarnings("all") public class require_option_1_1 extends Strategy 
{ 
  public static require_option_1_1 instance = new require_option_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4393, IStrategoTerm t_4393)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("require_option_1_1");
    Fail26738:
    { 
      IStrategoTerm term11149 = term;
      Success10913:
      { 
        Fail26739:
        { 
          term = u_4393.invoke(context, term);
          if(term == null)
            break Fail26739;
          if(true)
            break Success10913;
        }
        term = term11149;
        IStrategoTerm w_4393 = null;
        w_4393 = term;
        term = termFactory.makeTuple(t_4393, generator.const7893);
        term = conc_strings_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail26738;
        term = fatal_err_msg_0_1.instance.invoke(context, w_4393, term);
        if(term == null)
          break Fail26738;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}