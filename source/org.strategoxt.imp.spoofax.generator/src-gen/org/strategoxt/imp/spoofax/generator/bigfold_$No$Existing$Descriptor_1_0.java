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

@SuppressWarnings("all") public class bigfold_$No$Existing$Descriptor_1_0 extends Strategy 
{ 
  public static bigfold_$No$Existing$Descriptor_1_0 instance = new bigfold_$No$Existing$Descriptor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4466)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_NoExistingDescriptor_1_0");
    Fail27330:
    { 
      IStrategoTerm a_4467 = null;
      IStrategoTerm c_4467 = null;
      c_4467 = term;
      Success11072:
      { 
        Fail27331:
        { 
          IStrategoTerm d_4467 = null;
          IStrategoTerm f_4467 = null;
          IStrategoTerm g_4467 = null;
          f_4467 = term;
          d_4467 = generator.const7463;
          g_4467 = f_4467;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, g_4467, d_4467, generator.constCons4561);
          if(term == null)
            break Fail27331;
          if(true)
            break Success11072;
        }
        term = generator.constNil7;
      }
      a_4467 = term;
      term = c_4467;
      term = termFactory.makeTuple(a_4467, term);
      term = z_4466.invoke(context, term, lifted10123.instance);
      if(term == null)
        break Fail27330;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}