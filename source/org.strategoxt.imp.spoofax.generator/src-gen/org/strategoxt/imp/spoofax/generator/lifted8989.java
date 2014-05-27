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

@SuppressWarnings("all") final class lifted8989 extends Strategy 
{ 
  public static final lifted8989 instance = new lifted8989();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29049:
    { 
      IStrategoTerm h_4218 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSome_1 != ((IStrategoAppl)term).getConstructor())
        break Fail29049;
      h_4218 = term.getSubterm(0);
      term = h_4218;
      if(true)
        return term;
    }
    return null;
  }
}