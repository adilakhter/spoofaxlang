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

@SuppressWarnings("all") public class fold_$No$Existing$Descriptor_1_0 extends Strategy 
{ 
  public static fold_$No$Existing$Descriptor_1_0 instance = new fold_$No$Existing$Descriptor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4467)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_NoExistingDescriptor_1_0");
    Fail27332:
    { 
      IStrategoTerm o_4467 = null;
      IStrategoTerm q_4467 = null;
      q_4467 = term;
      Success11073:
      { 
        Fail27333:
        { 
          IStrategoTerm r_4467 = null;
          IStrategoTerm t_4467 = null;
          IStrategoTerm u_4467 = null;
          t_4467 = term;
          r_4467 = generator.const7463;
          u_4467 = t_4467;
          term = dr_lookup_rule_0_2.instance.invoke(context, u_4467, r_4467, generator.constCons4561);
          if(term == null)
            break Fail27333;
          if(true)
            break Success11073;
        }
        term = generator.constNil7;
      }
      o_4467 = term;
      term = q_4467;
      term = termFactory.makeTuple(o_4467, term);
      term = n_4467.invoke(context, term, lifted10124.instance);
      if(term == null)
        break Fail27332;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}