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

@SuppressWarnings("all") public class fold_$Follow$Success_1_0 extends Strategy 
{ 
  public static fold_$Follow$Success_1_0 instance = new fold_$Follow$Success_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4490)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_FollowSuccess_1_0");
    Fail27466:
    { 
      IStrategoTerm d_4490 = null;
      IStrategoTerm h_4490 = null;
      IStrategoTerm j_4490 = null;
      d_4490 = term;
      j_4490 = term;
      Success11112:
      { 
        Fail27467:
        { 
          IStrategoTerm l_4490 = null;
          l_4490 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, l_4490, generator.const7487, d_4490);
          if(term == null)
            break Fail27467;
          if(true)
            break Success11112;
        }
        term = generator.constNil7;
      }
      h_4490 = term;
      term = j_4490;
      term = termFactory.makeTuple(h_4490, term);
      term = g_4490.invoke(context, term, lifted10169.instance);
      if(term == null)
        break Fail27466;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}