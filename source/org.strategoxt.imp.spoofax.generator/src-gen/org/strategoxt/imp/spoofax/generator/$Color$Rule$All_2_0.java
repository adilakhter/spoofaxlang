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

@SuppressWarnings("all") public class $Color$Rule$All_2_0 extends Strategy 
{ 
  public static $Color$Rule$All_2_0 instance = new $Color$Rule$All_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4408, Strategy h_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("ColorRuleAll_2_0");
    Fail26890:
    { 
      IStrategoTerm s_4674 = null;
      IStrategoTerm q_4674 = null;
      IStrategoTerm r_4674 = null;
      IStrategoTerm t_4674 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consColorRuleAll_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26890;
      q_4674 = term.getSubterm(0);
      r_4674 = term.getSubterm(1);
      IStrategoList annos989 = term.getAnnotations();
      s_4674 = annos989;
      term = g_4408.invoke(context, q_4674);
      if(term == null)
        break Fail26890;
      t_4674 = term;
      term = h_4408.invoke(context, r_4674);
      if(term == null)
        break Fail26890;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consColorRuleAll_2, new IStrategoTerm[]{t_4674, term}), checkListAnnos(termFactory, s_4674));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}