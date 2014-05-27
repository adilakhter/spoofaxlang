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

@SuppressWarnings("all") final class lifted9346 extends Strategy 
{ 
  public static final lifted9346 instance = new lifted9346();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28715:
    { 
      term = descriptor_name_0_0.instance.invoke(context, generator.const7232);
      if(term == null)
        break Fail28715;
      if(true)
        return term;
    }
    return null;
  }
}