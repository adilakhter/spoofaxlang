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

@SuppressWarnings("all") final class lifted9197 extends Strategy 
{ 
  public static final lifted9197 instance = new lifted9197();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28861:
    { 
      IStrategoTerm term10201 = term;
      Success11389:
      { 
        Fail28862:
        { 
          IStrategoTerm term10202 = term;
          Success11390:
          { 
            Fail28863:
            { 
              if(term.getTermType() != IStrategoTerm.INT || 10 != ((IStrategoInt)term).intValue())
                break Fail28863;
              if(true)
                break Success11390;
            }
            term = term10202;
            if(term.getTermType() != IStrategoTerm.INT || 13 != ((IStrategoInt)term).intValue())
              break Fail28862;
          }
          { 
            if(true)
              break Fail28861;
            if(true)
              break Success11389;
          }
        }
        term = term10201;
      }
      if(true)
        return term;
    }
    return null;
  }
}