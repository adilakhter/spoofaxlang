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

@SuppressWarnings("all") public class $Identifier$Lexical_1_0 extends Strategy 
{ 
  public static $Identifier$Lexical_1_0 instance = new $Identifier$Lexical_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy t_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IdentifierLexical_1_0");
    Fail26899:
    { 
      IStrategoTerm y_4675 = null;
      IStrategoTerm x_4675 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIdentifierLexical_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26899;
      x_4675 = term.getSubterm(0);
      IStrategoList annos996 = term.getAnnotations();
      y_4675 = annos996;
      term = t_4408.invoke(context, x_4675);
      if(term == null)
        break Fail26899;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consIdentifierLexical_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_4675));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}