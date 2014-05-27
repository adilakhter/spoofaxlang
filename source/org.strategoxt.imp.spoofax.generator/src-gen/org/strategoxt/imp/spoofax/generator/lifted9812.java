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

@SuppressWarnings("all") final class lifted9812 extends Strategy 
{ 
  Strategy s_4412;

  Strategy r_4412;

  Strategy q_4412;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28187:
    { 
      lifted9813 lifted98130 = new lifted9813();
      lifted98130.s_4412 = s_4412;
      lifted98130.r_4412 = r_4412;
      term = $Cons_2_0.instance.invoke(context, term, q_4412, lifted98130);
      if(term == null)
        break Fail28187;
      if(true)
        return term;
    }
    return null;
  }
}