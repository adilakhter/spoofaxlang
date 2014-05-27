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

@SuppressWarnings("all") public class $No$Completion$Prefix_0_0 extends Strategy 
{ 
  public static $No$Completion$Prefix_0_0 instance = new $No$Completion$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26866:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNoCompletionPrefix_0 != ((IStrategoAppl)term).getConstructor())
        break Fail26866;
      if(true)
        return term;
    }
    context.push("NoCompletionPrefix_0_0");
    context.popOnFailure();
    return null;
  }
}