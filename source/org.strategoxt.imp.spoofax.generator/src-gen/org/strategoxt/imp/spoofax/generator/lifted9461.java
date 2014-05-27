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

@SuppressWarnings("all") final class lifted9461 extends Strategy 
{ 
  TermReference e_4327;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28612:
    { 
      IStrategoTerm term10649 = term;
      Success11337:
      { 
        Fail28613:
        { 
          if(e_4327.value == null)
            e_4327.value = term;
          else
            if(e_4327.value != term && !e_4327.value.match(term))
              break Fail28613;
          { 
            if(true)
              break Fail28612;
            if(true)
              break Success11337;
          }
        }
        term = term10649;
      }
      if(true)
        return term;
    }
    return null;
  }
}