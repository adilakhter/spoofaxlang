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

@SuppressWarnings("all") public class heuristic_collect_all_visit_sort_2_0 extends Strategy 
{ 
  public static heuristic_collect_all_visit_sort_2_0 instance = new heuristic_collect_all_visit_sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4325, Strategy k_4325)
  { 
    context.push("heuristic_collect_all_visit_sort_2_0");
    Fail26290:
    { 
      term = bagof_$Productions_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26290;
      lifted9450 lifted94500 = new lifted9450();
      lifted94500.j_4325 = j_4325;
      lifted94500.k_4325 = k_4325;
      term = map_1_0.instance.invoke(context, term, lifted94500);
      if(term == null)
        break Fail26290;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}