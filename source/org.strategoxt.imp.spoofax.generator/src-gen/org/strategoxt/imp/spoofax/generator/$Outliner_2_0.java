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

@SuppressWarnings("all") public class $Outliner_2_0 extends Strategy 
{ 
  public static $Outliner_2_0 instance = new $Outliner_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy u_4409, Strategy v_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Outliner_2_0");
    Fail26921:
    { 
      IStrategoTerm x_4678 = null;
      IStrategoTerm v_4678 = null;
      IStrategoTerm w_4678 = null;
      IStrategoTerm y_4678 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consOutliner_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26921;
      v_4678 = term.getSubterm(0);
      w_4678 = term.getSubterm(1);
      IStrategoList annos1018 = term.getAnnotations();
      x_4678 = annos1018;
      term = u_4409.invoke(context, v_4678);
      if(term == null)
        break Fail26921;
      y_4678 = term;
      term = v_4409.invoke(context, w_4678);
      if(term == null)
        break Fail26921;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consOutliner_2, new IStrategoTerm[]{y_4678, term}), checkListAnnos(termFactory, x_4678));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}