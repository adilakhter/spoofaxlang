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

@SuppressWarnings("all") public class $Prefix_1_0 extends Strategy 
{ 
  public static $Prefix_1_0 instance = new $Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Prefix_1_0");
    Fail26823:
    { 
      IStrategoTerm o_4668 = null;
      IStrategoTerm n_4668 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPrefix_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26823;
      n_4668 = term.getSubterm(0);
      IStrategoList annos954 = term.getAnnotations();
      o_4668 = annos954;
      term = w_4405.invoke(context, n_4668);
      if(term == null)
        break Fail26823;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consPrefix_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_4668));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}