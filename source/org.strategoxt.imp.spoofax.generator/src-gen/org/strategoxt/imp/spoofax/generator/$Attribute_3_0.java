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

@SuppressWarnings("all") public class $Attribute_3_0 extends Strategy 
{ 
  public static $Attribute_3_0 instance = new $Attribute_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4407, Strategy u_4407, Strategy v_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Attribute_3_0");
    Fail26885:
    { 
      IStrategoTerm o_4673 = null;
      IStrategoTerm l_4673 = null;
      IStrategoTerm m_4673 = null;
      IStrategoTerm n_4673 = null;
      IStrategoTerm p_4673 = null;
      IStrategoTerm q_4673 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAttribute_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26885;
      l_4673 = term.getSubterm(0);
      m_4673 = term.getSubterm(1);
      n_4673 = term.getSubterm(2);
      IStrategoList annos984 = term.getAnnotations();
      o_4673 = annos984;
      term = t_4407.invoke(context, l_4673);
      if(term == null)
        break Fail26885;
      p_4673 = term;
      term = u_4407.invoke(context, m_4673);
      if(term == null)
        break Fail26885;
      q_4673 = term;
      term = v_4407.invoke(context, n_4673);
      if(term == null)
        break Fail26885;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consAttribute_3, new IStrategoTerm[]{p_4673, q_4673, term}), checkListAnnos(termFactory, o_4673));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}