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

@SuppressWarnings("all") public class bigfold_$Descriptor$P$P$Table_1_0 extends Strategy 
{ 
  public static bigfold_$Descriptor$P$P$Table_1_0 instance = new bigfold_$Descriptor$P$P$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4428)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_DescriptorPPTable_1_0");
    Fail27096:
    { 
      IStrategoTerm v_4428 = null;
      IStrategoTerm x_4428 = null;
      x_4428 = term;
      Success11009:
      { 
        Fail27097:
        { 
          IStrategoTerm y_4428 = null;
          IStrategoTerm a_4429 = null;
          IStrategoTerm b_4429 = null;
          a_4429 = term;
          y_4428 = generator.const7124;
          b_4429 = a_4429;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, b_4429, y_4428, generator.constCons4561);
          if(term == null)
            break Fail27097;
          if(true)
            break Success11009;
        }
        term = generator.constNil7;
      }
      v_4428 = term;
      term = x_4428;
      term = termFactory.makeTuple(v_4428, term);
      term = u_4428.invoke(context, term, lifted10042.instance);
      if(term == null)
        break Fail27096;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}