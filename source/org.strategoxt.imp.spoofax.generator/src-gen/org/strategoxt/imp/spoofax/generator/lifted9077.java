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

@SuppressWarnings("all") final class lifted9077 extends Strategy 
{ 
  Strategy c_4230;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28958:
    { 
      term = as_string_1_0.instance.invoke(context, term, c_4230);
      if(term == null)
        break Fail28958;
      term = debug_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28958;
      if(true)
        return term;
    }
    return null;
  }
}