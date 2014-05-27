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

@SuppressWarnings("all") public class $Fold$Rule$All_2_0 extends Strategy 
{ 
  public static $Fold$Rule$All_2_0 instance = new $Fold$Rule$All_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4408, Strategy k_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FoldRuleAll_2_0");
    Fail26893:
    { 
      IStrategoTerm a_4675 = null;
      IStrategoTerm y_4674 = null;
      IStrategoTerm z_4674 = null;
      IStrategoTerm b_4675 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFoldRuleAll_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26893;
      y_4674 = term.getSubterm(0);
      z_4674 = term.getSubterm(1);
      IStrategoList annos991 = term.getAnnotations();
      a_4675 = annos991;
      term = j_4408.invoke(context, y_4674);
      if(term == null)
        break Fail26893;
      b_4675 = term;
      term = k_4408.invoke(context, z_4674);
      if(term == null)
        break Fail26893;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consFoldRuleAll_2, new IStrategoTerm[]{b_4675, term}), checkListAnnos(termFactory, a_4675));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}