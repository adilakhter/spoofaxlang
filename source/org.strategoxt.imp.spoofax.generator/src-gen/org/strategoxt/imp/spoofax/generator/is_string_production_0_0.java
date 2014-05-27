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

@SuppressWarnings("all") public class is_string_production_0_0 extends Strategy 
{ 
  public static is_string_production_0_0 instance = new is_string_production_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26306:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consProdRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26306;
      IStrategoTerm arg6402 = term.getSubterm(1);
      if(arg6402.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6402).isEmpty())
        break Fail26306;
      IStrategoTerm arg6403 = ((IStrategoList)arg6402).head();
      if(arg6403.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)arg6403).getConstructor())
        break Fail26306;
      IStrategoTerm arg6404 = arg6403.getSubterm(0);
      if(arg6404.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consString_0 != ((IStrategoAppl)arg6404).getConstructor())
        break Fail26306;
      IStrategoTerm arg6405 = ((IStrategoList)arg6402).tail();
      if(arg6405.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6405).isEmpty())
        break Fail26306;
      if(true)
        return term;
    }
    context.push("is_string_production_0_0");
    context.popOnFailure();
    return null;
  }
}