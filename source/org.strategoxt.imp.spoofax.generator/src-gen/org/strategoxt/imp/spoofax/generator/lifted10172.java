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

@SuppressWarnings("all") final class lifted10172 extends Strategy 
{ 
  TermReference k_4491;

  TermReference l_4491;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27870:
    { 
      term = aux_$Follow$Success_0_2.instance.invoke(context, term, k_4491.value, l_4491.value);
      if(term == null)
        break Fail27870;
      if(true)
        return term;
    }
    return null;
  }
}