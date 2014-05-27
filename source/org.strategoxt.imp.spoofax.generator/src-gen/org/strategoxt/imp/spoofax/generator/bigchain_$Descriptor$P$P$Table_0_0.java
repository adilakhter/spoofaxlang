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

@SuppressWarnings("all") public class bigchain_$Descriptor$P$P$Table_0_0 extends Strategy 
{ 
  public static bigchain_$Descriptor$P$P$Table_0_0 instance = new bigchain_$Descriptor$P$P$Table_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_DescriptorPPTable_0_0");
    Fail27100:
    { 
      IStrategoTerm s_4429 = null;
      IStrategoTerm u_4429 = null;
      u_4429 = term;
      Success11011:
      { 
        Fail27101:
        { 
          IStrategoTerm v_4429 = null;
          IStrategoTerm x_4429 = null;
          IStrategoTerm y_4429 = null;
          x_4429 = term;
          v_4429 = generator.const7124;
          y_4429 = x_4429;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4429, v_4429, generator.constCons4561);
          if(term == null)
            break Fail27101;
          if(true)
            break Success11011;
        }
        term = generator.constNil7;
      }
      s_4429 = term;
      term = u_4429;
      term = termFactory.makeTuple(s_4429, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10044.instance);
      if(term == null)
        break Fail27100;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}