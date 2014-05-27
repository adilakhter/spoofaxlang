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

@SuppressWarnings("all") public class $Color$Def_2_0 extends Strategy 
{ 
  public static $Color$Def_2_0 instance = new $Color$Def_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4407, Strategy x_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorDef_2_0");
    Fail26886:
    { 
      IStrategoTerm u_4673 = null;
      IStrategoTerm s_4673 = null;
      IStrategoTerm t_4673 = null;
      IStrategoTerm v_4673 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consColorDef_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26886;
      s_4673 = term.getSubterm(0);
      t_4673 = term.getSubterm(1);
      IStrategoList annos985 = term.getAnnotations();
      u_4673 = annos985;
      term = w_4407.invoke(context, s_4673);
      if(term == null)
        break Fail26886;
      v_4673 = term;
      term = x_4407.invoke(context, t_4673);
      if(term == null)
        break Fail26886;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consColorDef_2, new IStrategoTerm[]{v_4673, term}), checkListAnnos(termFactory, u_4673));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}