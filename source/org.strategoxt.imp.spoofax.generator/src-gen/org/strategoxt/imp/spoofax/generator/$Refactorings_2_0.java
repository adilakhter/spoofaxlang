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

@SuppressWarnings("all") public class $Refactorings_2_0 extends Strategy 
{ 
  public static $Refactorings_2_0 instance = new $Refactorings_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4409, Strategy l_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Refactorings_2_0");
    Fail26916:
    { 
      IStrategoTerm y_4677 = null;
      IStrategoTerm w_4677 = null;
      IStrategoTerm x_4677 = null;
      IStrategoTerm z_4677 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRefactorings_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26916;
      w_4677 = term.getSubterm(0);
      x_4677 = term.getSubterm(1);
      IStrategoList annos1013 = term.getAnnotations();
      y_4677 = annos1013;
      term = k_4409.invoke(context, w_4677);
      if(term == null)
        break Fail26916;
      z_4677 = term;
      term = l_4409.invoke(context, x_4677);
      if(term == null)
        break Fail26916;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consRefactorings_2, new IStrategoTerm[]{z_4677, term}), checkListAnnos(termFactory, y_4677));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}