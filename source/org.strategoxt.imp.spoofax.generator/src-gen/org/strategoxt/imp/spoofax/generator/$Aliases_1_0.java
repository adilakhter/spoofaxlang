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

@SuppressWarnings("all") public class $Aliases_1_0 extends Strategy 
{ 
  public static $Aliases_1_0 instance = new $Aliases_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Aliases_1_0");
    Fail26906:
    { 
      IStrategoTerm t_4676 = null;
      IStrategoTerm s_4676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAliases_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26906;
      s_4676 = term.getSubterm(0);
      IStrategoList annos1003 = term.getAnnotations();
      t_4676 = annos1003;
      term = a_4409.invoke(context, s_4676);
      if(term == null)
        break Fail26906;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consAliases_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_4676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}