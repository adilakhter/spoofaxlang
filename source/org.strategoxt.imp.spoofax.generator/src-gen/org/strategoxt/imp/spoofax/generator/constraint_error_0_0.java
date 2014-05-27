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

@SuppressWarnings("all") public class constraint_error_0_0 extends Strategy 
{ 
  public static constraint_error_0_0 instance = new constraint_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("constraint_error_0_0");
    Fail26276:
    { 
      IStrategoTerm w_4323 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSort_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26276;
      w_4323 = term;
      IStrategoTerm term10630 = term;
      Success10544:
      { 
        Fail26277:
        { 
          term = parameterized_sort_to_rtg_sort_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26277;
          term = $Productions_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26277;
          { 
            if(true)
              break Fail26276;
            if(true)
              break Success10544;
          }
        }
        term = term10630;
      }
      term = w_4323;
      term = termFactory.makeAppl(SpoofaxGenerator._consError_2, new IStrategoTerm[]{term, generator.const7476});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}