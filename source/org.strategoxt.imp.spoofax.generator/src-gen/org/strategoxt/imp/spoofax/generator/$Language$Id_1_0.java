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

@SuppressWarnings("all") public class $Language$Id_1_0 extends Strategy 
{ 
  public static $Language$Id_1_0 instance = new $Language$Id_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LanguageId_1_0");
    Fail26913:
    { 
      IStrategoTerm o_4677 = null;
      IStrategoTerm n_4677 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consLanguageId_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26913;
      n_4677 = term.getSubterm(0);
      IStrategoList annos1010 = term.getAnnotations();
      o_4677 = annos1010;
      term = h_4409.invoke(context, n_4677);
      if(term == null)
        break Fail26913;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consLanguageId_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_4677));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}