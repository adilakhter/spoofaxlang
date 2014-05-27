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

@SuppressWarnings("all") public class $Color$Rule$All$Named_3_0 extends Strategy 
{ 
  public static $Color$Rule$All$Named_3_0 instance = new $Color$Rule$All$Named_3_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4408, Strategy c_4408, Strategy d_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRuleAllNamed_3_0");
    Fail26888:
    { 
      IStrategoTerm h_4674 = null;
      IStrategoTerm e_4674 = null;
      IStrategoTerm f_4674 = null;
      IStrategoTerm g_4674 = null;
      IStrategoTerm i_4674 = null;
      IStrategoTerm j_4674 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consColorRuleAllNamed_3 != ((IStrategoAppl)term).getConstructor())
        break Fail26888;
      e_4674 = term.getSubterm(0);
      f_4674 = term.getSubterm(1);
      g_4674 = term.getSubterm(2);
      IStrategoList annos987 = term.getAnnotations();
      h_4674 = annos987;
      term = b_4408.invoke(context, e_4674);
      if(term == null)
        break Fail26888;
      i_4674 = term;
      term = c_4408.invoke(context, f_4674);
      if(term == null)
        break Fail26888;
      j_4674 = term;
      term = d_4408.invoke(context, g_4674);
      if(term == null)
        break Fail26888;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consColorRuleAllNamed_3, new IStrategoTerm[]{i_4674, j_4674, term}), checkListAnnos(termFactory, h_4674));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}