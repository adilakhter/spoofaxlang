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

@SuppressWarnings("all") public class create_java_strategy_0_0 extends Strategy 
{ 
  public static create_java_strategy_0_0 instance = new create_java_strategy_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_java_strategy_0_0");
    Fail26607:
    { 
      term = create_java_strategy_1_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26607;
      term = create_java_strategy_2_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26607;
      term = create_java_strategy_3_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26607;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}