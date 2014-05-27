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

@SuppressWarnings("all") public class match_sort_1_0 extends Strategy 
{ 
  public static match_sort_1_0 instance = new match_sort_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4541)
  { 
    context.push("match_sort_1_0");
    Fail25611:
    { 
      IStrategoTerm term10136 = term;
      Success10103:
      { 
        Fail25612:
        { 
          term = sort_1_0.instance.invoke(context, term, i_4541);
          if(term == null)
            break Fail25612;
          if(true)
            break Success10103;
        }
        term = parameterized_sort_2_0.instance.invoke(context, term10136, i_4541, _Id.instance);
        if(term == null)
          break Fail25611;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}