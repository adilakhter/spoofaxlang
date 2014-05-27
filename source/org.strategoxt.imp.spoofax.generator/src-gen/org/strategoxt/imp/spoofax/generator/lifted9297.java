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

@SuppressWarnings("all") final class lifted9297 extends Strategy 
{ 
  public static final lifted9297 instance = new lifted9297();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28750:
    { 
      IStrategoTerm term10331 = term;
      Success11359:
      { 
        Fail28751:
        { 
          term = origin_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28751;
          { 
            if(true)
              break Fail28750;
            if(true)
              break Success11359;
          }
        }
        term = term10331;
      }
      if(true)
        return term;
    }
    return null;
  }
}