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

@SuppressWarnings("all") public class $Double$Quoted_1_0 extends Strategy 
{ 
  public static $Double$Quoted_1_0 instance = new $Double$Quoted_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy p_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DoubleQuoted_1_0");
    Fail26799:
    { 
      IStrategoTerm c_4665 = null;
      IStrategoTerm b_4665 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consDoubleQuoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26799;
      b_4665 = term.getSubterm(0);
      IStrategoList annos930 = term.getAnnotations();
      c_4665 = annos930;
      term = p_4404.invoke(context, b_4665);
      if(term == null)
        break Fail26799;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consDoubleQuoted_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, c_4665));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}