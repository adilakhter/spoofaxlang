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

@SuppressWarnings("all") final class lifted10073 extends Strategy 
{ 
  TermReference d_4443;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27969:
    { 
      term = aux_$Cached$Parse$Table$Descriptor_0_1.instance.invoke(context, term, d_4443.value);
      if(term == null)
        break Fail27969;
      if(true)
        return term;
    }
    return null;
  }
}