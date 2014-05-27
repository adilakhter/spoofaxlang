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

@SuppressWarnings("all") public class $Table_1_0 extends Strategy 
{ 
  public static $Table_1_0 instance = new $Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy f_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Table_1_0");
    Fail26911:
    { 
      IStrategoTerm i_4677 = null;
      IStrategoTerm h_4677 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consTable_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26911;
      h_4677 = term.getSubterm(0);
      IStrategoList annos1008 = term.getAnnotations();
      i_4677 = annos1008;
      term = f_4409.invoke(context, h_4677);
      if(term == null)
        break Fail26911;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consTable_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, i_4677));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}