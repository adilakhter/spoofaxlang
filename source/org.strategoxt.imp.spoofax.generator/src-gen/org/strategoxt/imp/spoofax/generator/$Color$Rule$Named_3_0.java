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

@SuppressWarnings("all") public class $Color$Rule$Named_3_0 extends Strategy 
{ 
  public static $Color$Rule$Named_3_0 instance = new $Color$Rule$Named_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_4407, Strategy z_4407, Strategy a_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRuleNamed_3_0");
    Fail26887:
    { 
      IStrategoTerm a_4674 = null;
      IStrategoTerm x_4673 = null;
      IStrategoTerm y_4673 = null;
      IStrategoTerm z_4673 = null;
      IStrategoTerm b_4674 = null;
      IStrategoTerm c_4674 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consColorRuleNamed_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26887;
      x_4673 = term.getSubterm(0);
      y_4673 = term.getSubterm(1);
      z_4673 = term.getSubterm(2);
      IStrategoList annos986 = term.getAnnotations();
      a_4674 = annos986;
      term = y_4407.invoke(context, x_4673);
      if(term == null)
        break Fail26887;
      b_4674 = term;
      term = z_4407.invoke(context, y_4673);
      if(term == null)
        break Fail26887;
      c_4674 = term;
      term = a_4408.invoke(context, z_4673);
      if(term == null)
        break Fail26887;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consColorRuleNamed_3, new IStrategoTerm[]{b_4674, c_4674, term}), checkListAnnos(termFactory, a_4674));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}