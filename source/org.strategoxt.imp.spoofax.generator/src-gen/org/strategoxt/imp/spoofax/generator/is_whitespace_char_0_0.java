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

@SuppressWarnings("all") public class is_whitespace_char_0_0 extends Strategy 
{ 
  public static is_whitespace_char_0_0 instance = new is_whitespace_char_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25871:
    { 
      IStrategoTerm term10299 = term;
      Success10233:
      { 
        Fail25872:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
            break Fail25872;
          if(true)
            break Success10233;
        }
        term = term10299;
        if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
          break Fail25871;
      }
      if(true)
        return term;
    }
    context.push("is_whitespace_char_0_0");
    context.popOnFailure();
    return null;
  }
}