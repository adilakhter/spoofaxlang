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

@SuppressWarnings("all") final class lifted9910 extends Strategy 
{ 
  public static final lifted9910 instance = new lifted9910();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28113:
    { 
      term = prod_3_0.instance.invoke(context, term, lifted9911.instance, lifted9923.instance, lifted9925.instance);
      if(term == null)
        break Fail28113;
      if(true)
        return term;
    }
    return null;
  }
}