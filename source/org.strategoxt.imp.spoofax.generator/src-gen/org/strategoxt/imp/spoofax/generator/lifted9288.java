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

@SuppressWarnings("all") final class lifted9288 extends Strategy 
{ 
  public static final lifted9288 instance = new lifted9288();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28767:
    { 
      IStrategoTerm term10300 = term;
      Success11365:
      { 
        Fail28768:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
            break Fail28768;
          if(true)
            break Success11365;
        }
        term = term10300;
        if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
          break Fail28767;
      }
      if(true)
        return term;
    }
    return null;
  }
}