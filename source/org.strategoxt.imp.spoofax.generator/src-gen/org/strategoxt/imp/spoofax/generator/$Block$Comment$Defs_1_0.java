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

@SuppressWarnings("all") public class $Block$Comment$Defs_1_0 extends Strategy 
{ 
  public static $Block$Comment$Defs_1_0 instance = new $Block$Comment$Defs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("BlockCommentDefs_1_0");
    Fail26902:
    { 
      IStrategoTerm h_4676 = null;
      IStrategoTerm g_4676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consBlockCommentDefs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26902;
      g_4676 = term.getSubterm(0);
      IStrategoList annos999 = term.getAnnotations();
      h_4676 = annos999;
      term = w_4408.invoke(context, g_4676);
      if(term == null)
        break Fail26902;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consBlockCommentDefs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_4676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}