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

@SuppressWarnings("all") public class $Is$Imported_0_0 extends Strategy 
{ 
  public static $Is$Imported_0_0 instance = new $Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("IsImported_0_0");
    Fail27163:
    { 
      TermReference d_4440 = new TermReference();
      TermReference e_4440 = new TermReference();
      IStrategoTerm i_4440 = null;
      if(e_4440.value == null)
        e_4440.value = term;
      else
        if(e_4440.value != term && !e_4440.value.match(term))
          break Fail27163;
      if(d_4440.value == null)
        d_4440.value = term;
      else
        if(d_4440.value != term && !d_4440.value.match(term))
          break Fail27163;
      i_4440 = term;
      term = dr_lookup_rule_0_2.instance.invoke(context, i_4440, generator.const7145, e_4440.value);
      if(term == null)
        break Fail27163;
      lifted10068 lifted100680 = new lifted10068();
      lifted100680.d_4440 = d_4440;
      lifted100680.e_4440 = e_4440;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted100680);
      if(term == null)
        break Fail27163;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}