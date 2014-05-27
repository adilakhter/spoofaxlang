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

@SuppressWarnings("all") final class lifted9265 extends Strategy 
{ 
  TermReference c_4268;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28793:
    { 
      if(c_4268.value == null)
        c_4268.value = term;
      else
        if(c_4268.value != term && !c_4268.value.match(term))
          break Fail28793;
      if(true)
        return term;
    }
    return null;
  }
}