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

@SuppressWarnings("all") public class constructor_name_0_0 extends Strategy 
{ 
  public static constructor_name_0_0 instance = new constructor_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26299:
    { 
      IStrategoTerm c_4327 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consProdRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26299;
      IStrategoTerm arg6385 = term.getSubterm(1);
      if(arg6385.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6385).isEmpty())
        break Fail26299;
      IStrategoTerm arg6386 = ((IStrategoList)arg6385).head();
      if(arg6386.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAppl_2 != ((IStrategoAppl)arg6386).getConstructor())
        break Fail26299;
      IStrategoTerm arg6387 = arg6386.getSubterm(0);
      if(arg6387.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consTerm_1 != ((IStrategoAppl)arg6387).getConstructor())
        break Fail26299;
      c_4327 = arg6387.getSubterm(0);
      IStrategoTerm arg6389 = ((IStrategoList)arg6385).tail();
      if(arg6389.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6389).isEmpty())
        break Fail26299;
      term = c_4327;
      if(true)
        return term;
    }
    context.push("constructor_name_0_0");
    context.popOnFailure();
    return null;
  }
}