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

@SuppressWarnings("all") public class $Include$Dir_1_0 extends Strategy 
{ 
  public static $Include$Dir_1_0 instance = new $Include$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IncludeDir_1_0");
    Fail26829:
    { 
      IStrategoTerm e_4669 = null;
      IStrategoTerm d_4669 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludeDir_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26829;
      d_4669 = term.getSubterm(0);
      IStrategoList annos958 = term.getAnnotations();
      e_4669 = annos958;
      term = c_4406.invoke(context, d_4669);
      if(term == null)
        break Fail26829;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consIncludeDir_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_4669));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}