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

@SuppressWarnings("all") final class lifted8995 extends Strategy 
{ 
  public static final lifted8995 instance = new lifted8995();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29045:
    { 
      term = sdf2rtg_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29045;
      term = write_to_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail29045;
      if(true)
        return term;
    }
    return null;
  }
}