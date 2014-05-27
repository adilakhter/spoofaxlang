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

@SuppressWarnings("all") public class $Extends_1_0 extends Strategy 
{ 
  public static $Extends_1_0 instance = new $Extends_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Extends_1_0");
    Fail26907:
    { 
      IStrategoTerm w_4676 = null;
      IStrategoTerm v_4676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consExtends_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26907;
      v_4676 = term.getSubterm(0);
      IStrategoList annos1004 = term.getAnnotations();
      w_4676 = annos1004;
      term = b_4409.invoke(context, v_4676);
      if(term == null)
        break Fail26907;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consExtends_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_4676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}