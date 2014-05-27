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

@SuppressWarnings("all") public class $Attribute_2_0 extends Strategy 
{ 
  public static $Attribute_2_0 instance = new $Attribute_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy q_4404, Strategy r_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Attribute_2_0");
    Fail26800:
    { 
      IStrategoTerm g_4665 = null;
      IStrategoTerm e_4665 = null;
      IStrategoTerm f_4665 = null;
      IStrategoTerm h_4665 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAttribute_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26800;
      e_4665 = term.getSubterm(0);
      f_4665 = term.getSubterm(1);
      IStrategoList annos931 = term.getAnnotations();
      g_4665 = annos931;
      term = q_4404.invoke(context, e_4665);
      if(term == null)
        break Fail26800;
      h_4665 = term;
      term = r_4404.invoke(context, f_4665);
      if(term == null)
        break Fail26800;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consAttribute_2, new IStrategoTerm[]{h_4665, term}), checkListAnnos(termFactory, g_4665));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}