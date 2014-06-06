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

@SuppressWarnings("all") public class keyword_to_completion_rule_0_0 extends Strategy 
{ 
  public static keyword_to_completion_rule_0_0 instance = new keyword_to_completion_rule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail26187:
    { 
      term = termFactory.makeAppl(SpoofaxGenerator._consCompletionKeyword_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consString_1, new IStrategoTerm[]{term}), generator.constNone0});
      if(true)
        return term;
    }
    context.push("keyword_to_completion_rule_0_0");
    context.popOnFailure();
    return null;
  }
}