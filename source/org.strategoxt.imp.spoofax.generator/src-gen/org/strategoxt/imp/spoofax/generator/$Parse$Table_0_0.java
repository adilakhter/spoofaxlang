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

@SuppressWarnings("all") public class $Parse$Table_0_0 extends Strategy 
{ 
  public static $Parse$Table_0_0 instance = new $Parse$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("ParseTable_0_0");
    Fail27557:
    { 
      TermReference e_4505 = new TermReference();
      IStrategoTerm h_4505 = null;
      IStrategoTerm j_4505 = null;
      IStrategoTerm k_4505 = null;
      if(e_4505.value == null)
        e_4505.value = term;
      else
        if(e_4505.value != term && !e_4505.value.match(term))
          break Fail27557;
      j_4505 = term;
      h_4505 = generator.const7871;
      k_4505 = j_4505;
      term = dr_lookup_rule_0_2.instance.invoke(context, k_4505, h_4505, generator.constCons4561);
      if(term == null)
        break Fail27557;
      lifted10203 lifted102030 = new lifted10203();
      lifted102030.e_4505 = e_4505;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted102030);
      if(term == null)
        break Fail27557;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}