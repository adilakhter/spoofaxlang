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

@SuppressWarnings("all") public class $U$R$L_1_0 extends Strategy 
{ 
  public static $U$R$L_1_0 instance = new $U$R$L_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4409)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("URL_1_0");
    Fail26908:
    { 
      IStrategoTerm z_4676 = null;
      IStrategoTerm y_4676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consURL_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26908;
      y_4676 = term.getSubterm(0);
      IStrategoList annos1005 = term.getAnnotations();
      z_4676 = annos1005;
      term = c_4409.invoke(context, y_4676);
      if(term == null)
        break Fail26908;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consURL_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, z_4676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}