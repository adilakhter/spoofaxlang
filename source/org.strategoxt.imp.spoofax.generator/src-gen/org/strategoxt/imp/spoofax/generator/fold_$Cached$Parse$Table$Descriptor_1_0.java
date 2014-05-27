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

@SuppressWarnings("all") public class fold_$Cached$Parse$Table$Descriptor_1_0 extends Strategy 
{ 
  public static fold_$Cached$Parse$Table$Descriptor_1_0 instance = new fold_$Cached$Parse$Table$Descriptor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4441)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_CachedParseTableDescriptor_1_0");
    Fail27176:
    { 
      IStrategoTerm y_4441 = null;
      IStrategoTerm a_4442 = null;
      a_4442 = term;
      Success11031:
      { 
        Fail27177:
        { 
          IStrategoTerm b_4442 = null;
          IStrategoTerm d_4442 = null;
          IStrategoTerm e_4442 = null;
          d_4442 = term;
          b_4442 = generator.const7154;
          e_4442 = d_4442;
          term = dr_lookup_rule_0_2.instance.invoke(context, e_4442, b_4442, generator.constCons4561);
          if(term == null)
            break Fail27177;
          if(true)
            break Success11031;
        }
        term = generator.constNil7;
      }
      y_4441 = term;
      term = a_4442;
      term = termFactory.makeTuple(y_4441, term);
      term = x_4441.invoke(context, term, lifted10070.instance);
      if(term == null)
        break Fail27176;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}