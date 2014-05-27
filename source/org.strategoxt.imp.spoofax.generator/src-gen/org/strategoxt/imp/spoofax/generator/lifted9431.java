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

@SuppressWarnings("all") final class lifted9431 extends Strategy 
{ 
  public static final lifted9431 instance = new lifted9431();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28647:
    { 
      IStrategoTerm h_4320 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consValues_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28647;
      h_4320 = term.getSubterm(0);
      term = h_4320;
      if(true)
        return term;
    }
    return null;
  }
}