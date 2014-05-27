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

@SuppressWarnings("all") public class $System$External$I$D_1_0 extends Strategy 
{ 
  public static $System$External$I$D_1_0 instance = new $System$External$I$D_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SystemExternalID_1_0");
    Fail26821:
    { 
      IStrategoTerm g_4668 = null;
      IStrategoTerm f_4668 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consSystemExternalID_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26821;
      f_4668 = term.getSubterm(0);
      IStrategoList annos952 = term.getAnnotations();
      g_4668 = annos952;
      term = t_4405.invoke(context, f_4668);
      if(term == null)
        break Fail26821;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consSystemExternalID_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, g_4668));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}