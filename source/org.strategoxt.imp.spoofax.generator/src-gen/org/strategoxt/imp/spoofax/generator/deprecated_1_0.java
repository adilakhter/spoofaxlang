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

@SuppressWarnings("all") public class deprecated_1_0 extends Strategy 
{ 
  public static deprecated_1_0 instance = new deprecated_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("deprecated_1_0");
    Fail26845:
    { 
      IStrategoTerm l_4671 = null;
      IStrategoTerm k_4671 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consdeprecated_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26845;
      k_4671 = term.getSubterm(0);
      IStrategoList annos971 = term.getAnnotations();
      l_4671 = annos971;
      term = z_4406.invoke(context, k_4671);
      if(term == null)
        break Fail26845;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consdeprecated_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_4671));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}