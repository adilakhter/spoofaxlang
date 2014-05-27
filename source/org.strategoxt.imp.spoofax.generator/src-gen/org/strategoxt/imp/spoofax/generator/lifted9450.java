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

@SuppressWarnings("all") final class lifted9450 extends Strategy 
{ 
  Strategy j_4325;

  Strategy k_4325;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28629:
    { 
      term = heuristic_collect_all_visit_production_2_0.instance.invoke(context, term, j_4325, k_4325);
      if(term == null)
        break Fail28629;
      if(true)
        return term;
    }
    return null;
  }
}