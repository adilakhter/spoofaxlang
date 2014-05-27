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

@SuppressWarnings("all") public class heuristic_rtg_sort_name_0_0 extends Strategy 
{ 
  public static heuristic_rtg_sort_name_0_0 instance = new heuristic_rtg_sort_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("heuristic_rtg_sort_name_0_0");
    Fail26294:
    { 
      IStrategoTerm term10646 = term;
      Success10552:
      { 
        Fail26295:
        { 
          term = non_terminal_sort_name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26295;
          if(true)
            break Success10552;
        }
        term = term10646;
        IStrategoTerm z_4326 = null;
        if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consProdRule_2 != ((IStrategoAppl)term).getConstructor())
          break Fail26294;
        IStrategoTerm arg6368 = term.getSubterm(0);
        if(arg6368.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6368).getConstructor())
          break Fail26294;
        z_4326 = arg6368.getSubterm(0);
        IStrategoTerm arg6369 = term.getSubterm(1);
        if(arg6369.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6369).isEmpty())
          break Fail26294;
        IStrategoTerm arg6370 = ((IStrategoList)arg6369).head();
        if(arg6370.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)arg6370).getConstructor())
          break Fail26294;
        IStrategoTerm arg6372 = ((IStrategoList)arg6369).tail();
        if(arg6372.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6372).isEmpty())
          break Fail26294;
        term = z_4326;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}