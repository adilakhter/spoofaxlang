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

@SuppressWarnings("all") final class lifted9293 extends Strategy 
{ 
  TermReference q_4275;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28756:
    { 
      IStrategoTerm t_4275 = null;
      t_4275 = term;
      IStrategoTerm term10319 = term;
      Success11361:
      { 
        Fail28757:
        { 
          term = equal_0_1.instance.invoke(context, term, q_4275.value);
          if(term == null)
            break Fail28757;
          if(true)
            break Success11361;
        }
        term = origin_equivalent_0_1.instance.invoke(context, term10319, q_4275.value);
        if(term == null)
          break Fail28756;
      }
      term = t_4275;
      if(true)
        return term;
    }
    return null;
  }
}