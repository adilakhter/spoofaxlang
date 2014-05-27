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

@SuppressWarnings("all") final class lifted10182 extends Strategy 
{ 
  TermReference u_4495;

  TermReference v_4495;

  TermReference w_4495;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27860:
    { 
      term = aux_$Production$Visited_0_2.instance.invoke(context, term, u_4495.value, v_4495.value);
      if(term == null)
        break Fail27860;
      if(w_4495.value == null)
        w_4495.value = term;
      else
        if(w_4495.value != term && !w_4495.value.match(term))
          break Fail27860;
      if(true)
        return term;
    }
    return null;
  }
}