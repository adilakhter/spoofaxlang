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

@SuppressWarnings("all") final class lifted9026 extends Strategy 
{ 
  TermReference d_4223;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29015:
    { 
      IStrategoTerm i_4223 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail29015;
      if(d_4223.value == null)
        d_4223.value = term.getSubterm(0);
      else
        if(d_4223.value != term.getSubterm(0) && !d_4223.value.match(term.getSubterm(0)))
          break Fail29015;
      i_4223 = term.getSubterm(1);
      term = i_4223;
      if(true)
        return term;
    }
    return null;
  }
}