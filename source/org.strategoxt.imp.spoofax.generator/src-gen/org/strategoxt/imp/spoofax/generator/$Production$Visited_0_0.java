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

@SuppressWarnings("all") public class $Production$Visited_0_0 extends Strategy 
{ 
  public static $Production$Visited_0_0 instance = new $Production$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ProductionVisited_0_0");
    Fail27505:
    { 
      TermReference q_4496 = new TermReference();
      TermReference r_4496 = new TermReference();
      IStrategoTerm v_4496 = null;
      if(r_4496.value == null)
        r_4496.value = term;
      else
        if(r_4496.value != term && !r_4496.value.match(term))
          break Fail27505;
      if(q_4496.value == null)
        q_4496.value = term;
      else
        if(q_4496.value != term && !q_4496.value.match(term))
          break Fail27505;
      v_4496 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, v_4496, generator.const7489, r_4496.value);
      if(term == null)
        break Fail27505;
      lifted10185 lifted101850 = new lifted10185();
      lifted101850.q_4496 = q_4496;
      lifted101850.r_4496 = r_4496;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101850);
      if(term == null)
        break Fail27505;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}