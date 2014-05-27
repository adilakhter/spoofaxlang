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

@SuppressWarnings("all") public class bigbagof_$Follow$Success_0_0 extends Strategy 
{ 
  public static bigbagof_$Follow$Success_0_0 instance = new bigbagof_$Follow$Success_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_FollowSuccess_0_0");
    Fail27472:
    { 
      TermReference k_4491 = new TermReference();
      TermReference l_4491 = new TermReference();
      if(l_4491.value == null)
        l_4491.value = term;
      else
        if(l_4491.value != term && !l_4491.value.match(term))
          break Fail27472;
      if(k_4491.value == null)
        k_4491.value = term;
      else
        if(k_4491.value != term && !k_4491.value.match(term))
          break Fail27472;
      Success11115:
      { 
        Fail27473:
        { 
          IStrategoTerm p_4491 = null;
          p_4491 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4491, generator.const7487, l_4491.value);
          if(term == null)
            break Fail27473;
          if(true)
            break Success11115;
        }
        term = generator.constNil7;
      }
      lifted10172 lifted101720 = new lifted10172();
      lifted101720.k_4491 = k_4491;
      lifted101720.l_4491 = l_4491;
      term = filter_1_0.instance.invoke(context, term, lifted101720);
      if(term == null)
        break Fail27472;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}