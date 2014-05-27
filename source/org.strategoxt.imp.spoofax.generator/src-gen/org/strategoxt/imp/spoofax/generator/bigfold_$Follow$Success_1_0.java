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

@SuppressWarnings("all") public class bigfold_$Follow$Success_1_0 extends Strategy 
{ 
  public static bigfold_$Follow$Success_1_0 instance = new bigfold_$Follow$Success_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4489)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_FollowSuccess_1_0");
    Fail27464:
    { 
      IStrategoTerm r_4489 = null;
      IStrategoTerm v_4489 = null;
      IStrategoTerm x_4489 = null;
      r_4489 = term;
      x_4489 = term;
      Success11111:
      { 
        Fail27465:
        { 
          IStrategoTerm z_4489 = null;
          z_4489 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_4489, generator.const7487, r_4489);
          if(term == null)
            break Fail27465;
          if(true)
            break Success11111;
        }
        term = generator.constNil7;
      }
      v_4489 = term;
      term = x_4489;
      term = termFactory.makeTuple(v_4489, term);
      term = u_4489.invoke(context, term, lifted10168.instance);
      if(term == null)
        break Fail27464;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}