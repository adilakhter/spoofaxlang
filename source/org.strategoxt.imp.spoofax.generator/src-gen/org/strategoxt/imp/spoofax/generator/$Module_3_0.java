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

@SuppressWarnings("all") public class $Module_3_0 extends Strategy 
{ 
  public static $Module_3_0 instance = new $Module_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4407, Strategy i_4407, Strategy j_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Module_3_0");
    Fail26853:
    { 
      IStrategoTerm j_4672 = null;
      IStrategoTerm g_4672 = null;
      IStrategoTerm h_4672 = null;
      IStrategoTerm i_4672 = null;
      IStrategoTerm k_4672 = null;
      IStrategoTerm l_4672 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consModule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26853;
      g_4672 = term.getSubterm(0);
      h_4672 = term.getSubterm(1);
      i_4672 = term.getSubterm(2);
      IStrategoList annos977 = term.getAnnotations();
      j_4672 = annos977;
      term = h_4407.invoke(context, g_4672);
      if(term == null)
        break Fail26853;
      k_4672 = term;
      term = i_4407.invoke(context, h_4672);
      if(term == null)
        break Fail26853;
      l_4672 = term;
      term = j_4407.invoke(context, i_4672);
      if(term == null)
        break Fail26853;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consModule_3, new IStrategoTerm[]{k_4672, l_4672, term}), checkListAnnos(termFactory, j_4672));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}