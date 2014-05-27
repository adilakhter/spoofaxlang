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

@SuppressWarnings("all") public class throw_$Follow$Visited_1_1 extends Strategy 
{ 
  public static throw_$Follow$Visited_1_1 instance = new throw_$Follow$Visited_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4484, IStrategoTerm v_4484)
  { 
    context.push("throw_FollowVisited_1_1");
    Fail27431:
    { 
      IStrategoTerm y_4484 = null;
      y_4484 = term;
      term = dr_throw_1_2.instance.invoke(context, y_4484, w_4484, v_4484, generator.const7485);
      if(term == null)
        break Fail27431;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}