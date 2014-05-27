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

@SuppressWarnings("all") public class $Constructor_1_0 extends Strategy 
{ 
  public static $Constructor_1_0 instance = new $Constructor_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4411)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Constructor_1_0");
    Fail26945:
    { 
      IStrategoTerm o_4683 = null;
      IStrategoTerm n_4683 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consConstructor_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26945;
      n_4683 = term.getSubterm(0);
      IStrategoList annos1042 = term.getAnnotations();
      o_4683 = annos1042;
      term = r_4411.invoke(context, n_4683);
      if(term == null)
        break Fail26945;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consConstructor_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, o_4683));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}