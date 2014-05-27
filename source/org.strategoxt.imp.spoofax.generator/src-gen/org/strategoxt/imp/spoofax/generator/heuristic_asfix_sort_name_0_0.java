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

@SuppressWarnings("all") public class heuristic_asfix_sort_name_0_0 extends Strategy 
{ 
  public static heuristic_asfix_sort_name_0_0 instance = new heuristic_asfix_sort_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("heuristic_asfix_sort_name_0_0");
    Fail26296:
    { 
      IStrategoTerm term10647 = term;
      Success10553:
      { 
        Fail26297:
        { 
          term = non_terminal_sort_name_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26297;
          if(true)
            break Success10553;
        }
        term = term10647;
        IStrategoTerm a_4327 = null;
        if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consProdRule_2 != ((IStrategoAppl)term).getConstructor())
          break Fail26296;
        IStrategoTerm arg6374 = term.getSubterm(1);
        if(arg6374.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg6374).isEmpty())
          break Fail26296;
        IStrategoTerm arg6375 = ((IStrategoList)arg6374).head();
        if(arg6375.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consRef_1 != ((IStrategoAppl)arg6375).getConstructor())
          break Fail26296;
        IStrategoTerm arg6376 = arg6375.getSubterm(0);
        if(arg6376.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consNonterm_1 != ((IStrategoAppl)arg6376).getConstructor())
          break Fail26296;
        a_4327 = arg6376.getSubterm(0);
        IStrategoTerm arg6377 = ((IStrategoList)arg6374).tail();
        if(arg6377.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6377).isEmpty())
          break Fail26296;
        term = a_4327;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}