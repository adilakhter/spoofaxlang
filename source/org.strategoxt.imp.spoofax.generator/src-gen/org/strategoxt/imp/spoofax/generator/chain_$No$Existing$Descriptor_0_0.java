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

@SuppressWarnings("all") public class chain_$No$Existing$Descriptor_0_0 extends Strategy 
{ 
  public static chain_$No$Existing$Descriptor_0_0 instance = new chain_$No$Existing$Descriptor_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_NoExistingDescriptor_0_0");
    Fail27336:
    { 
      IStrategoTerm o_4468 = null;
      IStrategoTerm q_4468 = null;
      q_4468 = term;
      Success11075:
      { 
        Fail27337:
        { 
          IStrategoTerm r_4468 = null;
          IStrategoTerm t_4468 = null;
          IStrategoTerm u_4468 = null;
          t_4468 = term;
          r_4468 = generator.const7463;
          u_4468 = t_4468;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_4468, r_4468, generator.constCons4561);
          if(term == null)
            break Fail27337;
          if(true)
            break Success11075;
        }
        term = generator.constNil7;
      }
      o_4468 = term;
      term = q_4468;
      term = termFactory.makeTuple(o_4468, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10126.instance);
      if(term == null)
        break Fail27336;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}