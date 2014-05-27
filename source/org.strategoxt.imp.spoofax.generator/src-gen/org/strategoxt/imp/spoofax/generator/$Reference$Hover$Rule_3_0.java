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

@SuppressWarnings("all") public class $Reference$Hover$Rule_3_0 extends Strategy 
{ 
  public static $Reference$Hover$Rule_3_0 instance = new $Reference$Hover$Rule_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy j_4411, Strategy k_4411, Strategy l_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ReferenceHoverRule_3_0");
    Fail26941:
    { 
      IStrategoTerm w_4682 = null;
      IStrategoTerm t_4682 = null;
      IStrategoTerm u_4682 = null;
      IStrategoTerm v_4682 = null;
      IStrategoTerm x_4682 = null;
      IStrategoTerm y_4682 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consReferenceHoverRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26941;
      t_4682 = term.getSubterm(0);
      u_4682 = term.getSubterm(1);
      v_4682 = term.getSubterm(2);
      IStrategoList annos1038 = term.getAnnotations();
      w_4682 = annos1038;
      term = j_4411.invoke(context, t_4682);
      if(term == null)
        break Fail26941;
      x_4682 = term;
      term = k_4411.invoke(context, u_4682);
      if(term == null)
        break Fail26941;
      y_4682 = term;
      term = l_4411.invoke(context, v_4682);
      if(term == null)
        break Fail26941;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consReferenceHoverRule_3, new IStrategoTerm[]{x_4682, y_4682, term}), checkListAnnos(termFactory, w_4682));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}