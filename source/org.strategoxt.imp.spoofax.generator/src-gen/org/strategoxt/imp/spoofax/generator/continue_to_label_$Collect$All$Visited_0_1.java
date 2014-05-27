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

@SuppressWarnings("all") public class continue_to_label_$Collect$All$Visited_0_1 extends Strategy 
{ 
  public static continue_to_label_$Collect$All$Visited_0_1 instance = new continue_to_label_$Collect$All$Visited_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_4480)
  { 
    context.push("continue_to_label_CollectAllVisited_0_1");
    Fail27406:
    { 
      IStrategoTerm y_4480 = null;
      y_4480 = term;
      term = dr_continue_0_2.instance.invoke(context, y_4480, generator.const7483, w_4480);
      if(term == null)
        break Fail27406;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}