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

@SuppressWarnings("all") public class $Token_1_0 extends Strategy 
{ 
  public static $Token_1_0 instance = new $Token_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Token_1_0");
    Fail26883:
    { 
      IStrategoTerm g_4673 = null;
      IStrategoTerm f_4673 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consToken_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26883;
      f_4673 = term.getSubterm(0);
      IStrategoList annos982 = term.getAnnotations();
      g_4673 = annos982;
      term = r_4407.invoke(context, f_4673);
      if(term == null)
        break Fail26883;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consToken_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_4673));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}