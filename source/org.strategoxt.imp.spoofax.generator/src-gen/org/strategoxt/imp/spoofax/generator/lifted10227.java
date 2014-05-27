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

@SuppressWarnings("all") final class lifted10227 extends Strategy 
{ 
  TermReference j_4517;

  TermReference k_4517;

  TermReference l_4517;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27815:
    { 
      term = aux_$New$Project_0_2.instance.invoke(context, term, j_4517.value, k_4517.value);
      if(term == null)
        break Fail27815;
      if(l_4517.value == null)
        l_4517.value = term;
      else
        if(l_4517.value != term && !l_4517.value.match(term))
          break Fail27815;
      if(true)
        return term;
    }
    return null;
  }
}