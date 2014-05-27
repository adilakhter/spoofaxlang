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

@SuppressWarnings("all") final class lifted9140 extends Strategy 
{ 
  public static final lifted9140 instance = new lifted9140();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28907:
    { 
      IStrategoTerm term10106 = term;
      Success11408:
      { 
        Fail28908:
        { 
          term = grammar2prodrules_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail28908;
          if(true)
            break Success11408;
        }
        term = term10106;
        IStrategoTerm s_4239 = null;
        s_4239 = term;
        term = fatal_err_0_1.instance.invoke(context, s_4239, generator.const7101);
        if(term == null)
          break Fail28907;
        if(true)
          break Fail28907;
      }
      if(true)
        return term;
    }
    return null;
  }
}