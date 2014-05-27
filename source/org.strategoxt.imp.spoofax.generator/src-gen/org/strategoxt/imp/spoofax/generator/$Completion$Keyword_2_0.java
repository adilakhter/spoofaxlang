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

@SuppressWarnings("all") public class $Completion$Keyword_2_0 extends Strategy 
{ 
  public static $Completion$Keyword_2_0 instance = new $Completion$Keyword_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4411, Strategy b_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionKeyword_2_0");
    Fail26936:
    { 
      IStrategoTerm y_4681 = null;
      IStrategoTerm w_4681 = null;
      IStrategoTerm x_4681 = null;
      IStrategoTerm z_4681 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consCompletionKeyword_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26936;
      w_4681 = term.getSubterm(0);
      x_4681 = term.getSubterm(1);
      IStrategoList annos1033 = term.getAnnotations();
      y_4681 = annos1033;
      term = a_4411.invoke(context, w_4681);
      if(term == null)
        break Fail26936;
      z_4681 = term;
      term = b_4411.invoke(context, x_4681);
      if(term == null)
        break Fail26936;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consCompletionKeyword_2, new IStrategoTerm[]{z_4681, term}), checkListAnnos(termFactory, y_4681));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}