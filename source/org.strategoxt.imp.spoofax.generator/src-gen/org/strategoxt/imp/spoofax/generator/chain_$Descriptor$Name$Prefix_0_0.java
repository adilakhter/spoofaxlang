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

@SuppressWarnings("all") public class chain_$Descriptor$Name$Prefix_0_0 extends Strategy 
{ 
  public static chain_$Descriptor$Name$Prefix_0_0 instance = new chain_$Descriptor$Name$Prefix_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_DescriptorNamePrefix_0_0");
    Fail27704:
    { 
      IStrategoTerm r_4530 = null;
      IStrategoTerm t_4530 = null;
      t_4530 = term;
      Success11177:
      { 
        Fail27705:
        { 
          IStrategoTerm u_4530 = null;
          IStrategoTerm w_4530 = null;
          IStrategoTerm x_4530 = null;
          w_4530 = term;
          u_4530 = generator.const7899;
          x_4530 = w_4530;
          term = dr_lookup_rule_0_2.instance.invoke(context, x_4530, u_4530, generator.constCons4561);
          if(term == null)
            break Fail27705;
          if(true)
            break Success11177;
        }
        term = generator.constNil7;
      }
      r_4530 = term;
      term = t_4530;
      term = termFactory.makeTuple(r_4530, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10252.instance);
      if(term == null)
        break Fail27704;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}