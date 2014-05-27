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

@SuppressWarnings("all") final class lifted8991 extends Strategy 
{ 
  public static final lifted8991 instance = new lifted8991();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29047:
    { 
      IStrategoTerm term10034 = term;
      Success11431:
      { 
        Fail29048:
        { 
          term = sdf_main_module_option_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail29048;
          if(true)
            break Success11431;
        }
        term = ignore_option_0_0.instance.invoke(context, term10034);
        if(term == null)
          break Fail29047;
      }
      if(true)
        return term;
    }
    return null;
  }
}