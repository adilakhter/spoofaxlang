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

@SuppressWarnings("all") public class $Values_1_0 extends Strategy 
{ 
  public static $Values_1_0 instance = new $Values_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Values_1_0");
    Fail26915:
    { 
      IStrategoTerm u_4677 = null;
      IStrategoTerm t_4677 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consValues_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26915;
      t_4677 = term.getSubterm(0);
      IStrategoList annos1012 = term.getAnnotations();
      u_4677 = annos1012;
      term = j_4409.invoke(context, t_4677);
      if(term == null)
        break Fail26915;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consValues_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_4677));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}