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

@SuppressWarnings("all") public class $Base$Package_0_0 extends Strategy 
{ 
  public static $Base$Package_0_0 instance = new $Base$Package_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("BasePackage_0_0");
    Fail27293:
    { 
      TermReference i_4461 = new TermReference();
      IStrategoTerm l_4461 = null;
      IStrategoTerm n_4461 = null;
      IStrategoTerm o_4461 = null;
      if(i_4461.value == null)
        i_4461.value = term;
      else
        if(i_4461.value != term && !i_4461.value.match(term))
          break Fail27293;
      n_4461 = term;
      l_4461 = generator.const7448;
      o_4461 = n_4461;
      term = dr_lookup_rule_0_2.instance.invoke(context, o_4461, l_4461, generator.constCons4561);
      if(term == null)
        break Fail27293;
      lifted10113 lifted101130 = new lifted10113();
      lifted101130.i_4461 = i_4461;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted101130);
      if(term == null)
        break Fail27293;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}