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

@SuppressWarnings("all") public class $Attribute_1_0 extends Strategy 
{ 
  public static $Attribute_1_0 instance = new $Attribute_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4410)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Attribute_1_0");
    Fail26924:
    { 
      IStrategoTerm l_4679 = null;
      IStrategoTerm k_4679 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAttribute_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26924;
      k_4679 = term.getSubterm(0);
      IStrategoList annos1021 = term.getAnnotations();
      l_4679 = annos1021;
      term = a_4410.invoke(context, k_4679);
      if(term == null)
        break Fail26924;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consAttribute_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, l_4679));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}