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

@SuppressWarnings("all") final class lifted10154 extends Strategy 
{ 
  TermReference e_4483;

  TermReference f_4483;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27888:
    { 
      term = aux_$Collect$All$Visited_0_2.instance.invoke(context, term, e_4483.value, f_4483.value);
      if(term == null)
        break Fail27888;
      if(true)
        return term;
    }
    return null;
  }
}