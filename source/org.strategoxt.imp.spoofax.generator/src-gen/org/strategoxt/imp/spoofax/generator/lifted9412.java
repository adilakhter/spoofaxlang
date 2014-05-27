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

@SuppressWarnings("all") final class lifted9412 extends Strategy 
{ 
  TermReference r_4316;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28666:
    { 
      IStrategoTerm s_4317 = null;
      IStrategoTerm u_4317 = null;
      IStrategoTerm v_4317 = null;
      u_4317 = term;
      s_4317 = generator.constCritical0;
      v_4317 = u_4317;
      term = log_0_3.instance.invoke(context, v_4317, s_4317, generator.const7439, r_4316.value);
      if(term == null)
        break Fail28666;
      term = exit_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28666;
      if(true)
        return term;
    }
    return null;
  }
}