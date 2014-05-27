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

@SuppressWarnings("all") final class lifted9235 extends Strategy 
{ 
  public static final lifted9235 instance = new lifted9235();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28817:
    { 
      IStrategoTerm term10237 = term;
      Success11377:
      { 
        Fail28818:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
            break Fail28818;
          if(true)
            break Success11377;
        }
        term = term10237;
        if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
          break Fail28817;
      }
      if(true)
        return term;
    }
    return null;
  }
}