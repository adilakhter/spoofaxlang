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

@SuppressWarnings("all") public class $Semantic$Provider_1_0 extends Strategy 
{ 
  public static $Semantic$Provider_1_0 instance = new $Semantic$Provider_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SemanticProvider_1_0");
    Fail26943:
    { 
      IStrategoTerm g_4683 = null;
      IStrategoTerm f_4683 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSemanticProvider_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26943;
      f_4683 = term.getSubterm(0);
      IStrategoList annos1040 = term.getAnnotations();
      g_4683 = annos1040;
      term = o_4411.invoke(context, f_4683);
      if(term == null)
        break Fail26943;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consSemanticProvider_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_4683));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}