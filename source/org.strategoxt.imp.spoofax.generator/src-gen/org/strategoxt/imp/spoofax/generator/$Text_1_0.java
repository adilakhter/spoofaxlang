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

@SuppressWarnings("all") public class $Text_1_0 extends Strategy 
{ 
  public static $Text_1_0 instance = new $Text_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Text_1_0");
    Fail26805:
    { 
      IStrategoTerm w_4665 = null;
      IStrategoTerm v_4665 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consText_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26805;
      v_4665 = term.getSubterm(0);
      IStrategoList annos936 = term.getAnnotations();
      w_4665 = annos936;
      term = w_4404.invoke(context, v_4665);
      if(term == null)
        break Fail26805;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consText_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_4665));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}