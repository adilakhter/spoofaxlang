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

@SuppressWarnings("all") public class fold_$Is$Imported_1_0 extends Strategy 
{ 
  public static fold_$Is$Imported_1_0 instance = new fold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4437)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_IsImported_1_0");
    Fail27150:
    { 
      IStrategoTerm t_4437 = null;
      IStrategoTerm x_4437 = null;
      IStrategoTerm z_4437 = null;
      t_4437 = term;
      z_4437 = term;
      Success11024:
      { 
        Fail27151:
        { 
          IStrategoTerm b_4438 = null;
          b_4438 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4438, generator.const7145, t_4437);
          if(term == null)
            break Fail27151;
          if(true)
            break Success11024;
        }
        term = generator.constNil7;
      }
      x_4437 = term;
      term = z_4437;
      term = termFactory.makeTuple(x_4437, term);
      term = w_4437.invoke(context, term, lifted10061.instance);
      if(term == null)
        break Fail27150;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}