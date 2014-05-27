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

@SuppressWarnings("all") final class lifted9714 extends Strategy 
{ 
  public static final lifted9714 instance = new lifted9714();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28241:
    { 
      term = $Cons_2_0.instance.invoke(context, term, lifted9715.instance, lifted9719.instance);
      if(term == null)
        break Fail28241;
      if(true)
        return term;
    }
    return null;
  }
}