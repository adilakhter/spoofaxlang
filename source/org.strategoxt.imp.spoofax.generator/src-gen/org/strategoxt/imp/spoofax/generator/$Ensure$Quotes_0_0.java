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

@SuppressWarnings("all") public class $Ensure$Quotes_0_0 extends Strategy 
{ 
  public static $Ensure$Quotes_0_0 instance = new $Ensure$Quotes_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("EnsureQuotes_0_0");
    Fail25459:
    { 
      IStrategoTerm k_4220 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consquoted_1 != ((IStrategoAppl)term).getConstructor())
        break Fail25459;
      k_4220 = term.getSubterm(0);
      IStrategoTerm term10040 = term;
      Success10038:
      { 
        Fail25460:
        { 
          term = un_double_quote_0_0.instance.invoke(context, k_4220);
          if(term == null)
            break Fail25460;
          { 
            if(true)
              break Fail25459;
            if(true)
              break Success10038;
          }
        }
        term = term10040;
      }
      term = double_quote_0_0.instance.invoke(context, k_4220);
      if(term == null)
        break Fail25459;
      term = termFactory.makeAppl(SpoofaxGenerator._consquoted_1, new IStrategoTerm[]{term});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}