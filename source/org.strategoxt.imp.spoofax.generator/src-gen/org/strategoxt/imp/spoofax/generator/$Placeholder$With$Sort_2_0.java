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

@SuppressWarnings("all") public class $Placeholder$With$Sort_2_0 extends Strategy 
{ 
  public static $Placeholder$With$Sort_2_0 instance = new $Placeholder$With$Sort_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4407, Strategy l_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PlaceholderWithSort_2_0");
    Fail26863:
    { 
      IStrategoTerm p_4672 = null;
      IStrategoTerm n_4672 = null;
      IStrategoTerm o_4672 = null;
      IStrategoTerm q_4672 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPlaceholderWithSort_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26863;
      n_4672 = term.getSubterm(0);
      o_4672 = term.getSubterm(1);
      IStrategoList annos978 = term.getAnnotations();
      p_4672 = annos978;
      term = k_4407.invoke(context, n_4672);
      if(term == null)
        break Fail26863;
      q_4672 = term;
      term = l_4407.invoke(context, o_4672);
      if(term == null)
        break Fail26863;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consPlaceholderWithSort_2, new IStrategoTerm[]{q_4672, term}), checkListAnnos(termFactory, p_4672));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}