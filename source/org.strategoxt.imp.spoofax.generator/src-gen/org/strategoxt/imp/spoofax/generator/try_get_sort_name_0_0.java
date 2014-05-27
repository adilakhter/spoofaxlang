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

@SuppressWarnings("all") public class try_get_sort_name_0_0 extends Strategy 
{ 
  public static try_get_sort_name_0_0 instance = new try_get_sort_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("try_get_sort_name_0_0");
    Fail26272:
    { 
      IStrategoTerm i_4323 = null;
      term = parameterized_sort_to_rtg_sort_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail26272;
      i_4323 = term;
      IStrategoTerm term10628 = term;
      Success10542:
      { 
        Fail26273:
        { 
          term = $Productions_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26273;
          if(true)
            break Success10542;
        }
        term = term10628;
        IStrategoTerm k_4323 = null;
        k_4323 = term;
        term = fatal_err_0_1.instance.invoke(context, k_4323, generator.const7474);
        if(term == null)
          break Fail26272;
        if(true)
          break Fail26272;
      }
      term = i_4323;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}