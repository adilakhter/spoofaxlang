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

@SuppressWarnings("all") final class lifted9086 extends Strategy 
{ 
  public static final lifted9086 instance = new lifted9086();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28949:
    { 
      IStrategoTerm term10090 = term;
      Success11410:
      { 
        Fail28950:
        { 
          term = is_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28950;
          if(true)
            break Success11410;
        }
        term = write_to_string_0_0.instance.invoke(context, term10090);
        if(term == null)
          break Fail28949;
      }
      if(true)
        return term;
    }
    return null;
  }
}