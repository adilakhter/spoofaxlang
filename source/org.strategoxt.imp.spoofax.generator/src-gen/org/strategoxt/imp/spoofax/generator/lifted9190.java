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

@SuppressWarnings("all") final class lifted9190 extends Strategy 
{ 
  Strategy r_4245;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28873:
    { 
      IStrategoTerm q_4245 = null;
      q_4245 = term;
      term = r_4245.invoke(context, term);
      if(term == null)
        break Fail28873;
      term = q_4245;
      if(true)
        return term;
    }
    return null;
  }
}