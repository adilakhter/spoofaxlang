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

@SuppressWarnings("all") public class $References_2_0 extends Strategy 
{ 
  public static $References_2_0 instance = new $References_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4409, Strategy r_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("References_2_0");
    Fail26919:
    { 
      IStrategoTerm n_4678 = null;
      IStrategoTerm l_4678 = null;
      IStrategoTerm m_4678 = null;
      IStrategoTerm o_4678 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consReferences_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26919;
      l_4678 = term.getSubterm(0);
      m_4678 = term.getSubterm(1);
      IStrategoList annos1016 = term.getAnnotations();
      n_4678 = annos1016;
      term = q_4409.invoke(context, l_4678);
      if(term == null)
        break Fail26919;
      o_4678 = term;
      term = r_4409.invoke(context, m_4678);
      if(term == null)
        break Fail26919;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consReferences_2, new IStrategoTerm[]{o_4678, term}), checkListAnnos(termFactory, n_4678));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}