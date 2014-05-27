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

@SuppressWarnings("all") public class $Line$Comment$Prefix_1_0 extends Strategy 
{ 
  public static $Line$Comment$Prefix_1_0 instance = new $Line$Comment$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("LineCommentPrefix_1_0");
    Fail26903:
    { 
      IStrategoTerm k_4676 = null;
      IStrategoTerm j_4676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consLineCommentPrefix_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26903;
      j_4676 = term.getSubterm(0);
      IStrategoList annos1000 = term.getAnnotations();
      k_4676 = annos1000;
      term = x_4408.invoke(context, j_4676);
      if(term == null)
        break Fail26903;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consLineCommentPrefix_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, k_4676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}