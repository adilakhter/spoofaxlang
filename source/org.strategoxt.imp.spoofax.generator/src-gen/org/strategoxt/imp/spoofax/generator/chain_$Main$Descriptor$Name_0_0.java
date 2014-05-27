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

@SuppressWarnings("all") public class chain_$Main$Descriptor$Name_0_0 extends Strategy 
{ 
  public static chain_$Main$Descriptor$Name_0_0 instance = new chain_$Main$Descriptor$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_MainDescriptorName_0_0");
    Fail27730:
    { 
      IStrategoTerm y_4534 = null;
      IStrategoTerm a_4535 = null;
      a_4535 = term;
      Success11184:
      { 
        Fail27731:
        { 
          IStrategoTerm b_4535 = null;
          IStrategoTerm d_4535 = null;
          IStrategoTerm e_4535 = null;
          d_4535 = term;
          b_4535 = generator.const7897;
          e_4535 = d_4535;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_4535, b_4535, generator.constCons4561);
          if(term == null)
            break Fail27731;
          if(true)
            break Success11184;
        }
        term = generator.constNil7;
      }
      y_4534 = term;
      term = a_4535;
      term = termFactory.makeTuple(y_4534, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10261.instance);
      if(term == null)
        break Fail27730;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}