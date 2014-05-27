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

@SuppressWarnings("all") final class lifted9245 extends Strategy 
{ 
  TermReference m_4261;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28813:
    { 
      IStrategoTerm s_4261 = null;
      IStrategoTerm u_4261 = null;
      IStrategoTerm v_4261 = null;
      u_4261 = term;
      s_4261 = generator.constCritical0;
      v_4261 = u_4261;
      term = log_0_3.instance.invoke(context, v_4261, s_4261, generator.const7146, m_4261.value);
      if(term == null)
        break Fail28813;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28813;
      if(true)
        return term;
    }
    return null;
  }
}