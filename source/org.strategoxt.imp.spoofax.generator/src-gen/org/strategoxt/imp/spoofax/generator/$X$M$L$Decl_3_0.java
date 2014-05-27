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

@SuppressWarnings("all") public class $X$M$L$Decl_3_0 extends Strategy 
{ 
  public static $X$M$L$Decl_3_0 instance = new $X$M$L$Decl_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4405, Strategy l_4405, Strategy m_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("XMLDecl_3_0");
    Fail26817:
    { 
      IStrategoTerm m_4667 = null;
      IStrategoTerm j_4667 = null;
      IStrategoTerm k_4667 = null;
      IStrategoTerm l_4667 = null;
      IStrategoTerm n_4667 = null;
      IStrategoTerm o_4667 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consXMLDecl_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26817;
      j_4667 = term.getSubterm(0);
      k_4667 = term.getSubterm(1);
      l_4667 = term.getSubterm(2);
      IStrategoList annos948 = term.getAnnotations();
      m_4667 = annos948;
      term = k_4405.invoke(context, j_4667);
      if(term == null)
        break Fail26817;
      n_4667 = term;
      term = l_4405.invoke(context, k_4667);
      if(term == null)
        break Fail26817;
      o_4667 = term;
      term = m_4405.invoke(context, l_4667);
      if(term == null)
        break Fail26817;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consXMLDecl_3, new IStrategoTerm[]{n_4667, o_4667, term}), checkListAnnos(termFactory, m_4667));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}