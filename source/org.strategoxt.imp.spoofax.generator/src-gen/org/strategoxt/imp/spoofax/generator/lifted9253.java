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

@SuppressWarnings("all") final class lifted9253 extends Strategy 
{ 
  public static final lifted9253 instance = new lifted9253();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28803:
    { 
      IStrategoTerm o_4264 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail28803;
      IStrategoTerm arg6226 = term.getSubterm(1);
      if(arg6226.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImports_1 != ((IStrategoAppl)arg6226).getConstructor())
        break Fail28803;
      o_4264 = arg6226.getSubterm(0);
      term = o_4264;
      if(true)
        return term;
    }
    return null;
  }
}