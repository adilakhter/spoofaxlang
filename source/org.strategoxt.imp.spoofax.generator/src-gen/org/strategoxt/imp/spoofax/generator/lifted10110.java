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

@SuppressWarnings("all") final class lifted10110 extends Strategy 
{ 
  TermReference j_4460;

  TermReference k_4460;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27932:
    { 
      term = aux_$Base$Package_0_1.instance.invoke(context, term, j_4460.value);
      if(term == null)
        break Fail27932;
      if(k_4460.value == null)
        k_4460.value = term;
      else
        if(k_4460.value != term && !k_4460.value.match(term))
          break Fail27932;
      if(true)
        return term;
    }
    return null;
  }
}