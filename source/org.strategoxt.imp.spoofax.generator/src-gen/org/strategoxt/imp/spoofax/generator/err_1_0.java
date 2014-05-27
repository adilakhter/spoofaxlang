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

@SuppressWarnings("all") public class err_1_0 extends Strategy 
{ 
  public static err_1_0 instance = new err_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4245)
  { 
    context.push("err_1_0");
    Fail25677:
    { 
      IStrategoTerm t_4245 = null;
      IStrategoTerm u_4245 = null;
      IStrategoTerm w_4245 = null;
      IStrategoTerm x_4245 = null;
      IStrategoTerm y_4245 = null;
      w_4245 = term;
      t_4245 = generator.constError0;
      x_4245 = w_4245;
      term = s_4245.invoke(context, generator.const6968);
      if(term == null)
        break Fail25677;
      u_4245 = term;
      term = x_4245;
      y_4245 = x_4245;
      term = log_0_3.instance.invoke(context, y_4245, t_4245, u_4245, term);
      if(term == null)
        break Fail25677;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}