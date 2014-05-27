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

@SuppressWarnings("all") final class lifted9963 extends Strategy 
{ 
  public static final lifted9963 instance = new lifted9963();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28082:
    { 
      term = $Id_1_0.instance.invoke(context, term, lifted9964.instance);
      if(term == null)
        break Fail28082;
      if(true)
        return term;
    }
    return null;
  }
}