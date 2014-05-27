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

@SuppressWarnings("all") public class $Hover$Rule_2_0 extends Strategy 
{ 
  public static $Hover$Rule_2_0 instance = new $Hover$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4411, Strategy g_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("HoverRule_2_0");
    Fail26939:
    { 
      IStrategoTerm l_4682 = null;
      IStrategoTerm j_4682 = null;
      IStrategoTerm k_4682 = null;
      IStrategoTerm m_4682 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consHoverRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26939;
      j_4682 = term.getSubterm(0);
      k_4682 = term.getSubterm(1);
      IStrategoList annos1036 = term.getAnnotations();
      l_4682 = annos1036;
      term = f_4411.invoke(context, j_4682);
      if(term == null)
        break Fail26939;
      m_4682 = term;
      term = g_4411.invoke(context, k_4682);
      if(term == null)
        break Fail26939;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consHoverRule_2, new IStrategoTerm[]{m_4682, term}), checkListAnnos(termFactory, l_4682));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}