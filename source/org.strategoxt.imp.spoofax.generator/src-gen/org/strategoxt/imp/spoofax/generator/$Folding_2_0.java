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

@SuppressWarnings("all") public class $Folding_2_0 extends Strategy 
{ 
  public static $Folding_2_0 instance = new $Folding_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4409, Strategy x_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Folding_2_0");
    Fail26922:
    { 
      IStrategoTerm c_4679 = null;
      IStrategoTerm a_4679 = null;
      IStrategoTerm b_4679 = null;
      IStrategoTerm d_4679 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFolding_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26922;
      a_4679 = term.getSubterm(0);
      b_4679 = term.getSubterm(1);
      IStrategoList annos1019 = term.getAnnotations();
      c_4679 = annos1019;
      term = w_4409.invoke(context, a_4679);
      if(term == null)
        break Fail26922;
      d_4679 = term;
      term = x_4409.invoke(context, b_4679);
      if(term == null)
        break Fail26922;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consFolding_2, new IStrategoTerm[]{d_4679, term}), checkListAnnos(termFactory, c_4679));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}