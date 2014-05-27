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

@SuppressWarnings("all") public class $Colorer_2_0 extends Strategy 
{ 
  public static $Colorer_2_0 instance = new $Colorer_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4409, Strategy t_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Colorer_2_0");
    Fail26920:
    { 
      IStrategoTerm s_4678 = null;
      IStrategoTerm q_4678 = null;
      IStrategoTerm r_4678 = null;
      IStrategoTerm t_4678 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consColorer_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26920;
      q_4678 = term.getSubterm(0);
      r_4678 = term.getSubterm(1);
      IStrategoList annos1017 = term.getAnnotations();
      s_4678 = annos1017;
      term = s_4409.invoke(context, q_4678);
      if(term == null)
        break Fail26920;
      t_4678 = term;
      term = t_4409.invoke(context, r_4678);
      if(term == null)
        break Fail26920;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consColorer_2, new IStrategoTerm[]{t_4678, term}), checkListAnnos(termFactory, s_4678));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}