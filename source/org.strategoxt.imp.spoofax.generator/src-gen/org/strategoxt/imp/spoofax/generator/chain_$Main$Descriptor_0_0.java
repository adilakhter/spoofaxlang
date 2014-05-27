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

@SuppressWarnings("all") public class chain_$Main$Descriptor_0_0 extends Strategy 
{ 
  public static chain_$Main$Descriptor_0_0 instance = new chain_$Main$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_MainDescriptor_0_0");
    Fail27232:
    { 
      IStrategoTerm e_4451 = null;
      IStrategoTerm g_4451 = null;
      g_4451 = term;
      Success11047:
      { 
        Fail27233:
        { 
          IStrategoTerm h_4451 = null;
          IStrategoTerm j_4451 = null;
          IStrategoTerm k_4451 = null;
          j_4451 = term;
          h_4451 = generator.const7251;
          k_4451 = j_4451;
          term = dr_lookup_rule_0_2.instance.invoke(context, k_4451, h_4451, generator.constCons4561);
          if(term == null)
            break Fail27233;
          if(true)
            break Success11047;
        }
        term = generator.constNil7;
      }
      e_4451 = term;
      term = g_4451;
      term = termFactory.makeTuple(e_4451, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10090.instance);
      if(term == null)
        break Fail27232;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}