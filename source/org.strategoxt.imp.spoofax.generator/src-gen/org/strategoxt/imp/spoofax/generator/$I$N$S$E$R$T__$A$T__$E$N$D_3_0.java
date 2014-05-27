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

@SuppressWarnings("all") public class $I$N$S$E$R$T__$A$T__$E$N$D_3_0 extends Strategy 
{ 
  public static $I$N$S$E$R$T__$A$T__$E$N$D_3_0 instance = new $I$N$S$E$R$T__$A$T__$E$N$D_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4406, Strategy r_4406, Strategy s_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("INSERT__AT__END_3_0");
    Fail26841:
    { 
      IStrategoTerm s_4670 = null;
      IStrategoTerm p_4670 = null;
      IStrategoTerm q_4670 = null;
      IStrategoTerm r_4670 = null;
      IStrategoTerm t_4670 = null;
      IStrategoTerm u_4670 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consINSERT_AT_END_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26841;
      p_4670 = term.getSubterm(0);
      q_4670 = term.getSubterm(1);
      r_4670 = term.getSubterm(2);
      IStrategoList annos968 = term.getAnnotations();
      s_4670 = annos968;
      term = q_4406.invoke(context, p_4670);
      if(term == null)
        break Fail26841;
      t_4670 = term;
      term = r_4406.invoke(context, q_4670);
      if(term == null)
        break Fail26841;
      u_4670 = term;
      term = s_4406.invoke(context, r_4670);
      if(term == null)
        break Fail26841;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consINSERT_AT_END_3, new IStrategoTerm[]{t_4670, u_4670, term}), checkListAnnos(termFactory, s_4670));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}