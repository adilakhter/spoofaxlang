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

@SuppressWarnings("all") final class lifted10130 extends Strategy 
{ 
  TermReference a_4470;

  TermReference b_4470;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27912:
    { 
      term = aux_$No$Existing$Descriptor_0_2.instance.invoke(context, term, a_4470.value, b_4470.value);
      if(term == null)
        break Fail27912;
      if(true)
        return term;
    }
    return null;
  }
}