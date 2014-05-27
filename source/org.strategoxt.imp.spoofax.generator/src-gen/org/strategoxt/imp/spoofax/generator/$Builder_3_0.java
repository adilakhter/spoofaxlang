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

@SuppressWarnings("all") public class $Builder_3_0 extends Strategy 
{ 
  public static $Builder_3_0 instance = new $Builder_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4410, Strategy k_4410, Strategy l_4410)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Builder_3_0");
    Fail26930:
    { 
      IStrategoTerm l_4680 = null;
      IStrategoTerm i_4680 = null;
      IStrategoTerm j_4680 = null;
      IStrategoTerm k_4680 = null;
      IStrategoTerm m_4680 = null;
      IStrategoTerm n_4680 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consBuilder_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26930;
      i_4680 = term.getSubterm(0);
      j_4680 = term.getSubterm(1);
      k_4680 = term.getSubterm(2);
      IStrategoList annos1027 = term.getAnnotations();
      l_4680 = annos1027;
      term = j_4410.invoke(context, i_4680);
      if(term == null)
        break Fail26930;
      m_4680 = term;
      term = k_4410.invoke(context, j_4680);
      if(term == null)
        break Fail26930;
      n_4680 = term;
      term = l_4410.invoke(context, k_4680);
      if(term == null)
        break Fail26930;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consBuilder_3, new IStrategoTerm[]{m_4680, n_4680, term}), checkListAnnos(termFactory, l_4680));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}