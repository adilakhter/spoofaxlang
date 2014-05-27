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

@SuppressWarnings("all") public class $Follow$Visited_0_0 extends Strategy 
{ 
  public static $Follow$Visited_0_0 instance = new $Follow$Visited_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("FollowVisited_0_0");
    Fail27453:
    { 
      TermReference k_4488 = new TermReference();
      TermReference l_4488 = new TermReference();
      IStrategoTerm p_4488 = null;
      if(l_4488.value == null)
        l_4488.value = term;
      else
        if(l_4488.value != term && !l_4488.value.match(term))
          break Fail27453;
      if(k_4488.value == null)
        k_4488.value = term;
      else
        if(k_4488.value != term && !k_4488.value.match(term))
          break Fail27453;
      p_4488 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, p_4488, generator.const7485, l_4488.value);
      if(term == null)
        break Fail27453;
      lifted10167 lifted101670 = new lifted10167();
      lifted101670.k_4488 = k_4488;
      lifted101670.l_4488 = l_4488;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101670);
      if(term == null)
        break Fail27453;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}