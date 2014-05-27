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

@SuppressWarnings("all") public class $Include$Path$Name_1_0 extends Strategy 
{ 
  public static $Include$Path$Name_1_0 instance = new $Include$Path$Name_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IncludePathName_1_0");
    Fail26831:
    { 
      IStrategoTerm h_4669 = null;
      IStrategoTerm g_4669 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludePathName_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26831;
      g_4669 = term.getSubterm(0);
      IStrategoList annos959 = term.getAnnotations();
      h_4669 = annos959;
      term = d_4406.invoke(context, g_4669);
      if(term == null)
        break Fail26831;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consIncludePathName_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_4669));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}