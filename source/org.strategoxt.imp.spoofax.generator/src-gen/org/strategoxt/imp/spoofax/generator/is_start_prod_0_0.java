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

@SuppressWarnings("all") public class is_start_prod_0_0 extends Strategy 
{ 
  public static is_start_prod_0_0 instance = new is_start_prod_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25613:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25613;
      IStrategoTerm arg6035 = term.getSubterm(1);
      if(arg6035.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consstart_0 != ((IStrategoAppl)arg6035).getConstructor())
        break Fail25613;
      if(true)
        return term;
    }
    context.push("is_start_prod_0_0");
    context.popOnFailure();
    return null;
  }
}