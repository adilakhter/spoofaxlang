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

@SuppressWarnings("all") public class $Completion$Template$With$Sort_4_0 extends Strategy 
{ 
  public static $Completion$Template$With$Sort_4_0 instance = new $Completion$Template$With$Sort_4_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4410, Strategy u_4410, Strategy v_4410, Strategy w_4410)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CompletionTemplateWithSort_4_0");
    Fail26934:
    { 
      IStrategoTerm k_4681 = null;
      IStrategoTerm g_4681 = null;
      IStrategoTerm h_4681 = null;
      IStrategoTerm i_4681 = null;
      IStrategoTerm j_4681 = null;
      IStrategoTerm l_4681 = null;
      IStrategoTerm m_4681 = null;
      IStrategoTerm n_4681 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consCompletionTemplateWithSort_4 != ((IStrategoAppl)term).getConstructor())
        break Fail26934;
      g_4681 = term.getSubterm(0);
      h_4681 = term.getSubterm(1);
      i_4681 = term.getSubterm(2);
      j_4681 = term.getSubterm(3);
      IStrategoList annos1031 = term.getAnnotations();
      k_4681 = annos1031;
      term = t_4410.invoke(context, g_4681);
      if(term == null)
        break Fail26934;
      l_4681 = term;
      term = u_4410.invoke(context, h_4681);
      if(term == null)
        break Fail26934;
      m_4681 = term;
      term = v_4410.invoke(context, i_4681);
      if(term == null)
        break Fail26934;
      n_4681 = term;
      term = w_4410.invoke(context, j_4681);
      if(term == null)
        break Fail26934;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consCompletionTemplateWithSort_4, new IStrategoTerm[]{l_4681, m_4681, n_4681, term}), checkListAnnos(termFactory, k_4681));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}