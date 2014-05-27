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

@SuppressWarnings("all") public class $Fold$Rule_2_0 extends Strategy 
{ 
  public static $Fold$Rule_2_0 instance = new $Fold$Rule_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy l_4408, Strategy m_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FoldRule_2_0");
    Fail26894:
    { 
      IStrategoTerm f_4675 = null;
      IStrategoTerm d_4675 = null;
      IStrategoTerm e_4675 = null;
      IStrategoTerm g_4675 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFoldRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26894;
      d_4675 = term.getSubterm(0);
      e_4675 = term.getSubterm(1);
      IStrategoList annos992 = term.getAnnotations();
      f_4675 = annos992;
      term = l_4408.invoke(context, d_4675);
      if(term == null)
        break Fail26894;
      g_4675 = term;
      term = m_4408.invoke(context, e_4675);
      if(term == null)
        break Fail26894;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consFoldRule_2, new IStrategoTerm[]{g_4675, term}), checkListAnnos(termFactory, f_4675));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}