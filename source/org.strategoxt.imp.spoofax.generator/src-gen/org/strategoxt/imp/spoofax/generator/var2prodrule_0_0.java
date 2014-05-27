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

@SuppressWarnings("all") public class var2prodrule_0_0 extends Strategy 
{ 
  public static var2prodrule_0_0 instance = new var2prodrule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("var2prodrule_0_0");
    Fail25633:
    { 
      IStrategoTerm l_4244 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25633;
      IStrategoTerm arg6097 = term.getSubterm(1);
      if(arg6097.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consvarsym_1 != ((IStrategoAppl)arg6097).getConstructor())
        break Fail25633;
      l_4244 = arg6097.getSubterm(0);
      term = sym2nonterm_0_0.instance.invoke(context, l_4244);
      if(term == null)
        break Fail25633;
      term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term}), generator.constCons4616});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}