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

@SuppressWarnings("all") public class find_start_symbol_0_0 extends Strategy 
{ 
  public static find_start_symbol_0_0 instance = new find_start_symbol_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("find_start_symbol_0_0");
    Fail26245:
    { 
      IStrategoTerm k_4320 = null;
      term = collect_one_1_0.instance.invoke(context, term, lifted9430.instance);
      if(term == null)
        break Fail26245;
      term = try_1_0.instance.invoke(context, term, lifted9431.instance);
      if(term == null)
        break Fail26245;
      term = try_1_0.instance.invoke(context, term, lifted9432.instance);
      if(term == null)
        break Fail26245;
      k_4320 = term;
      term = separate_by_0_1.instance.invoke(context, k_4320, generator.const7071);
      if(term == null)
        break Fail26245;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26245;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}