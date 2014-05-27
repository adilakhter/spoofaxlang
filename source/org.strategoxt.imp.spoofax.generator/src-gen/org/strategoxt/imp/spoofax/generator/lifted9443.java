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

@SuppressWarnings("all") final class lifted9443 extends Strategy 
{ 
  public static final lifted9443 instance = new lifted9443();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28635:
    { 
      IStrategoTerm u_4324 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail28635;
      IStrategoTerm arg6360 = term.getSubterm(0);
      if(arg6360.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6360).getConstructor())
        break Fail28635;
      u_4324 = arg6360.getSubterm(0);
      term = u_4324;
      if(true)
        return term;
    }
    return null;
  }
}