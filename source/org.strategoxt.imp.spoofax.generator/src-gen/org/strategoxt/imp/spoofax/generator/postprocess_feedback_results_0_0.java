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

@SuppressWarnings("all") public class postprocess_feedback_results_0_0 extends Strategy 
{ 
  public static postprocess_feedback_results_0_0 instance = new postprocess_feedback_results_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("postprocess_feedback_results_0_0");
    Fail25815:
    { 
      IStrategoTerm term10256 = term;
      Success10198:
      { 
        Fail25816:
        { 
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25816;
          if(true)
            break Success10198;
        }
        term = term10256;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)generator.constNil7);
      }
      term = flatten_list_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25815;
      term = map_1_0.instance.invoke(context, term, lifted9257.instance);
      if(term == null)
        break Fail25815;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}