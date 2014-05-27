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

@SuppressWarnings("all") public class bigchain_$Follow$Success_0_0 extends Strategy 
{ 
  public static bigchain_$Follow$Success_0_0 instance = new bigchain_$Follow$Success_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_FollowSuccess_0_0");
    Fail27468:
    { 
      IStrategoTerm p_4490 = null;
      IStrategoTerm s_4490 = null;
      IStrategoTerm u_4490 = null;
      p_4490 = term;
      u_4490 = term;
      Success11113:
      { 
        Fail27469:
        { 
          IStrategoTerm w_4490 = null;
          w_4490 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4490, generator.const7487, p_4490);
          if(term == null)
            break Fail27469;
          if(true)
            break Success11113;
        }
        term = generator.constNil7;
      }
      s_4490 = term;
      term = u_4490;
      term = termFactory.makeTuple(s_4490, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10170.instance);
      if(term == null)
        break Fail27468;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}