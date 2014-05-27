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

@SuppressWarnings("all") public class $Literal_1_0 extends Strategy 
{ 
  public static $Literal_1_0 instance = new $Literal_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Literal_1_0");
    Fail26797:
    { 
      IStrategoTerm w_4664 = null;
      IStrategoTerm v_4664 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consLiteral_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26797;
      v_4664 = term.getSubterm(0);
      IStrategoList annos928 = term.getAnnotations();
      w_4664 = annos928;
      term = n_4404.invoke(context, v_4664);
      if(term == null)
        break Fail26797;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consLiteral_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_4664));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}