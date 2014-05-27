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

@SuppressWarnings("all") public class $Reference$Rule_2_0 extends Strategy 
{ 
  public static $Reference$Rule_2_0 instance = new $Reference$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4411, Strategy i_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ReferenceRule_2_0");
    Fail26940:
    { 
      IStrategoTerm q_4682 = null;
      IStrategoTerm o_4682 = null;
      IStrategoTerm p_4682 = null;
      IStrategoTerm r_4682 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consReferenceRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26940;
      o_4682 = term.getSubterm(0);
      p_4682 = term.getSubterm(1);
      IStrategoList annos1037 = term.getAnnotations();
      q_4682 = annos1037;
      term = h_4411.invoke(context, o_4682);
      if(term == null)
        break Fail26940;
      r_4682 = term;
      term = i_4411.invoke(context, p_4682);
      if(term == null)
        break Fail26940;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consReferenceRule_2, new IStrategoTerm[]{r_4682, term}), checkListAnnos(termFactory, q_4682));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}