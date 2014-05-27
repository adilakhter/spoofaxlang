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

@SuppressWarnings("all") public class $Comment$Line_1_0 extends Strategy 
{ 
  public static $Comment$Line_1_0 instance = new $Comment$Line_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CommentLine_1_0");
    Fail26846:
    { 
      IStrategoTerm o_4671 = null;
      IStrategoTerm n_4671 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consCommentLine_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26846;
      n_4671 = term.getSubterm(0);
      IStrategoList annos972 = term.getAnnotations();
      o_4671 = annos972;
      term = a_4407.invoke(context, n_4671);
      if(term == null)
        break Fail26846;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consCommentLine_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_4671));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}