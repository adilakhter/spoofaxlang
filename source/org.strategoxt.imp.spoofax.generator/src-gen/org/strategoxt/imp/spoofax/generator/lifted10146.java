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

@SuppressWarnings("all") final class lifted10146 extends Strategy 
{ 
  TermReference i_4479;

  TermReference j_4479;

  TermReference k_4479;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27896:
    { 
      term = aux_$Productions_0_2.instance.invoke(context, term, i_4479.value, j_4479.value);
      if(term == null)
        break Fail27896;
      if(k_4479.value == null)
        k_4479.value = term;
      else
        if(k_4479.value != term && !k_4479.value.match(term))
          break Fail27896;
      if(true)
        return term;
    }
    return null;
  }
}