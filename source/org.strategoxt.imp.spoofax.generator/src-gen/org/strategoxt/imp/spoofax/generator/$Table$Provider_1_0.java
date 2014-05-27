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

@SuppressWarnings("all") public class $Table$Provider_1_0 extends Strategy 
{ 
  public static $Table$Provider_1_0 instance = new $Table$Provider_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TableProvider_1_0");
    Fail26910:
    { 
      IStrategoTerm f_4677 = null;
      IStrategoTerm e_4677 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consTableProvider_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26910;
      e_4677 = term.getSubterm(0);
      IStrategoList annos1007 = term.getAnnotations();
      f_4677 = annos1007;
      term = e_4409.invoke(context, e_4677);
      if(term == null)
        break Fail26910;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consTableProvider_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, f_4677));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}