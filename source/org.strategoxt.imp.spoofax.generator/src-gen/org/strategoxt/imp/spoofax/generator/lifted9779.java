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

@SuppressWarnings("all") final class lifted9779 extends Strategy 
{ 
  Strategy k_4412;

  Strategy j_4412;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28213:
    { 
      lifted9780 lifted97800 = new lifted9780();
      lifted97800.k_4412 = k_4412;
      term = $Cons_2_0.instance.invoke(context, term, j_4412, lifted97800);
      if(term == null)
        break Fail28213;
      if(true)
        return term;
    }
    return null;
  }
}