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

@SuppressWarnings("all") final class lifted9430 extends Strategy 
{ 
  public static final lifted9430 instance = new lifted9430();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28648:
    { 
      IStrategoTerm g_4320 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consStartSymbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28648;
      g_4320 = term.getSubterm(0);
      term = g_4320;
      if(true)
        return term;
    }
    return null;
  }
}