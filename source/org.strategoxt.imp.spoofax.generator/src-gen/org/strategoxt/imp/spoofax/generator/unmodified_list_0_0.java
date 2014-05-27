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

@SuppressWarnings("all") public class unmodified_list_0_0 extends Strategy 
{ 
  public static unmodified_list_0_0 instance = new unmodified_list_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("unmodified_list_0_0");
    Fail25909:
    { 
      IStrategoTerm g_4277 = null;
      IStrategoTerm h_4277 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25909;
      g_4277 = term.getSubterm(0);
      h_4277 = term.getSubterm(1);
      term = termFactory.makeTuple(g_4277, h_4277);
      term = zip_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25909;
      term = map_1_0.instance.invoke(context, term, lifted9295.instance);
      if(term == null)
        break Fail25909;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}