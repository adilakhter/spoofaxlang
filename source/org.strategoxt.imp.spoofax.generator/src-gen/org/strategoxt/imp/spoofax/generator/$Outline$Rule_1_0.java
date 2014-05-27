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

@SuppressWarnings("all") public class $Outline$Rule_1_0 extends Strategy 
{ 
  public static $Outline$Rule_1_0 instance = new $Outline$Rule_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OutlineRule_1_0");
    Fail26891:
    { 
      IStrategoTerm w_4674 = null;
      IStrategoTerm v_4674 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consOutlineRule_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26891;
      v_4674 = term.getSubterm(0);
      IStrategoList annos990 = term.getAnnotations();
      w_4674 = annos990;
      term = i_4408.invoke(context, v_4674);
      if(term == null)
        break Fail26891;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consOutlineRule_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_4674));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}