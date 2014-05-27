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

@SuppressWarnings("all") public class innermost_scope_$Collect$All$Visited_1_0 extends Strategy 
{ 
  public static innermost_scope_$Collect$All$Visited_1_0 instance = new innermost_scope_$Collect$All$Visited_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4480)
  { 
    context.push("innermost_scope_CollectAllVisited_1_0");
    Fail27403:
    { 
      IStrategoTerm q_4480 = null;
      q_4480 = term;
      term = dr_get_first_scope_label_1_1.instance.invoke(context, q_4480, o_4480, generator.const7483);
      if(term == null)
        break Fail27403;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}