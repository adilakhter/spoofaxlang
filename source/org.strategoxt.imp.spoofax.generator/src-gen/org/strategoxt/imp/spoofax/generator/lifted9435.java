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

@SuppressWarnings("all") final class lifted9435 extends Strategy 
{ 
  TermReference o_4320;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28643:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consLanguageId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28643;
      if(o_4320.value == null)
        o_4320.value = term.getSubterm(0);
      else
        if(o_4320.value != term.getSubterm(0) && !o_4320.value.match(term.getSubterm(0)))
          break Fail28643;
      if(true)
        return term;
    }
    return null;
  }
}