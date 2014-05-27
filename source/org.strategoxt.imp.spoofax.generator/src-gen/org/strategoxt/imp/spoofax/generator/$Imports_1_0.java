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

@SuppressWarnings("all") public class $Imports_1_0 extends Strategy 
{ 
  public static $Imports_1_0 instance = new $Imports_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Imports_1_0");
    Fail26852:
    { 
      IStrategoTerm e_4672 = null;
      IStrategoTerm d_4672 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consImports_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26852;
      d_4672 = term.getSubterm(0);
      IStrategoList annos976 = term.getAnnotations();
      e_4672 = annos976;
      term = g_4407.invoke(context, d_4672);
      if(term == null)
        break Fail26852;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consImports_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_4672));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}