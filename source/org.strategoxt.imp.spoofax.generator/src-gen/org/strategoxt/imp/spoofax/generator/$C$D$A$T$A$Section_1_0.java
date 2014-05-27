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

@SuppressWarnings("all") public class $C$D$A$T$A$Section_1_0 extends Strategy 
{ 
  public static $C$D$A$T$A$Section_1_0 instance = new $C$D$A$T$A$Section_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4404)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("CDATASection_1_0");
    Fail26804:
    { 
      IStrategoTerm t_4665 = null;
      IStrategoTerm s_4665 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consCDATASection_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26804;
      s_4665 = term.getSubterm(0);
      IStrategoList annos935 = term.getAnnotations();
      t_4665 = annos935;
      term = v_4404.invoke(context, s_4665);
      if(term == null)
        break Fail26804;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consCDATASection_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, t_4665));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}