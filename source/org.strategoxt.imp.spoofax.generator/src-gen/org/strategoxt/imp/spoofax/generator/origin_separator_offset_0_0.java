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

@SuppressWarnings("all") public class origin_separator_offset_0_0 extends Strategy 
{ 
  public static origin_separator_offset_0_0 instance = new origin_separator_offset_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("origin_separator_offset_0_0");
    Fail25770:
    { 
      IStrategoTerm f_4258 = null;
      IStrategoTerm h_4258 = null;
      term = origin_separator_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25770;
      h_4258 = term;
      term = $Fst_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25770;
      f_4258 = term;
      term = h_4258;
      term = $Snd_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25770;
      term = termFactory.makeTuple(f_4258, term);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}