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

@SuppressWarnings("all") final class lifted9392 extends Strategy 
{ 
  public static final lifted9392 instance = new lifted9392();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28681:
    { 
      IStrategoTerm k_4311 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail28681;
      k_4311 = term.getSubterm(0);
      term = pattern_to_keywords_0_0.instance.invoke(context, k_4311);
      if(term == null)
        break Fail28681;
      if(true)
        return term;
    }
    return null;
  }
}