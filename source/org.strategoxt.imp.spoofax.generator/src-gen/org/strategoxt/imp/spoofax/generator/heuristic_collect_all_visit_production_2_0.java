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

@SuppressWarnings("all") public class heuristic_collect_all_visit_production_2_0 extends Strategy 
{ 
  public static heuristic_collect_all_visit_production_2_0 instance = new heuristic_collect_all_visit_production_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4325, Strategy n_4325)
  { 
    context.push("heuristic_collect_all_visit_production_2_0");
    Fail26291:
    { 
      TermReference l_4325 = new TermReference();
      if(l_4325.value == null)
        l_4325.value = term;
      else
        if(l_4325.value != term && !l_4325.value.match(term))
          break Fail26291;
      term = heuristic_child_sorts_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26291;
      term = filter_1_0.instance.invoke(context, term, n_4325);
      if(term == null)
        break Fail26291;
      lifted9451 lifted94510 = new lifted9451();
      lifted94510.m_4325 = m_4325;
      lifted94510.l_4325 = l_4325;
      term = try_1_0.instance.invoke(context, term, lifted94510);
      if(term == null)
        break Fail26291;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}