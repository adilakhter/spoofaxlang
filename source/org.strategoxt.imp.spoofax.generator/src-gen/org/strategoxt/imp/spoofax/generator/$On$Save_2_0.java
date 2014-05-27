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

@SuppressWarnings("all") public class $On$Save_2_0 extends Strategy 
{ 
  public static $On$Save_2_0 instance = new $On$Save_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy m_4411, Strategy n_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("OnSave_2_0");
    Fail26942:
    { 
      IStrategoTerm c_4683 = null;
      IStrategoTerm a_4683 = null;
      IStrategoTerm b_4683 = null;
      IStrategoTerm d_4683 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consOnSave_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26942;
      a_4683 = term.getSubterm(0);
      b_4683 = term.getSubterm(1);
      IStrategoList annos1039 = term.getAnnotations();
      c_4683 = annos1039;
      term = m_4411.invoke(context, a_4683);
      if(term == null)
        break Fail26942;
      d_4683 = term;
      term = n_4411.invoke(context, b_4683);
      if(term == null)
        break Fail26942;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consOnSave_2, new IStrategoTerm[]{d_4683, term}), checkListAnnos(termFactory, c_4683));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}