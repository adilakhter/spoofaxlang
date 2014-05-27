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

@SuppressWarnings("all") final class lifted9160 extends Strategy 
{ 
  public static final lifted9160 instance = new lifted9160();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28881:
    { 
      IStrategoTerm term10147 = term;
      Success11398:
      { 
        Fail28882:
        { 
          term = is_empty_sym_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28882;
          { 
            if(true)
              break Fail28881;
            if(true)
              break Success11398;
          }
        }
        term = term10147;
      }
      if(true)
        return term;
    }
    return null;
  }
}