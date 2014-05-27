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

@SuppressWarnings("all") final class lifted10165 extends Strategy 
{ 
  TermReference x_4487;

  TermReference y_4487;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27877:
    { 
      term = aux_$Follow$Visited_0_2.instance.invoke(context, term, x_4487.value, y_4487.value);
      if(term == null)
        break Fail27877;
      if(true)
        return term;
    }
    return null;
  }
}