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

@SuppressWarnings("all") public class $Builders_2_0 extends Strategy 
{ 
  public static $Builders_2_0 instance = new $Builders_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4409, Strategy n_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Builders_2_0");
    Fail26917:
    { 
      IStrategoTerm d_4678 = null;
      IStrategoTerm b_4678 = null;
      IStrategoTerm c_4678 = null;
      IStrategoTerm e_4678 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consBuilders_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26917;
      b_4678 = term.getSubterm(0);
      c_4678 = term.getSubterm(1);
      IStrategoList annos1014 = term.getAnnotations();
      d_4678 = annos1014;
      term = m_4409.invoke(context, b_4678);
      if(term == null)
        break Fail26917;
      e_4678 = term;
      term = n_4409.invoke(context, c_4678);
      if(term == null)
        break Fail26917;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consBuilders_2, new IStrategoTerm[]{e_4678, term}), checkListAnnos(termFactory, d_4678));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}