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

@SuppressWarnings("all") public class chain_$Follow$Success_0_0 extends Strategy 
{ 
  public static chain_$Follow$Success_0_0 instance = new chain_$Follow$Success_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_FollowSuccess_0_0");
    Fail27470:
    { 
      IStrategoTerm a_4491 = null;
      IStrategoTerm d_4491 = null;
      IStrategoTerm f_4491 = null;
      a_4491 = term;
      f_4491 = term;
      Success11114:
      { 
        Fail27471:
        { 
          IStrategoTerm h_4491 = null;
          h_4491 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, h_4491, generator.const7487, a_4491);
          if(term == null)
            break Fail27471;
          if(true)
            break Success11114;
        }
        term = generator.constNil7;
      }
      d_4491 = term;
      term = f_4491;
      term = termFactory.makeTuple(d_4491, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10171.instance);
      if(term == null)
        break Fail27470;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}