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

@SuppressWarnings("all") public class bigfold_$Imported$From_1_0 extends Strategy 
{ 
  public static bigfold_$Imported$From_1_0 instance = new bigfold_$Imported$From_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4424)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_ImportedFrom_1_0");
    Fail27070:
    { 
      IStrategoTerm q_4424 = null;
      IStrategoTerm u_4424 = null;
      IStrategoTerm w_4424 = null;
      q_4424 = term;
      w_4424 = term;
      Success11002:
      { 
        Fail27071:
        { 
          IStrategoTerm y_4424 = null;
          y_4424 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4424, generator.const7027, q_4424);
          if(term == null)
            break Fail27071;
          if(true)
            break Success11002;
        }
        term = generator.constNil7;
      }
      u_4424 = term;
      term = w_4424;
      term = termFactory.makeTuple(u_4424, term);
      term = t_4424.invoke(context, term, lifted10033.instance);
      if(term == null)
        break Fail27070;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}