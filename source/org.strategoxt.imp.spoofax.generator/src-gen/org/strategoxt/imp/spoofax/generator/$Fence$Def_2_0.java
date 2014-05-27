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

@SuppressWarnings("all") public class $Fence$Def_2_0 extends Strategy 
{ 
  public static $Fence$Def_2_0 instance = new $Fence$Def_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4408, Strategy p_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FenceDef_2_0");
    Fail26896:
    { 
      IStrategoTerm n_4675 = null;
      IStrategoTerm l_4675 = null;
      IStrategoTerm m_4675 = null;
      IStrategoTerm o_4675 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFenceDef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26896;
      l_4675 = term.getSubterm(0);
      m_4675 = term.getSubterm(1);
      IStrategoList annos994 = term.getAnnotations();
      n_4675 = annos994;
      term = o_4408.invoke(context, l_4675);
      if(term == null)
        break Fail26896;
      o_4675 = term;
      term = p_4408.invoke(context, m_4675);
      if(term == null)
        break Fail26896;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consFenceDef_2, new IStrategoTerm[]{o_4675, term}), checkListAnnos(termFactory, n_4675));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}