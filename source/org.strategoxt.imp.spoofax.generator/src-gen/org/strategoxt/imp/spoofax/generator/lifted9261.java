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

@SuppressWarnings("all") final class lifted9261 extends Strategy 
{ 
  public static final lifted9261 instance = new lifted9261();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28796:
    { 
      IStrategoTerm term10258 = term;
      Success11373:
      { 
        Fail28797:
        { 
          term = is_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28797;
          if(true)
            break Success11373;
        }
        term = write_to_string_0_0.instance.invoke(context, term10258);
        if(term == null)
          break Fail28796;
      }
      if(true)
        return term;
    }
    return null;
  }
}