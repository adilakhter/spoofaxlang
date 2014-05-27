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

@SuppressWarnings("all") public class sort2nonterm_0_0 extends Strategy 
{ 
  public static sort2nonterm_0_0 instance = new sort2nonterm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sort2nonterm_0_0");
    Fail25671:
    { 
      IStrategoTerm term10179 = term;
      IStrategoConstructor cons336 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10144:
      { 
        if(cons336 == SpoofaxGenerator._conssort_1)
        { 
          Fail25672:
          { 
            IStrategoTerm n_4245 = null;
            n_4245 = term.getSubterm(0);
            term = termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{n_4245});
            if(true)
              break Success10144;
          }
          term = term10179;
        }
        if(cons336 == SpoofaxGenerator._consparameterized_sort_2)
        { 
          term = $Symbol2$String_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail25671;
          term = termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term});
        }
        else
        { 
          break Fail25671;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}