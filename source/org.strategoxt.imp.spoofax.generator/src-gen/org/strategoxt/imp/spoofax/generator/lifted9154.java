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

@SuppressWarnings("all") final class lifted9154 extends Strategy 
{ 
  TermReference r_4240;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28888:
    { 
      if(r_4240.value == null)
        r_4240.value = term;
      else
        if(r_4240.value != term && !r_4240.value.match(term))
          break Fail28888;
      if(true)
        return term;
    }
    return null;
  }
}