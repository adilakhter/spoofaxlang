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

@SuppressWarnings("all") final class lifted9027 extends Strategy 
{ 
  TermReference d_4223;

  TermReference g_4223;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29013:
    { 
      lifted9028 lifted90280 = new lifted9028();
      lifted90280.d_4223 = d_4223;
      lifted90280.g_4223 = g_4223;
      term = say_1_0.instance.invoke(context, term, lifted90280);
      if(term == null)
        break Fail29013;
      if(true)
        return term;
    }
    return null;
  }
}