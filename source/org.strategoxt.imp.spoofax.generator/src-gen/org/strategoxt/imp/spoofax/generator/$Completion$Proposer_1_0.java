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

@SuppressWarnings("all") public class $Completion$Proposer_1_0 extends Strategy 
{ 
  public static $Completion$Proposer_1_0 instance = new $Completion$Proposer_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionProposer_1_0");
    Fail26937:
    { 
      IStrategoTerm c_4682 = null;
      IStrategoTerm b_4682 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consCompletionProposer_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26937;
      b_4682 = term.getSubterm(0);
      IStrategoList annos1034 = term.getAnnotations();
      c_4682 = annos1034;
      term = c_4411.invoke(context, b_4682);
      if(term == null)
        break Fail26937;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consCompletionProposer_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_4682));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}