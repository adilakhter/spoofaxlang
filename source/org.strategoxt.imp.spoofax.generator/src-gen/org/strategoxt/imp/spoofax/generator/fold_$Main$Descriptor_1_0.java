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

@SuppressWarnings("all") public class fold_$Main$Descriptor_1_0 extends Strategy 
{ 
  public static fold_$Main$Descriptor_1_0 instance = new fold_$Main$Descriptor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4450)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_MainDescriptor_1_0");
    Fail27228:
    { 
      IStrategoTerm i_4450 = null;
      IStrategoTerm k_4450 = null;
      k_4450 = term;
      Success11045:
      { 
        Fail27229:
        { 
          IStrategoTerm l_4450 = null;
          IStrategoTerm n_4450 = null;
          IStrategoTerm o_4450 = null;
          n_4450 = term;
          l_4450 = generator.const7251;
          o_4450 = n_4450;
          term = dr_lookup_rule_0_2.instance.invoke(context, o_4450, l_4450, generator.constCons4561);
          if(term == null)
            break Fail27229;
          if(true)
            break Success11045;
        }
        term = generator.constNil7;
      }
      i_4450 = term;
      term = k_4450;
      term = termFactory.makeTuple(i_4450, term);
      term = h_4450.invoke(context, term, lifted10088.instance);
      if(term == null)
        break Fail27228;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}