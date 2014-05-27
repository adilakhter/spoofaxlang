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

@SuppressWarnings("all") public class $Cached$Parse$Table$Descriptor_0_0 extends Strategy 
{ 
  public static $Cached$Parse$Table$Descriptor_0_0 instance = new $Cached$Parse$Table$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("CachedParseTableDescriptor_0_0");
    Fail27189:
    { 
      TermReference k_4444 = new TermReference();
      IStrategoTerm n_4444 = null;
      IStrategoTerm p_4444 = null;
      IStrategoTerm q_4444 = null;
      if(k_4444.value == null)
        k_4444.value = term;
      else
        if(k_4444.value != term && !k_4444.value.match(term))
          break Fail27189;
      p_4444 = term;
      n_4444 = generator.const7154;
      q_4444 = p_4444;
      term = dr_lookup_rule_0_2.instance.invoke(context, q_4444, n_4444, generator.constCons4561);
      if(term == null)
        break Fail27189;
      lifted10077 lifted100770 = new lifted10077();
      lifted100770.k_4444 = k_4444;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted100770);
      if(term == null)
        break Fail27189;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}