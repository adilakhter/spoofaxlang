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

@SuppressWarnings("all") public class $Version_1_0 extends Strategy 
{ 
  public static $Version_1_0 instance = new $Version_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4405)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("Version_1_0");
    Fail26809:
    { 
      IStrategoTerm m_4666 = null;
      IStrategoTerm l_4666 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consVersion_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26809;
      l_4666 = term.getSubterm(0);
      IStrategoList annos940 = term.getAnnotations();
      m_4666 = annos940;
      term = c_4405.invoke(context, l_4666);
      if(term == null)
        break Fail26809;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consVersion_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, m_4666));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}