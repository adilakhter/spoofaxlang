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

@SuppressWarnings("all") public class $I$N$S$E$R$T__$B$E$F$O$R$E_3_0 extends Strategy 
{ 
  public static $I$N$S$E$R$T__$B$E$F$O$R$E_3_0 instance = new $I$N$S$E$R$T__$B$E$F$O$R$E_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4406, Strategy u_4406, Strategy v_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("INSERT__BEFORE_3_0");
    Fail26842:
    { 
      IStrategoTerm z_4670 = null;
      IStrategoTerm w_4670 = null;
      IStrategoTerm x_4670 = null;
      IStrategoTerm y_4670 = null;
      IStrategoTerm a_4671 = null;
      IStrategoTerm b_4671 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consINSERT_BEFORE_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26842;
      w_4670 = term.getSubterm(0);
      x_4670 = term.getSubterm(1);
      y_4670 = term.getSubterm(2);
      IStrategoList annos969 = term.getAnnotations();
      z_4670 = annos969;
      term = t_4406.invoke(context, w_4670);
      if(term == null)
        break Fail26842;
      a_4671 = term;
      term = u_4406.invoke(context, x_4670);
      if(term == null)
        break Fail26842;
      b_4671 = term;
      term = v_4406.invoke(context, y_4670);
      if(term == null)
        break Fail26842;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consINSERT_BEFORE_3, new IStrategoTerm[]{a_4671, b_4671, term}), checkListAnnos(termFactory, z_4670));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}