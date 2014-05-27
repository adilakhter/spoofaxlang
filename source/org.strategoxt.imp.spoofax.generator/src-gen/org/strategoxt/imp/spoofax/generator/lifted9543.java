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

@SuppressWarnings("all") final class lifted9543 extends Strategy 
{ 
  TermReference i_4399;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28400:
    { 
      IStrategoTerm t_4400 = null;
      IStrategoTerm v_4400 = null;
      IStrategoTerm w_4400 = null;
      v_4400 = term;
      t_4400 = generator.constCritical0;
      w_4400 = v_4400;
      term = log_0_3.instance.invoke(context, w_4400, t_4400, generator.const7918, i_4399.value);
      if(term == null)
        break Fail28400;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28400;
      if(true)
        return term;
    }
    return null;
  }
}