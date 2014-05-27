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

@SuppressWarnings("all") public class $Encoding$Decl_1_0 extends Strategy 
{ 
  public static $Encoding$Decl_1_0 instance = new $Encoding$Decl_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EncodingDecl_1_0");
    Fail26814:
    { 
      IStrategoTerm b_4667 = null;
      IStrategoTerm a_4667 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consEncodingDecl_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26814;
      a_4667 = term.getSubterm(0);
      IStrategoList annos945 = term.getAnnotations();
      b_4667 = annos945;
      term = h_4405.invoke(context, a_4667);
      if(term == null)
        break Fail26814;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consEncodingDecl_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, b_4667));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}