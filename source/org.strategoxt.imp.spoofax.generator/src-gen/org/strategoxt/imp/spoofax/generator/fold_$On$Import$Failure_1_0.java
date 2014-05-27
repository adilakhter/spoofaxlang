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

@SuppressWarnings("all") public class fold_$On$Import$Failure_1_0 extends Strategy 
{ 
  public static fold_$On$Import$Failure_1_0 instance = new fold_$On$Import$Failure_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4472)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_OnImportFailure_1_0");
    Fail27358:
    { 
      IStrategoTerm i_4472 = null;
      IStrategoTerm k_4472 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27358;
      k_4472 = term;
      Success11080:
      { 
        Fail27359:
        { 
          IStrategoTerm l_4472 = null;
          IStrategoTerm n_4472 = null;
          IStrategoTerm o_4472 = null;
          n_4472 = term;
          l_4472 = generator.const7458;
          o_4472 = n_4472;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_4472, l_4472, generator.const7459);
          if(term == null)
            break Fail27359;
          if(true)
            break Success11080;
        }
        term = generator.constNil7;
      }
      i_4472 = term;
      term = k_4472;
      term = termFactory.makeTuple(i_4472, term);
      term = h_4472.invoke(context, term, lifted10133.instance);
      if(term == null)
        break Fail27358;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}