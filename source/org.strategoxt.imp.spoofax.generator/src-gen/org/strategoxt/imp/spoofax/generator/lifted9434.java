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

@SuppressWarnings("all") final class lifted9434 extends Strategy 
{ 
  public static final lifted9434 instance = new lifted9434();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28644:
    { 
      IStrategoTerm l_4320 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consExtensions_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28644;
      IStrategoTerm arg6346 = term.getSubterm(0);
      if(arg6346.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consValues_1 != ((IStrategoAppl)arg6346).getConstructor())
        break Fail28644;
      l_4320 = arg6346.getSubterm(0);
      term = l_4320;
      if(true)
        return term;
    }
    return null;
  }
}