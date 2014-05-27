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

@SuppressWarnings("all") public class bigchain_$Imported$From_0_0 extends Strategy 
{ 
  public static bigchain_$Imported$From_0_0 instance = new bigchain_$Imported$From_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_ImportedFrom_0_0");
    Fail27074:
    { 
      IStrategoTerm o_4425 = null;
      IStrategoTerm r_4425 = null;
      IStrategoTerm t_4425 = null;
      o_4425 = term;
      t_4425 = term;
      Success11004:
      { 
        Fail27075:
        { 
          IStrategoTerm v_4425 = null;
          v_4425 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, v_4425, generator.const7027, o_4425);
          if(term == null)
            break Fail27075;
          if(true)
            break Success11004;
        }
        term = generator.constNil7;
      }
      r_4425 = term;
      term = t_4425;
      term = termFactory.makeTuple(r_4425, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10035.instance);
      if(term == null)
        break Fail27074;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}