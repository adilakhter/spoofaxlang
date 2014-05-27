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

@SuppressWarnings("all") public class $Error_2_0 extends Strategy 
{ 
  public static $Error_2_0 instance = new $Error_2_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy b_4407, Strategy c_4407)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Error_2_0");
    Fail26848:
    { 
      IStrategoTerm s_4671 = null;
      IStrategoTerm q_4671 = null;
      IStrategoTerm r_4671 = null;
      IStrategoTerm t_4671 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consError_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26848;
      q_4671 = term.getSubterm(0);
      r_4671 = term.getSubterm(1);
      IStrategoList annos973 = term.getAnnotations();
      s_4671 = annos973;
      term = b_4407.invoke(context, q_4671);
      if(term == null)
        break Fail26848;
      t_4671 = term;
      term = c_4407.invoke(context, r_4671);
      if(term == null)
        break Fail26848;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consError_2, new IStrategoTerm[]{t_4671, term}), checkListAnnos(termFactory, s_4671));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}