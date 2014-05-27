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

@SuppressWarnings("all") public class position_of_term_1_0 extends Strategy 
{ 
  public static position_of_term_1_0 instance = new position_of_term_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4541)
  { 
    context.push("position_of_term_1_0");
    Fail25834:
    { 
      IStrategoTerm term10272 = term;
      Success10213:
      { 
        Fail25835:
        { 
          term = k_4541.invoke(context, term);
          if(term == null)
            break Fail25835;
          term = generator.constNil7;
          if(true)
            break Success10213;
        }
        term = term10272;
        IStrategoTerm m_4267 = null;
        IStrategoTerm args45 = context.invokePrimitive("SSL_get_arguments", term, NO_STRATEGIES, new IStrategoTerm[]{term});
        m_4267 = args45;
        term = position_of_term_1_1.instance.invoke(context, m_4267, k_4541, generator.const6964);
        if(term == null)
          break Fail25834;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}