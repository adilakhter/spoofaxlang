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

@SuppressWarnings("all") public class $Import$Renamed_2_0 extends Strategy 
{ 
  public static $Import$Renamed_2_0 instance = new $Import$Renamed_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy d_4407, Strategy e_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ImportRenamed_2_0");
    Fail26849:
    { 
      IStrategoTerm x_4671 = null;
      IStrategoTerm v_4671 = null;
      IStrategoTerm w_4671 = null;
      IStrategoTerm y_4671 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImportRenamed_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26849;
      v_4671 = term.getSubterm(0);
      w_4671 = term.getSubterm(1);
      IStrategoList annos974 = term.getAnnotations();
      x_4671 = annos974;
      term = d_4407.invoke(context, v_4671);
      if(term == null)
        break Fail26849;
      y_4671 = term;
      term = e_4407.invoke(context, w_4671);
      if(term == null)
        break Fail26849;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consImportRenamed_2, new IStrategoTerm[]{y_4671, term}), checkListAnnos(termFactory, x_4671));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}