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

@SuppressWarnings("all") final class lifted9455 extends Strategy 
{ 
  Strategy k_4326;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28616:
    { 
      l_4326 l_43261 = new l_4326();
      l_43261.k_4326 = k_4326;
      term = l_43261.invoke(context, term);
      if(term == null)
        break Fail28616;
      if(true)
        return term;
    }
    return null;
  }
}