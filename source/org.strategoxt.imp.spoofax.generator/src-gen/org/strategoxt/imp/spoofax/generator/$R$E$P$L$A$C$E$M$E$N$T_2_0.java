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

@SuppressWarnings("all") public class $R$E$P$L$A$C$E$M$E$N$T_2_0 extends Strategy 
{ 
  public static $R$E$P$L$A$C$E$M$E$N$T_2_0 instance = new $R$E$P$L$A$C$E$M$E$N$T_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4406, Strategy p_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("REPLACEMENT_2_0");
    Fail26840:
    { 
      IStrategoTerm m_4670 = null;
      IStrategoTerm k_4670 = null;
      IStrategoTerm l_4670 = null;
      IStrategoTerm n_4670 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consREPLACEMENT_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26840;
      k_4670 = term.getSubterm(0);
      l_4670 = term.getSubterm(1);
      IStrategoList annos967 = term.getAnnotations();
      m_4670 = annos967;
      term = o_4406.invoke(context, k_4670);
      if(term == null)
        break Fail26840;
      n_4670 = term;
      term = p_4406.invoke(context, l_4670);
      if(term == null)
        break Fail26840;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consREPLACEMENT_2, new IStrategoTerm[]{n_4670, term}), checkListAnnos(termFactory, m_4670));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}