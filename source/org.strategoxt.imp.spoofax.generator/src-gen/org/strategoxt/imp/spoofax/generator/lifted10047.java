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

@SuppressWarnings("all") final class lifted10047 extends Strategy 
{ 
  TermReference u_4430;

  TermReference v_4430;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27995:
    { 
      term = aux_$Descriptor$P$P$Table_0_1.instance.invoke(context, term, u_4430.value);
      if(term == null)
        break Fail27995;
      if(v_4430.value == null)
        v_4430.value = term;
      else
        if(v_4430.value != term && !v_4430.value.match(term))
          break Fail27995;
      if(true)
        return term;
    }
    return null;
  }
}