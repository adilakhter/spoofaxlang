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

@SuppressWarnings("all") public class $Include$Def_2_0 extends Strategy 
{ 
  public static $Include$Def_2_0 instance = new $Include$Def_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4406, Strategy b_4406)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("IncludeDef_2_0");
    Fail26828:
    { 
      IStrategoTerm a_4669 = null;
      IStrategoTerm y_4668 = null;
      IStrategoTerm z_4668 = null;
      IStrategoTerm b_4669 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consIncludeDef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26828;
      y_4668 = term.getSubterm(0);
      z_4668 = term.getSubterm(1);
      IStrategoList annos957 = term.getAnnotations();
      a_4669 = annos957;
      term = a_4406.invoke(context, y_4668);
      if(term == null)
        break Fail26828;
      b_4669 = term;
      term = b_4406.invoke(context, z_4668);
      if(term == null)
        break Fail26828;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consIncludeDef_2, new IStrategoTerm[]{b_4669, term}), checkListAnnos(termFactory, a_4669));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}