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

@SuppressWarnings("all") final class lifted9441 extends Strategy 
{ 
  TermReference a_4324;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28639:
    { 
      IStrategoTerm b_4324 = null;
      IStrategoTerm d_4324 = null;
      IStrategoTerm e_4324 = null;
      d_4324 = term;
      b_4324 = generator.constCritical0;
      e_4324 = d_4324;
      term = log_0_3.instance.invoke(context, e_4324, b_4324, generator.const7477, a_4324.value);
      if(term == null)
        break Fail28639;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28639;
      if(true)
        return term;
    }
    return null;
  }
}