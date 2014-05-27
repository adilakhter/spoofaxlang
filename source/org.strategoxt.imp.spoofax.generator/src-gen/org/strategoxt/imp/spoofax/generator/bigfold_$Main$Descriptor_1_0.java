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

@SuppressWarnings("all") public class bigfold_$Main$Descriptor_1_0 extends Strategy 
{ 
  public static bigfold_$Main$Descriptor_1_0 instance = new bigfold_$Main$Descriptor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4449)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_MainDescriptor_1_0");
    Fail27226:
    { 
      IStrategoTerm w_4449 = null;
      IStrategoTerm y_4449 = null;
      y_4449 = term;
      Success11044:
      { 
        Fail27227:
        { 
          IStrategoTerm z_4449 = null;
          IStrategoTerm b_4450 = null;
          IStrategoTerm c_4450 = null;
          b_4450 = term;
          z_4449 = generator.const7251;
          c_4450 = b_4450;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, c_4450, z_4449, generator.constCons4561);
          if(term == null)
            break Fail27227;
          if(true)
            break Success11044;
        }
        term = generator.constNil7;
      }
      w_4449 = term;
      term = y_4449;
      term = termFactory.makeTuple(w_4449, term);
      term = v_4449.invoke(context, term, lifted10087.instance);
      if(term == null)
        break Fail27226;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}