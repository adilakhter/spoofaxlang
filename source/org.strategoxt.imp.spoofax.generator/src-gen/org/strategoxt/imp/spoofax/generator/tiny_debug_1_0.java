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

@SuppressWarnings("all") public class tiny_debug_1_0 extends Strategy 
{ 
  public static tiny_debug_1_0 instance = new tiny_debug_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4235)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("tiny_debug_1_0");
    Fail25549:
    { 
      IStrategoTerm y_4235 = null;
      IStrategoTerm a_4236 = null;
      IStrategoTerm c_4236 = null;
      y_4235 = term;
      c_4236 = term;
      term = as_string_1_0.instance.invoke(context, term, z_4235);
      if(term == null)
        break Fail25549;
      a_4236 = term;
      term = c_4236;
      term = to_tiny_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25549;
      term = termFactory.makeTuple(a_4236, term);
      term = conc_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25549;
      term = debug_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25549;
      term = y_4235;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}