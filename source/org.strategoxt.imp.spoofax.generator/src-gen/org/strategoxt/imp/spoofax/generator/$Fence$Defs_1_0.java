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

@SuppressWarnings("all") public class $Fence$Defs_1_0 extends Strategy 
{ 
  public static $Fence$Defs_1_0 instance = new $Fence$Defs_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("FenceDefs_1_0");
    Fail26901:
    { 
      IStrategoTerm e_4676 = null;
      IStrategoTerm d_4676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consFenceDefs_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26901;
      d_4676 = term.getSubterm(0);
      IStrategoList annos998 = term.getAnnotations();
      e_4676 = annos998;
      term = v_4408.invoke(context, d_4676);
      if(term == null)
        break Fail26901;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consFenceDefs_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, e_4676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}