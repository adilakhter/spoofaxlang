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

@SuppressWarnings("all") public class $P$P$Table_1_0 extends Strategy 
{ 
  public static $P$P$Table_1_0 instance = new $P$P$Table_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy h_4410)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("PPTable_1_0");
    Fail26928:
    { 
      IStrategoTerm d_4680 = null;
      IStrategoTerm c_4680 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consPPTable_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26928;
      c_4680 = term.getSubterm(0);
      IStrategoList annos1025 = term.getAnnotations();
      d_4680 = annos1025;
      term = h_4410.invoke(context, c_4680);
      if(term == null)
        break Fail26928;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consPPTable_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, d_4680));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}