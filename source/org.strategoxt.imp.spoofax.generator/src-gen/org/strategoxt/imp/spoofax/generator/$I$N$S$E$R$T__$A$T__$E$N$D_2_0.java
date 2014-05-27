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

@SuppressWarnings("all") public class $I$N$S$E$R$T__$A$T__$E$N$D_2_0 extends Strategy 
{ 
  public static $I$N$S$E$R$T__$A$T__$E$N$D_2_0 instance = new $I$N$S$E$R$T__$A$T__$E$N$D_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4406, Strategy k_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("INSERT__AT__END_2_0");
    Fail26837:
    { 
      IStrategoTerm z_4669 = null;
      IStrategoTerm x_4669 = null;
      IStrategoTerm y_4669 = null;
      IStrategoTerm a_4670 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consINSERT_AT_END_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26837;
      x_4669 = term.getSubterm(0);
      y_4669 = term.getSubterm(1);
      IStrategoList annos964 = term.getAnnotations();
      z_4669 = annos964;
      term = j_4406.invoke(context, x_4669);
      if(term == null)
        break Fail26837;
      a_4670 = term;
      term = k_4406.invoke(context, y_4669);
      if(term == null)
        break Fail26837;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consINSERT_AT_END_2, new IStrategoTerm[]{a_4670, term}), checkListAnnos(termFactory, z_4669));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}