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

@SuppressWarnings("all") public class $Start$Symbols_1_0 extends Strategy 
{ 
  public static $Start$Symbols_1_0 instance = new $Start$Symbols_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StartSymbols_1_0");
    Fail26909:
    { 
      IStrategoTerm c_4677 = null;
      IStrategoTerm b_4677 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consStartSymbols_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26909;
      b_4677 = term.getSubterm(0);
      IStrategoList annos1006 = term.getAnnotations();
      c_4677 = annos1006;
      term = d_4409.invoke(context, b_4677);
      if(term == null)
        break Fail26909;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consStartSymbols_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_4677));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}