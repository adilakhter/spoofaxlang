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

@SuppressWarnings("all") public class $Completions_2_0 extends Strategy 
{ 
  public static $Completions_2_0 instance = new $Completions_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4409, Strategy p_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Completions_2_0");
    Fail26918:
    { 
      IStrategoTerm i_4678 = null;
      IStrategoTerm g_4678 = null;
      IStrategoTerm h_4678 = null;
      IStrategoTerm j_4678 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consCompletions_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26918;
      g_4678 = term.getSubterm(0);
      h_4678 = term.getSubterm(1);
      IStrategoList annos1015 = term.getAnnotations();
      i_4678 = annos1015;
      term = o_4409.invoke(context, g_4678);
      if(term == null)
        break Fail26918;
      j_4678 = term;
      term = p_4409.invoke(context, h_4678);
      if(term == null)
        break Fail26918;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consCompletions_2, new IStrategoTerm[]{j_4678, term}), checkListAnnos(termFactory, i_4678));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}