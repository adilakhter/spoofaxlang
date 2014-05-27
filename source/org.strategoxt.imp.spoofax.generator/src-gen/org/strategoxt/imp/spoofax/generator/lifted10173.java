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

@SuppressWarnings("all") final class lifted10173 extends Strategy 
{ 
  TermReference r_4491;

  TermReference s_4491;

  TermReference t_4491;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27869:
    { 
      term = aux_$Follow$Success_0_2.instance.invoke(context, term, r_4491.value, s_4491.value);
      if(term == null)
        break Fail27869;
      if(t_4491.value == null)
        t_4491.value = term;
      else
        if(t_4491.value != term && !t_4491.value.match(term))
          break Fail27869;
      if(true)
        return term;
    }
    return null;
  }
}