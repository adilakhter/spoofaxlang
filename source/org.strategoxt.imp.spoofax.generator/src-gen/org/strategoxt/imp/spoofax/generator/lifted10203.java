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

@SuppressWarnings("all") final class lifted10203 extends Strategy 
{ 
  TermReference e_4505;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27839:
    { 
      term = aux_$Parse$Table_0_1.instance.invoke(context, term, e_4505.value);
      if(term == null)
        break Fail27839;
      if(true)
        return term;
    }
    return null;
  }
}