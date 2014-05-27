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

@SuppressWarnings("all") public class $Standalone$Decl_1_0 extends Strategy 
{ 
  public static $Standalone$Decl_1_0 instance = new $Standalone$Decl_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("StandaloneDecl_1_0");
    Fail26816:
    { 
      IStrategoTerm h_4667 = null;
      IStrategoTerm g_4667 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consStandaloneDecl_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26816;
      g_4667 = term.getSubterm(0);
      IStrategoList annos947 = term.getAnnotations();
      h_4667 = annos947;
      term = j_4405.invoke(context, g_4667);
      if(term == null)
        break Fail26816;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consStandaloneDecl_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, h_4667));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}