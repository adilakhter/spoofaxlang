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

@SuppressWarnings("all") public class $Completion$Template_3_0 extends Strategy 
{ 
  public static $Completion$Template_3_0 instance = new $Completion$Template_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_4410, Strategy y_4410, Strategy z_4410)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionTemplate_3_0");
    Fail26935:
    { 
      IStrategoTerm s_4681 = null;
      IStrategoTerm p_4681 = null;
      IStrategoTerm q_4681 = null;
      IStrategoTerm r_4681 = null;
      IStrategoTerm t_4681 = null;
      IStrategoTerm u_4681 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consCompletionTemplate_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26935;
      p_4681 = term.getSubterm(0);
      q_4681 = term.getSubterm(1);
      r_4681 = term.getSubterm(2);
      IStrategoList annos1032 = term.getAnnotations();
      s_4681 = annos1032;
      term = x_4410.invoke(context, p_4681);
      if(term == null)
        break Fail26935;
      t_4681 = term;
      term = y_4410.invoke(context, q_4681);
      if(term == null)
        break Fail26935;
      u_4681 = term;
      term = z_4410.invoke(context, r_4681);
      if(term == null)
        break Fail26935;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consCompletionTemplate_3, new IStrategoTerm[]{t_4681, u_4681, term}), checkListAnnos(termFactory, s_4681));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}