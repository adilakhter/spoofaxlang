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

@SuppressWarnings("all") public class $Encoding_1_0 extends Strategy 
{ 
  public static $Encoding_1_0 instance = new $Encoding_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy e_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Encoding_1_0");
    Fail26811:
    { 
      IStrategoTerm s_4666 = null;
      IStrategoTerm r_4666 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consEncoding_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26811;
      r_4666 = term.getSubterm(0);
      IStrategoList annos942 = term.getAnnotations();
      s_4666 = annos942;
      term = e_4405.invoke(context, r_4666);
      if(term == null)
        break Fail26811;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consEncoding_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, s_4666));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}