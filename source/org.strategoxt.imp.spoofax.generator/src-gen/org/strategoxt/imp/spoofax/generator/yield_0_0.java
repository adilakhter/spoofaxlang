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

@SuppressWarnings("all") public class yield_0_0 extends Strategy 
{ 
  public static yield_0_0 instance = new yield_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("yield_0_0");
    Fail25698:
    { 
      l_4249 l_42491 = new l_4249();
      l_4249 l_42490 = new l_4249();
      l_42490.l_4249 = l_42491;
      l_42491.l_4249 = l_42491;
      term = l_42490.invoke(context, term);
      if(term == null)
        break Fail25698;
      term = implode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25698;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}