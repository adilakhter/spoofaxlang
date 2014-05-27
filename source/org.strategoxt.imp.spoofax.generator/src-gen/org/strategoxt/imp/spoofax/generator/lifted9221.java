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

@SuppressWarnings("all") final class lifted9221 extends Strategy 
{ 
  public static final lifted9221 instance = new lifted9221();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28827:
    { 
      IStrategoTerm a_4257 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28827;
      a_4257 = term.getSubterm(0);
      term = a_4257;
      if(true)
        return term;
    }
    return null;
  }
}