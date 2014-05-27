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

@SuppressWarnings("all") public class heuristic_follow_single_child_productions_1_0 extends Strategy 
{ 
  public static heuristic_follow_single_child_productions_1_0 instance = new heuristic_follow_single_child_productions_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4326)
  { 
    context.push("heuristic_follow_single_child_productions_1_0");
    Fail26293:
    { 
      IStrategoTerm m_4326 = null;
      IStrategoTerm n_4326 = null;
      n_4326 = term;
      m_4326 = generator.const7485;
      term = n_4326;
      lifted9454 lifted94540 = new lifted9454();
      lifted94540.k_4326 = k_4326;
      term = dr_scope_1_1.instance.invoke(context, term, lifted94540, m_4326);
      if(term == null)
        break Fail26293;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}