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

@SuppressWarnings("all") public class $Document_3_0 extends Strategy 
{ 
  public static $Document_3_0 instance = new $Document_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4404, Strategy l_4404, Strategy m_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Document_3_0");
    Fail26796:
    { 
      IStrategoTerm r_4664 = null;
      IStrategoTerm o_4664 = null;
      IStrategoTerm p_4664 = null;
      IStrategoTerm q_4664 = null;
      IStrategoTerm s_4664 = null;
      IStrategoTerm t_4664 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consDocument_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26796;
      o_4664 = term.getSubterm(0);
      p_4664 = term.getSubterm(1);
      q_4664 = term.getSubterm(2);
      IStrategoList annos927 = term.getAnnotations();
      r_4664 = annos927;
      term = k_4404.invoke(context, o_4664);
      if(term == null)
        break Fail26796;
      s_4664 = term;
      term = l_4404.invoke(context, p_4664);
      if(term == null)
        break Fail26796;
      t_4664 = term;
      term = m_4404.invoke(context, q_4664);
      if(term == null)
        break Fail26796;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consDocument_3, new IStrategoTerm[]{s_4664, t_4664, term}), checkListAnnos(termFactory, r_4664));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}