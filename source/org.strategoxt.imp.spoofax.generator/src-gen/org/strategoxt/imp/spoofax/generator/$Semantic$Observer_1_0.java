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

@SuppressWarnings("all") public class $Semantic$Observer_1_0 extends Strategy 
{ 
  public static $Semantic$Observer_1_0 instance = new $Semantic$Observer_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4410)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SemanticObserver_1_0");
    Fail26931:
    { 
      IStrategoTerm q_4680 = null;
      IStrategoTerm p_4680 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSemanticObserver_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26931;
      p_4680 = term.getSubterm(0);
      IStrategoList annos1028 = term.getAnnotations();
      q_4680 = annos1028;
      term = m_4410.invoke(context, p_4680);
      if(term == null)
        break Fail26931;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consSemanticObserver_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_4680));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}