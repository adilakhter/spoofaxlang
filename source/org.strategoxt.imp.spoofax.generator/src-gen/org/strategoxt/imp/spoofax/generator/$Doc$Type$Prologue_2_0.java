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

@SuppressWarnings("all") public class $Doc$Type$Prologue_2_0 extends Strategy 
{ 
  public static $Doc$Type$Prologue_2_0 instance = new $Doc$Type$Prologue_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4404, Strategy a_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("DocTypePrologue_2_0");
    Fail26807:
    { 
      IStrategoTerm f_4666 = null;
      IStrategoTerm d_4666 = null;
      IStrategoTerm e_4666 = null;
      IStrategoTerm g_4666 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consDocTypePrologue_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26807;
      d_4666 = term.getSubterm(0);
      e_4666 = term.getSubterm(1);
      IStrategoList annos938 = term.getAnnotations();
      f_4666 = annos938;
      term = z_4404.invoke(context, d_4666);
      if(term == null)
        break Fail26807;
      g_4666 = term;
      term = a_4405.invoke(context, e_4666);
      if(term == null)
        break Fail26807;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consDocTypePrologue_2, new IStrategoTerm[]{g_4666, term}), checkListAnnos(termFactory, f_4666));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}