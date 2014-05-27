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

@SuppressWarnings("all") final class lifted9292 extends Strategy 
{ 
  TermReference g_4275;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28758:
    { 
      IStrategoTerm j_4275 = null;
      j_4275 = term;
      IStrategoTerm term10316 = term;
      Success11362:
      { 
        Fail28759:
        { 
          term = equal_0_1.instance.invoke(context, term, g_4275.value);
          if(term == null)
            break Fail28759;
          if(true)
            break Success11362;
        }
        term = origin_equivalent_0_1.instance.invoke(context, term10316, g_4275.value);
        if(term == null)
          break Fail28758;
      }
      term = j_4275;
      if(true)
        return term;
    }
    return null;
  }
}