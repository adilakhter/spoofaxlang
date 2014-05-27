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

@SuppressWarnings("all") public class $Unmanaged$Table$Prefix_1_0 extends Strategy 
{ 
  public static $Unmanaged$Table$Prefix_1_0 instance = new $Unmanaged$Table$Prefix_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy z_4408)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("UnmanagedTablePrefix_1_0");
    Fail26905:
    { 
      IStrategoTerm q_4676 = null;
      IStrategoTerm p_4676 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consUnmanagedTablePrefix_1 != ((IStrategoAppl)term).getConstructor())
        break Fail26905;
      p_4676 = term.getSubterm(0);
      IStrategoList annos1002 = term.getAnnotations();
      q_4676 = annos1002;
      term = z_4408.invoke(context, p_4676);
      if(term == null)
        break Fail26905;
      term = termFactory.annotateTerm(termFactory.makeAppl(SpoofaxGenerator._consUnmanagedTablePrefix_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, q_4676));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}