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

@SuppressWarnings("all") public class $Empty$Element_2_0 extends Strategy 
{ 
  public static $Empty$Element_2_0 instance = new $Empty$Element_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy i_4404, Strategy j_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EmptyElement_2_0");
    Fail26795:
    { 
      IStrategoTerm l_4664 = null;
      IStrategoTerm j_4664 = null;
      IStrategoTerm k_4664 = null;
      IStrategoTerm m_4664 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consEmptyElement_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26795;
      j_4664 = term.getSubterm(0);
      k_4664 = term.getSubterm(1);
      IStrategoList annos926 = term.getAnnotations();
      l_4664 = annos926;
      term = i_4404.invoke(context, j_4664);
      if(term == null)
        break Fail26795;
      m_4664 = term;
      term = j_4404.invoke(context, k_4664);
      if(term == null)
        break Fail26795;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consEmptyElement_2, new IStrategoTerm[]{m_4664, term}), checkListAnnos(termFactory, l_4664));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}