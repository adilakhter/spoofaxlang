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

@SuppressWarnings("all") final class lifted9394 extends Strategy 
{ 
  public static final lifted9394 instance = new lifted9394();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28679:
    { 
      IStrategoTerm term10564 = term;
      IStrategoConstructor cons353 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success11352:
      { 
        if(cons353 == SpoofaxGenerator._consdeprecated_0)
        { 
          Fail28680:
          { 
            if(true)
              break Success11352;
          }
          term = term10564;
        }
        if(cons353 == SpoofaxGenerator._consdeprecated_1)
        { }
        else
        { 
          break Fail28679;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}