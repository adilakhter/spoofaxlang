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

@SuppressWarnings("all") final class lifted9550 extends Strategy 
{ 
  public static final lifted9550 instance = new lifted9550();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28395:
    { 
      IStrategoTerm w_4402 = null;
      w_4402 = term;
      term = has_extension_0_1.instance.invoke(context, w_4402, generator.const7002);
      if(term == null)
        break Fail28395;
      if(true)
        return term;
    }
    return null;
  }
}