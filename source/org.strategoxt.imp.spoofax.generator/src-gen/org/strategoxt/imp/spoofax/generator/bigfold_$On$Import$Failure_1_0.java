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

@SuppressWarnings("all") public class bigfold_$On$Import$Failure_1_0 extends Strategy 
{ 
  public static bigfold_$On$Import$Failure_1_0 instance = new bigfold_$On$Import$Failure_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4471)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_OnImportFailure_1_0");
    Fail27356:
    { 
      IStrategoTerm u_4471 = null;
      IStrategoTerm w_4471 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImport_1 != ((IStrategoAppl)term).getConstructor())
        break Fail27356;
      w_4471 = term;
      Success11079:
      { 
        Fail27357:
        { 
          IStrategoTerm x_4471 = null;
          IStrategoTerm z_4471 = null;
          IStrategoTerm a_4472 = null;
          z_4471 = term;
          x_4471 = generator.const7458;
          a_4472 = z_4471;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_4472, x_4471, generator.const7459);
          if(term == null)
            break Fail27357;
          if(true)
            break Success11079;
        }
        term = generator.constNil7;
      }
      u_4471 = term;
      term = w_4471;
      term = termFactory.makeTuple(u_4471, term);
      term = t_4471.invoke(context, term, lifted10132.instance);
      if(term == null)
        break Fail27356;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}