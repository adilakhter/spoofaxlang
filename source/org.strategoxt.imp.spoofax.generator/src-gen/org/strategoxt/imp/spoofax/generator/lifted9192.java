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

@SuppressWarnings("all") final class lifted9192 extends Strategy 
{ 
  public static final lifted9192 instance = new lifted9192();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28868:
    { 
      IStrategoTerm term10196 = term;
      Success11394:
      { 
        Fail28869:
        { 
          IStrategoTerm term10197 = term;
          IStrategoConstructor cons357 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
          Success11395:
          { 
            if(cons357 == SpoofaxGenerator._conslit_1)
            { 
              Fail28870:
              { 
                if(true)
                  break Success11395;
              }
              term = term10197;
            }
            if(cons357 == SpoofaxGenerator._consci_lit_1)
            { }
            else
            { 
              break Fail28869;
            }
          }
          { 
            if(true)
              break Fail28868;
            if(true)
              break Success11394;
          }
        }
        term = term10196;
      }
      if(true)
        return term;
    }
    return null;
  }
}