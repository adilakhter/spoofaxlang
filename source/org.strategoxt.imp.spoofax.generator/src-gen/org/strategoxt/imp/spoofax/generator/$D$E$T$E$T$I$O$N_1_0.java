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

@SuppressWarnings("all") public class $D$E$T$E$T$I$O$N_1_0 extends Strategy 
{ 
  public static $D$E$T$E$T$I$O$N_1_0 instance = new $D$E$T$E$T$I$O$N_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DETETION_1_0");
    Fail26839:
    { 
      IStrategoTerm i_4670 = null;
      IStrategoTerm h_4670 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consDETETION_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26839;
      h_4670 = term.getSubterm(0);
      IStrategoList annos966 = term.getAnnotations();
      i_4670 = annos966;
      term = n_4406.invoke(context, h_4670);
      if(term == null)
        break Fail26839;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consDETETION_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_4670));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}