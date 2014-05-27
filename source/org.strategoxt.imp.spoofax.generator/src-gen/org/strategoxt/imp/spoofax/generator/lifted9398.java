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

@SuppressWarnings("all") final class lifted9398 extends Strategy 
{ 
  public static final lifted9398 instance = new lifted9398();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28675:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conslit_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28675;
      if(true)
        return term;
    }
    return null;
  }
}