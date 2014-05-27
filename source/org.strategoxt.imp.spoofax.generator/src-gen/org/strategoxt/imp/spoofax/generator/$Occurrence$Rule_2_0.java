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

@SuppressWarnings("all") public class $Occurrence$Rule_2_0 extends Strategy 
{ 
  public static $Occurrence$Rule_2_0 instance = new $Occurrence$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4411, Strategy e_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OccurrenceRule_2_0");
    Fail26938:
    { 
      IStrategoTerm g_4682 = null;
      IStrategoTerm e_4682 = null;
      IStrategoTerm f_4682 = null;
      IStrategoTerm h_4682 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consOccurrenceRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26938;
      e_4682 = term.getSubterm(0);
      f_4682 = term.getSubterm(1);
      IStrategoList annos1035 = term.getAnnotations();
      g_4682 = annos1035;
      term = d_4411.invoke(context, e_4682);
      if(term == null)
        break Fail26938;
      h_4682 = term;
      term = e_4411.invoke(context, f_4682);
      if(term == null)
        break Fail26938;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consOccurrenceRule_2, new IStrategoTerm[]{h_4682, term}), checkListAnnos(termFactory, g_4682));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}