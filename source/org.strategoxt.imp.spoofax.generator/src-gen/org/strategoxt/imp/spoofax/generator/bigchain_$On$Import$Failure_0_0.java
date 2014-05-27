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

@SuppressWarnings("all") public class bigchain_$On$Import$Failure_0_0 extends Strategy 
{ 
  public static bigchain_$On$Import$Failure_0_0 instance = new bigchain_$On$Import$Failure_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_OnImportFailure_0_0");
    Fail27360:
    { 
      IStrategoTerm v_4472 = null;
      IStrategoTerm x_4472 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27360;
      x_4472 = term;
      Success11081:
      { 
        Fail27361:
        { 
          IStrategoTerm y_4472 = null;
          IStrategoTerm a_4473 = null;
          IStrategoTerm b_4473 = null;
          a_4473 = term;
          y_4472 = generator.const7458;
          b_4473 = a_4473;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, b_4473, y_4472, generator.const7459);
          if(term == null)
            break Fail27361;
          if(true)
            break Success11081;
        }
        term = generator.constNil7;
      }
      v_4472 = term;
      term = x_4472;
      term = termFactory.makeTuple(v_4472, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10134.instance);
      if(term == null)
        break Fail27360;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}