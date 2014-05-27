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

@SuppressWarnings("all") final class lifted9155 extends Strategy 
{ 
  TermReference p_4240;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28885:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consattrs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28885;
      if(p_4240.value == null)
        p_4240.value = term.getSubterm(0);
      else
        if(p_4240.value != term.getSubterm(0) && !p_4240.value.match(term.getSubterm(0)))
          break Fail28885;
      if(true)
        return term;
    }
    return null;
  }
}