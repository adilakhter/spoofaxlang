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

@SuppressWarnings("all") public class $Epilogue_1_0 extends Strategy 
{ 
  public static $Epilogue_1_0 instance = new $Epilogue_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy n_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Epilogue_1_0");
    Fail26818:
    { 
      IStrategoTerm r_4667 = null;
      IStrategoTerm q_4667 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consEpilogue_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26818;
      q_4667 = term.getSubterm(0);
      IStrategoList annos949 = term.getAnnotations();
      r_4667 = annos949;
      term = n_4405.invoke(context, q_4667);
      if(term == null)
        break Fail26818;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consEpilogue_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, r_4667));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}