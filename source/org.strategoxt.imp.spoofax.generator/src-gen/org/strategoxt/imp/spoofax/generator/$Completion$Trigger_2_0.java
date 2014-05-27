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

@SuppressWarnings("all") public class $Completion$Trigger_2_0 extends Strategy 
{ 
  public static $Completion$Trigger_2_0 instance = new $Completion$Trigger_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4410, Strategy s_4410)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionTrigger_2_0");
    Fail26933:
    { 
      IStrategoTerm d_4681 = null;
      IStrategoTerm b_4681 = null;
      IStrategoTerm c_4681 = null;
      IStrategoTerm e_4681 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consCompletionTrigger_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26933;
      b_4681 = term.getSubterm(0);
      c_4681 = term.getSubterm(1);
      IStrategoList annos1030 = term.getAnnotations();
      d_4681 = annos1030;
      term = r_4410.invoke(context, b_4681);
      if(term == null)
        break Fail26933;
      e_4681 = term;
      term = s_4410.invoke(context, c_4681);
      if(term == null)
        break Fail26933;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consCompletionTrigger_2, new IStrategoTerm[]{e_4681, term}), checkListAnnos(termFactory, d_4681));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}