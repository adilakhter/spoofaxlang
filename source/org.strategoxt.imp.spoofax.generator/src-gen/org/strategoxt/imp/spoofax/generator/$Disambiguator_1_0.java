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

@SuppressWarnings("all") public class $Disambiguator_1_0 extends Strategy 
{ 
  public static $Disambiguator_1_0 instance = new $Disambiguator_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Disambiguator_1_0");
    Fail26904:
    { 
      IStrategoTerm n_4676 = null;
      IStrategoTerm m_4676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consDisambiguator_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26904;
      m_4676 = term.getSubterm(0);
      IStrategoList annos1001 = term.getAnnotations();
      n_4676 = annos1001;
      term = y_4408.invoke(context, m_4676);
      if(term == null)
        break Fail26904;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consDisambiguator_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, n_4676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}