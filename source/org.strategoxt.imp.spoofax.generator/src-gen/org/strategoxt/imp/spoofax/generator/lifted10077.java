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

@SuppressWarnings("all") final class lifted10077 extends Strategy 
{ 
  TermReference k_4444;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27965:
    { 
      term = aux_$Cached$Parse$Table$Descriptor_0_1.instance.invoke(context, term, k_4444.value);
      if(term == null)
        break Fail27965;
      if(true)
        return term;
    }
    return null;
  }
}