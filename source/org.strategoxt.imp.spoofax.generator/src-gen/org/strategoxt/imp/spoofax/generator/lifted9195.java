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

@SuppressWarnings("all") final class lifted9195 extends Strategy 
{ 
  public static final lifted9195 instance = new lifted9195();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28864:
    { 
      IStrategoTerm term10198 = term;
      Success11391:
      { 
        Fail28865:
        { 
          if(term.getTermType() != IStrategoTerm.INT || 10 != ((IStrategoInt)term).intValue())
            break Fail28865;
          if(true)
            break Success11391;
        }
        term = term10198;
        IStrategoTerm term10199 = term;
        Success11392:
        { 
          Fail28866:
          { 
            if(term.getTermType() != IStrategoTerm.INT || 13 != ((IStrategoInt)term).intValue())
              break Fail28866;
            if(true)
              break Success11392;
          }
          term = term10199;
          IStrategoTerm term10200 = term;
          Success11393:
          { 
            Fail28867:
            { 
              if(term.getTermType() != IStrategoTerm.INT || 32 != ((IStrategoInt)term).intValue())
                break Fail28867;
              if(true)
                break Success11393;
            }
            term = term10200;
            if(term.getTermType() != IStrategoTerm.INT || 9 != ((IStrategoInt)term).intValue())
              break Fail28864;
          }
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}