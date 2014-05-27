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

@SuppressWarnings("all") final class lifted9649 extends Strategy 
{ 
  Strategy g_4412;

  Strategy f_4412;

  Strategy e_4412;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28318:
    { 
      lifted9650 lifted96500 = new lifted9650();
      lifted96500.g_4412 = g_4412;
      lifted96500.f_4412 = f_4412;
      term = $Cons_2_0.instance.invoke(context, term, e_4412, lifted96500);
      if(term == null)
        break Fail28318;
      if(true)
        return term;
    }
    return null;
  }
}