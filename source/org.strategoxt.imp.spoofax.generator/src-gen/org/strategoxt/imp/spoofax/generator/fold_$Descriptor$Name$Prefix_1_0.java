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

@SuppressWarnings("all") public class fold_$Descriptor$Name$Prefix_1_0 extends Strategy 
{ 
  public static fold_$Descriptor$Name$Prefix_1_0 instance = new fold_$Descriptor$Name$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4529)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_DescriptorNamePrefix_1_0");
    Fail27700:
    { 
      IStrategoTerm v_4529 = null;
      IStrategoTerm x_4529 = null;
      x_4529 = term;
      Success11175:
      { 
        Fail27701:
        { 
          IStrategoTerm y_4529 = null;
          IStrategoTerm a_4530 = null;
          IStrategoTerm b_4530 = null;
          a_4530 = term;
          y_4529 = generator.const7899;
          b_4530 = a_4530;
          term = dr_lookup_rule_0_2.instance.invoke(context, b_4530, y_4529, generator.constCons4561);
          if(term == null)
            break Fail27701;
          if(true)
            break Success11175;
        }
        term = generator.constNil7;
      }
      v_4529 = term;
      term = x_4529;
      term = termFactory.makeTuple(v_4529, term);
      term = u_4529.invoke(context, term, lifted10250.instance);
      if(term == null)
        break Fail27700;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}