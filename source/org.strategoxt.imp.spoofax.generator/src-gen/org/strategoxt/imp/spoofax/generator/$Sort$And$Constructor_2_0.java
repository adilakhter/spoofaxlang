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

@SuppressWarnings("all") public class $Sort$And$Constructor_2_0 extends Strategy 
{ 
  public static $Sort$And$Constructor_2_0 instance = new $Sort$And$Constructor_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4411, Strategy q_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SortAndConstructor_2_0");
    Fail26944:
    { 
      IStrategoTerm k_4683 = null;
      IStrategoTerm i_4683 = null;
      IStrategoTerm j_4683 = null;
      IStrategoTerm l_4683 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSortAndConstructor_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26944;
      i_4683 = term.getSubterm(0);
      j_4683 = term.getSubterm(1);
      IStrategoList annos1041 = term.getAnnotations();
      k_4683 = annos1041;
      term = p_4411.invoke(context, i_4683);
      if(term == null)
        break Fail26944;
      l_4683 = term;
      term = q_4411.invoke(context, j_4683);
      if(term == null)
        break Fail26944;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consSortAndConstructor_2, new IStrategoTerm[]{l_4683, term}), checkListAnnos(termFactory, k_4683));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}