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

@SuppressWarnings("all") public class $I$N$S$E$R$T__$B$E$F$O$R$E_2_0 extends Strategy 
{ 
  public static $I$N$S$E$R$T__$B$E$F$O$R$E_2_0 instance = new $I$N$S$E$R$T__$B$E$F$O$R$E_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4406, Strategy m_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("INSERT__BEFORE_2_0");
    Fail26838:
    { 
      IStrategoTerm e_4670 = null;
      IStrategoTerm c_4670 = null;
      IStrategoTerm d_4670 = null;
      IStrategoTerm f_4670 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consINSERT_BEFORE_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26838;
      c_4670 = term.getSubterm(0);
      d_4670 = term.getSubterm(1);
      IStrategoList annos965 = term.getAnnotations();
      e_4670 = annos965;
      term = l_4406.invoke(context, c_4670);
      if(term == null)
        break Fail26838;
      f_4670 = term;
      term = m_4406.invoke(context, d_4670);
      if(term == null)
        break Fail26838;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consINSERT_BEFORE_2, new IStrategoTerm[]{f_4670, term}), checkListAnnos(termFactory, e_4670));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}