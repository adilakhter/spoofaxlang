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

@SuppressWarnings("all") final class lifted9598 extends Strategy 
{ 
  Strategy c_4412;

  Strategy b_4412;

  Strategy a_4412;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28358:
    { 
      lifted9599 lifted95990 = new lifted9599();
      lifted95990.c_4412 = c_4412;
      lifted95990.b_4412 = b_4412;
      term = $Cons_2_0.instance.invoke(context, term, a_4412, lifted95990);
      if(term == null)
        break Fail28358;
      if(true)
        return term;
    }
    return null;
  }
}