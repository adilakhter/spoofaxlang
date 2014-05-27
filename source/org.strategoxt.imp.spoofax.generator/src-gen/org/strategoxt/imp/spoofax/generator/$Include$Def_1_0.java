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

@SuppressWarnings("all") public class $Include$Def_1_0 extends Strategy 
{ 
  public static $Include$Def_1_0 instance = new $Include$Def_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IncludeDef_1_0");
    Fail26827:
    { 
      IStrategoTerm w_4668 = null;
      IStrategoTerm v_4668 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludeDef_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26827;
      v_4668 = term.getSubterm(0);
      IStrategoList annos956 = term.getAnnotations();
      w_4668 = annos956;
      term = z_4405.invoke(context, v_4668);
      if(term == null)
        break Fail26827;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consIncludeDef_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, w_4668));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}