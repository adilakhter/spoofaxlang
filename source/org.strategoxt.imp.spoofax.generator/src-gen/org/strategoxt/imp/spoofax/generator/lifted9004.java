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

@SuppressWarnings("all") final class lifted9004 extends Strategy 
{ 
  public static final lifted9004 instance = new lifted9004();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29035:
    { 
      term = repeat_1_0.instance.invoke(context, term, $Sdf$Desugar_0_0.instance);
      if(term == null)
        break Fail29035;
      term = try_1_0.instance.invoke(context, term, $Sdf$Desugar$Once_0_0.instance);
      if(term == null)
        break Fail29035;
      if(true)
        return term;
    }
    return null;
  }
}