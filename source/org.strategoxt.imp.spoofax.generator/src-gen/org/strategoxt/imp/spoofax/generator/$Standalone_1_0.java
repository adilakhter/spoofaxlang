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

@SuppressWarnings("all") public class $Standalone_1_0 extends Strategy 
{ 
  public static $Standalone_1_0 instance = new $Standalone_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Standalone_1_0");
    Fail26813:
    { 
      IStrategoTerm y_4666 = null;
      IStrategoTerm x_4666 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consStandalone_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26813;
      x_4666 = term.getSubterm(0);
      IStrategoList annos944 = term.getAnnotations();
      y_4666 = annos944;
      term = g_4405.invoke(context, x_4666);
      if(term == null)
        break Fail26813;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consStandalone_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, y_4666));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}