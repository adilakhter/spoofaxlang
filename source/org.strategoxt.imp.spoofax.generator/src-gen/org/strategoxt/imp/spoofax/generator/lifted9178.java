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

@SuppressWarnings("all") final class lifted9178 extends Strategy 
{ 
  public static final lifted9178 instance = new lifted9178();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28878:
    { 
      IStrategoTerm term10164 = term;
      Success11397:
      { 
        Fail28879:
        { 
          term = is_empty_sym_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28879;
          { 
            if(true)
              break Fail28878;
            if(true)
              break Success11397;
          }
        }
        term = term10164;
      }
      if(true)
        return term;
    }
    return null;
  }
}