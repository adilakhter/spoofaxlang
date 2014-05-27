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

@SuppressWarnings("all") public class heuristic_follow_single_child_productions1_1_0 extends Strategy 
{ 
  public static heuristic_follow_single_child_productions1_1_0 instance = new heuristic_follow_single_child_productions1_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4325)
  { 
    context.push("heuristic_follow_single_child_productions1_1_0");
    Fail26292:
    { 
      IStrategoTerm x_4325 = null;
      IStrategoTerm y_4325 = null;
      y_4325 = term;
      x_4325 = generator.const7485;
      term = y_4325;
      lifted9452 lifted94520 = new lifted9452();
      lifted94520.v_4325 = v_4325;
      term = dr_scope_1_1.instance.invoke(context, term, lifted94520, x_4325);
      if(term == null)
        break Fail26292;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}