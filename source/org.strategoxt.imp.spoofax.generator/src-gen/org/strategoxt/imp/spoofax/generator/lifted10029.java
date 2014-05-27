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

@SuppressWarnings("all") final class lifted10029 extends Strategy 
{ 
  TermReference k_4422;

  TermReference l_4422;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28013:
    { 
      term = aux_$Pack$S$D$F$Table_0_1.instance.invoke(context, term, k_4422.value);
      if(term == null)
        break Fail28013;
      if(l_4422.value == null)
        l_4422.value = term;
      else
        if(l_4422.value != term && !l_4422.value.match(term))
          break Fail28013;
      if(true)
        return term;
    }
    return null;
  }
}