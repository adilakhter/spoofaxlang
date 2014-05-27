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

@SuppressWarnings("all") public class tiny_debug_0_0 extends Strategy 
{ 
  public static tiny_debug_0_0 instance = new tiny_debug_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("tiny_debug_0_0");
    Fail25548:
    { 
      IStrategoTerm x_4235 = null;
      x_4235 = term;
      term = to_tiny_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25548;
      term = debug_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25548;
      term = x_4235;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}