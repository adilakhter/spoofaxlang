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

@SuppressWarnings("all") public class bigfold_$Is$Imported_1_0 extends Strategy 
{ 
  public static bigfold_$Is$Imported_1_0 instance = new bigfold_$Is$Imported_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4437)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_IsImported_1_0");
    Fail27148:
    { 
      IStrategoTerm h_4437 = null;
      IStrategoTerm l_4437 = null;
      IStrategoTerm n_4437 = null;
      h_4437 = term;
      n_4437 = term;
      Success11023:
      { 
        Fail27149:
        { 
          IStrategoTerm p_4437 = null;
          p_4437 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4437, generator.const7145, h_4437);
          if(term == null)
            break Fail27149;
          if(true)
            break Success11023;
        }
        term = generator.constNil7;
      }
      l_4437 = term;
      term = n_4437;
      term = termFactory.makeTuple(l_4437, term);
      term = k_4437.invoke(context, term, lifted10060.instance);
      if(term == null)
        break Fail27148;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}