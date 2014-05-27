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

@SuppressWarnings("all") public class sym2nonterm_0_0 extends Strategy 
{ 
  public static sym2nonterm_0_0 instance = new sym2nonterm_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("sym2nonterm_0_0");
    Fail25668:
    { 
      IStrategoTerm term10177 = term;
      Success10142:
      { 
        Fail25669:
        { 
          IStrategoTerm g_4245 = null;
          g_4245 = term;
          term = get_nonterm_of_0_0.instance.invoke(context, g_4245);
          if(term == null)
            break Fail25669;
          term = termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{term});
          if(true)
            break Success10142;
        }
        term = term10177;
        IStrategoTerm term10178 = term;
        Success10143:
        { 
          Fail25670:
          { 
            term = sort2nonterm_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail25670;
            if(true)
              break Success10143;
          }
          term = term10178;
          IStrategoTerm f_4245 = null;
          if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._conscf_1 != ((IStrategoAppl)term).getConstructor())
            break Fail25668;
          f_4245 = term.getSubterm(0);
          term = sort2nonterm_0_0.instance.invoke(context, f_4245);
          if(term == null)
            break Fail25668;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}