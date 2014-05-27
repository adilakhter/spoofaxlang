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

@SuppressWarnings("all") public class bigchain_$Is$Reserved$Class$Name_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Reserved$Class$Name_0_0 instance = new bigchain_$Is$Reserved$Class$Name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsReservedClassName_0_0");
    Fail27204:
    { 
      IStrategoTerm p_4446 = null;
      IStrategoTerm s_4446 = null;
      IStrategoTerm u_4446 = null;
      p_4446 = term;
      u_4446 = term;
      Success11039:
      { 
        Fail27205:
        { 
          IStrategoTerm w_4446 = null;
          w_4446 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, w_4446, generator.const7167, p_4446);
          if(term == null)
            break Fail27205;
          if(true)
            break Success11039;
        }
        term = generator.constNil7;
      }
      s_4446 = term;
      term = u_4446;
      term = termFactory.makeTuple(s_4446, term);
      term = foldl_1_0.instance.invoke(context, term, lifted10080.instance);
      if(term == null)
        break Fail27204;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}