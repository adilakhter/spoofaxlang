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

@SuppressWarnings("all") public class non_terminal_sort_name_0_0 extends Strategy 
{ 
  public static non_terminal_sort_name_0_0 instance = new non_terminal_sort_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26298:
    { 
      IStrategoTerm b_4327 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consProdRule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26298;
      IStrategoTerm arg6378 = term.getSubterm(0);
      if(arg6378.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6378).getConstructor())
        break Fail26298;
      b_4327 = arg6378.getSubterm(0);
      IStrategoTerm arg6379 = term.getSubterm(1);
      if(arg6379.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6379).isEmpty())
        break Fail26298;
      IStrategoTerm arg6380 = ((IStrategoList)arg6379).head();
      if(arg6380.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consAppl_2 != ((IStrategoAppl)arg6380).getConstructor())
        break Fail26298;
      IStrategoTerm arg6383 = ((IStrategoList)arg6379).tail();
      if(arg6383.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6383).isEmpty())
        break Fail26298;
      term = b_4327;
      if(true)
        return term;
    }
    context.push("non_terminal_sort_name_0_0");
    context.popOnFailure();
    return null;
  }
}