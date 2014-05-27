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

@SuppressWarnings("all") public class $Language_2_0 extends Strategy 
{ 
  public static $Language_2_0 instance = new $Language_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4409, Strategy z_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Language_2_0");
    Fail26923:
    { 
      IStrategoTerm h_4679 = null;
      IStrategoTerm f_4679 = null;
      IStrategoTerm g_4679 = null;
      IStrategoTerm i_4679 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consLanguage_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26923;
      f_4679 = term.getSubterm(0);
      g_4679 = term.getSubterm(1);
      IStrategoList annos1020 = term.getAnnotations();
      h_4679 = annos1020;
      term = y_4409.invoke(context, f_4679);
      if(term == null)
        break Fail26923;
      i_4679 = term;
      term = z_4409.invoke(context, g_4679);
      if(term == null)
        break Fail26923;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consLanguage_2, new IStrategoTerm[]{i_4679, term}), checkListAnnos(termFactory, h_4679));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}