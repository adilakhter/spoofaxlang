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

@SuppressWarnings("all") public class break_bp_$On$Import$Failure_0_0 extends Strategy 
{ 
  public static break_bp_$On$Import$Failure_0_0 instance = new break_bp_$On$Import$Failure_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("break_bp_OnImportFailure_0_0");
    Fail27352:
    { 
      IStrategoTerm h_4471 = null;
      h_4471 = term;
      term = dr_break_bp_0_1.instance.invoke(context, h_4471, generator.const7458);
      if(term == null)
        break Fail27352;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}